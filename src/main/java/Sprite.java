import com.raylib.Raylib;

import static com.raylib.Raylib.LoadTexture;

public class Sprite {
    private Raylib.Texture texture;
    public Sprite(String resourcePath)
    {
        this.texture = LoadTexture(resourcePath);
    }
}
