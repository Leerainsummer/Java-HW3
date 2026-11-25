package EXTRA;
import java.util.ArrayList;
import java.util.Collections;
// java.util：儲存、驗證及排序成績。
public class Example01_Grades {
    public static void main(String[] args) {
        ArrayList<Integer> grades=new ArrayList<>();
        for(int score : new int[]{85,92,78,100,64}) {
            if(score<0 || score>100) throw new IllegalArgumentException("成績須介於0與100");
            grades.add(score);
        }
        Collections.sort(grades,Collections.reverseOrder());
        int total=0; for(int score:grades) total+=score;
        System.out.println("成績由高到低："+grades);
        System.out.printf("平均：%.2f%n",(double)total/grades.size());
    }
}
