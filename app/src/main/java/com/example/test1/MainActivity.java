package com.example.test1;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.test1.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView mGreetingTextView;
    Button mButton1;
    Button mButton2;
    Button mButton3;
    TextView mTextView2;
    TextView mTextView3;
    TextView mTextView4;
    TextView mTextView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGreetingTextView = findViewById(R.id.main_textview_greeting);
        mButton1 =findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mButton3 = findViewById(R.id.button3);
        mTextView2 = findViewById(R.id.textView2);
        mTextView3 = findViewById(R.id.textView3);
        mTextView4 = findViewById(R.id.textView4);
        mTextView5 = findViewById(R.id.textView5);


        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int multip = Integer.parseInt(mTextView4.getText().toString());
                int calcul = multip+1;
                mTextView4.setText(String.valueOf(calcul));
                if (calcul == 10) {
                    mGreetingTextView.setText("Le joueur A a gagné");
                    mButton2.setEnabled(false);
                    mButton1.setEnabled(false);
                }
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int multip = Integer.parseInt(mTextView5.getText().toString());
                int calcul = multip+1;
                mTextView5.setText(String.valueOf(calcul));
                if (calcul == 10){
                        mGreetingTextView.setText("Le joueur B a gagné");
                        mButton2.setEnabled(false);
                        mButton1.setEnabled(false);
                }
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView4.setText("0");
                mTextView5.setText("0");

                mButton2.setEnabled(true);
                mButton1.setEnabled(true);

                mGreetingTextView.setText("Score");
            }
        });



    }




}