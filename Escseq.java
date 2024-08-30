class Esceq {
    public static void main(String[] args) {
        
        int n = 7;
        for (int i = 1; i < 6; i++) {
            if (i % 2 == 1) {
                System.out.println(n);
            } else {
                System.out.println("\t" + n);
            }
            n += 7;
        }
    }
}