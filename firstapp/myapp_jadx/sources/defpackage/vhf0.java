package defpackage;

import androidx.compose.ui.layout.y;

/* JADX INFO: loaded from: classes.dex */
public final class vhf0 {
    public static final lk40 a(y.a aVar, int i, wsg0 wsg0Var, ukf0 ukf0Var, boolean z, int i2) {
        lk40 lk40VarC = ukf0Var != null ? ukf0Var.c(wsg0Var.b.b(i)) : lk40.e;
        int iY0 = aVar.y0(2.0f);
        float f = lk40VarC.a;
        return lk40.b(lk40VarC, z ? (i2 - f) - iY0 : f, z ? i2 - f : iY0 + f, 10);
    }
}
