package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class stg implements g8j0 {
    public final g8j0 a;
    public final g8j0 b;

    public stg(g8j0 g8j0Var, g8j0 g8j0Var2) {
        this.a = g8j0Var;
        this.b = g8j0Var2;
    }

    @Override // defpackage.g8j0
    public final int a(mmd mmdVar) {
        int iA = this.a.a(mmdVar) - this.b.a(mmdVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.g8j0
    public final int b(mmd mmdVar, asr asrVar) {
        int iB = this.a.b(mmdVar, asrVar) - this.b.b(mmdVar, asrVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.g8j0
    public final int c(mmd mmdVar) {
        int iC = this.a.c(mmdVar) - this.b.c(mmdVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.g8j0
    public final int d(mmd mmdVar, asr asrVar) {
        int iD = this.a.d(mmdVar, asrVar) - this.b.d(mmdVar, asrVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stg)) {
            return false;
        }
        stg stgVar = (stg) obj;
        return Intrinsics.g(stgVar.a, this.a) && Intrinsics.g(stgVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
