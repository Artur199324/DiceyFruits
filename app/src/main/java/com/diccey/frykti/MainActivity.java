package com.diccey.frykti;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView, textViewName;
    private ImageView imageView, imageViewMenu;
    private Group group;
    private String saveName;
    ImageView imageViewIcon;
    static Bitmap bitmap = null;
    String name = null;
    ImageView imageViewinput;
    static final int GALLERY_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        group = findViewById(R.id.view1);
        imageViewMenu = findViewById(R.id.imageViewMenu);
        textViewName = findViewById(R.id.textViewName);
        SetImg.textView = findViewById(R.id.textView5);
        SetImg.textView1 = findViewById(R.id.textView6);
        SetImg.textView3 = findViewById(R.id.textView7);

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


                LayoutInflater li = LayoutInflater.from(MainActivity.this);
                View promptsView = li.inflate(R.layout.dialog, null);
                EditText input = (EditText)
                        promptsView.findViewById(R.id.input);
                 imageViewinput = promptsView.findViewById(R.id.imageViewinput);



                input.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        name = editable.toString();
                    }
                });



                final AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .setView(promptsView)
                        .setTitle("Register")
                        .setMessage("Enter your name")
                        .setPositiveButton(android.R.string.ok, null) //Set to null. We override the onclick
                        .setNegativeButton(android.R.string.cancel, null)
                        .create();
                Random random = new Random();
                int r = random.nextInt(4);
                switch (r) {
                    case 0:
                        dialog.setIcon(R.drawable.ic_slot_1);
                        break;
                    case 1:
                        dialog.setIcon(R.drawable.ic_slot_2);
                        break;
                    case 2:
                        dialog.setIcon(R.drawable.ic_slot_3);
                        break;
                    case 3:
                        dialog.setIcon(R.drawable.ic_slot_4);
                        break;
                }

                imageViewinput.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                        photoPickerIntent.setType("image/*");
                        startActivityForResult(photoPickerIntent, GALLERY_REQUEST);
                    }
                });
                dialog.setOnShowListener(new DialogInterface.OnShowListener() {

                    @Override
                    public void onShow(DialogInterface dialogInterface) {

                        Button button = ((AlertDialog) dialog).getButton(AlertDialog.BUTTON_POSITIVE);
                        button.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                Log.d("weq", name + "");
                                if (name != null) {
                                    getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString("saveName", name).apply();
                                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                    finishAffinity();
                                    dialog.dismiss();

                                } else {
                                    Toast toast = Toast.makeText(getApplicationContext(), "Enter your name", Toast.LENGTH_SHORT);
                                    toast.show();
                                }
                            }
                        });
                    }
                });
                dialog.show();
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);



        switch(requestCode) {
            case GALLERY_REQUEST:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = data.getData();
                    Log.d("weq",selectedImage.toString());
                    getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString("saveImg", selectedImage.toString()).apply();
                    try {
                        bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), selectedImage);
                        imageViewinput.setImageBitmap(bitmap);


                    } catch (IOException e) {
                        e.printStackTrace();
                    }



                }
        }
    }
}