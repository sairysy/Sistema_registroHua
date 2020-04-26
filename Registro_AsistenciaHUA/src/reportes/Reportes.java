/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author USER
 */
public class Reportes {
    public void ReporteRol () throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/proyecto_db","tutorias","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\USER\\Documents\\NetBeansProjects\\ProyectoQuinto\\src\\reportes\\Roles.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("Rol");
        ver.setVisible(true);
    }
    public void ReportePeriodo () throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/proyecto_db","tutorias","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\USER\\Documents\\NetBeansProjects\\ProyectoQuinto\\src\\reportes\\Periodos.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("Rol");
        ver.setVisible(true);
    }
}
