package groupname.util;

public class BoundedCounter extends  BasicCounter {
    int bound;
    public BoundedCounter(int start,int bound) {
        super(start);
        this.bound = bound;
      } // NamedCounter(String, int)

      @Override
      public void increment()  { 
        if (this.count < this.bound) {
            super.increment();
        } else {
            throw new IllegalStateException("Counter has reached its bound.");
        }
    }



    
}
