package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class hc6 {
    public CancellationSignal a;
    public gc6 b;

    public class a {
    }

    public static class b {
        public static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }
}
