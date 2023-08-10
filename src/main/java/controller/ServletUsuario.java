package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Usuario;

import java.io.IOException;

import dao.UsuarioRepository;

//@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UsuarioRepository userRepository = new UsuarioRepository();	
    public ServletUsuario() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String msg = "Cadastro Realizado com Sucesso!!";
			String usuario = request.getParameter("usuario");
			String senha = request.getParameter("senha");
			
			Usuario user01 = new Usuario();
			
			user01.setUsuario(usuario);
			user01.setSenha(senha);
			
			user01 = userRepository.insereUsuario(user01);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			RequestDispatcher redireciona = request.getRequestDispatcher("error.jsp");
			request.setAttribute("mensagem", e.getMessage());
			redireciona.forward(request, response);
		}
	}

}
