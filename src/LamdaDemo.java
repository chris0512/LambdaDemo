
@FunctionalInterface
interface MyLambda
{
   public int add(int x, int y);
}

/*class My implements MyLambda {
    public void display(){
        System.out.println("Hello World");
    }
}
 */

class LambdaDemo {
    public static void main(String[] args) {
        MyLambda m = (a, b)->a + b;
        int r = m.add(20,30);
        System.out.println(r);
    }
}
