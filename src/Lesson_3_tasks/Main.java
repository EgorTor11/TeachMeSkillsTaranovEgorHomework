package Lesson_3_tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      buyСomputer();


}
    public static void buyСomputer(){
        Compukter compukterNoubukDel=new Compukter(true,true,true,5);
        Compukter compukterNoubukAsser=new Compukter(true,true,true,7);
        Compukter ewmZabuldyga=new Compukter(false,true,false,2);
        System.out.println("для покупки введите номер понравившегося компа \n1-ноут DELL\n2-ноут ASSER\n3-эвм Красный собутыльник");
        Scanner scanner=new Scanner(System.in);
        switch (scanner.nextInt()){
            case 1:Compukter.diagnos(compukterNoubukDel);
            break;
            case 2:Compukter.diagnos(compukterNoubukAsser);
            break;
            case 3:Compukter.diagnos(ewmZabuldyga);
            break;

        }
        Compukter.start();
    }

}
