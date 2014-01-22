package org.sanpra.kiki.activity;

import org.sanpra.kiki.R;
import org.sanpra.kiki.account.CommonAccountInfo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class NewAccountTypeSelectActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setListAdapter(new ArrayAdapter<String>(this, R.id.accountTypeListText, CommonAccountInfo.availableAccountTypes));
	}

}
