package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class s82 {
    public final w82 a(Context context) {
        w82 w82Var;
        w82 w82Var2 = w82.f157241e;
        if (w82Var2 != null) {
            return w82Var2;
        }
        synchronized (this) {
            w82Var = w82.f157241e;
            if (w82Var == null) {
                w82Var = new w82(context, new k31());
                w82.f157241e = w82Var;
            }
        }
        return w82Var;
    }
}
