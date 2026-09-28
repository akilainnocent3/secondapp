package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class abu {
    public final Context a;
    public final Function2<Context, String, File> b;
    public final MediaPlayer c;
    public final MediaPlayer d;

    /* JADX WARN: Multi-variable type inference failed */
    public abu(Context context, Function2<? super Context, ? super String, ? extends File> function2) {
        context.getClass();
        function2.getClass();
        this.a = context;
        this.b = function2;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.c = mediaPlayer;
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.d = mediaPlayer2;
        try {
            mediaPlayer.setLooping(true);
            File file = (File) function2.invoke(context, "lucky_wheel/bg_music.mp3");
            if (file != null) {
                mediaPlayer.setDataSource(new FileInputStream(file).getFD());
                mediaPlayer.prepareAsync();
            }
            mediaPlayer.setOnPreparedListener(new yau());
            mediaPlayer2.setOnPreparedListener(new zau());
        } catch (Exception e) {
            itf0.a.d(inm.a("Error setting up MediaPlayers: ", e.getMessage()), new Object[0]);
        }
    }
}
