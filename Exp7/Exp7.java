class Experiment7 {

    public static void main(String args[]) {

        for (int i = 0; i < args.length; i++) {

            String original = args[i];

            StringBuffer sb = new StringBuffer(original);
            sb.reverse();

            String reversed = sb.toString();

            if (original.equals(reversed)) {
                System.out.println(original + " is a Palindrome");
            } else {
                System.out.println(original + " is not a Palindrome");
            }
        }
    }
}
