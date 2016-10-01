package com.example.syedinkisarahmed.reportcard;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Array Declaration for save resourse id of image
        int[] resource = {R.drawable.a,R.drawable.b,R.drawable.c};
        String[] name ={"Bakhtiyar","Syed Muhammad Bakhtiyar","Muhammad Bakhtiyar"};
        String[] subj ={"Science","Computer Science","Math"};
        int marks[]= {200,450,390};
        int[] roll={420, 124, 9211};

        //variable Declare for iteration
        int i=0;
        while(i<resource.length
            /*this is loop condition*/ ){
            //Creating Object of Class Report
            Report report = new Report(name[i],subj[i],resource[i],marks[i],roll[i]);
            if(i==0) {
                //creating a Image view Object
                ImageView img = (ImageView) findViewById(R.id.img);
                img.setImageResource(report.getrID());


                TextView stdName = (TextView) findViewById(R.id.name);
                stdName.setText(report.getName());

                //create for subject variable we can assign R.id.Subject also in stdName variable
                TextView stdSubj = (TextView) findViewById(R.id.subject);
                stdSubj.setText(report.getSubject());


                TextView stdMarks = (TextView) findViewById(R.id.marks);
                stdMarks.setText(report.getMarks());


                TextView stdPerc = (TextView) findViewById(R.id.perc);
                stdPerc.setText((int)report.getPerc());

                TextView stdRoll = (TextView) findViewById(R.id.roll);
                stdMarks.setText(report.getRoll());

            }else
            if(i==2){
                ImageView img = (ImageView) findViewById(R.id.img1);
                img.setImageResource(report.getrID());


                TextView stdName = (TextView) findViewById(R.id.name1);
                stdName.setText(report.getName());

                //create for subject variable we can assign R.id.Subject also in stdName variable
                TextView stdSubj = (TextView) findViewById(R.id.subject1);
                stdSubj.setText(report.getSubject());


                TextView stdMarks = (TextView) findViewById(R.id.marks1);
                stdMarks.setText(report.getMarks());


                TextView stdPerc = (TextView) findViewById(R.id.perc1);
                stdPerc.setText((int)report.getPerc());

                TextView stdRoll = (TextView) findViewById(R.id.roll1);
                stdMarks.setText(report.getRoll());


            }
            else if(i==2){
                ImageView img = (ImageView) findViewById(R.id.img2);
                img.setImageResource(report.getrID());


                TextView stdName = (TextView) findViewById(R.id.name2);
                stdName.setText(report.getName());

                //create for subject variable we can assign R.id.Subject also in stdName variable
                TextView stdSubj = (TextView) findViewById(R.id.subject2);
                stdSubj.setText(report.getSubject());


                TextView stdMarks = (TextView) findViewById(R.id.marks2);
                stdMarks.setText(report.getMarks());


                TextView stdPerc = (TextView) findViewById(R.id.perc2);
                stdPerc.setText((int)report.getPerc());

                TextView stdRoll = (TextView) findViewById(R.id.roll2);
                stdMarks.setText(report.getRoll());


            }




        i++; // one increment in  i variable
        }




        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.syedinkisarahmed.reportcard/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.syedinkisarahmed.reportcard/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
