package basic;

public enum Size {
    HUGE(10), SMALL(2),MEDIUM(5);

    private int size;
    Size(int i) {
        this.size = i;
    }

    public int getSize() {
        return size;
    }
}
