package com.rd.family;

public class Woman extends Person{
    private String partnerLastName;
    private String maidenName;
    public Woman (String firstName,String lastName,Integer age,String partner,String profession,String partnerLastName,String maidenName){
        super(firstName,lastName,age,partner,profession);
    }

    public String getPartnerLastName() {
        return partnerLastName;
    }


    @Override
    public String getMaidenName() {
        return maidenName;
    }


    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;

    }

    public void setPartnerLastName(String partnerLastName) {
        this.partnerLastName = partnerLastName;

    }

    @Override
    public boolean isRetired() {
        return getAge() >= 60;
    }


}
