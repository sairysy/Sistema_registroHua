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
import java.util.Date;

/**
 *
 * @author sairy
 */
public class Turnos {
  private int idturno;
  private Codpago codpago;
  private Horario horario;
  private String nombreturno;
  //private Date fecha;
  private String hora_entrada;
  private String hora_salida;

    public Turnos() {
    }

    public Turnos(int idturno, Codpago codpago, Horario horario, String nombreturno, String hora_entrada, String hora_salida) {
        this.idturno = idturno;
        this.codpago = codpago;
        this.horario = horario;
        this.nombreturno = nombreturno;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public Codpago getCodpago() {
        return codpago;
    }

    public void setCodpago(Codpago codpago) {
        this.codpago = codpago;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getNombreturno() {
        return nombreturno;
    }

    public void setNombreturno(String nombreturno) {
        this.nombreturno = nombreturno;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }


@Override
    public String toString() {
        return getNombreturno();
    }
    public static ArrayList<Turnos> turnos_buscartodos() throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
        ArrayList<Turnos> lista= new ArrayList<Turnos>();
          Turnos obj= new Turnos();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      try {
          //declaro mi sql
          String sql= "select * from public.turno_buscartodos()";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Turnos();
              obj.setIdturno(rs.getInt("pidturnos"));
              Codpago codpago=new Codpago();
              Codpago codpagos=codpago.codigopago_buscarporid(rs.getInt("pidcodpago"));
              obj.setCodpago(codpagos);
              Horario horario=new Horario();
              Horario horarios=horario.horario_buscarporid(rs.getInt("pidhorario"));
              obj.setHorario(horarios);
              
              obj.setNombreturno(rs.getString("pnombreturno"));
              obj.setHora_entrada(rs.getString("phora_entrada"));
              obj.setHora_salida(rs.getString("phora_salida"));
             
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
    public static Turnos turnos_buscarporid(int pidturno) throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
       ArrayList<Turnos> lista= new ArrayList<Turnos>();
       Turnos obj= new Turnos();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      try {
          //declaro mi sql
          String sql= "select * from public.turno_buscarporid(?)";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          preStm.setInt(1, pidturno);
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Turnos();
              obj.setIdturno(rs.getInt("pidturnos"));
              Codpago codpago=new Codpago();
              Codpago codpagos=codpago.codigopago_buscarporid(rs.getInt("pidcodpago"));
              obj.setCodpago(codpagos);
              Horario horario=new Horario();
              Horario horarios=horario.horario_buscarporid(rs.getInt("pidhorario"));
              obj.setHorario(horarios);
              
              obj.setNombreturno(rs.getString("pnombreturno"));
              obj.setHora_entrada(rs.getString("phora_entrada"));
              obj.setHora_salida(rs.getString("phora_salida"));
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
     public static boolean turnos_insertar(Turnos turnos) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÑADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.turno_insertar(?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, turnos.getCodpago().getIdcodpago()));
          parametros.add(new Parametro(2, turnos.getHorario().getIdhorario()));
          parametros.add(new Parametro(3,turnos.getNombreturno()));
          parametros.add(new Parametro(4, turnos.getHora_entrada()));
          parametros.add(new Parametro(5, turnos.getHora_salida()));
         
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
     public static boolean turnos_editar(Turnos turnos) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÑADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.turnos_editar(?,?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1,turnos.getIdturno()));
          parametros.add(new Parametro(2, turnos.getCodpago().getIdcodpago()));
          parametros.add(new Parametro(3, turnos.getHorario().getIdhorario()));
          parametros.add(new Parametro(4,turnos.getNombreturno()));
          parametros.add(new Parametro(5, turnos.getHora_entrada()));
          parametros.add(new Parametro(6, turnos.getHora_salida()));
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
       public static boolean turnos_eliminar(int piidturno) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.turno_eliminar(?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, piidturno));
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