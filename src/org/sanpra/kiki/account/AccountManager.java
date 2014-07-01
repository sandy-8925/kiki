package org.sanpra.kiki.account;

import java.util.List;

/**
 * Manages accounts for different services.
 * Handles account creation, persistence, deletion.
 */
public final class AccountManager {

    public static String[] availableAccountTypes = {
        "Facebook"
    };
    //TODO: needs to be persisted somewhere
    private static List<Account> accountList;

    public static AccountType getAccountType(String accountTypeString) {
        return null;
    }

    public static List<AccountType> getAccountTypeList() {
        return null;
    }
}
