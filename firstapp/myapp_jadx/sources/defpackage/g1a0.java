package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g1a0 {
    public final h1a0 a;
    public final lh4 b;
    public final i58 d;
    public b21 e;
    public int f;
    public int h;
    public final i58 c = new i58();
    public final owh g = new owh();

    public g1a0(h1a0 h1a0Var, lh4 lh4Var) {
        if (lh4Var == null) {
            hb5.a("bone cannot be null.");
            throw null;
        }
        this.a = h1a0Var;
        this.b = lh4Var;
        this.d = h1a0Var.e != null ? new i58() : null;
        b();
    }

    public final void a(b21 b21Var) {
        b21 b21Var2 = this.e;
        if (b21Var2 == b21Var) {
            return;
        }
        if (!(b21Var instanceof r2i0) || !(b21Var2 instanceof r2i0) || ((r2i0) b21Var).d != ((r2i0) b21Var2).d) {
            this.g.b = 0;
        }
        this.e = b21Var;
        this.f = -1;
    }

    public final void b() {
        h1a0 h1a0Var = this.a;
        this.c.e(h1a0Var.d);
        i58 i58Var = this.d;
        if (i58Var != null) {
            i58Var.e(h1a0Var.e);
        }
        String str = h1a0Var.f;
        if (str == null) {
            a(null);
        } else {
            this.e = null;
            a(this.b.b.a(h1a0Var.a, str));
        }
    }

    public final String toString() {
        return this.a.b;
    }
}
