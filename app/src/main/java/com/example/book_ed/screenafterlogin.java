package com.example.book_ed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screenafterlogin extends AppCompatActivity {
    private Button button;
    public Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenafterlogin);

        button= (Button) findViewById(R.id.logout);
        button.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick( View v){
                openscreenafterlogin();
            }
        });


    }
    public void openscreenafterlogin() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}
