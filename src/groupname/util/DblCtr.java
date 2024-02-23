package groupname.util;

public class DblCtr implements Counter {
    /**
     * The underlying counter.
     */
    Counter base;
  
    /**
     * Build a new counter that counts twice as fast as counter.
     */
    public DblCtr(Counter counter) {      
      this.base = counter;
    } // DblCtr(Counter)

    public DblCtr(BasicCounter BasicCounter) {      
        this.base = BasicCounter;
      } // DblCtr(Counter)

      public DblCtr(DblCtr dblCtr) {      
        this.base = dblCtr;
      } // DblCtr(DblCtr)

    /**
     * Increment the counter, twice.
     * @throws Exception 
     */
    @Override
    public void increment() throws Exception { 
      this.base.increment();
      this.base.increment();
    } // increment()
  
    /**
     * Reset the counter.
     */
    @Override
    public void reset() {
      this.base.reset();
    } // reset()
  
    /**
     * Get the value.
     */
    @Override
    public int get() {
      return this.base.get();
    } // get()
  
    /**
     * Convert to a string.
     */
    @Override
    public String toString() {
      return this.base.toString();
    } // toString()
  } // class DblCtr