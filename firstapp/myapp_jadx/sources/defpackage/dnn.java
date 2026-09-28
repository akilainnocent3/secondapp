package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dnn implements tmz {
    public final g8j0 a;
    public final mmd b;

    public dnn(g8j0 g8j0Var, mmd mmdVar) {
        this.a = g8j0Var;
        this.b = mmdVar;
    }

    @Override // defpackage.tmz
    public final float a() {
        g8j0 g8j0Var = this.a;
        mmd mmdVar = this.b;
        return mmdVar.u1(g8j0Var.c(mmdVar));
    }

    @Override // defpackage.tmz
    public final float b(asr asrVar) {
        g8j0 g8j0Var = this.a;
        mmd mmdVar = this.b;
        return mmdVar.u1(g8j0Var.d(mmdVar, asrVar));
    }

    @Override // defpackage.tmz
    public final float c(asr asrVar) {
        g8j0 g8j0Var = this.a;
        mmd mmdVar = this.b;
        return mmdVar.u1(g8j0Var.b(mmdVar, asrVar));
    }

    @Override // defpackage.tmz
    public final float d() {
        g8j0 g8j0Var = this.a;
        mmd mmdVar = this.b;
        return mmdVar.u1(g8j0Var.a(mmdVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnn)) {
            return false;
        }
        dnn dnnVar = (dnn) obj;
        return Intrinsics.g(this.a, dnnVar.a) && Intrinsics.g(this.b, dnnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
