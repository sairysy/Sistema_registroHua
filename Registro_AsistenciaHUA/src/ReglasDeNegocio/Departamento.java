package ReglasDeNegocio;
import AccesoADatos.*;
import java.sql.*;
import java.util.*;
import java.sql.Time;
public class Departamento {
  private int iddepartamento;
  private Empresa departamento;
  private Turnos turnos;
  private String nombredepartamento;
  

    public Departamento() {
    }

    public Departamento(int iddepartamento, Empresa departamento, Turnos turnos, String nombredepartamento) {
        this.iddepartamento = iddepartamento;
        this.departamento = departamento;
        this.turnos = turnos;
        this.nombredepartamento = nombredepartamento;
    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public Empresa getEmpresa() {
        return departamento;
    }

    public void setEmpresa(Empresa departamento) {
        this.departamento = departamento;
    }

    public Turnos getTurnos() {
        return turnos;
    }

    public void setTurnos(Turnos turnos) {
        this.turnos = turnos;
    }

    public String getNombredepartamento() {
        return nombredepartamento;
    }

    public void setNombredepartamento(String nombredepartamento) {
        this.nombredepartamento = nombredepartamento;
    }
   
   
@Override
    public String toString() {
        return getNombredepartamento();
    }
    public static ArrayList<Departamento> departamento_buscartodos() throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
        ArrayList<Departamento> lista= new ArrayList<Departamento>();
          Departamento obj= new Departamento();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      try {
          //declaro mi sql
          String sql= "select * from public.departamento_buscartodos()";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Departamento();
              obj.setIddepartamento(rs.getInt("piddepartamento"));
              Empresa empresa=new Empresa();
              Empresa empresas=empresa.empresa_buscarporid(rs.getInt("pidempresa"));
              obj.setEmpresa(empresas);
              Turnos turno=new Turnos();
              Turnos turnoss=turno.turnos_buscarporid(rs.getInt("pidturno"));
              obj.setTurnos(turnoss);
              obj.setNombredepartamento(rs.getString("pnombredepartamento"));
              
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
    public static Departamento departamento_buscarporid(int piddepartamento) throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
       ArrayList<Departamento> lista= new ArrayList<Departamento>();
       Departamento obj= new Departamento();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      try {
          //declaro mi sql
          String sql= "select * from public.departamento_buscarporid(?)";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          preStm.setInt(1, piddepartamento);
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Departamento();
              obj.setIddepartamento(rs.getInt("piddepartamento"));
              Empresa empresa=new Empresa();
              Empresa empresas=empresa.empresa_buscarporid(rs.getInt("pidempresa"));
              obj.setEmpresa(empresas);
              Turnos turno=new Turnos();
              Turnos turnoss=turno.turnos_buscarporid(rs.getInt("pidturno"));
              obj.setTurnos(turnoss);
              obj.setNombredepartamento(rs.getString("pnombredepartamento"));
              
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
     public static boolean departamento_insertar(Departamento departamento) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÑADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.departamento_insertar(?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, departamento.getEmpresa().getIdempresa()));
          parametros.add(new Parametro(2, departamento.getTurnos().getIdturno()));
          parametros.add(new Parametro(3,departamento.getNombredepartamento()));
          
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
     public static boolean departamento_editar(Departamento departamento) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÑADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.departamento_actualizar(?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1,departamento.getIddepartamento()));
          parametros.add(new Parametro(2, departamento.getEmpresa().getIdempresa()));
          parametros.add(new Parametro(3, departamento.getTurnos().getIdturno()));
          parametros.add(new Parametro(4,departamento.getNombredepartamento()));
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
       public static boolean departamento_eliminar(int piiddepartamento) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.departamento_eliminar(?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, piiddepartamento));
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