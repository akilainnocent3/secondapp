package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class oe3 {
    public static pe3 a(Context context) {
        pe3 pe3Var;
        pe3 pe3Var2 = pe3.f153912c;
        if (pe3Var2 != null) {
            return pe3Var2;
        }
        synchronized (pe3.f153911b) {
            pe3Var = pe3.f153912c;
            if (pe3Var == null) {
                pe3Var = new pe3(up3.a(context, 1));
                pe3.f153912c = pe3Var;
            }
        }
        return pe3Var;
    }
}
