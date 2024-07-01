package com.multi.ex02.list;

// 은행정보 (계좌 잔액 포함됨!!)
public class Member {
    private String id;
    private String name;
    private int age;
    private double account; // 계좌 잔액

    public Member() {}

    public Member(String id, String name, int age, double account) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Member{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", account=").append(account);
        sb.append('}');
        return sb.toString();
    }
}