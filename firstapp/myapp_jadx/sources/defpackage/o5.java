package defpackage;

import androidx.media3.common.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o5 implements fwf {
    public final msz a;
    public final nsz b;
    public final String c;
    public final int d;
    public final String e;
    public String f;
    public njg0 g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public a l;
    public int m;
    public long n;

    public o5(String str, int i, String str2) {
        msz mszVar = new msz(128, new byte[128]);
        this.a = mszVar;
        this.b = new nsz(mszVar.a);
        this.h = 0;
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0212  */
    /* JADX WARN: Code duplicated, block: B:149:0x0254  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fwf
    public final void a(nsz nszVar) {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int iG;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ly0.g(this.g);
        while (nszVar.a() > 0) {
            int i17 = this.h;
            nsz nszVar2 = this.b;
            if (i17 == 0) {
                while (nszVar.a() > 0) {
                    if (this.j) {
                        int iW = nszVar.w();
                        if (iW == 119) {
                            this.j = false;
                            this.h = 1;
                            byte[] bArr = nszVar2.a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.i = 2;
                            break;
                        }
                        this.j = iW == 11;
                    } else {
                        this.j = nszVar.w() == 11;
                    }
                }
            } else if (i17 == 1) {
                byte[] bArr2 = nszVar2.a;
                int iMin = Math.min(nszVar.a(), 128 - this.i);
                nszVar.h(bArr2, this.i, iMin);
                int i18 = this.i + iMin;
                this.i = i18;
                if (i18 == 128) {
                    msz mszVar = this.a;
                    mszVar.m(0);
                    int iE = mszVar.e();
                    mszVar.o(40);
                    Object[] objArr = mszVar.g(5) > 10;
                    mszVar.m(iE);
                    int[] iArr = p5.d;
                    int[] iArr2 = p5.b;
                    if (objArr == true) {
                        mszVar.o(16);
                        int iG2 = mszVar.g(2);
                        if (iG2 == 0) {
                            b = 0;
                        } else if (iG2 != 1) {
                            b = iG2 != 2 ? (byte) -1 : (byte) 2;
                        } else {
                            b = 1;
                        }
                        mszVar.o(3);
                        iG = (mszVar.g(11) + 1) * 2;
                        int iG3 = mszVar.g(2);
                        if (iG3 == 3) {
                            i5 = p5.c[mszVar.g(2)];
                            i6 = 3;
                            i7 = 6;
                        } else {
                            int iG4 = mszVar.g(2);
                            int i19 = p5.a[iG4];
                            i5 = iArr2[iG3];
                            i6 = iG4;
                            i7 = i19;
                        }
                        i3 = i7 * 256;
                        int i20 = (iG * i5) / (i7 * 32);
                        int iG5 = mszVar.g(3);
                        boolean zF = mszVar.f();
                        i2 = iArr[iG5] + (zF ? 1 : 0);
                        mszVar.o(10);
                        if (mszVar.f()) {
                            mszVar.o(8);
                        }
                        if (iG5 == 0) {
                            mszVar.o(5);
                            if (mszVar.f()) {
                                mszVar.o(8);
                            }
                        }
                        if (b == 1 && mszVar.f()) {
                            mszVar.o(16);
                        }
                        if (mszVar.f()) {
                            if (iG5 > 2) {
                                mszVar.o(2);
                            }
                            if ((iG5 & 1) == 0 || iG5 <= 2) {
                                i12 = 6;
                            } else {
                                i12 = 6;
                                mszVar.o(6);
                            }
                            if ((iG5 & 4) != 0) {
                                mszVar.o(i12);
                            }
                            if (zF && mszVar.f()) {
                                mszVar.o(5);
                            }
                            if (b != 0) {
                                i8 = i6;
                            } else {
                                if (mszVar.f()) {
                                    i13 = 6;
                                    mszVar.o(6);
                                } else {
                                    i13 = 6;
                                }
                                if (iG5 == 0 && mszVar.f()) {
                                    mszVar.o(i13);
                                }
                                if (mszVar.f()) {
                                    mszVar.o(i13);
                                }
                                int iG6 = mszVar.g(2);
                                if (iG6 == 1) {
                                    mszVar.o(5);
                                    i15 = 2;
                                } else {
                                    if (iG6 == 2) {
                                        mszVar.o(12);
                                    } else if (iG6 == 3) {
                                        int iG7 = mszVar.g(5);
                                        if (mszVar.f()) {
                                            mszVar.o(5);
                                            if (mszVar.f()) {
                                                i16 = 4;
                                                mszVar.o(4);
                                            } else {
                                                i16 = 4;
                                            }
                                            if (mszVar.f()) {
                                                mszVar.o(i16);
                                            }
                                            if (mszVar.f()) {
                                                mszVar.o(i16);
                                            }
                                            if (mszVar.f()) {
                                                mszVar.o(i16);
                                            }
                                            if (mszVar.f()) {
                                                mszVar.o(i16);
                                            }
                                            if (mszVar.f()) {
                                                mszVar.o(i16);
                                            }
                                            if (mszVar.f()) {
                                                mszVar.o(i16);
                                            }
                                            if (mszVar.f()) {
                                                if (mszVar.f()) {
                                                    mszVar.o(i16);
                                                }
                                                if (mszVar.f()) {
                                                    mszVar.o(i16);
                                                }
                                            }
                                        }
                                        if (mszVar.f()) {
                                            mszVar.o(5);
                                            if (mszVar.f()) {
                                                mszVar.o(7);
                                                if (mszVar.f()) {
                                                    i14 = 8;
                                                    mszVar.o(8);
                                                } else {
                                                    i14 = 8;
                                                }
                                            } else {
                                                i14 = 8;
                                            }
                                        } else {
                                            i14 = 8;
                                        }
                                        i15 = 2;
                                        mszVar.o((iG7 + 2) * i14);
                                        mszVar.c();
                                    }
                                    i15 = 2;
                                }
                                if (iG5 < i15) {
                                    if (mszVar.f()) {
                                        mszVar.o(14);
                                    }
                                    if (iG5 == 0 && mszVar.f()) {
                                        mszVar.o(14);
                                    }
                                }
                                if (mszVar.f()) {
                                    i8 = i6;
                                    if (i8 == 0) {
                                        mszVar.o(5);
                                    } else {
                                        for (int i21 = 0; i21 < i7; i21++) {
                                            if (mszVar.f()) {
                                                mszVar.o(5);
                                            }
                                        }
                                    }
                                } else {
                                    i8 = i6;
                                }
                            }
                        } else {
                            i8 = i6;
                        }
                        if (mszVar.f()) {
                            mszVar.o(5);
                            if (iG5 == 2) {
                                mszVar.o(4);
                            }
                            if (iG5 >= 6) {
                                mszVar.o(2);
                            }
                            if (mszVar.f()) {
                                i11 = 8;
                                mszVar.o(8);
                            } else {
                                i11 = 8;
                            }
                            if (iG5 == 0 && mszVar.f()) {
                                mszVar.o(i11);
                            }
                            i9 = 3;
                            if (iG3 < 3) {
                                mszVar.n();
                            }
                        } else {
                            i9 = 3;
                        }
                        if (b == 0 && i8 != i9) {
                            mszVar.n();
                        }
                        if (b == 2 && (i8 == i9 || mszVar.f())) {
                            i10 = 6;
                            mszVar.o(6);
                        } else {
                            i10 = 6;
                        }
                        str = (mszVar.f() && mszVar.g(i10) == 1 && mszVar.g(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                        i4 = i20;
                    } else {
                        mszVar.o(32);
                        int iG8 = mszVar.g(2);
                        String str2 = iG8 == 3 ? null : "audio/ac3";
                        int iG9 = mszVar.g(6);
                        int i22 = p5.e[iG9 / 2] * 1000;
                        int iA = p5.a(iG8, iG9);
                        mszVar.o(8);
                        int iG10 = mszVar.g(3);
                        if ((iG10 & 1) == 0 || iG10 == 1) {
                            i = 2;
                        } else {
                            i = 2;
                            mszVar.o(2);
                        }
                        if ((iG10 & 4) != 0) {
                            mszVar.o(i);
                        }
                        if (iG10 == i) {
                            mszVar.o(i);
                        }
                        int i23 = iG8 < 3 ? iArr2[iG8] : -1;
                        i2 = iArr[iG10] + (mszVar.f() ? 1 : 0);
                        i3 = 1536;
                        str = str2;
                        i4 = i22;
                        iG = iA;
                        i5 = i23;
                    }
                    a aVar = this.l;
                    if (aVar == null || i2 != aVar.F || i5 != aVar.G || !Objects.equals(str, aVar.n)) {
                        a.C0062a c0062a = new a.C0062a();
                        c0062a.a = this.f;
                        c0062a.l = gqv.m(this.e);
                        c0062a.m = gqv.m(str);
                        c0062a.E = i2;
                        c0062a.F = i5;
                        c0062a.d = this.c;
                        c0062a.f = this.d;
                        c0062a.i = i4;
                        if ("audio/ac3".equals(str)) {
                            c0062a.h = i4;
                        }
                        a aVar2 = new a(c0062a);
                        this.l = aVar2;
                        this.g.d(aVar2);
                    }
                    this.m = iG;
                    this.k = (((long) i3) * 1000000) / ((long) this.l.G);
                    nszVar2.I(0);
                    this.g.f(128, nszVar2);
                    this.h = 2;
                }
            } else if (i17 == 2) {
                int iMin2 = Math.min(nszVar.a(), this.m - this.i);
                this.g.f(iMin2, nszVar);
                int i24 = this.i + iMin2;
                this.i = i24;
                if (i24 == this.m) {
                    ly0.f(this.n != -9223372036854775807L);
                    this.g.a(this.n, 1, this.m, 0, null);
                    this.n += this.k;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.fwf
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.fwf
    public final void e(m4h m4hVar, wxg0.c cVar) {
        cVar.a();
        cVar.b();
        this.f = cVar.e;
        cVar.b();
        this.g = m4hVar.r(cVar.d, 1);
    }

    @Override // defpackage.fwf
    public final void f(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.fwf
    public final void d(boolean z) {
    }

    public o5(String str) {
        this(null, 0, str);
    }
}
