import java.util.Scanner;

public class bramkarz2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String [] nameList = new String[]{                "Igor", "Rafal","Ilona", "Kasia"        };
        boolean flag = false;
        System.out.println("Czesc, Jak masz na imie?");
        String name = scanner.next();
        for (String n:nameList) {
                   if (name.equals(n)){
                flag = true;
                break;
            }
    }
        if (flag) {
            System.out.println("Zapraszam do Zoo. Zwierzaki juz na Ciebie czekaja");
        } else {
        System.out.println("Nie ma cie na liscie, dlatego placisz 50 zl");
}}}
