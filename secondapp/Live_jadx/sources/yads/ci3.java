package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ci3 {
    public final di3 a(Context context) {
        di3 di3Var;
        di3 di3Var2 = di3.f148224d;
        if (di3Var2 != null) {
            return di3Var2;
        }
        synchronized (this) {
            di3Var = di3.f148224d;
            if (di3Var == null) {
                di3Var = new di3(context);
                di3.f148224d = di3Var;
            }
        }
        return di3Var;
    }
}
