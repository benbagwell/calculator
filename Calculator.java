public class Calculator{
    private double a;
    private double b;
    private double c = 0;

    Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double add(){
        this.c=this.a + this.b;
        return this.c;
    }

    public double subtract(){
        this.c=this.a-this.b;
        return this.c;
    }

    public double multiply(){
        this.c=this.a*this.b;
        return this.c;
    }

    public double divide(){
        this.c=this.a/this.b;
        return this.c;
    }

    public double geta(){
        return this.a;
    }

    public double getb(){
        return this.b;
    }
    
    public double getc(){
        return this.c;
    }
}