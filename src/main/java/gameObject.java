import com.raylib.Jaylib;
import com.raylib.Jaylib.Vector2;

public class gameObject {
    public Vector2 postion;
    public Vector2 speed;
    private Sprite texture;
    public Jaylib.Color color;
    public gameObject(Vector2 pos, Vector2 speed, Jaylib.Color color, String texturePath)
    {
        this.postion = pos;
        this.speed = speed;
        this.color = color;
        texture = new Sprite(texturePath);
    }
}
