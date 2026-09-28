package androidx.compose.foundation.gestures;

import androidx.compose.ui.d;
import defpackage.i20;
import defpackage.i3z;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.q10;
import defpackage.svh;
import defpackage.x00;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableElement;", "T", "Lp3w;", "Lq10;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AnchoredDraggableElement<T> extends p3w<q10<T>> {
    public final i20<T> b;
    public final i3z c;
    public final boolean d;
    public final Boolean e;
    public final svh f;

    public AnchoredDraggableElement(i20 i20Var, i3z i3zVar, boolean z, Boolean bool, svh svhVar) {
        this.b = i20Var;
        this.c = i3zVar;
        this.d = z;
        this.e = bool;
        this.f = svhVar;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        x00 x00Var = a.a;
        boolean z = this.d;
        i3z i3zVar = this.c;
        q10 q10Var = new q10(x00Var, z, null, i3zVar);
        q10Var.O = this.b;
        q10Var.P = i3zVar;
        q10Var.Q = this.e;
        q10Var.R = this.f;
        return q10Var;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        boolean z;
        boolean z2;
        q10 q10Var = (q10) cVar;
        svh svhVar = this.f;
        q10Var.R = svhVar;
        i20<T> i20Var = q10Var.O;
        i20<T> i20Var2 = this.b;
        if (Intrinsics.g(i20Var, i20Var2)) {
            z = false;
        } else {
            q10Var.O = i20Var2;
            q10Var.D2(svhVar);
            z = true;
        }
        i3z i3zVar = q10Var.P;
        i3z i3zVar2 = this.c;
        if (i3zVar != i3zVar2) {
            q10Var.P = i3zVar2;
            z = true;
        }
        Boolean bool = q10Var.Q;
        Boolean bool2 = this.e;
        if (Intrinsics.g(bool, bool2)) {
            z2 = z;
        } else {
            q10Var.Q = bool2;
            z2 = true;
        }
        q10Var.A2(q10Var.G, this.d, null, i3zVar2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        return Intrinsics.g(this.b, anchoredDraggableElement.b) && this.c == anchoredDraggableElement.c && this.d == anchoredDraggableElement.d && Intrinsics.g(this.e, anchoredDraggableElement.e) && Intrinsics.g(this.f, anchoredDraggableElement.f);
    }

    public final int hashCode() {
        int iA = mtg0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        Boolean bool = this.e;
        int iHashCode = (iA + (bool != null ? bool.hashCode() : 0)) * 923521;
        svh svhVar = this.f;
        return iHashCode + (svhVar != null ? svhVar.hashCode() : 0);
    }
}
