package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jl implements g8j0 {
    public final ydh0 a;
    public final pth b;

    public jl(ydh0 ydh0Var, pth pthVar) {
        this.a = ydh0Var;
        this.b = pthVar;
    }

    @Override // defpackage.g8j0
    public final int a(mmd mmdVar) {
        return mmdVar.y0(this.b.b) + this.a.a(mmdVar);
    }

    @Override // defpackage.g8j0
    public final int b(mmd mmdVar, asr asrVar) {
        return mmdVar.y0(this.b.c) + this.a.b(mmdVar, asrVar);
    }

    @Override // defpackage.g8j0
    public final int c(mmd mmdVar) {
        return mmdVar.y0(this.b.d) + this.a.c(mmdVar);
    }

    @Override // defpackage.g8j0
    public final int d(mmd mmdVar, asr asrVar) {
        return mmdVar.y0(this.b.a) + this.a.d(mmdVar, asrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl)) {
            return false;
        }
        jl jlVar = (jl) obj;
        return jlVar.a.equals(this.a) && jlVar.b.equals(this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ')';
    }
}
