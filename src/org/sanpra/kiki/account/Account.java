package org.sanpra.kiki.account;

/**
 * Represents service account (Facebook, Google+, Flickr etc.) of any type
 */
abstract class Account {
    protected AccountType accountType;

    public AccountType getAccountType() {
        return accountType;
    }
}
