package defpackage;

import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class i5c {
    public static final void a(CursorAnchorInfo.Builder builder, ukf0 ukf0Var, lk40 lk40Var) {
        if (lk40Var.g()) {
            return;
        }
        float f = lk40Var.b;
        zjw zjwVar = ukf0Var.b;
        int iE = zjwVar.e(f);
        int iE2 = zjwVar.e(lk40Var.d);
        if (iE > iE2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(ukf0Var.g(iE), zjwVar.f(iE), ukf0Var.h(iE), zjwVar.b(iE));
            if (iE == iE2) {
                return;
            } else {
                iE++;
            }
        }
    }
}
