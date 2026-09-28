package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class r0g0 {
    public static final umz a = new umz(8.0f, 4.0f, 8.0f, 4.0f);

    /* JADX WARN: Code duplicated, block: B:100:0x0138  */
    /* JADX WARN: Code duplicated, block: B:109:0x0174  */
    /* JADX WARN: Code duplicated, block: B:115:0x0180  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:136:0x0224  */
    /* JADX WARN: Code duplicated, block: B:139:0x0237  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    public static final void a(final x0g0 x0g0Var, d dVar, qx80 qx80Var, float f, qx80 qx80Var2, long j, long j2, final op8 op8Var, a aVar, final int i, final int i2) {
        int i3;
        qx80 qx80Var3;
        int i4;
        qx80 qx80Var4;
        long jD;
        long jD2;
        int i5;
        boolean z;
        b bVar;
        final float f2;
        final qx80 qx80Var5;
        final qx80 qx80Var6;
        final long j3;
        final d dVar2;
        final long j4;
        e eVarZ;
        int i6;
        d.a aVar2;
        float f3;
        qx80 qx80VarB;
        int i7;
        qx80 qx80Var7;
        d dVarN;
        qx80 qx80Var8;
        Object objY;
        a.C0041a.C0042a c0042a;
        final ytw ytwVar;
        boolean z2;
        Object objY2;
        boolean z3;
        boolean z4;
        Object objY3;
        int i8;
        int i9;
        int i10;
        b bVarI = aVar.i(-343758958);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bVarI.M(x0g0Var) : bVarI.A(x0g0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i3 | 48;
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                qx80Var3 = qx80Var;
                i11 |= bVarI.M(qx80Var3) ? 256 : 128;
            }
            i4 = i11 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 8) == 0) {
                    qx80Var4 = qx80Var2;
                    int i13 = bVarI.M(qx80Var4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                    i4 |= i13;
                } else {
                    qx80Var4 = qx80Var2;
                }
                i4 |= i13;
            } else {
                qx80Var4 = qx80Var2;
            }
            if ((196608 & i) == 0) {
                jD = j;
                if ((i2 & 16) == 0 || !bVarI.e(jD)) {
                    i10 = 65536;
                } else {
                    i10 = 131072;
                }
                i4 |= i10;
            } else {
                jD = j;
            }
            if ((1572864 & i) == 0) {
                jD2 = j2;
                if ((i2 & 32) == 0 || !bVarI.e(jD2)) {
                    i9 = 524288;
                } else {
                    i9 = 1048576;
                }
                i4 |= i9;
            } else {
                jD2 = j2;
            }
            i5 = i4 | 113246208;
            if ((805306368 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i5 |= i8;
            }
            if ((306783379 & i5) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i5 & 1, z)) {
                bVarI.A0();
                i6 = i & 1;
                aVar2 = d.a.b;
                if (i6 != 0 || bVarI.h0()) {
                    if (i12 != 0) {
                        qx80Var3 = null;
                    }
                    f3 = i0g0.a;
                    if ((i2 & 8) != 0) {
                        qx80VarB = xy80.b(pi10.b, bVarI);
                        i5 &= -57345;
                    } else {
                        qx80VarB = qx80Var4;
                    }
                    if ((i2 & 16) != 0) {
                        jD = g68.d(pi10.c, bVarI);
                        i5 &= -458753;
                    }
                    if ((i2 & 32) != 0) {
                        jD2 = g68.d(pi10.a, bVarI);
                        i5 &= -3670017;
                    }
                    qx80Var4 = qx80VarB;
                    i7 = i5;
                    qx80Var7 = qx80Var3;
                    dVar2 = aVar2;
                } else {
                    bVarI.G();
                    if ((i2 & 8) != 0) {
                        i5 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -458753;
                    }
                    if ((i2 & 32) != 0) {
                        i5 &= -3670017;
                    }
                    f3 = f;
                    i7 = i5;
                    qx80Var7 = qx80Var3;
                    dVar2 = dVar;
                }
                bVarI.Y();
                if (qx80Var7 != null) {
                    bVarI.N(-1720477287);
                    objY = bVarI.y();
                    c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = m.b(new ddv(ddv.a()));
                        bVarI.r(objY);
                    }
                    ytwVar = (ytw) objY;
                    final mmd mmdVar = (mmd) bVarI.O(kna.h);
                    final long jA = ((a8j0) bVarI.O(kna.t)).a();
                    if ((i7 & 14) != 4 || ((i7 & 8) != 0 && bVarI.A(x0g0Var))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY2 = bVarI.y();
                    if (z2 || objY2 == c0042a) {
                        objY2 = new kkq(x0g0Var, 1);
                        bVarI.r(objY2);
                    }
                    final Function1 function1 = (Function1) objY2;
                    final w420 w420VarA = x0g0Var.a();
                    dVarN = j.a(aVar2, new gaj() { // from class: m0g0
                        /* JADX WARN: Code duplicated, block: B:22:0x007a A[PHI: r19
                          0x007a: PHI (r19v2 float) = (r19v0 float), (r19v3 float), (r19v3 float), (r19v3 float) binds: [B:32:0x0099, B:29:0x008f, B:26:0x0087, B:21:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code restructure failed: missing block: B:59:0x0102, code lost:
                        
                            r5 = r6;
                         */
                        @Override // defpackage.gaj
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25) {
                            /*
                                Method dump skipped, instruction units count: 548
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.m0g0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }).n(dVar2);
                    boolean z5 = (((i7 & 57344) ^ 24576) <= 16384 && bVarI.M(qx80Var4)) || (i7 & 24576) == 16384;
                    if ((i7 & 896) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z5 | z3;
                    objY3 = bVarI.y();
                    if (z4 || objY3 == c0042a) {
                        objY3 = new d0g0(ytwVar, qx80Var4, qx80Var7);
                        bVarI.r(objY3);
                    }
                    qx80Var8 = (d0g0) objY3;
                    bVarI.X(false);
                } else {
                    bVarI.N(-1719831991);
                    bVarI.X(false);
                    dVarN = dVar2;
                    qx80Var8 = qx80Var4;
                }
                int i14 = i7 >> 9;
                bVar = bVarI;
                ihe0.a(dVarN, qx80Var8, jD2, 0L, 0.0f, 0.0f, null, pp8.b(-1573998995, new n0g0(f3, jD, op8Var), bVarI), bVar, ((i7 >> 12) & 896) | 12582912 | (i14 & 57344) | (i14 & 458752), 72);
                qx80Var5 = qx80Var7;
                f2 = f3;
                qx80Var6 = qx80Var4;
                j3 = jD;
            } else {
                bVar = bVarI;
                bVar.G();
                f2 = f;
                qx80Var5 = qx80Var3;
                qx80Var6 = qx80Var4;
                j3 = jD;
                dVar2 = dVar;
            }
            j4 = jD2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: l0g0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        r0g0.a(x0g0Var, dVar2, qx80Var5, f2, qx80Var6, j3, j4, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i11 = i3 | 432;
        qx80Var3 = qx80Var;
        i4 = i11 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 8) == 0) {
                qx80Var4 = qx80Var2;
                if (bVarI.M(qx80Var4)) {
                }
                i4 |= i13;
            } else {
                qx80Var4 = qx80Var2;
            }
            i4 |= i13;
        } else {
            qx80Var4 = qx80Var2;
        }
        if ((196608 & i) == 0) {
            jD = j;
            if ((i2 & 16) == 0) {
                i10 = 65536;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        } else {
            jD = j;
        }
        if ((1572864 & i) == 0) {
            jD2 = j2;
            if ((i2 & 32) == 0) {
                i9 = 524288;
            } else {
                i9 = 524288;
            }
            i4 |= i9;
        } else {
            jD2 = j2;
        }
        i5 = i4 | 113246208;
        if ((805306368 & i) == 0) {
            if (bVarI.A(op8Var)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i5 |= i8;
        }
        if ((306783379 & i5) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i5 & 1, z)) {
            bVarI.A0();
            i6 = i & 1;
            aVar2 = d.a.b;
            if (i6 != 0) {
                if (i12 != 0) {
                    qx80Var3 = null;
                }
                f3 = i0g0.a;
                if ((i2 & 8) != 0) {
                    qx80VarB = xy80.b(pi10.b, bVarI);
                    i5 &= -57345;
                } else {
                    qx80VarB = qx80Var4;
                }
                if ((i2 & 16) != 0) {
                    jD = g68.d(pi10.c, bVarI);
                    i5 &= -458753;
                }
                if ((i2 & 32) != 0) {
                    jD2 = g68.d(pi10.a, bVarI);
                    i5 &= -3670017;
                }
                qx80Var4 = qx80VarB;
                i7 = i5;
                qx80Var7 = qx80Var3;
                dVar2 = aVar2;
            } else {
                if (i12 != 0) {
                    qx80Var3 = null;
                }
                f3 = i0g0.a;
                if ((i2 & 8) != 0) {
                    qx80VarB = xy80.b(pi10.b, bVarI);
                    i5 &= -57345;
                } else {
                    qx80VarB = qx80Var4;
                }
                if ((i2 & 16) != 0) {
                    jD = g68.d(pi10.c, bVarI);
                    i5 &= -458753;
                }
                if ((i2 & 32) != 0) {
                    jD2 = g68.d(pi10.a, bVarI);
                    i5 &= -3670017;
                }
                qx80Var4 = qx80VarB;
                i7 = i5;
                qx80Var7 = qx80Var3;
                dVar2 = aVar2;
            }
            bVarI.Y();
            if (qx80Var7 != null) {
                bVarI.N(-1720477287);
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(new ddv(ddv.a()));
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                final mmd mmdVar2 = (mmd) bVarI.O(kna.h);
                final long jA2 = ((a8j0) bVarI.O(kna.t)).a();
                if ((i7 & 14) != 4) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objY2 = bVarI.y();
                if (z2) {
                    objY2 = new kkq(x0g0Var, 1);
                    bVarI.r(objY2);
                } else {
                    objY2 = new kkq(x0g0Var, 1);
                    bVarI.r(objY2);
                }
                final Function1 function2 = (Function1) objY2;
                final w420 w420VarA2 = x0g0Var.a();
                dVarN = j.a(aVar2, new gaj() { // from class: m0g0
                    /* JADX WARN: Code duplicated, block: B:22:0x007a A[PHI: r19
                      0x007a: PHI (r19v2 float) = (r19v0 float), (r19v3 float), (r19v3 float), (r19v3 float) binds: [B:32:0x0099, B:29:0x008f, B:26:0x0087, B:21:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code restructure failed: missing block: B:59:0x0102, code lost:
                    
                        r5 = r6;
                     */
                    @Override // defpackage.gaj
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25) {
                        /*
                            Method dump skipped, instruction units count: 548
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0g0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }).n(dVar2);
                boolean z6 = (((i7 & 57344) ^ 24576) <= 16384 && bVarI.M(qx80Var4)) || (i7 & 24576) == 16384;
                if ((i7 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z6 | z3;
                objY3 = bVarI.y();
                if (z4) {
                    objY3 = new d0g0(ytwVar, qx80Var4, qx80Var7);
                    bVarI.r(objY3);
                } else {
                    objY3 = new d0g0(ytwVar, qx80Var4, qx80Var7);
                    bVarI.r(objY3);
                }
                qx80Var8 = (d0g0) objY3;
                bVarI.X(false);
            } else {
                bVarI.N(-1719831991);
                bVarI.X(false);
                dVarN = dVar2;
                qx80Var8 = qx80Var4;
            }
            int i15 = i7 >> 9;
            bVar = bVarI;
            ihe0.a(dVarN, qx80Var8, jD2, 0L, 0.0f, 0.0f, null, pp8.b(-1573998995, new n0g0(f3, jD, op8Var), bVarI), bVar, ((i7 >> 12) & 896) | 12582912 | (i15 & 57344) | (i15 & 458752), 72);
            qx80Var5 = qx80Var7;
            f2 = f3;
            qx80Var6 = qx80Var4;
            j3 = jD;
        } else {
            bVar = bVarI;
            bVar.G();
            f2 = f;
            qx80Var5 = qx80Var3;
            qx80Var6 = qx80Var4;
            j3 = jD;
            dVar2 = dVar;
        }
        j4 = jD2;
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: l0g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r0g0.a(x0g0Var, dVar2, qx80Var5, f2, qx80Var6, j3, j4, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0161  */
    /* JADX WARN: Code duplicated, block: B:103:0x016c  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:95:0x0104  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    public static final void b(final w420 w420Var, final op8 op8Var, final b1g0 b1g0Var, d dVar, Function0 function0, boolean z, final op8 op8Var2, a aVar, final int i, final int i2) {
        int i3;
        final d dVar2;
        int i4;
        Function0 function1;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        final Function0 function2;
        final boolean z4;
        e eVarZ;
        d dVar3;
        Function0 function3;
        Object objY;
        a.C0041a.C0042a c0042a;
        ytw ytwVar;
        Object objY2;
        int i10;
        b bVarI = aVar.i(-293753984);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(w420Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? bVarI.M(b1g0Var) : bVarI.A(b1g0Var) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 == 0) {
            if ((i & 3072) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function1 = function0;
                    if (bVarI.A(function1)) {
                        i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bVarI.b(false)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    if ((1572864 & i) == 0) {
                        z2 = z;
                        if (bVarI.b(z2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    i9 = i3 | 12582912;
                    if ((100663296 & i) == 0) {
                        if (bVarI.A(op8Var2)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i9 |= i10;
                    }
                    if ((38347923 & i9) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i9 & 1, z3)) {
                        if (i11 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        function3 = null;
                        if (i4 != 0) {
                            function3 = function1;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        dtg0 dtg0VarE = vtg0.e(b1g0Var.c, "tooltip transition", bVarI, 48, 0);
                        objY = bVarI.y();
                        c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = m.b(0);
                            bVarI.r(objY);
                        }
                        ytwVar = (ytw) objY;
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new y0g0(new ikq(ytwVar, 1), w420Var);
                            bVarI.r(objY2);
                        }
                        sc2.a(w420Var, pp8.b(-527401546, new o0g0(dtg0VarE, op8Var, (y0g0) objY2), bVarI), b1g0Var, dVar3, function3, false, z4, pp8.b(-23901870, new p0g0(ytwVar, op8Var2), bVarI), bVarI, (i9 & 29360128) | (i9 & 14) | 100663344 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9));
                        function2 = function3;
                        dVar2 = dVar3;
                    } else {
                        bVarI.G();
                        function2 = function1;
                        z4 = z2;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: k0g0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                r0g0.b(w420Var, op8Var, b1g0Var, dVar2, function2, z4, op8Var2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                z2 = z;
                i9 = i3 | 12582912;
                if ((100663296 & i) == 0) {
                    if (bVarI.A(op8Var2)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i9 |= i10;
                }
                if ((38347923 & i9) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i9 & 1, z3)) {
                    if (i11 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    function3 = null;
                    if (i4 != 0) {
                        function3 = function1;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    dtg0 dtg0VarE2 = vtg0.e(b1g0Var.c, "tooltip transition", bVarI, 48, 0);
                    objY = bVarI.y();
                    c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = m.b(0);
                        bVarI.r(objY);
                    }
                    ytwVar = (ytw) objY;
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new y0g0(new ikq(ytwVar, 1), w420Var);
                        bVarI.r(objY2);
                    }
                    sc2.a(w420Var, pp8.b(-527401546, new o0g0(dtg0VarE2, op8Var, (y0g0) objY2), bVarI), b1g0Var, dVar3, function3, false, z4, pp8.b(-23901870, new p0g0(ytwVar, op8Var2), bVarI), bVarI, (i9 & 29360128) | (i9 & 14) | 100663344 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9));
                    function2 = function3;
                    dVar2 = dVar3;
                } else {
                    bVarI.G();
                    function2 = function1;
                    z4 = z2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: k0g0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            r0g0.b(w420Var, op8Var, b1g0Var, dVar2, function2, z4, op8Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            function1 = function0;
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bVarI.b(false)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((1572864 & i) == 0) {
                    z2 = z;
                    if (bVarI.b(z2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                i9 = i3 | 12582912;
                if ((100663296 & i) == 0) {
                    if (bVarI.A(op8Var2)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i9 |= i10;
                }
                if ((38347923 & i9) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i9 & 1, z3)) {
                    if (i11 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    function3 = null;
                    if (i4 != 0) {
                        function3 = function1;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    dtg0 dtg0VarE3 = vtg0.e(b1g0Var.c, "tooltip transition", bVarI, 48, 0);
                    objY = bVarI.y();
                    c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = m.b(0);
                        bVarI.r(objY);
                    }
                    ytwVar = (ytw) objY;
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new y0g0(new ikq(ytwVar, 1), w420Var);
                        bVarI.r(objY2);
                    }
                    sc2.a(w420Var, pp8.b(-527401546, new o0g0(dtg0VarE3, op8Var, (y0g0) objY2), bVarI), b1g0Var, dVar3, function3, false, z4, pp8.b(-23901870, new p0g0(ytwVar, op8Var2), bVarI), bVarI, (i9 & 29360128) | (i9 & 14) | 100663344 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9));
                    function2 = function3;
                    dVar2 = dVar3;
                } else {
                    bVarI.G();
                    function2 = function1;
                    z4 = z2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: k0g0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            r0g0.b(w420Var, op8Var, b1g0Var, dVar2, function2, z4, op8Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            z2 = z;
            i9 = i3 | 12582912;
            if ((100663296 & i) == 0) {
                if (bVarI.A(op8Var2)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i9 |= i10;
            }
            if ((38347923 & i9) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i9 & 1, z3)) {
                if (i11 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                function3 = null;
                if (i4 != 0) {
                    function3 = function1;
                }
                if (i7 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                dtg0 dtg0VarE4 = vtg0.e(b1g0Var.c, "tooltip transition", bVarI, 48, 0);
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(0);
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new y0g0(new ikq(ytwVar, 1), w420Var);
                    bVarI.r(objY2);
                }
                sc2.a(w420Var, pp8.b(-527401546, new o0g0(dtg0VarE4, op8Var, (y0g0) objY2), bVarI), b1g0Var, dVar3, function3, false, z4, pp8.b(-23901870, new p0g0(ytwVar, op8Var2), bVarI), bVarI, (i9 & 29360128) | (i9 & 14) | 100663344 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9));
                function2 = function3;
                dVar2 = dVar3;
            } else {
                bVarI.G();
                function2 = function1;
                z4 = z2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: k0g0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        r0g0.b(w420Var, op8Var, b1g0Var, dVar2, function2, z4, op8Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        dVar2 = dVar;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                function1 = function0;
                if (bVarI.A(function1)) {
                    i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bVarI.b(false)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((1572864 & i) == 0) {
                    z2 = z;
                    if (bVarI.b(z2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                i9 = i3 | 12582912;
                if ((100663296 & i) == 0) {
                    if (bVarI.A(op8Var2)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i9 |= i10;
                }
                if ((38347923 & i9) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i9 & 1, z3)) {
                    if (i11 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    function3 = null;
                    if (i4 != 0) {
                        function3 = function1;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    dtg0 dtg0VarE5 = vtg0.e(b1g0Var.c, "tooltip transition", bVarI, 48, 0);
                    objY = bVarI.y();
                    c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = m.b(0);
                        bVarI.r(objY);
                    }
                    ytwVar = (ytw) objY;
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new y0g0(new ikq(ytwVar, 1), w420Var);
                        bVarI.r(objY2);
                    }
                    sc2.a(w420Var, pp8.b(-527401546, new o0g0(dtg0VarE5, op8Var, (y0g0) objY2), bVarI), b1g0Var, dVar3, function3, false, z4, pp8.b(-23901870, new p0g0(ytwVar, op8Var2), bVarI), bVarI, (i9 & 29360128) | (i9 & 14) | 100663344 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9));
                    function2 = function3;
                    dVar2 = dVar3;
                } else {
                    bVarI.G();
                    function2 = function1;
                    z4 = z2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: k0g0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            r0g0.b(w420Var, op8Var, b1g0Var, dVar2, function2, z4, op8Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            z2 = z;
            i9 = i3 | 12582912;
            if ((100663296 & i) == 0) {
                if (bVarI.A(op8Var2)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i9 |= i10;
            }
            if ((38347923 & i9) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i9 & 1, z3)) {
                if (i11 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                function3 = null;
                if (i4 != 0) {
                    function3 = function1;
                }
                if (i7 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                dtg0 dtg0VarE6 = vtg0.e(b1g0Var.c, "tooltip transition", bVarI, 48, 0);
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(0);
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new y0g0(new ikq(ytwVar, 1), w420Var);
                    bVarI.r(objY2);
                }
                sc2.a(w420Var, pp8.b(-527401546, new o0g0(dtg0VarE6, op8Var, (y0g0) objY2), bVarI), b1g0Var, dVar3, function3, false, z4, pp8.b(-23901870, new p0g0(ytwVar, op8Var2), bVarI), bVarI, (i9 & 29360128) | (i9 & 14) | 100663344 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9));
                function2 = function3;
                dVar2 = dVar3;
            } else {
                bVarI.G();
                function2 = function1;
                z4 = z2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: k0g0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        r0g0.b(w420Var, op8Var, b1g0Var, dVar2, function2, z4, op8Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 24576;
        function1 = function0;
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (bVarI.b(false)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        i7 = i2 & 64;
        if (i7 != 0) {
            if ((1572864 & i) == 0) {
                z2 = z;
                if (bVarI.b(z2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            i9 = i3 | 12582912;
            if ((100663296 & i) == 0) {
                if (bVarI.A(op8Var2)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i9 |= i10;
            }
            if ((38347923 & i9) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i9 & 1, z3)) {
                if (i11 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                function3 = null;
                if (i4 != 0) {
                    function3 = function1;
                }
                if (i7 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                dtg0 dtg0VarE7 = vtg0.e(b1g0Var.c, "tooltip transition", bVarI, 48, 0);
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(0);
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new y0g0(new ikq(ytwVar, 1), w420Var);
                    bVarI.r(objY2);
                }
                sc2.a(w420Var, pp8.b(-527401546, new o0g0(dtg0VarE7, op8Var, (y0g0) objY2), bVarI), b1g0Var, dVar3, function3, false, z4, pp8.b(-23901870, new p0g0(ytwVar, op8Var2), bVarI), bVarI, (i9 & 29360128) | (i9 & 14) | 100663344 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9));
                function2 = function3;
                dVar2 = dVar3;
            } else {
                bVarI.G();
                function2 = function1;
                z4 = z2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: k0g0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        r0g0.b(w420Var, op8Var, b1g0Var, dVar2, function2, z4, op8Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 1572864;
        z2 = z;
        i9 = i3 | 12582912;
        if ((100663296 & i) == 0) {
            if (bVarI.A(op8Var2)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i9 |= i10;
        }
        if ((38347923 & i9) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i9 & 1, z3)) {
            if (i11 != 0) {
                dVar3 = d.a.b;
            } else {
                dVar3 = dVar2;
            }
            function3 = null;
            if (i4 != 0) {
                function3 = function1;
            }
            if (i7 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            dtg0 dtg0VarE8 = vtg0.e(b1g0Var.c, "tooltip transition", bVarI, 48, 0);
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(0);
                bVarI.r(objY);
            }
            ytwVar = (ytw) objY;
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new y0g0(new ikq(ytwVar, 1), w420Var);
                bVarI.r(objY2);
            }
            sc2.a(w420Var, pp8.b(-527401546, new o0g0(dtg0VarE8, op8Var, (y0g0) objY2), bVarI), b1g0Var, dVar3, function3, false, z4, pp8.b(-23901870, new p0g0(ytwVar, op8Var2), bVarI), bVarI, (i9 & 29360128) | (i9 & 14) | 100663344 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9));
            function2 = function3;
            dVar2 = dVar3;
        } else {
            bVarI.G();
            function2 = function1;
            z4 = z2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: k0g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r0g0.b(w420Var, op8Var, b1g0Var, dVar2, function2, z4, op8Var2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final float c(float f, int i, lk40 lk40Var) {
        float fMin;
        float f2 = lk40Var.a;
        float f3 = lk40Var.c;
        float f4 = (f2 + f3) / 2.0f;
        float f5 = i;
        if (f >= f5) {
            return f4;
        }
        float f6 = f / 2.0f;
        if (f4 - f6 < 0.0f) {
            fMin = Math.max(f - f5, -f2);
        } else {
            if (f4 + f6 <= f5) {
                return f6;
            }
            fMin = Math.min(f - f3, 0.0f);
        }
        return fMin + f4;
    }

    public static final b1g0 d(int i, int i2, a aVar, boolean z) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        puw puwVar = ac2.a;
        boolean z2 = ((((i & 112) ^ 48) > 32 && aVar.b(z)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && aVar.M(puwVar)) || (i & 384) == 256);
        Object objY = aVar.y();
        if (z2 || objY == a.C0041a.a) {
            objY = new b1g0(z, puwVar);
            aVar.r(objY);
        }
        return (b1g0) objY;
    }
}
