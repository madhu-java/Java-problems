import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        int qmarkPosition = url.indexOf('?');
        String subUrl = url.substring(qmarkPosition + 1);
        String[] urlParameters = subUrl.split("&");
        String password = "";
        String passwordValue = "";
        for (String s : urlParameters) {
            String[] eachParam = s.split("=");
            if (eachParam[0].equals("pass")) {
                password = "password";
                passwordValue = eachParam[1];
            }

            System.out.print(eachParam[0]);
            if (eachParam.length == 1) {
                System.out.println(" : not found");
            } else {
                System.out.println(" : " + eachParam[1]);
            }
        }
        if (!password.isEmpty()) {
            System.out.println(password + " : " + passwordValue);
        }
    }
}