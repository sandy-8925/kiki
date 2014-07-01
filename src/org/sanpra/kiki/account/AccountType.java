package org.sanpra.kiki.account;

import android.app.Activity;

/**
 * Represents an account type (e.g) Facebook account, Google account etc.
 * Each AccountType implementation must have a logo, service name, and a
 * method to create an account of that type.
 *
 * Make all implementations singletons - only one instance is required
 */
public interface AccountType {
    public Account createAccount(Activity activity);
    public String getServiceName();
    //TODO: method for retrieving logo
}
