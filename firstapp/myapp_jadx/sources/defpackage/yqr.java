package defpackage;

import androidx.media3.common.a;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class yqr implements fwf {
    public final String a;
    public final int b;
    public final nsz c;
    public final msz d;
    public njg0 e;
    public String f;
    public a g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public yqr(String str, int i) {
        this.a = str;
        this.b = i;
        nsz nszVar = new nsz(1024);
        this.c = nszVar;
        byte[] bArr = nszVar.a;
        this.d = new msz(bArr.length, bArr);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.fwf
    public final void a(nsz nszVar) throws ssz {
        int iG;
        boolean zF;
        ly0.g(this.e);
        while (nszVar.a() > 0) {
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    nsz nszVar2 = this.c;
                    msz mszVar = this.d;
                    if (i == 2) {
                        int iW = ((this.k & (-225)) << 8) | nszVar.w();
                        this.j = iW;
                        if (iW > nszVar2.a.length) {
                            nszVar2.F(iW);
                            byte[] bArr = nszVar2.a;
                            mszVar.k(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i != 3) {
                            fm20.a();
                            return;
                        }
                        int iMin = Math.min(nszVar.a(), this.j - this.i);
                        nszVar.h(mszVar.a, this.i, iMin);
                        int i2 = this.i + iMin;
                        this.i = i2;
                        if (i2 == this.j) {
                            mszVar.m(0);
                            if (mszVar.f()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int iG2 = mszVar.g(1);
                                int iG3 = iG2 == 1 ? mszVar.g(1) : 0;
                                this.n = iG3;
                                if (iG3 != 0) {
                                    throw ssz.a(null, null);
                                }
                                if (iG2 == 1) {
                                    mszVar.g((mszVar.g(2) + 1) * 8);
                                }
                                if (!mszVar.f()) {
                                    throw ssz.a(null, null);
                                }
                                this.o = mszVar.g(6);
                                int iG4 = mszVar.g(4);
                                int iG5 = mszVar.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw ssz.a(null, null);
                                }
                                if (iG2 == 0) {
                                    int iE = mszVar.e();
                                    int iB = mszVar.b();
                                    s1.a aVarB = s1.b(mszVar, true);
                                    this.v = aVarB.c;
                                    this.s = aVarB.a;
                                    this.u = aVarB.b;
                                    int iB2 = iB - mszVar.b();
                                    mszVar.m(iE);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    mszVar.h(iB2, bArr2);
                                    a.C0062a c0062a = new a.C0062a();
                                    c0062a.a = this.f;
                                    c0062a.l = gqv.m("video/mp2t");
                                    c0062a.m = gqv.m("audio/mp4a-latm");
                                    c0062a.j = this.v;
                                    c0062a.E = this.u;
                                    c0062a.F = this.s;
                                    c0062a.p = Collections.singletonList(bArr2);
                                    c0062a.d = this.a;
                                    c0062a.f = this.b;
                                    a aVar = new a(c0062a);
                                    if (!aVar.equals(this.g)) {
                                        this.g = aVar;
                                        this.t = 1024000000 / ((long) aVar.G);
                                        this.e.d(aVar);
                                    }
                                } else {
                                    int iG6 = mszVar.g((mszVar.g(2) + 1) * 8);
                                    int iB3 = mszVar.b();
                                    s1.a aVarB2 = s1.b(mszVar, true);
                                    this.v = aVarB2.c;
                                    this.s = aVarB2.a;
                                    this.u = aVarB2.b;
                                    mszVar.o(iG6 - (iB3 - mszVar.b()));
                                }
                                int iG7 = mszVar.g(3);
                                this.p = iG7;
                                if (iG7 == 0) {
                                    mszVar.o(8);
                                } else if (iG7 == 1) {
                                    mszVar.o(9);
                                } else if (iG7 == 3 || iG7 == 4 || iG7 == 5) {
                                    mszVar.o(6);
                                } else {
                                    if (iG7 != 6 && iG7 != 7) {
                                        fm20.a();
                                        return;
                                    }
                                    mszVar.o(1);
                                }
                                boolean zF2 = mszVar.f();
                                this.q = zF2;
                                this.r = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.r = mszVar.g((mszVar.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = mszVar.f();
                                            this.r = (this.r << 8) + ((long) mszVar.g(8));
                                        } while (zF);
                                    }
                                }
                                if (mszVar.f()) {
                                    mszVar.o(8);
                                }
                            }
                            if (this.n != 0) {
                                throw ssz.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ssz.a(null, null);
                            }
                            if (this.p != 0) {
                                throw ssz.a(null, null);
                            }
                            int i3 = 0;
                            do {
                                iG = mszVar.g(8);
                                i3 += iG;
                            } while (iG == 255);
                            int iE2 = mszVar.e();
                            if ((iE2 & 7) == 0) {
                                nszVar2.I(iE2 >> 3);
                            } else {
                                mszVar.h(i3 * 8, nszVar2.a);
                                nszVar2.I(0);
                            }
                            this.e.f(i3, nszVar2);
                            ly0.f(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i3, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                mszVar.o((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iW2 = nszVar.w();
                    if ((iW2 & 224) == 224) {
                        this.k = iW2;
                        this.h = 2;
                    } else if (iW2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (nszVar.w() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.fwf
    public final void c() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.fwf
    public final void e(m4h m4hVar, wxg0.c cVar) {
        cVar.a();
        cVar.b();
        this.e = m4hVar.r(cVar.d, 1);
        cVar.b();
        this.f = cVar.e;
    }

    @Override // defpackage.fwf
    public final void f(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.fwf
    public final void d(boolean z) {
    }
}
