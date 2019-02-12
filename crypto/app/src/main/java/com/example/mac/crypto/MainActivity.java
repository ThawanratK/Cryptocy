package com.example.mac.crypto;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;


import com.google.gson.Gson;
import com.android.volley.toolbox.Volley;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private static final String TAG = "myapp";

    public static final String REQUEST_TAG = "myrequest";
    private RequestQueue mQueue;
    ProgressDialog pDialog;
    private ArrayList<DataModel> datas= new ArrayList<>();
    private String[] ncoin=new String[10];
    private String[] pscoin=new String[ncoin.length];
    int[] coinpic={
            R.drawable.btc,
            R.drawable.eth,
            R.drawable.xrp,
            R.drawable.bch,
            R.drawable.xlm,
            R.drawable.eos,
            R.drawable.ltc,
            R.drawable.ada,
            R.drawable.xmr,
            R.drawable.usdt,
    };

    Button btnexchange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnexchange=(Button)findViewById(R.id.exchange);
        btnexchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn=new Intent(MainActivity.this, Exchange.class);
                itn.putExtra("namecoin",ncoin);
                itn.putExtra("pricecoin",pscoin);
                startActivity(itn);

                overridePendingTransition(R.anim.slideright,R.anim.slideleftout);
            }
        });
        String url = "https://api.coinmarketcap.com/v1/ticker/?convert=THB&limit=10";
        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading..");
        pDialog.show();
        JsonArrayRequest jsRequest = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Gson gson = new Gson();
                        JSONObject jsObj=null;

                        for (int i = 0; i <10; i++) {

                            try {
                                jsObj = response.getJSONObject(i);

                                DataModel dataitem = gson.fromJson(String.valueOf(jsObj), DataModel.class);
                                datas.add(dataitem);

                                pscoin[i]= dataitem.getPrice();
                                ncoin[i]=dataitem.getSymbol();


                                Log.d(TAG, "gson" + dataitem.getId());


                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        if(datas.size() > 0){
                            displayListview();
                        }
                        pDialog.hide();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d(TAG,error.toString());
                        pDialog.hide();
                    }
                });// stringRequest

        mQueue = Volley.newRequestQueue(this);
        jsRequest.setTag(REQUEST_TAG);
        mQueue.add(jsRequest);

    }
    public void displayListview() {
        MyAdapter adapter = new MyAdapter(this, datas,coinpic);
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setOnItemClickListener(this);
        lv.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Intent i=new Intent(MainActivity.this, Graph.class);
        i.putExtra("num",position);
        startActivity(i);


    }
}




