package com.example.usnbik.project_progress_tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;

public class MainPage extends AppCompatActivity {
    ListView listView;
    Spinner dropdown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        listView = (ListView) findViewById(R.id.listView);
        String[] tasks = {"Task 1", "Task 2", "Task 3", "Task 4", "Task 5", "Task 6"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1, tasks);
        listView.setAdapter(adapter);

        Spinner dropdown = (Spinner)findViewById(R.id.spinner);
        String[] items = new String[]{"Project 1", "Project 2", "Project 3"};
        ArrayAdapter<String> drop = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        dropdown.setAdapter(drop);

       

    }

    public void title_activity_logout_screen(View v){
        startActivity(new Intent(MainPage.this, logout_screen.class));
    }

    public void title_activity_activity_user_profile(View v) {
        startActivity(new Intent(MainPage.this, activity_user_profile.class));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }


    }


