package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h3b extends d.c implements ya80 {
    public boolean D;
    public final boolean E;
    public Function1<? super pb80, Unit> F;

    public h3b(boolean z, boolean z2, Function1<? super pb80, Unit> function1) {
        this.D = z;
        this.E = z2;
        this.F = function1;
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
        this.F.invoke(pb80Var);
    }

    @Override // defpackage.ya80
    public final boolean Y1() {
        return this.D;
    }

    @Override // defpackage.ya80
    public final boolean f0() {
        return this.E;
    }
}
