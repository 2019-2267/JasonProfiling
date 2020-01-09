package profiling;

import java.util.Scanner;

public class JasonProfiling {

    
    int Store=0;
    int ProfileCounter=1;
    int deductor = 10;

    String[] Name = new String[10];
    String[] email = new String[10];
    String[] password = new String[10];
    String[] number = new String[10];
    String[] age = new String[10];

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
     JasonProfiling name;
        name = new JasonProfiling();
        name.Entry();
 
    
}

 

  public void ProfileEnter() {
        int profilenum = 1;
        Run:
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("Profile number " + ProfileCounter);
            System.out.print("Enter your name: ");
            Name[Store]=sc.next();
            System.out.print("Enter your age: ");
            age[Store] = sc.next();
            System.out.print("Enter your contact number: ");
            number[Store] = sc.next();
            System.out.print("Enter your email address: ");
            email[Store] = sc.next();
            System.out.print("Enter your password: ");
            password[Store] = sc.next();
            ProfileCounter++;
            Store++;
            deductor--;
if(deductor==0){

System.out.println("Sorry Maximum Profile Reached");
break;

}
            boolean Execute = true;
            Run1:
            while (Execute) {

                System.out.println("-----------------------------");
                System.out.println("What do you wish to do after?");
                System.out.println("1. Do you want to Add another profile?");
                System.out.println("2. Show All Profiles ?");
                System.out.println("3. Search  Profiles?.");
                System.out.println("4. Exit.");
                int Pili = sc.nextInt();
                

                switch (Pili) {
                    case 1:
                        continue Run;
                    case 2:
                        for (int j = 0; j < Name.length - deductor; j++) {
                            System.out.println("-----------------------------");
                            System.out.println("Profile No. " + profilenum++ + "\n");

                            System.out.println("Name: " + Name[j]);
                            System.out.println("Age: " + age[j]);
                            System.out.println("Email: " + email[j]);
                            System.out.println("Password: " + number[j]);
                            System.out.println("-----------------------------");
                        
                         continue Run1;
                        }
                      
                    case 3:
                        System.out.println("Enter Profile name!");
                        sc.nextLine();
                        String Pangalan = sc.nextLine();

                        for (int i = 0; i < Name.length; i++) {

                            if (Pangalan.equals(Name[i])) {
                                while (Pangalan.equals(Name[i])) {
                                    System.out.println("-----------------------------");
                                    System.out.println("Name: " + Name[i]);
                                    System.out.println("Age: " + age[i]);
                                    System.out.println("Email: " + email[i]);;
                                    System.out.println("Number: " + number[i]);
                                    System.out.println("-----------------------------");
                                    continue Run1;
                                }
                            }
                        }
               case 4:
                         System.exit(0);
                }

            }
        }

    }
                    
  public void Entry() {
        Scanner sc = new Scanner(System.in);

        boolean profile = true;
        pro:
        while (profile) {
            System.out.println("There are only 10 available profiles");
            System.out.println("Do you want to create a profile?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int answer = sc.nextInt();
            if (answer == 1) {
                ProfileEnter();
            } else if (answer == 2) {
                System.exit(0);
            }

        }

 }
}