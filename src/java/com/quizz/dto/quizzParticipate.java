package com.quizz.dto;

public class quizzParticipate 
{
    private String pname;
    private String pmail;
    private String pscname;
    private int pknow;

    public quizzParticipate() {
    }
    
     public quizzParticipate(String pname, String pmail, String pscname, int pknow) {
        this.pname = pname;
        this.pmail = pmail;
        this.pscname = pscname;
        this.pknow = pknow;
    }

    public String getPname() {
        return pname;
    }

    public String getPmail() {
        return pmail;
    }

    public String getPscname() {
        return pscname;
    }

    public int getPknow()
    {
        return pknow;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPmail(String pmail) {
        this.pmail = pmail;
    }

    public void setPscname(String pscname) {
        this.pscname = pscname;
    }

    public void setPknow(int pknow) {
        this.pknow = pknow;
    }

    
   

    
    
}
