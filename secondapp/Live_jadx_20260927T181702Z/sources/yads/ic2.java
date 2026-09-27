package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ic2 implements m93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ul0 f150536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib2 f150537b = new ib2(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f150538c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f150539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y63 f150540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f150541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f150542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f150543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f150544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f150545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f150546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f150547l;

    public ic2(ul0 ul0Var) {
        this.f150536a = ul0Var;
    }

    @Override // yads.m93
    public final void a(int i10, jb2 jb2Var) {
        int i11;
        int i12;
        int i13;
        if (this.f150540e == null) {
            throw new IllegalStateException();
        }
        int i14 = -1;
        int i15 = 0;
        if ((i10 & 1) != 0) {
            int i16 = this.f150538c;
            if (i16 != 0 && i16 != 1) {
                if (i16 == 2) {
                    ih1.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i16 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f150545j != -1) {
                        ih1.d("PesReader", "Unexpected start indicator: expected " + this.f150545j + " more bytes");
                    }
                    this.f150536a.b();
                }
            }
            this.f150538c = 1;
            this.f150539d = 0;
        }
        int i17 = i10;
        while (true) {
            int i18 = jb2Var.f151003c;
            int i19 = jb2Var.f151002b;
            int i20 = i18 - i19;
            if (i20 <= 0) {
                return;
            }
            int i21 = this.f150538c;
            if (i21 == 0) {
                i11 = i14;
                i12 = i15;
                jb2Var.e(i20 + i19);
            } else if (i21 != 1) {
                if (i21 != 2) {
                    if (i21 != 3) {
                        throw new IllegalStateException();
                    }
                    int i22 = this.f150545j;
                    int i23 = i22 == i14 ? i15 : i20 - i22;
                    if (i23 > 0) {
                        i20 -= i23;
                        jb2Var.d(i19 + i20);
                    }
                    this.f150536a.a(jb2Var);
                    int i24 = this.f150545j;
                    if (i24 != i14) {
                        int i25 = i24 - i20;
                        this.f150545j = i25;
                        if (i25 == 0) {
                            this.f150536a.b();
                            this.f150538c = 1;
                            this.f150539d = i15;
                        }
                    }
                } else if (a(Math.min(10, this.f150544i), jb2Var, this.f150537b.f150512a) && a(this.f150544i, jb2Var, (byte[]) null)) {
                    this.f150537b.b(i15);
                    this.f150547l = -9223372036854775807L;
                    if (this.f150541f) {
                        this.f150537b.c(4);
                        long jA = ((long) this.f150537b.a(3)) << 30;
                        this.f150537b.c(1);
                        long jA2 = ((long) (this.f150537b.a(15) << 15)) | jA;
                        this.f150537b.c(1);
                        long jA3 = jA2 | ((long) this.f150537b.a(15));
                        this.f150537b.c(1);
                        if (!this.f150543h && this.f150542g) {
                            this.f150537b.c(4);
                            long jA4 = ((long) this.f150537b.a(3)) << 30;
                            this.f150537b.c(1);
                            long jA5 = jA4 | ((long) (this.f150537b.a(15) << 15));
                            this.f150537b.c(1);
                            long jA6 = jA5 | ((long) this.f150537b.a(15));
                            this.f150537b.c(1);
                            this.f150540e.b(jA6);
                            this.f150543h = true;
                        }
                        this.f150547l = this.f150540e.b(jA3);
                    }
                    i17 |= this.f150546k ? 4 : 0;
                    this.f150536a.a(i17, this.f150547l);
                    this.f150538c = 3;
                    this.f150539d = 0;
                    i15 = 0;
                    i14 = -1;
                }
                i11 = i14;
                i12 = i15;
            } else {
                i12 = i15;
                if (a(9, jb2Var, this.f150537b.f150512a)) {
                    this.f150537b.b(i12);
                    int iA = this.f150537b.a(24);
                    if (iA != 1) {
                        kf1.a("Unexpected start code prefix: ", iA, "PesReader");
                        this.f150545j = -1;
                        i13 = 0;
                        i11 = -1;
                    } else {
                        this.f150537b.c(8);
                        int iA2 = this.f150537b.a(16);
                        this.f150537b.c(5);
                        this.f150546k = this.f150537b.e();
                        this.f150537b.c(2);
                        this.f150541f = this.f150537b.e();
                        this.f150542g = this.f150537b.e();
                        this.f150537b.c(6);
                        int iA3 = this.f150537b.a(8);
                        this.f150544i = iA3;
                        if (iA2 == 0) {
                            this.f150545j = -1;
                        } else {
                            int i26 = (iA2 - 3) - iA3;
                            this.f150545j = i26;
                            if (i26 < 0) {
                                ih1.d("PesReader", "Found negative packet payload size: " + this.f150545j);
                                i11 = -1;
                                this.f150545j = -1;
                            }
                            i13 = 2;
                        }
                        i11 = -1;
                        i13 = 2;
                    }
                    this.f150538c = i13;
                    i12 = 0;
                    this.f150539d = 0;
                } else {
                    i11 = -1;
                }
            }
            i15 = i12;
            i14 = i11;
        }
    }

    public final boolean a(int i10, jb2 jb2Var, byte[] bArr) {
        int iMin = Math.min(jb2Var.f151003c - jb2Var.f151002b, i10 - this.f150539d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            jb2Var.e(jb2Var.f151002b + iMin);
        } else {
            jb2Var.a(bArr, this.f150539d, iMin);
        }
        int i11 = this.f150539d + iMin;
        this.f150539d = i11;
        return i11 == i10;
    }

    @Override // yads.m93
    public final void a(y63 y63Var, pq0 pq0Var, l93 l93Var) {
        this.f150540e = y63Var;
        this.f150536a.a(pq0Var, l93Var);
    }

    @Override // yads.m93
    public final void a() {
        this.f150538c = 0;
        this.f150539d = 0;
        this.f150543h = false;
        this.f150536a.a();
    }
}
