package com.org.bs.stamm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivitiesListFragment extends ListFragment {
	public ActivitiesListFragment() {}
	
	// local vars
    int mCurCheckPosition = 0;
	
	
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        
        // populate list with our news titles
        setListAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, Mocks.getInstance().getActivitiesTitles()));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
    	showDetails(position);
    }
    
    
    /**
     * Helper function to show the details of a selected item, either by
     * displaying a fragment in-place in the current UI, or starting a
     * whole new activity in which it is displayed.
     */
    public void showDetails(int index) {
        mCurCheckPosition = index;

        // Otherwise we need to launch a new activity to display
        // the dialog fragment with selected text.
        Intent intent = new Intent();
        intent.setClass(getActivity(), ActivitiesMapActivity.class);
        intent.putExtra("index", index);
        startActivity(intent);
    }
}