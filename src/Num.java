public class Num
{
    private int value;
    //Sets up new Num object, storing an initial value
    public Num (int update)
    {
        value = update;
    }//end Num
    //Returns stored integer value
    public int getValue ()
    {
        return value;
    }//end int getValue
    //Sets stored value to newly specified value
    public void setValue (int update)
    {
        value = update;
    }//end setValue
    //Returns stored integer value as a string
    public String toString ()
    {
        return value + "";
    }
}//end class Num
