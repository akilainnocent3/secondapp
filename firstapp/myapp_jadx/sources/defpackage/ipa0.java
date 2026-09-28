package defpackage;

import android.media.MediaPlayer;
import androidx.recyclerview.widget.r;
import com.sportygames.roulette.activities.RouletteActivity;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class ipa0 {
    public static final int[] b = {201, r.d.DEFAULT_DRAG_ANIMATION_DURATION, 202, 203, 204};
    public final LinkedHashMap a = new LinkedHashMap();

    public ipa0(RouletteActivity rouletteActivity) {
        for (int i = 0; i < 5; i++) {
            int i2 = b[i];
            Pair<String, String> pair = wx50.a.get(Integer.valueOf(i2));
            File file = pair != null ? new File(rouletteActivity.getExternalFilesDir(null), pair.b) : null;
            if (file != null) {
                try {
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    mediaPlayer.setDataSource(file.getAbsolutePath());
                    mediaPlayer.prepare();
                    this.a.put(Integer.valueOf(i2), mediaPlayer);
                } catch (Exception unused) {
                }
            }
        }
    }
}
