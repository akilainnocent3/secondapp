package androidx.compose.foundation.lazy.layout;

import defpackage.i3z;
import defpackage.mtg0;
import defpackage.nyr;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.uyr;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Lp3w;", "Luyr;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LazyLayoutSemanticsModifier extends p3w<uyr> {
    public final Function0<c> b;
    public final nyr c;
    public final i3z d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutSemanticsModifier(Function0<? extends c> function0, nyr nyrVar, i3z i3zVar, boolean z, boolean z2) {
        this.b = function0;
        this.c = nyrVar;
        this.d = i3zVar;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new uyr(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        uyr uyrVar = (uyr) cVar;
        uyrVar.D = this.b;
        uyrVar.E = this.c;
        i3z i3zVar = uyrVar.F;
        i3z i3zVar2 = this.d;
        if (i3zVar != i3zVar2) {
            uyrVar.F = i3zVar2;
            pkd.f(uyrVar).R();
        }
        boolean z = uyrVar.G;
        boolean z2 = this.e;
        boolean z3 = this.f;
        if (z == z2 && uyrVar.H == z3) {
            return;
        }
        uyrVar.G = z2;
        uyrVar.H = z3;
        uyrVar.p2();
        pkd.f(uyrVar).R();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.b == lazyLayoutSemanticsModifier.b && Intrinsics.g(this.c, lazyLayoutSemanticsModifier.c) && this.d == lazyLayoutSemanticsModifier.d && this.e == lazyLayoutSemanticsModifier.e && this.f == lazyLayoutSemanticsModifier.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + mtg0.a((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e);
    }
}
