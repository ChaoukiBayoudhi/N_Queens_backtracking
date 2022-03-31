import java.util.ArrayList;
import java.util.List;

public class NqueensBacktrackingProblem{
    public static List<List<Integer>> nQueens(int n)
    {
        List<List<Integer>> result = new ArrayList<>();
        solveNQueens(n,0,new ArrayList<Integer>(), result);
        return result;
    }

    public static void solveNQueens(int n, int rowNumber, ArrayList<Integer> colPlacements, List<List<Integer>> result) {
        if(rowNumber ==n)
            result.add(new ArrayList<Integer>(colPlacements));
        else
            for(int j = 0; j <n; j++){
                colPlacements.add(j);
                if(isValid(colPlacements))
                    solveNQueens(n,rowNumber+1,colPlacements,result);
                colPlacements.remove(colPlacements.size()-1);
            }
    }

    public static boolean isValid(List<Integer> colPlacements){
        int rowIndex =colPlacements.size()-1;
        int i = 0;
        boolean ok = true;
        while (i < rowIndex && ok) {
            int diff=Math.abs(colPlacements.get(i)-colPlacements.get(rowIndex));
            if(diff==0 || diff== rowIndex -i){
                ok=false;
            }
            else
                i++;
        }
        return ok;
    }

}
