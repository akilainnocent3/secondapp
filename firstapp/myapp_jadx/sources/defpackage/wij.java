package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class wij {
    public static final int e = Math.min(400, 900);
    public static volatile wij f;
    public float a;
    public float b;
    public hpa0 c;
    public d3i0 d;

    public static wij a() {
        if (f == null) {
            synchronized (wij.class) {
                try {
                    if (f == null) {
                        f = new wij();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public final void b(Context context) {
        this.c = new hpa0(context, wn20.a(context, "gameData", zre.a() + "toggle_sound"));
        this.d = new d3i0(context, wn20.a(context, "gameData", zre.a() + "toggle_vibration"));
    }
}
