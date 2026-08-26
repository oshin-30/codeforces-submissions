import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for(int i = 0;i < n;i++){
            score[i] = sc.nextInt();
        }
        int max = score[0];
        int min = score[0];
        int amazing = 0;
        for(int i = 1;i < n;i++){
            if(score[i] > max){
                max = score[i];
                amazing++;
            }
            if(score[i] < min){
                min = score[i];
                amazing++;
            }
        }
        System.out.println(amazing);
    }
}
