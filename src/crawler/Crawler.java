/*===================================================================*/
/*======================== Proyecto Crawler =========================*/
/*======================= Estructura De Datos =======================*/
/*=================== Alejandro Hernandez Paredes ===================*/
/*============================ 201740063 ============================*/
/*===================================================================*/

package crawler;
import java.io.*;

public class Crawler {

    public static void main(String[] args) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br;
        
        try{
            archivo = new File ("C:\\AW\\html\\PRACTICAS HTML\\");
                                    
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            
            String linea;
            while((linea=br.readLine())!=null) {
                
                if(linea.contains("href")){
                    int b=0,i=0;
                    String url = "";
                    
                    while(b!=2){
                        if(linea.charAt(i) == '\"' ){ //Busqueda de Comillas para Delimitar inicio y fin del Url
                            b++;
                        }
                        
                        if(b<2 && b>0){
                            url= url + linea.charAt(i);
                        }
                        
                        i++;
                    }
                    
                    url= url + "\"";
                    System.out.println("El url es: "+url);   
                    
                }
                    
            }
            
        }catch(IOException e){
            
        }
    }
    
}

  