package com.samadtalukdar.bddoctors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread splash=new Thread()
        {
            @Override
            public void run() {
                try{
                    sleep(2500);
                }
                catch (Exception e){}
                finally {
                    Intent run=new Intent(SplashActivity.this,ListCatagorry.class);
                    startActivity(run);
                    finish();

                }
            }
        };
        splash.start();
    }


}
