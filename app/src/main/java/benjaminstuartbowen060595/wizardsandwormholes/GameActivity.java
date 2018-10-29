package benjaminstuartbowen060595.wizardsandwormholes;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import android.os.Bundle;

public class GameActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(new GameView(this));
    }

}
