package defpackage;

import androidx.media3.common.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cuh implements k4h {
    public m4h e;
    public njg0 f;
    public uov h;
    public huh i;
    public int j;
    public int k;
    public auh l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final nsz b = new nsz(0, new byte[32768]);
    public final boolean c = false;
    public final duh.a d = new duh.a();
    public int g = 0;

    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws Throwable {
        huh huhVar;
        p480 bVar;
        long j;
        long j2;
        boolean zA;
        int i = this.g;
        boolean z = true;
        int i2 = 0;
        if (i == 0) {
            boolean z2 = !this.c;
            l4hVar.e();
            long jH = l4hVar.h();
            uov uovVarA = euh.a(l4hVar, z2);
            l4hVar.l((int) (l4hVar.h() - jH));
            this.h = uovVarA;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i == 1) {
            l4hVar.m(bArr, 0, bArr.length);
            l4hVar.e();
            this.g = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i == 2) {
            nsz nszVar = new nsz(4);
            l4hVar.readFully(nszVar.a, 0, 4);
            if (nszVar.y() != 1716281667) {
                throw ssz.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i5 = 7;
        int i6 = 6;
        if (i == 3) {
            int i7 = 0;
            huh huhVar2 = this.i;
            boolean z3 = false;
            while (!z3) {
                l4hVar.e();
                byte[] bArr2 = new byte[i3];
                msz mszVar = new msz(i3, bArr2);
                int i8 = i7;
                l4hVar.m(bArr2, i8, i3);
                boolean zF = mszVar.f();
                int iG = mszVar.g(i5);
                int iG2 = mszVar.g(24) + i3;
                if (iG == 0) {
                    byte[] bArr3 = new byte[38];
                    l4hVar.readFully(bArr3, i8, 38);
                    huhVar2 = new huh(i3, bArr3);
                } else {
                    if (huhVar2 == null) {
                        d580.a();
                        return 0;
                    }
                    uov uovVar = huhVar2.l;
                    if (iG == i4) {
                        nsz nszVar2 = new nsz(iG2);
                        l4hVar.readFully(nszVar2.a, i8, iG2);
                        huhVar2 = new huh(huhVar2.a, huhVar2.b, huhVar2.c, huhVar2.d, huhVar2.e, huhVar2.g, huhVar2.h, huhVar2.j, euh.b(nszVar2), huhVar2.l);
                    } else {
                        if (iG == i3) {
                            nsz nszVar3 = new nsz(iG2);
                            l4hVar.readFully(nszVar3.a, 0, iG2);
                            nszVar3.J(i3);
                            uov uovVarA2 = qoi0.a(Arrays.asList(qoi0.b(nszVar3, false, false).a));
                            if (uovVar != null) {
                                uovVarA2 = uovVar.b(uovVarA2);
                            }
                            huhVar = new huh(huhVar2.a, huhVar2.b, huhVar2.c, huhVar2.d, huhVar2.e, huhVar2.g, huhVar2.h, huhVar2.j, huhVar2.k, uovVarA2);
                        } else if (iG == i6) {
                            nsz nszVar4 = new nsz(iG2);
                            l4hVar.readFully(nszVar4.a, 0, iG2);
                            nszVar4.J(4);
                            uov uovVar2 = new uov(pcn.n(eu00.d(nszVar4)));
                            if (uovVar != null) {
                                uovVar2 = uovVar.b(uovVar2);
                            }
                            huhVar = new huh(huhVar2.a, huhVar2.b, huhVar2.c, huhVar2.d, huhVar2.e, huhVar2.g, huhVar2.h, huhVar2.j, huhVar2.k, uovVar2);
                        } else {
                            l4hVar.l(iG2);
                        }
                        huhVar2 = huhVar;
                    }
                }
                String str = jrh0.a;
                this.i = huhVar2;
                z3 = zF;
                i3 = 4;
                i4 = 3;
                i5 = 7;
                i6 = 6;
                i7 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            a aVarC = this.i.c(bArr, this.h);
            njg0 njg0Var = this.f;
            String str2 = jrh0.a;
            a.C0062a c0062aA = aVarC.a();
            c0062aA.l = gqv.m("audio/flac");
            p0j0.a(c0062aA, njg0Var);
            njg0 njg0Var2 = this.f;
            this.i.b();
            njg0Var2.getClass();
            this.g = 4;
            return 0;
        }
        long j3 = 0;
        if (i == 4) {
            l4hVar.e();
            nsz nszVar5 = new nsz(2);
            l4hVar.m(nszVar5.a, 0, 2);
            int iC = nszVar5.C();
            if ((iC >> 2) != 16382) {
                l4hVar.e();
                throw ssz.a(null, "First frame does not start with sync code.");
            }
            l4hVar.e();
            this.k = iC;
            m4h m4hVar = this.e;
            String str3 = jrh0.a;
            long position = l4hVar.getPosition();
            long length = l4hVar.getLength();
            this.i.getClass();
            final huh huhVar3 = this.i;
            huh.a aVar = huhVar3.k;
            if (aVar != null && aVar.a.length > 0) {
                bVar = new guh(huhVar3, position);
                i2 = 0;
            } else if (length == -1 || huhVar3.j <= 0) {
                i2 = 0;
                bVar = new p480.b(huhVar3.b());
            } else {
                int i9 = this.k;
                int i10 = huhVar3.c;
                b64.d dVar = new b64.d() { // from class: zth
                    @Override // b64.d
                    public final long a(long j4) {
                        huh huhVar4 = huhVar3;
                        return jrh0.j((j4 * ((long) huhVar4.e)) / 1000000, 0L, huhVar4.j - 1);
                    }
                };
                auh.a aVar2 = new auh.a(huhVar3, i9);
                long jB = huhVar3.b();
                long j4 = huhVar3.j;
                int i11 = huhVar3.d;
                if (i11 > 0) {
                    j = ((((long) i11) + ((long) i10)) / 2) + 1;
                } else {
                    int i12 = huhVar3.a;
                    j = 64 + (((((i12 != huhVar3.b || i12 <= 0) ? 4096L : i12) * ((long) huhVar3.g)) * ((long) huhVar3.h)) / 8);
                }
                auh auhVar = new auh(dVar, aVar2, jB, j4, position, length, j, Math.max(6, i10));
                this.l = auhVar;
                bVar = auhVar.a;
            }
            m4hVar.k(bVar);
            this.g = 5;
            return i2;
        }
        if (i != 5) {
            fm20.a();
            return 0;
        }
        this.f.getClass();
        this.i.getClass();
        auh auhVar2 = this.l;
        if (auhVar2 != null && auhVar2.c != null) {
            return auhVar2.a(l4hVar, k620Var);
        }
        if (this.n == -1) {
            huh huhVar4 = this.i;
            l4hVar.e();
            l4hVar.i(1);
            byte[] bArr4 = new byte[1];
            l4hVar.m(bArr4, 0, 1);
            boolean z4 = (bArr4[0] & 1) == 1;
            l4hVar.i(2);
            i5 = z4 ? 7 : 6;
            nsz nszVar6 = new nsz(i5);
            byte[] bArr5 = nszVar6.a;
            int i13 = 0;
            while (i13 < i5) {
                int iK = l4hVar.k(bArr5, i13, i5 - i13);
                if (iK == -1) {
                    break;
                }
                i13 += iK;
            }
            nszVar6.H(i13);
            l4hVar.e();
            try {
                long jD = nszVar6.D();
                if (!z4) {
                    jD *= (long) huhVar4.b;
                }
                j3 = jD;
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                throw ssz.a(null, null);
            }
            this.n = j3;
        } else {
            nsz nszVar7 = this.b;
            int i14 = nszVar7.c;
            if (i14 < 32768) {
                int i15 = l4hVar.read(nszVar7.a, i14, 32768 - i14);
                z = i15 == -1;
                if (!z) {
                    nszVar7.H(i14 + i15);
                } else if (nszVar7.a() == 0) {
                    long j5 = this.n * 1000000;
                    huh huhVar5 = this.i;
                    String str4 = jrh0.a;
                    this.f.a(j5 / ((long) huhVar5.e), 1, this.m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i16 = nszVar7.b;
            int i17 = this.m;
            int i18 = this.j;
            if (i17 < i18) {
                nszVar7.J(Math.min(i18 - i17, nszVar7.a()));
            }
            this.i.getClass();
            int i19 = nszVar7.b;
            while (true) {
                int i20 = nszVar7.c - 16;
                duh.a aVar3 = this.d;
                if (i19 > i20) {
                    if (z) {
                        while (true) {
                            int i21 = nszVar7.c;
                            if (i19 <= i21 - this.j) {
                                nszVar7.I(i19);
                                try {
                                    zA = duh.a(nszVar7, this.i, this.k, aVar3);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zA = false;
                                }
                                if (nszVar7.b > nszVar7.c) {
                                    zA = false;
                                }
                                if (zA) {
                                    nszVar7.I(i19);
                                    j2 = aVar3.a;
                                    break;
                                }
                                i19++;
                            } else {
                                nszVar7.I(i21);
                            }
                        }
                    } else {
                        nszVar7.I(i19);
                    }
                    j2 = -1;
                    break;
                }
                nszVar7.I(i19);
                if (duh.a(nszVar7, this.i, this.k, aVar3)) {
                    nszVar7.I(i19);
                    j2 = aVar3.a;
                    break;
                }
                i19++;
            }
            int i22 = nszVar7.b - i16;
            nszVar7.I(i16);
            this.f.f(i22, nszVar7);
            int i23 = this.m + i22;
            this.m = i23;
            if (j2 != -1) {
                long j6 = this.n * 1000000;
                huh huhVar6 = this.i;
                String str5 = jrh0.a;
                this.f.a(j6 / ((long) huhVar6.e), 1, i23, 0, null);
                this.m = 0;
                this.n = j2;
            }
            int length2 = nszVar7.a.length - nszVar7.c;
            if (nszVar7.a() < 16 && length2 < 16) {
                int iA = nszVar7.a();
                byte[] bArr6 = nszVar7.a;
                System.arraycopy(bArr6, nszVar7.b, bArr6, 0, iA);
                nszVar7.I(0);
                nszVar7.H(iA);
            }
        }
        return 0;
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) throws Throwable {
        euh.a(l4hVar, false);
        nsz nszVar = new nsz(4);
        ((jcd) l4hVar).c(nszVar.a, 0, 4, false);
        return nszVar.y() == 1716281667;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            auh auhVar = this.l;
            if (auhVar != null) {
                auhVar.c(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.F(0);
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.e = m4hVar;
        this.f = m4hVar.r(0, 1);
        m4hVar.n();
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
