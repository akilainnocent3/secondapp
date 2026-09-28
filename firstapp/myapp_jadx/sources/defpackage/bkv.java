package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bkv {
    public final ekv.b a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public bkv(ekv.b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        ly0.b(!z5 || z3);
        ly0.b(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        ly0.b(z6);
        this.a = bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final bkv a(long j) {
        if (j == this.c) {
            return this;
        }
        return new bkv(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final bkv b(long j) {
        if (j == this.b) {
            return this;
        }
        return new bkv(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bkv.class != obj.getClass()) {
            return false;
        }
        bkv bkvVar = (bkv) obj;
        return this.b == bkvVar.b && this.c == bkvVar.c && this.d == bkvVar.d && this.e == bkvVar.e && this.f == bkvVar.f && this.g == bkvVar.g && this.h == bkvVar.h && this.i == bkvVar.i && this.j == bkvVar.j && this.a.equals(bkvVar.a);
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
