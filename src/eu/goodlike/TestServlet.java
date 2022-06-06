package eu.goodlike;

import jakarta.security.enterprise.authentication.mechanism.http.FormAuthenticationMechanismDefinition;
import jakarta.security.enterprise.authentication.mechanism.http.LoginToContinue;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/test")
@FormAuthenticationMechanismDefinition(
  loginToContinue = @LoginToContinue(
    errorPage = "/error.html",
    loginPage = "/login.html"
  )
)
public class TestServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.sendRedirect("/success.html");
  }

}
