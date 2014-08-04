package org.sanpra.kiki.activity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.Session;
import org.sanpra.kiki.account.AccountManager;
import org.sanpra.kiki.account.AccountType;

/**
 * Shows list of account types. User selects one of the account types to create a new account of that type.
 */
public final class NewAccountTypeSelectActivity extends ListActivity {

    private static final ListAdapter ACCOUNT_TYPE_LIST_ADAPTER = new AccountTypeListAdapter(AccountManager.getAvailableAccountTypes());

    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setListAdapter(ACCOUNT_TYPE_LIST_ADAPTER);
	}

    @Override
    protected void onListItemClick(ListView listView, View view, int position, long id) {
        super.onListItemClick(listView, view, position, id);
        AccountType selectedAccountType = (AccountType) getListView().getItemAtPosition(position);
        AccountManager.createAccount(selectedAccountType, this);
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Session.getActiveSession().onActivityResult(this, requestCode, resultCode, data);
    }
}
