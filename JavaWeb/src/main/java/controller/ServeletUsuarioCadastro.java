package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelCadastro;

/**
 * Servlet implementation class ServeletUsuarioCadastro
 */
@WebServlet("/ServeletUsuarioCadastro")
public class ServeletUsuarioCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletUsuarioCadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		String senha = request.getParameter("senha");
		
		ModelCadastro modelcadastro = new ModelCadastro();
		
		modelcadastro.setEmail(email);
		modelcadastro.setNome(nome);
		modelcadastro.setTelefone(telefone);
		modelcadastro.setEndereco(endereco);
		modelcadastro.setSenha(senha);
		
		
	}

}
