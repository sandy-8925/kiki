package org.sanpra.kiki.account;

import com.facebook.Session;

/**
 * Represents a Facebook account
 */
final class FacebookAccount extends Account {
    private Session fbSession;

    FacebookAccount(Session session) {
        super(FacebookAccountType.getInstance());
        this.fbSession = session;
    }

    @Override
    public String getDisplayName() {
        return "Test display name";
    }
}
