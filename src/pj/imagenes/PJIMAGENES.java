package pj.imagenes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import static javax.imageio.ImageIO.read;

public class PJIMAGENES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int ancho = 800;                                                        //ANCHO DE LA IMAGEN CREADA
        int alto = 400;                                                         //ALTO DE LA IMAGEN CREADA
        
                                                   //RECURSO VACIO POR SI MAS ADELANTE NOS INTERESA
        BufferedImage imagencacheada = new BufferedImage(ancho,alto,BufferedImage.TYPE_INT_RGB); //CREO LA IMAGEN CON LOS DATOS DECLARADOS ANTES
        Graphics2D graficos = imagencacheada.createGraphics();                  //DIGO QUE DENTRO DE LA IMAGEN VOY A PINTAR COSAS
        /////////////PUEDES PINTAR////////////////////////////
        graficos.setColor(Color.white);                                         //SE ESTABLECE LA IMAGEN DE COLOR BLANCO
        graficos.fillRect(0,0,ancho,alto);                                      //SE ESTABLECE LAS MEDIDAS DE LA IMAGEN QUE TENDRA EL COLOR BLANCO    
              
        graficos.setColor(Color.PINK);                                          //DIGO QUE LO PINTARE CON COLOR ROJO
        graficos.fillRect(20, 20, 350, 350);                                    //PINTO UN RECTAGUNLO
        
        graficos.setColor(Color.black);                                         //DIGO EL COLOR DE LO PRIXIMO QUE SE DIBUJARA
        graficos.drawString("PROGRAMA GEYDI",250,320);                          //INCLUYO UN TEXTO EN LA IMAGEN    
         
        BufferedImage imagen = null;  
        imagen = ImageIO.read(new File("D:\\GEYDI\\CURSOS\\FORMACION PROFESIONAL\\PROGRAMACION\\logos\\logos\\java-1.png"));                                              
        graficos.drawImage(imagen,30,30,100,100, null); 
        /////////////PUEDES PINTAR////////////////////////////
        graficos.dispose();                                                     //LIBERO EL RECURSO    
        
        File archivo = new File ("primeraprueba.png");                          //APUNTO A UN NUEVO ARCHIVO
        ImageIO.write(imagencacheada, "png", archivo);                          //CON LA LIBRERIA CORRESPONDIENTE, GUARDO EL PNG EN ESE ARCHIVO
        
        
        
                
    }
    
}
