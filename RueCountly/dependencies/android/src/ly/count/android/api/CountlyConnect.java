package ly.count.android.api;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import org.haxe.extension.Extension;
import org.haxe.nme.HaxeObject;


public class CountlyConnect extends Extension 
{
        private static String serverID = "::ENV_ServerID::"; 
        private static String appKey = "::ENV_AppKey::"; 
        
        private static Chartboost cb;
        
        @Override public void onCreate (Bundle savedInstanceState)
        {
			if(CountlyConnect.serverID == "null" || CountlyConnect.appKey == "null")
			{
				return;
			}
            Log.e("CountlyConnect", "Linking to Countly service");
           Countly.sharedInstance().init(context, CountlyConnect.serverID, CountlyConnect.appKey);
        }
        

        @Override public void onStart()
        {
            Log.e("CountlyConnect", "STARTING COUNTLY");
			Countly.sharedInstance().onStart();
        }   
        
        @Override public void onStop() 
        {
            Log.e("CountlyConnect", "STOPPING COUNTLY");
			Countly.sharedInstance().onStop();
        }

}
