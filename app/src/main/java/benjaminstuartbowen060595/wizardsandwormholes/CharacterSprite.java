package benjaminstuartbowen060595.wizardsandwormholes;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class CharacterSprite {
    private Bitmap image;

    public CharacterSprite(Bitmap bmp) {
        image = bmp;
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, 100, 100, null);
    }
}
