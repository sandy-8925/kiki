package org.sanpra.kiki.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import org.sanpra.kiki.R;
import org.sanpra.kiki.account.AccountManager;
import org.sanpra.kiki.utils.StartActivityOnClickListener;

public final class AccountsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.account_list_layout);
        findViewById(R.id.addAccountButton).setOnClickListener(new StartActivityOnClickListener(NewAccountTypeSelectActivity.class));

        //TODO: Need to dynamically refresh this data when new accounts are created
        final AccountListAdapter accountListAdapter = new AccountListAdapter(AccountManager.getAccountList());
        ((ListView) findViewById(R.id.accounts_list)).setAdapter(accountListAdapter);
    }

}
