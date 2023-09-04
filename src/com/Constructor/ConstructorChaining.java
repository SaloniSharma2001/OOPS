package com.Constructor;

public class ConstructorChaining {
    //Calling constructor from other constructor
    int x;
    int y;
    int z;
    public ConstructorChaining(){
    }
//    public ConstructorChaining(int x){
//        this(x,y);
//        //this.x = x;
//    }
//    public ConstructorChaining(int x, int y){
//        this(x);
//        //this.y = y;
//    }
//    public ConstructorChaining(int x, int y, int z){
//        this(x,y);
//        //this.z = z;
//    }

    @Override
    public String toString() {
        return "ConstructorChaining{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
