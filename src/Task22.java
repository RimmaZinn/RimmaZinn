public class Task22 {
    //Составить процедуру, "рисующую" на экране горизонтальную линию из 10
    //символов "*"
        public static void main(String[] args) {
        char a = '*';
        int count = 10;
        print(a,count);
                    }

    public static void print(char a, int count) {
        if (count>0){
            count--;
            System.out.print(a + " ");
            print(a, count);
        }

    }
}
