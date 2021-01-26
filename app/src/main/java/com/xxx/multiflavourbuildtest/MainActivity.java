package com.xxx.multiflavourbuildtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    static class DataObject{
        public String name;
        public int age;
    }


    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try(InputStreamReader reader = new InputStreamReader(getResources().openRawResource(R.raw.aa))){
            Log.d(TAG, "onCreate: gson=" + new Gson().fromJson(reader, DataObject.class).name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
