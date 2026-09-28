package defpackage;

import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f8w implements k4h, p480 {
    public a[] A;
    public long[][] B;
    public int C;
    public long D;
    public int E;
    public w5w F;
    public final ree0.a a;
    public final int b;
    public final nsz c;
    public final nsz d;
    public final nsz e;
    public final nsz f;
    public final ArrayDeque<c8w.a> g;
    public final c580 h;
    public final ArrayList i;
    public c150 j;
    public int k;
    public int l;
    public long m;
    public int n;
    public nsz o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public long w;
    public boolean x;
    public long y;
    public m4h z;

    public static final class a {
        public final fjg0 a;
        public final ojg0 b;
        public final njg0 c;
        public final jxg0 d;
        public int e;

        public a(fjg0 fjg0Var, ojg0 ojg0Var, njg0 njg0Var) {
            this.a = fjg0Var;
            this.b = ojg0Var;
            this.c = njg0Var;
            this.d = "audio/true-hd".equals(fjg0Var.g.n) ? new jxg0() : null;
        }
    }

    public f8w(ree0.a aVar, int i) {
        this.a = aVar;
        this.b = i;
        pcn.b bVar = pcn.b;
        this.j = c150.e;
        this.k = (i & 4) != 0 ? 3 : 0;
        this.h = new c580();
        this.i = new ArrayList();
        this.f = new nsz(16);
        this.g = new ArrayDeque<>();
        this.c = new nsz(qbx.a);
        this.d = new nsz(6);
        this.e = new nsz();
        this.p = -1;
        this.z = m4h.m;
        this.A = new a[0];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:116:0x0265  */
    /* JADX WARN: Code duplicated, block: B:118:0x026b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:266:0x0522  */
    /* JADX WARN: Code duplicated, block: B:267:0x052f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws ssz {
        char c;
        int i;
        int i2;
        int i3;
        int iD;
        int i4;
        long j;
        long j2;
        long position;
        long j3;
        int i5;
        char c2;
        boolean z;
        int i6;
        boolean z2;
        c8w.a aVarPeek;
        while (true) {
            int i7 = this.k;
            ArrayDeque<c8w.a> arrayDeque = this.g;
            int i8 = this.b;
            nsz nszVar = this.e;
            int i9 = 4;
            int i10 = 0;
            int i11 = 2;
            if (i7 == 0) {
                int i12 = this.n;
                nsz nszVar2 = this.f;
                if (i12 == 0) {
                    if (!l4hVar.f(nszVar2.a, 0, 8, true)) {
                        if (this.E != 2 || (i8 & 2) == 0) {
                            return -1;
                        }
                        njg0 njg0VarR = this.z.r(0, 4);
                        w5w w5wVar = this.F;
                        uov uovVar = w5wVar == null ? null : new uov(w5wVar);
                        androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
                        c0062a.k = uovVar;
                        p0j0.a(c0062a, njg0VarR);
                        this.z.n();
                        this.z.k(new p480.b(-9223372036854775807L));
                        return -1;
                    }
                    this.n = 8;
                    nszVar2.I(0);
                    this.m = nszVar2.y();
                    this.l = nszVar2.j();
                }
                long j4 = this.m;
                if (j4 == 1) {
                    l4hVar.readFully(nszVar2.a, 8, 8);
                    this.n += 8;
                    this.m = nszVar2.B();
                } else if (j4 == 0) {
                    long length = l4hVar.getLength();
                    if (length == -1 && (aVarPeek = arrayDeque.peek()) != null) {
                        length = aVarPeek.b;
                    }
                    if (length != -1) {
                        this.m = (length - l4hVar.getPosition()) + ((long) this.n);
                    }
                }
                long j5 = this.m;
                int i13 = this.n;
                if (j5 < i13) {
                    throw ssz.c("Atom size less than header length (unsupported).");
                }
                int i14 = this.l;
                if (i14 == 1836019574 || i14 == 1953653099 || i14 == 1835297121 || i14 == 1835626086 || i14 == 1937007212 || i14 == 1701082227 || i14 == 1835365473 || i14 == 1635284069) {
                    long position2 = l4hVar.getPosition();
                    long j6 = this.m;
                    long j7 = this.n;
                    long j8 = (position2 + j6) - j7;
                    if (j6 != j7 && this.l == 1835365473) {
                        nszVar.F(8);
                        l4hVar.m(nszVar.a, 0, 8);
                        l75.a(nszVar);
                        l4hVar.l(nszVar.b);
                        l4hVar.e();
                    }
                    arrayDeque.push(new c8w.a(this.l, j8));
                    if (this.m == this.n) {
                        m(j8);
                    } else {
                        this.k = 0;
                        this.n = 0;
                    }
                } else if (i14 == 1835296868 || i14 == 1836476516 || i14 == 1751411826 || i14 == 1937011556 || i14 == 1937011827 || i14 == 1937011571 || i14 == 1668576371 || i14 == 1701606260 || i14 == 1937011555 || i14 == 1937011578 || i14 == 1937013298 || i14 == 1937007471 || i14 == 1668232756 || i14 == 1953196132 || i14 == 1718909296 || i14 == 1969517665 || i14 == 1801812339 || i14 == 1768715124) {
                    ly0.f(i13 == 8);
                    ly0.f(this.m <= 2147483647L);
                    nsz nszVar3 = new nsz((int) this.m);
                    System.arraycopy(nszVar2.a, 0, nszVar3.a, 0, 8);
                    this.o = nszVar3;
                    this.k = 1;
                } else {
                    long position3 = l4hVar.getPosition();
                    long j9 = this.n;
                    long j10 = position3 - j9;
                    if (this.l == 1836086884) {
                        this.F = new w5w(0L, j10, -9223372036854775807L, j10 + j9, this.m - j9);
                    }
                    this.o = null;
                    this.k = 1;
                }
            } else {
                if (i7 != 1) {
                    if (i7 == 2) {
                        long position4 = l4hVar.getPosition();
                        int i15 = this.p;
                        if (i15 == -1) {
                            int i16 = 0;
                            int i17 = -1;
                            int i18 = -1;
                            boolean z3 = true;
                            boolean z4 = true;
                            long j11 = Long.MAX_VALUE;
                            long j12 = Long.MAX_VALUE;
                            long j13 = Long.MAX_VALUE;
                            while (true) {
                                a[] aVarArr = this.A;
                                if (i16 >= aVarArr.length) {
                                    break;
                                }
                                a aVar = aVarArr[i16];
                                int i19 = aVar.e;
                                ojg0 ojg0Var = aVar.b;
                                if (i19 != ojg0Var.b) {
                                    long j14 = ojg0Var.c[i19];
                                    long[][] jArr = this.B;
                                    String str = jrh0.a;
                                    long j15 = jArr[i16][i19];
                                    long j16 = j14 - position4;
                                    boolean z5 = j16 < 0 || j16 >= 262144;
                                    if ((!z5 && z4) || (z5 == z4 && j16 < j13)) {
                                        i18 = i16;
                                        z4 = z5;
                                        j13 = j16;
                                        j12 = j15;
                                    }
                                    if (j15 < j11) {
                                        i17 = i16;
                                        z3 = z5;
                                        j11 = j15;
                                    }
                                }
                                i16++;
                            }
                            i15 = (j11 == Long.MAX_VALUE || !z3 || j12 < j11 + 10485760) ? i18 : i17;
                            this.p = i15;
                            if (i15 == -1) {
                                return -1;
                            }
                        }
                        a aVar2 = this.A[i15];
                        njg0 njg0Var = aVar2.c;
                        ojg0 ojg0Var2 = aVar2.b;
                        fjg0 fjg0Var = aVar2.a;
                        int i20 = aVar2.e;
                        long[] jArr2 = ojg0Var2.c;
                        int[] iArr = ojg0Var2.d;
                        long j17 = jArr2[i20] + this.y;
                        int i21 = iArr[i20];
                        jxg0 jxg0Var = aVar2.d;
                        long j18 = (j17 - position4) + ((long) this.q);
                        if (j18 < 0 || j18 >= 262144) {
                            k620Var.a = j17;
                            return 1;
                        }
                        int i22 = fjg0Var.h;
                        int i23 = fjg0Var.k;
                        androidx.media3.common.a aVar3 = fjg0Var.g;
                        if (i22 == 1) {
                            j18 += 8;
                            i21 -= 8;
                        }
                        int i24 = i21;
                        l4hVar.l((int) j18);
                        String str2 = aVar3.n;
                        String str3 = aVar3.n;
                        if (!Objects.equals(str2, "video/avc") ? !Objects.equals(str3, "video/hevc") || (i8 & 128) == 0 : (i8 & 32) == 0) {
                            c = 1;
                            this.t = true;
                        } else {
                            c = 1;
                        }
                        if (i23 != 0) {
                            nsz nszVar4 = this.d;
                            byte[] bArr = nszVar4.a;
                            bArr[0] = 0;
                            bArr[c] = 0;
                            bArr[2] = 0;
                            int i25 = 4 - i23;
                            int i26 = i24 + i25;
                            while (this.r < i26) {
                                int i27 = this.s;
                                if (i27 == 0) {
                                    if (this.t || qbx.d(aVar3) + i23 > iArr[i20] - this.q) {
                                        i3 = i23;
                                        iD = 0;
                                    } else {
                                        iD = qbx.d(aVar3);
                                        i3 = i23 + iD;
                                    }
                                    l4hVar.readFully(bArr, i25, i3);
                                    i2 = i26;
                                    this.q += i3;
                                    nszVar4.I(0);
                                    int iJ = nszVar4.j();
                                    if (iJ < 0) {
                                        throw ssz.a(null, "Invalid NAL length");
                                    }
                                    this.s = iJ - iD;
                                    nsz nszVar5 = this.c;
                                    nszVar5.I(0);
                                    int i28 = iD;
                                    njg0Var.f(4, nszVar5);
                                    this.r += 4;
                                    if (i28 > 0) {
                                        njg0Var.f(i28, nszVar4);
                                        this.r += i28;
                                        if (qbx.c(bArr, i28, aVar3)) {
                                            this.t = true;
                                        }
                                    }
                                } else {
                                    i2 = i26;
                                    int iC = njg0Var.c(l4hVar, i27, false);
                                    this.q += iC;
                                    this.r += iC;
                                    this.s -= iC;
                                }
                                i26 = i2;
                            }
                            i = i26;
                        } else {
                            if ("audio/ac4".equals(str3)) {
                                if (this.r == 0) {
                                    t5.a(i24, nszVar);
                                    njg0Var.f(7, nszVar);
                                    this.r += 7;
                                }
                                i24 += 7;
                            } else if (jxg0Var != null) {
                                jxg0Var.c(l4hVar);
                            }
                            while (true) {
                                int i29 = this.r;
                                if (i29 >= i24) {
                                    break;
                                }
                                int iC2 = njg0Var.c(l4hVar, i24 - i29, false);
                                this.q += iC2;
                                this.r += iC2;
                                this.s -= iC2;
                            }
                            i = i24;
                        }
                        long j19 = ojg0Var2.f[i20];
                        int i30 = ojg0Var2.g[i20];
                        if (!this.t) {
                            i30 |= 67108864;
                        }
                        int i31 = i30;
                        if (jxg0Var != null) {
                            jxg0Var.b(njg0Var, j19, i31, i, 0, null);
                            if (i20 + 1 == ojg0Var2.b) {
                                jxg0Var.a(njg0Var, null);
                            }
                        } else {
                            njg0Var.a(j19, i31, i, 0, null);
                        }
                        aVar2.e++;
                        this.p = -1;
                        this.q = 0;
                        this.r = 0;
                        this.s = 0;
                        this.t = false;
                        return 0;
                    }
                    if (i7 != 3) {
                        fm20.a();
                        return 0;
                    }
                    c580 c580Var = this.h;
                    ArrayList arrayList = c580Var.a;
                    int i32 = c580Var.b;
                    if (i32 != 0) {
                        if (i32 != 1) {
                            short s = 2817;
                            int i33 = 8;
                            short s2 = 2192;
                            if (i32 == 2) {
                                long length2 = l4hVar.getLength();
                                int i34 = c580Var.c - 20;
                                nsz nszVar6 = new nsz(i34);
                                l4hVar.readFully(nszVar6.a, 0, i34);
                                int i35 = 0;
                                while (i35 < i34 / 12) {
                                    nszVar6.J(i11);
                                    byte[] bArr2 = nszVar6.a;
                                    int i36 = nszVar6.b;
                                    int i37 = i11;
                                    int i38 = i36 + 1;
                                    nszVar6.b = i38;
                                    int i39 = bArr2[i36] & 255;
                                    nszVar6.b = i36 + 2;
                                    short s3 = (short) (i39 | ((bArr2[i38] & 255) << 8));
                                    if (s3 != s2 && s3 != 2816 && s3 != s) {
                                        if (s3 != 2819 && s3 != 2820) {
                                            nszVar6.J(i33);
                                        }
                                        i35++;
                                        i34 = i34;
                                        i11 = i37;
                                        s2 = 2192;
                                        s = 2817;
                                        i33 = 8;
                                    }
                                    arrayList.add(new c580.a((length2 - ((long) c580Var.c)) - ((long) nszVar6.l()), nszVar6.l()));
                                    i35++;
                                    i34 = i34;
                                    i11 = i37;
                                    s2 = 2192;
                                    s = 2817;
                                    i33 = 8;
                                }
                                if (arrayList.isEmpty()) {
                                    k620Var.a = 0L;
                                    j3 = 0;
                                } else {
                                    c580Var.b = 3;
                                    j3 = ((c580.a) arrayList.get(0)).a;
                                    k620Var.a = j3;
                                }
                                j = j3;
                            } else {
                                if (i32 != 3) {
                                    fm20.a();
                                    return 0;
                                }
                                long position5 = l4hVar.getPosition();
                                int length3 = (int) ((l4hVar.getLength() - l4hVar.getPosition()) - ((long) c580Var.c));
                                nsz nszVar7 = new nsz(length3);
                                l4hVar.readFully(nszVar7.a, 0, length3);
                                int i40 = 0;
                                while (i40 < arrayList.size()) {
                                    c580.a aVar4 = (c580.a) arrayList.get(i40);
                                    int i41 = i10;
                                    nszVar7.I((int) (aVar4.a - position5));
                                    nszVar7.J(i9);
                                    int iL = nszVar7.l();
                                    Charset charset = StandardCharsets.UTF_8;
                                    int i42 = i41;
                                    String strU = nszVar7.u(iL, charset);
                                    switch (strU.hashCode()) {
                                        case -1711564334:
                                            if (!strU.equals("SlowMotion_Data")) {
                                                i5 = -1;
                                            } else {
                                                i5 = i42;
                                            }
                                            break;
                                        case -1332107749:
                                            if (!strU.equals("Super_SlowMotion_Edit_Data")) {
                                                i5 = -1;
                                            } else {
                                                i5 = 1;
                                            }
                                            break;
                                        case -1251387154:
                                            if (!strU.equals("Super_SlowMotion_Data")) {
                                                i5 = -1;
                                            } else {
                                                i5 = 2;
                                            }
                                            break;
                                        case -830665521:
                                            if (!strU.equals("Super_SlowMotion_Deflickering_On")) {
                                                i5 = -1;
                                            } else {
                                                i5 = 3;
                                            }
                                            break;
                                        case 1760745220:
                                            if (!strU.equals("Super_SlowMotion_BGM")) {
                                                i5 = -1;
                                            } else {
                                                i5 = 4;
                                            }
                                            break;
                                        default:
                                            i5 = -1;
                                            break;
                                    }
                                    switch (i5) {
                                        case 0:
                                            c2 = 2192;
                                            break;
                                        case 1:
                                            c2 = 2819;
                                            break;
                                        case 2:
                                            c2 = 2816;
                                            break;
                                        case 3:
                                            c2 = 2820;
                                            break;
                                        case 4:
                                            c2 = 2817;
                                            break;
                                        default:
                                            throw ssz.a(null, "Invalid SEF name");
                                    }
                                    int i43 = aVar4.b - (iL + 8);
                                    if (c2 == 2192) {
                                        ArrayList arrayList2 = new ArrayList();
                                        List<String> listA = c580.e.a(nszVar7.u(i43, charset));
                                        int i44 = i42;
                                        while (i44 < listA.size()) {
                                            List<String> listA2 = c580.d.a(listA.get(i44));
                                            if (listA2.size() != 3) {
                                                throw ssz.a(null, null);
                                            }
                                            try {
                                                arrayList2.add(new k1a0.a(1 << (Integer.parseInt(listA2.get(2)) - 1), Long.parseLong(listA2.get(i42)), Long.parseLong(listA2.get(1))));
                                                i44++;
                                                i42 = 0;
                                            } catch (NumberFormatException e) {
                                                throw ssz.a(e, null);
                                            }
                                        }
                                        this.i.add(new k1a0(arrayList2));
                                    } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                        fm20.a();
                                        return i42;
                                    }
                                    i40++;
                                    i10 = 0;
                                    i9 = 4;
                                }
                                k620Var.a = 0L;
                                i4 = 1;
                                j2 = 0;
                                j = 0;
                            }
                            if (j == j2) {
                                return i4;
                            }
                            this.k = 0;
                            this.n = 0;
                            return i4;
                        }
                        nsz nszVar8 = new nsz(8);
                        l4hVar.readFully(nszVar8.a, 0, 8);
                        c580Var.c = nszVar8.l() + 8;
                        if (nszVar8.j() != 1397048916) {
                            k620Var.a = 0L;
                            position = 0;
                        } else {
                            position = l4hVar.getPosition() - ((long) (c580Var.c - 12));
                            k620Var.a = position;
                            c580Var.b = 2;
                        }
                        j = position;
                        i4 = 1;
                    } else {
                        long length4 = l4hVar.getLength();
                        long j20 = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                        k620Var.a = j20;
                        i4 = 1;
                        c580Var.b = 1;
                        j = j20;
                    }
                    j2 = 0;
                    if (j == j2) {
                        return i4;
                    }
                    this.k = 0;
                    this.n = 0;
                    return i4;
                }
                long j21 = this.m - ((long) this.n);
                long position6 = l4hVar.getPosition() + j21;
                nsz nszVar9 = this.o;
                if (nszVar9 != null) {
                    l4hVar.readFully(nszVar9.a, this.n, (int) j21);
                    if (this.l == 1718909296) {
                        this.u = true;
                        nszVar9.I(8);
                        int iJ2 = nszVar9.j();
                        int i45 = iJ2 != 1751476579 ? iJ2 != 1903435808 ? 0 : 1 : 2;
                        if (i45 == 0) {
                            nszVar9.J(4);
                            do {
                                if (nszVar9.a() <= 0) {
                                    i45 = 0;
                                    break;
                                }
                                int iJ3 = nszVar9.j();
                                i45 = iJ3 != 1751476579 ? iJ3 != 1903435808 ? 0 : 1 : 2;
                            } while (i45 == 0);
                        }
                        this.E = i45;
                    } else if (!arrayDeque.isEmpty()) {
                        arrayDeque.peek().c.add(new c8w.b(this.l, nszVar9));
                    }
                } else {
                    if (!this.u && this.l == 1835295092) {
                        this.E = 1;
                    }
                    if (j21 < 262144) {
                        l4hVar.l((int) j21);
                    } else {
                        k620Var.a = l4hVar.getPosition() + j21;
                        z = true;
                    }
                    m(position6);
                    if (this.v) {
                        i6 = 1;
                        this.x = true;
                        k620Var.a = this.w;
                        this.v = false;
                        z2 = true;
                    } else {
                        i6 = 1;
                        z2 = z;
                    }
                    if (z2 && this.k != 2) {
                        return i6;
                    }
                }
                z = false;
                m(position6);
                if (this.v) {
                    i6 = 1;
                    this.x = true;
                    k620Var.a = this.w;
                    this.v = false;
                    z2 = true;
                } else {
                    i6 = 1;
                    z2 = z;
                }
                if (z2) {
                    continue;
                }
            }
        }
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) {
        c150 c150VarN;
        w6a0 w6a0VarB = x6a0.b(l4hVar, false, (this.b & 2) != 0);
        if (w6a0VarB != null) {
            c150VarN = pcn.n(w6a0VarB);
        } else {
            pcn.b bVar = pcn.b;
            c150VarN = c150.e;
        }
        this.j = c150VarN;
        return w6a0VarB == null;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        if (j == 0) {
            if (this.k != 3) {
                this.k = 0;
                this.n = 0;
                return;
            } else {
                c580 c580Var = this.h;
                c580Var.a.clear();
                c580Var.b = 0;
                this.i.clear();
                return;
            }
        }
        for (a aVar : this.A) {
            ojg0 ojg0Var = aVar.b;
            int iE = jrh0.e(ojg0Var.f, j2, false);
            while (true) {
                if (iE < 0) {
                    iE = -1;
                    break;
                } else if ((ojg0Var.g[iE] & 1) != 0) {
                    break;
                } else {
                    iE--;
                }
            }
            if (iE == -1) {
                iE = ojg0Var.a(j2);
            }
            aVar.e = iE;
            jxg0 jxg0Var = aVar.d;
            if (jxg0Var != null) {
                jxg0Var.b = false;
                jxg0Var.c = 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[LOOP:2: B:37:0x0087->B:41:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc A[LOOP:3: B:51:0x00b2->B:55:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4 A[EDGE_INSN: B:73:0x00e4->B:65:0x00e4 BREAK  A[LOOP:1: B:32:0x006b->B:64:0x00e0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ba A[EDGE_INSN: B:81:0x00ba->B:54:0x00ba BREAK  A[LOOP:3: B:51:0x00b2->B:55:0x00bc], SYNTHETIC] */
    @Override // defpackage.p480
    public final p480.a d(long j) {
        long j2;
        long j3;
        long j4;
        int i;
        long jMin;
        a[] aVarArr;
        int i2;
        ojg0 ojg0Var;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int iE;
        int iA;
        int iE2;
        int iA2;
        a[] aVarArr2 = this.A;
        int length = aVarArr2.length;
        r480 r480Var = r480.c;
        if (length == 0) {
            return new p480.a(r480Var, r480Var);
        }
        int i3 = this.C;
        boolean z = false;
        int i4 = -1;
        long jMin2 = -1;
        if (i3 != -1) {
            ojg0 ojg0Var2 = aVarArr2[i3].b;
            long[] jArr3 = ojg0Var2.f;
            int iE3 = jrh0.e(jArr3, j, false);
            while (true) {
                if (iE3 < 0) {
                    iE3 = -1;
                    break;
                }
                if ((ojg0Var2.g[iE3] & 1) != 0) {
                    break;
                }
                iE3--;
            }
            if (iE3 == -1) {
                iE3 = ojg0Var2.a(j);
            }
            long[] jArr4 = ojg0Var2.c;
            if (iE3 == -1) {
                return new p480.a(r480Var, r480Var);
            }
            j3 = jArr3[iE3];
            j2 = jArr4[iE3];
            if (j3 < j && iE3 < ojg0Var2.b - 1 && (iA2 = ojg0Var2.a(j)) != -1 && iA2 != iE3) {
                j4 = jArr3[iA2];
                jMin2 = jArr4[iA2];
            }
            i = 0;
            jMin = j2;
            while (true) {
                aVarArr = this.A;
                if (i < aVarArr.length) {
                    break;
                }
                if (i != this.C) {
                    ojg0Var = aVarArr[i].b;
                    jArr = ojg0Var.c;
                    iArr = ojg0Var.g;
                    jArr2 = ojg0Var.f;
                    iE = jrh0.e(jArr2, j3, z);
                    while (true) {
                        if (iE >= 0) {
                            iA = i4;
                            break;
                        }
                        if ((iArr[iE] & 1) != 0) {
                            iA = iE;
                            break;
                        }
                        iE--;
                    }
                    if (iA == i4) {
                        iA = ojg0Var.a(j3);
                    }
                    if (iA == i4) {
                        jMin = Math.min(jArr[iA], jMin);
                    }
                    if (j4 != -9223372036854775807L) {
                        z = false;
                        iE2 = jrh0.e(jArr2, j4, false);
                        while (true) {
                            if (iE2 >= 0) {
                                iE2 = -1;
                                break;
                            }
                            if ((iArr[iE2] & 1) != 0) {
                                break;
                            }
                            iE2--;
                        }
                        i2 = -1;
                        if (iE2 == -1) {
                            iE2 = ojg0Var.a(j4);
                        }
                        if (iE2 == -1) {
                            jMin2 = jMin2;
                        } else {
                            jMin2 = Math.min(jArr[iE2], jMin2);
                        }
                    } else {
                        jMin2 = jMin2;
                        z = false;
                        i2 = -1;
                    }
                } else {
                    i2 = i4;
                }
                i++;
                i4 = i2;
            }
            r480 r480Var2 = new r480(j3, jMin);
            return j4 == -9223372036854775807L ? new p480.a(r480Var2, r480Var2) : new p480.a(r480Var2, new r480(j4, jMin2));
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        j4 = -9223372036854775807L;
        i = 0;
        jMin = j2;
        while (true) {
            aVarArr = this.A;
            if (i < aVarArr.length) {
                break;
                break;
            }
            if (i != this.C) {
                ojg0Var = aVarArr[i].b;
                jArr = ojg0Var.c;
                iArr = ojg0Var.g;
                jArr2 = ojg0Var.f;
                iE = jrh0.e(jArr2, j3, z);
                while (true) {
                    if (iE >= 0) {
                        iA = i4;
                        break;
                    }
                    if ((iArr[iE] & 1) != 0) {
                        iA = iE;
                        break;
                    }
                    iE--;
                }
                if (iA == i4) {
                    iA = ojg0Var.a(j3);
                }
                if (iA == i4) {
                    jMin = Math.min(jArr[iA], jMin);
                }
                if (j4 != -9223372036854775807L) {
                    z = false;
                    iE2 = jrh0.e(jArr2, j4, false);
                    while (true) {
                        if (iE2 >= 0) {
                            iE2 = -1;
                            break;
                        }
                        if ((iArr[iE2] & 1) != 0) {
                            break;
                            break;
                        }
                        iE2--;
                    }
                    i2 = -1;
                    if (iE2 == -1) {
                        iE2 = ojg0Var.a(j4);
                    }
                    if (iE2 == -1) {
                        jMin2 = jMin2;
                    } else {
                        jMin2 = Math.min(jArr[iE2], jMin2);
                    }
                } else {
                    jMin2 = jMin2;
                    z = false;
                    i2 = -1;
                }
            } else {
                i2 = i4;
            }
            i++;
            i4 = i2;
        }
        r480 r480Var3 = new r480(j3, jMin);
        if (j4 == -9223372036854775807L) {
        }
    }

    @Override // defpackage.p480
    public final boolean g() {
        return true;
    }

    @Override // defpackage.k4h
    public final List i() {
        return this.j;
    }

    @Override // defpackage.p480
    public final long k() {
        return this.D;
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        if ((this.b & 16) == 0) {
            m4hVar = new see0(m4hVar, this.a);
        }
        this.z = m4hVar;
    }

    @Override // defpackage.k4h
    public final void release() {
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0002 A[SYNTHETIC] */
    public final void m(long j) {
        uov uovVarF;
        ArrayDeque<c8w.a> arrayDeque;
        uov uovVarK;
        int i;
        String str;
        uov uovVar;
        ArrayList arrayList;
        uov uovVar2;
        int i2;
        odv odvVarA;
        int i3;
        while (true) {
            ArrayDeque<c8w.a> arrayDeque2 = this.g;
            if (arrayDeque2.isEmpty() || arrayDeque2.peek().b != j) {
                break;
            }
            c8w.a aVarPop = arrayDeque2.pop();
            if (aVarPop.a == 1836019574) {
                c8w.a aVarB = aVarPop.b(1835365473);
                ArrayList arrayList2 = new ArrayList();
                int i4 = this.b;
                if (aVarB != null) {
                    uovVarF = l75.f(aVarB);
                    if (this.x) {
                        ly0.g(uovVarF);
                        odv odvVarA2 = epv.a(uovVarF, "auxiliary.tracks.interleaved");
                        if (odvVarA2 != null && odvVarA2.b[0] == 0) {
                            this.y = this.w + 16;
                        }
                        odv odvVarA3 = epv.a(uovVarF, "auxiliary.tracks.map");
                        ly0.g(odvVarA3);
                        ArrayList arrayListD = odvVarA3.d();
                        ArrayList arrayList3 = new ArrayList(arrayListD.size());
                        int iA = 0;
                        while (iA < arrayListD.size()) {
                            int iIntValue = ((Integer) arrayListD.get(iA)).intValue();
                            if (iIntValue == 0) {
                                i3 = 1;
                            } else if (iIntValue != 1) {
                                i3 = 3;
                                if (iIntValue != 2) {
                                    i3 = iIntValue != 3 ? 0 : 4;
                                }
                            } else {
                                i3 = 2;
                            }
                            iA = ndv.a(i3, iA, 1, arrayList3);
                        }
                        arrayList2 = arrayList3;
                    } else {
                        if (uovVarF != null && (i4 & 64) != 0 && (odvVarA = epv.a(uovVarF, "auxiliary.tracks.offset")) != null) {
                            long jB = new nsz(odvVarA.b).B();
                            if (jB > 0) {
                                this.w = jB;
                                this.v = true;
                                arrayDeque = arrayDeque2;
                            }
                        }
                        arrayDeque.clear();
                        if (!this.v) {
                            this.k = 2;
                        }
                    }
                } else {
                    uovVarF = null;
                }
                ArrayList arrayList4 = new ArrayList();
                boolean z = this.E == 1;
                ArrayList arrayList5 = arrayList2;
                hyj hyjVar = new hyj();
                c8w.b bVarC = aVarPop.c(1969517665);
                if (bVarC != null) {
                    uovVarK = l75.k(bVarC);
                    hyjVar.b(uovVarK);
                } else {
                    uovVarK = null;
                }
                c8w.b bVarC2 = aVarPop.c(1836476516);
                bVarC2.getClass();
                uov uovVar3 = uovVarK;
                uov uovVar4 = new uov(l75.g(bVarC2.b));
                ArrayList arrayListJ = l75.j(aVarPop, hyjVar, -9223372036854775807L, null, (i4 & 1) != 0, z, new d8w());
                if (this.x) {
                    boolean z2 = arrayList5.size() == arrayListJ.size();
                    Locale locale = Locale.US;
                    ly0.e(n36.a(gvQvkPPtA.ogIaUAgdjocnv, arrayList5.size(), arrayListJ.size(), ") is not same as the number of auxiliary tracks (", ")"), z2);
                }
                String strA = ws8.a(arrayListJ);
                ArrayList arrayList6 = arrayList5;
                int size = -1;
                int i5 = 0;
                int i6 = 0;
                long jMax = -9223372036854775807L;
                while (i5 < arrayListJ.size()) {
                    ojg0 ojg0Var = (ojg0) arrayListJ.get(i5);
                    if (ojg0Var.b == 0) {
                        str = strA;
                        i = i6;
                        uovVar2 = uovVar4;
                        uovVar = uovVarF;
                    } else {
                        fjg0 fjg0Var = ojg0Var.a;
                        m4h m4hVar = this.z;
                        i = i6 + 1;
                        int i7 = fjg0Var.b;
                        str = strA;
                        androidx.media3.common.a aVar = fjg0Var.g;
                        njg0 njg0VarR = m4hVar.r(i6, i7);
                        a aVar2 = new a(fjg0Var, ojg0Var, njg0VarR);
                        uovVar = uovVarF;
                        long j2 = fjg0Var.e;
                        if (j2 == -9223372036854775807L) {
                            j2 = ojg0Var.h;
                        }
                        njg0VarR.getClass();
                        jMax = Math.max(jMax, j2);
                        boolean zEquals = "audio/true-hd".equals(aVar.n);
                        int i8 = ojg0Var.e;
                        int i9 = zEquals ? i8 * 16 : i8 + 30;
                        androidx.media3.common.a.C0062a c0062aA = aVar.a();
                        c0062aA.n = i9;
                        if (i7 == 2) {
                            int i10 = aVar.f;
                            if ((i4 & 8) != 0) {
                                i10 |= size == -1 ? 1 : 2;
                            }
                            if (this.x) {
                                i10 |= 32768;
                                arrayList = arrayList6;
                                c0062aA.g = ((Integer) arrayList.get(i5)).intValue();
                            } else {
                                arrayList = arrayList6;
                            }
                            c0062aA.f = i10;
                        } else {
                            arrayList = arrayList6;
                        }
                        if (i7 != 1 || (i2 = hyjVar.a) == -1) {
                            arrayList6 = arrayList;
                        } else {
                            arrayList6 = arrayList;
                            int i11 = hyjVar.b;
                            if (i11 != -1) {
                                c0062aA.H = i2;
                                c0062aA.I = i11;
                            }
                        }
                        uov uovVar5 = aVar.l;
                        ArrayList arrayList7 = this.i;
                        uov uovVar6 = arrayList7.isEmpty() ? null : new uov(arrayList7);
                        uovVar2 = uovVar4;
                        epv.g(i7, uovVar, c0062aA, uovVar5, uovVar6, uovVar3, uovVar2);
                        c0062aA.l = gqv.m(str);
                        p0j0.a(c0062aA, njg0VarR);
                        if (i7 == 2 && size == -1) {
                            size = arrayList4.size();
                        }
                        arrayList4.add(aVar2);
                    }
                    i5++;
                    uovVar4 = uovVar2;
                    uovVarF = uovVar;
                    arrayDeque2 = arrayDeque2;
                    i6 = i;
                    arrayListJ = arrayListJ;
                    strA = str;
                }
                arrayDeque = arrayDeque2;
                this.C = size;
                this.D = jMax;
                a[] aVarArr = (a[]) arrayList4.toArray(new a[0]);
                this.A = aVarArr;
                long[][] jArr = new long[aVarArr.length][];
                int[] iArr = new int[aVarArr.length];
                long[] jArr2 = new long[aVarArr.length];
                boolean[] zArr = new boolean[aVarArr.length];
                for (int i12 = 0; i12 < aVarArr.length; i12++) {
                    jArr[i12] = new long[aVarArr[i12].b.b];
                    jArr2[i12] = aVarArr[i12].b.f[0];
                }
                int i13 = 0;
                long j3 = 0;
                while (i13 < aVarArr.length) {
                    long j4 = Long.MAX_VALUE;
                    int i14 = -1;
                    for (int i15 = 0; i15 < aVarArr.length; i15++) {
                        if (!zArr[i15]) {
                            long j5 = jArr2[i15];
                            if (j5 <= j4) {
                                i14 = i15;
                                j4 = j5;
                            }
                        }
                    }
                    int i16 = iArr[i14];
                    long[] jArr3 = jArr[i14];
                    jArr3[i16] = j3;
                    ojg0 ojg0Var2 = aVarArr[i14].b;
                    j3 += (long) ojg0Var2.d[i16];
                    int i17 = i16 + 1;
                    iArr[i14] = i17;
                    if (i17 < jArr3.length) {
                        jArr2[i14] = ojg0Var2.f[i17];
                    } else {
                        zArr[i14] = true;
                        i13++;
                    }
                }
                this.B = jArr;
                this.z.n();
                this.z.k(this);
                arrayDeque.clear();
                if (!this.v) {
                    this.k = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                arrayDeque2.peek().d.add(aVarPop);
            }
        }
        if (this.k != 2) {
            this.k = 0;
            this.n = 0;
        }
    }
}
