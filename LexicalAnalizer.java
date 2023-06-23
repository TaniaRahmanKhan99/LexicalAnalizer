import java.io.*;
import java.util.*;
public class LexicalAnalizer{
  public static void main (String [] args){
    try{
            ArrayList<String> k1 = new ArrayList<String>();
            ArrayList<String> k2 = new ArrayList<String>();
            ArrayList<String> k3 = new ArrayList<String>();
            ArrayList<String> k4 = new ArrayList<String>();     
            ArrayList<String> k5 = new ArrayList<String>();
            ArrayList<String> k6 = new ArrayList<String>();
     String []keywords= {"int", "float", "if", "else"};
     String []Identifiers= {"a", "b", "c", "d", "e"};
     String []MathOperators= {"+", "-", "*", "/", "="};
     String []LogicalOperator= {">", "<", "<=", "=>"};
     String []NumericalValues= {">", "<", "<=", "=>"};
     String []Others= {"5" , "6", "2.0", "6.0"};
    File f= new File("E:\\CSE420\\420_lab01.txt");
    BufferedReader obj= new BufferedReader(new FileReader(f));
    String str;
       while ((str=obj.readLine()) != null) {
       //System.out.println(str);
      // str = obj.readLine();
       String [] s= str.split(" ");
         for (String a: s){
       //  System.out.println(a);
           
        
           boolean r1= Arrays.asList(keywords).contains(a);
           if(r1== true){
             
             k1.add(a);
//             HashSet <String> hSetKeys  = new HashSet(k1);
//              for(String b1  : hSetKeys ){
//             
//             // System.out.print(b1+" ");
//              }
           }
           boolean r3= Arrays.asList(MathOperators).contains(a);
           if(r3== true){
             
             k3.add(a);
//             HashSet <String> hSetmath  = new HashSet(k3);
//              for(String b3  : hSetmath ){
//             
//             // System.out.print(b3+" ");
//              }
           }
            boolean r4= Arrays.asList(LogicalOperator).contains(a);
           if(r4== true){
             
             k4.add(a);

           }
           
            boolean r5= Arrays.asList(Others).contains(a);
           if(r5== true){
             
             k5.add(a);

           }
            boolean r6= Arrays.asList(NumericalValues).contains(a);
            if(r6==true){
           if ( Character.isDigit(a.charAt(0)) )
            {
             k6.add(a);
         // System.out.println("String begins with a digit");
            }
            }
            //boolean r2= Arrays.asList(identifiers).contains(a);
           else{
           k2.add(a);
           }
           
           
         }
       }
       System.out.print("Keywords: ");
         HashSet <String> hSetkey  = new HashSet(k1);
       Iterator itr1= hSetkey.iterator();
       while(itr1.hasNext()){
       System.out.print(itr1.next()+ ",");
       }
       System.out.println();
       
       System.out.print("idetifiers: ");
         HashSet <String> hSetid  = new HashSet(k2);
       Iterator itr2= hSetid.iterator();
       while(itr2.hasNext()){
       System.out.print(itr2.next()+ ",");
       }
       System.out.println();
       
       System.out.print("MathOperators: ");
         HashSet <String> hSetmath  = new HashSet(k3);
       Iterator itr3= hSetmath.iterator();
       while(itr3.hasNext()){
       System.out.print(itr3.next()+ ",");
       }
       System.out.println();
       
        System.out.print("LogicalOperators: ");
         HashSet <String> hSetlogical  = new HashSet(k4);
       Iterator itr4= hSetlogical.iterator();
       while(itr4.hasNext()){
       System.out.print(itr4.next()+ ",");
       }
       System.out.println();
       
       System.out.print("Numerical values: ");
         HashSet <String> hSetnum  = new HashSet(k6);
       Iterator itr6= hSetnum.iterator();
       while(itr3.hasNext()){
       System.out.print(itr6.next()+ ",");
       }
              System.out.println(); 
       
       System.out.print("Others: ");
         HashSet <String> hSetother  = new HashSet(k5);
       Iterator itr5= hSetother.iterator();
       while(itr5.hasNext()){
       System.out.print(itr5.next()+ ",");
       }
       System.out.println(); 
       
       
       
    }
    catch(Exception e){
    System.out.println(e);
    }
  }
}