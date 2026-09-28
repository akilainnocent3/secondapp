package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class p6c {

    public static final class a implements Function0<Boolean> {
        public final /* synthetic */ dtg0 a;

        public a(dtg0 dtg0Var) {
            this.a = dtg0Var;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return ((x5a0) this.a.d).getValue();
        }
    }

    public static final class b implements Function0<dtg0.b<Boolean>> {
        public final /* synthetic */ dtg0 a;

        public b(dtg0 dtg0Var) {
            this.a = dtg0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final dtg0.b<Boolean> invoke() {
            return this.a.f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0161  */
    /* JADX WARN: Code duplicated, block: B:108:0x017d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0180  */
    /* JADX WARN: Code duplicated, block: B:112:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0194  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:125:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x020c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0215  */
    /* JADX WARN: Code duplicated, block: B:132:0x0218  */
    /* JADX WARN: Code duplicated, block: B:135:0x021e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0223  */
    /* JADX WARN: Code duplicated, block: B:140:0x0238  */
    /* JADX WARN: Code duplicated, block: B:141:0x023a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0243  */
    /* JADX WARN: Code duplicated, block: B:145:0x0245  */
    /* JADX WARN: Code duplicated, block: B:148:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x0256  */
    /* JADX WARN: Code duplicated, block: B:152:0x027e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0280  */
    /* JADX WARN: Code duplicated, block: B:156:0x028c  */
    /* JADX WARN: Code duplicated, block: B:157:0x028e  */
    /* JADX WARN: Code duplicated, block: B:160:0x029b  */
    /* JADX WARN: Code duplicated, block: B:161:0x029d  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x011a  */
    /* JADX WARN: Code duplicated, block: B:89:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:0x013e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0145  */
    public static final void a(d dVar, final String str, final boolean z, boolean z2, final float f, float f2, final float f3, final k6c k6cVar, final Function1<? super Boolean, Unit> function1, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z3;
        int i3;
        float f4;
        int i4;
        boolean z4;
        androidx.compose.runtime.b bVar;
        final d dVar2;
        final boolean z5;
        final float f5;
        e eVarZ;
        float f6;
        float f7;
        dtg0 dtg0VarF;
        o oVar;
        boolean zI;
        boolean z6;
        Object objA;
        boolean zBooleanValue;
        float f8;
        boolean zM;
        Object objY;
        boolean zBooleanValue2;
        float f9;
        boolean zM2;
        Object objY2;
        final dtg0.d dVarD;
        long j;
        long j2;
        final long j3;
        final long j4;
        boolean z7;
        int i5;
        boolean z8;
        boolean z9;
        Object objY3;
        int i6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean zM3;
        Object objY4;
        final float f10;
        int i7;
        boolean zM4;
        c5a0 c5a0VarA;
        Function1<Object, Unit> function1E;
        c5a0 c5a0VarB;
        int i8;
        int i9;
        int i10;
        int i11;
        str.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-147917238);
        int i12 = i | 6;
        if ((i & 48) == 0) {
            i12 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i12 |= bVarI.b(z) ? 256 : 128;
        }
        int i13 = i2 & 8;
        if (i13 == 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                i12 |= bVarI.b(z3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (bVarI.c(f)) {
                    i11 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i11 = 8192;
                }
                i12 |= i11;
            }
            i3 = i2 & 32;
            if (i3 != 0) {
                if ((196608 & i) == 0) {
                    f4 = f2;
                    if (bVarI.c(f4)) {
                        i4 = 131072;
                    } else {
                        i4 = 65536;
                    }
                    i12 |= i4;
                }
                if ((1572864 & i) != 0) {
                    if (bVarI.c(f3)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i12 |= i10;
                }
                if ((i & 12582912) == 0) {
                    if (bVarI.M(k6cVar)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i12 |= i9;
                }
                if ((i & 100663296) == 0) {
                    if (bVarI.A(function1)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i12 |= i8;
                }
                if ((i12 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i12 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0 || bVarI.h0()) {
                        if (i13 != 0) {
                            z3 = true;
                        }
                        if (i3 != 0) {
                            f6 = 2.0f;
                        } else {
                            f6 = f4;
                        }
                        f7 = f6;
                        dVar2 = d.a.b;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        f7 = f4;
                    }
                    bVarI.Y();
                    dtg0VarF = vtg0.f(Boolean.valueOf(z), "Checkbox state", bVarI, ((i12 >> 6) & 14) | 48, 0);
                    oVar = dtg0VarF.a;
                    g0h0 g0h0Var = gjs.b;
                    zI = dtg0VarF.i();
                    androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (zI) {
                        z3 = z3;
                        z6 = false;
                        objA = o6c.a(bVarI, 1666853325, false, oVar);
                    } else {
                        bVarI.N(1666599280);
                        zM4 = bVarI.M(dtg0VarF);
                        objA = bVarI.y();
                        if (zM4 || objA == c0042a) {
                            c5a0.e.getClass();
                            c5a0VarA = c5a0.a.a();
                            if (c5a0VarA != null) {
                                function1E = c5a0VarA.e();
                            } else {
                                function1E = null;
                            }
                            c5a0VarB = c5a0.a.b(c5a0VarA);
                            try {
                                Object objV = oVar.V();
                                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                                bVarI.r(objV);
                                objA = objV;
                            } catch (Throwable th) {
                                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                                throw th;
                            }
                        }
                        bVarI.X(false);
                        z6 = false;
                    }
                    zBooleanValue = ((Boolean) objA).booleanValue();
                    bVarI.N(885523331);
                    if (zBooleanValue) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.0f;
                    }
                    bVarI.X(z6);
                    Float fValueOf = Float.valueOf(f8);
                    zM = bVarI.M(dtg0VarF);
                    objY = bVarI.y();
                    if (zM || objY == c0042a) {
                        objY = a6a0.b(new a(dtg0VarF));
                        bVarI.r(objY);
                    }
                    zBooleanValue2 = ((Boolean) ((twd0) objY).getValue()).booleanValue();
                    bVarI.N(885523331);
                    if (zBooleanValue2) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    bVarI.X(false);
                    Float fValueOf2 = Float.valueOf(f9);
                    zM2 = bVarI.M(dtg0VarF);
                    objY2 = bVarI.y();
                    if (zM2 || objY2 == c0042a) {
                        objY2 = a6a0.b(new b(dtg0VarF));
                        bVarI.r(objY2);
                    }
                    ((dtg0.b) ((twd0) objY2).getValue()).getClass();
                    bVarI.N(-251562488);
                    fkd0 fkd0VarD = yi0.d(0.5f, 200.0f, null, 4);
                    bVarI.X(false);
                    dVarD = vtg0.d(dtg0VarF, fValueOf, fValueOf2, fkd0VarD, g0h0Var, bVarI, 196608);
                    if (z3 && z) {
                        j = k6cVar.d;
                    } else if (z3 && !z) {
                        j = k6cVar.e;
                    } else if (z) {
                        j = k6cVar.a;
                    } else {
                        j = k6cVar.b;
                    }
                    if (z3) {
                        j2 = k6cVar.c;
                    } else {
                        j2 = k6cVar.f;
                    }
                    j3 = j2;
                    j4 = j;
                    d dVarR = j.r(dVar2, f);
                    su50 su50Var = new su50(1);
                    if ((i12 & 234881024) == 67108864) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    i5 = i12 & 896;
                    boolean z14 = z7;
                    if (i5 == 256) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z14 | z8;
                    objY3 = bVarI.y();
                    i6 = i12;
                    if (z9 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: l6c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(Boolean.valueOf(!z));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY3);
                    }
                    boolean z15 = z3;
                    d dVarH = g3w.h(androidx.compose.foundation.d.d(dVarR, z15, null, su50Var, (Function0) objY3, 10), str);
                    if ((i6 & 458752) == 131072) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z16 = z10;
                    if ((i6 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z17 = z16 | z11;
                    if ((i6 & 3670016) == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean zE = z17 | z12 | bVarI.e(j4);
                    if (i5 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM3 = zE | z13 | bVarI.M(dVarD) | bVarI.e(j3);
                    objY4 = bVarI.y();
                    if (!zM3 || objY4 == c0042a) {
                        bVar = bVarI;
                        f10 = f7;
                        i7 = 0;
                        Function1 function2 = new Function1() { // from class: m6c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                tcf tcfVar = (tcf) obj;
                                tcfVar.getClass();
                                float fC1 = tcfVar.C1(f10);
                                float fC2 = tcfVar.C1(f);
                                float fC3 = tcfVar.C1(f3);
                                tcf.d1(tcfVar, j4, 0L, (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L), (((long) Float.floatToRawIntBits(fC3)) << 32) | (((long) Float.floatToRawIntBits(fC3)) & 4294967295L), z ? rlh.a : new yae0(fC1, 0.0f, 0, 0, null, 30), 0.0f, 226);
                                twd0 twd0Var = dVarD;
                                if (((Number) twd0Var.getValue()).floatValue() > 0.0f) {
                                    j90 j90VarA = m90.a();
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.2f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.5f * fC2)) & 4294967295L);
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.4f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.7f * fC2)) & 4294967295L);
                                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.8f * fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2 * 0.3f)) & 4294967295L);
                                    j90VarA.a(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                                    j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                                    j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)));
                                    tcf.Q1(tcfVar, j90VarA, j3, f.d(((Number) twd0Var.getValue()).floatValue(), 0.0f, 1.0f), new yae0(fC1, 0.0f, 1, 1, null, 18), 48);
                                }
                                return Unit.a;
                            }
                        };
                        bVar.r(function2);
                        objY4 = function2;
                    } else {
                        f10 = f7;
                        bVar = bVarI;
                        i7 = 0;
                    }
                    rxo.b(dVarH, (Function1) objY4, bVar, i7);
                    f5 = f10;
                    z5 = z15;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    z5 = z3;
                    f5 = f4;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: n6c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p6c.a(dVar2, str, z, z5, f, f5, f3, k6cVar, function1, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i12 |= 196608;
            f4 = f2;
            if ((1572864 & i) != 0) {
                if (bVarI.c(f3)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i12 |= i10;
            }
            if ((i & 12582912) == 0) {
                if (bVarI.M(k6cVar)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i12 |= i9;
            }
            if ((i & 100663296) == 0) {
                if (bVarI.A(function1)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i12 |= i8;
            }
            if ((i12 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i12 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        z3 = true;
                    }
                    if (i3 != 0) {
                        f6 = 2.0f;
                    } else {
                        f6 = f4;
                    }
                    f7 = f6;
                    dVar2 = d.a.b;
                } else {
                    if (i13 != 0) {
                        z3 = true;
                    }
                    if (i3 != 0) {
                        f6 = 2.0f;
                    } else {
                        f6 = f4;
                    }
                    f7 = f6;
                    dVar2 = d.a.b;
                }
                bVarI.Y();
                dtg0VarF = vtg0.f(Boolean.valueOf(z), "Checkbox state", bVarI, ((i12 >> 6) & 14) | 48, 0);
                oVar = dtg0VarF.a;
                g0h0 g0h0Var2 = gjs.b;
                zI = dtg0VarF.i();
                androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
                if (zI) {
                    bVarI.N(1666599280);
                    zM4 = bVarI.M(dtg0VarF);
                    objA = bVarI.y();
                    if (zM4) {
                        c5a0.e.getClass();
                        c5a0VarA = c5a0.a.a();
                        if (c5a0VarA != null) {
                            function1E = c5a0VarA.e();
                        } else {
                            function1E = null;
                        }
                        c5a0VarB = c5a0.a.b(c5a0VarA);
                        Object objV2 = oVar.V();
                        c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                        bVarI.r(objV2);
                        objA = objV2;
                    } else {
                        c5a0.e.getClass();
                        c5a0VarA = c5a0.a.a();
                        if (c5a0VarA != null) {
                            function1E = c5a0VarA.e();
                        } else {
                            function1E = null;
                        }
                        c5a0VarB = c5a0.a.b(c5a0VarA);
                        Object objV3 = oVar.V();
                        c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                        bVarI.r(objV3);
                        objA = objV3;
                    }
                    bVarI.X(false);
                    z6 = false;
                } else {
                    z3 = z3;
                    z6 = false;
                    objA = o6c.a(bVarI, 1666853325, false, oVar);
                }
                zBooleanValue = ((Boolean) objA).booleanValue();
                bVarI.N(885523331);
                if (zBooleanValue) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                bVarI.X(z6);
                Float fValueOf3 = Float.valueOf(f8);
                zM = bVarI.M(dtg0VarF);
                objY = bVarI.y();
                if (zM) {
                    objY = a6a0.b(new a(dtg0VarF));
                    bVarI.r(objY);
                } else {
                    objY = a6a0.b(new a(dtg0VarF));
                    bVarI.r(objY);
                }
                zBooleanValue2 = ((Boolean) ((twd0) objY).getValue()).booleanValue();
                bVarI.N(885523331);
                if (zBooleanValue2) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                bVarI.X(false);
                Float fValueOf4 = Float.valueOf(f9);
                zM2 = bVarI.M(dtg0VarF);
                objY2 = bVarI.y();
                if (zM2) {
                    objY2 = a6a0.b(new b(dtg0VarF));
                    bVarI.r(objY2);
                } else {
                    objY2 = a6a0.b(new b(dtg0VarF));
                    bVarI.r(objY2);
                }
                ((dtg0.b) ((twd0) objY2).getValue()).getClass();
                bVarI.N(-251562488);
                fkd0 fkd0VarD2 = yi0.d(0.5f, 200.0f, null, 4);
                bVarI.X(false);
                dVarD = vtg0.d(dtg0VarF, fValueOf3, fValueOf4, fkd0VarD2, g0h0Var2, bVarI, 196608);
                if (z3) {
                    if (z3) {
                        if (z) {
                            j = k6cVar.a;
                        } else {
                            j = k6cVar.b;
                        }
                    } else if (z) {
                        j = k6cVar.a;
                    } else {
                        j = k6cVar.b;
                    }
                } else if (z3) {
                    if (z) {
                        j = k6cVar.a;
                    } else {
                        j = k6cVar.b;
                    }
                } else if (z) {
                    j = k6cVar.a;
                } else {
                    j = k6cVar.b;
                }
                if (z3) {
                    j2 = k6cVar.c;
                } else {
                    j2 = k6cVar.f;
                }
                j3 = j2;
                j4 = j;
                d dVarR2 = j.r(dVar2, f);
                su50 su50Var2 = new su50(1);
                if ((i12 & 234881024) == 67108864) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                i5 = i12 & 896;
                boolean z18 = z7;
                if (i5 == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z18 | z8;
                objY3 = bVarI.y();
                i6 = i12;
                if (z9) {
                    objY3 = new Function0() { // from class: l6c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(Boolean.valueOf(!z));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                } else {
                    objY3 = new Function0() { // from class: l6c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(Boolean.valueOf(!z));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                boolean z19 = z3;
                d dVarH2 = g3w.h(androidx.compose.foundation.d.d(dVarR2, z19, null, su50Var2, (Function0) objY3, 10), str);
                if ((i6 & 458752) == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z110 = z10;
                if ((i6 & 57344) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z111 = z110 | z11;
                if ((i6 & 3670016) == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean zE2 = z111 | z12 | bVarI.e(j4);
                if (i5 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM3 = zE2 | z13 | bVarI.M(dVarD) | bVarI.e(j3);
                objY4 = bVarI.y();
                if (zM3) {
                    bVar = bVarI;
                    f10 = f7;
                    i7 = 0;
                    Function1 function3 = new Function1() { // from class: m6c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar = (tcf) obj;
                            tcfVar.getClass();
                            float fC1 = tcfVar.C1(f10);
                            float fC2 = tcfVar.C1(f);
                            float fC3 = tcfVar.C1(f3);
                            tcf.d1(tcfVar, j4, 0L, (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L), (((long) Float.floatToRawIntBits(fC3)) << 32) | (((long) Float.floatToRawIntBits(fC3)) & 4294967295L), z ? rlh.a : new yae0(fC1, 0.0f, 0, 0, null, 30), 0.0f, 226);
                            twd0 twd0Var = dVarD;
                            if (((Number) twd0Var.getValue()).floatValue() > 0.0f) {
                                j90 j90VarA = m90.a();
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.2f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.5f * fC2)) & 4294967295L);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.4f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.7f * fC2)) & 4294967295L);
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.8f * fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2 * 0.3f)) & 4294967295L);
                                j90VarA.a(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                                j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                                j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)));
                                tcf.Q1(tcfVar, j90VarA, j3, f.d(((Number) twd0Var.getValue()).floatValue(), 0.0f, 1.0f), new yae0(fC1, 0.0f, 1, 1, null, 18), 48);
                            }
                            return Unit.a;
                        }
                    };
                    bVar.r(function3);
                    objY4 = function3;
                } else {
                    bVar = bVarI;
                    f10 = f7;
                    i7 = 0;
                    Function1 function4 = new Function1() { // from class: m6c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar = (tcf) obj;
                            tcfVar.getClass();
                            float fC1 = tcfVar.C1(f10);
                            float fC2 = tcfVar.C1(f);
                            float fC3 = tcfVar.C1(f3);
                            tcf.d1(tcfVar, j4, 0L, (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L), (((long) Float.floatToRawIntBits(fC3)) << 32) | (((long) Float.floatToRawIntBits(fC3)) & 4294967295L), z ? rlh.a : new yae0(fC1, 0.0f, 0, 0, null, 30), 0.0f, 226);
                            twd0 twd0Var = dVarD;
                            if (((Number) twd0Var.getValue()).floatValue() > 0.0f) {
                                j90 j90VarA = m90.a();
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.2f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.5f * fC2)) & 4294967295L);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.4f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.7f * fC2)) & 4294967295L);
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.8f * fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2 * 0.3f)) & 4294967295L);
                                j90VarA.a(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                                j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                                j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)));
                                tcf.Q1(tcfVar, j90VarA, j3, f.d(((Number) twd0Var.getValue()).floatValue(), 0.0f, 1.0f), new yae0(fC1, 0.0f, 1, 1, null, 18), 48);
                            }
                            return Unit.a;
                        }
                    };
                    bVar.r(function4);
                    objY4 = function4;
                }
                rxo.b(dVarH2, (Function1) objY4, bVar, i7);
                f5 = f10;
                z5 = z19;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                z5 = z3;
                f5 = f4;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: n6c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p6c.a(dVar2, str, z, z5, f, f5, f3, k6cVar, function1, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i12 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if (bVarI.c(f)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i12 |= i11;
        }
        i3 = i2 & 32;
        if (i3 != 0) {
            if ((196608 & i) == 0) {
                f4 = f2;
                if (bVarI.c(f4)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i12 |= i4;
            }
            if ((1572864 & i) != 0) {
                if (bVarI.c(f3)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i12 |= i10;
            }
            if ((i & 12582912) == 0) {
                if (bVarI.M(k6cVar)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i12 |= i9;
            }
            if ((i & 100663296) == 0) {
                if (bVarI.A(function1)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i12 |= i8;
            }
            if ((i12 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i12 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        z3 = true;
                    }
                    if (i3 != 0) {
                        f6 = 2.0f;
                    } else {
                        f6 = f4;
                    }
                    f7 = f6;
                    dVar2 = d.a.b;
                } else {
                    if (i13 != 0) {
                        z3 = true;
                    }
                    if (i3 != 0) {
                        f6 = 2.0f;
                    } else {
                        f6 = f4;
                    }
                    f7 = f6;
                    dVar2 = d.a.b;
                }
                bVarI.Y();
                dtg0VarF = vtg0.f(Boolean.valueOf(z), "Checkbox state", bVarI, ((i12 >> 6) & 14) | 48, 0);
                oVar = dtg0VarF.a;
                g0h0 g0h0Var3 = gjs.b;
                zI = dtg0VarF.i();
                androidx.compose.runtime.a.C0041a.C0042a c0042a3 = androidx.compose.runtime.a.C0041a.a;
                if (zI) {
                    bVarI.N(1666599280);
                    zM4 = bVarI.M(dtg0VarF);
                    objA = bVarI.y();
                    if (zM4) {
                        c5a0.e.getClass();
                        c5a0VarA = c5a0.a.a();
                        if (c5a0VarA != null) {
                            function1E = c5a0VarA.e();
                        } else {
                            function1E = null;
                        }
                        c5a0VarB = c5a0.a.b(c5a0VarA);
                        Object objV4 = oVar.V();
                        c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                        bVarI.r(objV4);
                        objA = objV4;
                    } else {
                        c5a0.e.getClass();
                        c5a0VarA = c5a0.a.a();
                        if (c5a0VarA != null) {
                            function1E = c5a0VarA.e();
                        } else {
                            function1E = null;
                        }
                        c5a0VarB = c5a0.a.b(c5a0VarA);
                        Object objV5 = oVar.V();
                        c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                        bVarI.r(objV5);
                        objA = objV5;
                    }
                    bVarI.X(false);
                    z6 = false;
                } else {
                    z3 = z3;
                    z6 = false;
                    objA = o6c.a(bVarI, 1666853325, false, oVar);
                }
                zBooleanValue = ((Boolean) objA).booleanValue();
                bVarI.N(885523331);
                if (zBooleanValue) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                bVarI.X(z6);
                Float fValueOf5 = Float.valueOf(f8);
                zM = bVarI.M(dtg0VarF);
                objY = bVarI.y();
                if (zM) {
                    objY = a6a0.b(new a(dtg0VarF));
                    bVarI.r(objY);
                } else {
                    objY = a6a0.b(new a(dtg0VarF));
                    bVarI.r(objY);
                }
                zBooleanValue2 = ((Boolean) ((twd0) objY).getValue()).booleanValue();
                bVarI.N(885523331);
                if (zBooleanValue2) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                bVarI.X(false);
                Float fValueOf6 = Float.valueOf(f9);
                zM2 = bVarI.M(dtg0VarF);
                objY2 = bVarI.y();
                if (zM2) {
                    objY2 = a6a0.b(new b(dtg0VarF));
                    bVarI.r(objY2);
                } else {
                    objY2 = a6a0.b(new b(dtg0VarF));
                    bVarI.r(objY2);
                }
                ((dtg0.b) ((twd0) objY2).getValue()).getClass();
                bVarI.N(-251562488);
                fkd0 fkd0VarD3 = yi0.d(0.5f, 200.0f, null, 4);
                bVarI.X(false);
                dVarD = vtg0.d(dtg0VarF, fValueOf5, fValueOf6, fkd0VarD3, g0h0Var3, bVarI, 196608);
                if (z3) {
                    if (z3) {
                        if (z) {
                            j = k6cVar.a;
                        } else {
                            j = k6cVar.b;
                        }
                    } else if (z) {
                        j = k6cVar.a;
                    } else {
                        j = k6cVar.b;
                    }
                } else if (z3) {
                    if (z) {
                        j = k6cVar.a;
                    } else {
                        j = k6cVar.b;
                    }
                } else if (z) {
                    j = k6cVar.a;
                } else {
                    j = k6cVar.b;
                }
                if (z3) {
                    j2 = k6cVar.c;
                } else {
                    j2 = k6cVar.f;
                }
                j3 = j2;
                j4 = j;
                d dVarR3 = j.r(dVar2, f);
                su50 su50Var3 = new su50(1);
                if ((i12 & 234881024) == 67108864) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                i5 = i12 & 896;
                boolean z112 = z7;
                if (i5 == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z112 | z8;
                objY3 = bVarI.y();
                i6 = i12;
                if (z9) {
                    objY3 = new Function0() { // from class: l6c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(Boolean.valueOf(!z));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                } else {
                    objY3 = new Function0() { // from class: l6c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(Boolean.valueOf(!z));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                boolean z113 = z3;
                d dVarH3 = g3w.h(androidx.compose.foundation.d.d(dVarR3, z113, null, su50Var3, (Function0) objY3, 10), str);
                if ((i6 & 458752) == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z114 = z10;
                if ((i6 & 57344) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z115 = z114 | z11;
                if ((i6 & 3670016) == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean zE3 = z115 | z12 | bVarI.e(j4);
                if (i5 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM3 = zE3 | z13 | bVarI.M(dVarD) | bVarI.e(j3);
                objY4 = bVarI.y();
                if (zM3) {
                    bVar = bVarI;
                    f10 = f7;
                    i7 = 0;
                    Function1 function5 = new Function1() { // from class: m6c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar = (tcf) obj;
                            tcfVar.getClass();
                            float fC1 = tcfVar.C1(f10);
                            float fC2 = tcfVar.C1(f);
                            float fC3 = tcfVar.C1(f3);
                            tcf.d1(tcfVar, j4, 0L, (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L), (((long) Float.floatToRawIntBits(fC3)) << 32) | (((long) Float.floatToRawIntBits(fC3)) & 4294967295L), z ? rlh.a : new yae0(fC1, 0.0f, 0, 0, null, 30), 0.0f, 226);
                            twd0 twd0Var = dVarD;
                            if (((Number) twd0Var.getValue()).floatValue() > 0.0f) {
                                j90 j90VarA = m90.a();
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.2f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.5f * fC2)) & 4294967295L);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.4f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.7f * fC2)) & 4294967295L);
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.8f * fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2 * 0.3f)) & 4294967295L);
                                j90VarA.a(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                                j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                                j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)));
                                tcf.Q1(tcfVar, j90VarA, j3, f.d(((Number) twd0Var.getValue()).floatValue(), 0.0f, 1.0f), new yae0(fC1, 0.0f, 1, 1, null, 18), 48);
                            }
                            return Unit.a;
                        }
                    };
                    bVar.r(function5);
                    objY4 = function5;
                } else {
                    bVar = bVarI;
                    f10 = f7;
                    i7 = 0;
                    Function1 function6 = new Function1() { // from class: m6c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar = (tcf) obj;
                            tcfVar.getClass();
                            float fC1 = tcfVar.C1(f10);
                            float fC2 = tcfVar.C1(f);
                            float fC3 = tcfVar.C1(f3);
                            tcf.d1(tcfVar, j4, 0L, (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L), (((long) Float.floatToRawIntBits(fC3)) << 32) | (((long) Float.floatToRawIntBits(fC3)) & 4294967295L), z ? rlh.a : new yae0(fC1, 0.0f, 0, 0, null, 30), 0.0f, 226);
                            twd0 twd0Var = dVarD;
                            if (((Number) twd0Var.getValue()).floatValue() > 0.0f) {
                                j90 j90VarA = m90.a();
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.2f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.5f * fC2)) & 4294967295L);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.4f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.7f * fC2)) & 4294967295L);
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.8f * fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2 * 0.3f)) & 4294967295L);
                                j90VarA.a(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                                j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                                j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)));
                                tcf.Q1(tcfVar, j90VarA, j3, f.d(((Number) twd0Var.getValue()).floatValue(), 0.0f, 1.0f), new yae0(fC1, 0.0f, 1, 1, null, 18), 48);
                            }
                            return Unit.a;
                        }
                    };
                    bVar.r(function6);
                    objY4 = function6;
                }
                rxo.b(dVarH3, (Function1) objY4, bVar, i7);
                f5 = f10;
                z5 = z113;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                z5 = z3;
                f5 = f4;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: n6c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p6c.a(dVar2, str, z, z5, f, f5, f3, k6cVar, function1, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i12 |= 196608;
        f4 = f2;
        if ((1572864 & i) != 0) {
            if (bVarI.c(f3)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i12 |= i10;
        }
        if ((i & 12582912) == 0) {
            if (bVarI.M(k6cVar)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i12 |= i9;
        }
        if ((i & 100663296) == 0) {
            if (bVarI.A(function1)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i12 |= i8;
        }
        if ((i12 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVarI.q(i12 & 1, z4)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    z3 = true;
                }
                if (i3 != 0) {
                    f6 = 2.0f;
                } else {
                    f6 = f4;
                }
                f7 = f6;
                dVar2 = d.a.b;
            } else {
                if (i13 != 0) {
                    z3 = true;
                }
                if (i3 != 0) {
                    f6 = 2.0f;
                } else {
                    f6 = f4;
                }
                f7 = f6;
                dVar2 = d.a.b;
            }
            bVarI.Y();
            dtg0VarF = vtg0.f(Boolean.valueOf(z), "Checkbox state", bVarI, ((i12 >> 6) & 14) | 48, 0);
            oVar = dtg0VarF.a;
            g0h0 g0h0Var4 = gjs.b;
            zI = dtg0VarF.i();
            androidx.compose.runtime.a.C0041a.C0042a c0042a4 = androidx.compose.runtime.a.C0041a.a;
            if (zI) {
                bVarI.N(1666599280);
                zM4 = bVarI.M(dtg0VarF);
                objA = bVarI.y();
                if (zM4) {
                    c5a0.e.getClass();
                    c5a0VarA = c5a0.a.a();
                    if (c5a0VarA != null) {
                        function1E = c5a0VarA.e();
                    } else {
                        function1E = null;
                    }
                    c5a0VarB = c5a0.a.b(c5a0VarA);
                    Object objV6 = oVar.V();
                    c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                    bVarI.r(objV6);
                    objA = objV6;
                } else {
                    c5a0.e.getClass();
                    c5a0VarA = c5a0.a.a();
                    if (c5a0VarA != null) {
                        function1E = c5a0VarA.e();
                    } else {
                        function1E = null;
                    }
                    c5a0VarB = c5a0.a.b(c5a0VarA);
                    Object objV7 = oVar.V();
                    c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                    bVarI.r(objV7);
                    objA = objV7;
                }
                bVarI.X(false);
                z6 = false;
            } else {
                z3 = z3;
                z6 = false;
                objA = o6c.a(bVarI, 1666853325, false, oVar);
            }
            zBooleanValue = ((Boolean) objA).booleanValue();
            bVarI.N(885523331);
            if (zBooleanValue) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            bVarI.X(z6);
            Float fValueOf7 = Float.valueOf(f8);
            zM = bVarI.M(dtg0VarF);
            objY = bVarI.y();
            if (zM) {
                objY = a6a0.b(new a(dtg0VarF));
                bVarI.r(objY);
            } else {
                objY = a6a0.b(new a(dtg0VarF));
                bVarI.r(objY);
            }
            zBooleanValue2 = ((Boolean) ((twd0) objY).getValue()).booleanValue();
            bVarI.N(885523331);
            if (zBooleanValue2) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            bVarI.X(false);
            Float fValueOf8 = Float.valueOf(f9);
            zM2 = bVarI.M(dtg0VarF);
            objY2 = bVarI.y();
            if (zM2) {
                objY2 = a6a0.b(new b(dtg0VarF));
                bVarI.r(objY2);
            } else {
                objY2 = a6a0.b(new b(dtg0VarF));
                bVarI.r(objY2);
            }
            ((dtg0.b) ((twd0) objY2).getValue()).getClass();
            bVarI.N(-251562488);
            fkd0 fkd0VarD4 = yi0.d(0.5f, 200.0f, null, 4);
            bVarI.X(false);
            dVarD = vtg0.d(dtg0VarF, fValueOf7, fValueOf8, fkd0VarD4, g0h0Var4, bVarI, 196608);
            if (z3) {
                if (z3) {
                    if (z) {
                        j = k6cVar.a;
                    } else {
                        j = k6cVar.b;
                    }
                } else if (z) {
                    j = k6cVar.a;
                } else {
                    j = k6cVar.b;
                }
            } else if (z3) {
                if (z) {
                    j = k6cVar.a;
                } else {
                    j = k6cVar.b;
                }
            } else if (z) {
                j = k6cVar.a;
            } else {
                j = k6cVar.b;
            }
            if (z3) {
                j2 = k6cVar.c;
            } else {
                j2 = k6cVar.f;
            }
            j3 = j2;
            j4 = j;
            d dVarR4 = j.r(dVar2, f);
            su50 su50Var4 = new su50(1);
            if ((i12 & 234881024) == 67108864) {
                z7 = true;
            } else {
                z7 = false;
            }
            i5 = i12 & 896;
            boolean z116 = z7;
            if (i5 == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z116 | z8;
            objY3 = bVarI.y();
            i6 = i12;
            if (z9) {
                objY3 = new Function0() { // from class: l6c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(Boolean.valueOf(!z));
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            } else {
                objY3 = new Function0() { // from class: l6c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(Boolean.valueOf(!z));
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            boolean z117 = z3;
            d dVarH4 = g3w.h(androidx.compose.foundation.d.d(dVarR4, z117, null, su50Var4, (Function0) objY3, 10), str);
            if ((i6 & 458752) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z118 = z10;
            if ((i6 & 57344) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z119 = z118 | z11;
            if ((i6 & 3670016) == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean zE4 = z119 | z12 | bVarI.e(j4);
            if (i5 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM3 = zE4 | z13 | bVarI.M(dVarD) | bVarI.e(j3);
            objY4 = bVarI.y();
            if (zM3) {
                bVar = bVarI;
                f10 = f7;
                i7 = 0;
                Function1 function7 = new Function1() { // from class: m6c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fC1 = tcfVar.C1(f10);
                        float fC2 = tcfVar.C1(f);
                        float fC3 = tcfVar.C1(f3);
                        tcf.d1(tcfVar, j4, 0L, (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L), (((long) Float.floatToRawIntBits(fC3)) << 32) | (((long) Float.floatToRawIntBits(fC3)) & 4294967295L), z ? rlh.a : new yae0(fC1, 0.0f, 0, 0, null, 30), 0.0f, 226);
                        twd0 twd0Var = dVarD;
                        if (((Number) twd0Var.getValue()).floatValue() > 0.0f) {
                            j90 j90VarA = m90.a();
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.2f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.5f * fC2)) & 4294967295L);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.4f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.7f * fC2)) & 4294967295L);
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.8f * fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2 * 0.3f)) & 4294967295L);
                            j90VarA.a(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                            j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                            j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)));
                            tcf.Q1(tcfVar, j90VarA, j3, f.d(((Number) twd0Var.getValue()).floatValue(), 0.0f, 1.0f), new yae0(fC1, 0.0f, 1, 1, null, 18), 48);
                        }
                        return Unit.a;
                    }
                };
                bVar.r(function7);
                objY4 = function7;
            } else {
                bVar = bVarI;
                f10 = f7;
                i7 = 0;
                Function1 function8 = new Function1() { // from class: m6c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fC1 = tcfVar.C1(f10);
                        float fC2 = tcfVar.C1(f);
                        float fC3 = tcfVar.C1(f3);
                        tcf.d1(tcfVar, j4, 0L, (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L), (((long) Float.floatToRawIntBits(fC3)) << 32) | (((long) Float.floatToRawIntBits(fC3)) & 4294967295L), z ? rlh.a : new yae0(fC1, 0.0f, 0, 0, null, 30), 0.0f, 226);
                        twd0 twd0Var = dVarD;
                        if (((Number) twd0Var.getValue()).floatValue() > 0.0f) {
                            j90 j90VarA = m90.a();
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.2f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.5f * fC2)) & 4294967295L);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.4f * fC2)) << 32) | (((long) Float.floatToRawIntBits(0.7f * fC2)) & 4294967295L);
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(0.8f * fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2 * 0.3f)) & 4294967295L);
                            j90VarA.a(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                            j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                            j90VarA.c(Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)));
                            tcf.Q1(tcfVar, j90VarA, j3, f.d(((Number) twd0Var.getValue()).floatValue(), 0.0f, 1.0f), new yae0(fC1, 0.0f, 1, 1, null, 18), 48);
                        }
                        return Unit.a;
                    }
                };
                bVar.r(function8);
                objY4 = function8;
            }
            rxo.b(dVarH4, (Function1) objY4, bVar, i7);
            f5 = f10;
            z5 = z117;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            z5 = z3;
            f5 = f4;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: n6c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p6c.a(dVar2, str, z, z5, f, f5, f3, k6cVar, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final k6c b(long j, long j2, long j3, long j4, long j5, long j6, androidx.compose.runtime.a aVar, int i) {
        if ((i & 1) != 0) {
            j = ((d68) aVar.O(g68.a)).a;
        }
        return new k6c(j, (i & 2) != 0 ? j58.c(0.6f, ((d68) aVar.O(g68.a)).q) : j2, (i & 4) != 0 ? ((d68) aVar.O(g68.a)).p : j3, (i & 8) != 0 ? j58.c(0.38f, ((d68) aVar.O(g68.a)).q) : j4, (i & 16) != 0 ? j58.c(0.38f, ((d68) aVar.O(g68.a)).q) : j5, (i & 32) != 0 ? ((d68) aVar.O(g68.a)).p : j6);
    }
}
