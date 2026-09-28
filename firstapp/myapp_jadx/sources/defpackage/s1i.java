package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s1i {
    public final int a;
    public final c2i b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;

    public static final class a {
    }

    public static final class b {
        public final boolean a;
        public final boolean b;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public s1i(int i, c2i c2iVar, long j, int i2, int i3, int i4) {
        this.a = i;
        this.b = c2iVar;
        this.c = j;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final a a(b bVar, boolean z, int i, int i2, int i3, int i4) {
        if (!bVar.b) {
            return null;
        }
        this.b.getClass();
        z1i.a aVar = z1i.a.a;
        return null;
    }

    public final b b(boolean z, int i, long j, yvo yvoVar, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (yvoVar == null) {
            return new b(true, true);
        }
        long j2 = yvoVar.a;
        this.b.getClass();
        z1i.a aVar = z1i.a.a;
        z1i.a aVar2 = z1i.a.a;
        if (i2 >= this.d || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new b(true, true);
        }
        if (i != 0 && (i >= this.a || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new b(true, true) : new b(true, b(z, 0, yvo.a(kxa.i(this.c), (((int) (j & 4294967295L)) - this.f) - i4), new yvo(yvo.a(((int) (j2 >> 32)) - this.e, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).b);
        }
        Math.max(i4, (int) (j2 & 4294967295L));
        return new b(false, false);
    }
}
