package org.sanpra.kiki.activity;

import org.sanpra.kiki.R;
import org.sanpra.kiki.componentUtils.StartActivityOnClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class SettingsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

	setContentView(R.layout.settings_form);

	Button accountsButton = (Button) findViewById(R.id.settings_form_accounts_button);
	accountsButton.setOnClickListener(new StartActivityOnClickListener(AccountsActivity.class));
    }

}
