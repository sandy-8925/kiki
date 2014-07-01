package org.sanpra.kiki.account;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages accounts for different services.
 * Handles account creation, persistence, deletion.
 */
public final class AccountManager {
    //TODO: needs to be persisted somewhere
    private static List<Account> accountList;

    private static List<AccountType> availableAccountTypes = new ArrayList<AccountType>();

    static {
        availableAccountTypes.add(FacebookAccountType.getInstance());
    }

    private static AccountManager instance;

    private AccountManager() {}

    public static AccountManager getInstance() {
        if(instance == null)
            instance = new AccountManager();
        return instance;
    }

    public static List<AccountType> getAvailableAccountTypes() {
        //TODO: maybe return only copy of availableAccountTypes? Might not be possible since AccountType implementations must be singletons. Or make it unmodifiable (no adding or removing entries)
        return availableAccountTypes;
    }
}
