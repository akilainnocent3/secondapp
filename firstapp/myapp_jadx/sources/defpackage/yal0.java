package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class yal0 {
    public static final cbl0 a;

    static {
        kbl0 kbl0Var;
        Uri uri = abl0.a;
        synchronized (ebl0.class) {
            kbl0Var = ebl0.a;
            if (kbl0Var == null) {
                kbl0Var = new kbl0();
                synchronized (ebl0.class) {
                    if (ebl0.a != null) {
                        throw new IllegalStateException("init() already called");
                    }
                    ebl0.a = kbl0Var;
                }
            }
        }
        a = kbl0Var;
    }
}
