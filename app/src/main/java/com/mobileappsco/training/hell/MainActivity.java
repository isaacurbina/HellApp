package com.mobileappsco.training.hell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private Button myButton;
    private EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = (TextView) findViewById(R.id.myTextView);
        myButton = (Button) findViewById(R.id.myButton);
        myEditText = (EditText) findViewById(R.id.myEditText);
    }

    public void onClick(View view) {
        myTextView.setText(myEditText.getText().toString());
        Log.d("FT        1", "myTextView ID= "+R.id.myTextView);
        myEditText.setText("");
    }
}
