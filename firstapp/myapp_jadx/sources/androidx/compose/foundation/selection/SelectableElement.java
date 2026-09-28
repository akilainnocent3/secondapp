package androidx.compose.foundation.selection;

import androidx.compose.ui.d;
import defpackage.k780;
import defpackage.mfn;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.psw;
import defpackage.su50;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Lp3w;", "Lk780;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SelectableElement extends p3w<k780> {
    public final boolean b;
    public final psw c;
    public final mfn d;
    public final boolean e;
    public final boolean f;
    public final su50 g;
    public final Function0<Unit> h;

    public SelectableElement() {
        throw null;
    }

    public SelectableElement(boolean z, psw pswVar, mfn mfnVar, boolean z2, boolean z3, su50 su50Var, Function0 function0) {
        this.b = z;
        this.c = pswVar;
        this.d = mfnVar;
        this.e = z2;
        this.f = z3;
        this.g = su50Var;
        this.h = function0;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        k780 k780Var = new k780(this.c, this.d, this.e, this.f, null, this.g, this.h);
        k780Var.a0 = this.b;
        return k780Var;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        k780 k780Var = (k780) cVar;
        boolean z = k780Var.a0;
        boolean z2 = this.b;
        if (z != z2) {
            k780Var.a0 = z2;
            pkd.f(k780Var).R();
        }
        k780Var.B2(this.c, this.d, this.e, this.f, null, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.b == selectableElement.b && Intrinsics.g(this.c, selectableElement.c) && Intrinsics.g(this.d, selectableElement.d) && this.e == selectableElement.e && this.f == selectableElement.f && Intrinsics.g(this.g, selectableElement.g) && this.h == selectableElement.h;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        psw pswVar = this.c;
        int iHashCode2 = (iHashCode + (pswVar != null ? pswVar.hashCode() : 0)) * 31;
        mfn mfnVar = this.d;
        int iA = mtg0.a(mtg0.a((iHashCode2 + (mfnVar != null ? mfnVar.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
        su50 su50Var = this.g;
        return this.h.hashCode() + ((iA + (su50Var != null ? Integer.hashCode(su50Var.a) : 0)) * 31);
    }
}
