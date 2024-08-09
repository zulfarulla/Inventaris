/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.main.java.com.Apps.Controller.ControlGradientJPanel;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author ZRF
 */
public class JPanelGradient extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int hight = getHeight();
        
        Color color1 = new Color(98, 42, 15);
        Color color2 = new Color(124, 71, 0);
        GradientPaint gp = new GradientPaint(0,0,color1,180,hight,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, hight);
    }
    
}
