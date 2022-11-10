import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import static java.awt.Desktop.Action.PRINT;

enum Command{ADD,QUIT,PRINT,OTHER};

public class SwitchMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int state=0;
        ArrayList<String> arr = new ArrayList<>();

        while(state==0){
            String str = sc.next();
            Command com;
            try{
                com = Command.valueOf(str.toUpperCase(Locale.ROOT));
            }catch (Exception e){
                com = Command.OTHER;
            }
            switch (com){
                case ADD:
                    int n = sc.nextInt();
                    switch(n){
                        case 1:
                            arr.add("January");
                            break;
                        case 2:
                            arr.add("February");
                            break;
                        case 3:
                            arr.add("March");
                            break;
                        case 4:
                            arr.add("April");
                            break;
                        case 5:
                            arr.add("May");
                            break;
                        case 6:
                            arr.add("June");
                            break;
                        case 7:
                            arr.add("July");
                            break;
                        case 8:
                            arr.add("August");
                            break;
                        case 9:
                            arr.add("September");
                            break;
                        case 10:
                            arr.add("October");
                            break;
                        case 11:
                            arr.add("November");
                            break;
                        case 12:
                            arr.add("December");
                            break;
                    }
                    break;
                case PRINT:
                    System.out.print("[");
                    for(int i=0;i<arr.size();i++){
                        if(i==arr.size()-1) System.out.printf("%s",arr.get(i));
                        else
                            System.out.printf("%s, ",arr.get(i));
                    }
                    System.out.println("]");
                    break;
                case QUIT:
                    state=1;
                    break;
                default:
                    System.out.println("Invalid Command");

            }
            if(state==1) break;
        }
        System.out.print("Bye");
    }
}
