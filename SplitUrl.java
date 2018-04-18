import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by krishnasfamily on 04/12/17.
 */
public class SplitUrl {

    public static void main (String arg[]){
        long startTime = System.currentTimeMillis();
        regExpression(arg[0]);
        long endTime = System.currentTimeMillis();
        System.out.println("Seconds take for execution is:"+(endTime-startTime) +" MSec");

    }

    public static void regExpression(String url){
        if (null!=url && !url.trim().isEmpty()) {
            Pattern pattern = Pattern.compile("(http[s]?)(://)([^:^/]*)(:)([0-9]*)?(/)([A-Za-z]*)(\\?)([A-Za-z]*)");
            Matcher matcher = pattern.matcher(url);
            matcher.find();
            String protocol = matcher.group(1);
            String domain = matcher.group(3);
            String port = matcher.group(5);
            String uri = matcher.group(7);
            String params = matcher.group(9);
            System.out.println(protocol);
            System.out.println(domain);
            System.out.println(port);
            System.out.println(uri);
            System.out.println(params);
        } else {
            System.out.println("invalid input");
        }
    }

}
