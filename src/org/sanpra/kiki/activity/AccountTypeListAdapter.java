package org.sanpra.kiki.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import org.sanpra.kiki.R;
import org.sanpra.kiki.account.AccountType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 */
final class AccountTypeListAdapter implements ListAdapter {

    private List<AccountType> accountTypesList;

    AccountTypeListAdapter(Collection<AccountType> accountTypesList) {
        if(accountTypesList == null)
            throw new NullPointerException("accountTypesList should not be null");
        this.accountTypesList = new ArrayList<AccountType>();
        this.accountTypesList.addAll(accountTypesList);
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
        return accountTypesList.size();
    }

    @Override
    public Object getItem(int position) {
        return accountTypesList.get(position);
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
        //TODO: If convertView is non-null, reuse it
        LayoutInflater layoutInflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listItem = layoutInflater.inflate(R.layout.account_type_list_textview, parent, false);
        TextView serviceNameView = (TextView) listItem.findViewById(R.id.accountTypeListText);
        serviceNameView.setText(accountTypesList.get(position).getServiceName());
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
        return accountTypesList.isEmpty();
    }
}
