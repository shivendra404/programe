/*Hangman is a word-guessing game where System give you a word, and you  tries to guess it by suggesting letters(one by one).
 or each incorrect guess, a part of a stick figure ("hangman") is drawn.
The game continues until the word is guessed correctly or the hangman figure is completed. */
import java.util.*;

class HangMan1
{
  public static void main(String[] args)
  {

     String [] arrayelement={"PEIGEON","BEE","CRICKET","POMEGRANATE","LIBRARY","BHUTAN","YELLOW","MOMOS","ELEPHANT","BUS","SPARROW","BUTTERFLY","BASKETBALL","MANGO","PENCIL","BANGLADESH","WHITE","BURGER","ZEBRA","AEROPLANE"};
     String [] arrayElementType={"BIRD","INSECT","SPORT","FRUIT","SCHOOL","COUNTRY","COLOR","FOOD","ANIMAL","TRANSPORT","BIRD","INSECT","SPORT","FRUIT","SCHOOL","COUNTRY","COLOR","FOOD","ANIMAL","TRANSPORT"};
     int score = 0 ;  
     

      Scanner sc=new Scanner(System.in);
      Random random = new Random();
      System.out.println("-----GUESS CORRECT WORD OF NAME.-----");
       
         

     for(int n = 0; n < arrayelement.length; n++)
     { 

     // Generate a random index within the range of the array
     int randomIndex = random.nextInt(arrayelement.length); 

         // Access the element at the random index and display it
          String valuem =arrayelement[randomIndex];
          System.out.println("          -----"+arrayElementType[randomIndex]+"-----");  //this line print arrayelementtype means 'sport' 'fruit'
          
          
          //arrayelemnt in string one by one
          String string=valuem;
      

         char [] arr=string.toCharArray();
     
   
         int indexCount=arr.length;
          
         TreeSet<Character>  mistakeChecker=new TreeSet<Character>();

         for(int j=0;j<indexCount;j++)
         {
           System.out.print(""+"_ ");

           //check the character present in string and store in mistakechecker,  later we will check if alphabet present in  
           //mistakechecker means it not incorrect alphabet
           char a=string.charAt(j);
           mistakeChecker.add(a);
         }
          System.out.print("   "+"- "+indexCount+" LETTER");       //print number of alphabet in arrayelement basketball have 10 alphabet
          System.out.println();
          System.out.println();

    
         int [] arr1=new int[indexCount];
         char ch;
         int mistakes=0;
         int correct=0;
         boolean isTrue = false;
        for(int i=0;i < arr.length;i++)
        { 
         arr1[i]=i;
        }
        

        // add all alphabet in showaplabet and  later remove those element/alphabet that user enter from this list
        LinkedList<Character> showalphabet = new LinkedList<Character>();
        for (char cha = 'A'; cha <= 'Z'; cha++) 
        {
            showalphabet.add(cha);
        } 
        

        // In this list add those alphabet that user enter
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
      

         // here  counting the mistake  means if user enter incorrect value(not present in 'basketball' word that is incorrect) 
         //then we count that value and call printperson() methode
         boolean istrue=mistakeChecker.contains(ch);
         if(!istrue)
         {
            mistakes++;
             printPerson(mistakes,string,score);

          
         }
         
         //adding and removing element in these list
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
         if(correct==indexCount){
         System.out.println();
         System.out.println();
         score =score+5;
         System.out.println("your score is - " +score);

         System.out.println("      YOU WIN THIS LEVEL");}
         System.out.println();
         System.out.println();
         System.out.println();
       
         System.out.print("DON'T ENTER THESE LETTER AGAIN "+addalphabet); //addalphabet contain those alphabet which user enter
         System.out.println();
         System.out.print("PLEASE ENTER THESE LETTER      "+showalphabet); //showalphabet contain those alphabet which user not enter
         System.out.println();
         System.out.println();
         
        } 
        System.out.println("IF YOU WANT TO QIUTE THE GAME THEN PRESS Q Otherwise press N");
        char quite=sc.next().charAt(0);
        if(quite=='q'||quite=='Q')
       {  

        break;
       }

       

     }
    

   }



  //THIS METHOD PRINT HANGMAN WHEN USER ENTER INCORRECT VALUE
  static void printPerson(int mistakes,String string ,int score)
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
       System.out.println("THE CORRECT WORD WAS - "+answer);
        System.out.println("SCORE" + score);
          break;

      
     }    
  

  }

}