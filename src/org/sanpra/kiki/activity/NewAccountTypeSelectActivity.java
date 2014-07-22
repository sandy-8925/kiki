package org.sanpra.kiki.activity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import org.sanpra.kiki.account.AccountManager;
import org.sanpra.kiki.account.AccountType;

/**
 * Shows list of account types. User selects one of the account types to create a new account of that type.
 */
public final class NewAccountTypeSelectActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        //TODO: Create this object once during application startup, and reuse it each time for this activity
		ListAdapter accountTypeListAdapter = new AccountTypeListAdapter(AccountManager.getAvailableAccountTypes());
		setListAdapter(accountTypeListAdapter);
	}

    @Override
    protected void onListItemClick(ListView listView, View view, int position, long id) {
        super.onListItemClick(listView, view, position, id);
        AccountType selectedAccountType = (AccountType) getListView().getItemAtPosition(position);
        AccountManager.createAccount(selectedAccountType, this);
        finish();
    }
}
