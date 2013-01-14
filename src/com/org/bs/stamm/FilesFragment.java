package com.org.bs.stamm;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FilesFragment extends ListFragment {
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
        // populate list with the files
        setListAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, Mocks.getInstance().getFilesNames()));
	}
	
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
    	
    }
	
}