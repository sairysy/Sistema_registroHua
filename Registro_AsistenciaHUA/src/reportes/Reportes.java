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
    public void Reporteciudad () throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Practicas_HUA\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\ciudad.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("ciudad");
        ver.setVisible(true);
    }
        public void ReporteDetalleciclo () throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Practicas_HUA\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\detalleciclo.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("detalleciclo");
        ver.setVisible(true);
        }
         public void ReporteCodigopago () throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Practicas_HUA\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\codigopago.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("codigopago");
        ver.setVisible(true);
        }
          public void ReporteDepartamentos () throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Practicas_HUA\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\departamentos.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("departamentos");
        ver.setVisible(true);
        }
           public void ReporteDorarioD () throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Practicas_HUA\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\horario_descanso.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("horario_descanso");
        ver.setVisible(true);
        }
           public void ReporteHorario () throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Practicas_HUA\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\horario.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("horario");
        ver.setVisible(true);
        }
             public void ReporteTurno () throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Practicas_HUA\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\turnos.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("turnos");
        ver.setVisible(true);
        }
               public void ReporteDescanasos() throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Practicas_HUA\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\descansos.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("descansos");
        ver.setVisible(true);
        }
                public void ReporteEmpresa() throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Practicas_HUA\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\empresa.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("empresa");
        ver.setVisible(true);
        }
                public void ReporteCiclo() throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Practicas_HUA\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\ciclo.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("ciclo");
        ver.setVisible(true);
        }
                public void ReporteUsuario() throws SQLException, JRException{
        Connection con = null;
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/andino","postgres","123");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\sairy\\Desktop\\Practicas_HUA\\Sistema_registroHua\\Registro_AsistenciaHUA\\src\\reportes\\usuario.jasper");
        JasperPrint print = JasperFillManager.fillReport(reporte , null, con);
        JasperViewer ver = new JasperViewer(print,false);
        ver.setTitle("usuario");
        ver.setVisible(true);
        }
    }

