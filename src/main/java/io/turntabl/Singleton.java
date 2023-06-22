package io.turntabl;


//Qn 4
//Create a singleton class that follows the singleton design pattern
class Singleton {
    private static Singleton singletonObject;

    //declaring a private constructor to prevent creating an instance of the Database object
    private Singleton() {}

    //a method to get a single instance of the Database object
    public static Singleton getInstance(){
        if(singletonObject == null){
            singletonObject = new Singleton();
        }
        return singletonObject;
    }

    public void getDatabaseConnection(){
        System.out.println("You have successfully created a singleton class");
    }
}
