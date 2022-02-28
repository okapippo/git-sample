 public class ArgsLastPrinter {
   public static void main(String[] args) {
     for (int i = 0; i < args.length; i++) {
       System.out.println(args[i]);
     }

     if (args.length == 0){
       System.out.println("なし");
     }
     else{
       System.out.println(args[args.length]);
     }



    }
 }