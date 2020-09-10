public class Cirrcle {
    private float rad;
    private float diam;
    private float S;
    private float P;
    private float pi;

    Cirrcle () {
        pi = (float) 3.14;
        rad = 1;
    }

    public void setRad(float rad) {this.rad = rad;}

    public void chang() {
        diam = rad * 2;
        P =  2 * pi * rad;
        S = pi * rad * rad;
    }

    public float getDiam() {return diam;}
    public float getP() {return P;}
    public float getS(){return S;}

}
