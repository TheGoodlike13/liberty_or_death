package eu.goodlike;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/*")
public final class TestServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.getWriter().println("Well, would you look at that.");
  }

}
