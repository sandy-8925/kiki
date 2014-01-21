package org.sanpra.kiki.componentUtils;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class StartActivityOnClickListener implements OnClickListener {

	Class<? extends Activity> activityClass;

	public StartActivityOnClickListener(Class<? extends Activity> activityClass) {
		this.activityClass = activityClass;
	}

	@Override
	public void onClick(View clickedView) {
		clickedView.getContext().startActivity(new Intent(clickedView.getContext(), activityClass));
	}

}
