class Pattern {
    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
