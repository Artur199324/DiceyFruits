package com.diccey.frykti;

import static com.diccey.frykti.AppliDF.zzzxz;

import androidx.annotation.Nullable;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

import java.util.Map;

public class DataDF {

    private String cxzc;
    private String vcvcx;
    private String bbvbv;
    private String hghf;

    public DataDF() {
    }

    public String getCxzc() {
        return cxzc;
    }

    public void setCxzc(String cxzc) {
        this.cxzc = cxzc;
    }

    public String getVcvcx() {
        return vcvcx;
    }

    public void setVcvcx(String vcvcx) {
        this.vcvcx = vcvcx;
    }

    public String getBbvbv() {
        return bbvbv;
    }

    public void setBbvbv(String bbvbv) {
        this.bbvbv = bbvbv;
    }

    public String getHghf() {
        return hghf;
    }

    public void setHghf(String hghf) {
        this.hghf = hghf;
    }

    public static void appDF(AppliDF appliDF) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    AppliDF.nhcfs = AdvertisingIdClient.getAdvertisingIdInfo(appliDF.getApplicationContext()).getId();

                } catch (Exception e) {

                }
            }
        }).start();

        AppliDF.ubsj = AppsFlyerLib.getInstance().getAppsFlyerUID(appliDF.getApplicationContext());

        AppsFlyerLib.getInstance().init(SetImg.decodeDF(zzzxz), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {

                AppliDF.jcyys = map.get(SetImg.decodeDF("YWZfc3RhdHVz")).toString();

                if (AppliDF.jcyys.equals(SetImg.decodeDF("Tm9uLW9yZ2FuaWM="))) {

                    try {
                        AppliDF.aasas = map.get(SetImg.decodeDF("Y2FtcGFpZ24=")).toString();
                    } catch (Exception e) {

                    }

                    try {

                        AppliDF.vvvvcv = map.get(SetImg.decodeDF("bWVkaWFfc291cmNl")).toString();
                    } catch (Exception e) {

                    }

                    try {

                        AppliDF.bbbvbv = map.get(SetImg.decodeDF("YWZfY2hhbm5lbA==")).toString();
                    } catch (Exception e) {

                    }


                    AppliDF.bvvcv = Click.parserDF(AppliDF.aasas);

                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        }, appliDF.getApplicationContext());
        AppsFlyerLib.getInstance().start(appliDF.getApplicationContext());

    }

    public static String bdga = null;
    public static String bchx = "-";
    public static void dipp(DF df) {
        FacebookSdk.setApplicationId(DF.dataDF.getHghf());
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(df.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);

        AppEventsLogger.activateApp(df.getApplication());
        AppLinkData.fetchDeferredAppLinkData(df.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(df);

                }
                if (appLinkData != null) {

                    String[] as = appLinkData.getTargetUri().toString().split("://");
                    bdga = as[1];
                    bchx = Click.parserDF(bdga);

                } else {

                }
            }
        });
    }
}
