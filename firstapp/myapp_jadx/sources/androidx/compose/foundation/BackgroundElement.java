package androidx.compose.foundation;

import defpackage.j58;
import defpackage.knn;
import defpackage.nbh0;
import defpackage.ns1;
import defpackage.p3w;
import defpackage.qx80;
import defpackage.rcf;
import defpackage.tvh;
import defpackage.ya5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Lp3w;", "Lns1;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BackgroundElement extends p3w<ns1> {
    public final long b;
    public final ya5 c;
    public final float d;
    public final qx80 e;
    public final Function1<knn, Unit> f;

    public BackgroundElement(long j, ya5 ya5Var, float f, qx80 qx80Var, Function1 function1, int i) {
        j = (i & 1) != 0 ? j58.m : j;
        ya5Var = (i & 2) != 0 ? null : ya5Var;
        this.b = j;
        this.c = ya5Var;
        this.d = f;
        this.e = qx80Var;
        this.f = function1;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        ns1 ns1Var = new ns1();
        ns1Var.D = this.b;
        ns1Var.E = this.c;
        ns1Var.F = this.d;
        ns1Var.G = this.e;
        ns1Var.H = 9205357640488583168L;
        return ns1Var;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ns1 ns1Var = (ns1) cVar;
        ns1Var.D = this.b;
        ns1Var.E = this.c;
        ns1Var.F = this.d;
        ns1Var.G = this.e;
        rcf.a(ns1Var);
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        if (backgroundElement == null) {
            return false;
        }
        long j = backgroundElement.b;
        int i = j58.n;
        return nbh0.a(this.b, j) && Intrinsics.g(this.c, backgroundElement.c) && this.d == backgroundElement.d && Intrinsics.g(this.e, backgroundElement.e);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        int iHashCode = Long.hashCode(this.b) * 31;
        ya5 ya5Var = this.c;
        return this.e.hashCode() + tvh.a(this.d, (iHashCode + (ya5Var != null ? ya5Var.hashCode() : 0)) * 31, 31);
    }
}
