package com.example.rakesh.hackfest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;

/**
 * Created by RAKESH on 27-02-2016.
 */
public class Splash extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent open=new Intent(Splash.this,MainActivity.class);
                    startActivity(open);

                }
            }
        };
        timer.start();
    }
    protected void onPause(){
        super.onPause();
        finish();
    }
}
