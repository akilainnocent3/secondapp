package androidx.compose.foundation.layout;

import defpackage.gnn;
import defpackage.ht;
import defpackage.kxa;
import defpackage.m75;
import defpackage.mmd;
import defpackage.r75;
import defpackage.rce0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements r75, m75 {
    public final mmd a;
    public final long b;

    public e(rce0 rce0Var, long j) {
        this.a = rce0Var;
        this.b = j;
    }

    @Override // defpackage.m75
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, ht htVar) {
        return dVar.n(new BoxChildDataElement(htVar, false, gnn.a));
    }

    @Override // defpackage.r75
    public final long c() {
        return this.b;
    }

    @Override // defpackage.r75
    public final float d() {
        long j = this.b;
        if (!kxa.e(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.u1(kxa.i(j));
    }

    @Override // defpackage.r75
    public final float e() {
        long j = this.b;
        if (!kxa.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.u1(kxa.h(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.g(this.a, eVar.a) && kxa.c(this.b, eVar.b);
    }

    @Override // defpackage.m75
    public final androidx.compose.ui.d f(androidx.compose.ui.d dVar) {
        return dVar.n(new BoxChildDataElement(ht.a.e, true, gnn.a));
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) kxa.m(this.b)) + ')';
    }
}
