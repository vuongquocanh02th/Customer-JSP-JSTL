import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/index")
public class CustomerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "images/img1.jpg"));
        customers.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "images/img2.jpg"));
        customers.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "images/img3.jpg"));
        customers.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "images/img4.jpg"));
        customers.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "images/img5.jpg"));

        request.setAttribute("customerList", customers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}