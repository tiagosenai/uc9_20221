package controller;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletOi")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletLogin() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		if (usuario != null && !usuario.isEmpty() && senha != null && !senha.isEmpty()) {
			//Instaciar o Objeto
			//Para fazer o login
			//utilizar a conexão banco
		}
		else {
			
			//instaciei um objeto
			RequestDispatcher redireciona = request.getRequestDispatcher("/login.jsp");
			request.setAttribute("mensagem", "Informe o Usuário e Senha corretamente!");
			redireciona.forward(request, response);
		}
	}

}
