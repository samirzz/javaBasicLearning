package thisKeyword;

public final class ThisKeyword {
     static int a;
    ThisKeyword(int a){
      this.a=a;

    }

ThisKeyword (int a,int b){
       b= a+this.a;

}
    public static void main(String[] args) {
        ThisKeyword tkw=new ThisKeyword(4);
        System.out.println(tkw.a);//ans=4
        ThisKeyword tk1 = new ThisKeyword((5));
        System.out.println(tkw.a); //ans=5

    }


}
