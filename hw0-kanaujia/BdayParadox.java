import java.util.Random;

public class BdayParadox {

    // gets month and day from total num
    private static String getDate(int day) {
        String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        int cumulativeDays = 0;
        for (int i = 0; i < months.length; i++) {
            cumulativeDays += daysInMonth[i];
            if (day <= cumulativeDays) {
                return months[i] + " " + (day - cumulativeDays + daysInMonth[i]);
            }
        }
        return "";
    }

    public static void main(String[] args) {

        int ss = args.length > 0 ? Integer.parseInt(args[0]) : 111;
        int nn = args.length > 1 ? Integer.parseInt(args[1]) : 23;
        int mm = args.length > 2 ? Integer.parseInt(args[2]) : 0;

        Random rgen = (ss == 0) ? new Random() : new Random(ss);

        if (mm == 0) {
                //generates bdays
                int[] birthdays = new int[nn];
                for (int i = 0; i < nn; i++) {
                    birthdays[i] = rgen.nextInt(365) + 1;
                }

                // prints out the bdays
                System.out.println();
                System.out.println("===============The 23 birthdays are:");
                for (int i = 0; i < nn; i++) {
                    String month = getDate(birthdays[i]);
                    System.out.print(month + " " + "\t");
                    if ((i + 1) % 10 == 0) {
                        System.out.println();
                    }
                }
                System.out.println();

                boolean success = false;
                int bday1 = 0;
                int bday2 = 0;
                String date = "";

                //checks for duplicates
                for (int i = 0; i < birthdays.length - 1; i++) {
                    for (int j = i + 1; j < birthdays.length; j++) {
                        if (birthdays[i] == birthdays[j]) {
                            bday1 = i + 1;
                            bday2 = j + 1;
                            date = getDate(birthdays[i]);
                            success = true;
                            break;
                        }
                    }
                
                }

                if (success) {
                    System.out.println("The " + bday1 + "-th bday and " + bday2 + "-th bday are equal: " + date);
                } else {
                    System.out.println("No duplicates found in 23 birthdays!");
                }
                System.out.println();
            } else if (mm == 1) {
            boolean success = false; 
            int trials = 0;

            while(!success){
                //generates birthdays
                int[] birthdays = new int[nn];
                for (int i = 0; i < nn; i++) {
                    birthdays[i] = rgen.nextInt(365) + 1;
                }
                //checks if true
                for (int i = 0; i < birthdays.length - 1; i++) {
                    for (int j = i + 1; j < birthdays.length; j++) {
                        if(birthdays[i] == birthdays[j]){
                            success = true;
                        }
                    }
                }
                trials++;
            }
            System.out.println();
            System.out.println("The total number of failed trials is " + (trials-1));
            System.out.println();
        }
    }
}








