package defpackage;

import android.content.ComponentCallbacks;

/* JADX INFO: loaded from: classes8.dex */
public final class e80 {
    public static final qn70 a(ComponentCallbacks componentCallbacks) {
        componentCallbacks.getClass();
        if (componentCallbacks instanceof wa0) {
            return ((wa0) componentCallbacks).j();
        }
        if (componentCallbacks instanceof rrp) {
            return ((rrp) componentCallbacks).j();
        }
        if (componentCallbacks instanceof prp) {
            return ((prp) componentCallbacks).getKoin().c.d;
        }
        ib5.a("KoinApplication has not been started");
        return null;
    }
}
