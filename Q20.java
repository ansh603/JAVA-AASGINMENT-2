class Q20{
    public static void main(String args[]){
        int n=55;
        int i=1;
        int count=0;
        while(i<=n)
        {
            if(n%i==0)
            count++;
            i++;
        }
        if(count==2)
        {
            System.out.println("this is prime no");
        }
        else
        {
            System.out.println("not a prime no");
        }

    }
}