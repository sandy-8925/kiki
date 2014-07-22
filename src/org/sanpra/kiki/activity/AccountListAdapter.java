package org.sanpra.kiki.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import org.sanpra.kiki.account.Account;

import java.util.List;

final class AccountListAdapter implements ListAdapter {

    private List<Account> accountList;

    AccountListAdapter(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public boolean isEnabled(int position) {
        return true;
    }

    @Override
    public void registerDataSetObserver(android.database.DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(android.database.DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return accountList.size();
    }

    @Override
    public Object getItem(int position) {
        return accountList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listItem = layoutInflater.inflate(android.R.layout.simple_list_item_2, parent, false);

        final Account relatedAccount = accountList.get(position);
        ((TextView) listItem.findViewById(android.R.id.text1)).setText(relatedAccount.getDisplayName());
        ((TextView) listItem.findViewById(android.R.id.text2)).setText(relatedAccount.getAccountType().getServiceName());

        return listItem;
    }

    @Override
    public int getItemViewType(int position) {
        return IGNORE_ITEM_VIEW_TYPE;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return accountList.isEmpty();
    }
}
