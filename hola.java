import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class hola {    
  public static void main(String[] args) throws Exception {

        
        String userName = "foca";
        String contra = "caca";
        usuario foca = new usuario();

        //byte[] contra_codificada = pip.codificar(args[1]);

        if(args.length == 2) {
          foca = new usuario(args[0], args[1]);
        }

        

        System.out.println("Usuario 1 ---- Nombre: " + foca.getUser() + " | Contraseña: " + foca.getPass());
        
 
        System.out.println("\n ******************************************************************************** \n");

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] pass = contra.getBytes();
        md.update(pass);
        byte[] codificado = md.digest(); 

        
 
        boolean res = MessageDigest.isEqual(foca.getPass(), codificado);


        System.out.println("=================== Comprobar si la contraseña es correcta ==================="+"\n");
        System.out.println("Nombre: " + foca.getUser() + " | Contraseña: " + res+"\n");
        
  
}
}

class usuario {

   
  private String user;
  private byte[] pass;

      // Constructor
  public usuario(String user, String p) throws NoSuchAlgorithmException {
        this.user = user;
        this.pass = pip.codificar(p);
  }

  public usuario() {
    this.user = "user";
    this.pass = "".getBytes();;
}
  
  public String getUser(){
    return user;
  }

  public byte[] getPass(){
    return pass;
  }

  public void setUser(String user){
    this.user = user;
  }

  public void setPass(byte[] pass) {
    this.pass = pass;
  }

}
