import java.util.Scanner;

public class App {

    public static class Set {
        final int MAX_SIZE = 100;
        int []arr = new int[MAX_SIZE];

        public void incl (int x) {
            int i = 0;
            if (!IsInArray(x)) {
            while (arr[i] != 0){ 
            i+=1;
            }
            arr[i] = x;
            }
        }

        public boolean IsInArray(int x){
            for (int i : arr){
                if (i==x)
                return true;
            }
            return false;
        }
            
            
        public void excl(int x){
            int i = 0;
            int temp = 0;
            if (IsInArray(x))
               while (arr[i]!=x) i+=1;

            while (arr[i]!=0){
                temp = arr[i+1];
                arr[i] = temp;
                i+=1;
            }

        }

        public void search(int x){
            int i = 0;
            if (IsInArray(x)){
                while (arr[i]!=x) i+=1;
                System.out.println(i);
            }
        }

        public Set intersect(Set p){
            Set inter = new Set();
            int i = 0;
            while (arr[i]!=0){
                if (p.IsInArray(arr[i])){
                    inter.incl(arr[i]);
                }
                i+=1;
            }
            return inter;
        }

        public void print(){
            System.out.println("\nThe set:");
            int i = 0;
            while (arr[i]!=0) {
                System.out.print(arr[i]);
                i+=1;
            }
        }
    }

    public static void Menu(){
        System.out.println("\n");
        System.out.println("1 - Create the 1st set");
        System.out.println("2 - Create the 2nd set");
        System.out.println("3 - Include elements in 1st set");
        System.out.println("4 - Include elements in 2nd set");
        System.out.println("5 - Exclude elements from the 1st set");
        System.out.println("6 - Exclude elements from the 2nd set");
        System.out.println("7 - Search the element in the 1st set");
        System.out.println("8 - Search the element in the 2nd set");
        System.out.println("9 - Find the intersection of sets");
        System.out.println("10 - Output the 1st set");
        System.out.println("11 - Output the 2nd set");
        System.out.println("12 - exit");

    }
    public static void main(String[] args) throws Exception {

        System.out.println("Application.");

        /*Set set1 = new Set();
        Set set2 = new Set();

        set1.incl(3);
        set1.incl(5);
        set1.incl(6);

        set2.incl(1);
        set2.incl(3);
        set2.incl(6);

        set1.print();
        set2.print();

        Set set3 = set1.intersect(set2);
        set3.print();

        set1.excl(5);
        set2.excl(3);

        set1.print();
        set2.print();*/
        
        Scanner scanner = new Scanner(System.in);

        Set set1 = new Set();
        Set set2 = new Set();
        boolean flag = true;
        while (flag){
            Menu();
            int k = scanner.nextInt();
            switch(k){

               case 1:
               System.out.println("Input the amount of elements");
               int c = scanner.nextInt();
               int temp;
               for (int i = 0; i<c; i++){
                temp = scanner.nextInt();
                set1.incl(temp);}
               System.out.println("A set 1 has been successfully created!");
               break;

               case 2:
               System.out.println("Input the amount of elements");
               c = scanner.nextInt();
               for (int i = 0; i<c; i++){
                temp = scanner.nextInt();
                set2.incl(temp);}
               System.out.println("A set 2 has been successfully created!");
               break;

               case 3:
               System.out.println("Input the amount of elements");
               c = scanner.nextInt();
               for (int i = 0; i<c; i++){
                temp = scanner.nextInt();
                set1.incl(temp);}
                System.out.println("A set 1 has been successfully modified!");
                break;

               case 4:
               System.out.println("Input the amount of elements");
               c = scanner.nextInt();
               for (int i = 0; i<c; i++){
                temp = scanner.nextInt();
                set1.incl(temp);}
                System.out.println("A set 2 has been successfully modified!");
                break;

               case 5:
               System.out.println("Input the amount of elements");
               c = scanner.nextInt();
               for (int i = 0; i<c; i++){
                temp = scanner.nextInt();
                set1.excl(temp);}
                System.out.println("A set 1 has been successfully modified!");
                break;

               case 6:
               System.out.println("Input the amount of elements");
               c = scanner.nextInt();
               for (int i = 0; i<c; i++){
                temp = scanner.nextInt();
                set2.excl(temp);}
                System.out.println("A set 2 has been successfully modified!");
                break;

                case 7:
                System.out.println("Input an element");
                int x = scanner.nextInt();
                set1.search(x);
                break;

                case 8:
                System.out.println("Input an element");
                x = scanner.nextInt();
                set2.search(x);
                break;

                case 9:
                Set set3 = set1.intersect(set2);
                set3.print();
                break;

                case 10:
                set1.print();
                break;

                case 11:
                set2.print();
                break;

                case 12:
                flag = false;

                default:

        }
      }

        //Set set3 = set1.intersect(set2);

    
    }
}
