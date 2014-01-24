package org.sanpra.kiki.activity;

import org.sanpra.kiki.account.CommonAccountInfo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class NewAccountTypeSelectActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ListAdapter accountTypeListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CommonAccountInfo.availableAccountTypes);
		setListAdapter(accountTypeListAdapter);
	}

}
