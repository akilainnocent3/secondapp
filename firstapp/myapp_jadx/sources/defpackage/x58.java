package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x58 extends crz {
    public final long f;
    public l58 v;
    public float i = 1.0f;
    public final long w = 9205357640488583168L;

    public x58(long j) {
        this.f = j;
    }

    @Override // defpackage.crz
    public final boolean a(float f) {
        this.i = f;
        return true;
    }

    @Override // defpackage.crz
    public final boolean b(l58 l58Var) {
        this.v = l58Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x58)) {
            return false;
        }
        long j = ((x58) obj).f;
        int i = j58.n;
        return nbh0.a(this.f, j);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.f);
    }

    @Override // defpackage.crz
    public final long i() {
        return this.w;
    }

    @Override // defpackage.crz
    public final void j(tcf tcfVar) {
        tcf.m0(tcfVar, this.f, 0L, 0L, this.i, this.v, 0, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) j58.i(this.f)) + ')';
    }
}
