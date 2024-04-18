import com.raylib.Jaylib;
import examples.TexturesBunnymarkMoreJavaLike;

import static com.raylib.Jaylib.*;
import static com.raylib.Raylib.*;

public class Main {
    static class Col{
        int r;
        int g;
        int b;
        int a;
    }
    public static void main(String args[]) {
        // Initialization
        //--------------------------------------------------------------------------------------
        int screenWidth = 800;
        int screenHeight = 800;

        InitWindow(screenWidth, screenHeight, "Summon The Will");

        // Load GameObjects
        gameObject Player = new gameObject(new Jaylib.Vector2(0,0), new Jaylib.Vector2(0,0), new Jaylib.Color(),"resources/wabbit_alpha.png");
        //"resources/wabbit_alpha.png"

        SetTargetFPS(60);               // Set our game to run at 60 frames-per-second
        // --------------------------------------------------------------------------------------
        while (!WindowShouldClose())    // Detect window close button or ESC key
        {
            //Input

            //Update Positions

            //Rendering
            BeginDrawing();
            ClearBackground(RAYWHITE);


            DrawRectangle(0, 0, screenWidth, 40, BLACK);
            //DrawText(TextFormat("bunnies: "+bunniesCount), 120, 10, 20, GREEN);

            DrawFPS(10, 10);

            EndDrawing();
        }

        //UnloadTexture(texBunny);    // Unload bunny texture
        CloseWindow();              // Close window and OpenGL context
    }
}