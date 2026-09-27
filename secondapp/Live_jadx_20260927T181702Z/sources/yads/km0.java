package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class km0 {
    public static lm0 a(Context context) {
        lm0 lm0Var;
        lm0 lm0Var2 = lm0.f152049c;
        if (lm0Var2 != null) {
            return lm0Var2;
        }
        synchronized (lm0.f152050d) {
            lm0Var = lm0.f152049c;
            if (lm0Var == null) {
                lm0Var = new lm0(new jm0(), xg.a(context.getApplicationContext()));
                lm0.f152049c = lm0Var;
            }
        }
        return lm0Var;
    }
}
