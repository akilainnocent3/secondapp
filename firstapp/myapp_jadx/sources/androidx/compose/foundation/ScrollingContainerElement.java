package androidx.compose.foundation;

import defpackage.fr70;
import defpackage.i3z;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.psw;
import defpackage.qa5;
import defpackage.qr70;
import defpackage.sfz;
import defpackage.svh;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingContainerElement;", "Lp3w;", "Lqr70;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ScrollingContainerElement extends p3w<qr70> {
    public final fr70 b;
    public final i3z c;
    public final boolean d;
    public final boolean e;
    public final svh f;
    public final psw g;
    public final qa5 h;
    public final boolean i;
    public final sfz j;

    public ScrollingContainerElement(qa5 qa5Var, svh svhVar, psw pswVar, i3z i3zVar, sfz sfzVar, fr70 fr70Var, boolean z, boolean z2, boolean z3) {
        this.b = fr70Var;
        this.c = i3zVar;
        this.d = z;
        this.e = z2;
        this.f = svhVar;
        this.g = pswVar;
        this.h = qa5Var;
        this.i = z3;
        this.j = sfzVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        qr70 qr70Var = new qr70();
        qr70Var.F = this.b;
        qr70Var.G = this.c;
        qr70Var.H = this.d;
        qr70Var.I = this.e;
        qr70Var.J = this.f;
        qr70Var.K = this.g;
        qr70Var.L = this.h;
        qr70Var.M = this.i;
        qr70Var.N = this.j;
        return qr70Var;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ((qr70) cVar).u2(this.h, this.f, this.g, this.c, this.j, this.b, this.i, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return Intrinsics.g(this.b, scrollingContainerElement.b) && this.c == scrollingContainerElement.c && this.d == scrollingContainerElement.d && this.e == scrollingContainerElement.e && Intrinsics.g(this.f, scrollingContainerElement.f) && Intrinsics.g(this.g, scrollingContainerElement.g) && Intrinsics.g(this.h, scrollingContainerElement.h) && this.i == scrollingContainerElement.i && Intrinsics.g(this.j, scrollingContainerElement.j);
    }

    public final int hashCode() {
        int iA = mtg0.a(mtg0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
        svh svhVar = this.f;
        int iHashCode = (iA + (svhVar != null ? svhVar.hashCode() : 0)) * 31;
        psw pswVar = this.g;
        int iHashCode2 = (iHashCode + (pswVar != null ? pswVar.hashCode() : 0)) * 31;
        qa5 qa5Var = this.h;
        int iA2 = mtg0.a((iHashCode2 + (qa5Var != null ? qa5Var.hashCode() : 0)) * 31, 31, this.i);
        sfz sfzVar = this.j;
        return iA2 + (sfzVar != null ? sfzVar.hashCode() : 0);
    }
}
