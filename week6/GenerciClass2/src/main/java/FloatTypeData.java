public class FloatTypeData extends SpecificTypeData<Float> {
    public FloatTypeData(float nextFloat) {
        super(nextFloat);
    }

    @Override
    public void addData(Float data) {
        this.data += data;
    }

    // your code here

}