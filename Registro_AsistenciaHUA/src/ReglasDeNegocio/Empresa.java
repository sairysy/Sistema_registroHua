package ReglasDeNegocio;
import AccesoADatos.*;
import java.sql.*;
import java.util.*;
import java.sql.Time;
public class Empresa {
  public int idempresa;
  public Ciudad ciudad;
  public String nombreempresa;
  public String direccion1;
  public String direccion2;
  public String estado;
  public String sitioweb;
  public String email;
  public String telefono;

    public Empresa() {
    }
    public Empresa(int idempresa, Ciudad ciudad, String nombreempresa, String direccion1, String direccion2, String estado, String sitioweb, String email, String telefono) {
        this.idempresa = idempresa;
        this.ciudad = ciudad;
        this.nombreempresa = nombreempresa;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.estado = estado;
        this.sitioweb = sitioweb;
        this.email = email;
        this.telefono = telefono;
        
    }
    public int getIdempresa() {
        return idempresa;
    }
    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }
    public Ciudad getCiudad() {
        return ciudad;
    }
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    public String getNombreempresa() {
        return nombreempresa;
    }
    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }
    public String getDireccion1() {
        return direccion1;
    }
    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }
    public String getDireccion2() {
        return direccion2;
    }
    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getSitioweb() {
        return sitioweb;
    }
    public void setSitioweb(String sitioweb) {
        this.sitioweb = sitioweb;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
@Override
    public String toString() {
        return getNombreempresa();
    }
    public static ArrayList<Empresa> empresa_buscartodos() throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
        ArrayList<Empresa> lista= new ArrayList<Empresa>();
          Empresa obj= new Empresa();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      try {
          //declaro mi sql
          String sql= "select * from public.empresa_buscartodos()";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Empresa();
              obj.setIdempresa(rs.getInt("pidempresa"));
              Ciudad ciudad=new Ciudad();
              Ciudad ciudades=ciudad.ciudad_buscarporid(rs.getInt("pidciudad"));
              obj.setCiudad(ciudades);
              obj.setNombreempresa(rs.getString("pnombreempresa"));
              obj.setDireccion1(rs.getString("pdireccion1"));
              obj.setDireccion2(rs.getString("pdireccion2"));
              obj.setEstado(rs.getString("pestado"));
              obj.setSitioweb(rs.getString("psitioweb"));
              obj.setEmail(rs.getString("pemail"));
              obj.setTelefono(rs.getString("ptelefono"));
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
    public static Empresa empresa_buscarporid(int pidempresa) throws Exception
    {
         //CREO LISTA QUE RECIBIRA LOS DATOS DEL RESULSET
       ArrayList<Empresa> lista= new ArrayList<Empresa>();
       Empresa obj= new Empresa();
       ResultSet rs= null;
      //LLAMO LA CONEXION
      Conexion con= new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      //DECLARO UN PREPAREDSTATEMENT QUE EJECUTARA LA SQL
      PreparedStatement preStm= null;
      try {
          //declaro mi sql
          String sql= "select * from public.empresa_buscarporid(?)";
          //creo mi preparedstatement
          preStm=con.creaPreparedSmt(sql);
          //ejecuto el prepardestatement y le asigno a mi resulset
          preStm.setInt(1, pidempresa);
          rs= con.ejecutaPrepared(preStm);
          obj=null;
          while (rs.next()) {
              obj= new Empresa();
              obj.setIdempresa(rs.getInt("pidempresa"));
              Ciudad ciudad=new Ciudad();
              Ciudad ciudades=ciudad.ciudad_buscarporid(rs.getInt("pidciudad"));
              obj.setCiudad(ciudades);
              obj.setNombreempresa(rs.getString("pnombreempresa"));
              obj.setDireccion1(rs.getString("pdireccion1"));
              obj.setDireccion2(rs.getString("pdireccion2"));
              obj.setEstado(rs.getString("pestado"));
              obj.setSitioweb(rs.getString("psitioweb"));
              obj.setEmail(rs.getString("pemail"));
              obj.setTelefono(rs.getString("ptelefono"));
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
     public static boolean empresa_insertar(Empresa empresa) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÑADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.empresa_insertar(?,?,?,?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, empresa.getCiudad().getIdciudad()));
          parametros.add(new Parametro(2,empresa.getNombreempresa()));
          parametros.add(new Parametro(3, empresa.getDireccion1()));
          parametros.add(new Parametro(4, empresa.getDireccion2()));
          parametros.add(new Parametro(5, empresa.getEstado()));
          parametros.add(new Parametro(6, empresa.getSitioweb()));
          parametros.add(new Parametro(7, empresa.getEmail()));
          parametros.add(new Parametro(8, empresa.getTelefono()));
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
     public static boolean empresa_editar(Empresa empresa) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÑADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.empresa_editar(?,?,?,?,?,?,?,?,?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1,empresa.getIdempresa()));
          parametros.add(new Parametro(2, empresa.getCiudad().getIdciudad()));
          parametros.add(new Parametro(3,empresa.getNombreempresa()));
          parametros.add(new Parametro(4, empresa.getDireccion1()));
          parametros.add(new Parametro(5, empresa.getDireccion2()));
          parametros.add(new Parametro(6, empresa.getEstado()));
          parametros.add(new Parametro(7, empresa.getSitioweb()));
          parametros.add(new Parametro(8, empresa.getEmail()));
          parametros.add(new Parametro(9, empresa.getTelefono()));
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
       public static boolean empresa_eliminar(int piidempresa) throws Exception
  {
      boolean respuesta=false;
      Conexion con = new Conexion(Global.driver, Global.url, Global.user, Global.pass);
      try {
          //CREAMOS EL ARRAYLIST DE LOS COMANDOS O SENTENCIAS SQL
          ArrayList<Comando> comandos = new ArrayList<Comando>();
          //CREAMOS EL PRIMER COMANDO QUE SERA AÃ‘ADIDO AL ARRAYLIST D COMANDOS
          Comando cmd= new Comando();
          //SETEAMOS LA FUNCION AL COMAND0
          cmd.setSetenciaSql("select * from public.empresa_eliminar(?)");
          //CREAMOS EL ARRALIST DE PARAMETROS PARA ASIGANR A MI PRIMER COMANDO
          ArrayList<Parametro> parametros = new ArrayList<Parametro>();
          //llenamos el arraylist con todos los parametros
          parametros.add(new Parametro(1, piidempresa));
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