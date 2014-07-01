package org.sanpra.kiki.activity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import org.sanpra.kiki.account.AccountManager;
import org.sanpra.kiki.account.AccountType;

import java.util.List;

/**
 * Shows list of account types. User selects one of the account types to create a new account of that type.
 */
public final class NewAccountTypeSelectActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        List<AccountType> accountList =  AccountManager.getAccountTypeList();
        //TODO:use cursor/adapter to display account list
		ListAdapter accountTypeListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, AccountManager.availableAccountTypes);
		setListAdapter(accountTypeListAdapter);
	}

    @Override
    protected void onListItemClick(ListView listView, View view, int position, long id) {
        super.onListItemClick(listView, view, position, id);
    }
}
