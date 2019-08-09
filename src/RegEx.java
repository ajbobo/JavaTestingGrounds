import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {

		String details = "<https://this.is.a.url/with?query=params>; rel=\"next\"," +
				"   <http://this.is.not.an.https.url/with?query=params>; rel=\"next1\"  , " +
				"<https://this.is.another.url/with?query=params>; rel=\"next2\"";

		String regEx = "(?<url>https://[\\w./?=]+)>; rel=\"(?<rel>\\w+)\"";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(details);
		while (matcher.find()) {
			String url = matcher.group("url");
			String rel = matcher.group("rel");
			System.out.println(rel + " -> " + url);
		}
	}
}
