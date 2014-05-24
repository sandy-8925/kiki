package org.sanpra.kiki.activity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import org.sanpra.kiki.account.Account;
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
        List<Account> accountList =  AccountManager.getAccountList();
        //TODO:use cursor to display account list
		ListAdapter accountTypeListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, AccountManager.availableAccountTypes);
		setListAdapter(accountTypeListAdapter);
	}

    /**
     * This method will be called when an item in the list is selected.
     *
     * @param l        The ListView where the click happened
     * @param v        The view that was clicked within the ListView
     * @param position The position of the view in the list
     * @param id       The row id of the item that was clicked
     */
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String accountTypeString = (String) getListView().getItemAtPosition(position);
        AccountType accountCreator = AccountManager.getAccountType(accountTypeString);
        accountCreator.createAccount();
    }
}
