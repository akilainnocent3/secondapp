package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class e580 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public e580 f;
    public e580 g;

    public e580(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final e580 a() {
        e580 e580Var = this.f;
        if (e580Var == this) {
            e580Var = null;
        }
        e580 e580Var2 = this.g;
        e580Var2.getClass();
        e580Var2.f = this.f;
        e580 e580Var3 = this.f;
        e580Var3.getClass();
        e580Var3.g = this.g;
        this.f = null;
        this.g = null;
        return e580Var;
    }

    public final void b(e580 e580Var) {
        e580Var.getClass();
        e580Var.g = this;
        e580Var.f = this.f;
        e580 e580Var2 = this.f;
        e580Var2.getClass();
        e580Var2.g = e580Var;
        this.f = e580Var;
    }

    public final e580 c() {
        this.d = true;
        return new e580(this.a, this.b, this.c, true, false);
    }

    public final void d(e580 e580Var, int i) {
        e580Var.getClass();
        byte[] bArr = e580Var.a;
        if (!e580Var.e) {
            ib5.a("only owner can write");
            return;
        }
        int i2 = e580Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (e580Var.d) {
                d580.a();
                return;
            }
            int i4 = e580Var.b;
            if (i3 - i4 > 8192) {
                d580.a();
                return;
            }
            xx0.f(bArr, 0, bArr, i4, i2);
            i2 = e580Var.c - e580Var.b;
            e580Var.c = i2;
            e580Var.b = 0;
        }
        int i5 = this.b;
        xx0.f(this.a, i2, bArr, i5, i5 + i);
        e580Var.c += i;
        this.b += i;
    }

    public e580() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
