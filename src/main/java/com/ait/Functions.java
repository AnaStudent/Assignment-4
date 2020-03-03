package com.ait;

public class Functions {
    /*
    1. make fields privtae
    2. create getters & setters
     */
    private String studID;
    private String name;
    private String institute;
    private int year;

    public Functions() {
    }

    public Functions(String studID, String name, String institute, int year) {
        this.studID = studID;
        this.name = name;
        this.institute = institute;
        this.year = year;
    }

    public String getStudID() {
        return studID;
    }

    public String getName() {
        return name;
    }

    public String getInstitute() {
        return institute;
    }

    public int getYear() {
        return year;
    }


    public void setStudID (String studID){
        this.studID = studID;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setInstitute (String institute){
        this.institute = institute;
    }

    public void setYear ( int year){
        this.year = year;
    }

    public int addition(int num1, int num2){
        int ans = num1 + num2;
        //System.out.println("The answer is: " );
        return ans;
    }
}
