package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class ttf {
    public static final void a(Function0<Unit> function0, a aVar, int i) {
        Function0<Unit> function1;
        b bVarI = aVar.i(1958883606);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            c6n.a(function1, j.r(d.a.b, 20.0f), false, null, null, q09.a, bVarI, (i2 & 14) | 1572912, 60);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new rtf(i, function1);
        }
    }

    public static final void b(Function0<Unit> function0, a aVar, int i) {
        Function0<Unit> function1;
        b bVarI = aVar.i(1844466735);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            function1 = function0;
            c6n.a(function1, j.r(d.a.b, 20.0f), false, null, null, q09.b, bVarI, 1572918, 60);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new stf(i, function1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0127  */
    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x014a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0162  */
    /* JADX WARN: Code duplicated, block: B:123:0x0165  */
    /* JADX WARN: Code duplicated, block: B:124:0x0168  */
    /* JADX WARN: Code duplicated, block: B:126:0x016b  */
    /* JADX WARN: Code duplicated, block: B:127:0x016e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0180  */
    /* JADX WARN: Code duplicated, block: B:134:0x0190  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01db  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:143:0x0208  */
    /* JADX WARN: Code duplicated, block: B:145:0x0260  */
    /* JADX WARN: Code duplicated, block: B:148:0x0271  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final d dVar, final ijf0 ijf0Var, boolean z, ycg ycgVar, final boolean z2, String str, final String str2, gop gopVar, uni0 uni0Var, final Function1 function1, a aVar, final int i, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        String str3;
        int i6;
        int i7;
        final gop gopVar2;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        b bVar;
        final ycg ycgVar2;
        final boolean z5;
        final String str4;
        final uni0 uni0Var2;
        e eVarZ;
        ycg bVar2;
        gop gopVar3;
        uni0 uni0Var3;
        gop gopVar4;
        int i12;
        String str5;
        uni0 uni0Var4;
        Object objY;
        final ytw ytwVar;
        op8 op8VarB;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean zA;
        b bVarI = aVar.i(-1220891678);
        if ((i & 6) == 0) {
            i4 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= bVarI.M(ijf0Var) ? 32 : 16;
        }
        int i17 = i4 | 384;
        int i18 = i3 & 8;
        if (i18 == 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                i17 |= bVarI.b(z3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) != 0) {
                    i16 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zA = bVarI.M(ycgVar);
                    } else {
                        zA = bVarI.A(ycgVar);
                    }
                    if (zA) {
                        i16 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i16 = 8192;
                    }
                }
                i17 |= i16;
            }
            if ((196608 & i) == 0) {
                if (bVarI.b(z2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i17 |= i15;
            }
            i5 = i3 & 64;
            if (i5 != 0) {
                if ((1572864 & i) == 0) {
                    str3 = str;
                    if (bVarI.M(str3)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i17 |= i6;
                }
                if ((12582912 & i) != 0) {
                    if (bVarI.M(str2)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i17 |= i14;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i17 |= 100663296;
                    gopVar2 = gopVar;
                } else {
                    gopVar2 = gopVar;
                    if ((i & 100663296) == 0) {
                        if (bVarI.M(gopVar2)) {
                            i8 = 67108864;
                        } else {
                            i8 = 33554432;
                        }
                        i17 |= i8;
                    }
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    if ((i & 805306368) == 0) {
                        if (bVarI.M(uni0Var)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i17 |= i10;
                    }
                    if ((i2 & 6) == 0) {
                        if (bVarI.A(function1)) {
                            i13 = 4;
                        } else {
                            i13 = 2;
                        }
                        i11 = i2 | i13;
                    } else {
                        i11 = i2;
                    }
                    if ((i17 & 306783379) == 306783378 || (i11 & 3) != 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (bVarI.q(i17 & 1, z4)) {
                        bVarI.A0();
                        if ((i & 1) != 0 || bVarI.h0()) {
                            if (i18 != 0) {
                                z3 = false;
                            }
                            if ((i3 & 16) != 0) {
                                bVar2 = new ycg.b("", "error_text");
                                i17 &= -57345;
                            } else {
                                bVar2 = ycgVar;
                            }
                            String str6 = i5 == 0 ? str3 : "";
                            if (i7 != 0) {
                                gopVar3 = gop.e;
                            } else {
                                gopVar3 = gopVar2;
                            }
                            if (i9 != 0) {
                                uni0Var3 = uni0.a.a;
                            } else {
                                uni0Var3 = uni0Var;
                            }
                            int i19 = i17;
                            gopVar4 = gopVar3;
                            i12 = i19;
                            str5 = str6;
                            uni0Var4 = uni0Var3;
                        } else {
                            bVarI.G();
                            if ((i3 & 16) != 0) {
                                i17 &= -57345;
                            }
                            bVar2 = ycgVar;
                            uni0Var4 = uni0Var;
                            i12 = i17;
                            gopVar4 = gopVar2;
                            str5 = str3;
                        }
                        bVarI.Y();
                        objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = nvc.a(z2, bVarI);
                        }
                        ytwVar = (ytw) objY;
                        if (ijf0Var.a.b.length() == 0) {
                            ytwVar.setValue(Boolean.TRUE);
                        }
                        boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                        lff0 lff0VarB = wue.b(bVarI);
                        lff0 lff0VarA = lff0VarB.a(lff0VarB.a, lff0VarB.b, ((-1025) & 4) != 0 ? lff0VarB.c : c68.a(R.color.text_type1_primary, bVarI), lff0VarB.d, lff0VarB.e, lff0VarB.f, ((-1025) & 64) != 0 ? lff0VarB.g : 0L, lff0VarB.h, lff0VarB.i, lff0VarB.j, ((-1025) & 1024) != 0 ? lff0VarB.k : null, ((-1025) & 2048) != 0 ? lff0VarB.l : 0L, ((-1025) & 4096) != 0 ? lff0VarB.m : 0L, lff0VarB.n, lff0VarB.o, lff0VarB.p, lff0VarB.q, lff0VarB.r, lff0VarB.s, lff0VarB.t, lff0VarB.u, lff0VarB.v, lff0VarB.w, lff0VarB.x, lff0VarB.y, lff0VarB.z, lff0VarB.A, lff0VarB.B, lff0VarB.C, lff0VarB.D, lff0VarB.E, lff0VarB.F, lff0VarB.G, lff0VarB.H, lff0VarB.I, lff0VarB.J, lff0VarB.K, lff0VarB.L, lff0VarB.M, lff0VarB.N, lff0VarB.O, lff0VarB.P, lff0VarB.Q);
                        if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                            bVarI.N(-1799687339);
                            op8VarB = pp8.b(-2031881975, new Function2() { // from class: mtf
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    a aVar2 = (a) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        Object objY2 = aVar2.y();
                                        if (objY2 == a.C0041a.a) {
                                            final ytw ytwVar2 = ytwVar;
                                            objY2 = new Function0() { // from class: qtf
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    ytwVar2.setValue(Boolean.TRUE);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar2.r(objY2);
                                        }
                                        ttf.b((Function0) objY2, aVar2, 6);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, bVarI);
                            bVarI.X(false);
                        } else if (ijf0Var.a.b.length() > 0 || !((Boolean) ytwVar.getValue()).booleanValue()) {
                            bVarI.N(-1799450469);
                            bVarI.X(false);
                            op8VarB = null;
                        } else {
                            bVarI.N(-1799561758);
                            op8VarB = pp8.b(-1906290432, new Function2() { // from class: ntf
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    a aVar2 = (a) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        final Function1 function2 = function1;
                                        boolean zM = aVar2.M(function2);
                                        Object objY2 = aVar2.y();
                                        if (zM || objY2 == a.C0041a.a) {
                                            objY2 = new Function0() { // from class: ptf
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    function2.invoke(new ijf0((String) null, 0L, 7));
                                                    return Unit.a;
                                                }
                                            };
                                            aVar2.r(objY2);
                                        }
                                        ttf.a((Function0) objY2, aVar2, 0);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, bVarI);
                            bVarI.X(false);
                        }
                        int i20 = i12 << 3;
                        int i21 = (i12 & 1022) | (i20 & 57344) | (i20 & 458752);
                        int i22 = i12 << 6;
                        int i23 = ((i12 >> 21) & 1008) | ((i11 << 18) & 3670016);
                        op8 op8Var = op8VarB;
                        bVar = bVarI;
                        boolean z6 = z3;
                        ycg ycgVar3 = bVar2;
                        tyx.c(dVar, ijf0Var, null, op8Var, z6, ycgVar3, zBooleanValue, false, str5, str2, lff0VarA, gopVar4, uni0Var4, 0, null, null, function1, bVar, i21 | (i22 & 234881024) | (i22 & 1879048192), i23, 57472);
                        z5 = z6;
                        ycgVar2 = ycgVar3;
                        str4 = str5;
                        gopVar2 = gopVar4;
                        uni0Var2 = uni0Var4;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        ycgVar2 = ycgVar;
                        z5 = z3;
                        str4 = str3;
                        uni0Var2 = uni0Var;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: otf
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i | 1);
                                int iA2 = qj40.a(i2);
                                ttf.c(dVar, ijf0Var, z5, ycgVar2, z2, str4, str2, gopVar2, uni0Var2, function1, (a) obj, iA, iA2, i3);
                                return Unit.a;
                            }
                        };
                    }
                }
                i17 |= 805306368;
                if ((i2 & 6) == 0) {
                    if (bVarI.A(function1)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i11 = i2 | i13;
                } else {
                    i11 = i2;
                }
                if ((i17 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (bVarI.q(i17 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 16) != 0) {
                            bVar2 = new ycg.b("", "error_text");
                            i17 &= -57345;
                        } else {
                            bVar2 = ycgVar;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            gopVar3 = gop.e;
                        } else {
                            gopVar3 = gopVar2;
                        }
                        if (i9 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        int i110 = i17;
                        gopVar4 = gopVar3;
                        i12 = i110;
                        str5 = str6;
                        uni0Var4 = uni0Var3;
                    } else {
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 16) != 0) {
                            bVar2 = new ycg.b("", "error_text");
                            i17 &= -57345;
                        } else {
                            bVar2 = ycgVar;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            gopVar3 = gop.e;
                        } else {
                            gopVar3 = gopVar2;
                        }
                        if (i9 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        int i111 = i17;
                        gopVar4 = gopVar3;
                        i12 = i111;
                        str5 = str6;
                        uni0Var4 = uni0Var3;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = nvc.a(z2, bVarI);
                    }
                    ytwVar = (ytw) objY;
                    if (ijf0Var.a.b.length() == 0) {
                        ytwVar.setValue(Boolean.TRUE);
                    }
                    boolean zBooleanValue2 = ((Boolean) ytwVar.getValue()).booleanValue();
                    lff0 lff0VarB2 = wue.b(bVarI);
                    lff0 lff0VarA2 = lff0VarB2.a(lff0VarB2.a, lff0VarB2.b, ((-1025) & 4) != 0 ? lff0VarB2.c : c68.a(R.color.text_type1_primary, bVarI), lff0VarB2.d, lff0VarB2.e, lff0VarB2.f, ((-1025) & 64) != 0 ? lff0VarB2.g : 0L, lff0VarB2.h, lff0VarB2.i, lff0VarB2.j, ((-1025) & 1024) != 0 ? lff0VarB2.k : null, ((-1025) & 2048) != 0 ? lff0VarB2.l : 0L, ((-1025) & 4096) != 0 ? lff0VarB2.m : 0L, lff0VarB2.n, lff0VarB2.o, lff0VarB2.p, lff0VarB2.q, lff0VarB2.r, lff0VarB2.s, lff0VarB2.t, lff0VarB2.u, lff0VarB2.v, lff0VarB2.w, lff0VarB2.x, lff0VarB2.y, lff0VarB2.z, lff0VarB2.A, lff0VarB2.B, lff0VarB2.C, lff0VarB2.D, lff0VarB2.E, lff0VarB2.F, lff0VarB2.G, lff0VarB2.H, lff0VarB2.I, lff0VarB2.J, lff0VarB2.K, lff0VarB2.L, lff0VarB2.M, lff0VarB2.N, lff0VarB2.O, lff0VarB2.P, lff0VarB2.Q);
                    if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                        bVarI.N(-1799687339);
                        op8VarB = pp8.b(-2031881975, new Function2() { // from class: mtf
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar2 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    Object objY2 = aVar2.y();
                                    if (objY2 == a.C0041a.a) {
                                        final ytw ytwVar2 = ytwVar;
                                        objY2 = new Function0() { // from class: qtf
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                ytwVar2.setValue(Boolean.TRUE);
                                                return Unit.a;
                                            }
                                        };
                                        aVar2.r(objY2);
                                    }
                                    ttf.b((Function0) objY2, aVar2, 6);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI);
                        bVarI.X(false);
                    } else if (ijf0Var.a.b.length() > 0) {
                        bVarI.N(-1799450469);
                        bVarI.X(false);
                        op8VarB = null;
                    } else {
                        bVarI.N(-1799450469);
                        bVarI.X(false);
                        op8VarB = null;
                    }
                    int i24 = i12 << 3;
                    int i25 = (i12 & 1022) | (i24 & 57344) | (i24 & 458752);
                    int i26 = i12 << 6;
                    int i27 = ((i12 >> 21) & 1008) | ((i11 << 18) & 3670016);
                    op8 op8Var2 = op8VarB;
                    bVar = bVarI;
                    boolean z7 = z3;
                    ycg ycgVar4 = bVar2;
                    tyx.c(dVar, ijf0Var, null, op8Var2, z7, ycgVar4, zBooleanValue2, false, str5, str2, lff0VarA2, gopVar4, uni0Var4, 0, null, null, function1, bVar, i25 | (i26 & 234881024) | (i26 & 1879048192), i27, 57472);
                    z5 = z7;
                    ycgVar2 = ycgVar4;
                    str4 = str5;
                    gopVar2 = gopVar4;
                    uni0Var2 = uni0Var4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    ycgVar2 = ycgVar;
                    z5 = z3;
                    str4 = str3;
                    uni0Var2 = uni0Var;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: otf
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            ttf.c(dVar, ijf0Var, z5, ycgVar2, z2, str4, str2, gopVar2, uni0Var2, function1, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i17 |= 1572864;
            str3 = str;
            if ((12582912 & i) != 0) {
                if (bVarI.M(str2)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i17 |= i14;
            }
            i7 = i3 & 256;
            if (i7 != 0) {
                i17 |= 100663296;
                gopVar2 = gopVar;
            } else {
                gopVar2 = gopVar;
                if ((i & 100663296) == 0) {
                    if (bVarI.M(gopVar2)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i17 |= i8;
                }
            }
            i9 = i3 & 512;
            if (i9 != 0) {
                if ((i & 805306368) == 0) {
                    if (bVarI.M(uni0Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i17 |= i10;
                }
                if ((i2 & 6) == 0) {
                    if (bVarI.A(function1)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i11 = i2 | i13;
                } else {
                    i11 = i2;
                }
                if ((i17 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (bVarI.q(i17 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 16) != 0) {
                            bVar2 = new ycg.b("", "error_text");
                            i17 &= -57345;
                        } else {
                            bVar2 = ycgVar;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            gopVar3 = gop.e;
                        } else {
                            gopVar3 = gopVar2;
                        }
                        if (i9 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        int i112 = i17;
                        gopVar4 = gopVar3;
                        i12 = i112;
                        str5 = str6;
                        uni0Var4 = uni0Var3;
                    } else {
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 16) != 0) {
                            bVar2 = new ycg.b("", "error_text");
                            i17 &= -57345;
                        } else {
                            bVar2 = ycgVar;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            gopVar3 = gop.e;
                        } else {
                            gopVar3 = gopVar2;
                        }
                        if (i9 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        int i113 = i17;
                        gopVar4 = gopVar3;
                        i12 = i113;
                        str5 = str6;
                        uni0Var4 = uni0Var3;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = nvc.a(z2, bVarI);
                    }
                    ytwVar = (ytw) objY;
                    if (ijf0Var.a.b.length() == 0) {
                        ytwVar.setValue(Boolean.TRUE);
                    }
                    boolean zBooleanValue3 = ((Boolean) ytwVar.getValue()).booleanValue();
                    lff0 lff0VarB3 = wue.b(bVarI);
                    lff0 lff0VarA3 = lff0VarB3.a(lff0VarB3.a, lff0VarB3.b, ((-1025) & 4) != 0 ? lff0VarB3.c : c68.a(R.color.text_type1_primary, bVarI), lff0VarB3.d, lff0VarB3.e, lff0VarB3.f, ((-1025) & 64) != 0 ? lff0VarB3.g : 0L, lff0VarB3.h, lff0VarB3.i, lff0VarB3.j, ((-1025) & 1024) != 0 ? lff0VarB3.k : null, ((-1025) & 2048) != 0 ? lff0VarB3.l : 0L, ((-1025) & 4096) != 0 ? lff0VarB3.m : 0L, lff0VarB3.n, lff0VarB3.o, lff0VarB3.p, lff0VarB3.q, lff0VarB3.r, lff0VarB3.s, lff0VarB3.t, lff0VarB3.u, lff0VarB3.v, lff0VarB3.w, lff0VarB3.x, lff0VarB3.y, lff0VarB3.z, lff0VarB3.A, lff0VarB3.B, lff0VarB3.C, lff0VarB3.D, lff0VarB3.E, lff0VarB3.F, lff0VarB3.G, lff0VarB3.H, lff0VarB3.I, lff0VarB3.J, lff0VarB3.K, lff0VarB3.L, lff0VarB3.M, lff0VarB3.N, lff0VarB3.O, lff0VarB3.P, lff0VarB3.Q);
                    if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                        bVarI.N(-1799687339);
                        op8VarB = pp8.b(-2031881975, new Function2() { // from class: mtf
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar2 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    Object objY2 = aVar2.y();
                                    if (objY2 == a.C0041a.a) {
                                        final ytw ytwVar2 = ytwVar;
                                        objY2 = new Function0() { // from class: qtf
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                ytwVar2.setValue(Boolean.TRUE);
                                                return Unit.a;
                                            }
                                        };
                                        aVar2.r(objY2);
                                    }
                                    ttf.b((Function0) objY2, aVar2, 6);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI);
                        bVarI.X(false);
                    } else if (ijf0Var.a.b.length() > 0) {
                        bVarI.N(-1799450469);
                        bVarI.X(false);
                        op8VarB = null;
                    } else {
                        bVarI.N(-1799450469);
                        bVarI.X(false);
                        op8VarB = null;
                    }
                    int i28 = i12 << 3;
                    int i29 = (i12 & 1022) | (i28 & 57344) | (i28 & 458752);
                    int i210 = i12 << 6;
                    int i211 = ((i12 >> 21) & 1008) | ((i11 << 18) & 3670016);
                    op8 op8Var3 = op8VarB;
                    bVar = bVarI;
                    boolean z8 = z3;
                    ycg ycgVar5 = bVar2;
                    tyx.c(dVar, ijf0Var, null, op8Var3, z8, ycgVar5, zBooleanValue3, false, str5, str2, lff0VarA3, gopVar4, uni0Var4, 0, null, null, function1, bVar, i29 | (i210 & 234881024) | (i210 & 1879048192), i211, 57472);
                    z5 = z8;
                    ycgVar2 = ycgVar5;
                    str4 = str5;
                    gopVar2 = gopVar4;
                    uni0Var2 = uni0Var4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    ycgVar2 = ycgVar;
                    z5 = z3;
                    str4 = str3;
                    uni0Var2 = uni0Var;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: otf
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            ttf.c(dVar, ijf0Var, z5, ycgVar2, z2, str4, str2, gopVar2, uni0Var2, function1, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i17 |= 805306368;
            if ((i2 & 6) == 0) {
                if (bVarI.A(function1)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i11 = i2 | i13;
            } else {
                i11 = i2;
            }
            if ((i17 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (bVarI.q(i17 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 16) != 0) {
                        bVar2 = new ycg.b("", "error_text");
                        i17 &= -57345;
                    } else {
                        bVar2 = ycgVar;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        gopVar3 = gop.e;
                    } else {
                        gopVar3 = gopVar2;
                    }
                    if (i9 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    int i114 = i17;
                    gopVar4 = gopVar3;
                    i12 = i114;
                    str5 = str6;
                    uni0Var4 = uni0Var3;
                } else {
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 16) != 0) {
                        bVar2 = new ycg.b("", "error_text");
                        i17 &= -57345;
                    } else {
                        bVar2 = ycgVar;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        gopVar3 = gop.e;
                    } else {
                        gopVar3 = gopVar2;
                    }
                    if (i9 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    int i115 = i17;
                    gopVar4 = gopVar3;
                    i12 = i115;
                    str5 = str6;
                    uni0Var4 = uni0Var3;
                }
                bVarI.Y();
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = nvc.a(z2, bVarI);
                }
                ytwVar = (ytw) objY;
                if (ijf0Var.a.b.length() == 0) {
                    ytwVar.setValue(Boolean.TRUE);
                }
                boolean zBooleanValue4 = ((Boolean) ytwVar.getValue()).booleanValue();
                lff0 lff0VarB4 = wue.b(bVarI);
                lff0 lff0VarA4 = lff0VarB4.a(lff0VarB4.a, lff0VarB4.b, ((-1025) & 4) != 0 ? lff0VarB4.c : c68.a(R.color.text_type1_primary, bVarI), lff0VarB4.d, lff0VarB4.e, lff0VarB4.f, ((-1025) & 64) != 0 ? lff0VarB4.g : 0L, lff0VarB4.h, lff0VarB4.i, lff0VarB4.j, ((-1025) & 1024) != 0 ? lff0VarB4.k : null, ((-1025) & 2048) != 0 ? lff0VarB4.l : 0L, ((-1025) & 4096) != 0 ? lff0VarB4.m : 0L, lff0VarB4.n, lff0VarB4.o, lff0VarB4.p, lff0VarB4.q, lff0VarB4.r, lff0VarB4.s, lff0VarB4.t, lff0VarB4.u, lff0VarB4.v, lff0VarB4.w, lff0VarB4.x, lff0VarB4.y, lff0VarB4.z, lff0VarB4.A, lff0VarB4.B, lff0VarB4.C, lff0VarB4.D, lff0VarB4.E, lff0VarB4.F, lff0VarB4.G, lff0VarB4.H, lff0VarB4.I, lff0VarB4.J, lff0VarB4.K, lff0VarB4.L, lff0VarB4.M, lff0VarB4.N, lff0VarB4.O, lff0VarB4.P, lff0VarB4.Q);
                if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVarI.N(-1799687339);
                    op8VarB = pp8.b(-2031881975, new Function2() { // from class: mtf
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Object objY2 = aVar2.y();
                                if (objY2 == a.C0041a.a) {
                                    final ytw ytwVar2 = ytwVar;
                                    objY2 = new Function0() { // from class: qtf
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            ytwVar2.setValue(Boolean.TRUE);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                ttf.b((Function0) objY2, aVar2, 6);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI);
                    bVarI.X(false);
                } else if (ijf0Var.a.b.length() > 0) {
                    bVarI.N(-1799450469);
                    bVarI.X(false);
                    op8VarB = null;
                } else {
                    bVarI.N(-1799450469);
                    bVarI.X(false);
                    op8VarB = null;
                }
                int i212 = i12 << 3;
                int i213 = (i12 & 1022) | (i212 & 57344) | (i212 & 458752);
                int i214 = i12 << 6;
                int i215 = ((i12 >> 21) & 1008) | ((i11 << 18) & 3670016);
                op8 op8Var4 = op8VarB;
                bVar = bVarI;
                boolean z9 = z3;
                ycg ycgVar6 = bVar2;
                tyx.c(dVar, ijf0Var, null, op8Var4, z9, ycgVar6, zBooleanValue4, false, str5, str2, lff0VarA4, gopVar4, uni0Var4, 0, null, null, function1, bVar, i213 | (i214 & 234881024) | (i214 & 1879048192), i215, 57472);
                z5 = z9;
                ycgVar2 = ycgVar6;
                str4 = str5;
                gopVar2 = gopVar4;
                uni0Var2 = uni0Var4;
            } else {
                bVar = bVarI;
                bVar.G();
                ycgVar2 = ycgVar;
                z5 = z3;
                str4 = str3;
                uni0Var2 = uni0Var;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: otf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        ttf.c(dVar, ijf0Var, z5, ycgVar2, z2, str4, str2, gopVar2, uni0Var2, function1, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i17 = i4 | 3456;
        z3 = z;
        if ((i & 24576) == 0) {
            if ((i3 & 16) != 0) {
                i16 = 8192;
            } else {
                if ((32768 & i) == 0) {
                    zA = bVarI.M(ycgVar);
                } else {
                    zA = bVarI.A(ycgVar);
                }
                if (zA) {
                    i16 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i16 = 8192;
                }
            }
            i17 |= i16;
        }
        if ((196608 & i) == 0) {
            if (bVarI.b(z2)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i17 |= i15;
        }
        i5 = i3 & 64;
        if (i5 != 0) {
            if ((1572864 & i) == 0) {
                str3 = str;
                if (bVarI.M(str3)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i17 |= i6;
            }
            if ((12582912 & i) != 0) {
                if (bVarI.M(str2)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i17 |= i14;
            }
            i7 = i3 & 256;
            if (i7 != 0) {
                i17 |= 100663296;
                gopVar2 = gopVar;
            } else {
                gopVar2 = gopVar;
                if ((i & 100663296) == 0) {
                    if (bVarI.M(gopVar2)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i17 |= i8;
                }
            }
            i9 = i3 & 512;
            if (i9 != 0) {
                if ((i & 805306368) == 0) {
                    if (bVarI.M(uni0Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i17 |= i10;
                }
                if ((i2 & 6) == 0) {
                    if (bVarI.A(function1)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i11 = i2 | i13;
                } else {
                    i11 = i2;
                }
                if ((i17 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (bVarI.q(i17 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 16) != 0) {
                            bVar2 = new ycg.b("", "error_text");
                            i17 &= -57345;
                        } else {
                            bVar2 = ycgVar;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            gopVar3 = gop.e;
                        } else {
                            gopVar3 = gopVar2;
                        }
                        if (i9 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        int i116 = i17;
                        gopVar4 = gopVar3;
                        i12 = i116;
                        str5 = str6;
                        uni0Var4 = uni0Var3;
                    } else {
                        if (i18 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 16) != 0) {
                            bVar2 = new ycg.b("", "error_text");
                            i17 &= -57345;
                        } else {
                            bVar2 = ycgVar;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            gopVar3 = gop.e;
                        } else {
                            gopVar3 = gopVar2;
                        }
                        if (i9 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        int i117 = i17;
                        gopVar4 = gopVar3;
                        i12 = i117;
                        str5 = str6;
                        uni0Var4 = uni0Var3;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = nvc.a(z2, bVarI);
                    }
                    ytwVar = (ytw) objY;
                    if (ijf0Var.a.b.length() == 0) {
                        ytwVar.setValue(Boolean.TRUE);
                    }
                    boolean zBooleanValue5 = ((Boolean) ytwVar.getValue()).booleanValue();
                    lff0 lff0VarB5 = wue.b(bVarI);
                    lff0 lff0VarA5 = lff0VarB5.a(lff0VarB5.a, lff0VarB5.b, ((-1025) & 4) != 0 ? lff0VarB5.c : c68.a(R.color.text_type1_primary, bVarI), lff0VarB5.d, lff0VarB5.e, lff0VarB5.f, ((-1025) & 64) != 0 ? lff0VarB5.g : 0L, lff0VarB5.h, lff0VarB5.i, lff0VarB5.j, ((-1025) & 1024) != 0 ? lff0VarB5.k : null, ((-1025) & 2048) != 0 ? lff0VarB5.l : 0L, ((-1025) & 4096) != 0 ? lff0VarB5.m : 0L, lff0VarB5.n, lff0VarB5.o, lff0VarB5.p, lff0VarB5.q, lff0VarB5.r, lff0VarB5.s, lff0VarB5.t, lff0VarB5.u, lff0VarB5.v, lff0VarB5.w, lff0VarB5.x, lff0VarB5.y, lff0VarB5.z, lff0VarB5.A, lff0VarB5.B, lff0VarB5.C, lff0VarB5.D, lff0VarB5.E, lff0VarB5.F, lff0VarB5.G, lff0VarB5.H, lff0VarB5.I, lff0VarB5.J, lff0VarB5.K, lff0VarB5.L, lff0VarB5.M, lff0VarB5.N, lff0VarB5.O, lff0VarB5.P, lff0VarB5.Q);
                    if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                        bVarI.N(-1799687339);
                        op8VarB = pp8.b(-2031881975, new Function2() { // from class: mtf
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar2 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    Object objY2 = aVar2.y();
                                    if (objY2 == a.C0041a.a) {
                                        final ytw ytwVar2 = ytwVar;
                                        objY2 = new Function0() { // from class: qtf
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                ytwVar2.setValue(Boolean.TRUE);
                                                return Unit.a;
                                            }
                                        };
                                        aVar2.r(objY2);
                                    }
                                    ttf.b((Function0) objY2, aVar2, 6);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI);
                        bVarI.X(false);
                    } else if (ijf0Var.a.b.length() > 0) {
                        bVarI.N(-1799450469);
                        bVarI.X(false);
                        op8VarB = null;
                    } else {
                        bVarI.N(-1799450469);
                        bVarI.X(false);
                        op8VarB = null;
                    }
                    int i216 = i12 << 3;
                    int i217 = (i12 & 1022) | (i216 & 57344) | (i216 & 458752);
                    int i218 = i12 << 6;
                    int i219 = ((i12 >> 21) & 1008) | ((i11 << 18) & 3670016);
                    op8 op8Var5 = op8VarB;
                    bVar = bVarI;
                    boolean z10 = z3;
                    ycg ycgVar7 = bVar2;
                    tyx.c(dVar, ijf0Var, null, op8Var5, z10, ycgVar7, zBooleanValue5, false, str5, str2, lff0VarA5, gopVar4, uni0Var4, 0, null, null, function1, bVar, i217 | (i218 & 234881024) | (i218 & 1879048192), i219, 57472);
                    z5 = z10;
                    ycgVar2 = ycgVar7;
                    str4 = str5;
                    gopVar2 = gopVar4;
                    uni0Var2 = uni0Var4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    ycgVar2 = ycgVar;
                    z5 = z3;
                    str4 = str3;
                    uni0Var2 = uni0Var;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: otf
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            ttf.c(dVar, ijf0Var, z5, ycgVar2, z2, str4, str2, gopVar2, uni0Var2, function1, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i17 |= 805306368;
            if ((i2 & 6) == 0) {
                if (bVarI.A(function1)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i11 = i2 | i13;
            } else {
                i11 = i2;
            }
            if ((i17 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (bVarI.q(i17 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 16) != 0) {
                        bVar2 = new ycg.b("", "error_text");
                        i17 &= -57345;
                    } else {
                        bVar2 = ycgVar;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        gopVar3 = gop.e;
                    } else {
                        gopVar3 = gopVar2;
                    }
                    if (i9 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    int i118 = i17;
                    gopVar4 = gopVar3;
                    i12 = i118;
                    str5 = str6;
                    uni0Var4 = uni0Var3;
                } else {
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 16) != 0) {
                        bVar2 = new ycg.b("", "error_text");
                        i17 &= -57345;
                    } else {
                        bVar2 = ycgVar;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        gopVar3 = gop.e;
                    } else {
                        gopVar3 = gopVar2;
                    }
                    if (i9 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    int i119 = i17;
                    gopVar4 = gopVar3;
                    i12 = i119;
                    str5 = str6;
                    uni0Var4 = uni0Var3;
                }
                bVarI.Y();
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = nvc.a(z2, bVarI);
                }
                ytwVar = (ytw) objY;
                if (ijf0Var.a.b.length() == 0) {
                    ytwVar.setValue(Boolean.TRUE);
                }
                boolean zBooleanValue6 = ((Boolean) ytwVar.getValue()).booleanValue();
                lff0 lff0VarB6 = wue.b(bVarI);
                lff0 lff0VarA6 = lff0VarB6.a(lff0VarB6.a, lff0VarB6.b, ((-1025) & 4) != 0 ? lff0VarB6.c : c68.a(R.color.text_type1_primary, bVarI), lff0VarB6.d, lff0VarB6.e, lff0VarB6.f, ((-1025) & 64) != 0 ? lff0VarB6.g : 0L, lff0VarB6.h, lff0VarB6.i, lff0VarB6.j, ((-1025) & 1024) != 0 ? lff0VarB6.k : null, ((-1025) & 2048) != 0 ? lff0VarB6.l : 0L, ((-1025) & 4096) != 0 ? lff0VarB6.m : 0L, lff0VarB6.n, lff0VarB6.o, lff0VarB6.p, lff0VarB6.q, lff0VarB6.r, lff0VarB6.s, lff0VarB6.t, lff0VarB6.u, lff0VarB6.v, lff0VarB6.w, lff0VarB6.x, lff0VarB6.y, lff0VarB6.z, lff0VarB6.A, lff0VarB6.B, lff0VarB6.C, lff0VarB6.D, lff0VarB6.E, lff0VarB6.F, lff0VarB6.G, lff0VarB6.H, lff0VarB6.I, lff0VarB6.J, lff0VarB6.K, lff0VarB6.L, lff0VarB6.M, lff0VarB6.N, lff0VarB6.O, lff0VarB6.P, lff0VarB6.Q);
                if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVarI.N(-1799687339);
                    op8VarB = pp8.b(-2031881975, new Function2() { // from class: mtf
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Object objY2 = aVar2.y();
                                if (objY2 == a.C0041a.a) {
                                    final ytw ytwVar2 = ytwVar;
                                    objY2 = new Function0() { // from class: qtf
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            ytwVar2.setValue(Boolean.TRUE);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                ttf.b((Function0) objY2, aVar2, 6);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI);
                    bVarI.X(false);
                } else if (ijf0Var.a.b.length() > 0) {
                    bVarI.N(-1799450469);
                    bVarI.X(false);
                    op8VarB = null;
                } else {
                    bVarI.N(-1799450469);
                    bVarI.X(false);
                    op8VarB = null;
                }
                int i2110 = i12 << 3;
                int i2111 = (i12 & 1022) | (i2110 & 57344) | (i2110 & 458752);
                int i2112 = i12 << 6;
                int i2113 = ((i12 >> 21) & 1008) | ((i11 << 18) & 3670016);
                op8 op8Var6 = op8VarB;
                bVar = bVarI;
                boolean z11 = z3;
                ycg ycgVar8 = bVar2;
                tyx.c(dVar, ijf0Var, null, op8Var6, z11, ycgVar8, zBooleanValue6, false, str5, str2, lff0VarA6, gopVar4, uni0Var4, 0, null, null, function1, bVar, i2111 | (i2112 & 234881024) | (i2112 & 1879048192), i2113, 57472);
                z5 = z11;
                ycgVar2 = ycgVar8;
                str4 = str5;
                gopVar2 = gopVar4;
                uni0Var2 = uni0Var4;
            } else {
                bVar = bVarI;
                bVar.G();
                ycgVar2 = ycgVar;
                z5 = z3;
                str4 = str3;
                uni0Var2 = uni0Var;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: otf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        ttf.c(dVar, ijf0Var, z5, ycgVar2, z2, str4, str2, gopVar2, uni0Var2, function1, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i17 |= 1572864;
        str3 = str;
        if ((12582912 & i) != 0) {
            if (bVarI.M(str2)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i17 |= i14;
        }
        i7 = i3 & 256;
        if (i7 != 0) {
            i17 |= 100663296;
            gopVar2 = gopVar;
        } else {
            gopVar2 = gopVar;
            if ((i & 100663296) == 0) {
                if (bVarI.M(gopVar2)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i17 |= i8;
            }
        }
        i9 = i3 & 512;
        if (i9 != 0) {
            if ((i & 805306368) == 0) {
                if (bVarI.M(uni0Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i17 |= i10;
            }
            if ((i2 & 6) == 0) {
                if (bVarI.A(function1)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i11 = i2 | i13;
            } else {
                i11 = i2;
            }
            if ((i17 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (bVarI.q(i17 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 16) != 0) {
                        bVar2 = new ycg.b("", "error_text");
                        i17 &= -57345;
                    } else {
                        bVar2 = ycgVar;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        gopVar3 = gop.e;
                    } else {
                        gopVar3 = gopVar2;
                    }
                    if (i9 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    int i1110 = i17;
                    gopVar4 = gopVar3;
                    i12 = i1110;
                    str5 = str6;
                    uni0Var4 = uni0Var3;
                } else {
                    if (i18 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 16) != 0) {
                        bVar2 = new ycg.b("", "error_text");
                        i17 &= -57345;
                    } else {
                        bVar2 = ycgVar;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        gopVar3 = gop.e;
                    } else {
                        gopVar3 = gopVar2;
                    }
                    if (i9 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    int i1111 = i17;
                    gopVar4 = gopVar3;
                    i12 = i1111;
                    str5 = str6;
                    uni0Var4 = uni0Var3;
                }
                bVarI.Y();
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = nvc.a(z2, bVarI);
                }
                ytwVar = (ytw) objY;
                if (ijf0Var.a.b.length() == 0) {
                    ytwVar.setValue(Boolean.TRUE);
                }
                boolean zBooleanValue7 = ((Boolean) ytwVar.getValue()).booleanValue();
                lff0 lff0VarB7 = wue.b(bVarI);
                lff0 lff0VarA7 = lff0VarB7.a(lff0VarB7.a, lff0VarB7.b, ((-1025) & 4) != 0 ? lff0VarB7.c : c68.a(R.color.text_type1_primary, bVarI), lff0VarB7.d, lff0VarB7.e, lff0VarB7.f, ((-1025) & 64) != 0 ? lff0VarB7.g : 0L, lff0VarB7.h, lff0VarB7.i, lff0VarB7.j, ((-1025) & 1024) != 0 ? lff0VarB7.k : null, ((-1025) & 2048) != 0 ? lff0VarB7.l : 0L, ((-1025) & 4096) != 0 ? lff0VarB7.m : 0L, lff0VarB7.n, lff0VarB7.o, lff0VarB7.p, lff0VarB7.q, lff0VarB7.r, lff0VarB7.s, lff0VarB7.t, lff0VarB7.u, lff0VarB7.v, lff0VarB7.w, lff0VarB7.x, lff0VarB7.y, lff0VarB7.z, lff0VarB7.A, lff0VarB7.B, lff0VarB7.C, lff0VarB7.D, lff0VarB7.E, lff0VarB7.F, lff0VarB7.G, lff0VarB7.H, lff0VarB7.I, lff0VarB7.J, lff0VarB7.K, lff0VarB7.L, lff0VarB7.M, lff0VarB7.N, lff0VarB7.O, lff0VarB7.P, lff0VarB7.Q);
                if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVarI.N(-1799687339);
                    op8VarB = pp8.b(-2031881975, new Function2() { // from class: mtf
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Object objY2 = aVar2.y();
                                if (objY2 == a.C0041a.a) {
                                    final ytw ytwVar2 = ytwVar;
                                    objY2 = new Function0() { // from class: qtf
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            ytwVar2.setValue(Boolean.TRUE);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                ttf.b((Function0) objY2, aVar2, 6);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI);
                    bVarI.X(false);
                } else if (ijf0Var.a.b.length() > 0) {
                    bVarI.N(-1799450469);
                    bVarI.X(false);
                    op8VarB = null;
                } else {
                    bVarI.N(-1799450469);
                    bVarI.X(false);
                    op8VarB = null;
                }
                int i2114 = i12 << 3;
                int i2115 = (i12 & 1022) | (i2114 & 57344) | (i2114 & 458752);
                int i2116 = i12 << 6;
                int i2117 = ((i12 >> 21) & 1008) | ((i11 << 18) & 3670016);
                op8 op8Var7 = op8VarB;
                bVar = bVarI;
                boolean z12 = z3;
                ycg ycgVar9 = bVar2;
                tyx.c(dVar, ijf0Var, null, op8Var7, z12, ycgVar9, zBooleanValue7, false, str5, str2, lff0VarA7, gopVar4, uni0Var4, 0, null, null, function1, bVar, i2115 | (i2116 & 234881024) | (i2116 & 1879048192), i2117, 57472);
                z5 = z12;
                ycgVar2 = ycgVar9;
                str4 = str5;
                gopVar2 = gopVar4;
                uni0Var2 = uni0Var4;
            } else {
                bVar = bVarI;
                bVar.G();
                ycgVar2 = ycgVar;
                z5 = z3;
                str4 = str3;
                uni0Var2 = uni0Var;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: otf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        ttf.c(dVar, ijf0Var, z5, ycgVar2, z2, str4, str2, gopVar2, uni0Var2, function1, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i17 |= 805306368;
        if ((i2 & 6) == 0) {
            if (bVarI.A(function1)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i2 | i13;
        } else {
            i11 = i2;
        }
        if ((i17 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (bVarI.q(i17 & 1, z4)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i18 != 0) {
                    z3 = false;
                }
                if ((i3 & 16) != 0) {
                    bVar2 = new ycg.b("", "error_text");
                    i17 &= -57345;
                } else {
                    bVar2 = ycgVar;
                }
                if (i5 == 0) {
                }
                if (i7 != 0) {
                    gopVar3 = gop.e;
                } else {
                    gopVar3 = gopVar2;
                }
                if (i9 != 0) {
                    uni0Var3 = uni0.a.a;
                } else {
                    uni0Var3 = uni0Var;
                }
                int i1112 = i17;
                gopVar4 = gopVar3;
                i12 = i1112;
                str5 = str6;
                uni0Var4 = uni0Var3;
            } else {
                if (i18 != 0) {
                    z3 = false;
                }
                if ((i3 & 16) != 0) {
                    bVar2 = new ycg.b("", "error_text");
                    i17 &= -57345;
                } else {
                    bVar2 = ycgVar;
                }
                if (i5 == 0) {
                }
                if (i7 != 0) {
                    gopVar3 = gop.e;
                } else {
                    gopVar3 = gopVar2;
                }
                if (i9 != 0) {
                    uni0Var3 = uni0.a.a;
                } else {
                    uni0Var3 = uni0Var;
                }
                int i1113 = i17;
                gopVar4 = gopVar3;
                i12 = i1113;
                str5 = str6;
                uni0Var4 = uni0Var3;
            }
            bVarI.Y();
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = nvc.a(z2, bVarI);
            }
            ytwVar = (ytw) objY;
            if (ijf0Var.a.b.length() == 0) {
                ytwVar.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue8 = ((Boolean) ytwVar.getValue()).booleanValue();
            lff0 lff0VarB8 = wue.b(bVarI);
            lff0 lff0VarA8 = lff0VarB8.a(lff0VarB8.a, lff0VarB8.b, ((-1025) & 4) != 0 ? lff0VarB8.c : c68.a(R.color.text_type1_primary, bVarI), lff0VarB8.d, lff0VarB8.e, lff0VarB8.f, ((-1025) & 64) != 0 ? lff0VarB8.g : 0L, lff0VarB8.h, lff0VarB8.i, lff0VarB8.j, ((-1025) & 1024) != 0 ? lff0VarB8.k : null, ((-1025) & 2048) != 0 ? lff0VarB8.l : 0L, ((-1025) & 4096) != 0 ? lff0VarB8.m : 0L, lff0VarB8.n, lff0VarB8.o, lff0VarB8.p, lff0VarB8.q, lff0VarB8.r, lff0VarB8.s, lff0VarB8.t, lff0VarB8.u, lff0VarB8.v, lff0VarB8.w, lff0VarB8.x, lff0VarB8.y, lff0VarB8.z, lff0VarB8.A, lff0VarB8.B, lff0VarB8.C, lff0VarB8.D, lff0VarB8.E, lff0VarB8.F, lff0VarB8.G, lff0VarB8.H, lff0VarB8.I, lff0VarB8.J, lff0VarB8.K, lff0VarB8.L, lff0VarB8.M, lff0VarB8.N, lff0VarB8.O, lff0VarB8.P, lff0VarB8.Q);
            if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                bVarI.N(-1799687339);
                op8VarB = pp8.b(-2031881975, new Function2() { // from class: mtf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Object objY2 = aVar2.y();
                            if (objY2 == a.C0041a.a) {
                                final ytw ytwVar2 = ytwVar;
                                objY2 = new Function0() { // from class: qtf
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ytwVar2.setValue(Boolean.TRUE);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY2);
                            }
                            ttf.b((Function0) objY2, aVar2, 6);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI);
                bVarI.X(false);
            } else if (ijf0Var.a.b.length() > 0) {
                bVarI.N(-1799450469);
                bVarI.X(false);
                op8VarB = null;
            } else {
                bVarI.N(-1799450469);
                bVarI.X(false);
                op8VarB = null;
            }
            int i2118 = i12 << 3;
            int i2119 = (i12 & 1022) | (i2118 & 57344) | (i2118 & 458752);
            int i21110 = i12 << 6;
            int i21111 = ((i12 >> 21) & 1008) | ((i11 << 18) & 3670016);
            op8 op8Var8 = op8VarB;
            bVar = bVarI;
            boolean z13 = z3;
            ycg ycgVar10 = bVar2;
            tyx.c(dVar, ijf0Var, null, op8Var8, z13, ycgVar10, zBooleanValue8, false, str5, str2, lff0VarA8, gopVar4, uni0Var4, 0, null, null, function1, bVar, i2119 | (i21110 & 234881024) | (i21110 & 1879048192), i21111, 57472);
            z5 = z13;
            ycgVar2 = ycgVar10;
            str4 = str5;
            gopVar2 = gopVar4;
            uni0Var2 = uni0Var4;
        } else {
            bVar = bVarI;
            bVar.G();
            ycgVar2 = ycgVar;
            z5 = z3;
            str4 = str3;
            uni0Var2 = uni0Var;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: otf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    ttf.c(dVar, ijf0Var, z5, ycgVar2, z2, str4, str2, gopVar2, uni0Var2, function1, (a) obj, iA, iA2, i3);
                    return Unit.a;
                }
            };
        }
    }
}
