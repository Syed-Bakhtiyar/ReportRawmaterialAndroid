package com.example.syedinkisarahmed.reportcard;

/**
 * Created by Syed Inkisar Ahmed on 9/30/2016.
 */
public class Report {
    private String name;
    private String subject;
    private int rID;
    private float perc;
    private int marks;
    private int totalmarks = 500;
    private int roll;
    public Report(String name, String subj,int id, int marks,int roll){
        this.name=name;
        this.subject =subj;
        this.rID=id;
        this.roll=roll;
        this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getrID() {
        return rID;
    }

    public float getPerc()
    {
        perc = marks/totalmarks*100;
        return perc;
    }

    public int getMarks() {
        return marks;
    }

    public int getRoll() {
        return roll;
    }
}
