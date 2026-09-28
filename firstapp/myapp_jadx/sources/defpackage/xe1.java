package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.j;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class xe1 {
    /* JADX WARN: Code duplicated, block: B:101:0x0149  */
    /* JADX WARN: Code duplicated, block: B:104:0x0159  */
    /* JADX WARN: Code duplicated, block: B:107:0x016e  */
    /* JADX WARN: Code duplicated, block: B:110:0x018c  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:119:0x0210  */
    /* JADX WARN: Code duplicated, block: B:122:0x0228  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0115  */
    /* JADX WARN: Code duplicated, block: B:87:0x0118  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x011e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:0x0125  */
    /* JADX WARN: Code duplicated, block: B:96:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    public static final void a(final String str, final m9i m9iVar, d dVar, long j, long j2, gdf0 gdf0Var, long j3, int i, boolean z, final int i2, imf0 imf0Var, a aVar, final int i3, final int i4, final int i5) {
        int i6;
        d dVar2;
        int i7;
        long j4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z2;
        b bVar;
        final boolean z3;
        final imf0 imf0Var2;
        final d dVar3;
        final long j5;
        final gdf0 gdf0Var2;
        final long j6;
        final int i17;
        final long j7;
        e eVarZ;
        long j8;
        gdf0 gdf0Var3;
        imf0 imf0Var3;
        int i18;
        long j9;
        long j10;
        boolean z4;
        boolean z5;
        long j11;
        Object objY;
        a.C0041a.C0042a c0042a;
        final isw iswVar;
        Object objY2;
        final ytw ytwVar;
        Object objY3;
        boolean z6;
        Object objY4;
        str.getClass();
        m9iVar.getClass();
        b bVarI = aVar.i(524217876);
        if ((i3 & 6) == 0) {
            i6 = (bVarI.M(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= bVarI.M(m9iVar) ? 32 : 16;
        }
        int i19 = i5 & 4;
        if (i19 == 0) {
            if ((i3 & 384) == 0) {
                dVar2 = dVar;
                i6 |= bVarI.M(dVar2) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 != 0) {
                if ((i3 & 3072) == 0) {
                    j4 = j;
                    if (bVarI.e(j4)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i6 |= i8;
                }
                i9 = 115040256 | i6;
                i10 = i5 & 512;
                if (i10 != 0) {
                    if ((805306368 & i3) == 0) {
                        if (bVarI.M(gdf0Var)) {
                            i11 = 536870912;
                        } else {
                            i11 = 268435456;
                        }
                        i9 |= i11;
                    }
                    i12 = i4 | 6;
                    i13 = i5 & 2048;
                    if (i13 != 0) {
                        i12 = 3126;
                        i14 = i;
                    } else {
                        i14 = i;
                        if ((i4 & 48) == 0) {
                            if (bVarI.d(i14)) {
                                i15 = 32;
                            } else {
                                i15 = 16;
                            }
                            i12 |= i15;
                        }
                    }
                    i16 = i12 | 384 | (((i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 || !bVarI.M(imf0Var)) ? 8192 : Http2.INITIAL_MAX_FRAME_SIZE);
                    if ((i9 & 306783379) == 306783378 || (i16 & 9363) != 9362) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bVarI.q(i9 & 1, z2)) {
                        bVarI.A0();
                        if ((i3 & 1) != 0 || bVarI.h0()) {
                            if (i19 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i7 != 0) {
                                j8 = j58.m;
                            } else {
                                j8 = j4;
                            }
                            long j12 = omf0.c;
                            if (i10 != 0) {
                                gdf0Var3 = null;
                            } else {
                                gdf0Var3 = gdf0Var;
                            }
                            if (i13 != 0) {
                                i14 = 1;
                            }
                            if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                i16 &= -57345;
                                imf0Var3 = (imf0) bVarI.O(lkf0.a);
                            } else {
                                imf0Var3 = imf0Var;
                            }
                            i18 = i14;
                            j9 = j12;
                            j10 = j9;
                            z4 = true;
                            z5 = true;
                            j11 = j8;
                        } else {
                            bVarI.G();
                            if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                i16 &= -57345;
                            }
                            j9 = j2;
                            gdf0Var3 = gdf0Var;
                            j10 = j3;
                            z5 = z;
                            imf0Var3 = imf0Var;
                            i18 = i14;
                            dVar3 = dVar2;
                            z4 = true;
                            j11 = j4;
                        }
                        bVarI.Y();
                        objY = bVarI.y();
                        c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = j.a(omf0.c(m9iVar.b));
                            bVarI.r(objY);
                        }
                        iswVar = (isw) objY;
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = m.b(Boolean.FALSE);
                            bVarI.r(objY2);
                        }
                        ytwVar = (ytw) objY2;
                        long jG = d2l.g(iswVar.j(), 4294967296L);
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new Function1() { // from class: oe1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    lza lzaVar = (lza) obj;
                                    lzaVar.getClass();
                                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                                        lzaVar.b2();
                                    }
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY3);
                        }
                        d dVarC = androidx.compose.ui.draw.a.c(dVar3, (Function1) objY3);
                        z6 = (i9 & 112) == 32 ? z4 : false;
                        objY4 = bVarI.y();
                        if (z6 || objY4 == c0042a) {
                            objY4 = new Function1() { // from class: qe1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ukf0 ukf0Var = (ukf0) obj;
                                    ukf0Var.getClass();
                                    boolean zD = ukf0Var.d();
                                    ytw ytwVar2 = ytwVar;
                                    if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                        ytwVar2.setValue(Boolean.TRUE);
                                    } else {
                                        isw iswVar2 = iswVar;
                                        float fJ = iswVar2.j();
                                        m9i m9iVar2 = m9iVar;
                                        long j13 = m9iVar2.c;
                                        long j14 = m9iVar2.a;
                                        float fC = fJ - omf0.c(j13);
                                        if (fC <= omf0.c(j14)) {
                                            iswVar2.A(omf0.c(j14));
                                            ytwVar2.setValue(Boolean.TRUE);
                                        } else {
                                            iswVar2.A(fC);
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY4);
                        }
                        int i20 = i9 << 3;
                        bVar = bVarI;
                        lkf0.d(str, dVarC, j11, null, jG, null, null, null, j9, null, gdf0Var3, j10, i18, z5, i2, 0, (Function1) objY4, imf0Var3, bVar, (i9 & 14) | ((i9 >> 3) & 896) | (458752 & i20) | (3670016 & i20) | (i20 & 29360128) | (234881024 & i20) | (i20 & 1879048192), ((i9 >> 27) & 14) | 48 | ((i16 << 3) & 896) | 27648 | ((i16 << 9) & 29360128), 32776);
                        j5 = j11;
                        j7 = j9;
                        gdf0Var2 = gdf0Var3;
                        j6 = j10;
                        i17 = i18;
                        z3 = z5;
                        imf0Var2 = imf0Var3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        z3 = z;
                        imf0Var2 = imf0Var;
                        dVar3 = dVar2;
                        j5 = j4;
                        gdf0Var2 = gdf0Var;
                        j6 = j3;
                        i17 = i14;
                        j7 = j2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: se1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i3 | 1);
                                int iA2 = qj40.a(i4);
                                xe1.a(str, m9iVar, dVar3, j5, j7, gdf0Var2, j6, i17, z3, i2, imf0Var2, (a) obj, iA, iA2, i5);
                                return Unit.a;
                            }
                        };
                    }
                }
                i9 = 920346624 | i6;
                i12 = i4 | 6;
                i13 = i5 & 2048;
                if (i13 != 0) {
                    i12 = 3126;
                    i14 = i;
                } else {
                    i14 = i;
                    if ((i4 & 48) == 0) {
                        if (bVarI.d(i14)) {
                            i15 = 32;
                        } else {
                            i15 = 16;
                        }
                        i12 |= i15;
                    }
                }
                i16 = i12 | 384 | (((i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 || !bVarI.M(imf0Var)) ? 8192 : Http2.INITIAL_MAX_FRAME_SIZE);
                if ((i9 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (bVarI.q(i9 & 1, z2)) {
                    bVarI.A0();
                    if ((i3 & 1) != 0) {
                        if (i19 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i7 != 0) {
                            j8 = j58.m;
                        } else {
                            j8 = j4;
                        }
                        long j13 = omf0.c;
                        if (i10 != 0) {
                            gdf0Var3 = null;
                        } else {
                            gdf0Var3 = gdf0Var;
                        }
                        if (i13 != 0) {
                            i14 = 1;
                        }
                        if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            i16 &= -57345;
                            imf0Var3 = (imf0) bVarI.O(lkf0.a);
                        } else {
                            imf0Var3 = imf0Var;
                        }
                        i18 = i14;
                        j9 = j13;
                        j10 = j9;
                        z4 = true;
                        z5 = true;
                        j11 = j8;
                    } else {
                        if (i19 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i7 != 0) {
                            j8 = j58.m;
                        } else {
                            j8 = j4;
                        }
                        long j14 = omf0.c;
                        if (i10 != 0) {
                            gdf0Var3 = null;
                        } else {
                            gdf0Var3 = gdf0Var;
                        }
                        if (i13 != 0) {
                            i14 = 1;
                        }
                        if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            i16 &= -57345;
                            imf0Var3 = (imf0) bVarI.O(lkf0.a);
                        } else {
                            imf0Var3 = imf0Var;
                        }
                        i18 = i14;
                        j9 = j14;
                        j10 = j9;
                        z4 = true;
                        z5 = true;
                        j11 = j8;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = j.a(omf0.c(m9iVar.b));
                        bVarI.r(objY);
                    }
                    iswVar = (isw) objY;
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = m.b(Boolean.FALSE);
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    long jG2 = d2l.g(iswVar.j(), 4294967296L);
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new Function1() { // from class: oe1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                lza lzaVar = (lza) obj;
                                lzaVar.getClass();
                                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                                    lzaVar.b2();
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY3);
                    }
                    d dVarC2 = androidx.compose.ui.draw.a.c(dVar3, (Function1) objY3);
                    if ((i9 & 112) == 32) {
                    }
                    objY4 = bVarI.y();
                    if (z6) {
                        objY4 = new Function1() { // from class: qe1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ukf0 ukf0Var = (ukf0) obj;
                                ukf0Var.getClass();
                                boolean zD = ukf0Var.d();
                                ytw ytwVar2 = ytwVar;
                                if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    ytwVar2.setValue(Boolean.TRUE);
                                } else {
                                    isw iswVar2 = iswVar;
                                    float fJ = iswVar2.j();
                                    m9i m9iVar2 = m9iVar;
                                    long j15 = m9iVar2.c;
                                    long j16 = m9iVar2.a;
                                    float fC = fJ - omf0.c(j15);
                                    if (fC <= omf0.c(j16)) {
                                        iswVar2.A(omf0.c(j16));
                                        ytwVar2.setValue(Boolean.TRUE);
                                    } else {
                                        iswVar2.A(fC);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    } else {
                        objY4 = new Function1() { // from class: qe1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ukf0 ukf0Var = (ukf0) obj;
                                ukf0Var.getClass();
                                boolean zD = ukf0Var.d();
                                ytw ytwVar2 = ytwVar;
                                if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    ytwVar2.setValue(Boolean.TRUE);
                                } else {
                                    isw iswVar2 = iswVar;
                                    float fJ = iswVar2.j();
                                    m9i m9iVar2 = m9iVar;
                                    long j15 = m9iVar2.c;
                                    long j16 = m9iVar2.a;
                                    float fC = fJ - omf0.c(j15);
                                    if (fC <= omf0.c(j16)) {
                                        iswVar2.A(omf0.c(j16));
                                        ytwVar2.setValue(Boolean.TRUE);
                                    } else {
                                        iswVar2.A(fC);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    }
                    int i21 = i9 << 3;
                    bVar = bVarI;
                    lkf0.d(str, dVarC2, j11, null, jG2, null, null, null, j9, null, gdf0Var3, j10, i18, z5, i2, 0, (Function1) objY4, imf0Var3, bVar, (i9 & 14) | ((i9 >> 3) & 896) | (458752 & i21) | (3670016 & i21) | (i21 & 29360128) | (234881024 & i21) | (i21 & 1879048192), ((i9 >> 27) & 14) | 48 | ((i16 << 3) & 896) | 27648 | ((i16 << 9) & 29360128), 32776);
                    j5 = j11;
                    j7 = j9;
                    gdf0Var2 = gdf0Var3;
                    j6 = j10;
                    i17 = i18;
                    z3 = z5;
                    imf0Var2 = imf0Var3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    z3 = z;
                    imf0Var2 = imf0Var;
                    dVar3 = dVar2;
                    j5 = j4;
                    gdf0Var2 = gdf0Var;
                    j6 = j3;
                    i17 = i14;
                    j7 = j2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: se1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i3 | 1);
                            int iA2 = qj40.a(i4);
                            xe1.a(str, m9iVar, dVar3, j5, j7, gdf0Var2, j6, i17, z3, i2, imf0Var2, (a) obj, iA, iA2, i5);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 3072;
            j4 = j;
            i9 = 115040256 | i6;
            i10 = i5 & 512;
            if (i10 != 0) {
                if ((805306368 & i3) == 0) {
                    if (bVarI.M(gdf0Var)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i9 |= i11;
                }
                i12 = i4 | 6;
                i13 = i5 & 2048;
                if (i13 != 0) {
                    i12 = 3126;
                    i14 = i;
                } else {
                    i14 = i;
                    if ((i4 & 48) == 0) {
                        if (bVarI.d(i14)) {
                            i15 = 32;
                        } else {
                            i15 = 16;
                        }
                        i12 |= i15;
                    }
                }
                i16 = i12 | 384 | (((i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 || !bVarI.M(imf0Var)) ? 8192 : Http2.INITIAL_MAX_FRAME_SIZE);
                if ((i9 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (bVarI.q(i9 & 1, z2)) {
                    bVarI.A0();
                    if ((i3 & 1) != 0) {
                        if (i19 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i7 != 0) {
                            j8 = j58.m;
                        } else {
                            j8 = j4;
                        }
                        long j15 = omf0.c;
                        if (i10 != 0) {
                            gdf0Var3 = null;
                        } else {
                            gdf0Var3 = gdf0Var;
                        }
                        if (i13 != 0) {
                            i14 = 1;
                        }
                        if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            i16 &= -57345;
                            imf0Var3 = (imf0) bVarI.O(lkf0.a);
                        } else {
                            imf0Var3 = imf0Var;
                        }
                        i18 = i14;
                        j9 = j15;
                        j10 = j9;
                        z4 = true;
                        z5 = true;
                        j11 = j8;
                    } else {
                        if (i19 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i7 != 0) {
                            j8 = j58.m;
                        } else {
                            j8 = j4;
                        }
                        long j16 = omf0.c;
                        if (i10 != 0) {
                            gdf0Var3 = null;
                        } else {
                            gdf0Var3 = gdf0Var;
                        }
                        if (i13 != 0) {
                            i14 = 1;
                        }
                        if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            i16 &= -57345;
                            imf0Var3 = (imf0) bVarI.O(lkf0.a);
                        } else {
                            imf0Var3 = imf0Var;
                        }
                        i18 = i14;
                        j9 = j16;
                        j10 = j9;
                        z4 = true;
                        z5 = true;
                        j11 = j8;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = j.a(omf0.c(m9iVar.b));
                        bVarI.r(objY);
                    }
                    iswVar = (isw) objY;
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = m.b(Boolean.FALSE);
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    long jG3 = d2l.g(iswVar.j(), 4294967296L);
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new Function1() { // from class: oe1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                lza lzaVar = (lza) obj;
                                lzaVar.getClass();
                                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                                    lzaVar.b2();
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY3);
                    }
                    d dVarC3 = androidx.compose.ui.draw.a.c(dVar3, (Function1) objY3);
                    if ((i9 & 112) == 32) {
                    }
                    objY4 = bVarI.y();
                    if (z6) {
                        objY4 = new Function1() { // from class: qe1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ukf0 ukf0Var = (ukf0) obj;
                                ukf0Var.getClass();
                                boolean zD = ukf0Var.d();
                                ytw ytwVar2 = ytwVar;
                                if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    ytwVar2.setValue(Boolean.TRUE);
                                } else {
                                    isw iswVar2 = iswVar;
                                    float fJ = iswVar2.j();
                                    m9i m9iVar2 = m9iVar;
                                    long j17 = m9iVar2.c;
                                    long j18 = m9iVar2.a;
                                    float fC = fJ - omf0.c(j17);
                                    if (fC <= omf0.c(j18)) {
                                        iswVar2.A(omf0.c(j18));
                                        ytwVar2.setValue(Boolean.TRUE);
                                    } else {
                                        iswVar2.A(fC);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    } else {
                        objY4 = new Function1() { // from class: qe1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ukf0 ukf0Var = (ukf0) obj;
                                ukf0Var.getClass();
                                boolean zD = ukf0Var.d();
                                ytw ytwVar2 = ytwVar;
                                if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    ytwVar2.setValue(Boolean.TRUE);
                                } else {
                                    isw iswVar2 = iswVar;
                                    float fJ = iswVar2.j();
                                    m9i m9iVar2 = m9iVar;
                                    long j17 = m9iVar2.c;
                                    long j18 = m9iVar2.a;
                                    float fC = fJ - omf0.c(j17);
                                    if (fC <= omf0.c(j18)) {
                                        iswVar2.A(omf0.c(j18));
                                        ytwVar2.setValue(Boolean.TRUE);
                                    } else {
                                        iswVar2.A(fC);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    }
                    int i22 = i9 << 3;
                    bVar = bVarI;
                    lkf0.d(str, dVarC3, j11, null, jG3, null, null, null, j9, null, gdf0Var3, j10, i18, z5, i2, 0, (Function1) objY4, imf0Var3, bVar, (i9 & 14) | ((i9 >> 3) & 896) | (458752 & i22) | (3670016 & i22) | (i22 & 29360128) | (234881024 & i22) | (i22 & 1879048192), ((i9 >> 27) & 14) | 48 | ((i16 << 3) & 896) | 27648 | ((i16 << 9) & 29360128), 32776);
                    j5 = j11;
                    j7 = j9;
                    gdf0Var2 = gdf0Var3;
                    j6 = j10;
                    i17 = i18;
                    z3 = z5;
                    imf0Var2 = imf0Var3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    z3 = z;
                    imf0Var2 = imf0Var;
                    dVar3 = dVar2;
                    j5 = j4;
                    gdf0Var2 = gdf0Var;
                    j6 = j3;
                    i17 = i14;
                    j7 = j2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: se1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i3 | 1);
                            int iA2 = qj40.a(i4);
                            xe1.a(str, m9iVar, dVar3, j5, j7, gdf0Var2, j6, i17, z3, i2, imf0Var2, (a) obj, iA, iA2, i5);
                            return Unit.a;
                        }
                    };
                }
            }
            i9 = 920346624 | i6;
            i12 = i4 | 6;
            i13 = i5 & 2048;
            if (i13 != 0) {
                i12 = 3126;
                i14 = i;
            } else {
                i14 = i;
                if ((i4 & 48) == 0) {
                    if (bVarI.d(i14)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i12 |= i15;
                }
            }
            i16 = i12 | 384 | (((i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 || !bVarI.M(imf0Var)) ? 8192 : Http2.INITIAL_MAX_FRAME_SIZE);
            if ((i9 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (bVarI.q(i9 & 1, z2)) {
                bVarI.A0();
                if ((i3 & 1) != 0) {
                    if (i19 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i7 != 0) {
                        j8 = j58.m;
                    } else {
                        j8 = j4;
                    }
                    long j17 = omf0.c;
                    if (i10 != 0) {
                        gdf0Var3 = null;
                    } else {
                        gdf0Var3 = gdf0Var;
                    }
                    if (i13 != 0) {
                        i14 = 1;
                    }
                    if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        i16 &= -57345;
                        imf0Var3 = (imf0) bVarI.O(lkf0.a);
                    } else {
                        imf0Var3 = imf0Var;
                    }
                    i18 = i14;
                    j9 = j17;
                    j10 = j9;
                    z4 = true;
                    z5 = true;
                    j11 = j8;
                } else {
                    if (i19 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i7 != 0) {
                        j8 = j58.m;
                    } else {
                        j8 = j4;
                    }
                    long j18 = omf0.c;
                    if (i10 != 0) {
                        gdf0Var3 = null;
                    } else {
                        gdf0Var3 = gdf0Var;
                    }
                    if (i13 != 0) {
                        i14 = 1;
                    }
                    if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        i16 &= -57345;
                        imf0Var3 = (imf0) bVarI.O(lkf0.a);
                    } else {
                        imf0Var3 = imf0Var;
                    }
                    i18 = i14;
                    j9 = j18;
                    j10 = j9;
                    z4 = true;
                    z5 = true;
                    j11 = j8;
                }
                bVarI.Y();
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = j.a(omf0.c(m9iVar.b));
                    bVarI.r(objY);
                }
                iswVar = (isw) objY;
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = m.b(Boolean.FALSE);
                    bVarI.r(objY2);
                }
                ytwVar = (ytw) objY2;
                long jG4 = d2l.g(iswVar.j(), 4294967296L);
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new Function1() { // from class: oe1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            lza lzaVar = (lza) obj;
                            lzaVar.getClass();
                            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                                lzaVar.b2();
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                d dVarC4 = androidx.compose.ui.draw.a.c(dVar3, (Function1) objY3);
                if ((i9 & 112) == 32) {
                }
                objY4 = bVarI.y();
                if (z6) {
                    objY4 = new Function1() { // from class: qe1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ukf0 ukf0Var = (ukf0) obj;
                            ukf0Var.getClass();
                            boolean zD = ukf0Var.d();
                            ytw ytwVar2 = ytwVar;
                            if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                ytwVar2.setValue(Boolean.TRUE);
                            } else {
                                isw iswVar2 = iswVar;
                                float fJ = iswVar2.j();
                                m9i m9iVar2 = m9iVar;
                                long j19 = m9iVar2.c;
                                long j110 = m9iVar2.a;
                                float fC = fJ - omf0.c(j19);
                                if (fC <= omf0.c(j110)) {
                                    iswVar2.A(omf0.c(j110));
                                    ytwVar2.setValue(Boolean.TRUE);
                                } else {
                                    iswVar2.A(fC);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                } else {
                    objY4 = new Function1() { // from class: qe1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ukf0 ukf0Var = (ukf0) obj;
                            ukf0Var.getClass();
                            boolean zD = ukf0Var.d();
                            ytw ytwVar2 = ytwVar;
                            if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                ytwVar2.setValue(Boolean.TRUE);
                            } else {
                                isw iswVar2 = iswVar;
                                float fJ = iswVar2.j();
                                m9i m9iVar2 = m9iVar;
                                long j19 = m9iVar2.c;
                                long j110 = m9iVar2.a;
                                float fC = fJ - omf0.c(j19);
                                if (fC <= omf0.c(j110)) {
                                    iswVar2.A(omf0.c(j110));
                                    ytwVar2.setValue(Boolean.TRUE);
                                } else {
                                    iswVar2.A(fC);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                int i23 = i9 << 3;
                bVar = bVarI;
                lkf0.d(str, dVarC4, j11, null, jG4, null, null, null, j9, null, gdf0Var3, j10, i18, z5, i2, 0, (Function1) objY4, imf0Var3, bVar, (i9 & 14) | ((i9 >> 3) & 896) | (458752 & i23) | (3670016 & i23) | (i23 & 29360128) | (234881024 & i23) | (i23 & 1879048192), ((i9 >> 27) & 14) | 48 | ((i16 << 3) & 896) | 27648 | ((i16 << 9) & 29360128), 32776);
                j5 = j11;
                j7 = j9;
                gdf0Var2 = gdf0Var3;
                j6 = j10;
                i17 = i18;
                z3 = z5;
                imf0Var2 = imf0Var3;
            } else {
                bVar = bVarI;
                bVar.G();
                z3 = z;
                imf0Var2 = imf0Var;
                dVar3 = dVar2;
                j5 = j4;
                gdf0Var2 = gdf0Var;
                j6 = j3;
                i17 = i14;
                j7 = j2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: se1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i3 | 1);
                        int iA2 = qj40.a(i4);
                        xe1.a(str, m9iVar, dVar3, j5, j7, gdf0Var2, j6, i17, z3, i2, imf0Var2, (a) obj, iA, iA2, i5);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 384;
        dVar2 = dVar;
        i7 = i5 & 8;
        if (i7 != 0) {
            if ((i3 & 3072) == 0) {
                j4 = j;
                if (bVarI.e(j4)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i6 |= i8;
            }
            i9 = 115040256 | i6;
            i10 = i5 & 512;
            if (i10 != 0) {
                if ((805306368 & i3) == 0) {
                    if (bVarI.M(gdf0Var)) {
                        i11 = 536870912;
                    } else {
                        i11 = 268435456;
                    }
                    i9 |= i11;
                }
                i12 = i4 | 6;
                i13 = i5 & 2048;
                if (i13 != 0) {
                    i12 = 3126;
                    i14 = i;
                } else {
                    i14 = i;
                    if ((i4 & 48) == 0) {
                        if (bVarI.d(i14)) {
                            i15 = 32;
                        } else {
                            i15 = 16;
                        }
                        i12 |= i15;
                    }
                }
                i16 = i12 | 384 | (((i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 || !bVarI.M(imf0Var)) ? 8192 : Http2.INITIAL_MAX_FRAME_SIZE);
                if ((i9 & 306783379) == 306783378) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (bVarI.q(i9 & 1, z2)) {
                    bVarI.A0();
                    if ((i3 & 1) != 0) {
                        if (i19 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i7 != 0) {
                            j8 = j58.m;
                        } else {
                            j8 = j4;
                        }
                        long j19 = omf0.c;
                        if (i10 != 0) {
                            gdf0Var3 = null;
                        } else {
                            gdf0Var3 = gdf0Var;
                        }
                        if (i13 != 0) {
                            i14 = 1;
                        }
                        if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            i16 &= -57345;
                            imf0Var3 = (imf0) bVarI.O(lkf0.a);
                        } else {
                            imf0Var3 = imf0Var;
                        }
                        i18 = i14;
                        j9 = j19;
                        j10 = j9;
                        z4 = true;
                        z5 = true;
                        j11 = j8;
                    } else {
                        if (i19 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i7 != 0) {
                            j8 = j58.m;
                        } else {
                            j8 = j4;
                        }
                        long j110 = omf0.c;
                        if (i10 != 0) {
                            gdf0Var3 = null;
                        } else {
                            gdf0Var3 = gdf0Var;
                        }
                        if (i13 != 0) {
                            i14 = 1;
                        }
                        if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            i16 &= -57345;
                            imf0Var3 = (imf0) bVarI.O(lkf0.a);
                        } else {
                            imf0Var3 = imf0Var;
                        }
                        i18 = i14;
                        j9 = j110;
                        j10 = j9;
                        z4 = true;
                        z5 = true;
                        j11 = j8;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = j.a(omf0.c(m9iVar.b));
                        bVarI.r(objY);
                    }
                    iswVar = (isw) objY;
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = m.b(Boolean.FALSE);
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    long jG5 = d2l.g(iswVar.j(), 4294967296L);
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new Function1() { // from class: oe1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                lza lzaVar = (lza) obj;
                                lzaVar.getClass();
                                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                                    lzaVar.b2();
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY3);
                    }
                    d dVarC5 = androidx.compose.ui.draw.a.c(dVar3, (Function1) objY3);
                    if ((i9 & 112) == 32) {
                    }
                    objY4 = bVarI.y();
                    if (z6) {
                        objY4 = new Function1() { // from class: qe1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ukf0 ukf0Var = (ukf0) obj;
                                ukf0Var.getClass();
                                boolean zD = ukf0Var.d();
                                ytw ytwVar2 = ytwVar;
                                if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    ytwVar2.setValue(Boolean.TRUE);
                                } else {
                                    isw iswVar2 = iswVar;
                                    float fJ = iswVar2.j();
                                    m9i m9iVar2 = m9iVar;
                                    long j111 = m9iVar2.c;
                                    long j112 = m9iVar2.a;
                                    float fC = fJ - omf0.c(j111);
                                    if (fC <= omf0.c(j112)) {
                                        iswVar2.A(omf0.c(j112));
                                        ytwVar2.setValue(Boolean.TRUE);
                                    } else {
                                        iswVar2.A(fC);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    } else {
                        objY4 = new Function1() { // from class: qe1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ukf0 ukf0Var = (ukf0) obj;
                                ukf0Var.getClass();
                                boolean zD = ukf0Var.d();
                                ytw ytwVar2 = ytwVar;
                                if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    ytwVar2.setValue(Boolean.TRUE);
                                } else {
                                    isw iswVar2 = iswVar;
                                    float fJ = iswVar2.j();
                                    m9i m9iVar2 = m9iVar;
                                    long j111 = m9iVar2.c;
                                    long j112 = m9iVar2.a;
                                    float fC = fJ - omf0.c(j111);
                                    if (fC <= omf0.c(j112)) {
                                        iswVar2.A(omf0.c(j112));
                                        ytwVar2.setValue(Boolean.TRUE);
                                    } else {
                                        iswVar2.A(fC);
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    }
                    int i24 = i9 << 3;
                    bVar = bVarI;
                    lkf0.d(str, dVarC5, j11, null, jG5, null, null, null, j9, null, gdf0Var3, j10, i18, z5, i2, 0, (Function1) objY4, imf0Var3, bVar, (i9 & 14) | ((i9 >> 3) & 896) | (458752 & i24) | (3670016 & i24) | (i24 & 29360128) | (234881024 & i24) | (i24 & 1879048192), ((i9 >> 27) & 14) | 48 | ((i16 << 3) & 896) | 27648 | ((i16 << 9) & 29360128), 32776);
                    j5 = j11;
                    j7 = j9;
                    gdf0Var2 = gdf0Var3;
                    j6 = j10;
                    i17 = i18;
                    z3 = z5;
                    imf0Var2 = imf0Var3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    z3 = z;
                    imf0Var2 = imf0Var;
                    dVar3 = dVar2;
                    j5 = j4;
                    gdf0Var2 = gdf0Var;
                    j6 = j3;
                    i17 = i14;
                    j7 = j2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: se1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i3 | 1);
                            int iA2 = qj40.a(i4);
                            xe1.a(str, m9iVar, dVar3, j5, j7, gdf0Var2, j6, i17, z3, i2, imf0Var2, (a) obj, iA, iA2, i5);
                            return Unit.a;
                        }
                    };
                }
            }
            i9 = 920346624 | i6;
            i12 = i4 | 6;
            i13 = i5 & 2048;
            if (i13 != 0) {
                i12 = 3126;
                i14 = i;
            } else {
                i14 = i;
                if ((i4 & 48) == 0) {
                    if (bVarI.d(i14)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i12 |= i15;
                }
            }
            i16 = i12 | 384 | (((i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 || !bVarI.M(imf0Var)) ? 8192 : Http2.INITIAL_MAX_FRAME_SIZE);
            if ((i9 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (bVarI.q(i9 & 1, z2)) {
                bVarI.A0();
                if ((i3 & 1) != 0) {
                    if (i19 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i7 != 0) {
                        j8 = j58.m;
                    } else {
                        j8 = j4;
                    }
                    long j111 = omf0.c;
                    if (i10 != 0) {
                        gdf0Var3 = null;
                    } else {
                        gdf0Var3 = gdf0Var;
                    }
                    if (i13 != 0) {
                        i14 = 1;
                    }
                    if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        i16 &= -57345;
                        imf0Var3 = (imf0) bVarI.O(lkf0.a);
                    } else {
                        imf0Var3 = imf0Var;
                    }
                    i18 = i14;
                    j9 = j111;
                    j10 = j9;
                    z4 = true;
                    z5 = true;
                    j11 = j8;
                } else {
                    if (i19 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i7 != 0) {
                        j8 = j58.m;
                    } else {
                        j8 = j4;
                    }
                    long j112 = omf0.c;
                    if (i10 != 0) {
                        gdf0Var3 = null;
                    } else {
                        gdf0Var3 = gdf0Var;
                    }
                    if (i13 != 0) {
                        i14 = 1;
                    }
                    if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        i16 &= -57345;
                        imf0Var3 = (imf0) bVarI.O(lkf0.a);
                    } else {
                        imf0Var3 = imf0Var;
                    }
                    i18 = i14;
                    j9 = j112;
                    j10 = j9;
                    z4 = true;
                    z5 = true;
                    j11 = j8;
                }
                bVarI.Y();
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = j.a(omf0.c(m9iVar.b));
                    bVarI.r(objY);
                }
                iswVar = (isw) objY;
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = m.b(Boolean.FALSE);
                    bVarI.r(objY2);
                }
                ytwVar = (ytw) objY2;
                long jG6 = d2l.g(iswVar.j(), 4294967296L);
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new Function1() { // from class: oe1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            lza lzaVar = (lza) obj;
                            lzaVar.getClass();
                            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                                lzaVar.b2();
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                d dVarC6 = androidx.compose.ui.draw.a.c(dVar3, (Function1) objY3);
                if ((i9 & 112) == 32) {
                }
                objY4 = bVarI.y();
                if (z6) {
                    objY4 = new Function1() { // from class: qe1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ukf0 ukf0Var = (ukf0) obj;
                            ukf0Var.getClass();
                            boolean zD = ukf0Var.d();
                            ytw ytwVar2 = ytwVar;
                            if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                ytwVar2.setValue(Boolean.TRUE);
                            } else {
                                isw iswVar2 = iswVar;
                                float fJ = iswVar2.j();
                                m9i m9iVar2 = m9iVar;
                                long j113 = m9iVar2.c;
                                long j114 = m9iVar2.a;
                                float fC = fJ - omf0.c(j113);
                                if (fC <= omf0.c(j114)) {
                                    iswVar2.A(omf0.c(j114));
                                    ytwVar2.setValue(Boolean.TRUE);
                                } else {
                                    iswVar2.A(fC);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                } else {
                    objY4 = new Function1() { // from class: qe1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ukf0 ukf0Var = (ukf0) obj;
                            ukf0Var.getClass();
                            boolean zD = ukf0Var.d();
                            ytw ytwVar2 = ytwVar;
                            if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                ytwVar2.setValue(Boolean.TRUE);
                            } else {
                                isw iswVar2 = iswVar;
                                float fJ = iswVar2.j();
                                m9i m9iVar2 = m9iVar;
                                long j113 = m9iVar2.c;
                                long j114 = m9iVar2.a;
                                float fC = fJ - omf0.c(j113);
                                if (fC <= omf0.c(j114)) {
                                    iswVar2.A(omf0.c(j114));
                                    ytwVar2.setValue(Boolean.TRUE);
                                } else {
                                    iswVar2.A(fC);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                int i25 = i9 << 3;
                bVar = bVarI;
                lkf0.d(str, dVarC6, j11, null, jG6, null, null, null, j9, null, gdf0Var3, j10, i18, z5, i2, 0, (Function1) objY4, imf0Var3, bVar, (i9 & 14) | ((i9 >> 3) & 896) | (458752 & i25) | (3670016 & i25) | (i25 & 29360128) | (234881024 & i25) | (i25 & 1879048192), ((i9 >> 27) & 14) | 48 | ((i16 << 3) & 896) | 27648 | ((i16 << 9) & 29360128), 32776);
                j5 = j11;
                j7 = j9;
                gdf0Var2 = gdf0Var3;
                j6 = j10;
                i17 = i18;
                z3 = z5;
                imf0Var2 = imf0Var3;
            } else {
                bVar = bVarI;
                bVar.G();
                z3 = z;
                imf0Var2 = imf0Var;
                dVar3 = dVar2;
                j5 = j4;
                gdf0Var2 = gdf0Var;
                j6 = j3;
                i17 = i14;
                j7 = j2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: se1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i3 | 1);
                        int iA2 = qj40.a(i4);
                        xe1.a(str, m9iVar, dVar3, j5, j7, gdf0Var2, j6, i17, z3, i2, imf0Var2, (a) obj, iA, iA2, i5);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 3072;
        j4 = j;
        i9 = 115040256 | i6;
        i10 = i5 & 512;
        if (i10 != 0) {
            if ((805306368 & i3) == 0) {
                if (bVarI.M(gdf0Var)) {
                    i11 = 536870912;
                } else {
                    i11 = 268435456;
                }
                i9 |= i11;
            }
            i12 = i4 | 6;
            i13 = i5 & 2048;
            if (i13 != 0) {
                i12 = 3126;
                i14 = i;
            } else {
                i14 = i;
                if ((i4 & 48) == 0) {
                    if (bVarI.d(i14)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i12 |= i15;
                }
            }
            i16 = i12 | 384 | (((i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 || !bVarI.M(imf0Var)) ? 8192 : Http2.INITIAL_MAX_FRAME_SIZE);
            if ((i9 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (bVarI.q(i9 & 1, z2)) {
                bVarI.A0();
                if ((i3 & 1) != 0) {
                    if (i19 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i7 != 0) {
                        j8 = j58.m;
                    } else {
                        j8 = j4;
                    }
                    long j113 = omf0.c;
                    if (i10 != 0) {
                        gdf0Var3 = null;
                    } else {
                        gdf0Var3 = gdf0Var;
                    }
                    if (i13 != 0) {
                        i14 = 1;
                    }
                    if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        i16 &= -57345;
                        imf0Var3 = (imf0) bVarI.O(lkf0.a);
                    } else {
                        imf0Var3 = imf0Var;
                    }
                    i18 = i14;
                    j9 = j113;
                    j10 = j9;
                    z4 = true;
                    z5 = true;
                    j11 = j8;
                } else {
                    if (i19 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i7 != 0) {
                        j8 = j58.m;
                    } else {
                        j8 = j4;
                    }
                    long j114 = omf0.c;
                    if (i10 != 0) {
                        gdf0Var3 = null;
                    } else {
                        gdf0Var3 = gdf0Var;
                    }
                    if (i13 != 0) {
                        i14 = 1;
                    }
                    if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        i16 &= -57345;
                        imf0Var3 = (imf0) bVarI.O(lkf0.a);
                    } else {
                        imf0Var3 = imf0Var;
                    }
                    i18 = i14;
                    j9 = j114;
                    j10 = j9;
                    z4 = true;
                    z5 = true;
                    j11 = j8;
                }
                bVarI.Y();
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = j.a(omf0.c(m9iVar.b));
                    bVarI.r(objY);
                }
                iswVar = (isw) objY;
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = m.b(Boolean.FALSE);
                    bVarI.r(objY2);
                }
                ytwVar = (ytw) objY2;
                long jG7 = d2l.g(iswVar.j(), 4294967296L);
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new Function1() { // from class: oe1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            lza lzaVar = (lza) obj;
                            lzaVar.getClass();
                            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                                lzaVar.b2();
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                d dVarC7 = androidx.compose.ui.draw.a.c(dVar3, (Function1) objY3);
                if ((i9 & 112) == 32) {
                }
                objY4 = bVarI.y();
                if (z6) {
                    objY4 = new Function1() { // from class: qe1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ukf0 ukf0Var = (ukf0) obj;
                            ukf0Var.getClass();
                            boolean zD = ukf0Var.d();
                            ytw ytwVar2 = ytwVar;
                            if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                ytwVar2.setValue(Boolean.TRUE);
                            } else {
                                isw iswVar2 = iswVar;
                                float fJ = iswVar2.j();
                                m9i m9iVar2 = m9iVar;
                                long j115 = m9iVar2.c;
                                long j116 = m9iVar2.a;
                                float fC = fJ - omf0.c(j115);
                                if (fC <= omf0.c(j116)) {
                                    iswVar2.A(omf0.c(j116));
                                    ytwVar2.setValue(Boolean.TRUE);
                                } else {
                                    iswVar2.A(fC);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                } else {
                    objY4 = new Function1() { // from class: qe1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ukf0 ukf0Var = (ukf0) obj;
                            ukf0Var.getClass();
                            boolean zD = ukf0Var.d();
                            ytw ytwVar2 = ytwVar;
                            if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                ytwVar2.setValue(Boolean.TRUE);
                            } else {
                                isw iswVar2 = iswVar;
                                float fJ = iswVar2.j();
                                m9i m9iVar2 = m9iVar;
                                long j115 = m9iVar2.c;
                                long j116 = m9iVar2.a;
                                float fC = fJ - omf0.c(j115);
                                if (fC <= omf0.c(j116)) {
                                    iswVar2.A(omf0.c(j116));
                                    ytwVar2.setValue(Boolean.TRUE);
                                } else {
                                    iswVar2.A(fC);
                                }
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                int i26 = i9 << 3;
                bVar = bVarI;
                lkf0.d(str, dVarC7, j11, null, jG7, null, null, null, j9, null, gdf0Var3, j10, i18, z5, i2, 0, (Function1) objY4, imf0Var3, bVar, (i9 & 14) | ((i9 >> 3) & 896) | (458752 & i26) | (3670016 & i26) | (i26 & 29360128) | (234881024 & i26) | (i26 & 1879048192), ((i9 >> 27) & 14) | 48 | ((i16 << 3) & 896) | 27648 | ((i16 << 9) & 29360128), 32776);
                j5 = j11;
                j7 = j9;
                gdf0Var2 = gdf0Var3;
                j6 = j10;
                i17 = i18;
                z3 = z5;
                imf0Var2 = imf0Var3;
            } else {
                bVar = bVarI;
                bVar.G();
                z3 = z;
                imf0Var2 = imf0Var;
                dVar3 = dVar2;
                j5 = j4;
                gdf0Var2 = gdf0Var;
                j6 = j3;
                i17 = i14;
                j7 = j2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: se1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i3 | 1);
                        int iA2 = qj40.a(i4);
                        xe1.a(str, m9iVar, dVar3, j5, j7, gdf0Var2, j6, i17, z3, i2, imf0Var2, (a) obj, iA, iA2, i5);
                        return Unit.a;
                    }
                };
            }
        }
        i9 = 920346624 | i6;
        i12 = i4 | 6;
        i13 = i5 & 2048;
        if (i13 != 0) {
            i12 = 3126;
            i14 = i;
        } else {
            i14 = i;
            if ((i4 & 48) == 0) {
                if (bVarI.d(i14)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i12 |= i15;
            }
        }
        i16 = i12 | 384 | (((i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 || !bVarI.M(imf0Var)) ? 8192 : Http2.INITIAL_MAX_FRAME_SIZE);
        if ((i9 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (bVarI.q(i9 & 1, z2)) {
            bVarI.A0();
            if ((i3 & 1) != 0) {
                if (i19 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i7 != 0) {
                    j8 = j58.m;
                } else {
                    j8 = j4;
                }
                long j115 = omf0.c;
                if (i10 != 0) {
                    gdf0Var3 = null;
                } else {
                    gdf0Var3 = gdf0Var;
                }
                if (i13 != 0) {
                    i14 = 1;
                }
                if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                    i16 &= -57345;
                    imf0Var3 = (imf0) bVarI.O(lkf0.a);
                } else {
                    imf0Var3 = imf0Var;
                }
                i18 = i14;
                j9 = j115;
                j10 = j9;
                z4 = true;
                z5 = true;
                j11 = j8;
            } else {
                if (i19 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i7 != 0) {
                    j8 = j58.m;
                } else {
                    j8 = j4;
                }
                long j116 = omf0.c;
                if (i10 != 0) {
                    gdf0Var3 = null;
                } else {
                    gdf0Var3 = gdf0Var;
                }
                if (i13 != 0) {
                    i14 = 1;
                }
                if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                    i16 &= -57345;
                    imf0Var3 = (imf0) bVarI.O(lkf0.a);
                } else {
                    imf0Var3 = imf0Var;
                }
                i18 = i14;
                j9 = j116;
                j10 = j9;
                z4 = true;
                z5 = true;
                j11 = j8;
            }
            bVarI.Y();
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = j.a(omf0.c(m9iVar.b));
                bVarI.r(objY);
            }
            iswVar = (isw) objY;
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytwVar = (ytw) objY2;
            long jG8 = d2l.g(iswVar.j(), 4294967296L);
            objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new Function1() { // from class: oe1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        lza lzaVar = (lza) obj;
                        lzaVar.getClass();
                        if (((Boolean) ytwVar.getValue()).booleanValue()) {
                            lzaVar.b2();
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            d dVarC8 = androidx.compose.ui.draw.a.c(dVar3, (Function1) objY3);
            if ((i9 & 112) == 32) {
            }
            objY4 = bVarI.y();
            if (z6) {
                objY4 = new Function1() { // from class: qe1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ukf0 ukf0Var = (ukf0) obj;
                        ukf0Var.getClass();
                        boolean zD = ukf0Var.d();
                        ytw ytwVar2 = ytwVar;
                        if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                            ytwVar2.setValue(Boolean.TRUE);
                        } else {
                            isw iswVar2 = iswVar;
                            float fJ = iswVar2.j();
                            m9i m9iVar2 = m9iVar;
                            long j117 = m9iVar2.c;
                            long j118 = m9iVar2.a;
                            float fC = fJ - omf0.c(j117);
                            if (fC <= omf0.c(j118)) {
                                iswVar2.A(omf0.c(j118));
                                ytwVar2.setValue(Boolean.TRUE);
                            } else {
                                iswVar2.A(fC);
                            }
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            } else {
                objY4 = new Function1() { // from class: qe1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ukf0 ukf0Var = (ukf0) obj;
                        ukf0Var.getClass();
                        boolean zD = ukf0Var.d();
                        ytw ytwVar2 = ytwVar;
                        if (!zD || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                            ytwVar2.setValue(Boolean.TRUE);
                        } else {
                            isw iswVar2 = iswVar;
                            float fJ = iswVar2.j();
                            m9i m9iVar2 = m9iVar;
                            long j117 = m9iVar2.c;
                            long j118 = m9iVar2.a;
                            float fC = fJ - omf0.c(j117);
                            if (fC <= omf0.c(j118)) {
                                iswVar2.A(omf0.c(j118));
                                ytwVar2.setValue(Boolean.TRUE);
                            } else {
                                iswVar2.A(fC);
                            }
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            int i27 = i9 << 3;
            bVar = bVarI;
            lkf0.d(str, dVarC8, j11, null, jG8, null, null, null, j9, null, gdf0Var3, j10, i18, z5, i2, 0, (Function1) objY4, imf0Var3, bVar, (i9 & 14) | ((i9 >> 3) & 896) | (458752 & i27) | (3670016 & i27) | (i27 & 29360128) | (234881024 & i27) | (i27 & 1879048192), ((i9 >> 27) & 14) | 48 | ((i16 << 3) & 896) | 27648 | ((i16 << 9) & 29360128), 32776);
            j5 = j11;
            j7 = j9;
            gdf0Var2 = gdf0Var3;
            j6 = j10;
            i17 = i18;
            z3 = z5;
            imf0Var2 = imf0Var3;
        } else {
            bVar = bVarI;
            bVar.G();
            z3 = z;
            imf0Var2 = imf0Var;
            dVar3 = dVar2;
            j5 = j4;
            gdf0Var2 = gdf0Var;
            j6 = j3;
            i17 = i14;
            j7 = j2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: se1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i3 | 1);
                    int iA2 = qj40.a(i4);
                    xe1.a(str, m9iVar, dVar3, j5, j7, gdf0Var2, j6, i17, z3, i2, imf0Var2, (a) obj, iA, iA2, i5);
                    return Unit.a;
                }
            };
        }
    }
}
