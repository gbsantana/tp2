public class Recursao {
    public static int soma(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return n + soma(n-1);
    }

    public static int fatorial(int n){
        if (n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return n * fatorial(n-1);
    }

    public static int fibonacci(int n){
        if (n == 0)
            return 0;
        else if ( n ==1)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n - 2);
    }

    public static boolean palindroma(String s){
        s = s.trim().toLowerCase();
        if (s.isEmpty() || s.length()== 1)
            return true;
        else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                String substring = s.substring(1, s.length() - 1);
                System.out.println(substring);
                return palindroma(substring);
            }
        }
        return false;
    }
}
