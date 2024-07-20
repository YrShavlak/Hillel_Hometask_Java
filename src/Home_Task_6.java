public class Home_Task_6 {
    public static String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);
        return end.repeat(Math.max(0, n));
    }

    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()){
                result.append(a.charAt(i));
            }
            if (i < b.length()){
                result.append(b.charAt(i));
            }
        }
        return result.toString();
    }

    public static boolean xyzMiddle(String str) {
        int len = str.length();
        int mid = len / 2;
        if (len < 3) return false;

        if (len % 2 != 0) {
            return str.substring(mid - 1, mid + 2).equals("xyz");
        } else {
            String middleLeft = str.substring(mid - 1, mid + 2);
            String middleRight = str.substring(mid - 2, mid + 1);
            return middleLeft.equals("xyz") || middleRight.equals("xyz");
        }
    }

    public static String zipZap(String str) {
        return str.replaceAll("z.p", "zp");
    }

    public static boolean xyzThere(String str) {
        int len = str.length();
        for (int i = 0; i <= len - 3; i++){
            if(str.startsWith("xyz", i)){
                if (i == 0 || str.charAt(i - 1) != '.'){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));

        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));

        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));

        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));

        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }
}
