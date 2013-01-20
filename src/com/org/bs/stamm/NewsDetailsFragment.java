package com.org.bs.stamm;

import java.util.Vector;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.org.bs.stamm.Mocks;

public class NewsDetailsFragment extends Fragment {
	
	public NewsDetailsFragment() {}
	
	/**
     * Create a new instance of NewsDetailsFragment, initialized to
     * show the text at 'index'.
     */
    public static NewsDetailsFragment newInstance(int index) {
    	NewsDetailsFragment f = new NewsDetailsFragment();

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
    	View layout = inflater.inflate(R.layout.news_details, container, false);
    	
    	Vector<News> news = Mocks.getInstance().getNews();
    	
    	News currentNews = news.get(getShownIndex());
    	
		((TextView) layout.findViewById(R.id.news_title)).setText(currentNews.getTitle());
 	
		((TextView) layout.findViewById(R.id.news_text)).setText(currentNews.getText());
		
		((TextView) layout.findViewById(R.id.news_author)).setText(currentNews.getAuthor());
		
		((TextView) layout.findViewById(R.id.news_date)).setText(currentNews.getDateString());
    	
		return layout;
    }
    
}