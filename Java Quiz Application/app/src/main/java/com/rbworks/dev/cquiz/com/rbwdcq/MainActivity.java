package com.rbworks.dev.cquiz.com.rbwdcq;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    CardView quiz, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quiz = (CardView) findViewById(R.id.mainquiz);
        about = (CardView) findViewById(R.id.mainabout);

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {

                    Intent i = new Intent(MainActivity.this, QuizActivity.class);
                    startActivity(i);
                }
            }

        });


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {

                    Intent i = new Intent(MainActivity.this, MainAbout.class);
                    startActivity(i);
                }
            }

        });

    }

    @Override
    public void onBackPressed() {

        AlertDialog alertDialog = new AlertDialog.Builder(this).setTitle("Exit ?").setMessage("Are you sure want to Exit ?")
                .setPositiveButton("Yes ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        finish();
                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setNeutralButton("Rate App", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id="+ getApplicationContext().getPackageName()+"&hl=en")));

                    }
                })
                .show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == R.id.action_about) {

            startActivity(new Intent(this, MainAbout.class));


        }
        if (i == R.id.action_rate) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id="+ getApplicationContext().getPackageName()+"&hl=en")));
        } else {
            return super.onOptionsItemSelected(item);

        }



        return true;
    }
}









