package com.example.android.shakti;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Register1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);
    }
    public void CallHelpline(View view){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:0111-23219750"));
            startActivity(intent);
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
    }
    public void DisplayContact(View view){
        Intent i1 = new Intent(this,Trusted_contacts.class);
        startActivity(i1);
    }
    public void BookCab(View view){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
                Uri.parse("13.0329844,77.5621197");
        startActivity(intent);
    }
    public void trouble(View view){
        Intent intent = new Intent(this,trouble.class);
        startActivity(intent);
    }
    public void user_info(View view){
        EditText text1 = (EditText) findViewById(R.id.info1);
        String str1 = text1.getText().toString();
        EditText text2 = (EditText) findViewById(R.id.info2);
        String str2 = text2.getText().toString();
        EditText text3 = (EditText) findViewById(R.id.info3);
        String str3 = text3.getText().toString();
        EditText text4 = (EditText) findViewById(R.id.info4);
        String str4 = text4.getText().toString();
        RadioButton info5 = (RadioButton) findViewById(R.id.info5_1);
        boolean info5_status = info5.isChecked();

        Toast.makeText(getApplicationContext(),"User registered Successfully!!",Toast.LENGTH_LONG).show();

    }
}
