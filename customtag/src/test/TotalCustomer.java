package test;
import java.io.IOException;
import java.sql.*;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class TotalCustomer extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/zapfood","root","root");
			PreparedStatement ps=con.prepareStatement("select count(*) from customer");
			System.out.println(ps);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				out.println((rs.getInt(1)));
			}
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
