package com.org.bs.stamm;

import android.content.Intent;
import android.net.Uri;
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
        
        String path = "/sdcard/Stamm/" + Mocks.getInstance().getFiles().get(position).getUri();
        java.io.File targetFile = new java.io.File(path);
        Uri targetUri = Uri.fromFile(targetFile);
    	
    	Intent intent;
        intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(targetUri, "application/pdf");
        
        startActivity(intent);
    }
	
}