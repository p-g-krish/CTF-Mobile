
public class MyKeyGen {
    public static void main(String[] args) throws Exception {
        String userName = "Your User Name";
        StringBuilder re_userName = new StringBuilder();
        for (int i = 0; i < userName.length() - 2; i += 2) {
            re_userName.append(userName.charAt(i + 1));
            re_userName.append(userName.charAt(i));
        }
        re_userName.append(userName.charAt(userName.length() - 1));
//        System.out.println(re_userName.toString());
        StringBuilder temp = new StringBuilder(Base64.getBase64(re_userName.toString()));
        System.out.println(temp);
        StringBuilder regCode = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            regCode.append(temp.charAt(i));
            if (temp.charAt(i + 1) == '=') {
                break;
            }
            if ((i + 1) % 3 == 0) {
                regCode.append('-');
            }
        }
        System.out.println(regCode);
    }
}
