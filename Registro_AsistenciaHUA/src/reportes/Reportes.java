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
//    public void ReporteUsuario () throws SQLException, JRException{
//        Connection con = null;
//        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
//        JasperReport reporte = null;
//        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Andino\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\roles.jasper");
//        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
//        JasperViewer ver = new JasperViewer(print,false);
//        ver.setTitle("Usuario");
//        ver.setVisible(true);
//    }
     public void ReporteCiudad () throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Andino\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\Ciudad.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("Ciudad");
        ver.setVisible(true);
     }
//       public void ReporteUsuarios () throws SQLException, JRException{
//        Connection con = null;
//        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pis_proyect","tutorias","123");
//        JasperReport reporte = null;
//        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\Franco-Pc\\Documents\\NetBeansProjects\\proyecto_Base_Datos\\proyecto_integrador\\src\\reportes\\Usuario.jasper");
//        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
//        JasperViewer ver = new JasperViewer(print,false);
//        ver.setTitle("Usuario");
//        ver.setVisible(true);
//     }
     
     
     
     
     
     
}