package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class v92 {
    public final x92 a(Context context) {
        x92 x92Var;
        x92 x92Var2 = x92.f157743i;
        if (x92Var2 != null) {
            return x92Var2;
        }
        synchronized (this) {
            x92Var = x92.f157743i;
            if (x92Var == null) {
                x92Var = new x92(context);
                x92.f157743i = x92Var;
            }
        }
        return x92Var;
    }
}
