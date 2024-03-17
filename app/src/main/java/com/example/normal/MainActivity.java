package com.example.normal;
import static android.content.ContentValues.TAG;
import static com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button equalBtn ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // in here we are initializing our variables

        equalBtn = findViewById(R.id.btnResult);

        TextView resultSet = findViewById(R.id.resultsTV);



        // for the buttons I directly passed their id through the findViewById below

        findViewById(R.id.btn0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+"0");
                equalBtn.setEnabled(true);


            }
        });


        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+"1");

                equalBtn.setEnabled(true);

            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+"2");
                equalBtn.setEnabled(true);

            }
        });



        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+"3");
                equalBtn.setEnabled(true);

            }
        });


        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+"4");
                equalBtn.setEnabled(true);

            }
        });


        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+"5");
                equalBtn.setEnabled(true);

            }
        });



        findViewById(R.id.btn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+"6");
                equalBtn.setEnabled(true);

            }
        });



        findViewById(R.id.btn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+"7");
                equalBtn.setEnabled(true);

            }
        });

        findViewById(R.id.btn8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+"9");
                equalBtn.setEnabled(true);

            }
        });


        findViewById(R.id.btn9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+"9");
                equalBtn.setEnabled(true);


            }
        });


        findViewById(R.id.bntSub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+" - ");

            }
        });

        findViewById(R.id.btnAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+" + ");

            }
        });



        findViewById(R.id.btnDiv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText(resultSet.getText().toString()+" / ");

            }
        });

        findViewById(R.id.btnDot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  resultSet.setText(resultSet.getText().toString()+".");
                  equalBtn.setEnabled(true);
            }
        });


        findViewById(R.id.btnMulti).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                equalBtn.setEnabled(true);

                resultSet.setText(resultSet.getText().toString()+" x ");

            }
        });

        findViewById(R.id.cleanAll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultSet.setText("");
                equalBtn.setEnabled(false);


            }
        });


        findViewById(R.id.btnResult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(resultSet.getText() == null){
                    // in here when the button 'Equal' is being pressed and the user doesn't
                    // enter anything the button will being disable temporary
                    // till the user enter other number will be activating again

                    findViewById(R.id.btnResult).setEnabled(false);
                }


                // In here I made a variable 'stringNumbers' to store all our data
                // as String numbers

                String stringNumbers  = resultSet.getText().toString(); //////////<<<<<<<<<<<<<

                // in here I  declared an array of strings
                // because we want to split the string based on spaces

                String [] splittingNums = stringNumbers.split(" ");


                double sum = Double.parseDouble(splittingNums[0]);
                int NumbersId = 0 ;  // 1 >> 3 >> 5


                //  Numbers        2   +   2   +   2   +    2    +    2
                // stringArray[i]  0  '1'  2  '3'  4  '5'   6   '7'   8
                //  operator ici her zaman tek olacak, ve sayılar her zaman çift olacak


                for (int i = 1; i < splittingNums.length; i += 2) {


                    // at the first the for loop will start from the numbers then it moves to the operation
                    // if the if condition finds any kind of operations (+ , / , * , -)
                    // it gonna implies the necessary operation

                    if (splittingNums[i].equals("+")){
                        sum += Double.parseDouble(splittingNums[NumbersId += 2]);
                    }
                    else if (splittingNums[i].equals("-")){
                        sum -= Double.parseDouble(splittingNums[NumbersId += 2]);
                    }
                    else if (splittingNums[i].equals("x")){
                        sum *= Double.parseDouble(splittingNums[NumbersId += 2]);
                    }
                    else if (splittingNums[i].equals("/")){
                        sum /= Double.parseDouble(splittingNums[NumbersId += 2]);
                    }
                }

                resultSet.setText(sum+"");



            }
        });


    }}