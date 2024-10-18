package panAadharMacherApp;

import java.util.Scanner;

public class PanAadharMacheraApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AadharService aadharService = new AadharService();
        PanService panService = new PanService();

        System.out.println("Enter Aadhaar Number :");
        String aadharNumber  = sc.nextLine();

        AadharDetails aadharDetails = aadharService.getAadharByNumber(aadharNumber);
        PanDetails panDetails= panService.getPanByAadharNumber(aadharNumber);

        if(aadharDetails!=null && panDetails!=null)
        {
            System.out.println("Aadhar Details : "+aadharDetails);
            System.out.println("Pan Details : "+panDetails);


        }
        else {
            System.out.println("No Match found..");

        }
    }
}
