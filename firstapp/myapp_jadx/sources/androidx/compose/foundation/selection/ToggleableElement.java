package androidx.compose.foundation.selection;

import androidx.compose.ui.d;
import defpackage.jzf0;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.psw;
import defpackage.su50;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Lp3w;", "Ljzf0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ToggleableElement extends p3w<jzf0> {
    public final boolean b;
    public final psw c;
    public final boolean d;
    public final boolean e;
    public final su50 f;
    public final Function1<Boolean, Unit> g;

    public ToggleableElement() {
        throw null;
    }

    public ToggleableElement(boolean z, psw pswVar, boolean z2, boolean z3, su50 su50Var, Function1 function1) {
        this.b = z;
        this.c = pswVar;
        this.d = z2;
        this.e = z3;
        this.f = su50Var;
        this.g = function1;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new jzf0(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        jzf0 jzf0Var = (jzf0) cVar;
        boolean z = jzf0Var.a0;
        boolean z2 = this.b;
        if (z != z2) {
            jzf0Var.a0 = z2;
            pkd.f(jzf0Var).R();
        }
        jzf0Var.b0 = this.g;
        jzf0Var.B2(this.c, null, this.d, this.e, null, this.f, jzf0Var.c0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.b == toggleableElement.b && Intrinsics.g(this.c, toggleableElement.c) && this.d == toggleableElement.d && this.e == toggleableElement.e && Intrinsics.g(this.f, toggleableElement.f) && this.g == toggleableElement.g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        psw pswVar = this.c;
        int iA = mtg0.a(mtg0.a((iHashCode + (pswVar != null ? pswVar.hashCode() : 0)) * 961, 31, this.d), 31, this.e);
        su50 su50Var = this.f;
        return this.g.hashCode() + ((iA + (su50Var != null ? Integer.hashCode(su50Var.a) : 0)) * 31);
    }
}
