import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException; 

// Clase pública que debe coincidir con el nombre del archivo
public class pip {
    public static byte[] codificar(String p) throws NoSuchAlgorithmException {
         
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] pass = p.getBytes();
            md.update(pass);
            byte[] codificado = md.digest();
            return codificado;
          }
        

    public static boolean comparar(byte[] a, byte[] b){
            boolean res = MessageDigest.isEqual(a, b);
            return res;
          }
          
    
}

