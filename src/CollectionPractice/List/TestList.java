package CollectionPractice.List;

public class TestList implements Comparable<TestList>{
    private int var1;
    private String var2;
    private double var3;

    public TestList(int var1, String var2, double var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public double getVar3() {
        return var3;
    }

    public void setVar3(double var3) {
        this.var3 = var3;
    }

    public String toString()
    /** Overwrite toString method */
    {
        return "\nvar1: " + this.var1 + "\nvar2: " +this.var2 + "\nvar3: " + this.var3;
    }

    public int compareTo(TestList tl)
    {
        if(this.var1 < tl.var1)
        {
            return -1;
        }
        else if(this.var1 > tl.var1)
            return 1;
        else
        {
            if(Math.abs(this.var3 - tl.var3) < 1e-12)
            {
                return this.var2.compareTo(tl.var2);
            }
            else
            {
                if(this.var3 - tl.var3 < 0) return -1;
                else return 1;
            }
        }
    }
}
