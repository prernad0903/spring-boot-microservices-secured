package com.sample.repository;

public class StudentRepository {
    
  private int limit;
  private int offset;

  public StudentRepository(){
      
  }

  // public StudentRepository(int limit, int offset){
  //   this.limit = limit;
  //   this.offset = offset;
  // }
  

    /**
     * @return int return the limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     * @param limit the limit to set
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * @return int return the offset
     */
    public int getOffset() {
        return offset;
    }

    /**
     * @param offset the offset to set
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }


    


}
