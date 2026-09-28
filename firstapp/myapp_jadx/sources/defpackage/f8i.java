package defpackage;

import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public abstract class f8i {
    public static final qcd a = new qcd();
    public static final v1k b = new v1k("sans-serif", "FontFamily.SansSerif");
    public static final v1k c = new v1k("serif", "FontFamily.Serif");
    public static final v1k d = new v1k("monospace", "FontFamily.Monospace");
    public static final v1k e = new v1k("cursive", "FontFamily.Cursive");

    public interface a {
        static twd0 a(a aVar, f8i f8iVar, t9i t9iVar, int i, int i2, int i3) {
            if ((i3 & 2) != 0) {
                t9iVar = t9i.B;
            }
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            }
            return aVar.b(f8iVar, t9iVar, i, i2);
        }

        z9h0 b(f8i f8iVar, t9i t9iVar, int i, int i2);
    }
}
