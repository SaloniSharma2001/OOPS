package com.prep2;

public class SchoolChild extends School{

    String directorName;
    String principalName;
   SchoolChild(){
       super();
   }
    SchoolChild(String sName, int sCode, String address, String directorName,String principalName){
       super(sName, sCode, address);
        this.directorName = directorName;
        this.principalName = principalName;
    }

//    SchoolChild(String directorName,String principalName){
//        super(super.sName, super.sCode, super.address);
//        this.directorName = directorName;
//        this.principalName = principalName;
//    }


}
