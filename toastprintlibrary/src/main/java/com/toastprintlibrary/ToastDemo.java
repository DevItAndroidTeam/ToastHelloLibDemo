package com.toastprintlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by shailesh.rohit on 11-10-2017.
 */

public class ToastDemo {

    public static void  showMessage(Context context, String message){

        Toast.makeText(context,message,Toast.LENGTH_LONG).show();

    }
}
