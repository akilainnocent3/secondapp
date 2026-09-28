package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final class r8j0 {
    public static final rth a = new rth(0, 0);

    public static rth a(int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return new rth(0, i);
    }

    public static pth b(int i, float f, float f2) {
        float f3 = (i & 1) != 0 ? 0.0f : 30.0f;
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        return new pth(f3, 0.0f, f, f2);
    }

    public static final dnn c(g8j0 g8j0Var, a aVar) {
        return new dnn(g8j0Var, (mmd) aVar.O(kna.h));
    }
}
