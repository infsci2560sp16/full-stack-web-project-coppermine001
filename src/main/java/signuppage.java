import java.sql.Connection;
import java.util.*;

import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;

import java.text.SimpleDateFormat;

public class signuppage {
	public signuppage(){
	get("/signup", (req, res) -> {
		Map<String, Object> attributes = new HashMap<>();
		attributes.put("hehe", "Welcome to Chattingroom!");
		
		return new ModelAndView(attributes, "signup.ftl");
	}, new FreeMarkerEngine());
}
}
