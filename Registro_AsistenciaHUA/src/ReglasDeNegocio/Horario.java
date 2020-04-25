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
import java.io.Serializable;
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
public class Horario {
  public int idhorario;
  public String nombre;
  public String  hora_inicio;
  public String hora_final;
  public int ingreso_temprano;
  public int salida_tardia;
  public int minutos_contar;
  public int min_sal_temprano;

    public Horario() {
    }

    public Horario(int idhorario, String nombre, String hora_inicio, String hora_final, int ingreso_temprano, int salida_tardia, int minutos_contar, int min_sal_temprano) {
        this.idhorario = idhorario;
        this.nombre = nombre;
        this.hora_inicio = hora_inicio;
        this.hora_final = hora_final;
        this.ingreso_temprano = ingreso_temprano;
        this.salida_tardia = salida_tardia;
        this.minutos_contar = minutos_contar;
        this.min_sal_temprano = min_sal_temprano;
    }

    public int getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_final() {
        return hora_final;
    }

    public void setHora_final(String hora_final) {
        this.hora_final = hora_final;
    }

    public int getIngreso_temprano() {
        return ingreso_temprano;
    }

    public void setIngreso_temprano(int ingreso_temprano) {
        this.ingreso_temprano = ingreso_temprano;
    }

    public int getSalida_tardia() {
        return salida_tardia;
    }

    public void setSalida_tardia(int salida_tardia) {
        this.salida_tardia = salida_tardia;
    }

    public int getMinutos_contar() {
        return minutos_contar;
    }

    public void setMinutos_contar(int minutos_contar) {
        this.minutos_contar = minutos_contar;
    }

    public int getMin_sal_temprano() {
        return min_sal_temprano;
    }

    public void setMin_sal_temprano(int min_sal_temprano) {
        this.min_sal_temprano = min_sal_temprano;
    }


    @Override
    public String toString() {
        return getNombre();
    }
    public static ArrayList<Horario> horario_buscartodos() throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
        ArrayList<Horario> lista= new ArrayList<Horario>();
          Horario obj= new Horario();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;

      try {
          //declaro mi sql
          String sql= "select * from public.horario_buscartodos()";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Horario();
              obj.setIdhorario(rs.getInt("pidhorario"));
              obj.setNombre(rs.getString("pnombre"));
              obj.setHora_inicio(rs.getString("phora_inicio"));
              obj.setHora_final(rs.getString("phora_final"));
              obj.setIngreso_temprano(rs.getInt("pingreso_temprano"));
              obj.setSalida_tardia(rs.getInt("psalida_tardia"));
              obj.setMinutos_contar(rs.getInt("pminutos_contar"));
              obj.setMin_sal_temprano(rs.getInt("pmin_sal_temprano"));
           
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
    
    public static Horario horario_buscarporid(int pidhorario) throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
       ArrayList<Horario> lista= new ArrayList<Horario>();
       Horario obj= new Horario();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
       
      try {
          //declaro mi sql
          String sql= "select * from public.horario_buscarporid(?)";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          preStm.setInt(1, pidhorario);
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Horario();
              obj.setIdhorario(rs.getInt("pidhorario"));
              obj.setNombre(rs.getString("pnombre"));
              obj.setHora_inicio(rs.getString("phora_inicio"));
              obj.setHora_final(rs.getString("phora_final"));
              obj.setIngreso_temprano(rs.getInt("pingreso_temprano"));
              obj.setSalida_tardia(rs.getInt("psalida_tardia"));
              obj.setMinutos_contar(rs.getInt("pminutos_contar"));
              obj.setMin_sal_temprano(rs.getInt("pmin_sal_temprano"));             
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
    
    
     public static boolean horario_insertar(Horario horario) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.horario_insertar(?,?,?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
         ////----- parametros.add(new Parametro(1, horario.getIdhorario()));
          parametros.add(new Parametro(1, horario.getNombre()));
          parametros.add(new Parametro(2, horario.getHora_inicio()));
          parametros.add(new Parametro(3, horario.getHora_final()));
          parametros.add(new Parametro(4, horario.getIngreso_temprano()));
          parametros.add(new Parametro(5, horario.getSalida_tardia()));
          parametros.add(new Parametro(6, horario.getMinutos_contar()));
          parametros.add(new Parametro(7, horario.getMin_sal_temprano()));
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
    
     public static boolean horario_editar(Horario horario) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.horario_editar(?,?,?,?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, horario.getIdhorario()));
          parametros.add(new Parametro(2, horario.getNombre()));
          parametros.add(new Parametro(3, horario.getHora_inicio()));
          parametros.add(new Parametro(4, horario.getHora_final()));
          parametros.add(new Parametro(5, horario.getIngreso_temprano()));
          parametros.add(new Parametro(6, horario.getSalida_tardia()));
          parametros.add(new Parametro(7, horario.getMinutos_contar()));
          parametros.add(new Parametro(8, horario.getMin_sal_temprano()));
          
       
          
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
     
       public static boolean horario_eliminar(int piidhorario) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.horario_eliminar(?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, piidhorario));
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