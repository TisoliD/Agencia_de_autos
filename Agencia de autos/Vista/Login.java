package Vista;

import java.util.Scanner;

public class Login{
    private Scanner entry;
    private String tag;
    private String pass;

    public String getTag(){
        return this.tag;
    }

    public String getPass(){
        return this.pass;
    }

    public void show(){
        System.out.print("Usuario: ");
        tag = entry.nextLine();
        System.out.print("Contrasena: ");
        pass = entry.nextLine();
    }

    public Login(Scanner entry){
        this.entry =  entry;        
    }

    public void setMessage(String message){
        System.out.print(message);
    }
    public void setMessageln(String message){
        System.out.println(message);
    }
}