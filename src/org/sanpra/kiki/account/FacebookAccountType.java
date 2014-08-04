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
    public void createAccount(android.app.Activity activity) {
        Session.openActiveSession(activity, true, new Session.StatusCallback() {

            @Override
            public void call(Session session, SessionState state, Exception exception) {
                //TODO: Handle session opening failure - display error message to user (Toast?)
                if(session.isOpened()) {
                    FacebookAccount newFacebookAccount = new FacebookAccount(session);
                    AccountManager.addAccount(newFacebookAccount);

                    //TODO: Use different callback for created session - this callback class is only meant to handle account creation
                }
            }
        });
    }
}
