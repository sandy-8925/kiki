package org.sanpra.kiki.account;

/**
 * Should be an abstract class, not an interface
 */
public abstract class AccountType {
    //TODO:logo

    //service name
    protected String serviceName;

    public void createAccount() {

    }

    public String getServiceName() {
        return serviceName;
    }
}
