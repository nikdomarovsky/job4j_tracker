package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;
    public Error(){
    }
    public Error(boolean active,int status,String message){
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true,404,"Not found");
        error1.printInfo();
        Error error2 = new Error(false, 200, "OK");
        error2.printInfo();
        Error error3 = new Error(true, 500, "Internal Server Error");
        error3.printInfo();
    }
    public void printInfo(){
        System.out.println("Активная ошибка: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }
}
