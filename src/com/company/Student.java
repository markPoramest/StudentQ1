package com.company;

public class Student {
    private int id;
    private String name;
    private boolean sex;
    private float gpa;
    private int room;
    private String[] subject;

    public Student(int id, String name, String sex, float gpa) {
        this.id = id;
        this.name = name;
        if(sex.equals("male"))
            this.sex = true;
        else
            this.sex = false;
        this.gpa = gpa;
        subject = new String[2];
        manageRoom();
    }
    private void manageRoom(){
        if(gpa>=3.5){
            this.room = 1;
            subject[0] = "Science";
            subject[1] = "Math";
        }
        else if(gpa>=3.0){
            this.room = 2;
            subject[0] = "Math";
            subject[1] = "English";
        }
        else{
            this.room = 3;
            subject[0] = "English";
            subject[1] = "Thai";
        }
    }
    public void Exam(int score){
        if(score>=80){
            this.gpa = 4;
        }else if(score>=75){
            this.gpa=3.5f;
        }else
            this.gpa = 0;
        manageRoom();
    }
    public void printInfo(){
        System.out.println("ID : "+id + " Name : "+name);
        System.out.println("GPA : "+gpa);
        System.out.println("Room : "+room);
        System.out.println("Subject : "+subject[0]+" "+subject[1]);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public float getGpa() {
        return gpa;
    }

    public int getRoom() {
        return room;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }
}
