package Model;
import java.sql.*;

public class DatabaseManager {
    // Configuración de la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/escaperoom";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        // Prueba de inserción
        //addRoom("El Misterio del Laberinto", 4);
        getRoomById(1);
    }

    // Método para obtener la conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Método para añadir una nueva room
    public static void addRoom(String name, int difficulty) {
        String sql = "INSERT INTO rooms (name, difficulty) VALUES (?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, difficulty);
            pstmt.executeUpdate();

            System.out.println("Room añadida correctamente: " + name);

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al insertar la room: " + e.getMessage());
        }
    }

    // Método para leer una room por su ID
    public static void getRoomById(int roomId) {
        String sql = "SELECT * FROM rooms WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, roomId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int difficulty = rs.getInt("difficulty");

                System.out.println("Room encontrada:");
                System.out.println("ID: " + id);
                System.out.println("Nombre: " + name);
                System.out.println("Dificultad: " + difficulty);
            } else {
                System.out.println("No se encontró ninguna room con ID " + roomId);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al leer la room: " + e.getMessage());
        }
    }

}
