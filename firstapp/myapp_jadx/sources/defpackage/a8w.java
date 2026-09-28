package defpackage;

import androidx.media3.common.a;
import java.io.EOFException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class a8w implements k4h {
    public final long a;
    public final nsz b;
    public final k8w.a c;
    public final hyj d;
    public final r6n e;
    public final dre f;
    public m4h g;
    public njg0 h;
    public njg0 i;
    public int j;
    public uov k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public b580 q;
    public boolean r;
    public boolean s;
    public long t;

    public a8w(long j) {
        this.a = j;
        this.b = new nsz(10);
        this.c = new k8w.a();
        this.d = new hyj();
        this.l = -9223372036854775807L;
        this.e = new r6n();
        dre dreVar = new dre();
        this.f = dreVar;
        this.i = dreVar;
        this.o = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0241  */
    /* JADX WARN: Code duplicated, block: B:106:0x024d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0261  */
    /* JADX WARN: Code duplicated, block: B:115:0x0267  */
    /* JADX WARN: Code duplicated, block: B:116:0x026b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0275  */
    /* JADX WARN: Code duplicated, block: B:123:0x028e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0295  */
    /* JADX WARN: Code duplicated, block: B:129:0x0299  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    /* JADX WARN: Code duplicated, block: B:206:0x04be  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:210:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:67:0x0193  */
    /* JADX WARN: Code duplicated, block: B:68:0x0198  */
    /* JADX WARN: Code duplicated, block: B:71:0x019d  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b2 A[LOOP:4: B:76:0x01b0->B:77:0x01b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e1  */
    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws Throwable {
        Throwable th;
        int i;
        int i2;
        long j;
        nsz nszVar;
        long j2;
        int iC;
        int i3;
        int i4;
        int iJ;
        nsz nszVar2;
        int iJ2;
        int iA;
        long jY;
        long[] jArr;
        int i5;
        int i6;
        long j3;
        int i7;
        int i8;
        int i9;
        long position;
        int i10;
        long length;
        long jT;
        long j4;
        b580 vvaVar;
        long jT2;
        long[] jArr2;
        int i11;
        lxv lxvVar;
        b580 aVar;
        long jO;
        int iW;
        ly0.g(this.h);
        String str = jrh0.a;
        int i12 = this.j;
        k8w.a aVar2 = this.c;
        if (i12 == 0) {
            try {
                g(l4hVar, false);
            } catch (EOFException unused) {
                th = null;
                i = -1;
                i2 = -1;
                j = 1000000;
            }
        }
        b580 b580Var = this.q;
        nsz nszVar3 = this.b;
        if (b580Var == null) {
            nsz nszVar4 = new nsz(aVar2.c);
            j = 1000000;
            l4hVar.m(nszVar4.a, 0, aVar2.c);
            int i13 = aVar2.a & 1;
            int i14 = aVar2.e;
            th = null;
            if (i13 != 0) {
                if (i14 != 1) {
                    i4 = 36;
                } else {
                    i4 = 21;
                }
            } else if (i14 != 1) {
                i4 = 21;
            } else {
                i4 = 13;
            }
            j2 = 0;
            if (nszVar4.c >= i4 + 4) {
                nszVar4.I(i4);
                iJ = nszVar4.j();
                if (iJ != 1483304551 && iJ != 1231971951) {
                    if (nszVar4.c >= 40) {
                        nszVar4.I(36);
                        if (nszVar4.j() == 1447187017) {
                            iJ = 1447187017;
                        } else {
                            iJ = 0;
                        }
                    } else {
                        iJ = 0;
                    }
                }
            } else if (nszVar4.c >= 40) {
                nszVar4.I(36);
                if (nszVar4.j() == 1447187017) {
                    iJ = 1447187017;
                } else {
                    iJ = 0;
                }
            } else {
                iJ = 0;
            }
            hyj hyjVar = this.d;
            if (iJ == 1231971951) {
                nszVar2 = nszVar3;
                iJ2 = nszVar4.j();
                if ((iJ2 & 1) != 0) {
                    iA = nszVar4.A();
                } else {
                    iA = -1;
                }
                if ((iJ2 & 2) != 0) {
                    jY = nszVar4.y();
                } else {
                    jY = -1;
                }
                if ((iJ2 & 4) == 4) {
                    jArr2 = new long[100];
                    for (i11 = 0; i11 < 100; i11++) {
                        jArr2[i11] = nszVar4.w();
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((iJ2 & 8) != 0) {
                    nszVar4.J(4);
                }
                if (nszVar4.a() >= 24) {
                    nszVar4.J(21);
                    int iZ = nszVar4.z();
                    i6 = (16773120 & iZ) >> 12;
                    i5 = iZ & 4095;
                } else {
                    i5 = -1;
                    i6 = -1;
                }
                j3 = iA;
                i7 = aVar2.c;
                int i15 = aVar2.d;
                i8 = aVar2.f;
                i9 = aVar2.g;
                if ((hyjVar.a != -1 || hyjVar.b == -1) && i6 != -1 && i5 != -1) {
                    hyjVar.a = i6;
                    hyjVar.b = i5;
                }
                position = l4hVar.getPosition();
                if (l4hVar.getLength() != -1 || jY == -1) {
                    i10 = i9;
                } else {
                    i10 = i9;
                    long j5 = position + jY;
                    if (l4hVar.getLength() != j5) {
                        cft.e("Mp3Extractor", "Data size mismatch between stream (" + l4hVar.getLength() + ") and Xing frame (" + j5 + "), using Xing value.");
                    }
                }
                l4hVar.l(aVar2.c);
                if (iJ == 1483304551) {
                    if (j3 != -1 || j3 == 0) {
                        jT2 = -9223372036854775807L;
                    } else {
                        jT2 = jrh0.T(i15, (j3 * ((long) i10)) - 1);
                    }
                    if (jT2 == -9223372036854775807L) {
                        vvaVar = null;
                    } else {
                        vvaVar = new m8k0(position, i7, jT2, i8, jY, jArr);
                    }
                } else {
                    length = l4hVar.getLength();
                    if (j3 != -1 || j3 == 0) {
                        jT = -9223372036854775807L;
                    } else {
                        jT = jrh0.T(i15, (((long) i10) * j3) - 1);
                    }
                    if (jT != -9223372036854775807L) {
                        if (jY != -1) {
                            length = position + jY;
                            j4 = jY - ((long) i7);
                        } else if (length != -1) {
                            j4 = (length - position) - ((long) i7);
                        } else {
                            vvaVar = null;
                        }
                        long j6 = length;
                        long j7 = j4;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        vvaVar = new vva(c0p.q(jrh0.V(j7, 8000000L, jT, roundingMode)), c0p.q(dkt.b(j7, j3, roundingMode)), j6, position + ((long) i7), false);
                    } else {
                        vvaVar = null;
                    }
                }
            } else if (iJ == 1447187017) {
                long length2 = l4hVar.getLength();
                long position2 = l4hVar.getPosition();
                nszVar4.J(6);
                int iJ3 = nszVar4.j();
                long j8 = position2 + ((long) aVar2.c);
                long jMax = j8 + ((long) iJ3);
                int iJ4 = nszVar4.j();
                if (iJ4 > 0) {
                    long jT3 = jrh0.T(aVar2.d, (((long) iJ4) * ((long) aVar2.g)) - 1);
                    int iC2 = nszVar4.C();
                    int iC3 = nszVar4.C();
                    int iC4 = nszVar4.C();
                    nszVar4.J(2);
                    long j9 = position2 + ((long) aVar2.c);
                    long[] jArr3 = new long[iC2];
                    long[] jArr4 = new long[iC2];
                    int i16 = 0;
                    while (true) {
                        if (i16 >= iC2) {
                            nszVar2 = nszVar3;
                            long[] jArr5 = jArr4;
                            if (length2 != -1 && length2 != jMax) {
                                StringBuilder sbA = q6a0.a(length2, "VBRI data size mismatch: ", ", ");
                                sbA.append(jMax);
                                cft.g("VbriSeeker", sbA.toString());
                            }
                            if (jMax != j9) {
                                StringBuilder sbA2 = q6a0.a(jMax, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                sbA2.append(j9);
                                sbA2.append("\nSeeking will be inaccurate.");
                                cft.g("VbriSeeker", sbA2.toString());
                                jMax = Math.max(jMax, j9);
                            }
                            vvaVar = new rvh0(jArr3, jArr5, jT3, j8, jMax, aVar2.f);
                            break;
                        }
                        nszVar2 = nszVar3;
                        long[] jArr6 = jArr4;
                        jArr3[i16] = (((long) i16) * jT3) / ((long) iC2);
                        jArr6[i16] = j9;
                        if (iC4 == 1) {
                            iW = nszVar4.w();
                        } else if (iC4 == 2) {
                            iW = nszVar4.C();
                        } else if (iC4 == 3) {
                            iW = nszVar4.z();
                        } else {
                            if (iC4 != 4) {
                                vvaVar = null;
                                break;
                            }
                            iW = nszVar4.A();
                        }
                        j9 += ((long) iW) * ((long) iC3);
                        i16++;
                        jArr4 = jArr6;
                        nszVar3 = nszVar2;
                    }
                } else {
                    vvaVar = null;
                    nszVar2 = nszVar3;
                }
                l4hVar.l(aVar2.c);
            } else if (iJ != 1483304551) {
                l4hVar.e();
                vvaVar = null;
                nszVar2 = nszVar3;
            } else {
                nszVar2 = nszVar3;
                iJ2 = nszVar4.j();
                if ((iJ2 & 1) != 0) {
                    iA = nszVar4.A();
                } else {
                    iA = -1;
                }
                if ((iJ2 & 2) != 0) {
                    jY = nszVar4.y();
                } else {
                    jY = -1;
                }
                if ((iJ2 & 4) == 4) {
                    jArr2 = new long[100];
                    while (i11 < 100) {
                        jArr2[i11] = nszVar4.w();
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                if ((iJ2 & 8) != 0) {
                    nszVar4.J(4);
                }
                if (nszVar4.a() >= 24) {
                    nszVar4.J(21);
                    int iZ2 = nszVar4.z();
                    i6 = (16773120 & iZ2) >> 12;
                    i5 = iZ2 & 4095;
                } else {
                    i5 = -1;
                    i6 = -1;
                }
                j3 = iA;
                i7 = aVar2.c;
                int i17 = aVar2.d;
                i8 = aVar2.f;
                i9 = aVar2.g;
                if (hyjVar.a != -1) {
                    hyjVar.a = i6;
                    hyjVar.b = i5;
                } else {
                    hyjVar.a = i6;
                    hyjVar.b = i5;
                }
                position = l4hVar.getPosition();
                if (l4hVar.getLength() != -1) {
                    i10 = i9;
                } else {
                    i10 = i9;
                }
                l4hVar.l(aVar2.c);
                if (iJ == 1483304551) {
                    if (j3 != -1) {
                        jT2 = -9223372036854775807L;
                    } else {
                        jT2 = -9223372036854775807L;
                    }
                    if (jT2 == -9223372036854775807L) {
                        vvaVar = null;
                    } else {
                        vvaVar = new m8k0(position, i7, jT2, i8, jY, jArr);
                    }
                } else {
                    length = l4hVar.getLength();
                    if (j3 != -1) {
                        jT = -9223372036854775807L;
                    } else {
                        jT = -9223372036854775807L;
                    }
                    if (jT != -9223372036854775807L) {
                        if (jY != -1) {
                            length = position + jY;
                            j4 = jY - ((long) i7);
                        } else if (length != -1) {
                            j4 = (length - position) - ((long) i7);
                        } else {
                            vvaVar = null;
                        }
                        long j10 = length;
                        long j11 = j4;
                        RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                        vvaVar = new vva(c0p.q(jrh0.V(j11, 8000000L, jT, roundingMode2)), c0p.q(dkt.b(j11, j3, roundingMode2)), j10, position + ((long) i7), false);
                    } else {
                        vvaVar = null;
                    }
                }
            }
            uov uovVar = this.k;
            long position3 = l4hVar.getPosition();
            if (uovVar == null) {
                lxvVar = null;
                break;
            }
            uov.a[] aVarArr = uovVar.a;
            int length3 = aVarArr.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length3) {
                    lxvVar = null;
                    break;
                }
                uov.a aVar3 = aVarArr[i18];
                if (aVar3 instanceof kxv) {
                    kxv kxvVar = (kxv) aVar3;
                    int[] iArr = kxvVar.e;
                    if (uovVar == null) {
                        jO = -9223372036854775807L;
                        break;
                    }
                    uov.a[] aVarArr2 = uovVar.a;
                    int length4 = aVarArr2.length;
                    int i19 = 0;
                    while (true) {
                        if (i19 >= length4) {
                            jO = -9223372036854775807L;
                            break;
                        }
                        uov.a aVar4 = aVarArr2[i19];
                        if (aVar4 instanceof qjf0) {
                            qjf0 qjf0Var = (qjf0) aVar4;
                            if (qjf0Var.a.equals("TLEN")) {
                                jO = jrh0.O(Long.parseLong(qjf0Var.c.get(0)));
                                break;
                            }
                        }
                        i19++;
                    }
                    int length5 = iArr.length;
                    int i20 = length5 + 1;
                    long[] jArr7 = new long[i20];
                    long[] jArr8 = new long[i20];
                    jArr7[0] = position3;
                    jArr8[0] = 0;
                    long j12 = 0;
                    int i21 = 1;
                    while (i21 <= length5) {
                        int i22 = i21 - 1;
                        position3 += (long) (kxvVar.c + iArr[i22]);
                        j12 += (long) (kxvVar.d + kxvVar.f[i22]);
                        jArr7[i21] = position3;
                        jArr8[i21] = j12;
                        i21++;
                        length5 = length5;
                        iArr = iArr;
                    }
                    lxvVar = new lxv(jO, jArr7, jArr8);
                    break;
                }
                i18++;
            }
            if (this.r) {
                aVar = new b580.a(-9223372036854775807L);
                nszVar = nszVar2;
            } else {
                if (lxvVar != null) {
                    vvaVar = lxvVar;
                } else if (vvaVar == null) {
                    vvaVar = null;
                }
                if (vvaVar != null) {
                    vvaVar.g();
                }
                if (vvaVar != null) {
                    vvaVar.g();
                    nszVar = nszVar2;
                } else {
                    nszVar = nszVar2;
                    l4hVar.m(nszVar.a, 0, 4);
                    nszVar.I(0);
                    aVar2.a(nszVar.j());
                    vvaVar = new vva(aVar2.f, aVar2.c, l4hVar.getLength(), l4hVar.getPosition(), false);
                }
                njg0 njg0Var = this.h;
                vvaVar.k();
                njg0Var.getClass();
                aVar = vvaVar;
            }
            this.q = aVar;
            this.g.k(aVar);
            a.C0062a c0062a = new a.C0062a();
            c0062a.l = gqv.m("audio/mpeg");
            c0062a.m = gqv.m(aVar2.b);
            c0062a.n = 4096;
            c0062a.E = aVar2.e;
            c0062a.F = aVar2.d;
            c0062a.H = hyjVar.a;
            c0062a.I = hyjVar.b;
            c0062a.k = this.k;
            if (this.q.j() != -2147483647) {
                c0062a.h = this.q.j();
            }
            this.i.d(new a(c0062a));
            this.n = l4hVar.getPosition();
        } else {
            nszVar = nszVar3;
            th = null;
            j = 1000000;
            j2 = 0;
            if (this.n != 0) {
                long position4 = l4hVar.getPosition();
                long j13 = this.n;
                if (position4 < j13) {
                    l4hVar.l((int) (j13 - position4));
                }
            }
        }
        if (this.p == 0) {
            l4hVar.e();
            if (f(l4hVar)) {
                i = -1;
            } else {
                nszVar.I(0);
                int iJ5 = nszVar.j();
                if (((-128000) & iJ5) != (((long) this.j) & (-128000)) || k8w.a(iJ5) == -1) {
                    l4hVar.l(1);
                    this.j = 0;
                } else {
                    aVar2.a(iJ5);
                    if (this.l == -9223372036854775807L) {
                        this.l = this.q.h(l4hVar.getPosition());
                        long j14 = this.a;
                        if (j14 != -9223372036854775807L) {
                            this.l = (j14 - this.q.h(j2)) + this.l;
                        }
                    }
                    this.p = aVar2.c;
                    this.o = l4hVar.getPosition() + ((long) aVar2.c);
                    if (this.q instanceof ffn) {
                        long j15 = ((this.m + ((long) aVar2.g)) * j) / ((long) aVar2.d);
                        throw th;
                    }
                    iC = this.i.c(l4hVar, this.p, true);
                    if (iC == -1) {
                        i = -1;
                    } else {
                        i3 = this.p - iC;
                        this.p = i3;
                        if (i3 <= 0) {
                            this.i.a(((this.m * j) / ((long) aVar2.d)) + this.l, 1, aVar2.c, 0, null);
                            this.m += (long) aVar2.g;
                            i = 0;
                            this.p = 0;
                        }
                    }
                }
                i = 0;
            }
        } else {
            iC = this.i.c(l4hVar, this.p, true);
            if (iC == -1) {
                i = -1;
            } else {
                i3 = this.p - iC;
                this.p = i3;
                if (i3 <= 0) {
                    i = 0;
                } else {
                    this.i.a(((this.m * j) / ((long) aVar2.d)) + this.l, 1, aVar2.c, 0, null);
                    this.m += (long) aVar2.g;
                    i = 0;
                    this.p = 0;
                }
            }
        }
        i2 = -1;
        if (i == i2) {
            b580 b580Var2 = this.q;
            if (b580Var2 instanceof ffn) {
                if (b580Var2.k() != ((this.m * j) / ((long) aVar2.d)) + this.l) {
                    ((ffn) this.q).getClass();
                    throw th;
                }
            }
        }
        return i;
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) {
        return g(l4hVar, true);
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.p = 0;
        this.t = j2;
        if (this.q instanceof ffn) {
            throw null;
        }
    }

    public final void d() {
        Object obj = this.q;
        if ((obj instanceof vva) && ((uva) obj).g()) {
            long j = this.o;
            if (j == -1 || j == this.q.f()) {
                return;
            }
            vva vvaVar = (vva) this.q;
            this.q = new vva(vvaVar.i, vvaVar.j, this.o, vvaVar.h, vvaVar.k);
            m4h m4hVar = this.g;
            m4hVar.getClass();
            m4hVar.k(this.q);
            this.h.getClass();
            this.q.k();
        }
    }

    public final boolean f(l4h l4hVar) {
        b580 b580Var = this.q;
        if (b580Var != null) {
            long jF = b580Var.f();
            if (jF == -1 || l4hVar.h() <= jF - 4) {
            }
            return true;
        }
        try {
            return !l4hVar.c(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    public final boolean g(l4h l4hVar, boolean z) throws Throwable {
        int iH;
        int i;
        int iA;
        int i2 = z ? 32768 : 131072;
        l4hVar.e();
        if (l4hVar.getPosition() == 0) {
            nsz nszVar = this.e.a;
            int i3 = 0;
            uov uovVarW = null;
            while (true) {
                try {
                    l4hVar.m(nszVar.a, 0, 10);
                    nszVar.I(0);
                    if (nszVar.z() != 4801587) {
                        break;
                    }
                    nszVar.J(3);
                    int iV = nszVar.v();
                    int i4 = iV + 10;
                    if (uovVarW == null) {
                        byte[] bArr = new byte[i4];
                        System.arraycopy(nszVar.a, 0, bArr, 0, 10);
                        l4hVar.m(bArr, 10, iV);
                        uovVarW = new p6n(null).w(i4, bArr);
                    } else {
                        l4hVar.i(iV);
                    }
                    i3 += i4;
                } catch (EOFException unused) {
                }
            }
            l4hVar.e();
            l4hVar.i(i3);
            this.k = uovVarW;
            if (uovVarW != null) {
                this.d.b(uovVarW);
            }
            iH = (int) l4hVar.h();
            if (!z) {
                l4hVar.l(iH);
            }
            i = 0;
        } else {
            iH = 0;
            i = 0;
        }
        int i5 = i;
        int i6 = i5;
        while (true) {
            if (f(l4hVar)) {
                if (i5 > 0) {
                    break;
                }
                d();
                throw new EOFException();
            }
            nsz nszVar2 = this.b;
            nszVar2.I(0);
            int iJ = nszVar2.j();
            if ((i == 0 || ((-128000) & iJ) == (((long) i) & (-128000))) && (iA = k8w.a(iJ)) != -1) {
                i5++;
                if (i5 != 1) {
                    if (i5 == 4) {
                        break;
                    }
                } else {
                    this.c.a(iJ);
                    i = iJ;
                }
                l4hVar.i(iA - 4);
            } else {
                int i7 = i6 + 1;
                if (i6 == i2) {
                    if (z) {
                        return false;
                    }
                    d();
                    throw new EOFException();
                }
                if (z) {
                    l4hVar.e();
                    l4hVar.i(iH + i7);
                } else {
                    l4hVar.l(1);
                }
                i5 = 0;
                i6 = i7;
                i = 0;
            }
        }
        if (z) {
            l4hVar.l(iH + i6);
        } else {
            l4hVar.e();
        }
        this.j = i;
        return true;
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.g = m4hVar;
        njg0 njg0VarR = m4hVar.r(0, 1);
        this.h = njg0VarR;
        this.i = njg0VarR;
        this.g.n();
    }

    @Override // defpackage.k4h
    public final void release() {
    }

    public a8w(int i) {
        this(-9223372036854775807L);
    }
}
