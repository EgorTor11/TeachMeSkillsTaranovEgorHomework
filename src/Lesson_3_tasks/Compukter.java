package Lesson_3_tasks;

import java.util.Random;
import java.util.Scanner;

public class Compukter {

  static   Scanner scanner=new Scanner(System.in);
    private static int status;
    static  int resourceComp=0;
    boolean processor, ram,hardDrive;
    public Compukter(boolean processor, boolean ram, boolean harddrive,int resourceComp) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = harddrive;
        this.resourceComp = resourceComp;
    }

    public int getResourceComp() {
        return resourceComp;
    }

    public boolean isProcessor() {
        return processor;
    }
    public boolean isRam() {
        return ram;
    }
    public boolean isHardDrive() {
        return hardDrive;
    }
    public static void diagnos(Compukter compukter){
        String processorAvailability;
        String ramAvailability;
        String hardDriveAvailability;
        if (compukter.isProcessor()){
            processorAvailability="еcть";
        }else processorAvailability="нет";
        if (compukter.isRam()){
            ramAvailability="еcть";
        }else ramAvailability="нет";
        if (compukter.isHardDrive()){
            hardDriveAvailability="еcть";
        }else hardDriveAvailability="нет";
        System.out.println("Технические параметры компа\nЖесткий диск: "+hardDriveAvailability+
                "\nПроцессор: "+processorAvailability+
                "\nОперативка: "+ramAvailability+
                "\nРесурс включений: "+compukter.getResourceComp());
    }
    public static void turnOn(){
        System.out.println("для включения вашего допотопного корча в котором возможно нет даже процессора нажмите 0 или 1");
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        if (status==Utils.INVALID){
            scanner.nextInt();
            System.out.println("Компьютер сгорел");}
        if (scanner.nextInt()==random.nextInt(2)){
            System.out.println("Ваш корч включился каким-то чудом (с заботой о клиентах :)");
            status=Utils.ISON;
        }else {
            System.out.println("вы сломали комп");
            status=Utils.INVALID;}
    }
    public static void turnOf(){

        System.out.println("для выключения вашего чуда техники нажмите 0 или 1");
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);

        if (scanner.nextInt()==random.nextInt(2)){
            System.out.println("Ваш корч выключился, слава летающему дуршлаку" );
            status=Utils.ISOF;
        }else {
            System.out.println("вы сломали комп");
            status=Utils.INVALID;
        }
    }
    public static void start(){
       for (int i=0;i<=resourceComp;){
           if (i==resourceComp){
              status= Utils.INVALID;
               System.out.println("Истек ресурс включений");
               turnOn();
       }
           turnOn();
           if(status==Utils.ISON){
               turnOf();
           }
           if (status==Utils.INVALID){
               break;
           }
           if (status==Utils.ISOF){
               i++;

           }
       }
    }
}
