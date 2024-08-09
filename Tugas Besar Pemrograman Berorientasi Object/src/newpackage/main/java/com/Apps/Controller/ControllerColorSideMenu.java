/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.main.java.com.Apps.Controller;

import java.awt.Color;
import newpackage.main.java.com.Apps.View.MainView.mainView;
import org.w3c.dom.css.RGBColor;

/**
 *
 * @author ZRF
 */
public class ControllerColorSideMenu {
    public void mouseMasukDashboard(mainView main){
        main.getjPanel8().setBackground(new Color(0,102,153));
        main.getjPanel7().setBackground(new Color(250,250,250));
    }
    public void mouseKeluarDashboard(mainView main){
        main.getjPanel7().setBackground(Color.white);
        main.getjPanel8().setBackground(Color.white);
    }
    public void mouseMasukBarang(mainView main){
        main.getjPanel13().setBackground(new Color(250,250,250));
        main.getjPanel14().setBackground(new Color(0,102,153));
    }
    public void mouseKeluarBarang(mainView main){
        main.getjPanel14().setBackground(Color.white);
        main.getjPanel13().setBackground(Color.white);
    }
    public void mouseMasukBarangMasuk(mainView main){
        main.getjPanel19().setBackground(new Color(250,250,250));
        main.getjPanel20().setBackground(new Color(0,102,153));
    }
    public void mouseKeluarBarangMasuk(mainView main){
        main.getjPanel20().setBackground(Color.white);
        main.getjPanel19().setBackground(Color.white);
    }
    public void mouseMasukBarangKeluar(mainView main){
        main.getjPanel21().setBackground(new Color(250,250,250));
        main.getjPanel22().setBackground(new Color(0,102,153));
    }
    public void mouseKeluarBarangKeluar(mainView main){
        main.getjPanel22().setBackground(Color.white);
        main.getjPanel21().setBackground(Color.white);
    }
    public void mouseMasukStok(mainView main){
        main.getjPanel23().setBackground(new Color(250,250,250));
        main.getjPanel24().setBackground(new Color(0,102,153));
    }
    public void mouseKeluarStok(mainView main){
        main.getjPanel24().setBackground(Color.white);
        main.getjPanel23().setBackground(Color.white);
    }
    public void mouseMasukSupplier(mainView main){
        main.getjPanel25().setBackground(new Color(250,250,250));
        main.getjPanel26().setBackground(new Color(0,102,153));
    }
    public void mouseKeluarSupplier(mainView main){
        main.getjPanel26().setBackground(Color.white);
        main.getjPanel25().setBackground(Color.white);
    }
    public void mouseMasukAdmin(mainView main){
        main.getjPanel6().setBackground(new Color(250,250,250));
    }
    public void mouseKeluarAdmin(mainView main){
        main.getjPanel6().setBackground(new Color(204,204,204));
    }
}
