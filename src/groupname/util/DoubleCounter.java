package groupname.util;

public class DoubleCounter extends BasicCounter {
    public DoubleCounter(int start) {
        super(start);
      } // DoubleCounter(int)


      @Override
      public void increment()  { 
        super.increment();
        super.increment();
      } // increment()
      
} // class DoubleCounter 