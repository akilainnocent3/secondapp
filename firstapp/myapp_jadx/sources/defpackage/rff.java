package defpackage;

import androidx.compose.foundation.layout.h;
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
public final class rff {
    /* JADX WARN: Code duplicated, block: B:60:0x015e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0162  */
    /* JADX WARN: Code duplicated, block: B:66:0x017d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0198  */
    /* JADX WARN: Code duplicated, block: B:71:0x019c  */
    /* JADX WARN: Code duplicated, block: B:72:0x019f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01df  */
    /* JADX WARN: Code duplicated, block: B:86:0x0240  */
    /* JADX WARN: Code duplicated, block: B:87:0x0244  */
    /* JADX WARN: Code duplicated, block: B:90:0x029f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(d dVar, final boolean z, final String str, final qcn qcnVar, final String str2, final Function1 function1, a aVar, final int i) {
        final d dVar2;
        int i2;
        int i3;
        a.C0041a.C0042a c0042a;
        int iHashCode;
        String str3;
        boolean z2;
        long jA;
        j58 j58Var;
        long jA2;
        boolean z3;
        a.C0041a.C0042a c0042a2;
        int i4;
        Object objY;
        qcnVar.getClass();
        b bVarI = aVar.i(-267478312);
        int i5 = i | 6 | (bVarI.b(z) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.M(qcnVar) ? 2048 : 1024) | (bVarI.M(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536);
        if (bVarI.q(i5 & 1, (74899 & i5) != 74898)) {
            Object objY2 = bVarI.y();
            a.C0041a.C0042a c0042a3 = a.C0041a.a;
            if (objY2 == c0042a3) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            final ytw ytwVar = (ytw) objY2;
            if (z) {
                i2 = 651393727;
                i3 = R.color.transparent;
            } else {
                i2 = 651391884;
                i3 = R.color.background_type1_primary;
            }
            long jA3 = rzg.a(bVarI, i2, i3, bVarI, false);
            d.a aVar2 = d.a.b;
            zk40.a aVar3 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(aVar2, jA3, aVar3);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a3) {
                objY3 = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY3;
            int i6 = i5 & 112;
            boolean z4 = i6 == 32;
            Object objY4 = bVarI.y();
            if (z4 || objY4 == c0042a3) {
                objY4 = new Function0() { // from class: lff
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z) {
                            ytw ytwVar2 = ytwVar;
                            ytwVar2.setValue(Boolean.valueOf(!((Boolean) ytwVar2.getValue()).booleanValue()));
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            d dVarB2 = androidx.compose.foundation.d.b(dVarB, pswVar, null, false, null, (Function0) objY4, 28);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB2);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                c0042a = c0042a3;
            } else {
                c0042a = c0042a3;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                d dVarB3 = g3w.b(j.i(j.g(aVar2, 1.0f), 48.0f), z, new gaj() { // from class: mff
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i7;
                        int i8;
                        d dVar4 = (d) obj;
                        a aVar5 = (a) obj2;
                        ((Integer) obj3).getClass();
                        dVar4.getClass();
                        aVar5.N(-102564718);
                        if (((Boolean) ytwVar.getValue()).booleanValue()) {
                            i7 = 219555933;
                            i8 = R.color.brand_secondary;
                        } else {
                            i7 = 219557506;
                            i8 = R.color.line_type1_secondary;
                        }
                        d dVarA = d35.a(dVar4, 1.0f, m7b.a(aVar5, i7, i8, aVar5), j060.c(2.0f));
                        aVar5.H();
                        return dVarA;
                    }
                }, bVarI, i6 | 6);
                d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarB3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                d dVarJ = h.j(aVar2, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                if (str2 == null) {
                    str3 = str2;
                } else if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (str2 == null) {
                    bVarI.N(-1696481642);
                    z2 = false;
                    bVarI.X(false);
                    j58Var = null;
                } else {
                    z2 = false;
                    bVarI.N(-1696481641);
                    if (z) {
                        jA = rzg.a(bVarI, -1023327342, R.color.text_type1_primary, bVarI, false);
                    } else {
                        jA = rzg.a(bVarI, -1023325676, R.color.text_type1_secondary, bVarI, false);
                    }
                    bVarI.X(false);
                    j58Var = new j58(jA);
                }
                if (j58Var == null) {
                    jA2 = rzg.a(bVarI, 1330752034, R.color.text_type1_secondary, bVarI, z2);
                } else {
                    bVarI.N(1330747725);
                    bVarI.X(z2);
                    jA2 = j58Var.a;
                }
                z3 = z2;
                c0042a2 = c0042a;
                lkf0.d(str3, dVarJ, jA2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 131064);
                d dVarH = h.h(aVar2, 12.0f, 0.0f, 2);
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    i4 = R.drawable.spr_ic_arrow_drop_up_green_20dp;
                } else {
                    i4 = R.drawable.spr_ic_arrow_drop_down_gray_20dp;
                }
                h9n.a(erz.a(i4, z3 ? 1 : 0, bVarI), null, dVarH, null, null, 0.0f, null, bVarI, 432, 120);
                bVarI.X(true);
                d dVarA = d35.a(h.j(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.background_general_primary, bVarI), aVar3), 16.0f, 2.0f, 16.0f, 0.0f, 8), 1.0f, c68.a(R.color.line_type1_secondary, bVarI), j060.c(2.0f));
                boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                objY = bVarI.y();
                if (objY == c0042a2) {
                    objY = new nff(ytwVar, z3 ? 1 : 0);
                    bVarI.r(objY);
                }
                z80.a(zBooleanValue, (Function0) objY, dVarA, 0L, null, null, null, 0L, 0.0f, pp8.b(1274205043, new gaj() { // from class: off
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i7;
                        int i8;
                        a aVar5 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((j78) obj).getClass();
                        int i9 = 0;
                        if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            for (Object obj4 : qcnVar) {
                                int i10 = i9 + 1;
                                if (i9 < 0) {
                                    kotlin.collections.b.q();
                                    throw null;
                                }
                                final String str4 = (String) obj4;
                                d dVarI = j.i(j.g(d.a.b, 1.0f), 48.0f);
                                if (Intrinsics.g(str2, str4)) {
                                    i7 = 959902236;
                                    i8 = R.color.background_type1_primary;
                                } else {
                                    i7 = 960028313;
                                    i8 = R.color.background_type1_quaternary;
                                }
                                d dVarB4 = androidx.compose.foundation.a.b(dVarI, m7b.a(aVar5, i7, i8, aVar5), zk40.a);
                                op8 op8VarB = pp8.b(-141675907, new pr1(str4), aVar5);
                                final Function1 function2 = function1;
                                boolean zM = aVar5.M(function2) | aVar5.M(str4);
                                Object objY5 = aVar5.y();
                                if (zM || objY5 == a.C0041a.a) {
                                    final ytw ytwVar2 = ytwVar;
                                    objY5 = new Function0() { // from class: qff
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(str4);
                                            ytwVar2.setValue(Boolean.FALSE);
                                            return Unit.a;
                                        }
                                    };
                                    aVar5.r(objY5);
                                }
                                z80.b(op8VarB, (Function0) objY5, dVarB4, null, null, false, null, null, aVar5, 6, 504);
                                i9 = i10;
                            }
                        } else {
                            aVar5.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 48, 2040);
                bVarI = bVarI;
                bVarI.X(true);
                dVar2 = aVar2;
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            d dVarB4 = g3w.b(j.i(j.g(aVar2, 1.0f), 48.0f), z, new gaj() { // from class: mff
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7;
                    int i8;
                    d dVar4 = (d) obj;
                    a aVar5 = (a) obj2;
                    ((Integer) obj3).getClass();
                    dVar4.getClass();
                    aVar5.N(-102564718);
                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                        i7 = 219555933;
                        i8 = R.color.brand_secondary;
                    } else {
                        i7 = 219557506;
                        i8 = R.color.line_type1_secondary;
                    }
                    d dVarA2 = d35.a(dVar4, 1.0f, m7b.a(aVar5, i7, i8, aVar5), j060.c(2.0f));
                    aVar5.H();
                    return dVarA2;
                }
            }, bVarI, i6 | 6);
            d160 d160VarA2 = b160.a(kw0.g, ht.a.k, bVarI, 54);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarB4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            d dVarJ2 = h.j(aVar2, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            if (str2 == null) {
                str3 = str2;
            } else if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (str2 == null) {
                bVarI.N(-1696481642);
                z2 = false;
                bVarI.X(false);
                j58Var = null;
            } else {
                z2 = false;
                bVarI.N(-1696481641);
                if (z) {
                    jA = rzg.a(bVarI, -1023327342, R.color.text_type1_primary, bVarI, false);
                } else {
                    jA = rzg.a(bVarI, -1023325676, R.color.text_type1_secondary, bVarI, false);
                }
                bVarI.X(false);
                j58Var = new j58(jA);
            }
            if (j58Var == null) {
                jA2 = rzg.a(bVarI, 1330752034, R.color.text_type1_secondary, bVarI, z2);
            } else {
                bVarI.N(1330747725);
                bVarI.X(z2);
                jA2 = j58Var.a;
            }
            z3 = z2;
            c0042a2 = c0042a;
            lkf0.d(str3, dVarJ2, jA2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 131064);
            d dVarH2 = h.h(aVar2, 12.0f, 0.0f, 2);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                i4 = R.drawable.spr_ic_arrow_drop_up_green_20dp;
            } else {
                i4 = R.drawable.spr_ic_arrow_drop_down_gray_20dp;
            }
            h9n.a(erz.a(i4, z3 ? 1 : 0, bVarI), null, dVarH2, null, null, 0.0f, null, bVarI, 432, 120);
            bVarI.X(true);
            d dVarA2 = d35.a(h.j(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.background_general_primary, bVarI), aVar3), 16.0f, 2.0f, 16.0f, 0.0f, 8), 1.0f, c68.a(R.color.line_type1_secondary, bVarI), j060.c(2.0f));
            boolean zBooleanValue2 = ((Boolean) ytwVar.getValue()).booleanValue();
            objY = bVarI.y();
            if (objY == c0042a2) {
                objY = new nff(ytwVar, z3 ? 1 : 0);
                bVarI.r(objY);
            }
            z80.a(zBooleanValue2, (Function0) objY, dVarA2, 0L, null, null, null, 0L, 0.0f, pp8.b(1274205043, new gaj() { // from class: off
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7;
                    int i8;
                    a aVar5 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    int i9 = 0;
                    if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        for (Object obj4 : qcnVar) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            final String str4 = (String) obj4;
                            d dVarI = j.i(j.g(d.a.b, 1.0f), 48.0f);
                            if (Intrinsics.g(str2, str4)) {
                                i7 = 959902236;
                                i8 = R.color.background_type1_primary;
                            } else {
                                i7 = 960028313;
                                i8 = R.color.background_type1_quaternary;
                            }
                            d dVarB5 = androidx.compose.foundation.a.b(dVarI, m7b.a(aVar5, i7, i8, aVar5), zk40.a);
                            op8 op8VarB = pp8.b(-141675907, new pr1(str4), aVar5);
                            final Function1 function2 = function1;
                            boolean zM = aVar5.M(function2) | aVar5.M(str4);
                            Object objY5 = aVar5.y();
                            if (zM || objY5 == a.C0041a.a) {
                                final ytw ytwVar2 = ytwVar;
                                objY5 = new Function0() { // from class: qff
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(str4);
                                        ytwVar2.setValue(Boolean.FALSE);
                                        return Unit.a;
                                    }
                                };
                                aVar5.r(objY5);
                            }
                            z80.b(op8VarB, (Function0) objY5, dVarB5, null, null, false, null, null, aVar5, 6, 504);
                            i9 = i10;
                        }
                    } else {
                        aVar5.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 48, 2040);
            bVarI = bVarI;
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, str, qcnVar, str2, function1, i) { // from class: pff
                public final /* synthetic */ boolean b;
                public final /* synthetic */ String c;
                public final /* synthetic */ qcn d;
                public final /* synthetic */ String e;
                public final /* synthetic */ Function1 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rff.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
