package entidade;

import java.util.Scanner;

/**
 *
 * @author PC-SALA1
 */
public class Input {
    public static int Int(){
        return (new Scanner(System.in)).nextInt();
    }
    public static double Double(){
        return (new Scanner(System.in)).nextDouble();
    }
    public static boolean Boolean(){
        return (new Scanner(System.in)).nextBoolean();
    }
    public static String Str(){
        return (new Scanner(System.in)).nextLine();
    }
    public static char Char(){
        return ((new Scanner(System.in)).next()).charAt(0);
    }
}
