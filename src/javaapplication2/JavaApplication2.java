/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.applet.Applet;
import java.awt.*;
        
public class JavaApplication2 extends Applet{

    public void init(){
    
    }
    
    public void paint(Graphics g){
        drawHouse(g);
    }
    
    public void drawHouse(Graphics g){
        g.setColor(Color.decode("#62A9F3"));
        g.fillRect(0,0,getWidth(),getHeight());
        //Cuadrado de la casa 
        g.setColor(Color.yellow);
        g.fillRect(100,100,200,200);
        //Dibujando techo
         int x[]={100,200,300};
         int y[]={100,20,100};
         g.setColor(Color.red);
         g.fillPolygon(x,y,3);
        //dibujar ventana
        g.setColor(Color.blue);
        g.fillRect(120,150,40,40);
        //Dibujar puerta 
        g.setColor(Color.gray);
        g.fillRect(180,200,40,100); 
        //Dibujar Sol
        g.setColor(Color.yellow);
        g.fillOval(450, 20, 100, 100);
        //Dibujar Pasto
        g.setColor(Color.green);
        g.fillRect(0, 300, 1000, 100);
        
        g.setColor(Color.white);
        g.fillOval(580, 40, 50, 50);
        g.fillOval(600, 20, 50, 50);
        g.fillOval(620, 20, 50, 50);
        g.fillOval(640, 40, 50, 50);
        g.fillOval(600, 60, 50, 50);
        g.fillOval(620, 60, 50, 50);
      
    }
    
}
