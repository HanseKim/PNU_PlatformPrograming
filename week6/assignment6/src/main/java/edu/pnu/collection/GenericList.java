package edu.pnu.collection;

public class GenericList <T>{
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size;

    public GenericList() {
        data = new Object[DEFAULT_SIZE];
        size=0;
    }


    public void add(T newStudent) {
        data[size] = newStudent;
        size= size+1;
    }
    public void clear(){
        for(int i=0;i<size;i++){
            data[i] = null;
        }
        size=0;
    }

    public int getSize() {
        return size;
    }

    public T get(int i){
        return (T) this.data[i];
    }
}
