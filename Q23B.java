class Q23B{
    public static void main(String[] args) {
        int i,j,k=1;
        for(i=1;i<=4;i++){
            for(j=4-i;j>=1;j--){
                System.out.print(" ");
            }
            for ( j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for ( j = 2; j <= i; j++) {
                System.out.print(j);
            }


            System.out.println();
        }
        
    }
}