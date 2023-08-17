package com.epam.rd.autotasks;

public class CarouselRun {
    public int[] carousel;
    protected int i = 0;

    public CarouselRun(int[] carousel){
        this.carousel = carousel;
    }
    /*
    * returns the current value of the current element,
    * then decreases the current element by one and switches to the next element in insertion order.
    * Skips zero elements. When there is no more elements to decrease, returns -1.
    * */
    public int next() {
        if( isFinished() ){
            return -1;
        }else{
            while ( carousel[i %= carousel.length] <= 0 ){
                i++;
            }
        }
         //return carousel[i++]--;

        int current = carousel[i];
        decreaseBy(i,1);
        i++;
        return current;
    }

    public void decreaseBy(int currentIndex,int numForDecrease){
        carousel[currentIndex] -= numForDecrease;
    }

    public boolean isFinished() {
        for( int value : carousel ){
            if( value > 0 ) return false;
        }
        return true;
        //throw new UnsupportedOperationException();
    }

}
