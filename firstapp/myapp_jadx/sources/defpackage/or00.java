package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class or00 implements wxg0 {
    public final fwf a;
    public final msz b = new msz(10, new byte[10]);
    public int c = 0;
    public int d;
    public zxf0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public or00(fwf fwfVar) {
        this.a = fwfVar;
    }

    @Override // defpackage.wxg0
    public final void a(int i, nsz nszVar) {
        long jB;
        ly0.g(this.e);
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        fwf fwfVar = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    cft.g("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        fm20.a();
                        return;
                    }
                    if (this.j != -1) {
                        cft.g("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    fwfVar.d(nszVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (nszVar.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                msz mszVar = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (d(nszVar, mszVar.a, Math.min(10, this.i)) && d(nszVar, null, this.i)) {
                            mszVar.m(0);
                            if (this.f) {
                                mszVar.o(4);
                                long jG = ((long) mszVar.g(3)) << 30;
                                mszVar.o(1);
                                long jG2 = ((long) (mszVar.g(15) << 15)) | jG;
                                mszVar.o(1);
                                long jG3 = jG2 | ((long) mszVar.g(15));
                                mszVar.o(1);
                                if (!this.h && this.g) {
                                    mszVar.o(4);
                                    long jG4 = ((long) mszVar.g(3)) << 30;
                                    mszVar.o(1);
                                    long jG5 = jG4 | ((long) (mszVar.g(15) << 15));
                                    mszVar.o(1);
                                    long jG6 = jG5 | ((long) mszVar.g(15));
                                    mszVar.o(1);
                                    this.e.b(jG6);
                                    this.h = true;
                                }
                                jB = this.e.b(jG3);
                            } else {
                                jB = -9223372036854775807L;
                            }
                            i6 |= this.k ? 4 : 0;
                            fwfVar.f(i6, jB);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            fm20.a();
                            return;
                        }
                        int iA = nszVar.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : iA - i8;
                        if (i9 > 0) {
                            iA -= i9;
                            nszVar.H(nszVar.b + iA);
                        }
                        fwfVar.a(nszVar);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - iA;
                            this.j = i11;
                            if (i11 == 0) {
                                fwfVar.d(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (d(nszVar, mszVar.a, 9)) {
                    this.c = e() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                nszVar.J(nszVar.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    @Override // defpackage.wxg0
    public final void b(zxf0 zxf0Var, m4h m4hVar, wxg0.c cVar) {
        this.e = zxf0Var;
        this.a.e(m4hVar, cVar);
    }

    @Override // defpackage.wxg0
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.c();
    }

    public final boolean d(nsz nszVar, byte[] bArr, int i) {
        int iMin = Math.min(nszVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            nszVar.J(iMin);
        } else {
            nszVar.h(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    public final boolean e() {
        msz mszVar = this.b;
        mszVar.m(0);
        int iG = mszVar.g(24);
        if (iG != 1) {
            h08.a(iG, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        mszVar.o(8);
        int iG2 = mszVar.g(16);
        mszVar.o(5);
        this.k = mszVar.f();
        mszVar.o(2);
        this.f = mszVar.f();
        this.g = mszVar.f();
        mszVar.o(6);
        int iG3 = mszVar.g(8);
        this.i = iG3;
        if (iG2 == 0) {
            this.j = -1;
            return true;
        }
        int i = (iG2 - 3) - iG3;
        this.j = i;
        if (i < 0) {
            cft.g("PesReader", "Found negative packet payload size: " + this.j);
            this.j = -1;
        }
        return true;
    }
}
