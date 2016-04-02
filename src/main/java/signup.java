import java.sql.Connection;
import java.util.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;
import com.heroku.sdk.jdbc.DatabaseUrl;
import java.text.SimpleDateFormat;

public class signup {
	
	public signup(){
		get("/signup", (req, res) ->{
			Map<String, Object> attributes = new HashMap<>();
			String login_username = req.queryParams("login_username");
			String login_password = req.queryParams("login_password");
			
			attributes.put("message", "test page");
			attributes.put("login_username", login_username);
			attributes.put("login_password", login_password);
			
			return new ModelAndView(attributes, "signup.ftl");
		}, new FreeMarkerEngine());
	}
}
