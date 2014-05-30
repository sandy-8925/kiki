package org.sanpra.kiki.account;

/**
 * Represents an account type (e.g) Facebook account, Google account etc.
 * Each AccountType implementation must have a logo, service name
 */
public interface AccountType {
    public Account createAccount();
    public String getServiceName();
    //TODO:logo
}
