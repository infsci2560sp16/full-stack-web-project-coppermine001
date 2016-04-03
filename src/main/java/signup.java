import java.sql.Connection;
import java.util.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;
import com.heroku.sdk.jdbc.DatabaseUrl;
import java.text.SimpleDateFormat;

public class signup {
	
	public signup(){
		get("/signup_action", (req, res) ->{
			Map<String, Object> attributes = new HashMap<>();
			String UserName = req.queryParams("UserName");
			String UserPassword = req.queryParams("UserPassword");
			
			attributes.put("message", "test page");
			attributes.put("UserName", UserName);
			attributes.put("UserPassword", UserPassword);
			
			return new ModelAndView(attributes, "signup_action.ftl");
		}, new FreeMarkerEngine());
	}
}
