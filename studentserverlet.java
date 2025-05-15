import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String roll = request.getParameter("roll");

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO students (name, roll) VALUES (?, ?)");
            ps.setString(1, name);
            ps.setString(2, roll);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

