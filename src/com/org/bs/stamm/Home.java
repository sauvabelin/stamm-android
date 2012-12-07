package com.org.bs.stamm;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class Home extends FragmentActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link android.support.v4.app.FragmentPagerAdapter} derivative, which
     * will keep every loaded fragment in memory. If this becomes too memory
     * intensive, it may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the app.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_home, menu);
        return true;
    }
    
    

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
        	Fragment fragment;
            Bundle args = new Bundle();
        	
            switch (position) {
            default:
            case 0:
            	fragment = new NewsList();
            	break;
            	
            case 1:
            	fragment = new ComList();
                break;
                
            case 2:
            	fragment = new EventsList();
                break;

            }
                
            fragment.setArguments(args);

            return fragment;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.title_section_news).toUpperCase();
                case 1:
                    return getString(R.string.title_section_com).toUpperCase();
                case 2:
                    return getString(R.string.title_section_agenda).toUpperCase();
            }
            return null;
        }
    }
    
    public static class ComList extends Fragment {
    	public ComList() {}
    	
    	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            
    		
    		TextView textView = new TextView(getActivity());
            textView.setGravity(Gravity.CENTER);
            textView.setText("Communications!");
            
            
            
            return textView;
    	}
    }

    public static class EventsList extends Fragment {
    	public EventsList() {}
    	
    	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            TextView textView = new TextView(getActivity());
            textView.setGravity(Gravity.CENTER);
            textView.setText("Agenda!");
            return textView;
    	}
    }
    
    public static class NewsList extends Fragment {
    	public NewsList() {}
    	
    	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view;
            view = inflater.inflate(R.layout.news_list, null);
            
            ListView listView = (ListView) getView().findViewById(R.id.newslist);
            String[] values = new String[] { 
	    		"Les résultats du PCDMD sont publiés!", 
	    		"Le vin chaud du mat ce mercredi",
	    		"Ramenez votre mat!",
	    		"La galerie photo fonctionne à nouveau",
	    		"Nouvel an"
            };
            
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getView().getContext(), android.R.layout.simple_list_item_1, android.R.id.text1, values);
            
            listView.setAdapter(adapter);
            
            return view;
    	}
    }
    
}
