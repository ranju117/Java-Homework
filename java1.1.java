public class Complex
{
    int real,imag;
    public Complex()
    {
     real=0;
     imag=0;
    }
    public Complex(int r,int c)
    {
        real=r;
        imag=c;
    }
    public void add(int r1,int r2,int c1,int c2)
    {
        
        real=r1+r2;
        imag=c1+c2;
        
    }
    public void subtract(int r1,int r2,int c1,int c2)
    {
        
        real=r1-r2;
        imag=c1-c2;
        
    }
    public String toString()
    {
        return String.format("%d+%di",real,imag);
    }

    
}