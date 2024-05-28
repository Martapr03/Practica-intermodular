package tfc.practica_intermodular;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexionBDD {
    
         // Configuración de la conexión a la base de datos MySQL
        String url = "jdbc:mysql://localhost:3306/practica_intermodular";
        String usuario = "root";
        String contraseña = "Med@c";
    
        // Sentencias SQL
        String sqlMarte = "SELECT * FROM Planeta where nombre = 'Marte'";

    public String[] conectarConsultarMarte(){
        
        // 1. Crear array
        String[] datosMarte = new String[7];

        try {
            // 2. Conectarme
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // 3. Lanzar query
            ResultSet resultados = statement.executeQuery(sqlMarte);

            // 4. Recoger datos y guardar en array
            while (resultados.next()) {
                datosMarte[0] = resultados.getString("radio_km");
                datosMarte[1] = resultados.getString("distancia_media_sol_mkm");
                datosMarte[2] = resultados.getString("periodo_orbital_dias");
                datosMarte[3] = resultados.getString("temperatura_media_c");
                datosMarte[4] = resultados.getString("tipo_planeta");
                datosMarte[5] = resultados.getString("num_satélite"); // Corrección en el nombre de la columna
                datosMarte[6] = resultados.getString("nombre_estrella");
            }

            // 5. Cerrar conexión
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 6. Devolver array
        return datosMarte;
    }
}

