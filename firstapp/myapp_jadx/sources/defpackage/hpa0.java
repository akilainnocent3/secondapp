package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
public final class hpa0 {
    public static final int[] e = {100, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
    public static final int[] f = {HttpStatusCodesKt.HTTP_PROCESSING, HttpStatusCodesKt.HTTP_EARLY_HINTS, 104};
    public static final int[] g = {105, 106, 107};
    public static final int[] h = {108, 109, 110};
    public final boolean a;
    public final SoundPool b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;

    public hpa0(Context context, boolean z) {
        context.getClass();
        this.a = z;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        SoundPool soundPool = this.b;
        if (soundPool != null) {
            soundPool.release();
        }
        if (z) {
            SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(3).build()).setMaxStreams(5).build();
            for (int i : xx0.o(xx0.o(xx0.o(e, f), g), h)) {
                Pair<String, String> pair = fbd0.a.get(Integer.valueOf(i));
                File file = pair != null ? new File(context.getExternalFilesDir(null), pair.b) : null;
                if (file != null) {
                    try {
                        this.c.put(Integer.valueOf(i), Integer.valueOf(soundPoolBuild.load(new FileInputStream(file).getFD(), 0L, file.length(), 1)));
                    } catch (Exception unused) {
                    }
                }
            }
            this.b = soundPoolBuild;
        }
    }

    public final void a(int i, boolean z, boolean z2) {
        Integer num;
        if (this.a) {
            LinkedHashMap linkedHashMap = this.d;
            if ((z2 && linkedHashMap.containsKey(Integer.valueOf(i))) || (num = (Integer) this.c.get(Integer.valueOf(i))) == null) {
                return;
            }
            int iIntValue = num.intValue();
            try {
                SoundPool soundPool = this.b;
                int iPlay = 0;
                if (soundPool != null) {
                    iPlay = soundPool.play(iIntValue, 1.0f, 1.0f, 0, z ? -1 : 0, 1.0f);
                }
                if (!z2 || iPlay <= 0) {
                    return;
                }
                linkedHashMap.put(Integer.valueOf(i), Integer.valueOf(iPlay));
            } catch (Exception unused) {
            }
        }
    }

    public final void b() {
        a(119, false, false);
    }

    public final void c() {
        Integer num = (Integer) this.d.remove(100);
        if (num != null) {
            int iIntValue = num.intValue();
            try {
                SoundPool soundPool = this.b;
                if (soundPool != null) {
                    soundPool.stop(iIntValue);
                    Unit unit = Unit.a;
                }
            } catch (Exception unused) {
                Unit unit2 = Unit.a;
            }
        }
    }
}
