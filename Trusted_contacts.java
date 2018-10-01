package com.example.android.shakti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Trusted_contacts extends AppCompatActivity {
    String str1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trusted_contacts);
    }
            public void DisplayContact(View view) {
                    EditText text1 = (EditText) findViewById(R.id.EditText1);
                    str1 = text1.getText().toString();

                    EditText text2 = (EditText) findViewById(R.id.EditText2);
                    String str2 = text2.getText().toString();
                    display(str1,str2);

            }
            private void display(String str1,String str2){
                TextView trustedContact1 = (TextView) findViewById(R.id.trusted_contact_info1);
                TextView trustedContact2 = (TextView) findViewById(R.id.trusted_contact_info2);
                trustedContact1.setText("1. " + str1);
                trustedContact2.setText("" + str2);

}


    }

