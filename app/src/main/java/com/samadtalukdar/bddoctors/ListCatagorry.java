package com.samadtalukdar.bddoctors;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListCatagorry extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_catagorry);
//Select Catagory
         final String [] list_cat={"Cancer-Oncology","Cordiology","Child Neurology","Dentist","Diabetes",
                 "Eye Surgeon","General Surgeon","Gynaecology","Hematology","Hepatology","Kidney",
                 "Liver","Medicine","Urology"};
        //Title
        final String [] title={"Cancer-Oncology","Cordiology","Child Neurology","Dentist","Diabetes",
                "Eye Surgeon","General Surgeon","Gynaecology","Hematology","Hepatology","Kidney",
                "Liver","Medicine","Urology"};
        //Doctor String Info
        final int [] info_doc={R.string.cancer,R.string.cardiology,R.string.child_neurology,
                R.string.dentist,R.string.diabetes,R.string.eye,R.string.gen_med,R.string.gyny,
                R.string.hema, R.string.hepa,R.string.kidny,R.string.liver,R.string.medcin,R.string.uro
        };

        ArrayAdapter<String> list_adap=new ArrayAdapter<String>(this,R.layout.list_cat_result,
                R.id.view_cat,list_cat);

        //ListView Item Click

        ListView list= (ListView) findViewById(R.id.listcatagory);

        list.setAdapter(list_adap);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                final int cancer=0;
                final int card=1;
                final int child=2;
                final int dentist=3;
                final int diab=4;
                final int eye=5;
                final int gen_sergon=6;
                final int gyny=7;
                final int hema=8;
                final int hepa=9;
                final int kidny=10;
                final int liver=11;
                final int medcin=12;
                final int uro=13;
                switch (position)
                {
                    case cancer:
                        Intent i=new Intent(ListCatagorry.this,ListResult.class);
                        i.putExtra("Title", title[0]);
                        i.putExtra("Doctor",info_doc[0]);
                        startActivity(i);
                        break;
                    case card:
                        Intent i1=new Intent(ListCatagorry.this,ListResult.class);
                        i1.putExtra("Title", title[1]);
                        i1.putExtra("Doctor",info_doc[1]);
                        startActivity(i1);
                        break;
                    case child:
                        Intent i2=new Intent(ListCatagorry.this,ListResult.class);
                        i2.putExtra("Title", title[2]);
                        i2.putExtra("Doctor",info_doc[2]);
                        startActivity(i2);
                        break;
                    case dentist:
                        Intent i3=new Intent(ListCatagorry.this,ListResult.class);
                        i3.putExtra("Title", title[3]);
                        i3.putExtra("Doctor",info_doc[3]);
                        startActivity(i3);
                        break;
                    case diab:
                        Intent i4=new Intent(ListCatagorry.this,ListResult.class);
                        i4.putExtra("Title", title[4]);
                        i4.putExtra("Doctor",info_doc[4]);
                        startActivity(i4);
                        break;
                    case eye:
                        Intent i5=new Intent(ListCatagorry.this,ListResult.class);
                        i5.putExtra("Title", title[5]);
                        i5.putExtra("Doctor",info_doc[5]);
                        startActivity(i5);
                        break;
                    case gen_sergon:
                        Intent i6=new Intent(ListCatagorry.this,ListResult.class);
                        i6.putExtra("Title", title[6]);
                        i6.putExtra("Doctor",info_doc[6]);
                        startActivity(i6);
                        break;
                    case gyny:
                        Intent i7=new Intent(ListCatagorry.this,ListResult.class);
                        i7.putExtra("Title", title[7]);
                        i7.putExtra("Doctor",info_doc[7]);
                        startActivity(i7);
                        break;
                    case hema:
                        Intent i8=new Intent(ListCatagorry.this,ListResult.class);
                        i8.putExtra("Title", title[8]);
                        i8.putExtra("Doctor",info_doc[8]);
                        startActivity(i8);
                        break;
                    case hepa:
                        Intent i9=new Intent(ListCatagorry.this,ListResult.class);
                        i9.putExtra("Title", title[9]);
                        i9.putExtra("Doctor",info_doc[9]);
                        startActivity(i9);
                        break;
                    case kidny:
                        Intent i10=new Intent(ListCatagorry.this,ListResult.class);
                        i10.putExtra("Title", title[10]);
                        i10.putExtra("Doctor",info_doc[10]);
                        startActivity(i10);
                        break;
                    case liver:
                        Intent i11=new Intent(ListCatagorry.this,ListResult.class);
                        i11.putExtra("Title", title[11]);
                        i11.putExtra("Doctor",info_doc[11]);
                        startActivity(i11);
                        break;
                    case medcin:
                        Intent i12=new Intent(ListCatagorry.this,ListResult.class);
                        i12.putExtra("Title", title[12]);
                        i12.putExtra("Doctor",info_doc[12]);
                        startActivity(i12);
                        break;
                    case uro:
                        Intent i13=new Intent(ListCatagorry.this,ListResult.class);
                        i13.putExtra("Title", title[13]);
                        i13.putExtra("Doctor",info_doc[13]);
                        startActivity(i13);
                        break;

                    default:
                        break;
                }

                //Toast Example

                Toast.makeText(ListCatagorry.this, list_cat[position] + "  Select", Toast.LENGTH_SHORT).show();


            }


        });




    }

    //Aleart Dialog

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        calAlert();
    }

    private void calAlert(){
        AlertDialog.Builder alert=new AlertDialog.Builder(ListCatagorry.this);
        alert.setTitle("EXIT This App");
        alert.setIcon(R.drawable.alert_icon);
        alert.setMessage("Are Sure You Want To EXIT");

        alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub

                finish();


            }
        });

        alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub

                dialog.cancel();


            }
        });

        AlertDialog alertDialog=alert.create();
        alertDialog.show();;


    }
}
