package com.example.rakesh.nita;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by RAKESH on 21-Dec-15.
 */
public class EventList extends Activity implements AdapterView.OnItemClickListener{
    ListView l;
    String[] evlist = {"Event1","Event2","Event3","Event4","Event5","Event6","Event7","Event8" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventlistt);
        l=(ListView)findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,evlist);
            l.setAdapter(adapter);
        l.setOnItemClickListener(this);

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView temp = (TextView) view;
        Intent i = null;
        switch(position){
            case 0:
                i = new Intent(getApplicationContext(),EventDetails.class);
                Toast.makeText(this,temp.getText()+"",Toast.LENGTH_SHORT).show();
                startActivity(i);
                break;
            case 1:
                i = new Intent(getApplicationContext(),EventDetails.class);
                Toast.makeText(this,temp.getText()+"",Toast.LENGTH_SHORT).show();
                startActivity(i);
                break;
            case 2:
                i = new Intent(getApplicationContext(),EventDetails.class);
                Toast.makeText(this,temp.getText()+"",Toast.LENGTH_SHORT).show();
                startActivity(i);
                break;
            default:
                Toast.makeText(this,temp.getText()+"",Toast.LENGTH_SHORT).show();

        }

    }

    //@Override
    /*public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView temp = (TextView) view;

        Toast.makeText(this,temp.getText()+"",Toast.LENGTH_SHORT).show();

    }*/




}