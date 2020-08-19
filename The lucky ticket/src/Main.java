import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String  ticket= scanner.nextLine();
        int sum=0;
        for(int i=0;i<ticket.length();i++){
            if(i<3) {
                sum = sum + (int) (ticket.charAt(i));
            }else{
                sum = sum - (int) (ticket.charAt(i));
            }

        }
        if(sum==0){
            System.out.println("Lucky");
        }else {
            System.out.println("Regular");
        }

    }
}