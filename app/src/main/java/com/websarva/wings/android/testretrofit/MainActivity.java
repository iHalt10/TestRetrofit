package com.websarva.wings.android.testretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private TestInterface mInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build();

        mInterface = retrofit.create(TestInterface.class);
    }

    public void onGetButtonClick(View v) {
        Toast.makeText(this, "get", Toast.LENGTH_SHORT).show();
    }

    public void onPostButtonClick(View v) {
        Toast.makeText(this, "post", Toast.LENGTH_SHORT).show();
    }
}