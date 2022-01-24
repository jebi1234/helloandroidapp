//package com.example.hello1;
//
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.EditText;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class TestActivity extends AppCompatActivity {
//
//    Button CheckB;
//    RadioGroup radioGroup;
//    RadioButton radioButton;
//    AlertDialog.Builder builder;
//    AlertDialog alert;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_test);
//        Toast.makeText(TestActivity.this, "onCreated", Toast.LENGTH_SHORT).show();
//
//        radioGroup = findViewById(R.id.getradiobuttonvalue);
//        CheckB = findViewById(R.id.b1);
//        builder = new AlertDialog.Builder(this);

//        CheckB.setOnClickListener(new View.OnClickListenernfkghnjk() {
//            @Override
//            public void onClick(View v) {
//
//                //Uncomment the below code to Set the message and title from the strings.xml file
//
//                builder.setIcon(R.drawable.fb_icon)
//                        .setMessage("Select Yes or No Options")
//                        .setCancelable(true)
//                        .setPositiveButton("Yes1", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//
//                                Toast.makeText(getApplicationContext(),"yes",
//                                        Toast.LENGTH_SHORT).show();
//                            }
//                        })
//                        .setNegativeButton("No1", new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog, int id) {
//                                //  Action for 'NO' Button
//                                Toast.makeText(getApplicationContext(),"No",
//                                        Toast.LENGTH_SHORT).show();
//                            }
//                        });
//                //Creating dialog box
//                alert = builder.create();
//                //Setting the title manually
//                alert.setTitle("Sample Dialog");
//                alert.show();
//
//            }
//        });
//
//
//    }
//
////    @Override
////    protected void onStart() {
////        super.onStart();
////        Toast.makeText(TestActivity.this, "onStart", Toast.LENGTH_SHORT).show();
////    }
////    @Override
////    protected void onResume() {
////        super.onResume();
////        Toast.makeText(TestActivity.this, "onResume", Toast.LENGTH_SHORT).show();
////    }
//    @Override
//    protected void onPause() {
//
//        super.onPause();
//        Toast.makeText(TestActivity.this, "OnPause", Toast.LENGTH_SHORT).show();
//
//    }
////    @Override
////    protected void onStop() {
////        super.onStop();
////        Toast.makeText(TestActivity.this, "onStop", Toast.LENGTH_SHORT).show();
////    }
////    @Override
////    protected void onRestart() {
////        super.onRestart();
////        Toast.makeText(TestActivity.this, "onRestart", Toast.LENGTH_SHORT).show();
////    }
////    @Override
////    protected void onDestroy() {
////        super.onDestroy();
////        Toast.makeText(TestActivity.this, "onDestroy", Toast.LENGTH_SHORT).show();
////    }
//}