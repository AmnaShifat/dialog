package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;
        button = (Button)findViewById(R.id.button_p);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

    public void showd(View view)
    {
        AlertDialog.Builder bul = new AlertDialog.Builder(MainActivity.this);
        bul.setTitle("DIALOG");
        bul.setMessage("it is a message");
        bul.setCancelable(false);
        bul.setPositiveButton("Positive Button",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int asdf)
                    {
                        finish();
                    }
                });
        bul.setNegativeButton(
                "Negative Button",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = bul.create();
        alertDialog.show();
    }
}

)
}