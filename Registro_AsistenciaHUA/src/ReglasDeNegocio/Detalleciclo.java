/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReglasDeNegocio;

import AccesoADatos.Comando;
import AccesoADatos.Conexion;
import AccesoADatos.Global;
import AccesoADatos.Parametro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sairy
 */
public class Detalleciclo {
    public int id_detalleciclo;
    public Ciclos ciclos;
    public Horario horario;
    public Codpago codpago;
    public String descripcion;

    public Detalleciclo() {
    }

    public Detalleciclo(int id_detalleciclo, Ciclos ciclos, Horario horario, Codpago codpago, String descripcion) {
        this.id_detalleciclo = id_detalleciclo;
        this.ciclos = ciclos;
        this.horario = horario;
        this.codpago = codpago;
        this.descripcion = descripcion;
    }

    public int getId_detalleciclo() {
        return id_detalleciclo;
    }

    public void setId_detalleciclo(int id_detalleciclo) {
        this.id_detalleciclo = id_detalleciclo;
    }

    public Ciclos getCiclos() {
        return ciclos;
    }

    public void setCiclos(Ciclos ciclos) {
        this.ciclos = ciclos;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Codpago getCodpago() {
        return codpago;
    }

    public void setCodpago(Codpago codpago) {
        this.codpago = codpago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    
    

    public static ArrayList<Detalleciclo> detalleciclo_buscartodos() throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
        ArrayList<Detalleciclo> lista= new ArrayList<Detalleciclo>();
          Detalleciclo obj= new Detalleciclo();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      try {
          //declaro mi sql
          String sql= "select * from public.detalleciclo_buscartodos()";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Detalleciclo();
              obj.setId_detalleciclo(rs.getInt("pId_detalleciclo"));
              Ciclos ciclos=new Ciclos();
              Ciclos cicloss=ciclos.ciclos_buscarporid(rs.getInt("pidciclo"));
              obj.setCiclos(cicloss);
              Horario horario=new Horario();
              Horario horarios=horario.horario_buscarporid(rs.getInt("pidhorario"));
              obj.setHorario(horarios);
              Codpago codpago=new Codpago();
              Codpago codpagos=codpago.codigopago_buscarporid(rs.getInt("pidcodpago"));
              obj.setCodpago(codpagos);
              obj.setDescripcion(rs.getString("pdescripcion"));
              
              lista.add(obj);
          }
      } catch (SQLException e) {
          System.out.println(e.getMessage());
      }
      finally
      {
          rs.close();
          preStm.close();
          con.desconectar();
      }
            return lista;
    }
    public static Detalleciclo detalleciclo_buscarporid(int piddetalleciclo) throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
       ArrayList<Detalleciclo> lista= new ArrayList<Detalleciclo>();
       Detalleciclo obj= new Detalleciclo();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      try {
          //declaro mi sql
          String sql= "select * from public.detalleciclo_buscarporid(?)";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          preStm.setInt(1, piddetalleciclo);
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Detalleciclo();
              obj.setId_detalleciclo(rs.getInt("pId_detalleciclo"));
              Ciclos ciclos=new Ciclos();
              Ciclos cicloss=ciclos.ciclos_buscarporid(rs.getInt("pidciclo"));
              obj.setCiclos(cicloss);
              Horario horario=new Horario();
              Horario horarios=horario.horario_buscarporid(rs.getInt("pidhorario"));
              obj.setHorario(horarios);
              Codpago codpago=new Codpago();
              Codpago codpagos=codpago.codigopago_buscarporid(rs.getInt("pidcodpago"));
              obj.setCodpago(codpagos);
              obj.setDescripcion(rs.getString("pdescripcion"));
              lista.add(obj);
          }
      } catch (SQLException e) {
          System.out.println(e.getMessage());
      }
      finally
      {
          rs.close();
          preStm.close();
          con.desconectar();
      }
            return obj;
    }
     public static boolean detalleciclo_insertar(Detalleciclo detalleciclo) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÑADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.detalleciclo_insertar(?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, detalleciclo.getCiclos().getIdciclo()));
          parametros.add(new Parametro(2, detalleciclo.getHorario().getIdhorario()));
          parametros.add(new Parametro(3, detalleciclo.getCodpago().getIdcodpago()));
          parametros.add(new Parametro(4, detalleciclo.getDescripcion()));
         
          //llenar el comando con los parametros
          cmd.setLstParametros(parametros);
          comandos.add(cmd);
          //llamamos al funcion que ejecuta la transaccion en la base de datos
          respuesta= con.ejecutaPreparedTransaccion(comandos);
      } catch (SQLException e) {
          throw  new Exception(e.getMessage());
      }
      finally
      {
          con.desconectar();
      }
      return respuesta;
  }
     public static boolean detalleciclo_editar(Detalleciclo detalleciclo) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÑADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.detalleciclo_editar(?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1,detalleciclo.getId_detalleciclo()));
          parametros.add(new Parametro(2, detalleciclo.getCiclos().getIdciclo()));
          parametros.add(new Parametro(3, detalleciclo.getHorario().getIdhorario()));
          parametros.add(new Parametro(4, detalleciclo.getCodpago().getIdcodpago()));
          parametros.add(new Parametro(5,detalleciclo.getDescripcion()));
          //llenar el comando con los parametros
          cmd.setLstParametros(parametros);
          comandos.add(cmd);
          //llamamos al funcion que ejecuta la transaccion en la base de datos
          respuesta= con.ejecutaPreparedTransaccion(comandos);
      } catch (SQLException e) {
          throw  new Exception(e.getMessage());
      }
      finally
      {
          con.desconectar();
      }
      return respuesta;
  }
       public static boolean detalleciclo_eliminar(int piiddetalleciclo) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.detalleciclo_eliminar(?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, piiddetalleciclo));
          //llenar el comando con los parametros
          cmd.setLstParametros(parametros);
          comandos.add(cmd);
          //llamamos al funcion que ejecuta la transaccion en la base de datos
          respuesta= con.ejecutaPreparedTransaccion(comandos);

      } catch (SQLException e) {
          throw  new Exception(e.getMessage());
      }
            finally
      {
          con.desconectar();
      }
      return respuesta;
  } 
}