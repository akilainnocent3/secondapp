package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jsz extends d.c implements hvg0, ya80 {
    public Function1<? super pb80, Unit> D;
    public boolean E;
    public final ijl F = ijl.c;

    public jsz(cc2 cc2Var) {
        this.D = cc2Var;
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
        if (this.E) {
            return;
        }
        this.D.invoke(pb80Var);
    }

    @Override // defpackage.hvg0
    public final Object J() {
        return this.F;
    }

    @Override // defpackage.ya80
    public final boolean Y1() {
        return true;
    }
}
