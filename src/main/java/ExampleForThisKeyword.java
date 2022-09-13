public class ExampleForThisKeyword {
    private int a;
    private int b;
    public ExampleForThisKeyword(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        return this.a + this.b;
    }
    public ExampleForThisKeyword sendMeTheObject(){
        return this;
    }
}

