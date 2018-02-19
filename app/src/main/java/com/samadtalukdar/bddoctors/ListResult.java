package com.samadtalukdar.bddoctors;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ListResult extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_result);

        TextView title= (TextView) findViewById(R.id.title);
        TextView info_view= (TextView) findViewById(R.id.info_view);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            title.setText((String)bundle.get("Title"));
            info_view.setText(Html.fromHtml(getString((int) bundle.get("Doctor"))));
        }
    }


}
