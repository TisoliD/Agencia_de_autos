package Objects;

public class Usuario {
    private String tag;
    private String pass;
    private String dni;
    private String name;
    private int level;

    public String getTag(){
        return this.tag;
    }
    public String getPass(){
        return this.pass;
    }
    public String getDni(){
        return this.dni;
    }
    public String getName(){
        return this.name;
    }
    public int getLevel(){
        return this.level;
    }

    public Usuario(String tag , String pass, String name, String dni , int level){
        this.tag = tag;
        this.pass = pass;
        this.name = name;
        this.dni = dni;
        this.level = level;

    }
    public String toString(){
        return "Tag: " + this.tag + "\t" + "Nombre: " + this.name + "\t" + "Password: " + this.pass +  "\t" + "Dni: " + this.dni +  "\t" + "Nivel: " + this.level;
    }
    
}
