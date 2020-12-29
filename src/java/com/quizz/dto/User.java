
package com.quizz.dto;

public class User
{
    private int uid;
    private String name;
    private String mail;
    private String pass;
    private String phone;
    private int type;
    private int knowledge;
    private int otp;
    private int isVerified;

    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPass() {
        return pass;
    }

    public String getPhone() {
        return phone;
    }

    public int getType() {
        System.out.println("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii"+type);
        return type;
    }

    public int getKnowledge() {
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr"+knowledge);
        return knowledge;
    }

    public int getOtp() {
        return otp;
    }

    public int getIsVerified() {
        return isVerified;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public void setIsVerified(int isVerified) {
        this.isVerified = isVerified;
    }

    @Override
    public String toString() {
        return "User{" + "uid=" + uid + ", name=" + name + ", mail=" + mail + ", pass=" + pass + ", phone=" + phone + ", type=" + type + ", knowledge=" + knowledge + ", otp=" + otp + ", isVerified=" + isVerified + '}';
    }

    public User(String name, String mail, String pass, int type, int knowledge) {
        this.name = name;
        this.mail = mail;
        this.pass = pass;
        this.type = type;
        this.knowledge = knowledge;
    }

    public User(int uid, String name, String mail, String phone, int type, int knowledge, int otp, int isVerified) {
        this.uid = uid;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.type = type;
        this.knowledge = knowledge;
        this.otp = otp;
        this.isVerified = isVerified;
    }
 
    
}
