public class HelloWorld 
{
    public static void main(String[] args) 
    {
        boolean fizzcheck = false;
        boolean buzzcheck = false;
        for(float i =0; i<=100; i++){
            fizzcheck = false;
            buzzcheck = false;
            for(int xthree = 33; xthree > 0; xthree-- ){
             if(i/ (xthree * 3) == 1){
                 fizzcheck = true;
             }
            }
            for(int xfive = 20; xfive > 0; xfive--){
                if(i/(xfive * 5) == 1){
                    buzzcheck = true;
                }
            }
            if (fizzcheck == false && buzzcheck == false){
               System.out.println(i); 
            }else{
                if(fizzcheck == true && buzzcheck == true){
                    System.out.println("fizzbuzz");
                }else{
                    if( fizzcheck == true){
                        System.out.println("fizz");
                    }else{
                        if(buzzcheck == true){
                            System.out.println("buzz");
                        }   
                    }
                }
            }
        }
    }
}
