package panAadharMacherApp;

import java.util.HashMap;
import java.util.Map;

public class PanService {

    private static Map<String, PanDetails> panMap = new HashMap<>();

    static {
       panMap.put("JGPK012K", new PanDetails("JGPK012K","123456","SBI","FD,LIC"));
       panMap.put("AAAA012K", new PanDetails("AAAA012K","123457","BOI","FD"));
    }

    public PanDetails getPanByAadharNumber(String aadhaarNumber)
    {
        for(PanDetails pan: panMap.values())
        {
            if(pan.getAadharNumber().equals(aadhaarNumber))
            {
                return pan;
            }
        }
        return null;
    }
}
