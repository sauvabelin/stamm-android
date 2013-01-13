package com.org.bs.stamm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class EventDetailsFragment extends Fragment {
	public EventDetailsFragment() {}
	
	/**
     * Create a new instance of EventDetailsFragment, initialized to
     * show the text at 'index'.
     */
    public static EventDetailsFragment newInstance(int index) {
    	EventDetailsFragment f = new EventDetailsFragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);

        return f;
    }
    
    
    
    public int getShownIndex() {
        return getArguments().getInt("index", 0);
    }

    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        
    	if (container == null) {
            // We have different layouts, and in one of them this
            // fragment's containing frame doesn't exist.  The fragment
            // may still be created from its saved state, but there is
            // no reason to try to create its view hierarchy because it
            // won't be displayed.  Note this is not needed -- we could
            // just run the code below, where we would create and return
            // the view hierarchy; it would just never be used.
            return null;
        }
    	
    	// Inflate the layout for this fragment
    	View layout = inflater.inflate(R.layout.event_details, container, false);
    	
    	Event event = Mocks.getInstance().getEvents().elementAt(getShownIndex());
    	
		((TextView) layout.findViewById(R.id.event_title)).setText(event.getTitle());
		((TextView) layout.findViewById(R.id.event_text)).setText(event.getText());
		((TextView) layout.findViewById(R.id.event_author)).setText(event.getAuthor());
		((TextView) layout.findViewById(R.id.event_start_date)).setText(event.getStartDate());
		((TextView) layout.findViewById(R.id.event_start_time)).setText(event.getStartTime());
		((TextView) layout.findViewById(R.id.event_end_date)).setText(event.getEndDate());
		((TextView) layout.findViewById(R.id.event_end_time)).setText(event.getEndTime());
    	
		return layout;
    }
    
}