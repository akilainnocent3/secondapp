package defpackage;

import android.view.ViewGroup;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class fa5 extends d.c implements ca5 {
    public ViewGroup D;

    @Override // defpackage.ca5
    public final Object t1(ywx ywxVar, da5 da5Var, x1b x1bVar) {
        long jI0 = ywxVar.i0(0L);
        lk40 lk40Var = (lk40) da5Var.invoke();
        lk40 lk40VarJ = lk40Var != null ? lk40Var.j(jI0) : null;
        if (lk40VarJ != null) {
            this.D.requestRectangleOnScreen(ok40.b(lk40VarJ), false);
        }
        return Unit.a;
    }
}
