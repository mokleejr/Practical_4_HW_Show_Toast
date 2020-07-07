package com.example.practical_4_hw_show_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox check1, check2,check3,check4,check5;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick() {
        check1 = (CheckBox)findViewById(R.id.checkBox_1);
        check2 = (CheckBox)findViewById(R.id.checkBox_2);
        check3 = (CheckBox)findViewById(R.id.checkBox_3);
        check4 = (CheckBox)findViewById(R.id.checkBox_4);
        check5 = (CheckBox)findViewById(R.id.checkBox_5);
        button = (Button)findViewById(R.id.button_show);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                result.append("Toppings: ");
                if(check1.isChecked()){
                    result.append(getString(R.string.checkbox_1_text) + " ");
                }
                if(check2.isChecked()){
                    result.append(getString(R.string.checkbox_2_text) + " ");
                }
                if(check3.isChecked()){
                    result.append(getString(R.string.checkbox_3_text) + " ");
                }
                if(check4.isChecked()){
                    result.append(getString(R.string.checkbox_4_text) + " ");
                }
                if(check5.isChecked()){
                    result.append(getString(R.string.checkbox_5_text));
                }
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}