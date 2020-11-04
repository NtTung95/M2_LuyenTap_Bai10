package program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputRegex {
//    private static final String NAME_REGEX = "^(([A-Z].*+)\\s?)+$";
    private static final String NAME_REGEX = "([A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ].*\\s?){2,}$";
    private static final String SBD_REGEX = "[A-Z]{2}\\d{4}$";

    public static boolean isNameMatch(String name){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean isSBDMatch(String sbd){
        Pattern pattern = Pattern.compile(SBD_REGEX);
        Matcher matcher = pattern.matcher(sbd);
        return matcher.matches();
    }
}
