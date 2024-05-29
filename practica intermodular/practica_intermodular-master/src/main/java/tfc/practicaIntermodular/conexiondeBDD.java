package tfc.practicaIntermodular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexiondeBDD {
    
    //Nos conectamos a la base de datos
    String url = "jdbc:mysql://localhost:3306/practicaIntermodular";
    String usuario = "root";
    String contraseña = "Med@c";
   
    
    //Accedemos a los datos deL INSERT estrella ('Sol', 'G2V', 696340, 5500, 149.6, '74% Hidrógeno, 24% Helio, 2% Otros') en MYSQL
    String sqlEstrella = "SELECT * FROM Estrella";
    public String[] consultaEstrella() {
        // Crear array para almacenar los datos
        String[] datosEstrella = new String[6];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlEstrella);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosEstrella[0] = resultados.getString("nombre");
                datosEstrella[1] = resultados.getString("tipo");
                datosEstrella[2] = resultados.getString("radio_km");
                datosEstrella[3] = resultados.getString("temperatura_superficial_c");
                datosEstrella[4] = resultados.getString("distancia_media_tierra_mkm");
                datosEstrella[5] = resultados.getString("composicion");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosEstrella;
    }
    
    //Accedemos a los datos deL INSERT tierra
    String sqlTierra = "SELECT * FROM planeta where nombre='Tierra'";
   
    public String[] consultaTierra() {
        // Crear array para almacenar los datos
        String[] datosTierra = new String[8];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlTierra);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosTierra[0] = resultados.getString("radio_km");
                datosTierra[1] = resultados.getString("distancia_media_sol_mkm");
                datosTierra[2] = resultados.getString("periodo_orbital_dias");
                datosTierra[3] = resultados.getString("temperatura_media_c");
                datosTierra[4] = resultados.getString("tipo_planeta");
                datosTierra[5] = resultados.getString("num_satelites");
                datosTierra[6] = resultados.getString("Fecha Creacion");
                datosTierra[7] = resultados.getString("nombre");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosTierra;
    }
    
    //Accedemos a los datos deL INSERT marte
   
    String sqlMarte = "SELECT * FROM planeta where nombre='Marte'";
   
    public String[] consultaMarte() {
        // Crear array para almacenar los datos
        String[] datosMarte = new String[8];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlMarte);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosMarte[0] = resultados.getString("radio_km");
                datosMarte[1] = resultados.getString("distancia_media_sol_mkm");
                datosMarte[2] = resultados.getString("periodo_orbital_dias");
                datosMarte[3] = resultados.getString("temperatura_media_c");
                datosMarte[4] = resultados.getString("tipo_planeta");
                datosMarte[5] = resultados.getString("num_satelites");
                datosMarte[6] = resultados.getString("Fecha Creacion");
                datosMarte[7] = resultados.getString("nombre");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosMarte;
    }
   
    //Accedemos a los datos deL INSERT venus
   
    String sqlVenus = "SELECT * FROM planeta where nombre='Venus'";
   
    public String[] consultaVenus() {
        // Crear array para almacenar los datos
        String[] datosVenus = new String[8];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlVenus);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosVenus[0] = resultados.getString("radio_km");
                datosVenus[1] = resultados.getString("distancia_media_sol_mkm");
                datosVenus[2] = resultados.getString("periodo_orbital_dias");
                datosVenus[3] = resultados.getString("temperatura_media_c");
                datosVenus[4] = resultados.getString("tipo_planeta");
                datosVenus[5] = resultados.getString("num_satelites");
                datosVenus[6] = resultados.getString("Fecha Creacion");
                datosVenus[7] = resultados.getString("nombre");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosVenus;
    }
   
    
    //Accedemos a los datos deL INSERT Saturno
    String sqlSaturno = "SELECT * FROM planeta where nombre='Saturno'";
   
    public String[] consultaSaturno() {
        // Crear array para almacenar los datos
        String[] datosSaturno = new String[8];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlSaturno);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosSaturno[0] = resultados.getString("radio_km");
                datosSaturno[1] = resultados.getString("distancia_media_sol_mkm");
                datosSaturno[2] = resultados.getString("periodo_orbital_dias");
                datosSaturno[3] = resultados.getString("temperatura_media_c");
                datosSaturno[4] = resultados.getString("tipo_planeta");
                datosSaturno[5] = resultados.getString("num_satelites");
                datosSaturno[6] = resultados.getString("Fecha Creacion");
                datosSaturno[7] = resultados.getString("nombre");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosSaturno;
    }
   
    //Accedemos a los datos deL INSERT jupiter
    String sqlJupiter = "SELECT * FROM planeta where nombre='Júpiter'";
   
    public String[] consultaJúpiter() {
        // Crear array para almacenar los datos
        String[] datosJupiter = new String[8];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlJupiter);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosJupiter[0] = resultados.getString("radio_km");
                datosJupiter[1] = resultados.getString("distancia_media_sol_mkm");
                datosJupiter[2] = resultados.getString("periodo_orbital_dias");
                datosJupiter[3] = resultados.getString("temperatura_media_c");
                datosJupiter[4] = resultados.getString("tipo_planeta");
                datosJupiter[5] = resultados.getString("num_satelites");
                datosJupiter[6] = resultados.getString("Fecha Creacion");
                datosJupiter[7] = resultados.getString("nombre");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosJupiter;
    }
    //Accedemos a los datos deL INSERT urano
    String sqlUrano = "SELECT * FROM planeta where nombre='Urano'";
   
    public String[] consultaUrano() {
        // Crear array para almacenar los datos
        String[] datosUrano = new String[8];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlUrano);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosUrano[0] = resultados.getString("radio_km");
                datosUrano[1] = resultados.getString("distancia_media_sol_mkm");
                datosUrano[2] = resultados.getString("periodo_orbital_dias");
                datosUrano[3] = resultados.getString("temperatura_media_c");
                datosUrano[4] = resultados.getString("tipo_planeta");
                datosUrano[5] = resultados.getString("num_satelites");
                datosUrano[6] = resultados.getString("Fecha Creacion");
                datosUrano[7] = resultados.getString("nombre");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosUrano;
    }
    //Accedemos a los datos deL INSERT mercurio
    String sqlMercurio = "SELECT * FROM planeta where nombre='Mercurio'";
   
    public String[] consultaMercurio() {
        // Crear array para almacenar los datos
        String[] datosMercurio = new String[8];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlMercurio);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosMercurio[0] = resultados.getString("radio_km");
                datosMercurio[1] = resultados.getString("distancia_media_sol_mkm");
                datosMercurio[2] = resultados.getString("periodo_orbital_dias");
                datosMercurio[3] = resultados.getString("temperatura_media_c");
                datosMercurio[4] = resultados.getString("tipo_planeta");
                datosMercurio[5] = resultados.getString("num_satelites");
                datosMercurio[6] = resultados.getString("Fecha Creacion");
                datosMercurio[7] = resultados.getString("nombre");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosMercurio;
    }
    //Accedemos a los datos deL INSERT neptuno
    String sqlNeptuno = "SELECT * FROM planeta where nombre='Neptuno'";
   
    public String[] consultaNeptuno() {
        // Crear array para almacenar los datos
        String[] datosNeptuno = new String[8];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlNeptuno);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosNeptuno[0] = resultados.getString("radio_km");
                datosNeptuno[1] = resultados.getString("distancia_media_sol_mkm");
                datosNeptuno[2] = resultados.getString("periodo_orbital_dias");
                datosNeptuno[3] = resultados.getString("temperatura_media_c");
                datosNeptuno[4] = resultados.getString("tipo_planeta");
                datosNeptuno[5] = resultados.getString("num_satelites");
                datosNeptuno[6] = resultados.getString("Fecha Creacion");
                datosNeptuno[7] = resultados.getString("nombre");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosNeptuno;
    }
   
    //Accedemos a los datos deL INSERT de los SATELITES
    //Satelite Luna
    String sqlLuna = "SELECT * FROM satelite where nombre='Luna'";
   
    public String[] consultaLuna() {
        // Crear array para almacenar los datos
        String[] datosLuna = new String[7];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlLuna);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosLuna[0] = resultados.getString("nombre");
                datosLuna[1] = resultados.getString("nombre_planeta");
                datosLuna[2] = resultados.getString("radio_km");
                datosLuna[3] = resultados.getString("distancia_media_planeta_km");
                datosLuna[4] = resultados.getString("periodo_orbital_dias");
                datosLuna[5] = resultados.getString("temperatura_media_c");
                datosLuna[6] = resultados.getString("tipo_cuerpo");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosLuna;
    }
   
    //Satelite Fobos
   
    String sqlFobos = "SELECT * FROM satelite where nombre='Fobos'";
   
    public String[] consultaFobos() {
        // Crear array para almacenar los datos
        String[] datosFobos = new String[7];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlFobos);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosFobos[0] = resultados.getString("nombre");
                datosFobos[1] = resultados.getString("nombre_planeta");
                datosFobos[2] = resultados.getString("radio_km");
                datosFobos[3] = resultados.getString("distancia_media_planeta_km");
                datosFobos[4] = resultados.getString("periodo_orbital_dias");
                datosFobos[5] = resultados.getString("temperatura_media_c");
                datosFobos[6] = resultados.getString("tipo_cuerpo");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosFobos;
    }
   
    //Satelite Deimos
   
    String sqlDeimos = "SELECT * FROM satelite where nombre='Deimos'";
   
    public String[] consultaDeimos() {
        // Crear array para almacenar los datos
        String[] datosDeimos = new String[7];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlDeimos);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosDeimos[0] = resultados.getString("nombre");
                datosDeimos[1] = resultados.getString("nombre_planeta");
                datosDeimos[2] = resultados.getString("radio_km");
                datosDeimos[3] = resultados.getString("distancia_media_planeta_km");
                datosDeimos[4] = resultados.getString("periodo_orbital_dias");
                datosDeimos[5] = resultados.getString("temperatura_media_c");
                datosDeimos[6] = resultados.getString("tipo_cuerpo");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosDeimos;
    }
   
    //Satelite Ío
   
    String sqlÍo = "SELECT * FROM satelite where nombre='Ío'";
   
    public String[] consultaÍo() {
        // Crear array para almacenar los datos
        String[] datosÍo = new String[7];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlÍo);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosÍo[0] = resultados.getString("nombre");
                datosÍo[1] = resultados.getString("nombre_planeta");
                datosÍo[2] = resultados.getString("radio_km");
                datosÍo[3] = resultados.getString("distancia_media_planeta_km");
                datosÍo[4] = resultados.getString("periodo_orbital_dias");
                datosÍo[5] = resultados.getString("temperatura_media_c");
                datosÍo[6] = resultados.getString("tipo_cuerpo");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosÍo;
    }
   
    //Satelite Europa
   
    String sqlEuropa = "SELECT * FROM satelite where nombre='Europa'";
   
    public String[] consultaEuropa() {
        // Crear array para almacenar los datos
        String[] datosEuropa = new String[7];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlEuropa);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosEuropa[0] = resultados.getString("nombre");
                datosEuropa[1] = resultados.getString("nombre_planeta");
                datosEuropa[2] = resultados.getString("radio_km");
                datosEuropa[3] = resultados.getString("distancia_media_planeta_km");
                datosEuropa[4] = resultados.getString("periodo_orbital_dias");
                datosEuropa[5] = resultados.getString("temperatura_media_c");
                datosEuropa[6] = resultados.getString("tipo_cuerpo");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosEuropa;
    }
   
    //Satelite Ganimedes
   
    String sqlGanimedes = "SELECT * FROM satelite where nombre='Ganimedes'";
   
    public String[] consultaGanimedes() {
        // Crear array para almacenar los datos
        String[] datosGanimedes = new String[7];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlGanimedes);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosGanimedes[0] = resultados.getString("nombre");
                datosGanimedes[1] = resultados.getString("nombre_planeta");
                datosGanimedes[2] = resultados.getString("radio_km");
                datosGanimedes[3] = resultados.getString("distancia_media_planeta_km");
                datosGanimedes[4] = resultados.getString("periodo_orbital_dias");
                datosGanimedes[5] = resultados.getString("temperatura_media_c");
                datosGanimedes[6] = resultados.getString("tipo_cuerpo");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosGanimedes;
    }
   
    //Satelite Calisto
   
    String sqlCalisto = "SELECT * FROM satelite where nombre='Calisto'";
   
    public String[] consultaCalisto() {
        // Crear array para almacenar los datos
        String[] datosCalisto = new String[7];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlCalisto);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosCalisto[0] = resultados.getString("nombre");
                datosCalisto[1] = resultados.getString("nombre_planeta");
                datosCalisto[2] = resultados.getString("radio_km");
                datosCalisto[3] = resultados.getString("distancia_media_planeta_km");
                datosCalisto[4] = resultados.getString("periodo_orbital_dias");
                datosCalisto[5] = resultados.getString("temperatura_media_c");
                datosCalisto[6] = resultados.getString("tipo_cuerpo");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosCalisto;
    }
   
    //Satelite Titán
   
    String sqlTitán = "SELECT * FROM satelite where nombre='Titán'";
   
    public String[] consultaTitán() {
        // Crear array para almacenar los datos
        String[] datosTitan = new String[7];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlTitán);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosTitan[0] = resultados.getString("nombre");
                datosTitan[1] = resultados.getString("nombre_planeta");
                datosTitan[2] = resultados.getString("radio_km");
                datosTitan[3] = resultados.getString("distancia_media_planeta_km");
                datosTitan[4] = resultados.getString("periodo_orbital_dias");
                datosTitan[5] = resultados.getString("temperatura_media_c");
                datosTitan[6] = resultados.getString("tipo_cuerpo");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosTitan;
    }
   
    //Satelite Encélado
   
    String sqlEncélado = "SELECT * FROM satelite where nombre='Encélado'";
   
    public String[] consultaEncélado() {
        // Crear array para almacenar los datos
        String[] datosEncélado = new String[7];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlEncélado);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosEncélado[0] = resultados.getString("nombre");
                datosEncélado[1] = resultados.getString("nombre_planeta");
                datosEncélado[2] = resultados.getString("radio_km");
                datosEncélado[3] = resultados.getString("distancia_media_planeta_km");
                datosEncélado[4] = resultados.getString("periodo_orbital_dias");
                datosEncélado[5] = resultados.getString("temperatura_media_c");
                datosEncélado[6] = resultados.getString("tipo_cuerpo");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosEncélado;
    }
   
    //Satelite Titania
   
    String sqlTitania = "SELECT * FROM satelite where nombre='Titania'";
   
    public String[] consultaTitania() {
        // Crear array para almacenar los datos
        String[] datosTitania = new String[7];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlTitania);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosTitania[0] = resultados.getString("nombre");
                datosTitania[1] = resultados.getString("nombre_planeta");
                datosTitania[2] = resultados.getString("radio_km");
                datosTitania[3] = resultados.getString("distancia_media_planeta_km");
                datosTitania[4] = resultados.getString("periodo_orbital_dias");
                datosTitania[5] = resultados.getString("temperatura_media_c");
                datosTitania[6] = resultados.getString("tipo_cuerpo");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosTitania;
    }
   
    //Satelite Oberón
   
    String sqlOberón = "SELECT * FROM satelite where nombre='Oberón'";
   
    public String[] consultaOberón() {
        // Crear array para almacenar los datos
        String[] datosOberón = new String[7];

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlOberón);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosOberón[0] = resultados.getString("nombre");
                datosOberón[1] = resultados.getString("nombre_planeta");
                datosOberón[2] = resultados.getString("radio_km");
                datosOberón[3] = resultados.getString("distancia_media_planeta_km");
                datosOberón[4] = resultados.getString("periodo_orbital_dias");
                datosOberón[5] = resultados.getString("temperatura_media_c");
                datosOberón[6] = resultados.getString("tipo_cuerpo");
               
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
           
       
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosOberón;
    }
   
}