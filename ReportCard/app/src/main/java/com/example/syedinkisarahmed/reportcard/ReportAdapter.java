package com.example.syedinkisarahmed.reportcard;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Syed Inkisar Ahmed on 9/30/2016.
 */
public class ReportAdapter extends ArrayAdapter<Report> {
    public ReportAdapter(Context c, ArrayList<Report> r){
        super(c,0,r);
    }

/*    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView ;
        if(v==null){
            v= LayoutInflater.from(getContext()).inflate(R.layout.activity_repo,parent,false) ;
        }
        Report currentWord = getItem(position);


        TextView name = (TextView) v.findViewById(R.id.name);
        name.setText(currentWord.getName());


        TextView sub = (TextView) v.findViewById(R.id.subject);
        sub.setText(currentWord.getSubject());


        TextView mark = (TextView) v.findViewById(R.id.marks);
        mark.setText(currentWord.getMarks()+"/100");


        TextView per = (TextView) v.findViewById(R.id.perc);
        per.setText((int)currentWord.getPerc());


        ImageView img = (ImageView) v.findViewById(R.id.img);
        img.setImageResource(currentWord.getrID());


        TextView roll = (TextView) v.findViewById(R.id.roll);
        roll.setText(currentWord.getRoll());
        return v;
    }*/
}
