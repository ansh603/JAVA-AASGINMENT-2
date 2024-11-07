class addition{
    int a,b,c;
    public
    addition(){
         a=15;
         b=15;
    }
    void show(){
        c=a+b;
        System.out.println("Addition is:  "+c);
    }
};

 class Q31{
    public static void main(String[] args) {
        addition x = new addition();
         x.show();
    }
 }