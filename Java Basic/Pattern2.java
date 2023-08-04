public class Pattern2{
    public static void Hollow(int row, int col){
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=col; j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }
        System.out.println();

        }
    }

    // for printing half-pyramid with Nuymbers 

    public static void halfPyramid(int n){
       
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    // for FLOYD'S triangle 
    public static void Ftriangle(int n){
       int counter = 1; 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }

    // for 0 1 triangle 
    public static void Btriangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

        System.out.println();
            
    }

        for(int i=1; i<=n; i++){
              for(int j = 1; j<=(n-i+1); j++){
                System.out.print("*");
              }  

              for(int j = 1; j<=2*(i-1); j++){
                System.out.print(" ");
              }

              for(int j = 1; j<=(n-i+1); j++){
                System.out.print("*");
              } 

        System.out.println();

        }
    }


    // For rombus
    public static void rombus(int n){
        for(int i=1; i<=5; i++){
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }

            // for(int j = 1; j<=4-(n-1); j++){
            //     System.out.print(" ");
            // }
            
        System.out.println();

        }
    }
    public static void main(String args[]){
        // Hollow(8, 20);
        // halfPyramid(5);
        Ftriangle(5);
        // Btriangle(5);
        // butterfly(8);
        // rombus(10);
         
    }
}