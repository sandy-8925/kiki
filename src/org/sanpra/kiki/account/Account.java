package org.sanpra.kiki.account;

/**
 * Represents service account (Facebook, Google+, Flickr etc.) of any type
 */
abstract public class Account {
    private AccountType accountType;

    protected Account(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Returns a representative name for this account, to be shown to the user.
     * It is meant to help the user uniquely identify the account.
     * @return A display name for this account
     */
    public abstract String getDisplayName();
}
