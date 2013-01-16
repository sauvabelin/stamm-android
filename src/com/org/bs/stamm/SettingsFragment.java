package com.org.bs.stamm;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.PreferenceFragment;

/**
 * @author CMR
 * Settings fragment. Uses the preference.xml scheme for the layout
 */
public class SettingsFragment extends PreferenceFragment implements OnSharedPreferenceChangeListener {

    public static final String KEY_PREF_FUNCTION = "pref_function";
    public static final String KEY_PREF_BRANCHE = "pref_branche";

    private ListPreference mPrefFunction;
    private ListPreference mPrefBranche;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);

        mPrefFunction = (ListPreference) getPreferenceScreen().findPreference(KEY_PREF_FUNCTION);
        mPrefBranche = (ListPreference) getPreferenceScreen().findPreference(KEY_PREF_BRANCHE);
    }
    

    /* (non-Javadoc)
     * @see android.content.SharedPreferences.OnSharedPreferenceChangeListener#onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String)
     * Changes the preference value in the settings layout when the preference changes
     */
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if (key.equals(KEY_PREF_FUNCTION)) {
        	mPrefFunction.setSummary("Affiche les infos concernant :  " + sharedPreferences.getString(key, "")); 
        }
        else if (key.equals(KEY_PREF_BRANCHE)) {
        	mPrefBranche.setSummary("Affiche les infos concernant :  " + sharedPreferences.getString(key, "")); 
        }
    }
    
    @Override
    public void onResume() {
        super.onResume();

        // Setup the initial values
        mPrefFunction.setSummary("Affiche les infos concernant :  " + getPreferenceScreen().getSharedPreferences().getString(KEY_PREF_FUNCTION, "")); 
        mPrefBranche.setSummary("Affiche les infos concernant :  " + getPreferenceScreen().getSharedPreferences().getString(KEY_PREF_BRANCHE, "")); 

        // Set up a listener whenever a key changes            
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onPause() {
        super.onPause();

        // Unregister the listener whenever a key changes            
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);    
    }
}
