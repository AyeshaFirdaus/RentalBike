package com.example.ayesha.bikerental;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Ayesha on 30-11-2017.
 */

public class DetailActivity extends AppCompatActivity {
    EditText nameedit,contactedir,emailedit,meaasgeedit;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        nameedit=(EditText)findViewById(R.id.nameedit);
        contactedir=(EditText)findViewById(R.id.concactedit);
        emailedit=(EditText)findViewById(R.id.emailedit);
        meaasgeedit=(EditText)findViewById(R.id.messageedit);
        submit=(Button)findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2,s3,s4,s5;
                s1=nameedit.getText().toString();
                s2=contactedir.getText().toString();
                s3=emailedit.getText().toString();
                s4=meaasgeedit.getText().toString();
                s5="";
                if((s1).equals(s5)|(s2).equals(s5)|(s3).equals(s5)|(s4).equals(s5)){
                    Toast.makeText(DetailActivity.this, "enter every thing", Toast.LENGTH_SHORT).show();
                }else{
                    nameedit.setText("");
                    contactedir.setText("");
                    emailedit.setText("");
                    meaasgeedit.setText("");
                    Toast.makeText(DetailActivity.this, "Details recieved", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
