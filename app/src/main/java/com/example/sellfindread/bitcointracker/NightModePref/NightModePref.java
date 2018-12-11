package com.example.sellfindread.bitcointracker.NightModePref;

import android.content.Context;
import android.content.SharedPreferences;

public class NightModePref {
    SharedPreferences sharedPreferences;

    public NightModePref(Context context){
        sharedPreferences=context.getSharedPreferences("Theme State", Context.MODE_PRIVATE);
    }

    public void setThemeState(Boolean state){
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean("Night Mode", state);
        editor.apply();
    }

    public Boolean loadThemeState(){
        Boolean state=sharedPreferences.getBoolean("Night Mode", false);
        return state;
    }
}
