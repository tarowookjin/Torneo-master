import android.util.Log;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class reversible {
    Stack < String > E = new Stack < String >();

    public int Voltear_numero(String num){
        String res=null;
        String[] numero=num.split("");
        int result=0;
        for (int i=0;i<=numero.length-1;i++){
            E.push(numero[(numero.length-1)-i]);
        }
        res=E.toString().replaceAll("[\\]\\[,]", "");
        res=res.replaceAll("\\s", "");
        result=Integer.parseInt(res);
        return result;
    }

    public boolean impar (int num , int num2){
        boolean b=false;
        int res = num+num2;
        res=res%2;

        if (res==0){
            b=false;
        }else{
            b=true;
        }

        return b;
    }

    public boolean reversible(int num2){
        boolean b=false;
        if (num2>=10){
            b=true;
        }else{
            b=false;
        }

        return b;
    }

        public ArrayList listar(int cifra){
            ArrayList<String> mylist = new ArrayList<String>();
            switch (cifra){
                case 2:{
                    int num2=0;
                    for (int i=0; i<=99; i++) {
                        num2=Voltear_numero(Integer.toString(i));
                        if (reversible(num2)==true) {
                            if(impar(i, num2)==true) {
                                mylist.add(Integer.toString(i));
                            }
                        }
                    }
                break;}

                case 3:{
                    int num2=0;
                    for (int i=100; i<=990; i++) {
                        num2=Voltear_numero(Integer.toString(i));
                        if (reversible(num2)==true) {
                            if(impar(i, num2)==true) {
                                mylist.add(Integer.toString(i));
                            }
                        }
                    }
                break;}

                default:{break;}
            }
            return mylist;
        }
}


