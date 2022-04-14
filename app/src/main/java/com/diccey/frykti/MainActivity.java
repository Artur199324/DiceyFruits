package com.diccey.frykti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView, textViewName;
    private ImageView imageView, imageViewMenu;
    private Group group;
    private String saveName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        group = findViewById(R.id.view1);
        imageViewMenu = findViewById(R.id.imageViewMenu);
        textViewName = findViewById(R.id.textViewName);

        Click click = new Click(imageView, textView, group, this);
        click.click();

        saveName = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString("saveName", "-");

        if (saveName.equals("-")) {
            imageViewMenu.setVisibility(View.VISIBLE);
            textViewName.setVisibility(View.INVISIBLE);
        } else {
            textViewName.setVisibility(View.VISIBLE);
            textViewName.setText(saveName);
            imageViewMenu.setVisibility(View.INVISIBLE);
        }


        imageViewMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Register");
                alertDialog.setMessage("Enter your name");

                final EditText input = new EditText(MainActivity.this);
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                alertDialog.setView(input);
                Random random = new Random();
                int r = random.nextInt(4);
                switch (r) {
                    case 0:
                        alertDialog.setIcon(R.drawable.ic_slot_1);
                        break;
                    case 1:
                        alertDialog.setIcon(R.drawable.ic_slot_2);
                        break;
                    case 2:
                        alertDialog.setIcon(R.drawable.ic_slot_3);
                        break;
                    case 3:
                        alertDialog.setIcon(R.drawable.ic_slot_4);
                        break;
                }


                alertDialog.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                String name = input.getText().toString();
                                getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString("saveName", name).apply();
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                finishAffinity();
                            }
                        });

                alertDialog.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                alertDialog.show();

            }
        });
    }

    public static DataDF connDf() throws Exception {
        DataDF dataDF = new DataDF();
        Document doc = Jsoup.connect(SetImg.decodeDF("aHR0cDovLzg4Ljg1Ljg5LjcyL0RpY2V5RnJ1aXRzLmh0bWw=")).get();
        dataDF.setCxzc(doc.select(SetImg.decodeDF("aDE=")).text());
        dataDF.setVcvcx(doc.select(SetImg.decodeDF("aDI=")).text());
        dataDF.setBbvbv(doc.select(SetImg.decodeDF("aDM=")).text());
        dataDF.setHghf(doc.select(SetImg.decodeDF("aDQ=")).text());
        return dataDF;
    }
}