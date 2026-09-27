package yads;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d73 {
    public static void a(String str) {
        if (ib3.f150516a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (ib3.f150516a >= 18) {
            Trace.endSection();
        }
    }
}
