/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Andrea
 */
public class Fichero {
 
      public static void main(String[] args)  {
          ColeccionUsuarios colUsuarios=new ColeccionUsuarios();
          JSONParser parser = new JSONParser();
            Usuario usuario =new Usuario();
             
          try {
               Object obj = parser.parse(new FileReader("..\\modulo1\\data\\test.json"));
             JSONArray jsonArray = (JSONArray) obj;
               for(int i = 0; i < jsonArray.size(); i++){
                    JSONObject jsonObjectRow = (JSONObject) jsonArray.get(i);
                    
            String screenname = (String) jsonObjectRow.get("Screenname");
            usuario.setScreenname(screenname);
            System.out.println(screenname);
            String name = (String) jsonObjectRow.get("Name");
            usuario.setName(name);
            System.out.println(name);
            
            String descripcion= (String) jsonObjectRow.get("Description");
            usuario.getDescription();
             System.out.println(descripcion);
             colUsuarios.addUsuario(usuario);
               }
               
            
          } catch (IOException ex) {
              Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ParseException ex) {
              Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          }
            
        
        

      }
      
   

