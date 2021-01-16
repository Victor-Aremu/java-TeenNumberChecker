public class TeenNumCheck {
    public static void main(String[] args) {

        //declaring a boolean variable
        boolean evaluate;

        //passing data for first condition
        evaluate= hasTeen(9,99,19);
        //printing out result
        System.out.println(evaluate);

        //passing data for second condition
        evaluate = hasTeen(23,15,42);
        //printing out result
        System.out.println(evaluate);

        //passing data for second condition
        evaluate = hasTeen(22,23,43);
        //printing out result
        System.out.println(evaluate);

        //passing data for fourth condition
        evaluate = isTeen(13);
        //printing out result
        System.out.println(evaluate);

    }
    public static boolean hasTeen(int first, int second, int third){

        //conditional statement to check data
        //returns true when conditions are met
       if (first >= 13 && first <= 19 || second >= 13 && second <= 19 || third >= 13 && third <= 19){

           return true;
        }
       else{
           return false;
       }
    }
    public static boolean isTeen(int number){
        if (number >= 13 && number <= 19){
            return true;
        }
      else {
            return false;
        }
    }

}