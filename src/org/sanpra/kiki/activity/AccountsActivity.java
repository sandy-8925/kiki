package org.sanpra.kiki.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import org.sanpra.kiki.R;
import org.sanpra.kiki.account.AccountManager;
import org.sanpra.kiki.utils.StartActivityOnClickListener;

public final class AccountsActivity extends Activity {

    private ListView accountListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.account_list_layout);
        accountListView = ((ListView) findViewById(R.id.accounts_list));
        findViewById(R.id.addAccountButton).setOnClickListener(new StartActivityOnClickListener(NewAccountTypeSelectActivity.class));

        //TODO: Need to dynamically refresh this view when new accounts are created
        final AccountListAdapter accountListAdapter = new AccountListAdapter(AccountManager.getAccountList());
        accountListView.setAdapter(accountListAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();

        accountListView.invalidate();
    }
}
