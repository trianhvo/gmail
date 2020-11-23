package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.gmail.adapters.Email;
import com.example.gmail.adapters.EmailLayoutAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Email> items;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_item);
        items = new ArrayList<Email>();
        for (int j = 0; j < 20; j++) {
            items.add(new Email("mrx96@gmail.com", "From Mr.X", "Today, your lucky number is " + j, "06:09", "X", false));
        }
        EmailLayoutAdapter adapter = new EmailLayoutAdapter(items, this);
        listView.setAdapter(adapter);
    }
}