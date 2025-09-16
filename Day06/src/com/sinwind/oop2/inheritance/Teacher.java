package com.sinwind.oop2.inheritance;

public class Teacher extends People {
    private String skill;

    public Teacher()
    {
        super();
    }
    public Teacher(String name, int age, char sex, String skill) {
        super(name, age, sex);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sex=" + getSex() +
                ", skill='" + skill + '\'' +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println("name:" + getName() + ", age:" + getAge() + ", sex:" + getSex() + ", skill:" + skill);
    }
}
