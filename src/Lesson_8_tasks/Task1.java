package Lesson_8_tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    int massivSize;
    ArrayList<Integer> arrayList=new ArrayList();
    public void makeMassiveUsingKeybord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину масива");
        massivSize=scanner.nextInt();
    }
    public void vvodMasiva(){
        Scanner scanner = new Scanner(System.in);
   for (int i=0;i<massivSize;i++){
       System.out.println("введите "+i+"-й элемент массива");
       arrayList.add(scanner.nextInt());
   }
    }

    public void printMassive(){
        vvodMasiva();
        System.out.println("Ваш введенный массив: ");
        for (int i=0;i<arrayList.size();i++){
            if (i==arrayList.size()-1){
                System.out.println(arrayList.get(i)+".");
            }else System.out.print(arrayList.get(i)+", ");

        }
    }
    public void sortMassiveByBubbleWay(){
        boolean isSorted=true;
        int buf;
        while (isSorted){
            isSorted=false;
            for (int i=0;i<massivSize-1;i++){
                if (arrayList.get(i)<arrayList.get(i+1)){
                    isSorted=true;
                    buf=arrayList.get(i);
                arrayList.set(i,arrayList.get(i+1));
                arrayList.set(i+1,buf);
                }
            }

        }
    }
  public void   printSortedDescMassive(){
        sortMassiveByBubbleWay();
      System.out.println("Ваш отсортированный массив: ");
      for (int i=0;i<arrayList.size();i++){
          if (i==arrayList.size()-1){
              System.out.println(arrayList.get(i)+".");
          }else System.out.print(arrayList.get(i)+", ");

      }
  }
}
