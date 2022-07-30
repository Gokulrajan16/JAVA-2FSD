package GOkul;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regE {
	public static void main(String[] args) {

	String pattern = "R*";
	String check = "ReRRlar Expressions";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.println(check.substring(c.start(),c.end()));
	}


}
