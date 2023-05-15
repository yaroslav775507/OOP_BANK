import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id = 0;
        String m = "";
        ArrayList<BankAccount> arrayList = new ArrayList();
        while (!m.equals("End")) {
            Scanner sc = new Scanner(System.in);
            m = sc.nextLine();

            if (m.equals("Create")) {
                id += 1;
                arrayList.add(new BankAccount());
                System.out.println("Account ID" + id + " created");
            }
            else {
                String[] arr = m.split(" ");
                switch (arr[0]) {
                    case "Deposit": {
                        double am = Double.parseDouble(arr[2]);
                        int idi = Integer.parseInt(arr[1]);
                        if (idi < 0 || idi >= arr.length) {
                            System.out.println("Account does not exist");
                        }
                        else {
                            arrayList.get(idi - 1).deposit(am);
                            System.out.println("Deposited " + am + " to ID" + idi);
                        }
                        break;
                    }
                    case "SetInterest":
                        BankAccount.setInteresetRate(Double.parseDouble(arr[1]));
                        break;
                    case "GetInterest": {
                        double year = Double.parseDouble(arr[2]);
                        int idi = Integer.parseInt(arr[1]);
                        if (idi < 0 || idi >= arr.length) {
                            System.out.println("Account does not exist");
                        }
                        else {
                            System.out.println(arrayList.get(idi - 1).getInterest(year));
                        }
                        break;
                    }
                }
            }
        }
    }
}