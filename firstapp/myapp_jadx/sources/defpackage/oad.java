package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class oad {
    public final Context a;
    public Boolean b;

    public static final class a {
        public static h31 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
                return h31.d;
            }
            h31.a aVar = new h31.a();
            aVar.a = true;
            aVar.c = z;
            return aVar.a();
        }
    }

    public static final class b {
        public static h31 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return h31.d;
            }
            h31.a aVar = new h31.a();
            boolean z2 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
            aVar.a = true;
            aVar.b = z2;
            aVar.c = z;
            return aVar.a();
        }
    }

    public oad(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }
}
