package androidx.compose.foundation.selection;

import androidx.compose.ui.d;
import defpackage.kzf0;
import defpackage.mfn;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.psw;
import defpackage.su50;
import defpackage.xt50;
import defpackage.xvg0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "Lp3w;", "Lxvg0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TriStateToggleableElement extends p3w<xvg0> {
    public final kzf0 b;
    public final psw c;
    public final mfn d;
    public final boolean e;
    public final su50 f;
    public final Function0<Unit> g;

    public TriStateToggleableElement() {
        throw null;
    }

    public TriStateToggleableElement(kzf0 kzf0Var, psw pswVar, xt50 xt50Var, boolean z, su50 su50Var, Function0 function0) {
        this.b = kzf0Var;
        this.c = pswVar;
        this.d = xt50Var;
        this.e = z;
        this.f = su50Var;
        this.g = function0;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        xvg0 xvg0Var = new xvg0(this.c, this.d, false, this.e, null, this.f, this.g);
        xvg0Var.a0 = this.b;
        return xvg0Var;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        xvg0 xvg0Var = (xvg0) cVar;
        kzf0 kzf0Var = xvg0Var.a0;
        kzf0 kzf0Var2 = this.b;
        if (kzf0Var != kzf0Var2) {
            xvg0Var.a0 = kzf0Var2;
            pkd.f(xvg0Var).R();
        }
        xvg0Var.B2(this.c, this.d, false, this.e, null, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.b == triStateToggleableElement.b && Intrinsics.g(this.c, triStateToggleableElement.c) && Intrinsics.g(this.d, triStateToggleableElement.d) && this.e == triStateToggleableElement.e && Intrinsics.g(this.f, triStateToggleableElement.f) && this.g == triStateToggleableElement.g;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        psw pswVar = this.c;
        int iHashCode2 = (iHashCode + (pswVar != null ? pswVar.hashCode() : 0)) * 31;
        mfn mfnVar = this.d;
        int iA = mtg0.a(mtg0.a((iHashCode2 + (mfnVar != null ? mfnVar.hashCode() : 0)) * 31, 31, false), 31, this.e);
        su50 su50Var = this.f;
        return this.g.hashCode() + ((iA + (su50Var != null ? Integer.hashCode(su50Var.a) : 0)) * 31);
    }
}
