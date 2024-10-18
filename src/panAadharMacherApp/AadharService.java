package panAadharMacherApp;

import java.util.HashMap;
import java.util.Map;

public class AadharService {
    private static Map<String,AadharDetails> aadharMap = new HashMap<>();

    // why ? : because it runs during the class Loading.
    static {

            aadharMap.put("123456",new AadharDetails("vrij verma","Mr Jitendra Kumar","Harpur"));
            aadharMap.put("123457",new AadharDetails("Prince Upadhaya","Mr Ramesh Upadhayay","Mumbai"));
//            aadharMap.put("1234567",new AadharDetails("Aayush","Xyz","Bihar"));
    }

    // method for always availability


    public AadharDetails getAadharByNumber(String aadharNumber)
    {
        return aadharMap.get(aadharNumber);
    }
}
