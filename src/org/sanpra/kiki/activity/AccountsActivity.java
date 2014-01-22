package org.sanpra.kiki.activity;

import org.sanpra.kiki.R;
import org.sanpra.kiki.componentUtils.StartActivityOnClickListener;

import android.app.Activity;
import android.os.Bundle;

public class AccountsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

	setContentView(R.layout.account_list_layout);
	findViewById(R.id.addAccountButton).setOnClickListener(new StartActivityOnClickListener(NewAccountTypeSelectActivity.class));
    }

}
