import java.util.*;

class StoreArrayElement
{
  public static void main(String[] args)
  {

     String [] arrayelement={"BASKETBALL","MANGO","PENCIL","BANGLADESH","WHITE","BURGER","ZEBRA","AEROPLANE"};
     String [] arrayElementType={"SPORT","FRUIT","SCHOOL","COUNTRY","COLOR","FOOD","ANIMAL","TRANSPORT"};
       
     
      Scanner sc=new Scanner(System.in);
      System.out.println("-----GUESS CORRECT WORD OF NAME.-----");
       
         
     int n=0;
    

     for(String valuem:arrayelement)
     { 
          System.out.println("          -----"+arrayElementType[n]+"-----");  //this line print arrayelementtype
          n++;

          String string=valuem;
      

         char [] arr=string.toCharArray();
     
   
         int indexCount=arr.length;
          
         TreeSet<Character>  mistakeChecker=new TreeSet<Character>();

         for(int j=0;j<indexCount;j++)
         {
           System.out.print(""+"_ ");
           char a=string.charAt(j);
           mistakeChecker.add(a);
         }
          System.out.print("   "+"- "+indexCount+" LETTER");
          System.out.println();
          System.out.println();

    
          int [] arr1=new int[indexCount];
         char ch;
         int mistakes=0;
         int correct=0;
         boolean isTrue=false;
        for(int i=0;i < arr.length;i++)
        { 
         arr1[i]=i;
        }

        LinkedList<Character> showalphabet = new LinkedList<Character>();
        for (char cha = 'A'; cha <= 'Z'; cha++) 
        {
            showalphabet.add(cha);
        } 

        TreeSet<Character> addalphabet =new TreeSet<Character>();
        TreeSet<Integer> s=new TreeSet<Integer>();

        for(int i=0;i<(arr.length+8);i++)
      
      {

          if(correct==arr.length||mistakes==5)
          {
             break;
          }
         char ch1=(sc.next().charAt(0));
         ch = Character.toUpperCase(ch1);
         for(int j=0;j<arr.length;j++)
         {
           if(ch==arr[j])
           {  s.add(j);
            correct++;
           
           
           }

         }
      
        boolean istrue=mistakeChecker.contains(ch);
         if(!istrue)
         {
            mistakes++;
             printPerson(mistakes,string);

          
         }
         
        addalphabet.add(ch);
        showalphabet.remove(Character.valueOf(ch));
       


        for (int value : arr1) 
        {
           
            boolean found = s.contains(value);		

            // Print the value or a space
         
            if (found) 
            {
                System.out.print(arr[value] + " ");
            }
           else 
           {
                System.out.print("_"+" ");
           }
          
         }
         System.out.println();
         System.out.println();
         System.out.println();
         System.out.print("DON'T ENTER THESE LETTER AGAIN "+addalphabet);
         System.out.println();
         System.out.print("PLEASE ENTER THESE LETTER      "+showalphabet);
         System.out.println();
         System.out.println();
       }
        System.out.println("IF YOU WANT TO QIUTE THE GAME THEN PRESS Q");
        char quite=sc.next().charAt(0);
        if(quite=='q'||quite=='Q')
       {
        break;
       }
     }
    

   }

  

  static void printPerson(int mistakes,String string)
  {
      
      int x=mistakes;
      String answer=string;
      
      switch(mistakes){
       case  0:									
                

       System.out.println("        + ");
       System.out.println("        |");
       System.out.println("        | ");  
       System.out.println("        |");
       System.out.println("        |");
       System.out.println("        | ");   
       System.out.println(" ----------");
           break;
      
          case 1 :

       System.out.println("    +---+ ");
       System.out.println("        |");
       System.out.println("        | ");  
       System.out.println("        |");
       System.out.println("        |");
       System.out.println("        | ");   
       System.out.println("  ----------");
          break;
      
      
     
    case 2 :
     System.out.println("    +----+ ");
       System.out.println("    |\\   | ");
       System.out.println("    | \\  |");
       System.out.println("       \\ | ");  
       System.out.println("        \\|");
       System.out.println("         |");
       System.out.println("         | ");   
       System.out.println("  ----------");
           break;
    
     
   
    case 3 :
       System.out.println("    +----+ ");
       System.out.println("    |\\   | ");
       System.out.println("    | \\  |");
       System.out.println("    O  \\ | ");  
       System.out.println("        \\|");
       System.out.println("         |");
       System.out.println("         | ");   
       System.out.println("  ----------");
        break;
    
    case 4 :
       System.out.println("    +----+ ");
       System.out.println("    |\\   | ");
       System.out.println("    | \\  |");
       System.out.println("    O  \\ | ");  
       System.out.println("   /|\\  \\|");
       System.out.println("         |");
       System.out.println("         | ");   
       System.out.println("  ----------");
        break;
    case 5 :
       System.out.println("    +----+ ");
       System.out.println("    |\\   | ");
       System.out.println("    | \\  |");
       System.out.println("    O  \\ | ");  
       System.out.println("   /|\\  \\|            YOU LOOSE");
       System.out.println("   /'\\   |");
       System.out.println("         | ");   
       System.out.println("  ----------");
       System.out.println("  "+answer);
          break;

      
     }
    
       
  

  }

}