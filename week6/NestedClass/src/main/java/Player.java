public abstract class Player {
    private String name ;
    private int jerseyNumber ;
    protected int speed ;
    // Builder 클래스를 정의하시오. (단, static nested class 로 정의하시오.  )

    protected abstract int getSpeed() ;

    public static class Builder {
        public String type;
        public String name ;
        public int jerseyNumber ;
        protected int speed ;

        public Builder setPlayerType(String type) {
            this.type = type;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setJerseyNumber(int i) {
            this.jerseyNumber=i;
            return this;
        }

        public Builder setSpeed(int i) {
            this.speed = i;
            return this;
        }

        public Player build() {
            if(type.equals("forward")){
                return new Forward(this);
            }
            else if(type.equals("midfielder")){
                return new MidFielder(this);
            }
            else{
                return new Defender(this);
            }
        }
    }
}
