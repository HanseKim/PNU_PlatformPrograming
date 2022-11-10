import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

enum StringCommand{ADD, REMOVE,CLEAN, QUIT,INVALID,NONE};

public class StringSetManager {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        ArrayList<String> stringSet = new ArrayList<>();
        while(true){
            final StringCommand command = getCommand(sc);
            if(command == StringCommand.QUIT){
                System.out.println("BYE!");
                break;
            }
            switch(command){
                case ADD:{
                    final String str = getString(sc);
                    boolean containstr=stringSet.contains(str);
                    if(containstr) ;
                    else
                        stringSet.add(str);
                    break;
                }
                case REMOVE:{
                    final String str = getString(sc);
                    stringSet.remove(str);
                    break;
                }
                case CLEAN:{
                    stringSet.clear();
                    break;
                }
                default:{
                    System.out.println("Unknown Command!");
                    break;
                }
            }
            System.out.printf("Element Size: %d, Values = ",stringSet.size());
            System.out.println(stringSet);
        }
    }
    public static StringCommand getCommand(Scanner sc){
        String s = sc.next();
        StringCommand com;
        try{
            com = StringCommand.valueOf(s.toUpperCase(Locale.ROOT));
        }catch (Exception e){
            com = StringCommand.INVALID;
        }
        return com;
    }

    public static final String getString(Scanner sc){
        return sc.nextLine().substring(1);
    }

}
