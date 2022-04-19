package com.laioffer.onlineOrder;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import org.json.JSONObject;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");

        // Hello
            JSONObject customer = new JSONObject();
            customer.put("email", "sun@laioffer.com");
            customer.put("first_name", "rick");
            customer.put("last_name", "sun");
            customer.put("age", 50);
            response.getWriter().print(customer);
        }



    public void destroy() {
    }
}