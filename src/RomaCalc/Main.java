package RomaCalc;

import com.sun.javafx.collections.MappingChange;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ScriptException {
        System.out.println("введите выражение для расчета используя римские и/или арабские цифры");
        String userStr=new Scanner(System.in).nextLine()+"  ";

        String str="";   //итоговая строка

        char[] userCharArray=userStr.toCharArray();
        Map<String,Integer> hashMapRoma=new HashMap();
        Map<Integer,String> hashMapUserRoma=new HashMap();
        hashMapRoma.put("X",10);
        hashMapRoma.put("I",1);
        hashMapRoma.put("V",5);
       String romaStr;
       int romaInt=0;
        ///////////////////выберем все римские цифры из строки и положим их в мапу
        for (int i=0;i<userCharArray.length-2;i++){
            if((userCharArray[i]=='V'||userCharArray[i]=='I'||userCharArray[i]=='X') && userCharArray[i+1]!='X'&& userCharArray[i+1]!='V'&& userCharArray[i+1]!='I'){
                romaInt=romaInt+hashMapRoma.get(String.valueOf(userCharArray[i]));
                //  System.out.println("romaIntИз 1-го = "+romaInt);
                hashMapUserRoma.put(i,String.valueOf(romaInt));
                romaInt=0;
            }else if(userCharArray[i]=='V'||userCharArray[i]=='I'||userCharArray[i]=='X') {
                if (userCharArray[i] == 'I' && (userCharArray[i + 2] == 'V' || userCharArray[i + 2] == 'X')) {
                    System.out.println("некоректно введено римское число");
                    return;

                } else if (userCharArray[i] == 'I' && (userCharArray[i + 1] == 'V' || userCharArray[i + 1] == 'X')) {
                    romaInt = romaInt - 1;
                }else {romaInt=romaInt+hashMapRoma.get(String.valueOf(userCharArray[i]));
                   // System.out.println("romaInt "+romaInt);
                    }

            }
            }


        ///////////////создадим итоговую строку

        for (int i=0;i<userCharArray.length-2;i++){
            if((userCharArray[i]=='V'||userCharArray[i]=='I'||userCharArray[i]=='X')&& userCharArray[i+1]!='X'&& userCharArray[i+1]!='V'&& userCharArray[i+1]!='I'){
                str=str+hashMapUserRoma.get(i);
            }else if (userCharArray[i]=='V'||userCharArray[i]=='I'||userCharArray[i]=='X'){
                continue;
            }else str=str+String.valueOf(userCharArray[i]);

        }
        System.out.println(str);
///парсим полученную строку готовым парсером , или пишем свой парсер на основе обратной польской нотации, но это уже другая история
        ScriptEngineManager manager=new ScriptEngineManager();
        ScriptEngine engine=manager.getEngineByName("js");
        Object result=engine.eval(str);
        System.out.println("результат = "+result);
    }
}
