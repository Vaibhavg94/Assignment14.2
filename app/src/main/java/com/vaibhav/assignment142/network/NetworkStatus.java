package com.vaibhav.assignment142.network;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class NetworkStatus {

    private static NetworkStatus instance = new NetworkStatus();
    private static Context context;
    boolean connected = false;

    public static NetworkStatus getInstance(Context ctx) {
        context = ctx;
        return instance;
    }

    public boolean isConnectedToInternet() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        if (activeNetwork != null) { // connected to the internet
            return true;
        }
        return false;
    }
}
