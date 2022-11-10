public class IntTypeData extends SpecificTypeData<Integer> {
    public IntTypeData(int nextInt) {
        super(nextInt);
    }

    @Override
    public void addData(Integer data) {
        this.data += data;
    }

    // your code here

}