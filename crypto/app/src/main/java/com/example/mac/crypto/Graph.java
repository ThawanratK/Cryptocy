package com.example.mac.crypto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.r0adkll.slidr.Slidr;

public class Graph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        Slidr.attach(this);
        String urlStr;
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            WebView wv = (WebView) findViewById(R.id.graphweb);

            int n = bundle.getInt("num");

            if (n==0){
                    urlStr = "https://s.tradingview.com/widgetembed/?frameElementId=tradingview_684ab&symbol=BITFINEX%3ABTCTHB&interval=60&hidesidetoolbar=1&symboledit=0&saveimage=0&toolbarbg=f1f3f6&studies=[]&theme=Dark&style=1&withdateranges=1&studies_overrides={}&overrides={}&enabled_features=[]&disabled_features=[]&locale=en";
            wv.setWebViewClient(new WebViewClient());
            wv.getSettings().setJavaScriptEnabled(true);
            wv.getSettings().setBuiltInZoomControls(true);
            wv.loadUrl(urlStr);
            }
            else if(n==1){
                urlStr = "https://s.tradingview.com/widgetembed/?frameElementId=tradingview_255b4&symbol=COINBASE%3AETHBTC&interval=60&hidesidetoolbar=1&symboledit=0&saveimage=0&toolbarbg=f1f3f6&studies=%5B%5D&theme=Dark&style=1&withdateranges=1&studies_overrides=%7B%7D&overrides=%7B%7D&enabled_features=%5B%5D&disabled_features=%5B%5D&locale=en";
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setBuiltInZoomControls(true);
                wv.loadUrl(urlStr);
            }
            else if(n==2){
                urlStr = "https://s.tradingview.com/widgetembed/?frameElementId=tradingview_a14b0&symbol=BINANCE%3AXRPBTC&interval=60&hidesidetoolbar=1&symboledit=0&saveimage=0&toolbarbg=f1f3f6&studies=[]&theme=Dark&style=1&withdateranges=1&studies_overrides={}&overrides={}&disabled_features=[]&disabled_features=[]&locale=en";
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setBuiltInZoomControls(true);
                wv.loadUrl(urlStr);
            }
            else if(n==3){
                urlStr = "https://s.tradingview.com/widgetembed/?frameElementId=tradingview_bf2f6&symbol=COINBASE%3ABCHBTC&interval=60&hidesidetoolbar=1&symboledit=0&saveimage=0&toolbarbg=f1f3f6&studies=[]&theme=Dark&style=1&withdateranges=1&studies_overrides={}&overrides={}&enabled_features=[]&disabled_features=[]&locale=en";
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setBuiltInZoomControls(true);
                wv.loadUrl(urlStr);
            }
            else if(n==4){
                urlStr = "https://s.tradingview.com/widgetembed/?frameElementId=tradingview_d47df&symbol=BINANCE%3AEOSBTC&interval=60&hidesidetoolbar=1&symboledit=0&saveimage=0&toolbarbg=f1f3f6&studies=[]&theme=Dark&style=1&withdateranges=1&studies_overrides={}&overrides={}&enabled_features=[]&disabled_features=[]&locale=en";
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setBuiltInZoomControls(true);
                wv.loadUrl(urlStr);
            }
            else if(n==5){
                urlStr = "https://s.tradingview.com/widgetembed/?frameElementId=tradingview_b349b&symbol=BINANCE%3AXLMBTC&interval=60&hidesidetoolbar=1&symboledit=0&saveimage=0&toolbarbg=f1f3f6&studies=[]&theme=Dark&style=1&withdateranges=1&studies_overrides={}&overrides={}&enabled_features=[]&disabled_features=[]&locale=en";
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setBuiltInZoomControls(true);
                wv.loadUrl(urlStr);
            }
            else if(n==6){
                urlStr = "https://s.tradingview.com/widgetembed/?frameElementId=tradingview_9f7d1&symbol=BINANCE%3ALTCBTC&interval=60&hidesidetoolbar=1&symboledit=0&saveimage=0&toolbarbg=f1f3f6&studies=[]&theme=Dark&style=1&withdateranges=1&studies_overrides={}&overrides={}&enabled_features=[]&disabled_features=[]&locale=en";
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setBuiltInZoomControls(true);
                wv.loadUrl(urlStr);
            }
            else if(n==7){
                urlStr = "https://s.tradingview.com/widgetembed/?frameElementId=tradingview_a6993&symbol=BINANCE%3AADABTC&interval=60&hidesidetoolbar=1&symboledit=0&saveimage=0&toolbarbg=f1f3f6&studies=[]&theme=Dark&style=1&withdateranges=1&studies_overrides={}&overrides={}&enabled_features=[]&disabled_features=[]&locale=en";
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setBuiltInZoomControls(true);
                wv.loadUrl(urlStr);
            }
            else if(n==8){
                urlStr = "https://s.tradingview.com/widgetembed/?frameElementId=tradingview_050fd&symbol=BINANCE%3AXMRBTC&interval=60&hidesidetoolbar=1&symboledit=0&saveimage=0&toolbarbg=f1f3f6&studies=[]&theme=Dark&style=1&withdateranges=1&studies_overrides={}&overrides={}&enabled_features=[]&disabled_features=[]&locale=en";

                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setBuiltInZoomControls(true);
                wv.loadUrl(urlStr);
            }
            else if(n==9){
                urlStr = "https://s.tradingview.com/widgetembed/?frameElementId=tradingview_8b984&symbol=POLONIEX%3AUSDTBTC&interval=60&hidesidetoolbar=1&symboledit=0&saveimage=0&toolbarbg=f1f3f6&studies=[]&theme=Dark&style=1&withdateranges=1&studies_overrides={}&overrides={}&enabled_features=[]&disabled_features=[]&locale=en";
                wv.setWebViewClient(new WebViewClient());
                wv.getSettings().setJavaScriptEnabled(true);
                wv.getSettings().setBuiltInZoomControls(true);
                wv.loadUrl(urlStr);
            }


        }
    }
}
