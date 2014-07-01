package org.sanpra.kiki.account;

/**
 * Represents service account (Facebook, Google+, Flickr etc.) of any type
 */
abstract class Account {
    private AccountType accountType;

    protected Account(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }
}
