class DynamicArray {

    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity)
            resize();

        arr[size++] = n;
    }

    public int popback() {
       return arr[--size];
    }

    private void resize() {
        int[] newArr = new int[capacity * 2];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
        capacity *= 2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
