package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.text.NumberFormat;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class kpj {
    public static final void a(final int i, final long j, mxs mxsVar, final pr50 pr50Var, a aVar, final d dVar) {
        int i2;
        final mxs mxsVar2;
        b bVarI = aVar.i(840788098);
        if ((i & 6) == 0) {
            i2 = (bVarI.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(mxsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(pr50Var) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d(com.sportygames.newcms.c.c(lu00.b2.w0, new String[0], bVarI), 0, null, null, i7f.b(c4o.a(Float.valueOf(((int) (4294967295L & j)) * 0.04f), bVarI), bVarI), mxsVar, t9i.e, r58.d(4293703175L), j58.b, null, bVarI, ((i2 << 9) & 458752) | 114819072, 526);
            mxsVar2 = mxsVar;
            bVarI = bVarI;
            yu00.a(h.j(j.g(d.a.b, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), r58.d(4294960720L), r58.d(4293109253L), false, pp8.b(-1597199332, new Function2() { // from class: hpj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        StringBuilder sb = new StringBuilder("+ ");
                        pr50 pr50Var2 = pr50Var;
                        sb.append(pr50Var2.b);
                        sb.append(' ');
                        NumberFormat numberFormat = d6f.a;
                        sb.append(d6f.a(pr50Var2.a));
                        lkf0.b(sb.toString(), h.h(j.g(d.a.b, 1.0f), 0.0f, 4.0f, 1), 0L, i7f.b(c4o.a(Float.valueOf(((int) (j & 4294967295L)) * 0.05f), aVar3), aVar3), null, null, mxsVar2, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, new imf0(new hfs(kotlin.collections.b.k(new j58(r58.d(4294688027L)), new j58(r58.d(4294956912L)), new j58(r58.d(4294688027L))), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), 0L, null, null, null, null, 0L, 33554430), aVar3, 48, 1572864, 64948);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 25014, 8);
            bVarI.X(true);
        } else {
            mxsVar2 = mxsVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ipj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kpj.a(qj40.a(i | 1), j, mxsVar2, pr50Var, (a) obj, dVar);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final long j, final d dVar, final dpj dpjVar, a aVar, final int i) {
        int i2;
        Object obj;
        boolean z;
        dVar.getClass();
        dpjVar.getClass();
        b bVarI = aVar.i(83048209);
        if ((i & 6) == 0) {
            i2 = (bVarI.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(dpjVar) : bVarI.A(dpjVar) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            lu00 lu00Var = lu00.b2;
            mxs mxsVarA = d1a.a(d9i.a(lu00Var.h, bVarI));
            if (dpjVar instanceof dpj.c) {
                bVarI.N(-1795041369);
                c(j, dVar, mxsVarA, (dpj.c) dpjVar, bVarI, (i2 & WebSocketProtocol.PAYLOAD_SHORT) | ((i2 << 3) & 7168));
                bVarI.X(false);
            } else if (dpjVar instanceof dpj.b) {
                bVarI.N(188526182);
                d(com.sportygames.newcms.c.c(lu00Var.v0, new String[0], bVarI), 0, dVar, j.g(d.a.b, 0.7f), i7f.b(c4o.a(Float.valueOf(((int) (j & 4294967295L)) * 0.03f), bVarI), bVarI), mxsVarA, t9i.e, r58.d(4293703175L), j58.b, null, bVarI, ((i2 << 3) & 896) | 114822144, 514);
                bVarI.X(false);
            } else if (dpjVar instanceof dpj.a) {
                bVarI.N(189036535);
                ArrayList arrayList = ((dpj.a) dpjVar).a;
                int size = arrayList.size();
                int i3 = 0;
                do {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    } else {
                        obj = arrayList.get(i3);
                        i3++;
                    }
                } while (!((pr50) obj).c);
                pr50 pr50Var = (pr50) obj;
                if (pr50Var == null) {
                    bVarI.N(189036534);
                    bVarI.X(false);
                    z = false;
                } else {
                    bVarI.N(189036535);
                    z = false;
                    a(i2 & WebSocketProtocol.PAYLOAD_SHORT, j, mxsVarA, pr50Var, bVarI, dVar);
                    bVarI.X(false);
                    Unit unit = Unit.a;
                }
                bVarI.X(z);
            } else {
                bVarI.N(-1795010027);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: epj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    kpj.b(j, dVar, dpjVar, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final long j, final d dVar, final mxs mxsVar, final dpj.c cVar, a aVar, final int i) {
        int i2;
        pr50 pr50Var = cVar.a;
        b bVarI = aVar.i(-1567629373);
        if ((i & 6) == 0) {
            i2 = (bVarI.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(mxsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(cVar) ? 2048 : 1024;
        }
        if (!bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            bVarI.G();
        } else if (pr50Var.c) {
            bVarI.N(-2067000484);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d(com.sportygames.newcms.c.c(lu00.b2.u0, new String[0], bVarI), 0, null, null, i7f.b(c4o.a(Float.valueOf(((int) (j & 4294967295L)) * 0.04f), bVarI), bVarI), mxsVar, t9i.e, r58.d(4293703175L), j58.b, null, bVarI, ((i2 << 9) & 458752) | 114819072, 526);
            bVarI = bVarI;
            yu00.a(h.j(j.g(d.a.b, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), r58.d(4294960720L), r58.d(4293109253L), false, pp8.b(1544653368, new Function2() { // from class: fpj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    pr50 pr50Var2 = cVar.a;
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        StringBuilder sb = new StringBuilder("+ ");
                        sb.append(pr50Var2.b);
                        sb.append(' ');
                        NumberFormat numberFormat = d6f.a;
                        sb.append(d6f.a(pr50Var2.a));
                        lkf0.b(sb.toString(), h.h(j.g(d.a.b, 1.0f), 0.0f, 4.0f, 1), 0L, i7f.b(c4o.a(Float.valueOf(((int) (j & 4294967295L)) * 0.05f), aVar3), aVar3), null, null, mxsVar, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, new imf0(new hfs(kotlin.collections.b.k(new j58(r58.d(4294956912L)), new j58(r58.d(4294688027L)), new j58(r58.d(4294956912L))), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), 0L, null, null, null, null, 0L, 33554430), aVar3, 48, 1572864, 64948);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 25014, 8);
            bVarI.X(true);
            bVarI.X(false);
        } else {
            bVarI.N(-2065339380);
            int i3 = i2;
            lkf0.b(pr50Var.f + ' ' + com.sportygames.newcms.c.c(lu00.b2.t0, new String[0], bVarI), dVar, r58.d(4294963712L), i7f.b(c4o.a(Float.valueOf(((int) (j & 4294967295L)) * 0.03f), bVarI), bVarI), null, t9i.e, mxsVar, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, bVarI, (i3 & 112) | 196992 | ((i3 << 12) & 3670016), 0, 130448);
            bVarI = bVarI;
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gpj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kpj.c(j, dVar, mxsVar, cVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017d  */
    /* JADX WARN: Code duplicated, block: B:103:0x018b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0236  */
    /* JADX WARN: Code duplicated, block: B:108:0x0246  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0166  */
    /* JADX WARN: Code duplicated, block: B:98:0x016a  */
    public static final void d(final String str, int i, d dVar, d dVar2, final long j, final mxs mxsVar, final t9i t9iVar, final long j2, final long j3, imf0 imf0Var, a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        d dVar3;
        int i6;
        mxs mxsVar2;
        t9i t9iVar2;
        long j4;
        long j5;
        int i7;
        boolean z;
        final int i8;
        final d dVar4;
        final imf0 imf0Var2;
        final d dVar5;
        e eVarZ;
        d dVar6;
        d dVar7;
        imf0 imf0Var3;
        int i9;
        int i10;
        d dVar8;
        d dVar9;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        b bVarI = aVar.i(1988949824);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.M(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        int i16 = i3 & 4;
        if (i16 == 0) {
            if ((i2 & 384) == 0) {
                i4 |= bVarI.M(dVar) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    dVar3 = dVar2;
                    if (bVarI.M(dVar3)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((i2 & 24576) != 0) {
                    if (bVarI.e(j)) {
                        i15 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i15 = 8192;
                    }
                    i4 |= i15;
                }
                if ((196608 & i2) == 0) {
                    mxsVar2 = mxsVar;
                    if (bVarI.M(mxsVar2)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i4 |= i14;
                } else {
                    mxsVar2 = mxsVar;
                }
                if ((1572864 & i2) == 0) {
                    t9iVar2 = t9iVar;
                    if (bVarI.M(t9iVar2)) {
                        i13 = 1048576;
                    } else {
                        i13 = 524288;
                    }
                    i4 |= i13;
                } else {
                    t9iVar2 = t9iVar;
                }
                if ((12582912 & i2) == 0) {
                    j4 = j2;
                    if (bVarI.e(j4)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                } else {
                    j4 = j2;
                }
                if ((100663296 & i2) == 0) {
                    j5 = j3;
                    if (bVarI.e(j5)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i4 |= i11;
                } else {
                    j5 = j3;
                }
                i7 = i4 | 805306368;
                if ((i7 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i7 & 1, z)) {
                    bVarI.A0();
                    if ((i2 & 1) != 0 || bVarI.h0()) {
                        int i17 = i7 & (-113);
                        dVar6 = d.a.b;
                        if (i16 != 0) {
                            dVar7 = dVar6;
                        } else {
                            dVar7 = dVar;
                        }
                        if (i5 == 0) {
                            dVar6 = dVar3;
                        }
                        imf0Var3 = new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, null, null, 16777215);
                        i9 = 3;
                        d dVar10 = dVar6;
                        i10 = i17;
                        dVar8 = dVar7;
                        dVar9 = dVar10;
                    } else {
                        bVarI.G();
                        i9 = i;
                        imf0Var3 = imf0Var;
                        i10 = i7 & (-113);
                        dVar9 = dVar3;
                        dVar8 = dVar;
                    }
                    bVarI.Y();
                    int i18 = i10 >> 6;
                    int i19 = i10;
                    aiv aivVarC = g75.c(ht.a.e, false);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    d dVarC = c.c(bVarI, dVar8);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    d dVar11 = dVar8;
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC, yka.a.f);
                    hlh0.a(bVarI, ne00VarS, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC, yka.a.d);
                    imf0 imf0Var4 = imf0Var3;
                    int i20 = (i19 & 14) | (i18 & 112);
                    int i21 = i19 >> 3;
                    int i22 = i21 & 7168;
                    int i23 = i21 & 458752;
                    int i24 = (i19 << 3) & 3670016;
                    t9i t9iVar3 = t9iVar2;
                    long j6 = j4;
                    lkf0.b(str, dVar9, j6, j, null, t9iVar3, mxsVar2, 0L, new gdf0(i9), 0L, 0, false, 0, 0, null, imf0.b(imf0Var3, 0L, 0L, null, null, null, 0L, null, null, new yae0(4.0f, 0.0f, 0, 0, null, 30), 0, 0L, null, null, 16760831), bVarI, ((i19 >> 15) & 896) | i20 | i22 | i23 | i24, 0, 64912);
                    lkf0.b(str, dVar9, j5, j, null, t9iVar, mxsVar, 0L, new gdf0(i9), 0L, 0, false, 0, 0, null, imf0Var4, bVarI, ((i19 >> 18) & 896) | i20 | i22 | i23 | i24, (i19 >> 9) & 3670016, 64912);
                    bVarI = bVarI;
                    bVarI.X(true);
                    dVar4 = dVar11;
                    imf0Var2 = imf0Var4;
                    i8 = i9;
                    dVar5 = dVar9;
                } else {
                    bVarI.G();
                    i8 = i;
                    dVar4 = dVar;
                    imf0Var2 = imf0Var;
                    dVar5 = dVar3;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: jpj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i2 | 1);
                            kpj.d(str, i8, dVar4, dVar5, j, mxsVar, t9iVar, j2, j3, imf0Var2, (a) obj, iA, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 3072;
            dVar3 = dVar2;
            if ((i2 & 24576) != 0) {
                if (bVarI.e(j)) {
                    i15 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i15 = 8192;
                }
                i4 |= i15;
            }
            if ((196608 & i2) == 0) {
                mxsVar2 = mxsVar;
                if (bVarI.M(mxsVar2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i4 |= i14;
            } else {
                mxsVar2 = mxsVar;
            }
            if ((1572864 & i2) == 0) {
                t9iVar2 = t9iVar;
                if (bVarI.M(t9iVar2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i4 |= i13;
            } else {
                t9iVar2 = t9iVar;
            }
            if ((12582912 & i2) == 0) {
                j4 = j2;
                if (bVarI.e(j4)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            } else {
                j4 = j2;
            }
            if ((100663296 & i2) == 0) {
                j5 = j3;
                if (bVarI.e(j5)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            } else {
                j5 = j3;
            }
            i7 = i4 | 805306368;
            if ((i7 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i7 & 1, z)) {
                bVarI.A0();
                if ((i2 & 1) != 0) {
                    int i110 = i7 & (-113);
                    dVar6 = d.a.b;
                    if (i16 != 0) {
                        dVar7 = dVar6;
                    } else {
                        dVar7 = dVar;
                    }
                    if (i5 == 0) {
                        dVar6 = dVar3;
                    }
                    imf0Var3 = new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, null, null, 16777215);
                    i9 = 3;
                    d dVar12 = dVar6;
                    i10 = i110;
                    dVar8 = dVar7;
                    dVar9 = dVar12;
                } else {
                    int i111 = i7 & (-113);
                    dVar6 = d.a.b;
                    if (i16 != 0) {
                        dVar7 = dVar6;
                    } else {
                        dVar7 = dVar;
                    }
                    if (i5 == 0) {
                        dVar6 = dVar3;
                    }
                    imf0Var3 = new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, null, null, 16777215);
                    i9 = 3;
                    d dVar13 = dVar6;
                    i10 = i111;
                    dVar8 = dVar7;
                    dVar9 = dVar13;
                }
                bVarI.Y();
                int i112 = i10 >> 6;
                int i113 = i10;
                aiv aivVarC2 = g75.c(ht.a.e, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVar8);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                d dVar14 = dVar8;
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                imf0 imf0Var5 = imf0Var3;
                int i25 = (i113 & 14) | (i112 & 112);
                int i26 = i113 >> 3;
                int i27 = i26 & 7168;
                int i28 = i26 & 458752;
                int i29 = (i113 << 3) & 3670016;
                t9i t9iVar4 = t9iVar2;
                long j7 = j4;
                lkf0.b(str, dVar9, j7, j, null, t9iVar4, mxsVar2, 0L, new gdf0(i9), 0L, 0, false, 0, 0, null, imf0.b(imf0Var3, 0L, 0L, null, null, null, 0L, null, null, new yae0(4.0f, 0.0f, 0, 0, null, 30), 0, 0L, null, null, 16760831), bVarI, ((i113 >> 15) & 896) | i25 | i27 | i28 | i29, 0, 64912);
                lkf0.b(str, dVar9, j5, j, null, t9iVar, mxsVar, 0L, new gdf0(i9), 0L, 0, false, 0, 0, null, imf0Var5, bVarI, ((i113 >> 18) & 896) | i25 | i27 | i28 | i29, (i113 >> 9) & 3670016, 64912);
                bVarI = bVarI;
                bVarI.X(true);
                dVar4 = dVar14;
                imf0Var2 = imf0Var5;
                i8 = i9;
                dVar5 = dVar9;
            } else {
                bVarI.G();
                i8 = i;
                dVar4 = dVar;
                imf0Var2 = imf0Var;
                dVar5 = dVar3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: jpj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i2 | 1);
                        kpj.d(str, i8, dVar4, dVar5, j, mxsVar, t9iVar, j2, j3, imf0Var2, (a) obj, iA, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 384;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                dVar3 = dVar2;
                if (bVarI.M(dVar3)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i2 & 24576) != 0) {
                if (bVarI.e(j)) {
                    i15 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i15 = 8192;
                }
                i4 |= i15;
            }
            if ((196608 & i2) == 0) {
                mxsVar2 = mxsVar;
                if (bVarI.M(mxsVar2)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i4 |= i14;
            } else {
                mxsVar2 = mxsVar;
            }
            if ((1572864 & i2) == 0) {
                t9iVar2 = t9iVar;
                if (bVarI.M(t9iVar2)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i4 |= i13;
            } else {
                t9iVar2 = t9iVar;
            }
            if ((12582912 & i2) == 0) {
                j4 = j2;
                if (bVarI.e(j4)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            } else {
                j4 = j2;
            }
            if ((100663296 & i2) == 0) {
                j5 = j3;
                if (bVarI.e(j5)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i4 |= i11;
            } else {
                j5 = j3;
            }
            i7 = i4 | 805306368;
            if ((i7 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i7 & 1, z)) {
                bVarI.A0();
                if ((i2 & 1) != 0) {
                    int i114 = i7 & (-113);
                    dVar6 = d.a.b;
                    if (i16 != 0) {
                        dVar7 = dVar6;
                    } else {
                        dVar7 = dVar;
                    }
                    if (i5 == 0) {
                        dVar6 = dVar3;
                    }
                    imf0Var3 = new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, null, null, 16777215);
                    i9 = 3;
                    d dVar15 = dVar6;
                    i10 = i114;
                    dVar8 = dVar7;
                    dVar9 = dVar15;
                } else {
                    int i115 = i7 & (-113);
                    dVar6 = d.a.b;
                    if (i16 != 0) {
                        dVar7 = dVar6;
                    } else {
                        dVar7 = dVar;
                    }
                    if (i5 == 0) {
                        dVar6 = dVar3;
                    }
                    imf0Var3 = new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, null, null, 16777215);
                    i9 = 3;
                    d dVar16 = dVar6;
                    i10 = i115;
                    dVar8 = dVar7;
                    dVar9 = dVar16;
                }
                bVarI.Y();
                int i116 = i10 >> 6;
                int i117 = i10;
                aiv aivVarC3 = g75.c(ht.a.e, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVar8);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                d dVar17 = dVar8;
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC3, yka.a.f);
                hlh0.a(bVarI, ne00VarS3, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC3, yka.a.d);
                imf0 imf0Var6 = imf0Var3;
                int i210 = (i117 & 14) | (i116 & 112);
                int i211 = i117 >> 3;
                int i212 = i211 & 7168;
                int i213 = i211 & 458752;
                int i214 = (i117 << 3) & 3670016;
                t9i t9iVar5 = t9iVar2;
                long j8 = j4;
                lkf0.b(str, dVar9, j8, j, null, t9iVar5, mxsVar2, 0L, new gdf0(i9), 0L, 0, false, 0, 0, null, imf0.b(imf0Var3, 0L, 0L, null, null, null, 0L, null, null, new yae0(4.0f, 0.0f, 0, 0, null, 30), 0, 0L, null, null, 16760831), bVarI, ((i117 >> 15) & 896) | i210 | i212 | i213 | i214, 0, 64912);
                lkf0.b(str, dVar9, j5, j, null, t9iVar, mxsVar, 0L, new gdf0(i9), 0L, 0, false, 0, 0, null, imf0Var6, bVarI, ((i117 >> 18) & 896) | i210 | i212 | i213 | i214, (i117 >> 9) & 3670016, 64912);
                bVarI = bVarI;
                bVarI.X(true);
                dVar4 = dVar17;
                imf0Var2 = imf0Var6;
                i8 = i9;
                dVar5 = dVar9;
            } else {
                bVarI.G();
                i8 = i;
                dVar4 = dVar;
                imf0Var2 = imf0Var;
                dVar5 = dVar3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: jpj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i2 | 1);
                        kpj.d(str, i8, dVar4, dVar5, j, mxsVar, t9iVar, j2, j3, imf0Var2, (a) obj, iA, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 3072;
        dVar3 = dVar2;
        if ((i2 & 24576) != 0) {
            if (bVarI.e(j)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = 8192;
            }
            i4 |= i15;
        }
        if ((196608 & i2) == 0) {
            mxsVar2 = mxsVar;
            if (bVarI.M(mxsVar2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i4 |= i14;
        } else {
            mxsVar2 = mxsVar;
        }
        if ((1572864 & i2) == 0) {
            t9iVar2 = t9iVar;
            if (bVarI.M(t9iVar2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i4 |= i13;
        } else {
            t9iVar2 = t9iVar;
        }
        if ((12582912 & i2) == 0) {
            j4 = j2;
            if (bVarI.e(j4)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        } else {
            j4 = j2;
        }
        if ((100663296 & i2) == 0) {
            j5 = j3;
            if (bVarI.e(j5)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i4 |= i11;
        } else {
            j5 = j3;
        }
        i7 = i4 | 805306368;
        if ((i7 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i7 & 1, z)) {
            bVarI.A0();
            if ((i2 & 1) != 0) {
                int i118 = i7 & (-113);
                dVar6 = d.a.b;
                if (i16 != 0) {
                    dVar7 = dVar6;
                } else {
                    dVar7 = dVar;
                }
                if (i5 == 0) {
                    dVar6 = dVar3;
                }
                imf0Var3 = new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, null, null, 16777215);
                i9 = 3;
                d dVar18 = dVar6;
                i10 = i118;
                dVar8 = dVar7;
                dVar9 = dVar18;
            } else {
                int i119 = i7 & (-113);
                dVar6 = d.a.b;
                if (i16 != 0) {
                    dVar7 = dVar6;
                } else {
                    dVar7 = dVar;
                }
                if (i5 == 0) {
                    dVar6 = dVar3;
                }
                imf0Var3 = new imf0(0L, 0L, null, null, null, 0L, null, null, 0, 0L, null, null, 16777215);
                i9 = 3;
                d dVar19 = dVar6;
                i10 = i119;
                dVar8 = dVar7;
                dVar9 = dVar19;
            }
            bVarI.Y();
            int i1110 = i10 >> 6;
            int i1111 = i10;
            aiv aivVarC4 = g75.c(ht.a.e, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVar8);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            d dVar110 = dVar8;
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC4, yka.a.f);
            hlh0.a(bVarI, ne00VarS4, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, yka.a.d);
            imf0 imf0Var7 = imf0Var3;
            int i215 = (i1111 & 14) | (i1110 & 112);
            int i216 = i1111 >> 3;
            int i217 = i216 & 7168;
            int i218 = i216 & 458752;
            int i219 = (i1111 << 3) & 3670016;
            t9i t9iVar6 = t9iVar2;
            long j9 = j4;
            lkf0.b(str, dVar9, j9, j, null, t9iVar6, mxsVar2, 0L, new gdf0(i9), 0L, 0, false, 0, 0, null, imf0.b(imf0Var3, 0L, 0L, null, null, null, 0L, null, null, new yae0(4.0f, 0.0f, 0, 0, null, 30), 0, 0L, null, null, 16760831), bVarI, ((i1111 >> 15) & 896) | i215 | i217 | i218 | i219, 0, 64912);
            lkf0.b(str, dVar9, j5, j, null, t9iVar, mxsVar, 0L, new gdf0(i9), 0L, 0, false, 0, 0, null, imf0Var7, bVarI, ((i1111 >> 18) & 896) | i215 | i217 | i218 | i219, (i1111 >> 9) & 3670016, 64912);
            bVarI = bVarI;
            bVarI.X(true);
            dVar4 = dVar110;
            imf0Var2 = imf0Var7;
            i8 = i9;
            dVar5 = dVar9;
        } else {
            bVarI.G();
            i8 = i;
            dVar4 = dVar;
            imf0Var2 = imf0Var;
            dVar5 = dVar3;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jpj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    kpj.d(str, i8, dVar4, dVar5, j, mxsVar, t9iVar, j2, j3, imf0Var2, (a) obj, iA, i3);
                    return Unit.a;
                }
            };
        }
    }
}
