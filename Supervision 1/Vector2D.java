public class Vector2D {
    private float x;
    private float y;

    public Vector2D(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){return x;}
    public float getY(){return y;}
    public void setX(float x){this.x=x;}
    public void setY(float y){this.y=y;}

    public void add(Vector2D v){this.x += v.x; this.y += v.y;}
    public void scale(float s){this.x = this.x * s; this.y = this.y * s;}
    public float magnitude(){return (float) (Math.sqrt((this.x*this.x)+(this.y*this.y)));}
    public void normalise(){
        float mag = this.magnitude();
        this.scale(1/mag);
    }
}
