package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class z80 {
    public static final x420 a = new x420(14, true);

    /* JADX WARN: Code duplicated, block: B:104:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x013a  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:109:0x0156  */
    /* JADX WARN: Code duplicated, block: B:112:0x015b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0162  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:116:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x016d  */
    /* JADX WARN: Code duplicated, block: B:122:0x017b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0186  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x020b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x021b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0269  */
    /* JADX WARN: Code duplicated, block: B:151:0x027b  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    public static final void a(final boolean z, final Function0 function0, d dVar, long j, zp70 zp70Var, x420 x420Var, qx80 qx80Var, long j2, float f, final op8 op8Var, a aVar, final int i, final int i2) {
        int i3;
        d dVar2;
        int i4;
        long j3;
        int i5;
        zp70 zp70Var2;
        int i6;
        x420 x420Var2;
        int i7;
        qx80 qx80VarB;
        char c;
        int i8;
        int i9;
        boolean z2;
        final qx80 qx80Var2;
        final d dVar3;
        final long j4;
        final zp70 zp70Var3;
        final long j5;
        final float f2;
        final x420 x420Var3;
        e eVarZ;
        d dVar4;
        long jFloatToRawIntBits;
        zp70 zp70VarA;
        x420 x420Var4;
        long jD;
        d dVar5;
        float f3;
        qx80 qx80Var3;
        zp70 zp70Var4;
        long j6;
        Object objY;
        a.C0041a.C0042a c0042a;
        cuw cuwVar;
        Object objY2;
        ytw ytwVar;
        mmd mmdVar;
        boolean zM;
        Object objY3;
        int i10;
        int i11;
        b bVarI = aVar.i(1725609375);
        if ((i & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.A(function0) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    j3 = j;
                    if (bVarI.e(j3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        zp70Var2 = zp70Var;
                        int i13 = bVarI.M(zp70Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                        i3 |= i13;
                    } else {
                        zp70Var2 = zp70Var;
                    }
                    i3 |= i13;
                } else {
                    zp70Var2 = zp70Var;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        x420Var2 = x420Var;
                        if (bVarI.M(x420Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((i & 1572864) == 0) {
                        qx80VarB = qx80Var;
                        c = ' ';
                        if ((i2 & 64) == 0 || !bVarI.M(qx80VarB)) {
                            i11 = 524288;
                        } else {
                            i11 = 1048576;
                        }
                        i3 |= i11;
                    } else {
                        qx80VarB = qx80Var;
                        c = ' ';
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0) {
                            i10 = i3;
                            int i14 = bVarI.e(j2) ? 8388608 : 4194304;
                            i8 = i10 | i14;
                        } else {
                            i10 = i3;
                        }
                        i8 = i10 | i14;
                    } else {
                        i8 = i3;
                    }
                    i9 = i8 | 905969664;
                    if ((i9 & 306783379) == 306783378) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (bVarI.q(i9 & 1, z2)) {
                        bVarI.A0();
                        if ((i & 1) != 0 || bVarI.h0()) {
                            if (i12 != 0) {
                                dVar4 = d.a.b;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i4 != 0) {
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                            } else {
                                jFloatToRawIntBits = j3;
                            }
                            if ((i2 & 16) != 0) {
                                zp70VarA = op70.a(bVarI);
                                i9 &= -57345;
                            } else {
                                zp70VarA = zp70Var2;
                            }
                            if (i6 != 0) {
                                x420Var4 = a;
                            } else {
                                x420Var4 = x420Var2;
                            }
                            if ((i2 & 64) != 0) {
                                float f4 = cmv.a;
                                qx80VarB = xy80.b(cnv.c, bVarI);
                                i9 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                float f5 = cmv.a;
                                jD = g68.d(cnv.a, bVarI);
                                i9 = (-29360129) & i9;
                            } else {
                                jD = j2;
                            }
                            dVar5 = dVar4;
                            f3 = cmv.a;
                            qx80Var3 = qx80VarB;
                            zp70Var4 = zp70VarA;
                            x420Var2 = x420Var4;
                            j6 = jD;
                            j3 = jFloatToRawIntBits;
                        } else {
                            bVarI.G();
                            if ((i2 & 16) != 0) {
                                i9 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i9 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i9 &= -29360129;
                            }
                            j6 = j2;
                            f3 = f;
                            qx80Var3 = qx80VarB;
                            dVar5 = dVar2;
                            zp70Var4 = zp70Var2;
                        }
                        bVarI.Y();
                        objY = bVarI.y();
                        c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = new cuw(Boolean.FALSE);
                            bVarI.r(objY);
                        }
                        cuwVar = (cuw) objY;
                        cuwVar.o0(Boolean.valueOf(z));
                        if (!((Boolean) ((x5a0) cuwVar.b).getValue()).booleanValue() || ((Boolean) ((x5a0) cuwVar.c).getValue()).booleanValue()) {
                            bVarI.N(1165905588);
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = m.b(new jsg0(jsg0.b));
                                bVarI.r(objY2);
                            }
                            ytwVar = (ytw) objY2;
                            mmdVar = (mmd) bVarI.O(kna.h);
                            zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                            objY3 = bVarI.y();
                            if (zM || objY3 == c0042a) {
                                objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                                bVarI.r(objY3);
                            }
                            u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                            bVarI.X(false);
                        } else {
                            bVarI.N(1166965571);
                            bVarI.X(false);
                        }
                        j4 = j3;
                        dVar3 = dVar5;
                        zp70Var3 = zp70Var4;
                        qx80Var2 = qx80Var3;
                        j5 = j6;
                        f2 = f3;
                    } else {
                        bVarI.G();
                        qx80Var2 = qx80VarB;
                        dVar3 = dVar2;
                        j4 = j3;
                        zp70Var3 = zp70Var2;
                        j5 = j2;
                        f2 = f;
                    }
                    x420Var3 = x420Var2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: w80
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i | 1);
                                z80.a(z, function0, dVar3, j4, zp70Var3, x420Var3, qx80Var2, j5, f2, op8Var, (a) obj, iA, i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                x420Var2 = x420Var;
                if ((i & 1572864) == 0) {
                    qx80VarB = qx80Var;
                    c = ' ';
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                } else {
                    qx80VarB = qx80Var;
                    c = ' ';
                }
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) == 0) {
                        i10 = i3;
                        if (bVarI.e(j2)) {
                        }
                        i8 = i10 | i14;
                    } else {
                        i10 = i3;
                    }
                    i8 = i10 | i14;
                } else {
                    i8 = i3;
                }
                i9 = i8 | 905969664;
                if ((i9 & 306783379) == 306783378) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (bVarI.q(i9 & 1, z2)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i4 != 0) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = j3;
                        }
                        if ((i2 & 16) != 0) {
                            zp70VarA = op70.a(bVarI);
                            i9 &= -57345;
                        } else {
                            zp70VarA = zp70Var2;
                        }
                        if (i6 != 0) {
                            x420Var4 = a;
                        } else {
                            x420Var4 = x420Var2;
                        }
                        if ((i2 & 64) != 0) {
                            float f6 = cmv.a;
                            qx80VarB = xy80.b(cnv.c, bVarI);
                            i9 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            float f7 = cmv.a;
                            jD = g68.d(cnv.a, bVarI);
                            i9 = (-29360129) & i9;
                        } else {
                            jD = j2;
                        }
                        dVar5 = dVar4;
                        f3 = cmv.a;
                        qx80Var3 = qx80VarB;
                        zp70Var4 = zp70VarA;
                        x420Var2 = x420Var4;
                        j6 = jD;
                        j3 = jFloatToRawIntBits;
                    } else {
                        if (i12 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i4 != 0) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = j3;
                        }
                        if ((i2 & 16) != 0) {
                            zp70VarA = op70.a(bVarI);
                            i9 &= -57345;
                        } else {
                            zp70VarA = zp70Var2;
                        }
                        if (i6 != 0) {
                            x420Var4 = a;
                        } else {
                            x420Var4 = x420Var2;
                        }
                        if ((i2 & 64) != 0) {
                            float f8 = cmv.a;
                            qx80VarB = xy80.b(cnv.c, bVarI);
                            i9 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            float f9 = cmv.a;
                            jD = g68.d(cnv.a, bVarI);
                            i9 = (-29360129) & i9;
                        } else {
                            jD = j2;
                        }
                        dVar5 = dVar4;
                        f3 = cmv.a;
                        qx80Var3 = qx80VarB;
                        zp70Var4 = zp70VarA;
                        x420Var2 = x420Var4;
                        j6 = jD;
                        j3 = jFloatToRawIntBits;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = new cuw(Boolean.FALSE);
                        bVarI.r(objY);
                    }
                    cuwVar = (cuw) objY;
                    cuwVar.o0(Boolean.valueOf(z));
                    if (((Boolean) ((x5a0) cuwVar.b).getValue()).booleanValue()) {
                        bVarI.N(1165905588);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = m.b(new jsg0(jsg0.b));
                            bVarI.r(objY2);
                        }
                        ytwVar = (ytw) objY2;
                        mmdVar = (mmd) bVarI.O(kna.h);
                        zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                        objY3 = bVarI.y();
                        if (zM) {
                            objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                            bVarI.r(objY3);
                        } else {
                            objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                            bVarI.r(objY3);
                        }
                        u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1165905588);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = m.b(new jsg0(jsg0.b));
                            bVarI.r(objY2);
                        }
                        ytwVar = (ytw) objY2;
                        mmdVar = (mmd) bVarI.O(kna.h);
                        zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                        objY3 = bVarI.y();
                        if (zM) {
                            objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                            bVarI.r(objY3);
                        } else {
                            objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                            bVarI.r(objY3);
                        }
                        u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                        bVarI.X(false);
                    }
                    j4 = j3;
                    dVar3 = dVar5;
                    zp70Var3 = zp70Var4;
                    qx80Var2 = qx80Var3;
                    j5 = j6;
                    f2 = f3;
                } else {
                    bVarI.G();
                    qx80Var2 = qx80VarB;
                    dVar3 = dVar2;
                    j4 = j3;
                    zp70Var3 = zp70Var2;
                    j5 = j2;
                    f2 = f;
                }
                x420Var3 = x420Var2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: w80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            z80.a(z, function0, dVar3, j4, zp70Var3, x420Var3, qx80Var2, j5, f2, op8Var, (a) obj, iA, i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            j3 = j;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    zp70Var2 = zp70Var;
                    if (bVarI.M(zp70Var2)) {
                    }
                    i3 |= i13;
                } else {
                    zp70Var2 = zp70Var;
                }
                i3 |= i13;
            } else {
                zp70Var2 = zp70Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    x420Var2 = x420Var;
                    if (bVarI.M(x420Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i & 1572864) == 0) {
                    qx80VarB = qx80Var;
                    c = ' ';
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                } else {
                    qx80VarB = qx80Var;
                    c = ' ';
                }
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) == 0) {
                        i10 = i3;
                        if (bVarI.e(j2)) {
                        }
                        i8 = i10 | i14;
                    } else {
                        i10 = i3;
                    }
                    i8 = i10 | i14;
                } else {
                    i8 = i3;
                }
                i9 = i8 | 905969664;
                if ((i9 & 306783379) == 306783378) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (bVarI.q(i9 & 1, z2)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i4 != 0) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = j3;
                        }
                        if ((i2 & 16) != 0) {
                            zp70VarA = op70.a(bVarI);
                            i9 &= -57345;
                        } else {
                            zp70VarA = zp70Var2;
                        }
                        if (i6 != 0) {
                            x420Var4 = a;
                        } else {
                            x420Var4 = x420Var2;
                        }
                        if ((i2 & 64) != 0) {
                            float f10 = cmv.a;
                            qx80VarB = xy80.b(cnv.c, bVarI);
                            i9 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            float f11 = cmv.a;
                            jD = g68.d(cnv.a, bVarI);
                            i9 = (-29360129) & i9;
                        } else {
                            jD = j2;
                        }
                        dVar5 = dVar4;
                        f3 = cmv.a;
                        qx80Var3 = qx80VarB;
                        zp70Var4 = zp70VarA;
                        x420Var2 = x420Var4;
                        j6 = jD;
                        j3 = jFloatToRawIntBits;
                    } else {
                        if (i12 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i4 != 0) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = j3;
                        }
                        if ((i2 & 16) != 0) {
                            zp70VarA = op70.a(bVarI);
                            i9 &= -57345;
                        } else {
                            zp70VarA = zp70Var2;
                        }
                        if (i6 != 0) {
                            x420Var4 = a;
                        } else {
                            x420Var4 = x420Var2;
                        }
                        if ((i2 & 64) != 0) {
                            float f12 = cmv.a;
                            qx80VarB = xy80.b(cnv.c, bVarI);
                            i9 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            float f13 = cmv.a;
                            jD = g68.d(cnv.a, bVarI);
                            i9 = (-29360129) & i9;
                        } else {
                            jD = j2;
                        }
                        dVar5 = dVar4;
                        f3 = cmv.a;
                        qx80Var3 = qx80VarB;
                        zp70Var4 = zp70VarA;
                        x420Var2 = x420Var4;
                        j6 = jD;
                        j3 = jFloatToRawIntBits;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = new cuw(Boolean.FALSE);
                        bVarI.r(objY);
                    }
                    cuwVar = (cuw) objY;
                    cuwVar.o0(Boolean.valueOf(z));
                    if (((Boolean) ((x5a0) cuwVar.b).getValue()).booleanValue()) {
                        bVarI.N(1165905588);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = m.b(new jsg0(jsg0.b));
                            bVarI.r(objY2);
                        }
                        ytwVar = (ytw) objY2;
                        mmdVar = (mmd) bVarI.O(kna.h);
                        zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                        objY3 = bVarI.y();
                        if (zM) {
                            objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                            bVarI.r(objY3);
                        } else {
                            objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                            bVarI.r(objY3);
                        }
                        u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1165905588);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = m.b(new jsg0(jsg0.b));
                            bVarI.r(objY2);
                        }
                        ytwVar = (ytw) objY2;
                        mmdVar = (mmd) bVarI.O(kna.h);
                        zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                        objY3 = bVarI.y();
                        if (zM) {
                            objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                            bVarI.r(objY3);
                        } else {
                            objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                            bVarI.r(objY3);
                        }
                        u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                        bVarI.X(false);
                    }
                    j4 = j3;
                    dVar3 = dVar5;
                    zp70Var3 = zp70Var4;
                    qx80Var2 = qx80Var3;
                    j5 = j6;
                    f2 = f3;
                } else {
                    bVarI.G();
                    qx80Var2 = qx80VarB;
                    dVar3 = dVar2;
                    j4 = j3;
                    zp70Var3 = zp70Var2;
                    j5 = j2;
                    f2 = f;
                }
                x420Var3 = x420Var2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: w80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            z80.a(z, function0, dVar3, j4, zp70Var3, x420Var3, qx80Var2, j5, f2, op8Var, (a) obj, iA, i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            x420Var2 = x420Var;
            if ((i & 1572864) == 0) {
                qx80VarB = qx80Var;
                c = ' ';
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            } else {
                qx80VarB = qx80Var;
                c = ' ';
            }
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    i10 = i3;
                    if (bVarI.e(j2)) {
                    }
                    i8 = i10 | i14;
                } else {
                    i10 = i3;
                }
                i8 = i10 | i14;
            } else {
                i8 = i3;
            }
            i9 = i8 | 905969664;
            if ((i9 & 306783379) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (bVarI.q(i9 & 1, z2)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j3;
                    }
                    if ((i2 & 16) != 0) {
                        zp70VarA = op70.a(bVarI);
                        i9 &= -57345;
                    } else {
                        zp70VarA = zp70Var2;
                    }
                    if (i6 != 0) {
                        x420Var4 = a;
                    } else {
                        x420Var4 = x420Var2;
                    }
                    if ((i2 & 64) != 0) {
                        float f14 = cmv.a;
                        qx80VarB = xy80.b(cnv.c, bVarI);
                        i9 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        float f15 = cmv.a;
                        jD = g68.d(cnv.a, bVarI);
                        i9 = (-29360129) & i9;
                    } else {
                        jD = j2;
                    }
                    dVar5 = dVar4;
                    f3 = cmv.a;
                    qx80Var3 = qx80VarB;
                    zp70Var4 = zp70VarA;
                    x420Var2 = x420Var4;
                    j6 = jD;
                    j3 = jFloatToRawIntBits;
                } else {
                    if (i12 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j3;
                    }
                    if ((i2 & 16) != 0) {
                        zp70VarA = op70.a(bVarI);
                        i9 &= -57345;
                    } else {
                        zp70VarA = zp70Var2;
                    }
                    if (i6 != 0) {
                        x420Var4 = a;
                    } else {
                        x420Var4 = x420Var2;
                    }
                    if ((i2 & 64) != 0) {
                        float f16 = cmv.a;
                        qx80VarB = xy80.b(cnv.c, bVarI);
                        i9 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        float f17 = cmv.a;
                        jD = g68.d(cnv.a, bVarI);
                        i9 = (-29360129) & i9;
                    } else {
                        jD = j2;
                    }
                    dVar5 = dVar4;
                    f3 = cmv.a;
                    qx80Var3 = qx80VarB;
                    zp70Var4 = zp70VarA;
                    x420Var2 = x420Var4;
                    j6 = jD;
                    j3 = jFloatToRawIntBits;
                }
                bVarI.Y();
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = new cuw(Boolean.FALSE);
                    bVarI.r(objY);
                }
                cuwVar = (cuw) objY;
                cuwVar.o0(Boolean.valueOf(z));
                if (((Boolean) ((x5a0) cuwVar.b).getValue()).booleanValue()) {
                    bVarI.N(1165905588);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = m.b(new jsg0(jsg0.b));
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    mmdVar = (mmd) bVarI.O(kna.h);
                    zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                    objY3 = bVarI.y();
                    if (zM) {
                        objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                        bVarI.r(objY3);
                    } else {
                        objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                        bVarI.r(objY3);
                    }
                    u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    bVarI.X(false);
                } else {
                    bVarI.N(1165905588);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = m.b(new jsg0(jsg0.b));
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    mmdVar = (mmd) bVarI.O(kna.h);
                    zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                    objY3 = bVarI.y();
                    if (zM) {
                        objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                        bVarI.r(objY3);
                    } else {
                        objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                        bVarI.r(objY3);
                    }
                    u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    bVarI.X(false);
                }
                j4 = j3;
                dVar3 = dVar5;
                zp70Var3 = zp70Var4;
                qx80Var2 = qx80Var3;
                j5 = j6;
                f2 = f3;
            } else {
                bVarI.G();
                qx80Var2 = qx80VarB;
                dVar3 = dVar2;
                j4 = j3;
                zp70Var3 = zp70Var2;
                j5 = j2;
                f2 = f;
            }
            x420Var3 = x420Var2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: w80
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        z80.a(z, function0, dVar3, j4, zp70Var3, x420Var3, qx80Var2, j5, f2, op8Var, (a) obj, iA, i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        dVar2 = dVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                j3 = j;
                if (bVarI.e(j3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    zp70Var2 = zp70Var;
                    if (bVarI.M(zp70Var2)) {
                    }
                    i3 |= i13;
                } else {
                    zp70Var2 = zp70Var;
                }
                i3 |= i13;
            } else {
                zp70Var2 = zp70Var;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    x420Var2 = x420Var;
                    if (bVarI.M(x420Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((i & 1572864) == 0) {
                    qx80VarB = qx80Var;
                    c = ' ';
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                } else {
                    qx80VarB = qx80Var;
                    c = ' ';
                }
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) == 0) {
                        i10 = i3;
                        if (bVarI.e(j2)) {
                        }
                        i8 = i10 | i14;
                    } else {
                        i10 = i3;
                    }
                    i8 = i10 | i14;
                } else {
                    i8 = i3;
                }
                i9 = i8 | 905969664;
                if ((i9 & 306783379) == 306783378) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (bVarI.q(i9 & 1, z2)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i4 != 0) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = j3;
                        }
                        if ((i2 & 16) != 0) {
                            zp70VarA = op70.a(bVarI);
                            i9 &= -57345;
                        } else {
                            zp70VarA = zp70Var2;
                        }
                        if (i6 != 0) {
                            x420Var4 = a;
                        } else {
                            x420Var4 = x420Var2;
                        }
                        if ((i2 & 64) != 0) {
                            float f18 = cmv.a;
                            qx80VarB = xy80.b(cnv.c, bVarI);
                            i9 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            float f19 = cmv.a;
                            jD = g68.d(cnv.a, bVarI);
                            i9 = (-29360129) & i9;
                        } else {
                            jD = j2;
                        }
                        dVar5 = dVar4;
                        f3 = cmv.a;
                        qx80Var3 = qx80VarB;
                        zp70Var4 = zp70VarA;
                        x420Var2 = x420Var4;
                        j6 = jD;
                        j3 = jFloatToRawIntBits;
                    } else {
                        if (i12 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i4 != 0) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = j3;
                        }
                        if ((i2 & 16) != 0) {
                            zp70VarA = op70.a(bVarI);
                            i9 &= -57345;
                        } else {
                            zp70VarA = zp70Var2;
                        }
                        if (i6 != 0) {
                            x420Var4 = a;
                        } else {
                            x420Var4 = x420Var2;
                        }
                        if ((i2 & 64) != 0) {
                            float f110 = cmv.a;
                            qx80VarB = xy80.b(cnv.c, bVarI);
                            i9 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            float f111 = cmv.a;
                            jD = g68.d(cnv.a, bVarI);
                            i9 = (-29360129) & i9;
                        } else {
                            jD = j2;
                        }
                        dVar5 = dVar4;
                        f3 = cmv.a;
                        qx80Var3 = qx80VarB;
                        zp70Var4 = zp70VarA;
                        x420Var2 = x420Var4;
                        j6 = jD;
                        j3 = jFloatToRawIntBits;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = new cuw(Boolean.FALSE);
                        bVarI.r(objY);
                    }
                    cuwVar = (cuw) objY;
                    cuwVar.o0(Boolean.valueOf(z));
                    if (((Boolean) ((x5a0) cuwVar.b).getValue()).booleanValue()) {
                        bVarI.N(1165905588);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = m.b(new jsg0(jsg0.b));
                            bVarI.r(objY2);
                        }
                        ytwVar = (ytw) objY2;
                        mmdVar = (mmd) bVarI.O(kna.h);
                        zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                        objY3 = bVarI.y();
                        if (zM) {
                            objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                            bVarI.r(objY3);
                        } else {
                            objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                            bVarI.r(objY3);
                        }
                        u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1165905588);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = m.b(new jsg0(jsg0.b));
                            bVarI.r(objY2);
                        }
                        ytwVar = (ytw) objY2;
                        mmdVar = (mmd) bVarI.O(kna.h);
                        zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                        objY3 = bVarI.y();
                        if (zM) {
                            objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                            bVarI.r(objY3);
                        } else {
                            objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                            bVarI.r(objY3);
                        }
                        u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                        bVarI.X(false);
                    }
                    j4 = j3;
                    dVar3 = dVar5;
                    zp70Var3 = zp70Var4;
                    qx80Var2 = qx80Var3;
                    j5 = j6;
                    f2 = f3;
                } else {
                    bVarI.G();
                    qx80Var2 = qx80VarB;
                    dVar3 = dVar2;
                    j4 = j3;
                    zp70Var3 = zp70Var2;
                    j5 = j2;
                    f2 = f;
                }
                x420Var3 = x420Var2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: w80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            z80.a(z, function0, dVar3, j4, zp70Var3, x420Var3, qx80Var2, j5, f2, op8Var, (a) obj, iA, i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            x420Var2 = x420Var;
            if ((i & 1572864) == 0) {
                qx80VarB = qx80Var;
                c = ' ';
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            } else {
                qx80VarB = qx80Var;
                c = ' ';
            }
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    i10 = i3;
                    if (bVarI.e(j2)) {
                    }
                    i8 = i10 | i14;
                } else {
                    i10 = i3;
                }
                i8 = i10 | i14;
            } else {
                i8 = i3;
            }
            i9 = i8 | 905969664;
            if ((i9 & 306783379) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (bVarI.q(i9 & 1, z2)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j3;
                    }
                    if ((i2 & 16) != 0) {
                        zp70VarA = op70.a(bVarI);
                        i9 &= -57345;
                    } else {
                        zp70VarA = zp70Var2;
                    }
                    if (i6 != 0) {
                        x420Var4 = a;
                    } else {
                        x420Var4 = x420Var2;
                    }
                    if ((i2 & 64) != 0) {
                        float f112 = cmv.a;
                        qx80VarB = xy80.b(cnv.c, bVarI);
                        i9 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        float f113 = cmv.a;
                        jD = g68.d(cnv.a, bVarI);
                        i9 = (-29360129) & i9;
                    } else {
                        jD = j2;
                    }
                    dVar5 = dVar4;
                    f3 = cmv.a;
                    qx80Var3 = qx80VarB;
                    zp70Var4 = zp70VarA;
                    x420Var2 = x420Var4;
                    j6 = jD;
                    j3 = jFloatToRawIntBits;
                } else {
                    if (i12 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j3;
                    }
                    if ((i2 & 16) != 0) {
                        zp70VarA = op70.a(bVarI);
                        i9 &= -57345;
                    } else {
                        zp70VarA = zp70Var2;
                    }
                    if (i6 != 0) {
                        x420Var4 = a;
                    } else {
                        x420Var4 = x420Var2;
                    }
                    if ((i2 & 64) != 0) {
                        float f114 = cmv.a;
                        qx80VarB = xy80.b(cnv.c, bVarI);
                        i9 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        float f115 = cmv.a;
                        jD = g68.d(cnv.a, bVarI);
                        i9 = (-29360129) & i9;
                    } else {
                        jD = j2;
                    }
                    dVar5 = dVar4;
                    f3 = cmv.a;
                    qx80Var3 = qx80VarB;
                    zp70Var4 = zp70VarA;
                    x420Var2 = x420Var4;
                    j6 = jD;
                    j3 = jFloatToRawIntBits;
                }
                bVarI.Y();
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = new cuw(Boolean.FALSE);
                    bVarI.r(objY);
                }
                cuwVar = (cuw) objY;
                cuwVar.o0(Boolean.valueOf(z));
                if (((Boolean) ((x5a0) cuwVar.b).getValue()).booleanValue()) {
                    bVarI.N(1165905588);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = m.b(new jsg0(jsg0.b));
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    mmdVar = (mmd) bVarI.O(kna.h);
                    zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                    objY3 = bVarI.y();
                    if (zM) {
                        objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                        bVarI.r(objY3);
                    } else {
                        objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                        bVarI.r(objY3);
                    }
                    u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    bVarI.X(false);
                } else {
                    bVarI.N(1165905588);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = m.b(new jsg0(jsg0.b));
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    mmdVar = (mmd) bVarI.O(kna.h);
                    zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                    objY3 = bVarI.y();
                    if (zM) {
                        objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                        bVarI.r(objY3);
                    } else {
                        objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                        bVarI.r(objY3);
                    }
                    u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    bVarI.X(false);
                }
                j4 = j3;
                dVar3 = dVar5;
                zp70Var3 = zp70Var4;
                qx80Var2 = qx80Var3;
                j5 = j6;
                f2 = f3;
            } else {
                bVarI.G();
                qx80Var2 = qx80VarB;
                dVar3 = dVar2;
                j4 = j3;
                zp70Var3 = zp70Var2;
                j5 = j2;
                f2 = f;
            }
            x420Var3 = x420Var2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: w80
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        z80.a(z, function0, dVar3, j4, zp70Var3, x420Var3, qx80Var2, j5, f2, op8Var, (a) obj, iA, i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        j3 = j;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                zp70Var2 = zp70Var;
                if (bVarI.M(zp70Var2)) {
                }
                i3 |= i13;
            } else {
                zp70Var2 = zp70Var;
            }
            i3 |= i13;
        } else {
            zp70Var2 = zp70Var;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                x420Var2 = x420Var;
                if (bVarI.M(x420Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((i & 1572864) == 0) {
                qx80VarB = qx80Var;
                c = ' ';
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            } else {
                qx80VarB = qx80Var;
                c = ' ';
            }
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    i10 = i3;
                    if (bVarI.e(j2)) {
                    }
                    i8 = i10 | i14;
                } else {
                    i10 = i3;
                }
                i8 = i10 | i14;
            } else {
                i8 = i3;
            }
            i9 = i8 | 905969664;
            if ((i9 & 306783379) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (bVarI.q(i9 & 1, z2)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j3;
                    }
                    if ((i2 & 16) != 0) {
                        zp70VarA = op70.a(bVarI);
                        i9 &= -57345;
                    } else {
                        zp70VarA = zp70Var2;
                    }
                    if (i6 != 0) {
                        x420Var4 = a;
                    } else {
                        x420Var4 = x420Var2;
                    }
                    if ((i2 & 64) != 0) {
                        float f116 = cmv.a;
                        qx80VarB = xy80.b(cnv.c, bVarI);
                        i9 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        float f117 = cmv.a;
                        jD = g68.d(cnv.a, bVarI);
                        i9 = (-29360129) & i9;
                    } else {
                        jD = j2;
                    }
                    dVar5 = dVar4;
                    f3 = cmv.a;
                    qx80Var3 = qx80VarB;
                    zp70Var4 = zp70VarA;
                    x420Var2 = x420Var4;
                    j6 = jD;
                    j3 = jFloatToRawIntBits;
                } else {
                    if (i12 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j3;
                    }
                    if ((i2 & 16) != 0) {
                        zp70VarA = op70.a(bVarI);
                        i9 &= -57345;
                    } else {
                        zp70VarA = zp70Var2;
                    }
                    if (i6 != 0) {
                        x420Var4 = a;
                    } else {
                        x420Var4 = x420Var2;
                    }
                    if ((i2 & 64) != 0) {
                        float f118 = cmv.a;
                        qx80VarB = xy80.b(cnv.c, bVarI);
                        i9 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        float f119 = cmv.a;
                        jD = g68.d(cnv.a, bVarI);
                        i9 = (-29360129) & i9;
                    } else {
                        jD = j2;
                    }
                    dVar5 = dVar4;
                    f3 = cmv.a;
                    qx80Var3 = qx80VarB;
                    zp70Var4 = zp70VarA;
                    x420Var2 = x420Var4;
                    j6 = jD;
                    j3 = jFloatToRawIntBits;
                }
                bVarI.Y();
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = new cuw(Boolean.FALSE);
                    bVarI.r(objY);
                }
                cuwVar = (cuw) objY;
                cuwVar.o0(Boolean.valueOf(z));
                if (((Boolean) ((x5a0) cuwVar.b).getValue()).booleanValue()) {
                    bVarI.N(1165905588);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = m.b(new jsg0(jsg0.b));
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    mmdVar = (mmd) bVarI.O(kna.h);
                    zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                    objY3 = bVarI.y();
                    if (zM) {
                        objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                        bVarI.r(objY3);
                    } else {
                        objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                        bVarI.r(objY3);
                    }
                    u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    bVarI.X(false);
                } else {
                    bVarI.N(1165905588);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = m.b(new jsg0(jsg0.b));
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    mmdVar = (mmd) bVarI.O(kna.h);
                    zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                    objY3 = bVarI.y();
                    if (zM) {
                        objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                        bVarI.r(objY3);
                    } else {
                        objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                        bVarI.r(objY3);
                    }
                    u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                    bVarI.X(false);
                }
                j4 = j3;
                dVar3 = dVar5;
                zp70Var3 = zp70Var4;
                qx80Var2 = qx80Var3;
                j5 = j6;
                f2 = f3;
            } else {
                bVarI.G();
                qx80Var2 = qx80VarB;
                dVar3 = dVar2;
                j4 = j3;
                zp70Var3 = zp70Var2;
                j5 = j2;
                f2 = f;
            }
            x420Var3 = x420Var2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: w80
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        z80.a(z, function0, dVar3, j4, zp70Var3, x420Var3, qx80Var2, j5, f2, op8Var, (a) obj, iA, i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 196608;
        x420Var2 = x420Var;
        if ((i & 1572864) == 0) {
            qx80VarB = qx80Var;
            c = ' ';
            if ((i2 & 64) == 0) {
                i11 = 524288;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        } else {
            qx80VarB = qx80Var;
            c = ' ';
        }
        if ((i & 12582912) == 0) {
            if ((i2 & 128) == 0) {
                i10 = i3;
                if (bVarI.e(j2)) {
                }
                i8 = i10 | i14;
            } else {
                i10 = i3;
            }
            i8 = i10 | i14;
        } else {
            i8 = i3;
        }
        i9 = i8 | 905969664;
        if ((i9 & 306783379) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (bVarI.q(i9 & 1, z2)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                } else {
                    jFloatToRawIntBits = j3;
                }
                if ((i2 & 16) != 0) {
                    zp70VarA = op70.a(bVarI);
                    i9 &= -57345;
                } else {
                    zp70VarA = zp70Var2;
                }
                if (i6 != 0) {
                    x420Var4 = a;
                } else {
                    x420Var4 = x420Var2;
                }
                if ((i2 & 64) != 0) {
                    float f1110 = cmv.a;
                    qx80VarB = xy80.b(cnv.c, bVarI);
                    i9 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    float f1111 = cmv.a;
                    jD = g68.d(cnv.a, bVarI);
                    i9 = (-29360129) & i9;
                } else {
                    jD = j2;
                }
                dVar5 = dVar4;
                f3 = cmv.a;
                qx80Var3 = qx80VarB;
                zp70Var4 = zp70VarA;
                x420Var2 = x420Var4;
                j6 = jD;
                j3 = jFloatToRawIntBits;
            } else {
                if (i12 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                } else {
                    jFloatToRawIntBits = j3;
                }
                if ((i2 & 16) != 0) {
                    zp70VarA = op70.a(bVarI);
                    i9 &= -57345;
                } else {
                    zp70VarA = zp70Var2;
                }
                if (i6 != 0) {
                    x420Var4 = a;
                } else {
                    x420Var4 = x420Var2;
                }
                if ((i2 & 64) != 0) {
                    float f1112 = cmv.a;
                    qx80VarB = xy80.b(cnv.c, bVarI);
                    i9 &= -3670017;
                }
                if ((i2 & 128) != 0) {
                    float f1113 = cmv.a;
                    jD = g68.d(cnv.a, bVarI);
                    i9 = (-29360129) & i9;
                } else {
                    jD = j2;
                }
                dVar5 = dVar4;
                f3 = cmv.a;
                qx80Var3 = qx80VarB;
                zp70Var4 = zp70VarA;
                x420Var2 = x420Var4;
                j6 = jD;
                j3 = jFloatToRawIntBits;
            }
            bVarI.Y();
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new cuw(Boolean.FALSE);
                bVarI.r(objY);
            }
            cuwVar = (cuw) objY;
            cuwVar.o0(Boolean.valueOf(z));
            if (((Boolean) ((x5a0) cuwVar.b).getValue()).booleanValue()) {
                bVarI.N(1165905588);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = m.b(new jsg0(jsg0.b));
                    bVarI.r(objY2);
                }
                ytwVar = (ytw) objY2;
                mmdVar = (mmd) bVarI.O(kna.h);
                zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                objY3 = bVarI.y();
                if (zM) {
                    objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                    bVarI.r(objY3);
                } else {
                    objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                    bVarI.r(objY3);
                }
                u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                bVarI.X(false);
            } else {
                bVarI.N(1165905588);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = m.b(new jsg0(jsg0.b));
                    bVarI.r(objY2);
                }
                ytwVar = (ytw) objY2;
                mmdVar = (mmd) bVarI.O(kna.h);
                zM = ((i9 & 7168) == 2048) | bVarI.M(mmdVar);
                objY3 = bVarI.y();
                if (zM) {
                    objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                    bVarI.r(objY3);
                } else {
                    objY3 = new kff(j3, mmdVar, new v80(ytwVar));
                    bVarI.r(objY3);
                }
                u90.a((kff) objY3, function0, x420Var2, pp8.b(-917492520, new y80(dVar5, cuwVar, ytwVar, zp70Var4, qx80Var3, j6, f3, op8Var), bVarI), bVarI, (i9 & 112) | 3072 | ((i9 >> 9) & 896), 0);
                bVarI.X(false);
            }
            j4 = j3;
            dVar3 = dVar5;
            zp70Var3 = zp70Var4;
            qx80Var2 = qx80Var3;
            j5 = j6;
            f2 = f3;
        } else {
            bVarI.G();
            qx80Var2 = qx80VarB;
            dVar3 = dVar2;
            j4 = j3;
            zp70Var3 = zp70Var2;
            j5 = j2;
            f2 = f;
        }
        x420Var3 = x420Var2;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: w80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    z80.a(z, function0, dVar3, j4, zp70Var3, x420Var3, qx80Var2, j5, f2, op8Var, (a) obj, iA, i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x0146  */
    /* JADX WARN: Code duplicated, block: B:91:0x0168  */
    /* JADX WARN: Code duplicated, block: B:94:0x017a  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void b(final op8 op8Var, final Function0 function0, d dVar, Function2 function2, Function2 function3, boolean z, hmv hmvVar, tmz tmzVar, a aVar, final int i, final int i2) {
        int i3;
        final d dVar2;
        int i4;
        Function2 function4;
        int i5;
        int i6;
        Function2 function5;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        b bVar;
        final tmz tmzVar2;
        final Function2 function6;
        final Function2 function7;
        final boolean z4;
        final hmv hmvVar2;
        e eVarZ;
        d dVar3;
        d68 d68Var;
        hmv hmvVar3;
        tmz tmzVar3;
        d dVar4;
        int i16;
        hmv hmvVar4;
        tmz tmzVar4;
        b bVarI = aVar.i(-532959117);
        if ((i & 48) == 0) {
            i3 = (bVarI.A(function0) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i17 = i2 & 4;
        if (i17 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function4 = function2;
                    if (bVarI.A(function4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        function5 = function3;
                        if (bVarI.A(function5)) {
                            i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        i10 = i3 | 196608;
                        z2 = z;
                    } else {
                        z2 = z;
                        if (bVarI.b(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i10 = i3 | i9;
                    }
                    i11 = 524288 | i10;
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i14 = i10 | 13107200;
                    } else {
                        if (bVarI.M(tmzVar)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i14 = i11 | i13;
                    }
                    i15 = i14 | 100663296;
                    if ((38347923 & i15) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i15 & 1, z3)) {
                        bVarI.A0();
                        if ((i & 1) != 0 || bVarI.h0()) {
                            if (i17 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i4 != 0) {
                                function4 = null;
                            }
                            if (i6 != 0) {
                                function5 = null;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            float f = cmv.a;
                            d68Var = (d68) bVarI.O(g68.a);
                            hmvVar3 = d68Var.h0;
                            if (hmvVar3 == null) {
                                hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                                d68Var.h0 = hmvVar3;
                            }
                            int i18 = i15 & (-3670017);
                            if (i12 != 0) {
                                tmzVar3 = cmv.b;
                            } else {
                                tmzVar3 = tmzVar;
                            }
                            dVar4 = dVar3;
                            i16 = i18;
                            hmvVar4 = hmvVar3;
                            tmzVar4 = tmzVar3;
                        } else {
                            bVarI.G();
                            i16 = i15 & (-3670017);
                            hmvVar4 = hmvVar;
                            tmzVar4 = tmzVar;
                            dVar4 = dVar2;
                        }
                        Function2 function8 = function4;
                        Function2 function9 = function5;
                        boolean z5 = z2;
                        bVarI.Y();
                        bVar = bVarI;
                        tmv.b(op8Var, function0, dVar4, function8, function9, z5, hmvVar4, tmzVar4, bVar, i16 & 268435454);
                        dVar2 = dVar4;
                        function6 = function8;
                        function7 = function9;
                        z4 = z5;
                        hmvVar2 = hmvVar4;
                        tmzVar2 = tmzVar4;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        tmzVar2 = tmzVar;
                        function6 = function4;
                        function7 = function5;
                        z4 = z2;
                        hmvVar2 = hmvVar;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: x80
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                z80.b(op8Var, function0, dVar2, function6, function7, z4, hmvVar2, tmzVar2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                function5 = function3;
                i8 = i2 & 32;
                if (i8 != 0) {
                    i10 = i3 | 196608;
                    z2 = z;
                } else {
                    z2 = z;
                    if (bVarI.b(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i10 = i3 | i9;
                }
                i11 = 524288 | i10;
                i12 = i2 & 128;
                if (i12 != 0) {
                    i14 = i10 | 13107200;
                } else {
                    if (bVarI.M(tmzVar)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i14 = i11 | i13;
                }
                i15 = i14 | 100663296;
                if ((38347923 & i15) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i15 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        float f2 = cmv.a;
                        d68Var = (d68) bVarI.O(g68.a);
                        hmvVar3 = d68Var.h0;
                        if (hmvVar3 == null) {
                            hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                            d68Var.h0 = hmvVar3;
                        }
                        int i19 = i15 & (-3670017);
                        if (i12 != 0) {
                            tmzVar3 = cmv.b;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        dVar4 = dVar3;
                        i16 = i19;
                        hmvVar4 = hmvVar3;
                        tmzVar4 = tmzVar3;
                    } else {
                        if (i17 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        float f3 = cmv.a;
                        d68Var = (d68) bVarI.O(g68.a);
                        hmvVar3 = d68Var.h0;
                        if (hmvVar3 == null) {
                            hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                            d68Var.h0 = hmvVar3;
                        }
                        int i110 = i15 & (-3670017);
                        if (i12 != 0) {
                            tmzVar3 = cmv.b;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        dVar4 = dVar3;
                        i16 = i110;
                        hmvVar4 = hmvVar3;
                        tmzVar4 = tmzVar3;
                    }
                    Function2 function10 = function4;
                    Function2 function11 = function5;
                    boolean z6 = z2;
                    bVarI.Y();
                    bVar = bVarI;
                    tmv.b(op8Var, function0, dVar4, function10, function11, z6, hmvVar4, tmzVar4, bVar, i16 & 268435454);
                    dVar2 = dVar4;
                    function6 = function10;
                    function7 = function11;
                    z4 = z6;
                    hmvVar2 = hmvVar4;
                    tmzVar2 = tmzVar4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    tmzVar2 = tmzVar;
                    function6 = function4;
                    function7 = function5;
                    z4 = z2;
                    hmvVar2 = hmvVar;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: x80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z80.b(op8Var, function0, dVar2, function6, function7, z4, hmvVar2, tmzVar2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            function4 = function2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function5 = function3;
                    if (bVarI.A(function5)) {
                        i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i10 = i3 | 196608;
                    z2 = z;
                } else {
                    z2 = z;
                    if (bVarI.b(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i10 = i3 | i9;
                }
                i11 = 524288 | i10;
                i12 = i2 & 128;
                if (i12 != 0) {
                    i14 = i10 | 13107200;
                } else {
                    if (bVarI.M(tmzVar)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i14 = i11 | i13;
                }
                i15 = i14 | 100663296;
                if ((38347923 & i15) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i15 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        float f4 = cmv.a;
                        d68Var = (d68) bVarI.O(g68.a);
                        hmvVar3 = d68Var.h0;
                        if (hmvVar3 == null) {
                            hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                            d68Var.h0 = hmvVar3;
                        }
                        int i111 = i15 & (-3670017);
                        if (i12 != 0) {
                            tmzVar3 = cmv.b;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        dVar4 = dVar3;
                        i16 = i111;
                        hmvVar4 = hmvVar3;
                        tmzVar4 = tmzVar3;
                    } else {
                        if (i17 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        float f5 = cmv.a;
                        d68Var = (d68) bVarI.O(g68.a);
                        hmvVar3 = d68Var.h0;
                        if (hmvVar3 == null) {
                            hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                            d68Var.h0 = hmvVar3;
                        }
                        int i112 = i15 & (-3670017);
                        if (i12 != 0) {
                            tmzVar3 = cmv.b;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        dVar4 = dVar3;
                        i16 = i112;
                        hmvVar4 = hmvVar3;
                        tmzVar4 = tmzVar3;
                    }
                    Function2 function12 = function4;
                    Function2 function13 = function5;
                    boolean z7 = z2;
                    bVarI.Y();
                    bVar = bVarI;
                    tmv.b(op8Var, function0, dVar4, function12, function13, z7, hmvVar4, tmzVar4, bVar, i16 & 268435454);
                    dVar2 = dVar4;
                    function6 = function12;
                    function7 = function13;
                    z4 = z7;
                    hmvVar2 = hmvVar4;
                    tmzVar2 = tmzVar4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    tmzVar2 = tmzVar;
                    function6 = function4;
                    function7 = function5;
                    z4 = z2;
                    hmvVar2 = hmvVar;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: x80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z80.b(op8Var, function0, dVar2, function6, function7, z4, hmvVar2, tmzVar2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            function5 = function3;
            i8 = i2 & 32;
            if (i8 != 0) {
                i10 = i3 | 196608;
                z2 = z;
            } else {
                z2 = z;
                if (bVarI.b(z2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i10 = i3 | i9;
            }
            i11 = 524288 | i10;
            i12 = i2 & 128;
            if (i12 != 0) {
                i14 = i10 | 13107200;
            } else {
                if (bVarI.M(tmzVar)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i14 = i11 | i13;
            }
            i15 = i14 | 100663296;
            if ((38347923 & i15) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i15 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    float f6 = cmv.a;
                    d68Var = (d68) bVarI.O(g68.a);
                    hmvVar3 = d68Var.h0;
                    if (hmvVar3 == null) {
                        hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                        d68Var.h0 = hmvVar3;
                    }
                    int i113 = i15 & (-3670017);
                    if (i12 != 0) {
                        tmzVar3 = cmv.b;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    dVar4 = dVar3;
                    i16 = i113;
                    hmvVar4 = hmvVar3;
                    tmzVar4 = tmzVar3;
                } else {
                    if (i17 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    float f7 = cmv.a;
                    d68Var = (d68) bVarI.O(g68.a);
                    hmvVar3 = d68Var.h0;
                    if (hmvVar3 == null) {
                        hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                        d68Var.h0 = hmvVar3;
                    }
                    int i114 = i15 & (-3670017);
                    if (i12 != 0) {
                        tmzVar3 = cmv.b;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    dVar4 = dVar3;
                    i16 = i114;
                    hmvVar4 = hmvVar3;
                    tmzVar4 = tmzVar3;
                }
                Function2 function14 = function4;
                Function2 function15 = function5;
                boolean z8 = z2;
                bVarI.Y();
                bVar = bVarI;
                tmv.b(op8Var, function0, dVar4, function14, function15, z8, hmvVar4, tmzVar4, bVar, i16 & 268435454);
                dVar2 = dVar4;
                function6 = function14;
                function7 = function15;
                z4 = z8;
                hmvVar2 = hmvVar4;
                tmzVar2 = tmzVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                tmzVar2 = tmzVar;
                function6 = function4;
                function7 = function5;
                z4 = z2;
                hmvVar2 = hmvVar;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: x80
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        z80.b(op8Var, function0, dVar2, function6, function7, z4, hmvVar2, tmzVar2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        dVar2 = dVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function4 = function2;
                if (bVarI.A(function4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function5 = function3;
                    if (bVarI.A(function5)) {
                        i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i10 = i3 | 196608;
                    z2 = z;
                } else {
                    z2 = z;
                    if (bVarI.b(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i10 = i3 | i9;
                }
                i11 = 524288 | i10;
                i12 = i2 & 128;
                if (i12 != 0) {
                    i14 = i10 | 13107200;
                } else {
                    if (bVarI.M(tmzVar)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i14 = i11 | i13;
                }
                i15 = i14 | 100663296;
                if ((38347923 & i15) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i15 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        float f8 = cmv.a;
                        d68Var = (d68) bVarI.O(g68.a);
                        hmvVar3 = d68Var.h0;
                        if (hmvVar3 == null) {
                            hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                            d68Var.h0 = hmvVar3;
                        }
                        int i115 = i15 & (-3670017);
                        if (i12 != 0) {
                            tmzVar3 = cmv.b;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        dVar4 = dVar3;
                        i16 = i115;
                        hmvVar4 = hmvVar3;
                        tmzVar4 = tmzVar3;
                    } else {
                        if (i17 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i4 != 0) {
                            function4 = null;
                        }
                        if (i6 != 0) {
                            function5 = null;
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        float f9 = cmv.a;
                        d68Var = (d68) bVarI.O(g68.a);
                        hmvVar3 = d68Var.h0;
                        if (hmvVar3 == null) {
                            hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                            d68Var.h0 = hmvVar3;
                        }
                        int i116 = i15 & (-3670017);
                        if (i12 != 0) {
                            tmzVar3 = cmv.b;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        dVar4 = dVar3;
                        i16 = i116;
                        hmvVar4 = hmvVar3;
                        tmzVar4 = tmzVar3;
                    }
                    Function2 function16 = function4;
                    Function2 function17 = function5;
                    boolean z9 = z2;
                    bVarI.Y();
                    bVar = bVarI;
                    tmv.b(op8Var, function0, dVar4, function16, function17, z9, hmvVar4, tmzVar4, bVar, i16 & 268435454);
                    dVar2 = dVar4;
                    function6 = function16;
                    function7 = function17;
                    z4 = z9;
                    hmvVar2 = hmvVar4;
                    tmzVar2 = tmzVar4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    tmzVar2 = tmzVar;
                    function6 = function4;
                    function7 = function5;
                    z4 = z2;
                    hmvVar2 = hmvVar;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: x80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z80.b(op8Var, function0, dVar2, function6, function7, z4, hmvVar2, tmzVar2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            function5 = function3;
            i8 = i2 & 32;
            if (i8 != 0) {
                i10 = i3 | 196608;
                z2 = z;
            } else {
                z2 = z;
                if (bVarI.b(z2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i10 = i3 | i9;
            }
            i11 = 524288 | i10;
            i12 = i2 & 128;
            if (i12 != 0) {
                i14 = i10 | 13107200;
            } else {
                if (bVarI.M(tmzVar)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i14 = i11 | i13;
            }
            i15 = i14 | 100663296;
            if ((38347923 & i15) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i15 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    float f10 = cmv.a;
                    d68Var = (d68) bVarI.O(g68.a);
                    hmvVar3 = d68Var.h0;
                    if (hmvVar3 == null) {
                        hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                        d68Var.h0 = hmvVar3;
                    }
                    int i117 = i15 & (-3670017);
                    if (i12 != 0) {
                        tmzVar3 = cmv.b;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    dVar4 = dVar3;
                    i16 = i117;
                    hmvVar4 = hmvVar3;
                    tmzVar4 = tmzVar3;
                } else {
                    if (i17 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    float f11 = cmv.a;
                    d68Var = (d68) bVarI.O(g68.a);
                    hmvVar3 = d68Var.h0;
                    if (hmvVar3 == null) {
                        hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                        d68Var.h0 = hmvVar3;
                    }
                    int i118 = i15 & (-3670017);
                    if (i12 != 0) {
                        tmzVar3 = cmv.b;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    dVar4 = dVar3;
                    i16 = i118;
                    hmvVar4 = hmvVar3;
                    tmzVar4 = tmzVar3;
                }
                Function2 function18 = function4;
                Function2 function19 = function5;
                boolean z10 = z2;
                bVarI.Y();
                bVar = bVarI;
                tmv.b(op8Var, function0, dVar4, function18, function19, z10, hmvVar4, tmzVar4, bVar, i16 & 268435454);
                dVar2 = dVar4;
                function6 = function18;
                function7 = function19;
                z4 = z10;
                hmvVar2 = hmvVar4;
                tmzVar2 = tmzVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                tmzVar2 = tmzVar;
                function6 = function4;
                function7 = function5;
                z4 = z2;
                hmvVar2 = hmvVar;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: x80
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        z80.b(op8Var, function0, dVar2, function6, function7, z4, hmvVar2, tmzVar2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        function4 = function2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                function5 = function3;
                if (bVarI.A(function5)) {
                    i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i10 = i3 | 196608;
                z2 = z;
            } else {
                z2 = z;
                if (bVarI.b(z2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i10 = i3 | i9;
            }
            i11 = 524288 | i10;
            i12 = i2 & 128;
            if (i12 != 0) {
                i14 = i10 | 13107200;
            } else {
                if (bVarI.M(tmzVar)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i14 = i11 | i13;
            }
            i15 = i14 | 100663296;
            if ((38347923 & i15) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i15 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    float f12 = cmv.a;
                    d68Var = (d68) bVarI.O(g68.a);
                    hmvVar3 = d68Var.h0;
                    if (hmvVar3 == null) {
                        hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                        d68Var.h0 = hmvVar3;
                    }
                    int i119 = i15 & (-3670017);
                    if (i12 != 0) {
                        tmzVar3 = cmv.b;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    dVar4 = dVar3;
                    i16 = i119;
                    hmvVar4 = hmvVar3;
                    tmzVar4 = tmzVar3;
                } else {
                    if (i17 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    }
                    if (i6 != 0) {
                        function5 = null;
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    float f13 = cmv.a;
                    d68Var = (d68) bVarI.O(g68.a);
                    hmvVar3 = d68Var.h0;
                    if (hmvVar3 == null) {
                        hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                        d68Var.h0 = hmvVar3;
                    }
                    int i1110 = i15 & (-3670017);
                    if (i12 != 0) {
                        tmzVar3 = cmv.b;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    dVar4 = dVar3;
                    i16 = i1110;
                    hmvVar4 = hmvVar3;
                    tmzVar4 = tmzVar3;
                }
                Function2 function110 = function4;
                Function2 function111 = function5;
                boolean z11 = z2;
                bVarI.Y();
                bVar = bVarI;
                tmv.b(op8Var, function0, dVar4, function110, function111, z11, hmvVar4, tmzVar4, bVar, i16 & 268435454);
                dVar2 = dVar4;
                function6 = function110;
                function7 = function111;
                z4 = z11;
                hmvVar2 = hmvVar4;
                tmzVar2 = tmzVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                tmzVar2 = tmzVar;
                function6 = function4;
                function7 = function5;
                z4 = z2;
                hmvVar2 = hmvVar;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: x80
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        z80.b(op8Var, function0, dVar2, function6, function7, z4, hmvVar2, tmzVar2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 24576;
        function5 = function3;
        i8 = i2 & 32;
        if (i8 != 0) {
            i10 = i3 | 196608;
            z2 = z;
        } else {
            z2 = z;
            if (bVarI.b(z2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i10 = i3 | i9;
        }
        i11 = 524288 | i10;
        i12 = i2 & 128;
        if (i12 != 0) {
            i14 = i10 | 13107200;
        } else {
            if (bVarI.M(tmzVar)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i14 = i11 | i13;
        }
        i15 = i14 | 100663296;
        if ((38347923 & i15) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i15 & 1, z3)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 != 0) {
                    function5 = null;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                float f14 = cmv.a;
                d68Var = (d68) bVarI.O(g68.a);
                hmvVar3 = d68Var.h0;
                if (hmvVar3 == null) {
                    hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                    d68Var.h0 = hmvVar3;
                }
                int i1111 = i15 & (-3670017);
                if (i12 != 0) {
                    tmzVar3 = cmv.b;
                } else {
                    tmzVar3 = tmzVar;
                }
                dVar4 = dVar3;
                i16 = i1111;
                hmvVar4 = hmvVar3;
                tmzVar4 = tmzVar3;
            } else {
                if (i17 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i4 != 0) {
                    function4 = null;
                }
                if (i6 != 0) {
                    function5 = null;
                }
                if (i8 != 0) {
                    z2 = true;
                }
                float f15 = cmv.a;
                d68Var = (d68) bVarI.O(g68.a);
                hmvVar3 = d68Var.h0;
                if (hmvVar3 == null) {
                    hmvVar3 = new hmv(g68.c(d68Var, mis.g), g68.c(d68Var, mis.h), g68.c(d68Var, mis.j), j58.c(mis.b, g68.c(d68Var, mis.a)), j58.c(mis.d, g68.c(d68Var, mis.c)), j58.c(mis.f, g68.c(d68Var, mis.e)));
                    d68Var.h0 = hmvVar3;
                }
                int i1112 = i15 & (-3670017);
                if (i12 != 0) {
                    tmzVar3 = cmv.b;
                } else {
                    tmzVar3 = tmzVar;
                }
                dVar4 = dVar3;
                i16 = i1112;
                hmvVar4 = hmvVar3;
                tmzVar4 = tmzVar3;
            }
            Function2 function112 = function4;
            Function2 function113 = function5;
            boolean z12 = z2;
            bVarI.Y();
            bVar = bVarI;
            tmv.b(op8Var, function0, dVar4, function112, function113, z12, hmvVar4, tmzVar4, bVar, i16 & 268435454);
            dVar2 = dVar4;
            function6 = function112;
            function7 = function113;
            z4 = z12;
            hmvVar2 = hmvVar4;
            tmzVar2 = tmzVar4;
        } else {
            bVar = bVarI;
            bVar.G();
            tmzVar2 = tmzVar;
            function6 = function4;
            function7 = function5;
            z4 = z2;
            hmvVar2 = hmvVar;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: x80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z80.b(op8Var, function0, dVar2, function6, function7, z4, hmvVar2, tmzVar2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
