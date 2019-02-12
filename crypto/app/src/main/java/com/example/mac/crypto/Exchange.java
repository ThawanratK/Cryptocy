package com.example.mac.crypto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Exchange extends AppCompatActivity {
    private static final String TAG = "myapp";

    Button btnemoney;
    Spinner sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange);
        btnemoney=(Button)findViewById(R.id.money);
        btnemoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn=new Intent(Exchange.this,MainActivity.class);
                startActivity(itn);
                overridePendingTransition(R.anim.slideleft,R.anim.sliderightout);
            }
        });
        sp=(Spinner)findViewById(R.id.spinner);
        Bundle bundle = getIntent().getExtras();
        final String[] pricecoin = bundle.getStringArray("pricecoin");
        final String[] listCoin = bundle.getStringArray("namecoin");




        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,listCoin);
       adapter.setDropDownViewResource(R.layout.spinner_items);
        sp.setAdapter(adapter);


        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {

                final EditText edt1 = (EditText) findViewById(R.id.edittxt1);
                final EditText edt2 = (EditText) findViewById(R.id.edittxt2);
                final Button buttonConvert = (Button) findViewById(R.id.button_convert);
                switch (listCoin[position]){
                    case ("BTC"):
                        buttonConvert.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                double edit1 = Double.valueOf(edt1.getText().toString());
                                 final double edit2 = edit1 * Double.parseDouble(pricecoin[position]);
                                 edt2.setText(String.valueOf(edit2));
                                Log.d(TAG,"sum"+ edit2);


                            }
                        });
                        break;

                    case ("ETH"):
                        buttonConvert.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                double edit1 = Double.valueOf(edt1.getText().toString());
                                final double edit2 = edit1 * Double.parseDouble(pricecoin[position]);
                                Log.d(TAG,"sum"+ edit2);
                                edt2.setText(String.valueOf(edit2));

                            }
                        });
                        break;

                    case ("XRP"):
                        buttonConvert.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                double edit1 = Double.valueOf(edt1.getText().toString());
                                final double edit2 = edit1 * Double.parseDouble(pricecoin[position]);
                                edt2.setText(String.valueOf(edit2));

                            }
                        });
                        break;

                    case ("BCH"):
                        buttonConvert.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                double edit1 = Double.valueOf(edt1.getText().toString());
                                final double edit2 = edit1 * Double.parseDouble(pricecoin[position]);
                                edt2.setText(String.valueOf(edit2));

                            }
                        });
                        break;

                    case ("EOS"):
                        buttonConvert.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                double edit1 = Double.valueOf(edt1.getText().toString());
                                final double edit2 = edit1 * Double.parseDouble(pricecoin[position]);
                                edt2.setText(String.valueOf(edit2));

                            }
                        });
                        break;

                    case ("XLM"):
                        buttonConvert.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                double edit1 = Double.valueOf(edt1.getText().toString());
                                final double edit2 = edit1 * Double.parseDouble(pricecoin[position]);
                                edt2.setText(String.valueOf(edit2));

                            }
                        });
                        break;

                    case ("LTC"):
                        buttonConvert.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                double edit1 = Double.valueOf(edt1.getText().toString());
                                final double edit2 = edit1 * Double.parseDouble(pricecoin[position]);
                                edt2.setText(String.valueOf(edit2));

                            }
                        });
                        break;

                    case ("ADA"):
                        buttonConvert.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                double edit1 = Double.valueOf(edt1.getText().toString());
                                final double edit2 = edit1 * Double.parseDouble(pricecoin[position]);
                                edt2.setText(String.valueOf(edit2));

                            }
                        });
                        break;

                    case ("USDT"):
                        buttonConvert.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                double edit1 = Double.valueOf(edt1.getText().toString());
                                final double edit2 = edit1 * Double.parseDouble(pricecoin[position]);
                                edt2.setText(String.valueOf(edit2));

                            }
                        });
                        break;

                    case ("XMR"):
                        buttonConvert.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                double edit1 = Double.valueOf(edt1.getText().toString());
                                final double edit2 = edit1 * Double.parseDouble(pricecoin[position]);
                                edt2.setText(String.valueOf(edit2));

                            }
                        });
                        break;

                }

            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
