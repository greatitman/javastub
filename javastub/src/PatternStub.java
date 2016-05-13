import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by skyworth on 2016/5/13.
 */
public class PatternStub {

	public static boolean needWordFilePreview(String filename) {
		boolean isNeed = true;
		String pattern = "(.*)\\.(txt|png|gif|jpg|jpeg)$";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

		// Now create matcher object.
		Matcher m = r.matcher(filename);
		if (m.find( )) {
			isNeed = false;
		}

		return isNeed;
	}
}
