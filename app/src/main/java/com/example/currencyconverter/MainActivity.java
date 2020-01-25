package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    public void currencyConverter(View view) {
        
        EditText editText = (EditText)findViewById(R.id.editText2);



        String amountInGBP = editText.getText().toString();
        if(TextUtils.isEmpty(amountInGBP)) {
            Toast.makeText(this, "Please enter a valid amount", LENGTH_LONG).show();
            return;
        }
        double amountInUSD = Double.parseDouble(amountInGBP) * 1.29;
        String amountInUSDString = String.format("%.2f", amountInUSD);

        Toast.makeText(this, "£" + amountInGBP + " is $" + amountInUSDString,
                LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
