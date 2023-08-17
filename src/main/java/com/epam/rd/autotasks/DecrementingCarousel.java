package com.epam.rd.autotasks;

public class DecrementingCarousel {
    private final int capacity;
    protected boolean isRunning;
    int index = 0;
    int counter;
    public int[] carousel;
    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        carousel = new int[capacity];
    }

    public boolean addElement(int element){
        if( element > 0 && !isRunning && index < capacity ){
            carousel[index++] = element;
            return true;
        }else{
            return false;
        }
        //throw new UnsupportedOperationException();
    }

    public CarouselRun run(){
        if( !isRunning ){
            isRunning = true;
            return new CarouselRun(carousel);
        }
        return null;
        //throw new UnsupportedOperationException();
    }
}
