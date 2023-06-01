package com.rd.family;

public class Woman extends Person{
     public Woman (String firstName,String lastName,Integer age,String partner,String profession,String partnerLastName,String maidenName){super(firstName,lastName,age,partner,profession,partnerLastName,maidenName);
    }


//    public void setMaidenName(String maidenName) {
//        this.maidenName = maidenName;
//
//    }
//
//    public void setPartnerLastName(String partnerLastName) {
//        this.partnerLastName = partnerLastName;
//
//    }

    @Override
    public boolean isRetired() {
        return getAge() >= 60;
    }


}
