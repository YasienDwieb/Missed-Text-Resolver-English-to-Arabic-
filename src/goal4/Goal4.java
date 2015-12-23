
package goal4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasien
 */
public class Goal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating a file to export the output to.
        PrintWriter writer = null;
        File file=new File("yd1.txt");
        //this "while" is working on keeping the program running unless the user wanted to end it.
        while (true){ //while true
            String x,split[],concat="",lower="",upper="";
            x=JOptionPane.showInputDialog(null,"أدخل النص الذى تريد تحويله :","Al_Mo7awel Konan",JOptionPane.PLAIN_MESSAGE);
            lower=x.toLowerCase();
            upper=x.toUpperCase();
            //this is the case when the letters are from one kind "lower or upper".
            if(x==lower||x==upper){
                //we split them to be able to convert each letter solely.
                split=x.split("");
                //here w take each letter in series to conert it.
                for(int i=1;i<split.length;i++){   
                    //switch case for all available letters.
                    switch(split[i].toLowerCase()){
                        case "a":concat+="ش";break;
                        case "b":concat+="لا";break;
                        case "c":concat+="ؤ";break;
                        case "d":concat+="ي";break;    
                        case "e":concat+="ث";break;
                        case "f":concat+="ب";break;
                        case "g":concat+="ل";break;
                        case "h":concat+="ا";break;
                        case "i":concat+="ه";break;
                        case "j":concat+="ت";break;
                        case "k":concat+="ن";break;
                        case "l":concat+="م";break;
                        case "m":concat+="ة";break;
                        case "n":concat+="ى";break;
                        case "o":concat+="خ";break;
                        case "p":concat+="ح";break;    
                        case "q":concat+="ض";break;
                        case "r":concat+="ق";break;
                        case "s":concat+="س";break;    
                        case "t":concat+="ف";break;
                        case "u":concat+="ع";break;
                        case "v":concat+="ر";break;
                        case "w":concat+="ص";break;
                        case "x":concat+="ء";break;
                        case "y":concat+="غ";break;
                        case "z":concat+="ئ";break;
                        case "[":concat+="ج";break;
                        case "]":concat+="د";break;
                        case ";":concat+="ك";break;
                        case "'":concat+="ط";break;
                        case "`":concat+="ذ";break;
                        case "/":concat+="ظ";break;
                        case ".":concat+="ز";break;
                        case ",":concat+="و";break;
                        case "1":concat+="1";break;    
                        case "2":concat+="2";break;
                        case "3":concat+="3";break;
                        case "4":concat+="4";break;
                        case "5":concat+="5";break;
                        case "6":concat+="6";break;
                        case "7":concat+="7";break;
                        case "8":concat+="8";break;
                        case "9":concat+="9";break;
                        case "0":concat+="0";break;
                        case "-":concat+="-";break;
                        case "+":concat+="+";break;
                        case "=":concat+="=";break;
                        case "!":concat+="!";break;
                        case "@":concat+="@";break;
                        case "#":concat+="#";break;
                        case "$":concat+="$";break;
                        case "%":concat+="%";break;    
                        case "^":concat+="^";break;
                        case "&":concat+="&";break;
                        case "*":concat+="*";break;
                        case "(":concat+="(";break;
                        case ")":concat+=")";break;
                        case "_":concat+="_";break;
                        case "{":concat+="{";break;
                        case "}":concat+="}";break;
                        case " ":concat+=" ";break;
                        default :concat+=" ";break;  
                    }
                }
                }
            else {
                int lowerLetters=0,upperLetters=0;
                for(int i=0;i<x.length();i++){
                    if((int)x.charAt(i)<=122&&(int)x.charAt(i)>=97){
                        lowerLetters++;
                    }
                    if((int)x.charAt(i)<=90&&(int)x.charAt(i)>=65){
                        upperLetters++;
                    }
                }
                if(lowerLetters>upperLetters){    
                split=x.split("");
                for(int i=1;i<split.length;i++){   
                switch(split[i]){
                    //Please note that letters in upper and high are both together for each character
                    case "a":concat+="ش";break;
                    case "A":concat+="ِ";break;    
                    case "b":concat+="لا";break;
                    case "B":concat+="لآ";break;    
                    case "c":concat+="ؤ";break;
                    case "d":concat+="ي";break;    
                    case "e":concat+="ث";break;
                    case "E":concat+="ُ";break;
                    case "f":concat+="ب";break;
                    case "g":concat+="ل";break;
                    case "G":concat+="لأ";break;    
                    case "h":concat+="ا";break;
                    case "H":concat+="أ";break;
                    case "i":concat+="ه";break;
                    case "j":concat+="ت";break;
                    case "k":concat+="ن";break;
                    case "l":concat+="م";break;
                    case "m":concat+="ة";break;
                    case "n":concat+="ى";break;
                    case "N":concat+="آ";break;    
                    case "o":concat+="خ";break;
                    case "p":concat+="ح";break;    
                    case "q":concat+="ض";break;
                    case "Q":concat+="َ";break;    
                    case "r":concat+="ق";break;
                    case "s":concat+="س";break;    
                    case "t":concat+="ف";break;
                    case "u":concat+="ع";break;
                    case "v":concat+="ر";break;
                    case "w":concat+="ص";break;
                    case "x":concat+="ء";break;
                    case "y":concat+="غ";break;
                    case "Y":concat+="إ";break;     
                    case "z":concat+="ئ";break;
                    case "[":concat+="ج";break;
                    case "]":concat+="د";break;
                    case ";":concat+="ك";break;
                    case "'":concat+="ط";break;
                    case "`":concat+="ذ";break;
                    case "/":concat+="ظ";break;
                    case ".":concat+="ز";break;
                    case ",":concat+="و";break;
                    case "1":concat+="1";break;    
                    case "2":concat+="2";break;
                    case "3":concat+="3";break;
                    case "4":concat+="4";break;
                    case "5":concat+="5";break;
                    case "6":concat+="6";break;
                    case "7":concat+="7";break;
                    case "8":concat+="8";break;
                    case "9":concat+="9";break;
                    case "0":concat+="0";break;
                    case "-":concat+="-";break;
                    case "+":concat+="+";break;
                    case "=":concat+="=";break;
                    case "!":concat+="!";break;
                    case "@":concat+="@";break;
                    case "#":concat+="#";break;
                    case "$":concat+="$";break;
                    case "%":concat+="%";break;    
                    case "^":concat+="^";break;
                    case "&":concat+="&";break;
                    case "*":concat+="*";break;
                    case "(":concat+="(";break;
                    case ")":concat+=")";break;
                    case "_":concat+="_";break;
                    case "{":concat+="{";break;
                    case "}":concat+="}";break;
                    case " ":concat+=" ";break;
                    default :concat+=" ";break;  
                }
            }
            }
            else {
                    split=x.split("");
                for(int i=1;i<split.length;i++){   
                switch(split[i]){
                    //Please note that letters in upper and high are both together for each character
                    case "A":concat+="ش";break;
                    case "a":concat+="ِ";break;
                    case "B":concat+="لا";break;
                    case "b":concat+="لآ";break;    
                    case "C":concat+="ؤ";break;
                    case "D":concat+="ي";break;    
                    case "E":concat+="ث";break;
                    case "e":concat+="ُ";break;
                    case "F":concat+="ب";break;
                    case "G":concat+="ل";break;
                    case "g":concat+="لأ";break;    
                    case "H":concat+="ا";break;
                    case "h":concat+="أ";break;
                    case "I":concat+="ه";break;
                    case "J":concat+="ت";break;
                    case "K":concat+="ن";break;
                    case "L":concat+="م";break;
                    case "M":concat+="ة";break;
                    case "N":concat+="ى";break;
                    case "n":concat+="آ";break;    
                    case "O":concat+="خ";break;
                    case "P":concat+="ح";break;    
                    case "Q":concat+="ض";break;
                    case "q":concat+="َ";break;
                    case "R":concat+="ق";break;
                    case "S":concat+="س";break;    
                    case "T":concat+="ف";break;
                    case "U":concat+="ع";break;
                    case "V":concat+="ر";break;
                    case "W":concat+="ص";break;
                    case "X":concat+="ء";break;
                    case "Y":concat+="غ";break;
                    case "y":concat+="إ";break;     
                    case "Z":concat+="ئ";break;
                    case "[":concat+="ج";break;
                    case "]":concat+="د";break;
                    case ";":concat+="ك";break;
                    case "'":concat+="ط";break;
                    case "`":concat+="ذ";break;
                    case "/":concat+="ظ";break;
                    case ".":concat+="ز";break;
                    case ",":concat+="و";break;
                    case "1":concat+="1";break;    
                    case "2":concat+="2";break;
                    case "3":concat+="3";break;
                    case "4":concat+="4";break;
                    case "5":concat+="5";break;
                    case "6":concat+="6";break;
                    case "7":concat+="7";break;
                    case "8":concat+="8";break;
                    case "9":concat+="9";break;
                    case "0":concat+="0";break;
                    case "-":concat+="-";break;
                    case "+":concat+="+";break;
                    case "=":concat+="=";break;
                    case "!":concat+="!";break;
                    case "@":concat+="@";break;
                    case "#":concat+="#";break;
                    case "$":concat+="$";break;
                    case "%":concat+="%";break;    
                    case "^":concat+="^";break;
                    case "&":concat+="&";break;
                    case "*":concat+="*";break;
                    case "(":concat+="(";break;
                    case ")":concat+=")";break;
                    case "_":concat+="_";break;
                    case "{":concat+="{";break;
                    case "}":concat+="}";break;
                    case " ":concat+=" ";break;
                    default :concat+=" ";break;
                }
                }
                }
            }
            try{
                writer = new PrintWriter(new FileWriter(file,true)); 
                writer.println(concat);
            } catch (IOException e) {
                                throw new RuntimeException(e);
                            } finally {
                                writer.close();                    
                           }
            //JOptionPane.showMessageDialog(null,concat);
            int result = JOptionPane.showConfirmDialog(null, concat+"\n\n"+"هل تريد تحويل نص أخر ؟", 
                   "تحويل نص أخر", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION)
            {
                //continue
            }
            else{
                JOptionPane.showMessageDialog(null,"شكرا لاستخدامكم البرنامج  \n\nBy : Yasien Dwieb","الخاتمة",JOptionPane.PLAIN_MESSAGE);
                break; //break out of while loop
            }
        }//end of while
    }
        }