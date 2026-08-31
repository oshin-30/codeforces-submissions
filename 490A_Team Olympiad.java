import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        ArrayList<Integer> t3 = new ArrayList<>();
        for(int i = 0;i < n;i++){
            int s  = sc.nextInt();
            if(s == 1) t1.add(i + 1);
            else if(s == 2) t2.add(i + 1);
            else t3.add(i + 1);
        }
        int teams = Math.min(t1.size(), Math.min(t2.size(), t3.size()));
        System.out.println(teams);
        for(int i = 0; i < teams; i++){
            System.out.println(t1.get(i) + " " + t2.get(i) + " " + t3.get(i));
        }
    }
}
