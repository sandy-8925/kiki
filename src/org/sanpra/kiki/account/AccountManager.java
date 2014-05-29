package org.sanpra.kiki.account;

import java.util.List;

/**
 * Created by sandeep on 23/05/14.
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

    public static List<Account> getAccountList() {
        return null;
    }

    public static List<AccountType> getAccountTypeList() {
        return null;
    }
}
