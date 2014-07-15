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
    private static List<Account> accountList = new ArrayList<Account>();

    private static Set<AccountType> availableAccountTypes = new HashSet<AccountType>();

    //TODO: find better way of initializing list of account types
    static {
        availableAccountTypes.add(FacebookAccountType.getInstance());
    }

    private static AccountManager instance;

    private AccountManager() {
    }

    public static AccountManager getInstance() {
        if(instance == null)
            instance = new AccountManager();
        return instance;
    }

    public static Collection<AccountType> getAvailableAccountTypes() {
        return Collections.unmodifiableSet(availableAccountTypes);
    }

    public static void createAccount(AccountType selectedAccountType, Activity activity) {
        accountList.add(selectedAccountType.createAccount(activity));
    }
}
