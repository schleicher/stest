

import javax.servlet.ServletConfig
import javax.servlet.ServletContext
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		println "init"
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		println "service"
		def now = new Date()
		response.writer << '''
<!DOCTYPE html>
<html>
<head>
<title>Title of the document</title>
<base href="http://localhost:8090/stest/"/>
<link rel="stylesheet" type="text/css" href="rsrc/css/main.css"/>
<script type="text/javascript" src="rsrc/js/main.js"></script>
</head>

<body>
The <a href="other.html">content</a> of the document......
</body>

</html> 
'''
	}

}
