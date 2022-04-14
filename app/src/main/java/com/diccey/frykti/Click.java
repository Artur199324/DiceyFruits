package com.diccey.frykti;

import static com.diccey.frykti.AppliDF.zzzxz;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.constraintlayout.widget.Group;

import java.util.ArrayList;

public class Click {

    private ImageView udga;
    private TextView hsad;
    private Group hhsaq;
    private MainActivity mainActivity;
    public static ArrayList<Integer> h;

    public Click(ImageView imageView, TextView textView, Group group, MainActivity mainActivity) {
        this.udga = imageView;
        this.hsad = textView;
        this.hhsaq = group;
        this.mainActivity = mainActivity;
    }

    public void click(){

        udga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        h =new ArrayList<>();
                        for (int i = 0; i < 30; i++) {

                            hsad.post(new Runnable() {
                                @Override
                                public void run() {

                                    SetImg.setImg(hhsaq,mainActivity);
                                }

                            });

                            try {
                                Thread.sleep(10);


                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mainActivity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast toast;
                                if (h.get(0) == h.get(1)|| h.get(2) == h.get(0)){
                                    toast = Toast.makeText(mainActivity.getApplicationContext(), "you won", Toast.LENGTH_SHORT);
                                }else {
                                    toast = Toast.makeText(mainActivity.getApplicationContext(), "you lost", Toast.LENGTH_SHORT);
                                }
                                toast.show();
                            }
                        });
                    }
                },11);

            }
        });

    }

    public static boolean iush(Context context) {
        String asxa = context.CONNECTIVITY_SERVICE;
        ConnectivityManager vcz = (ConnectivityManager) context.getSystemService(asxa);
        if (vcz.getActiveNetworkInfo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public static DF df;
    private static String ifhs;
    private static String nhsgs;
    private static String nchs;
    private static String nhgx;
    private static String bgxf;
    private static String bgdz;

    public static String parserDF(String hyzf){

        String[] nxzv = hyzf.split("_");

        try {
            ifhs = nxzv[0];
        } catch (Exception e) {

            ifhs = "";
        }
        try {
            nhsgs = nxzv[1];
        } catch (Exception e) {

            nhsgs = "";
        }
        try {
            nchs = nxzv[2];
        } catch (Exception e) {
            nchs = "";

        }
        try {
            nhgx = nxzv[3];
        } catch (Exception e) {
            nhgx = "";

        }
        try {
            bgxf = nxzv[4];
        } catch (Exception e) {
            bgxf = "";
            ;
        }
        try {
            bgdz = nxzv[5];
        } catch (Exception e) {
            bgdz = "";

        }

        return SetImg.decodeDF("P21lZGlhX3NvdXJjZT0=") + AppliDF.vvvvcv +
                SetImg.decodeDF("JnN1YjE9") + ifhs +
                SetImg.decodeDF("JnN1YjI9") + nhsgs +
                SetImg.decodeDF("JnN1YjM9") + nchs +
                SetImg.decodeDF("JnN1YjQ9") + nhgx +
                SetImg.decodeDF("JnN1YjU9") + bgxf +
                SetImg.decodeDF("JnN1YjY9") + bgdz +
                SetImg.decodeDF("JmNhbXBhaWduPQ==") + AppliDF.aasas +
                SetImg.decodeDF("Jmdvb2dsZV9hZGlkPQ==") + AppliDF.nhcfs +
                SetImg.decodeDF("JmFmX3VzZXJpZD0=") + AppliDF.ubsj +
                SetImg.decodeDF("JmFmX2NoYW5uZWw9") + AppliDF.bbbvbv +
                SetImg.decodeDF("JmRldl9rZXk9") + SetImg.decodeDF(zzzxz) +
                SetImg.decodeDF("JmJ1bmRsZT0=") + df.getPackageName() +
                SetImg.decodeDF("JmZiX2FwcF9pZD0=") + DF.dataDF.getHghf() +
                SetImg.decodeDF("JmZiX2F0PQ==") + DF.dataDF.getBbvbv();

    }
}
