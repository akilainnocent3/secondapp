package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ydh0 implements g8j0 {
    public final g8j0 a;
    public final g8j0 b;

    public ydh0(g8j0 g8j0Var, g8j0 g8j0Var2) {
        this.a = g8j0Var;
        this.b = g8j0Var2;
    }

    @Override // defpackage.g8j0
    public final int a(mmd mmdVar) {
        return Math.max(this.a.a(mmdVar), this.b.a(mmdVar));
    }

    @Override // defpackage.g8j0
    public final int b(mmd mmdVar, asr asrVar) {
        return Math.max(this.a.b(mmdVar, asrVar), this.b.b(mmdVar, asrVar));
    }

    @Override // defpackage.g8j0
    public final int c(mmd mmdVar) {
        return Math.max(this.a.c(mmdVar), this.b.c(mmdVar));
    }

    @Override // defpackage.g8j0
    public final int d(mmd mmdVar, asr asrVar) {
        return Math.max(this.a.d(mmdVar, asrVar), this.b.d(mmdVar, asrVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydh0)) {
            return false;
        }
        ydh0 ydh0Var = (ydh0) obj;
        return Intrinsics.g(ydh0Var.a, this.a) && Intrinsics.g(ydh0Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
