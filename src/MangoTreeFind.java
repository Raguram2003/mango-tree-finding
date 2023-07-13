import java.util.Scanner;
public class MangoTreeFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numb er of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of Column: ");
        int c = sc.nextInt();
        System.out.print("Enter the Tree number: ");
        int t = sc.nextInt();
        if((t<=r) || (t%c == 0) || (t%c==1)){ System.out.println("true"); }
        else{ System.out.println("false"); }
    }
}
