package com.org.bs.stamm;

import java.util.Vector;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.app.Activity;

public class ActivitiesMapActivity extends Activity {

	static final LatLng LAUSANNE = new LatLng(46.54, 6.633);
	 private GoogleMap map;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activities_map);
		
	    map = ((MapFragment) getFragmentManager().findFragmentById(R.id.activities_map)).getMap();
	    
	    Vector<Activite> activities =  Mocks.getInstance().getThisWeActivities();
	    
	    for(Integer i = 0; i<activities.size(); i++) {
	    	map.addMarker(new MarkerOptions()
		    	.position(activities.get(i).getPosition())
		    	.title(activities.get(i).getTitle())
		    	.snippet(activities.get(i).getComment()));
	    }
	    
	    map.moveCamera(CameraUpdateFactory.newLatLngZoom(LAUSANNE, 12));
	}

}
