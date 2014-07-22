package org.sanpra.kiki.account;

import android.app.Activity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Manages accounts for different services.
 * Handles account creation, persistence, deletion.
 */
public final class AccountManager {
    //TODO: needs to be persisted somewhere
    private final static List<Account> accountList = new ArrayList<Account>();

    private final static Set<AccountType> availableAccountTypes = new HashSet<AccountType>();

    //TODO: Find better way of initializing list of account types. This data needs to be persisted somewhere.
    static {
        availableAccountTypes.add(FacebookAccountType.getInstance());
    }

    private AccountManager() {
    }

    public static List<Account> getAccountList() {
        return Collections.unmodifiableList(accountList);
    }

    public static Collection<AccountType> getAvailableAccountTypes() {
        return Collections.unmodifiableSet(availableAccountTypes);
    }

    public static void createAccount(AccountType selectedAccountType, Activity activity) {
        accountList.add(selectedAccountType.createAccount(activity));
    }
}
