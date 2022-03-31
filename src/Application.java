import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter nomber of Queens ?  ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> result=NqueensBacktrackingProblem.nQueens(n);
        System.out.println("There are "+ result.size()+" possible solutions");
        System.out.println(result.toString());
    }
}
