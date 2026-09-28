package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes8.dex */
public final class z60 implements fku {
    @Override // defpackage.fku
    public final vcl a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new vcl(xcl.a(mainLooper));
        }
        ib5.a("The main looper is not available");
        return null;
    }
}
