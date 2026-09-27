package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wk0 implements ul0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f157405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m73 f157406d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f157408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f157409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f157410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public mx0 f157411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f157412j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f157403a = new jb2(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f157407e = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f157413k = -9223372036854775807L;

    public wk0(String str) {
        this.f157404b = str;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:44:0x0103  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        int i10;
        byte b10;
        boolean z10;
        int i11;
        int i12;
        byte b11;
        int i13;
        byte b12;
        int i14;
        byte b13;
        if (this.f157406d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i15 = jb2Var.f151003c - jb2Var.f151002b;
            if (i15 <= 0) {
                return;
            }
            int i16 = this.f157407e;
            if (i16 == 0) {
                while (jb2Var.f151003c - jb2Var.f151002b > 0) {
                    int i17 = this.f157409g << 8;
                    this.f157409g = i17;
                    int iM = i17 | jb2Var.m();
                    this.f157409g = iM;
                    if (iM == 2147385345 || iM == -25230976 || iM == 536864768 || iM == -14745368) {
                        byte[] bArr = this.f157403a.f151001a;
                        bArr[0] = (byte) ((iM >> 24) & 255);
                        bArr[1] = (byte) ((iM >> 16) & 255);
                        bArr[2] = (byte) ((iM >> 8) & 255);
                        bArr[3] = (byte) (iM & 255);
                        this.f157408f = 4;
                        this.f157409g = 0;
                        this.f157407e = 1;
                        break;
                    }
                }
            } else if (i16 == 1) {
                byte[] bArr2 = this.f157403a.f151001a;
                int iMin = Math.min(i15, 18 - this.f157408f);
                jb2Var.a(bArr2, this.f157408f, iMin);
                int i18 = this.f157408f + iMin;
                this.f157408f = i18;
                if (i18 == 18) {
                    byte[] bArr3 = this.f157403a.f151001a;
                    if (this.f157411i == null) {
                        mx0 mx0VarA = xk0.a(bArr3, this.f157405c, this.f157404b);
                        this.f157411i = mx0VarA;
                        this.f157406d.a(mx0VarA);
                    }
                    byte b14 = bArr3[0];
                    if (b14 != -2) {
                        if (b14 == -1) {
                            i14 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b13 = bArr3[9];
                        } else if (b14 != 31) {
                            i10 = ((bArr3[5] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b10 = bArr3[7];
                        } else {
                            i14 = ((bArr3[7] & 255) << 4) | ((bArr3[6] & 3) << 12);
                            b13 = bArr3[8];
                        }
                        i11 = (i14 | ((b13 & 60) >> 2)) + 1;
                        z10 = true;
                        if (z10) {
                            i11 = (i11 * 16) / 14;
                        }
                        this.f157412j = i11;
                        if (b14 != -2) {
                            if (b14 != -1) {
                                i12 = (bArr3[4] & 7) << 4;
                                b12 = bArr3[7];
                            } else if (b14 != 31) {
                                i12 = (bArr3[4] & 1) << 6;
                                b11 = bArr3[5];
                            } else {
                                i12 = (bArr3[5] & 7) << 4;
                                b12 = bArr3[6];
                            }
                            i13 = b12 & 60;
                            this.f157410h = (int) ((((long) ((((i13 >> 2) | i12) + 1) * 32)) * 1000000) / ((long) this.f157411i.A));
                            this.f157403a.e(0);
                            this.f157406d.a(18, this.f157403a);
                            this.f157407e = 2;
                        } else {
                            i12 = (bArr3[5] & 1) << 6;
                            b11 = bArr3[4];
                        }
                        i13 = b11 & 252;
                        this.f157410h = (int) ((((long) ((((i13 >> 2) | i12) + 1) * 32)) * 1000000) / ((long) this.f157411i.A));
                        this.f157403a.e(0);
                        this.f157406d.a(18, this.f157403a);
                        this.f157407e = 2;
                    } else {
                        i10 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4);
                        b10 = bArr3[6];
                    }
                    i11 = (i10 | ((b10 & 240) >> 4)) + 1;
                    z10 = false;
                    if (z10) {
                        i11 = (i11 * 16) / 14;
                    }
                    this.f157412j = i11;
                    if (b14 != -2) {
                        if (b14 != -1) {
                            i12 = (bArr3[4] & 7) << 4;
                            b12 = bArr3[7];
                        } else if (b14 != 31) {
                            i12 = (bArr3[4] & 1) << 6;
                            b11 = bArr3[5];
                        } else {
                            i12 = (bArr3[5] & 7) << 4;
                            b12 = bArr3[6];
                        }
                        i13 = b12 & 60;
                        this.f157410h = (int) ((((long) ((((i13 >> 2) | i12) + 1) * 32)) * 1000000) / ((long) this.f157411i.A));
                        this.f157403a.e(0);
                        this.f157406d.a(18, this.f157403a);
                        this.f157407e = 2;
                    } else {
                        i12 = (bArr3[5] & 1) << 6;
                        b11 = bArr3[4];
                    }
                    i13 = b11 & 252;
                    this.f157410h = (int) ((((long) ((((i13 >> 2) | i12) + 1) * 32)) * 1000000) / ((long) this.f157411i.A));
                    this.f157403a.e(0);
                    this.f157406d.a(18, this.f157403a);
                    this.f157407e = 2;
                }
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(i15, this.f157412j - this.f157408f);
                this.f157406d.a(iMin2, jb2Var);
                int i19 = this.f157408f + iMin2;
                this.f157408f = i19;
                int i20 = this.f157412j;
                if (i19 == i20) {
                    long j10 = this.f157413k;
                    if (j10 != -9223372036854775807L) {
                        this.f157406d.a(j10, 1, i20, 0, null);
                        this.f157413k += this.f157410h;
                    }
                    this.f157407e = 0;
                }
            }
        }
    }

    @Override // yads.ul0
    public final void b() {
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f157405c = l93Var.f151907e;
        l93Var.b();
        this.f157406d = pq0Var.a(l93Var.f151906d, 1);
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f157413k = j10;
        }
    }

    @Override // yads.ul0
    public final void a() {
        this.f157407e = 0;
        this.f157408f = 0;
        this.f157409g = 0;
        this.f157413k = -9223372036854775807L;
    }
}
