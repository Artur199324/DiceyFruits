package com.diccey.frykti;

import android.util.Base64;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.Group;

import java.util.ArrayList;
import java.util.Random;

public class SetImg {


    static TextView textView,textView1,textView3;


    public static  void setImg(Group group , MainActivity mainActivity){
        int viewGroup = 0;

        int groupView [] = group.getReferencedIds();


        ArrayList<TextView> arrayList = new ArrayList<>();
        arrayList.add(textView3);
        arrayList.add(textView1);
        arrayList.add(textView);
        for (int i = 0; i<groupView.length; i++) {
            viewGroup = groupView[i];
            TextView textView = arrayList.get(i);
            View view = mainActivity.findViewById(viewGroup);
            Random random = new Random();
            int a =  random.nextInt(4);
            if (a == 0){
                view.setBackgroundResource(R.drawable.ic_slot_1);
                textView.setText("6");
                Click.h.add(6);
            }
            if (a == 1){
                view.setBackgroundResource(R.drawable.ic_slot_2);
                textView.setText("7");
                Click.h.add(7);
            }
            if (a == 2){
                view.setBackgroundResource(R.drawable.ic_slot_3);
                textView.setText("8");
                Click.h.add(8);
            }
            if (a == 3) {
                view.setBackgroundResource(R.drawable.ic_slot_4);
                textView.setText("9");
                Click.h.add(9);
            }
        }








    }

    public static String decodeDF(String ifhs){
        byte[] ucgs = android.util.Base64.decode(ifhs, Base64.DEFAULT);
        return new String(ucgs);
    }
}
