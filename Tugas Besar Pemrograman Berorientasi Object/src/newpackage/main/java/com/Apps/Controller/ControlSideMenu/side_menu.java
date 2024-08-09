/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.main.java.com.Apps.Controller.ControlSideMenu;

import newpackage.main.java.com.Apps.View.MainView.mainView;
import newpackage.main.java.com.Apps.View.MenuSideBar.Barang;
import newpackage.main.java.com.Apps.View.MenuSideBar.BarangKeluar;
import newpackage.main.java.com.Apps.View.MenuSideBar.BarangMasuk;
import newpackage.main.java.com.Apps.View.MenuSideBar.Dashboard;
import newpackage.main.java.com.Apps.View.MenuSideBar.HalamanUtama;
import newpackage.main.java.com.Apps.View.MenuSideBar.Stok;
import newpackage.main.java.com.Apps.View.MenuSideBar.Supplier;

/**
 *
 * @author ZRF
 */
public class side_menu {
    public void menuDashboard(mainView view){
        view.getP_main().removeAll();
        view.getP_main().add(new Dashboard());
        view.getP_main().repaint();
        view.getP_main().validate();
    }
    public void menuBarang(mainView view){
        view.getP_main().removeAll();
        view.getP_main().add(new Barang());
        view.getP_main().repaint();
        view.getP_main().validate();
    }
    public void menuBarangMasuk(mainView view){
        view.getP_main().removeAll();
        view.getP_main().add(new BarangMasuk());
        view.getP_main().repaint();
        view.getP_main().validate();
    }
    public void menuBarangKeluar(mainView view){
        view.getP_main().removeAll();
        view.getP_main().add(new BarangKeluar());
        view.getP_main().repaint();
        view.getP_main().validate();
    }
    public void menuSupplier(mainView view){
        view.getP_main().removeAll();
        view.getP_main().add(new Supplier());
        view.getP_main().repaint();
        view.getP_main().validate();
    }
    public void menuStok(mainView view){
        view.getP_main().removeAll();
        view.getP_main().add(new Stok());
        view.getP_main().repaint();
        view.getP_main().validate();
    }
    public void HalamanUtama(mainView view){
        view.getP_main().removeAll();
        view.getP_main().add(new HalamanUtama());
        view.getP_main().repaint();
        view.getP_main().validate();
    }
}
