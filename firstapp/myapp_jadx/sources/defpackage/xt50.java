package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xt50 implements mfn {
    public final boolean a;
    public final float b;
    public final long c;

    public static final class a implements b68 {
        public a() {
        }

        @Override // defpackage.b68
        public final long a() {
            return xt50.this.c;
        }
    }

    public xt50(float f, long j, boolean z) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.mfn
    public final okd a(psw pswVar) {
        return new old(pswVar, this.a, this.b, new a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt50)) {
            return false;
        }
        xt50 xt50Var = (xt50) obj;
        if (this.a != xt50Var.a || !g7f.b(this.b, xt50Var.b)) {
            return false;
        }
        long j = xt50Var.c;
        int i = j58.n;
        return nbh0.a(this.c, j);
    }

    @Override // defpackage.mfn
    public final int hashCode() {
        int iA = tvh.a(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.c) + iA;
    }
}
