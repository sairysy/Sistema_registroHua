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
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author sairy
 */
public class Descansos {
    public int iddescanso;
    public  String nombdescanso;
    public  String hora_inicio;
    public  String hora_fin;
    public  String estado_cobro;

    public Descansos() {
    }

    public Descansos(int iddescanso, String nombdescanso, String hora_inicio, String hora_fin, String estado_cobro) {
        this.iddescanso = iddescanso;
        this.nombdescanso = nombdescanso;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.estado_cobro = estado_cobro;
    }

    public int getIddescanso() {
        return iddescanso;
    }

    public void setIddescanso(int iddescanso) {
        this.iddescanso = iddescanso;
    }

    public String getNombdescanso() {
        return nombdescanso;
    }

    public void setNombdescanso(String nombdescanso) {
        this.nombdescanso = nombdescanso;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getEstado_cobro() {
        return estado_cobro;
    }

    public void setEstado_cobro(String estado_cobro) {
        this.estado_cobro = estado_cobro;
    }

    

     
@Override
    public String toString() {
        return getNombdescanso();
    }
    public static ArrayList<Descansos> descansos_buscartodos() throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
        ArrayList<Descansos> lista= new ArrayList<Descansos>();
          Descansos obj= new Descansos();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      try {
          //declaro mi sql
          String sql= "select * from public.descanso_buscartodos()";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Descansos();
              obj.setIddescanso(rs.getInt("piddescanso"));
              obj.setNombdescanso(rs.getString("pnombdescanso"));
              obj.setHora_inicio(rs.getString("phora_inicio"));
              obj.setHora_fin(rs.getString("phora_fin"));
              obj.setEstado_cobro(rs.getString("pestado_cobro"));
              
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
    public static Descansos descansos_buscarporid(int piddescansos) throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
       ArrayList<Descansos> lista= new ArrayList<Descansos>();
       Descansos obj= new Descansos();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      try {
          //declaro mi sql
          String sql= "select * from public.descanso_buscarporid(?)";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          preStm.setInt(1, piddescansos);
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Descansos();
              obj.setIddescanso(rs.getInt("piddescanso"));
              obj.setNombdescanso(rs.getString("pnombdescanso"));
              obj.setHora_inicio(rs.getString("phora_inicio"));
              obj.setHora_fin(rs.getString("phora_fin"));
              obj.setEstado_cobro(rs.getString("pestado_cobro"));
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
     public static boolean descansos_insertar(Descansos descansos) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÑADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.descanso_insertar(?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          
          parametros.add(new Parametro(1,descansos.getNombdescanso()));
          parametros.add(new Parametro(2, descansos.getHora_inicio()));
          parametros.add(new Parametro(3, descansos.getHora_fin()));
          parametros.add(new Parametro(4, descansos.getEstado_cobro()));
          
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
     public static boolean descansos_editar(Descansos descansos) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÑADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.descanso_editar(?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1,descansos.getIddescanso()));
          parametros.add(new Parametro(2,descansos.getNombdescanso()));
          parametros.add(new Parametro(3, descansos.getHora_inicio()));
          parametros.add(new Parametro(4, descansos.getHora_fin()));
          parametros.add(new Parametro(5, descansos.getEstado_cobro()));
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
       public static boolean descansos_eliminar(int piiddescanso) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.descanso_eliminar(?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, piiddescanso));
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
