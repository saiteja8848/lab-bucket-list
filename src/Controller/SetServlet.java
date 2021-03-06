package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TouristPlace;
import service.SetOperations;

@WebServlet(urlPatterns = { "/set" })

public class SetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String destination = request.getParameter("travel");
		String rank = request.getParameter("rank");
		String add = request.getParameter("add");

		String sortbydestination = request.getParameter("sortbydestination");
		String sortbyrank = request.getParameter("sortbyrank");
		String remove = request.getParameter("delete");
		String reset = request.getParameter("reset");

		SetOperations setOperations = new SetOperations();
		TouristPlace places = new TouristPlace(name,destination,rank);
		
		  if(add!=null) {
		  request.setAttribute("bucketListadd",setOperations.add(places));
		  request.setAttribute("message", "user added successfully"); 
		  RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
		  rd.forward(request, response);
		  }
		  
		  
		  if(remove!=null) { 
		  request.setAttribute("bucketListremove",setOperations.remove(places) );
		  RequestDispatcher
		  rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
		  rd.forward(request, response);
		  }
		 
		 

		/*
		 * if(sortbydestination!=null) { // call the sortByDestination method and store
		 * the return value in a set variable
		 * 
		 * 
		 * request.setAttribute("bucketList", pass the return value ); RequestDispatcher
		 * rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
		 * rd.forward(request, response); }
		 * 
		 * if(sortbyrank!=null) { // call the sortByRank method and store the return
		 * value in a set variable
		 * 
		 * request.setAttribute("bucketList", pass the return value ); RequestDispatcher
		 * rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
		 * rd.forward(request, response); }
		 * 
		 * if(reset!=null) { // call the reset method and store the return value in a
		 * set variable
		 * 
		 * request.setAttribute("bucketList", pass the return value ); RequestDispatcher
		 * rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/list.jsp");
		 * rd.forward(request, response); }
		 */

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
