package org.sanpra.kiki.utils;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class StartActivityOnClickListener implements OnClickListener {

	Class<? extends Activity> activityClass;
	Intent startActivityIntent;

	public StartActivityOnClickListener(Class<? extends Activity> activityClass) {
		this.activityClass = activityClass;
		startActivityIntent = new Intent();
	}

	@Override
	public void onClick(View clickedView) {
		startActivityIntent.setClass(clickedView.getContext(), activityClass);
		clickedView.getContext().startActivity(startActivityIntent);
	}

}
