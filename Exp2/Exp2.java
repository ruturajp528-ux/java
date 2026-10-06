class Experiment2 {

    public static void main(String[] args) {

        int i, j, num = 1000, flag;

        for (i = 1; i <= num; i++) {

            flag = 1;

            if (i < 2) {
                flag = 0;
            } else {

                for (j = 2; j < i; j++) {

                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }
            }

            if (flag == 1) {
                System.out.println(i);
            }
        }
    }
}
