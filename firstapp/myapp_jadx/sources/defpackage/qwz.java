package defpackage;

import android.os.Build;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class qwz {
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final d dVar, final ijf0 ijf0Var, final boolean z, final ycg ycgVar, boolean z2, String str, String str2, gop gopVar, final Function1 function1, a aVar, final int i, final int i2) {
        String str3;
        int i3;
        final String str4;
        int i4;
        gop gopVar2;
        int i5;
        int i6;
        final boolean z3;
        boolean z4;
        final boolean z5;
        final String str5;
        final gop gopVar3;
        e eVarZ;
        Object objY;
        b bVarI = aVar.i(-1674200587);
        int i7 = i | (bVarI.M(ijf0Var) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.M(ycgVar) ? 2048 : 1024);
        int i8 = i7 | 24576;
        int i9 = i2 & 32;
        if (i9 != 0) {
            i3 = i7 | 221184;
            str3 = str;
        } else {
            str3 = str;
            i3 = i8 | (bVarI.M(str3) ? 131072 : 65536);
        }
        int i10 = i2 & 64;
        if (i10 != 0) {
            i4 = i3 | 1572864;
            str4 = str2;
        } else {
            str4 = str2;
            i4 = i3 | (bVarI.M(str4) ? 1048576 : 524288);
        }
        int i11 = i2 & 128;
        if (i11 == 0) {
            if ((i & 12582912) == 0) {
                gopVar2 = gopVar;
                i4 |= bVarI.M(gopVar2) ? 8388608 : 4194304;
            }
            int i12 = i4 | 100663296;
            if (bVarI.A(function1)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i6 = i12 | i5;
            z3 = true;
            if ((306783379 & i6) == 306783378) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (bVarI.q(i6 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0 || bVarI.h0()) {
                    if (i9 != 0) {
                        str3 = "";
                    }
                    if (i10 != 0) {
                        str4 = "";
                    }
                    if (i11 != 0) {
                        gopVar2 = new gop(7, 0, 123);
                    }
                } else {
                    bVarI.G();
                    z3 = z2;
                }
                final String str6 = str3;
                final String str7 = str4;
                final gop gopVar4 = gopVar2;
                bVarI.Y();
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = m.b(Boolean.FALSE);
                    bVarI.r(objY);
                }
                final ytw ytwVar = (ytw) objY;
                final boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                vqe.a(6, pp8.b(-1777472553, new Function2() { // from class: kwz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        op8 op8VarB;
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Object objY2 = aVar2.y();
                            if (objY2 == a.C0041a.a) {
                                objY2 = new owz();
                                aVar2.r(objY2);
                            }
                            d dVarA = xa80.a(dVar, (Function1) objY2);
                            final boolean z6 = zBooleanValue;
                            uni0 zwzVar = z6 ? uni0.a.a : new zwz(0);
                            ijf0 ijf0Var2 = ijf0Var;
                            int length = ijf0Var2.a.b.length();
                            boolean z7 = z3;
                            final Function1 function2 = function1;
                            if (length <= 0 || !z7) {
                                aVar2.N(-30620378);
                                aVar2.H();
                                op8VarB = null;
                            } else {
                                aVar2.N(-32144833);
                                final ytw ytwVar2 = ytwVar;
                                op8VarB = pp8.b(-2057842245, new Function2() { // from class: pwz
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        a aVar3 = (a) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar3, 48);
                                            int iHashCode = Long.hashCode(aVar3.m());
                                            ne00 ne00VarO = aVar3.o();
                                            d.a aVar4 = d.a.b;
                                            d dVarC = c.c(aVar3, aVar4);
                                            yka.k.getClass();
                                            tsr.a aVar5 = yka.a.b;
                                            if (aVar3.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar3.D();
                                            if (aVar3.g()) {
                                                aVar3.F(aVar5);
                                            } else {
                                                aVar3.p();
                                            }
                                            hlh0.a(aVar3, d160VarA, yka.a.f);
                                            hlh0.a(aVar3, ne00VarO, yka.a.e);
                                            yka.a.C1350a c1350a = yka.a.g;
                                            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                                j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                            }
                                            hlh0.a(aVar3, dVarC, yka.a.d);
                                            final Function1 function3 = function2;
                                            boolean zM = aVar3.M(function3);
                                            Object objY3 = aVar3.y();
                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                            if (zM || objY3 == c0042a) {
                                                objY3 = new Function0() { // from class: fwz
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        function3.invoke(new ijf0((String) null, 0L, 7));
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar3.r(objY3);
                                            }
                                            c6n.a((Function0) objY3, j.r(aVar4, 20.0f), false, null, null, uh9.a, aVar3, 1572912, 60);
                                            boolean zM2 = aVar3.M(null);
                                            Object objY4 = aVar3.y();
                                            if (zM2 || objY4 == c0042a) {
                                                objY4 = new boq(ytwVar2, 1);
                                                aVar3.r(objY4);
                                            }
                                            d dVarR = j.r(aVar4, 40.0f);
                                            final boolean z8 = z6;
                                            c6n.a((Function0) objY4, dVarR, false, null, null, pp8.b(1529354402, new Function2() { // from class: gwz
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj5, Object obj6) {
                                                    a aVar6 = (a) obj5;
                                                    int iIntValue3 = ((Integer) obj6).intValue();
                                                    if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        h6n.b(erz.a(z8 ? R.drawable.open_eye : R.drawable.close_eye, 0, aVar6), "clear text", j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar6), aVar6, 432, 0);
                                                    } else {
                                                        aVar6.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, aVar3), aVar3, 1572912, 60);
                                            aVar3.s();
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2);
                                aVar2.H();
                            }
                            tyx.c(dVarA, ijf0Var2, null, op8VarB, z, ycgVar, z7, false, str6, str7, null, gopVar4, zwzVar, 0, null, null, function2, aVar2, 0, 0, 58500);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI);
                z5 = z3;
                str5 = str6;
                str4 = str7;
                gopVar3 = gopVar4;
            } else {
                bVarI.G();
                z5 = z2;
                str5 = str3;
                gopVar3 = gopVar2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: lwz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qwz.a(dVar, ijf0Var, z, ycgVar, z5, str5, str4, gopVar3, function1, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 12582912;
        gopVar2 = gopVar;
        int i13 = i4 | 100663296;
        if (bVarI.A(function1)) {
            i5 = 536870912;
        } else {
            i5 = 268435456;
        }
        i6 = i13 | i5;
        z3 = true;
        if ((306783379 & i6) == 306783378) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (bVarI.q(i6 & 1, z4)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    str3 = "";
                }
                if (i10 != 0) {
                    str4 = "";
                }
                if (i11 != 0) {
                    gopVar2 = new gop(7, 0, 123);
                }
            } else {
                if (i9 != 0) {
                    str3 = "";
                }
                if (i10 != 0) {
                    str4 = "";
                }
                if (i11 != 0) {
                    gopVar2 = new gop(7, 0, 123);
                }
            }
            final String str8 = str3;
            final String str9 = str4;
            final gop gopVar5 = gopVar2;
            bVarI.Y();
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar2 = (ytw) objY;
            final boolean zBooleanValue2 = ((Boolean) ytwVar2.getValue()).booleanValue();
            vqe.a(6, pp8.b(-1777472553, new Function2() { // from class: kwz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    op8 op8VarB;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objY2 = aVar2.y();
                        if (objY2 == a.C0041a.a) {
                            objY2 = new owz();
                            aVar2.r(objY2);
                        }
                        d dVarA = xa80.a(dVar, (Function1) objY2);
                        final boolean z6 = zBooleanValue2;
                        uni0 zwzVar = z6 ? uni0.a.a : new zwz(0);
                        ijf0 ijf0Var2 = ijf0Var;
                        int length = ijf0Var2.a.b.length();
                        boolean z7 = z3;
                        final Function1 function2 = function1;
                        if (length <= 0 || !z7) {
                            aVar2.N(-30620378);
                            aVar2.H();
                            op8VarB = null;
                        } else {
                            aVar2.N(-32144833);
                            final ytw ytwVar3 = ytwVar2;
                            op8VarB = pp8.b(-2057842245, new Function2() { // from class: pwz
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    a aVar3 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar3, 48);
                                        int iHashCode = Long.hashCode(aVar3.m());
                                        ne00 ne00VarO = aVar3.o();
                                        d.a aVar4 = d.a.b;
                                        d dVarC = c.c(aVar3, aVar4);
                                        yka.k.getClass();
                                        tsr.a aVar5 = yka.a.b;
                                        if (aVar3.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar3.D();
                                        if (aVar3.g()) {
                                            aVar3.F(aVar5);
                                        } else {
                                            aVar3.p();
                                        }
                                        hlh0.a(aVar3, d160VarA, yka.a.f);
                                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                                        yka.a.C1350a c1350a = yka.a.g;
                                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                        }
                                        hlh0.a(aVar3, dVarC, yka.a.d);
                                        final Function1 function3 = function2;
                                        boolean zM = aVar3.M(function3);
                                        Object objY3 = aVar3.y();
                                        a.C0041a.C0042a c0042a = a.C0041a.a;
                                        if (zM || objY3 == c0042a) {
                                            objY3 = new Function0() { // from class: fwz
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    function3.invoke(new ijf0((String) null, 0L, 7));
                                                    return Unit.a;
                                                }
                                            };
                                            aVar3.r(objY3);
                                        }
                                        c6n.a((Function0) objY3, j.r(aVar4, 20.0f), false, null, null, uh9.a, aVar3, 1572912, 60);
                                        boolean zM2 = aVar3.M(null);
                                        Object objY4 = aVar3.y();
                                        if (zM2 || objY4 == c0042a) {
                                            objY4 = new boq(ytwVar3, 1);
                                            aVar3.r(objY4);
                                        }
                                        d dVarR = j.r(aVar4, 40.0f);
                                        final boolean z8 = z6;
                                        c6n.a((Function0) objY4, dVarR, false, null, null, pp8.b(1529354402, new Function2() { // from class: gwz
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj5, Object obj6) {
                                                a aVar6 = (a) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                if (aVar6.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    h6n.b(erz.a(z8 ? R.drawable.open_eye : R.drawable.close_eye, 0, aVar6), "clear text", j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar6), aVar6, 432, 0);
                                                } else {
                                                    aVar6.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar3), aVar3, 1572912, 60);
                                        aVar3.s();
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2);
                            aVar2.H();
                        }
                        tyx.c(dVarA, ijf0Var2, null, op8VarB, z, ycgVar, z7, false, str8, str9, null, gopVar5, zwzVar, 0, null, null, function2, aVar2, 0, 0, 58500);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI);
            z5 = z3;
            str5 = str8;
            str4 = str9;
            gopVar3 = gopVar5;
        } else {
            bVarI.G();
            z5 = z2;
            str5 = str3;
            gopVar3 = gopVar2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lwz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qwz.a(dVar, ijf0Var, z, ycgVar, z5, str5, str4, gopVar3, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x013e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0142  */
    /* JADX WARN: Code duplicated, block: B:111:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0162  */
    /* JADX WARN: Code duplicated, block: B:120:0x0165  */
    /* JADX WARN: Code duplicated, block: B:123:0x016c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0173  */
    /* JADX WARN: Code duplicated, block: B:127:0x0176  */
    /* JADX WARN: Code duplicated, block: B:129:0x017c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0184  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:149:0x01da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:165:0x0204  */
    /* JADX WARN: Code duplicated, block: B:168:0x0208  */
    /* JADX WARN: Code duplicated, block: B:169:0x020a  */
    /* JADX WARN: Code duplicated, block: B:171:0x020e  */
    /* JADX WARN: Code duplicated, block: B:172:0x0211  */
    /* JADX WARN: Code duplicated, block: B:175:0x0217  */
    /* JADX WARN: Code duplicated, block: B:176:0x021e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0222  */
    /* JADX WARN: Code duplicated, block: B:180:0x0235  */
    /* JADX WARN: Code duplicated, block: B:183:0x0249  */
    /* JADX WARN: Code duplicated, block: B:186:0x0258  */
    /* JADX WARN: Code duplicated, block: B:188:0x025f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0296  */
    /* JADX WARN: Code duplicated, block: B:193:0x02af  */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0122  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final d dVar, final ijf0 ijf0Var, boolean z, ycg ycgVar, boolean z2, String str, String str2, gop gopVar, Boolean bool, String str3, String str4, final Function1 function1, Function0 function0, a aVar, final int i, final int i2, final int i3) {
        int i4;
        ijf0 ijf0Var2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        String str5;
        int i8;
        int i9;
        String str6;
        int i10;
        int i11;
        gop gopVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z4;
        final ycg ycgVar2;
        final boolean z5;
        final String str7;
        final String str8;
        final String str9;
        final String str10;
        final gop gopVar3;
        final boolean z6;
        final Boolean bool2;
        final Function0 function2;
        e eVarZ;
        final ycg bVar;
        final String str11;
        final gop gopVar4;
        Boolean bool3;
        String str12;
        String strA;
        final Function0 function3;
        final String str13;
        final String str14;
        final String str15;
        final boolean z7;
        final boolean z8;
        Object objY;
        final ytw ytwVar;
        boolean zBooleanValue;
        int i22;
        int i23;
        boolean zA;
        b bVarI = aVar.i(-960283901);
        if ((i & 6) == 0) {
            i4 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            ijf0Var2 = ijf0Var;
            i4 |= bVarI.M(ijf0Var2) ? 32 : 16;
        } else {
            ijf0Var2 = ijf0Var;
        }
        int i24 = i3 & 4;
        if (i24 == 0) {
            if ((i & 384) == 0) {
                z3 = z;
                i4 |= bVarI.b(z3) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i3 & 8) != 0) {
                    i23 = 1024;
                } else {
                    if ((i & 4096) == 0) {
                        zA = bVarI.M(ycgVar);
                    } else {
                        zA = bVarI.A(ycgVar);
                    }
                    if (zA) {
                        i23 = 2048;
                    } else {
                        i23 = 1024;
                    }
                }
                i4 |= i23;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    if (bVarI.b(z2)) {
                        i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    str5 = str;
                } else {
                    str5 = str;
                    if ((i & 196608) == 0) {
                        if (bVarI.M(str5)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    str6 = str2;
                } else {
                    str6 = str2;
                    if ((i & 1572864) == 0) {
                        if (bVarI.M(str6)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    i4 |= 12582912;
                    gopVar2 = gopVar;
                } else {
                    gopVar2 = gopVar;
                    if ((i & 12582912) == 0) {
                        if (bVarI.M(gopVar2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                }
                i13 = i3 & 256;
                if (i13 != 0) {
                    if ((i & 100663296) == 0) {
                        if (bVarI.M(bool)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i4 |= i14;
                    }
                    i15 = i4 | 805306368;
                    i16 = i3 & 1024;
                    if (i16 != 0) {
                        i17 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (bVarI.M(str3)) {
                            i18 = 4;
                        } else {
                            i18 = 2;
                        }
                        i17 = i2 | i18;
                    } else {
                        i17 = i2;
                    }
                    if ((i2 & 48) != 0) {
                        i17 |= ((i3 & 2048) == 0 || !bVarI.M(str4)) ? 16 : 32;
                    }
                    if ((i2 & 384) != 0) {
                        if (bVarI.A(function1)) {
                            i22 = 256;
                        } else {
                            i22 = 128;
                        }
                        i17 |= i22;
                    }
                    i19 = i17;
                    i20 = i3 & 8192;
                    if (i20 != 0) {
                        i21 = i19 | 3072;
                    } else if ((i2 & 3072) == 0) {
                        i21 = i19 | (bVarI.A(function0) ? 2048 : 1024);
                    } else {
                        i21 = i19;
                    }
                    if ((i15 & 306783379) == 306783378 || (i21 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (bVarI.q(i15 & 1, z4)) {
                        bVarI.A0();
                        if ((i & 1) != 0 || bVarI.h0()) {
                            if (i24 != 0) {
                                z3 = false;
                            }
                            if ((i3 & 8) != 0) {
                                bVar = new ycg.b("", "error_text");
                            } else {
                                bVar = ycgVar;
                            }
                            boolean z9 = i5 == 0 ? z2 : true;
                            if (i7 != 0) {
                                str5 = "";
                            }
                            str11 = i9 == 0 ? str6 : "";
                            if (i11 != 0) {
                                gopVar4 = new gop(7, 0, 123);
                            } else {
                                gopVar4 = gopVar2;
                            }
                            if (i13 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i16 != 0) {
                                str12 = "password_text_field";
                            } else {
                                str12 = str3;
                            }
                            if ((i3 & 2048) != 0) {
                                strA = yk10.a(str12, "_visibility_toggle");
                            } else {
                                strA = str4;
                            }
                            if (i20 != 0) {
                                function3 = null;
                            } else {
                                function3 = function0;
                            }
                            str13 = str5;
                            str14 = str12;
                            str15 = strA;
                            z7 = z3;
                            z8 = z9;
                        } else {
                            bVarI.G();
                            bVar = ycgVar;
                            z8 = z2;
                            bool3 = bool;
                            str14 = str3;
                            str15 = str4;
                            function3 = function0;
                            str13 = str5;
                            str11 = str6;
                            gopVar4 = gopVar2;
                            z7 = z3;
                        }
                        bVarI.Y();
                        objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = m.b(Boolean.FALSE);
                            bVarI.r(objY);
                        }
                        ytwVar = (ytw) objY;
                        if (bool3 != null) {
                            zBooleanValue = bool3.booleanValue();
                        } else {
                            zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                        }
                        final boolean z10 = zBooleanValue;
                        final ijf0 ijf0Var3 = ijf0Var2;
                        vqe.a(6, pp8.b(392693601, new Function2() { // from class: ewz
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                op8 op8VarB;
                                a aVar2 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    int i25 = Build.VERSION.SDK_INT;
                                    d dVarA = dVar;
                                    if (i25 <= 27) {
                                        aVar2.N(-755436192);
                                        Object objY2 = aVar2.y();
                                        if (objY2 == a.C0041a.a) {
                                            objY2 = new iwz();
                                            aVar2.r(objY2);
                                        }
                                        dVarA = xa80.a(dVarA, (Function1) objY2);
                                        aVar2.H();
                                    } else {
                                        aVar2.N(-755366535);
                                        aVar2.H();
                                    }
                                    final boolean z11 = z10;
                                    uni0 zwzVar = z11 ? uni0.a.a : new zwz(0);
                                    ijf0 ijf0Var4 = ijf0Var3;
                                    if (ijf0Var4.a.b.length() > 0) {
                                        aVar2.N(-754782588);
                                        final Function0 function4 = function3;
                                        final String str16 = str15;
                                        final ytw ytwVar2 = ytwVar;
                                        op8VarB = pp8.b(-1915190787, new Function2() { // from class: jwz
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj3, Object obj4) {
                                                a aVar3 = (a) obj3;
                                                int iIntValue2 = ((Integer) obj4).intValue();
                                                int i26 = 0;
                                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    Function0 function5 = function4;
                                                    boolean zM = aVar3.M(function5);
                                                    Object objY3 = aVar3.y();
                                                    if (zM || objY3 == a.C0041a.a) {
                                                        objY3 = new mwz(i26, function5, ytwVar2);
                                                        aVar3.r(objY3);
                                                    }
                                                    d dVarH = g3w.h(j.r(d.a.b, 40.0f), str16);
                                                    final boolean z12 = z11;
                                                    c6n.a((Function0) objY3, dVarH, false, null, null, pp8.b(-623283685, new Function2() { // from class: nwz
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj5, Object obj6) {
                                                            a aVar4 = (a) obj5;
                                                            int iIntValue3 = ((Integer) obj6).intValue();
                                                            if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                                h6n.b(erz.a(z12 ? R.drawable.open_eye : R.drawable.close_eye, 0, aVar4), "clear text", j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar4), aVar4, 432, 0);
                                                            } else {
                                                                aVar4.G();
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, aVar3), aVar3, 1572864, 60);
                                                } else {
                                                    aVar3.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar2);
                                        aVar2.H();
                                    } else {
                                        aVar2.N(-753887588);
                                        aVar2.H();
                                        op8VarB = null;
                                    }
                                    tyx.c(dVarA, ijf0Var4, null, op8VarB, z7, bVar, z8, false, str13, str11, null, gopVar4, zwzVar, 0, null, str14, function1, aVar2, 0, 0, 9348);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), bVarI);
                        bool2 = bool3;
                        z6 = z7;
                        ycgVar2 = bVar;
                        z5 = z8;
                        str9 = str13;
                        str10 = str11;
                        gopVar3 = gopVar4;
                        str7 = str14;
                        function2 = function3;
                        str8 = str15;
                    } else {
                        bVarI.G();
                        ycgVar2 = ycgVar;
                        z5 = z2;
                        str7 = str3;
                        str8 = str4;
                        str9 = str5;
                        str10 = str6;
                        gopVar3 = gopVar2;
                        z6 = z3;
                        bool2 = bool;
                        function2 = function0;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: hwz
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i | 1);
                                int iA2 = qj40.a(i2);
                                qwz.b(dVar, ijf0Var, z6, ycgVar2, z5, str9, str10, gopVar3, bool2, str7, str8, function1, function2, (a) obj, iA, iA2, i3);
                                return Unit.a;
                            }
                        };
                    }
                }
                i4 |= 100663296;
                i15 = i4 | 805306368;
                i16 = i3 & 1024;
                if (i16 != 0) {
                    i17 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (bVarI.M(str3)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i2 | i18;
                } else {
                    i17 = i2;
                }
                if ((i2 & 48) != 0) {
                    i17 |= ((i3 & 2048) == 0 || !bVarI.M(str4)) ? 16 : 32;
                }
                if ((i2 & 384) != 0) {
                    if (bVarI.A(function1)) {
                        i22 = 256;
                    } else {
                        i22 = 128;
                    }
                    i17 |= i22;
                }
                i19 = i17;
                i20 = i3 & 8192;
                if (i20 != 0) {
                    i21 = i19 | 3072;
                } else if ((i2 & 3072) == 0) {
                    i21 = i19 | (bVarI.A(function0) ? 2048 : 1024);
                } else {
                    i21 = i19;
                }
                if ((i15 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (bVarI.q(i15 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 8) != 0) {
                            bVar = new ycg.b("", "error_text");
                        } else {
                            bVar = ycgVar;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            str5 = "";
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                            gopVar4 = new gop(7, 0, 123);
                        } else {
                            gopVar4 = gopVar2;
                        }
                        if (i13 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i16 != 0) {
                            str12 = "password_text_field";
                        } else {
                            str12 = str3;
                        }
                        if ((i3 & 2048) != 0) {
                            strA = yk10.a(str12, "_visibility_toggle");
                        } else {
                            strA = str4;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        str13 = str5;
                        str14 = str12;
                        str15 = strA;
                        z7 = z3;
                        z8 = z9;
                    } else {
                        if (i24 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 8) != 0) {
                            bVar = new ycg.b("", "error_text");
                        } else {
                            bVar = ycgVar;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            str5 = "";
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                            gopVar4 = new gop(7, 0, 123);
                        } else {
                            gopVar4 = gopVar2;
                        }
                        if (i13 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i16 != 0) {
                            str12 = "password_text_field";
                        } else {
                            str12 = str3;
                        }
                        if ((i3 & 2048) != 0) {
                            strA = yk10.a(str12, "_visibility_toggle");
                        } else {
                            strA = str4;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        str13 = str5;
                        str14 = str12;
                        str15 = strA;
                        z7 = z3;
                        z8 = z9;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = m.b(Boolean.FALSE);
                        bVarI.r(objY);
                    }
                    ytwVar = (ytw) objY;
                    if (bool3 != null) {
                        zBooleanValue = bool3.booleanValue();
                    } else {
                        zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                    }
                    final boolean z11 = zBooleanValue;
                    final ijf0 ijf0Var4 = ijf0Var2;
                    vqe.a(6, pp8.b(392693601, new Function2() { // from class: ewz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            op8 op8VarB;
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                int i25 = Build.VERSION.SDK_INT;
                                d dVarA = dVar;
                                if (i25 <= 27) {
                                    aVar2.N(-755436192);
                                    Object objY2 = aVar2.y();
                                    if (objY2 == a.C0041a.a) {
                                        objY2 = new iwz();
                                        aVar2.r(objY2);
                                    }
                                    dVarA = xa80.a(dVarA, (Function1) objY2);
                                    aVar2.H();
                                } else {
                                    aVar2.N(-755366535);
                                    aVar2.H();
                                }
                                final boolean z12 = z11;
                                uni0 zwzVar = z12 ? uni0.a.a : new zwz(0);
                                ijf0 ijf0Var5 = ijf0Var4;
                                if (ijf0Var5.a.b.length() > 0) {
                                    aVar2.N(-754782588);
                                    final Function0 function4 = function3;
                                    final String str16 = str15;
                                    final ytw ytwVar2 = ytwVar;
                                    op8VarB = pp8.b(-1915190787, new Function2() { // from class: jwz
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj3, Object obj4) {
                                            a aVar3 = (a) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            int i26 = 0;
                                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                Function0 function5 = function4;
                                                boolean zM = aVar3.M(function5);
                                                Object objY3 = aVar3.y();
                                                if (zM || objY3 == a.C0041a.a) {
                                                    objY3 = new mwz(i26, function5, ytwVar2);
                                                    aVar3.r(objY3);
                                                }
                                                d dVarH = g3w.h(j.r(d.a.b, 40.0f), str16);
                                                final boolean z13 = z12;
                                                c6n.a((Function0) objY3, dVarH, false, null, null, pp8.b(-623283685, new Function2() { // from class: nwz
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj5, Object obj6) {
                                                        a aVar4 = (a) obj5;
                                                        int iIntValue3 = ((Integer) obj6).intValue();
                                                        if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            h6n.b(erz.a(z13 ? R.drawable.open_eye : R.drawable.close_eye, 0, aVar4), "clear text", j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar4), aVar4, 432, 0);
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar3), aVar3, 1572864, 60);
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar2);
                                    aVar2.H();
                                } else {
                                    aVar2.N(-753887588);
                                    aVar2.H();
                                    op8VarB = null;
                                }
                                tyx.c(dVarA, ijf0Var5, null, op8VarB, z7, bVar, z8, false, str13, str11, null, gopVar4, zwzVar, 0, null, str14, function1, aVar2, 0, 0, 9348);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI);
                    bool2 = bool3;
                    z6 = z7;
                    ycgVar2 = bVar;
                    z5 = z8;
                    str9 = str13;
                    str10 = str11;
                    gopVar3 = gopVar4;
                    str7 = str14;
                    function2 = function3;
                    str8 = str15;
                } else {
                    bVarI.G();
                    ycgVar2 = ycgVar;
                    z5 = z2;
                    str7 = str3;
                    str8 = str4;
                    str9 = str5;
                    str10 = str6;
                    gopVar3 = gopVar2;
                    z6 = z3;
                    bool2 = bool;
                    function2 = function0;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: hwz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            qwz.b(dVar, ijf0Var, z6, ycgVar2, z5, str9, str10, gopVar3, bool2, str7, str8, function1, function2, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                str5 = str;
            } else {
                str5 = str;
                if ((i & 196608) == 0) {
                    if (bVarI.M(str5)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                str6 = str2;
            } else {
                str6 = str2;
                if ((i & 1572864) == 0) {
                    if (bVarI.M(str6)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
                gopVar2 = gopVar;
            } else {
                gopVar2 = gopVar;
                if ((i & 12582912) == 0) {
                    if (bVarI.M(gopVar2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & 256;
            if (i13 != 0) {
                if ((i & 100663296) == 0) {
                    if (bVarI.M(bool)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i4 |= i14;
                }
                i15 = i4 | 805306368;
                i16 = i3 & 1024;
                if (i16 != 0) {
                    i17 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (bVarI.M(str3)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i2 | i18;
                } else {
                    i17 = i2;
                }
                if ((i2 & 48) != 0) {
                    i17 |= ((i3 & 2048) == 0 || !bVarI.M(str4)) ? 16 : 32;
                }
                if ((i2 & 384) != 0) {
                    if (bVarI.A(function1)) {
                        i22 = 256;
                    } else {
                        i22 = 128;
                    }
                    i17 |= i22;
                }
                i19 = i17;
                i20 = i3 & 8192;
                if (i20 != 0) {
                    i21 = i19 | 3072;
                } else if ((i2 & 3072) == 0) {
                    i21 = i19 | (bVarI.A(function0) ? 2048 : 1024);
                } else {
                    i21 = i19;
                }
                if ((i15 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (bVarI.q(i15 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 8) != 0) {
                            bVar = new ycg.b("", "error_text");
                        } else {
                            bVar = ycgVar;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            str5 = "";
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                            gopVar4 = new gop(7, 0, 123);
                        } else {
                            gopVar4 = gopVar2;
                        }
                        if (i13 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i16 != 0) {
                            str12 = "password_text_field";
                        } else {
                            str12 = str3;
                        }
                        if ((i3 & 2048) != 0) {
                            strA = yk10.a(str12, "_visibility_toggle");
                        } else {
                            strA = str4;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        str13 = str5;
                        str14 = str12;
                        str15 = strA;
                        z7 = z3;
                        z8 = z9;
                    } else {
                        if (i24 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 8) != 0) {
                            bVar = new ycg.b("", "error_text");
                        } else {
                            bVar = ycgVar;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            str5 = "";
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                            gopVar4 = new gop(7, 0, 123);
                        } else {
                            gopVar4 = gopVar2;
                        }
                        if (i13 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i16 != 0) {
                            str12 = "password_text_field";
                        } else {
                            str12 = str3;
                        }
                        if ((i3 & 2048) != 0) {
                            strA = yk10.a(str12, "_visibility_toggle");
                        } else {
                            strA = str4;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        str13 = str5;
                        str14 = str12;
                        str15 = strA;
                        z7 = z3;
                        z8 = z9;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = m.b(Boolean.FALSE);
                        bVarI.r(objY);
                    }
                    ytwVar = (ytw) objY;
                    if (bool3 != null) {
                        zBooleanValue = bool3.booleanValue();
                    } else {
                        zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                    }
                    final boolean z12 = zBooleanValue;
                    final ijf0 ijf0Var5 = ijf0Var2;
                    vqe.a(6, pp8.b(392693601, new Function2() { // from class: ewz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            op8 op8VarB;
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                int i25 = Build.VERSION.SDK_INT;
                                d dVarA = dVar;
                                if (i25 <= 27) {
                                    aVar2.N(-755436192);
                                    Object objY2 = aVar2.y();
                                    if (objY2 == a.C0041a.a) {
                                        objY2 = new iwz();
                                        aVar2.r(objY2);
                                    }
                                    dVarA = xa80.a(dVarA, (Function1) objY2);
                                    aVar2.H();
                                } else {
                                    aVar2.N(-755366535);
                                    aVar2.H();
                                }
                                final boolean z13 = z12;
                                uni0 zwzVar = z13 ? uni0.a.a : new zwz(0);
                                ijf0 ijf0Var6 = ijf0Var5;
                                if (ijf0Var6.a.b.length() > 0) {
                                    aVar2.N(-754782588);
                                    final Function0 function4 = function3;
                                    final String str16 = str15;
                                    final ytw ytwVar2 = ytwVar;
                                    op8VarB = pp8.b(-1915190787, new Function2() { // from class: jwz
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj3, Object obj4) {
                                            a aVar3 = (a) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            int i26 = 0;
                                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                Function0 function5 = function4;
                                                boolean zM = aVar3.M(function5);
                                                Object objY3 = aVar3.y();
                                                if (zM || objY3 == a.C0041a.a) {
                                                    objY3 = new mwz(i26, function5, ytwVar2);
                                                    aVar3.r(objY3);
                                                }
                                                d dVarH = g3w.h(j.r(d.a.b, 40.0f), str16);
                                                final boolean z14 = z13;
                                                c6n.a((Function0) objY3, dVarH, false, null, null, pp8.b(-623283685, new Function2() { // from class: nwz
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj5, Object obj6) {
                                                        a aVar4 = (a) obj5;
                                                        int iIntValue3 = ((Integer) obj6).intValue();
                                                        if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            h6n.b(erz.a(z14 ? R.drawable.open_eye : R.drawable.close_eye, 0, aVar4), "clear text", j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar4), aVar4, 432, 0);
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar3), aVar3, 1572864, 60);
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar2);
                                    aVar2.H();
                                } else {
                                    aVar2.N(-753887588);
                                    aVar2.H();
                                    op8VarB = null;
                                }
                                tyx.c(dVarA, ijf0Var6, null, op8VarB, z7, bVar, z8, false, str13, str11, null, gopVar4, zwzVar, 0, null, str14, function1, aVar2, 0, 0, 9348);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI);
                    bool2 = bool3;
                    z6 = z7;
                    ycgVar2 = bVar;
                    z5 = z8;
                    str9 = str13;
                    str10 = str11;
                    gopVar3 = gopVar4;
                    str7 = str14;
                    function2 = function3;
                    str8 = str15;
                } else {
                    bVarI.G();
                    ycgVar2 = ycgVar;
                    z5 = z2;
                    str7 = str3;
                    str8 = str4;
                    str9 = str5;
                    str10 = str6;
                    gopVar3 = gopVar2;
                    z6 = z3;
                    bool2 = bool;
                    function2 = function0;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: hwz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            qwz.b(dVar, ijf0Var, z6, ycgVar2, z5, str9, str10, gopVar3, bool2, str7, str8, function1, function2, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            i15 = i4 | 805306368;
            i16 = i3 & 1024;
            if (i16 != 0) {
                i17 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (bVarI.M(str3)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i2 | i18;
            } else {
                i17 = i2;
            }
            if ((i2 & 48) != 0) {
                i17 |= ((i3 & 2048) == 0 || !bVarI.M(str4)) ? 16 : 32;
            }
            if ((i2 & 384) != 0) {
                if (bVarI.A(function1)) {
                    i22 = 256;
                } else {
                    i22 = 128;
                }
                i17 |= i22;
            }
            i19 = i17;
            i20 = i3 & 8192;
            if (i20 != 0) {
                i21 = i19 | 3072;
            } else if ((i2 & 3072) == 0) {
                i21 = i19 | (bVarI.A(function0) ? 2048 : 1024);
            } else {
                i21 = i19;
            }
            if ((i15 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (bVarI.q(i15 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 8) != 0) {
                        bVar = new ycg.b("", "error_text");
                    } else {
                        bVar = ycgVar;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        str5 = "";
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                        gopVar4 = new gop(7, 0, 123);
                    } else {
                        gopVar4 = gopVar2;
                    }
                    if (i13 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i16 != 0) {
                        str12 = "password_text_field";
                    } else {
                        str12 = str3;
                    }
                    if ((i3 & 2048) != 0) {
                        strA = yk10.a(str12, "_visibility_toggle");
                    } else {
                        strA = str4;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    str13 = str5;
                    str14 = str12;
                    str15 = strA;
                    z7 = z3;
                    z8 = z9;
                } else {
                    if (i24 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 8) != 0) {
                        bVar = new ycg.b("", "error_text");
                    } else {
                        bVar = ycgVar;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        str5 = "";
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                        gopVar4 = new gop(7, 0, 123);
                    } else {
                        gopVar4 = gopVar2;
                    }
                    if (i13 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i16 != 0) {
                        str12 = "password_text_field";
                    } else {
                        str12 = str3;
                    }
                    if ((i3 & 2048) != 0) {
                        strA = yk10.a(str12, "_visibility_toggle");
                    } else {
                        strA = str4;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    str13 = str5;
                    str14 = str12;
                    str15 = strA;
                    z7 = z3;
                    z8 = z9;
                }
                bVarI.Y();
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = m.b(Boolean.FALSE);
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                if (bool3 != null) {
                    zBooleanValue = bool3.booleanValue();
                } else {
                    zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                }
                final boolean z13 = zBooleanValue;
                final ijf0 ijf0Var6 = ijf0Var2;
                vqe.a(6, pp8.b(392693601, new Function2() { // from class: ewz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        op8 op8VarB;
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            int i25 = Build.VERSION.SDK_INT;
                            d dVarA = dVar;
                            if (i25 <= 27) {
                                aVar2.N(-755436192);
                                Object objY2 = aVar2.y();
                                if (objY2 == a.C0041a.a) {
                                    objY2 = new iwz();
                                    aVar2.r(objY2);
                                }
                                dVarA = xa80.a(dVarA, (Function1) objY2);
                                aVar2.H();
                            } else {
                                aVar2.N(-755366535);
                                aVar2.H();
                            }
                            final boolean z14 = z13;
                            uni0 zwzVar = z14 ? uni0.a.a : new zwz(0);
                            ijf0 ijf0Var7 = ijf0Var6;
                            if (ijf0Var7.a.b.length() > 0) {
                                aVar2.N(-754782588);
                                final Function0 function4 = function3;
                                final String str16 = str15;
                                final ytw ytwVar2 = ytwVar;
                                op8VarB = pp8.b(-1915190787, new Function2() { // from class: jwz
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        a aVar3 = (a) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        int i26 = 0;
                                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            Function0 function5 = function4;
                                            boolean zM = aVar3.M(function5);
                                            Object objY3 = aVar3.y();
                                            if (zM || objY3 == a.C0041a.a) {
                                                objY3 = new mwz(i26, function5, ytwVar2);
                                                aVar3.r(objY3);
                                            }
                                            d dVarH = g3w.h(j.r(d.a.b, 40.0f), str16);
                                            final boolean z15 = z14;
                                            c6n.a((Function0) objY3, dVarH, false, null, null, pp8.b(-623283685, new Function2() { // from class: nwz
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj5, Object obj6) {
                                                    a aVar4 = (a) obj5;
                                                    int iIntValue3 = ((Integer) obj6).intValue();
                                                    if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        h6n.b(erz.a(z15 ? R.drawable.open_eye : R.drawable.close_eye, 0, aVar4), "clear text", j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar4), aVar4, 432, 0);
                                                    } else {
                                                        aVar4.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, aVar3), aVar3, 1572864, 60);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2);
                                aVar2.H();
                            } else {
                                aVar2.N(-753887588);
                                aVar2.H();
                                op8VarB = null;
                            }
                            tyx.c(dVarA, ijf0Var7, null, op8VarB, z7, bVar, z8, false, str13, str11, null, gopVar4, zwzVar, 0, null, str14, function1, aVar2, 0, 0, 9348);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI);
                bool2 = bool3;
                z6 = z7;
                ycgVar2 = bVar;
                z5 = z8;
                str9 = str13;
                str10 = str11;
                gopVar3 = gopVar4;
                str7 = str14;
                function2 = function3;
                str8 = str15;
            } else {
                bVarI.G();
                ycgVar2 = ycgVar;
                z5 = z2;
                str7 = str3;
                str8 = str4;
                str9 = str5;
                str10 = str6;
                gopVar3 = gopVar2;
                z6 = z3;
                bool2 = bool;
                function2 = function0;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: hwz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        qwz.b(dVar, ijf0Var, z6, ycgVar2, z5, str9, str10, gopVar3, bool2, str7, str8, function1, function2, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 384;
        z3 = z;
        if ((i & 3072) == 0) {
            if ((i3 & 8) != 0) {
                i23 = 1024;
            } else {
                if ((i & 4096) == 0) {
                    zA = bVarI.M(ycgVar);
                } else {
                    zA = bVarI.A(ycgVar);
                }
                if (zA) {
                    i23 = 2048;
                } else {
                    i23 = 1024;
                }
            }
            i4 |= i23;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                if (bVarI.b(z2)) {
                    i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                str5 = str;
            } else {
                str5 = str;
                if ((i & 196608) == 0) {
                    if (bVarI.M(str5)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                str6 = str2;
            } else {
                str6 = str2;
                if ((i & 1572864) == 0) {
                    if (bVarI.M(str6)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            i11 = i3 & 128;
            if (i11 != 0) {
                i4 |= 12582912;
                gopVar2 = gopVar;
            } else {
                gopVar2 = gopVar;
                if ((i & 12582912) == 0) {
                    if (bVarI.M(gopVar2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i4 |= i12;
                }
            }
            i13 = i3 & 256;
            if (i13 != 0) {
                if ((i & 100663296) == 0) {
                    if (bVarI.M(bool)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i4 |= i14;
                }
                i15 = i4 | 805306368;
                i16 = i3 & 1024;
                if (i16 != 0) {
                    i17 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (bVarI.M(str3)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i2 | i18;
                } else {
                    i17 = i2;
                }
                if ((i2 & 48) != 0) {
                    i17 |= ((i3 & 2048) == 0 || !bVarI.M(str4)) ? 16 : 32;
                }
                if ((i2 & 384) != 0) {
                    if (bVarI.A(function1)) {
                        i22 = 256;
                    } else {
                        i22 = 128;
                    }
                    i17 |= i22;
                }
                i19 = i17;
                i20 = i3 & 8192;
                if (i20 != 0) {
                    i21 = i19 | 3072;
                } else if ((i2 & 3072) == 0) {
                    i21 = i19 | (bVarI.A(function0) ? 2048 : 1024);
                } else {
                    i21 = i19;
                }
                if ((i15 & 306783379) == 306783378) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                if (bVarI.q(i15 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i24 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 8) != 0) {
                            bVar = new ycg.b("", "error_text");
                        } else {
                            bVar = ycgVar;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            str5 = "";
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                            gopVar4 = new gop(7, 0, 123);
                        } else {
                            gopVar4 = gopVar2;
                        }
                        if (i13 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i16 != 0) {
                            str12 = "password_text_field";
                        } else {
                            str12 = str3;
                        }
                        if ((i3 & 2048) != 0) {
                            strA = yk10.a(str12, "_visibility_toggle");
                        } else {
                            strA = str4;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        str13 = str5;
                        str14 = str12;
                        str15 = strA;
                        z7 = z3;
                        z8 = z9;
                    } else {
                        if (i24 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 8) != 0) {
                            bVar = new ycg.b("", "error_text");
                        } else {
                            bVar = ycgVar;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            str5 = "";
                        }
                        if (i9 == 0) {
                        }
                        if (i11 != 0) {
                            gopVar4 = new gop(7, 0, 123);
                        } else {
                            gopVar4 = gopVar2;
                        }
                        if (i13 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i16 != 0) {
                            str12 = "password_text_field";
                        } else {
                            str12 = str3;
                        }
                        if ((i3 & 2048) != 0) {
                            strA = yk10.a(str12, "_visibility_toggle");
                        } else {
                            strA = str4;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        } else {
                            function3 = function0;
                        }
                        str13 = str5;
                        str14 = str12;
                        str15 = strA;
                        z7 = z3;
                        z8 = z9;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = m.b(Boolean.FALSE);
                        bVarI.r(objY);
                    }
                    ytwVar = (ytw) objY;
                    if (bool3 != null) {
                        zBooleanValue = bool3.booleanValue();
                    } else {
                        zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                    }
                    final boolean z14 = zBooleanValue;
                    final ijf0 ijf0Var7 = ijf0Var2;
                    vqe.a(6, pp8.b(392693601, new Function2() { // from class: ewz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            op8 op8VarB;
                            a aVar2 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                int i25 = Build.VERSION.SDK_INT;
                                d dVarA = dVar;
                                if (i25 <= 27) {
                                    aVar2.N(-755436192);
                                    Object objY2 = aVar2.y();
                                    if (objY2 == a.C0041a.a) {
                                        objY2 = new iwz();
                                        aVar2.r(objY2);
                                    }
                                    dVarA = xa80.a(dVarA, (Function1) objY2);
                                    aVar2.H();
                                } else {
                                    aVar2.N(-755366535);
                                    aVar2.H();
                                }
                                final boolean z15 = z14;
                                uni0 zwzVar = z15 ? uni0.a.a : new zwz(0);
                                ijf0 ijf0Var8 = ijf0Var7;
                                if (ijf0Var8.a.b.length() > 0) {
                                    aVar2.N(-754782588);
                                    final Function0 function4 = function3;
                                    final String str16 = str15;
                                    final ytw ytwVar2 = ytwVar;
                                    op8VarB = pp8.b(-1915190787, new Function2() { // from class: jwz
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj3, Object obj4) {
                                            a aVar3 = (a) obj3;
                                            int iIntValue2 = ((Integer) obj4).intValue();
                                            int i26 = 0;
                                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                Function0 function5 = function4;
                                                boolean zM = aVar3.M(function5);
                                                Object objY3 = aVar3.y();
                                                if (zM || objY3 == a.C0041a.a) {
                                                    objY3 = new mwz(i26, function5, ytwVar2);
                                                    aVar3.r(objY3);
                                                }
                                                d dVarH = g3w.h(j.r(d.a.b, 40.0f), str16);
                                                final boolean z16 = z15;
                                                c6n.a((Function0) objY3, dVarH, false, null, null, pp8.b(-623283685, new Function2() { // from class: nwz
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj5, Object obj6) {
                                                        a aVar4 = (a) obj5;
                                                        int iIntValue3 = ((Integer) obj6).intValue();
                                                        if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            h6n.b(erz.a(z16 ? R.drawable.open_eye : R.drawable.close_eye, 0, aVar4), "clear text", j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar4), aVar4, 432, 0);
                                                        } else {
                                                            aVar4.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar3), aVar3, 1572864, 60);
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar2);
                                    aVar2.H();
                                } else {
                                    aVar2.N(-753887588);
                                    aVar2.H();
                                    op8VarB = null;
                                }
                                tyx.c(dVarA, ijf0Var8, null, op8VarB, z7, bVar, z8, false, str13, str11, null, gopVar4, zwzVar, 0, null, str14, function1, aVar2, 0, 0, 9348);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI);
                    bool2 = bool3;
                    z6 = z7;
                    ycgVar2 = bVar;
                    z5 = z8;
                    str9 = str13;
                    str10 = str11;
                    gopVar3 = gopVar4;
                    str7 = str14;
                    function2 = function3;
                    str8 = str15;
                } else {
                    bVarI.G();
                    ycgVar2 = ycgVar;
                    z5 = z2;
                    str7 = str3;
                    str8 = str4;
                    str9 = str5;
                    str10 = str6;
                    gopVar3 = gopVar2;
                    z6 = z3;
                    bool2 = bool;
                    function2 = function0;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: hwz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            qwz.b(dVar, ijf0Var, z6, ycgVar2, z5, str9, str10, gopVar3, bool2, str7, str8, function1, function2, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            i15 = i4 | 805306368;
            i16 = i3 & 1024;
            if (i16 != 0) {
                i17 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (bVarI.M(str3)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i2 | i18;
            } else {
                i17 = i2;
            }
            if ((i2 & 48) != 0) {
                i17 |= ((i3 & 2048) == 0 || !bVarI.M(str4)) ? 16 : 32;
            }
            if ((i2 & 384) != 0) {
                if (bVarI.A(function1)) {
                    i22 = 256;
                } else {
                    i22 = 128;
                }
                i17 |= i22;
            }
            i19 = i17;
            i20 = i3 & 8192;
            if (i20 != 0) {
                i21 = i19 | 3072;
            } else if ((i2 & 3072) == 0) {
                i21 = i19 | (bVarI.A(function0) ? 2048 : 1024);
            } else {
                i21 = i19;
            }
            if ((i15 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (bVarI.q(i15 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 8) != 0) {
                        bVar = new ycg.b("", "error_text");
                    } else {
                        bVar = ycgVar;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        str5 = "";
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                        gopVar4 = new gop(7, 0, 123);
                    } else {
                        gopVar4 = gopVar2;
                    }
                    if (i13 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i16 != 0) {
                        str12 = "password_text_field";
                    } else {
                        str12 = str3;
                    }
                    if ((i3 & 2048) != 0) {
                        strA = yk10.a(str12, "_visibility_toggle");
                    } else {
                        strA = str4;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    str13 = str5;
                    str14 = str12;
                    str15 = strA;
                    z7 = z3;
                    z8 = z9;
                } else {
                    if (i24 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 8) != 0) {
                        bVar = new ycg.b("", "error_text");
                    } else {
                        bVar = ycgVar;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        str5 = "";
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                        gopVar4 = new gop(7, 0, 123);
                    } else {
                        gopVar4 = gopVar2;
                    }
                    if (i13 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i16 != 0) {
                        str12 = "password_text_field";
                    } else {
                        str12 = str3;
                    }
                    if ((i3 & 2048) != 0) {
                        strA = yk10.a(str12, "_visibility_toggle");
                    } else {
                        strA = str4;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    str13 = str5;
                    str14 = str12;
                    str15 = strA;
                    z7 = z3;
                    z8 = z9;
                }
                bVarI.Y();
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = m.b(Boolean.FALSE);
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                if (bool3 != null) {
                    zBooleanValue = bool3.booleanValue();
                } else {
                    zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                }
                final boolean z15 = zBooleanValue;
                final ijf0 ijf0Var8 = ijf0Var2;
                vqe.a(6, pp8.b(392693601, new Function2() { // from class: ewz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        op8 op8VarB;
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            int i25 = Build.VERSION.SDK_INT;
                            d dVarA = dVar;
                            if (i25 <= 27) {
                                aVar2.N(-755436192);
                                Object objY2 = aVar2.y();
                                if (objY2 == a.C0041a.a) {
                                    objY2 = new iwz();
                                    aVar2.r(objY2);
                                }
                                dVarA = xa80.a(dVarA, (Function1) objY2);
                                aVar2.H();
                            } else {
                                aVar2.N(-755366535);
                                aVar2.H();
                            }
                            final boolean z16 = z15;
                            uni0 zwzVar = z16 ? uni0.a.a : new zwz(0);
                            ijf0 ijf0Var9 = ijf0Var8;
                            if (ijf0Var9.a.b.length() > 0) {
                                aVar2.N(-754782588);
                                final Function0 function4 = function3;
                                final String str16 = str15;
                                final ytw ytwVar2 = ytwVar;
                                op8VarB = pp8.b(-1915190787, new Function2() { // from class: jwz
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        a aVar3 = (a) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        int i26 = 0;
                                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            Function0 function5 = function4;
                                            boolean zM = aVar3.M(function5);
                                            Object objY3 = aVar3.y();
                                            if (zM || objY3 == a.C0041a.a) {
                                                objY3 = new mwz(i26, function5, ytwVar2);
                                                aVar3.r(objY3);
                                            }
                                            d dVarH = g3w.h(j.r(d.a.b, 40.0f), str16);
                                            final boolean z17 = z16;
                                            c6n.a((Function0) objY3, dVarH, false, null, null, pp8.b(-623283685, new Function2() { // from class: nwz
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj5, Object obj6) {
                                                    a aVar4 = (a) obj5;
                                                    int iIntValue3 = ((Integer) obj6).intValue();
                                                    if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        h6n.b(erz.a(z17 ? R.drawable.open_eye : R.drawable.close_eye, 0, aVar4), "clear text", j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar4), aVar4, 432, 0);
                                                    } else {
                                                        aVar4.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, aVar3), aVar3, 1572864, 60);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2);
                                aVar2.H();
                            } else {
                                aVar2.N(-753887588);
                                aVar2.H();
                                op8VarB = null;
                            }
                            tyx.c(dVarA, ijf0Var9, null, op8VarB, z7, bVar, z8, false, str13, str11, null, gopVar4, zwzVar, 0, null, str14, function1, aVar2, 0, 0, 9348);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI);
                bool2 = bool3;
                z6 = z7;
                ycgVar2 = bVar;
                z5 = z8;
                str9 = str13;
                str10 = str11;
                gopVar3 = gopVar4;
                str7 = str14;
                function2 = function3;
                str8 = str15;
            } else {
                bVarI.G();
                ycgVar2 = ycgVar;
                z5 = z2;
                str7 = str3;
                str8 = str4;
                str9 = str5;
                str10 = str6;
                gopVar3 = gopVar2;
                z6 = z3;
                bool2 = bool;
                function2 = function0;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: hwz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        qwz.b(dVar, ijf0Var, z6, ycgVar2, z5, str9, str10, gopVar3, bool2, str7, str8, function1, function2, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 24576;
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
            str5 = str;
        } else {
            str5 = str;
            if ((i & 196608) == 0) {
                if (bVarI.M(str5)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
            str6 = str2;
        } else {
            str6 = str2;
            if ((i & 1572864) == 0) {
                if (bVarI.M(str6)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
        }
        i11 = i3 & 128;
        if (i11 != 0) {
            i4 |= 12582912;
            gopVar2 = gopVar;
        } else {
            gopVar2 = gopVar;
            if ((i & 12582912) == 0) {
                if (bVarI.M(gopVar2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i4 |= i12;
            }
        }
        i13 = i3 & 256;
        if (i13 != 0) {
            if ((i & 100663296) == 0) {
                if (bVarI.M(bool)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i4 |= i14;
            }
            i15 = i4 | 805306368;
            i16 = i3 & 1024;
            if (i16 != 0) {
                i17 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (bVarI.M(str3)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i2 | i18;
            } else {
                i17 = i2;
            }
            if ((i2 & 48) != 0) {
                i17 |= ((i3 & 2048) == 0 || !bVarI.M(str4)) ? 16 : 32;
            }
            if ((i2 & 384) != 0) {
                if (bVarI.A(function1)) {
                    i22 = 256;
                } else {
                    i22 = 128;
                }
                i17 |= i22;
            }
            i19 = i17;
            i20 = i3 & 8192;
            if (i20 != 0) {
                i21 = i19 | 3072;
            } else if ((i2 & 3072) == 0) {
                i21 = i19 | (bVarI.A(function0) ? 2048 : 1024);
            } else {
                i21 = i19;
            }
            if ((i15 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (bVarI.q(i15 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i24 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 8) != 0) {
                        bVar = new ycg.b("", "error_text");
                    } else {
                        bVar = ycgVar;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        str5 = "";
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                        gopVar4 = new gop(7, 0, 123);
                    } else {
                        gopVar4 = gopVar2;
                    }
                    if (i13 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i16 != 0) {
                        str12 = "password_text_field";
                    } else {
                        str12 = str3;
                    }
                    if ((i3 & 2048) != 0) {
                        strA = yk10.a(str12, "_visibility_toggle");
                    } else {
                        strA = str4;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    str13 = str5;
                    str14 = str12;
                    str15 = strA;
                    z7 = z3;
                    z8 = z9;
                } else {
                    if (i24 != 0) {
                        z3 = false;
                    }
                    if ((i3 & 8) != 0) {
                        bVar = new ycg.b("", "error_text");
                    } else {
                        bVar = ycgVar;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        str5 = "";
                    }
                    if (i9 == 0) {
                    }
                    if (i11 != 0) {
                        gopVar4 = new gop(7, 0, 123);
                    } else {
                        gopVar4 = gopVar2;
                    }
                    if (i13 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i16 != 0) {
                        str12 = "password_text_field";
                    } else {
                        str12 = str3;
                    }
                    if ((i3 & 2048) != 0) {
                        strA = yk10.a(str12, "_visibility_toggle");
                    } else {
                        strA = str4;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    } else {
                        function3 = function0;
                    }
                    str13 = str5;
                    str14 = str12;
                    str15 = strA;
                    z7 = z3;
                    z8 = z9;
                }
                bVarI.Y();
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = m.b(Boolean.FALSE);
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                if (bool3 != null) {
                    zBooleanValue = bool3.booleanValue();
                } else {
                    zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                }
                final boolean z16 = zBooleanValue;
                final ijf0 ijf0Var9 = ijf0Var2;
                vqe.a(6, pp8.b(392693601, new Function2() { // from class: ewz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        op8 op8VarB;
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            int i25 = Build.VERSION.SDK_INT;
                            d dVarA = dVar;
                            if (i25 <= 27) {
                                aVar2.N(-755436192);
                                Object objY2 = aVar2.y();
                                if (objY2 == a.C0041a.a) {
                                    objY2 = new iwz();
                                    aVar2.r(objY2);
                                }
                                dVarA = xa80.a(dVarA, (Function1) objY2);
                                aVar2.H();
                            } else {
                                aVar2.N(-755366535);
                                aVar2.H();
                            }
                            final boolean z17 = z16;
                            uni0 zwzVar = z17 ? uni0.a.a : new zwz(0);
                            ijf0 ijf0Var10 = ijf0Var9;
                            if (ijf0Var10.a.b.length() > 0) {
                                aVar2.N(-754782588);
                                final Function0 function4 = function3;
                                final String str16 = str15;
                                final ytw ytwVar2 = ytwVar;
                                op8VarB = pp8.b(-1915190787, new Function2() { // from class: jwz
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        a aVar3 = (a) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        int i26 = 0;
                                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            Function0 function5 = function4;
                                            boolean zM = aVar3.M(function5);
                                            Object objY3 = aVar3.y();
                                            if (zM || objY3 == a.C0041a.a) {
                                                objY3 = new mwz(i26, function5, ytwVar2);
                                                aVar3.r(objY3);
                                            }
                                            d dVarH = g3w.h(j.r(d.a.b, 40.0f), str16);
                                            final boolean z18 = z17;
                                            c6n.a((Function0) objY3, dVarH, false, null, null, pp8.b(-623283685, new Function2() { // from class: nwz
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj5, Object obj6) {
                                                    a aVar4 = (a) obj5;
                                                    int iIntValue3 = ((Integer) obj6).intValue();
                                                    if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        h6n.b(erz.a(z18 ? R.drawable.open_eye : R.drawable.close_eye, 0, aVar4), "clear text", j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar4), aVar4, 432, 0);
                                                    } else {
                                                        aVar4.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, aVar3), aVar3, 1572864, 60);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2);
                                aVar2.H();
                            } else {
                                aVar2.N(-753887588);
                                aVar2.H();
                                op8VarB = null;
                            }
                            tyx.c(dVarA, ijf0Var10, null, op8VarB, z7, bVar, z8, false, str13, str11, null, gopVar4, zwzVar, 0, null, str14, function1, aVar2, 0, 0, 9348);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI);
                bool2 = bool3;
                z6 = z7;
                ycgVar2 = bVar;
                z5 = z8;
                str9 = str13;
                str10 = str11;
                gopVar3 = gopVar4;
                str7 = str14;
                function2 = function3;
                str8 = str15;
            } else {
                bVarI.G();
                ycgVar2 = ycgVar;
                z5 = z2;
                str7 = str3;
                str8 = str4;
                str9 = str5;
                str10 = str6;
                gopVar3 = gopVar2;
                z6 = z3;
                bool2 = bool;
                function2 = function0;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: hwz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        qwz.b(dVar, ijf0Var, z6, ycgVar2, z5, str9, str10, gopVar3, bool2, str7, str8, function1, function2, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 100663296;
        i15 = i4 | 805306368;
        i16 = i3 & 1024;
        if (i16 != 0) {
            i17 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (bVarI.M(str3)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i17 = i2 | i18;
        } else {
            i17 = i2;
        }
        if ((i2 & 48) != 0) {
            i17 |= ((i3 & 2048) == 0 || !bVarI.M(str4)) ? 16 : 32;
        }
        if ((i2 & 384) != 0) {
            if (bVarI.A(function1)) {
                i22 = 256;
            } else {
                i22 = 128;
            }
            i17 |= i22;
        }
        i19 = i17;
        i20 = i3 & 8192;
        if (i20 != 0) {
            i21 = i19 | 3072;
        } else if ((i2 & 3072) == 0) {
            i21 = i19 | (bVarI.A(function0) ? 2048 : 1024);
        } else {
            i21 = i19;
        }
        if ((i15 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (bVarI.q(i15 & 1, z4)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i24 != 0) {
                    z3 = false;
                }
                if ((i3 & 8) != 0) {
                    bVar = new ycg.b("", "error_text");
                } else {
                    bVar = ycgVar;
                }
                if (i5 == 0) {
                }
                if (i7 != 0) {
                    str5 = "";
                }
                if (i9 == 0) {
                }
                if (i11 != 0) {
                    gopVar4 = new gop(7, 0, 123);
                } else {
                    gopVar4 = gopVar2;
                }
                if (i13 != 0) {
                    bool3 = null;
                } else {
                    bool3 = bool;
                }
                if (i16 != 0) {
                    str12 = "password_text_field";
                } else {
                    str12 = str3;
                }
                if ((i3 & 2048) != 0) {
                    strA = yk10.a(str12, "_visibility_toggle");
                } else {
                    strA = str4;
                }
                if (i20 != 0) {
                    function3 = null;
                } else {
                    function3 = function0;
                }
                str13 = str5;
                str14 = str12;
                str15 = strA;
                z7 = z3;
                z8 = z9;
            } else {
                if (i24 != 0) {
                    z3 = false;
                }
                if ((i3 & 8) != 0) {
                    bVar = new ycg.b("", "error_text");
                } else {
                    bVar = ycgVar;
                }
                if (i5 == 0) {
                }
                if (i7 != 0) {
                    str5 = "";
                }
                if (i9 == 0) {
                }
                if (i11 != 0) {
                    gopVar4 = new gop(7, 0, 123);
                } else {
                    gopVar4 = gopVar2;
                }
                if (i13 != 0) {
                    bool3 = null;
                } else {
                    bool3 = bool;
                }
                if (i16 != 0) {
                    str12 = "password_text_field";
                } else {
                    str12 = str3;
                }
                if ((i3 & 2048) != 0) {
                    strA = yk10.a(str12, "_visibility_toggle");
                } else {
                    strA = str4;
                }
                if (i20 != 0) {
                    function3 = null;
                } else {
                    function3 = function0;
                }
                str13 = str5;
                str14 = str12;
                str15 = strA;
                z7 = z3;
                z8 = z9;
            }
            bVarI.Y();
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytwVar = (ytw) objY;
            if (bool3 != null) {
                zBooleanValue = bool3.booleanValue();
            } else {
                zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
            }
            final boolean z17 = zBooleanValue;
            final ijf0 ijf0Var10 = ijf0Var2;
            vqe.a(6, pp8.b(392693601, new Function2() { // from class: ewz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    op8 op8VarB;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        int i25 = Build.VERSION.SDK_INT;
                        d dVarA = dVar;
                        if (i25 <= 27) {
                            aVar2.N(-755436192);
                            Object objY2 = aVar2.y();
                            if (objY2 == a.C0041a.a) {
                                objY2 = new iwz();
                                aVar2.r(objY2);
                            }
                            dVarA = xa80.a(dVarA, (Function1) objY2);
                            aVar2.H();
                        } else {
                            aVar2.N(-755366535);
                            aVar2.H();
                        }
                        final boolean z18 = z17;
                        uni0 zwzVar = z18 ? uni0.a.a : new zwz(0);
                        ijf0 ijf0Var11 = ijf0Var10;
                        if (ijf0Var11.a.b.length() > 0) {
                            aVar2.N(-754782588);
                            final Function0 function4 = function3;
                            final String str16 = str15;
                            final ytw ytwVar2 = ytwVar;
                            op8VarB = pp8.b(-1915190787, new Function2() { // from class: jwz
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    a aVar3 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    int i26 = 0;
                                    if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        Function0 function5 = function4;
                                        boolean zM = aVar3.M(function5);
                                        Object objY3 = aVar3.y();
                                        if (zM || objY3 == a.C0041a.a) {
                                            objY3 = new mwz(i26, function5, ytwVar2);
                                            aVar3.r(objY3);
                                        }
                                        d dVarH = g3w.h(j.r(d.a.b, 40.0f), str16);
                                        final boolean z19 = z18;
                                        c6n.a((Function0) objY3, dVarH, false, null, null, pp8.b(-623283685, new Function2() { // from class: nwz
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj5, Object obj6) {
                                                a aVar4 = (a) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    h6n.b(erz.a(z19 ? R.drawable.open_eye : R.drawable.close_eye, 0, aVar4), "clear text", j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar4), aVar4, 432, 0);
                                                } else {
                                                    aVar4.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar3), aVar3, 1572864, 60);
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2);
                            aVar2.H();
                        } else {
                            aVar2.N(-753887588);
                            aVar2.H();
                            op8VarB = null;
                        }
                        tyx.c(dVarA, ijf0Var11, null, op8VarB, z7, bVar, z8, false, str13, str11, null, gopVar4, zwzVar, 0, null, str14, function1, aVar2, 0, 0, 9348);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI);
            bool2 = bool3;
            z6 = z7;
            ycgVar2 = bVar;
            z5 = z8;
            str9 = str13;
            str10 = str11;
            gopVar3 = gopVar4;
            str7 = str14;
            function2 = function3;
            str8 = str15;
        } else {
            bVarI.G();
            ycgVar2 = ycgVar;
            z5 = z2;
            str7 = str3;
            str8 = str4;
            str9 = str5;
            str10 = str6;
            gopVar3 = gopVar2;
            z6 = z3;
            bool2 = bool;
            function2 = function0;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hwz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    qwz.b(dVar, ijf0Var, z6, ycgVar2, z5, str9, str10, gopVar3, bool2, str7, str8, function1, function2, (a) obj, iA, iA2, i3);
                    return Unit.a;
                }
            };
        }
    }
}
