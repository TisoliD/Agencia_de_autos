package Estructura;

public class EstructuraUsuario{
    private String tag;
    private String pass;
    private String name;
    private int level;
    
    public String getTag(){
        return this.tag;
    }

    public String getPass(){
        return this.pass;
    }

    public String getName(){
        return this.name;
    }

    public int getLevel(){
        return this.level;
    }

    public EstructuraUsuario(String tag, String pass, String name, int level){
        this.tag = tag;
        this.pass = pass;
        this.name = name;
        this.level = level;
    }
    public String toString(){
        return "Tag: " + this.tag + "\t" + "Nombre: " + this.name + "\t" + "Password: " + this.pass +  "\t" + "Nivel: " + this.level;
    }
}