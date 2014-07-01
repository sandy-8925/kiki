package org.sanpra.kiki.account;

import com.facebook.Session;
import com.facebook.SessionState;

/**
 * Account type class for Facebook accounts
 */
final class FacebookAccountType implements AccountType {

    private static FacebookAccountType instance;
    private static final String serviceName = "Facebook";

    private FacebookAccountType() {}

    static FacebookAccountType getInstance() {
        if(instance == null)
            instance = new FacebookAccountType();
        return instance;
    }

    @Override
    public String getServiceName() {
        return serviceName;
    }

    @Override
    public Account createAccount(android.app.Activity activity) {
        Session newFacebookSession = Session.openActiveSession(activity, true, null);
        FacebookAccount newFacebookAccount = new FacebookAccount(newFacebookSession);
        return newFacebookAccount;
    }
}
