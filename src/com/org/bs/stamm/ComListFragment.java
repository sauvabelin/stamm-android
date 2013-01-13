package com.org.bs.stamm;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.org.bs.Contenu;

public class ComListFragment extends ListFragment {
	public ComListFragment() {}
	
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, Contenu.COMM));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Log.i("ComListFragment", "Item clicked: " + id);
    }
}