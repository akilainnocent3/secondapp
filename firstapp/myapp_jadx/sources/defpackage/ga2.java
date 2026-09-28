package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class ga2 {
    public static final void a(String str, final String str2, String str3, final Function0<Unit> function0, String str4, Function0<Unit> function1, a aVar, final int i, final int i2) {
        String str5;
        int i3;
        String str6;
        int i4;
        final String str7;
        int i5;
        final Function0<Unit> function2;
        int i6;
        final String str8;
        final String str9;
        final String str10;
        str2.getClass();
        b bVarI = aVar.i(380426592);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            str5 = str;
        } else {
            str5 = str;
            i3 = i | (bVarI.M(str5) ? 4 : 2);
        }
        int i8 = i3 | (bVarI.M(str2) ? 32 : 16);
        int i9 = i2 & 4;
        if (i9 != 0) {
            i4 = i8 | 384;
            str6 = str3;
        } else {
            str6 = str3;
            i4 = i8 | (bVarI.M(str6) ? 256 : 128);
        }
        int i10 = i4 | (bVarI.A(function0) ? 2048 : 1024);
        int i11 = i2 & 16;
        if (i11 != 0) {
            i5 = i10 | 24576;
            str7 = str4;
        } else {
            str7 = str4;
            i5 = i10 | (bVarI.M(str7) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        }
        int i12 = i2 & 32;
        if (i12 != 0) {
            i6 = i5 | 196608;
            function2 = function1;
        } else {
            function2 = function1;
            i6 = i5 | (bVarI.A(function2) ? 131072 : 65536);
        }
        if (bVarI.q(i6 & 1, (74899 & i6) != 74898)) {
            final String str11 = i7 != 0 ? null : str5;
            final String str12 = i9 != 0 ? null : str6;
            if (i11 != 0) {
                str7 = null;
            }
            final Function0<Unit> function3 = i12 != 0 ? null : function2;
            yle yleVar = new yle(false, false, false);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new z92();
                bVarI.r(objY);
            }
            u60.a((Function0) objY, yleVar, pp8.b(954024759, new Function2() { // from class: aa2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    d.a aVar2;
                    yka.a.c cVar;
                    int i13;
                    yka.a.d dVar;
                    yka.a.C1350a c1350a;
                    tsr.a aVar3;
                    yka.a.b bVar;
                    a.C0041a.C0042a c0042a;
                    float f;
                    int i14;
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar5 = d.a.b;
                        d dVarB = androidx.compose.foundation.a.b(h.h(j.g(aVar5, 1.0f), 12.0f, 0.0f, 2), c68.a(R.color.background_general_primary, aVar4), zk40.a);
                        kw0.k kVar = kw0.c;
                        n54.a aVar6 = ht.a.m;
                        i78 i78VarA = g78.a(kVar, aVar6, aVar4, 0);
                        int iHashCode = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC = c.c(aVar4, dVarB);
                        yka.k.getClass();
                        tsr.a aVar7 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar7);
                        } else {
                            aVar4.p();
                        }
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar4, i78VarA, bVar2);
                        yka.a.d dVar2 = yka.a.e;
                        hlh0.a(aVar4, ne00VarO, dVar2);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar4, iHashCode, c1350a2);
                        }
                        yka.a.c cVar2 = yka.a.d;
                        hlh0.a(aVar4, dVarC, cVar2);
                        d dVarA = zqu.a(1.0f, h.j(j.g(aVar5, 1.0f), 24.0f, 20.0f, 24.0f, 0.0f, 8), false);
                        i78 i78VarA2 = g78.a(new kw0.i(11.0f, true, new hw0()), aVar6, aVar4, 6);
                        int iHashCode2 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO2 = aVar4.o();
                        d dVarC2 = c.c(aVar4, dVarA);
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar7);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, i78VarA2, bVar2);
                        hlh0.a(aVar4, ne00VarO2, dVar2);
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC2, cVar2);
                        String str13 = str11;
                        if (str13 == null || str13.length() == 0) {
                            aVar2 = aVar5;
                            cVar = cVar2;
                            i13 = R.color.text_type1_primary;
                            dVar = dVar2;
                            c1350a = c1350a2;
                            aVar3 = aVar7;
                            bVar = bVar2;
                            aVar4.N(-734318433);
                            aVar4.H();
                        } else {
                            aVar4.N(-734548670);
                            imf0 imf0VarL = mla.l(R.style.H2_M, aVar4);
                            long jA = c68.a(R.color.text_type1_primary, aVar4);
                            c1350a = c1350a2;
                            aVar3 = aVar7;
                            bVar = bVar2;
                            cVar = cVar2;
                            i13 = R.color.text_type1_primary;
                            dVar = dVar2;
                            aVar2 = aVar5;
                            lkf0.d(str13, null, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, aVar4, 0, 0, 131066);
                            aVar4 = aVar4;
                            aVar4.H();
                        }
                        bt50.a(str2, null, null, imf0.b(mla.l(R.style.H4_R, aVar4), c68.a(i13, aVar4), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777182), new ct50(0L, null, null, prz.c.a, 31), aVar4, 0, 6);
                        aVar4.s();
                        d.a aVar8 = aVar2;
                        d dVarI = h.i(j.g(aVar8, 1.0f), 12.0f, 15.0f, 12.0f, 8.0f);
                        d160 d160VarA = b160.a(kw0.b, ht.a.j, aVar4, 6);
                        int iHashCode3 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO3 = aVar4.o();
                        d dVarC3 = c.c(aVar4, dVarI);
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar3);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, d160VarA, bVar);
                        hlh0.a(aVar4, ne00VarO3, dVar);
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar4, iHashCode3, c1350a);
                        }
                        hlh0.a(aVar4, dVarC3, cVar);
                        String str14 = str7;
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (str14 != null) {
                            aVar4.N(-384391865);
                            d dVarJ = h.j(j.b(aVar8, 1.0f, 0.0f, 2), 0.0f, 0.0f, 12.0f, 0.0f, 11);
                            Function0 function4 = function3;
                            if (function4 == null) {
                                aVar4.N(-384186769);
                                Object objY2 = aVar4.y();
                                if (objY2 == c0042a2) {
                                    i14 = 0;
                                    objY2 = new ca2(0);
                                    aVar4.r(objY2);
                                } else {
                                    i14 = 0;
                                }
                                function4 = (Function0) objY2;
                            } else {
                                i14 = 0;
                                aVar4.N(680342981);
                            }
                            aVar4.H();
                            a aVar9 = aVar4;
                            c0042a = c0042a2;
                            f = 0.0f;
                            ddd0.a(dVarJ, false, null, null, null, false, null, null, function4, pp8.b(1391875854, new da2(str14, i14), aVar4), aVar9, 805502982, 222);
                            aVar4 = aVar9;
                            aVar4.H();
                        } else {
                            c0042a = c0042a2;
                            f = 0.0f;
                            aVar4.N(-383780111);
                            aVar4.H();
                        }
                        d dVarB2 = j.b(aVar8, 1.0f, f, 2);
                        Function0 function5 = function0;
                        if (function5 == null) {
                            aVar4.N(-383625297);
                            Object objY3 = aVar4.y();
                            if (objY3 == c0042a) {
                                objY3 = new ea2();
                                aVar4.r(objY3);
                            }
                            function5 = (Function0) objY3;
                        } else {
                            aVar4.N(680361093);
                        }
                        aVar4.H();
                        Function0 function6 = function5;
                        final String str15 = str12;
                        a aVar10 = aVar4;
                        ddd0.a(dVarB2, false, null, null, null, false, null, null, function6, pp8.b(49585075, new gaj() { // from class: fa2
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                a aVar11 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((e160) obj3).getClass();
                                if (aVar11.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    String strA = str15;
                                    if (strA == null) {
                                        aVar11.N(406619299);
                                        strA = cb40.a(R.string.common_functions__ok, new Object[0], aVar11);
                                    } else {
                                        aVar11.N(406618772);
                                    }
                                    aVar11.H();
                                    lkf0.d(strA, null, c68.a(R.color.brand_secondary, aVar11), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar11), aVar11, 0, 0, 131066);
                                } else {
                                    aVar11.G();
                                }
                                return Unit.a;
                            }
                        }, aVar4), aVar10, 805502982, 222);
                        aVar10.s();
                        aVar10.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 438, 0);
            str8 = str11;
            function2 = function3;
            str9 = str7;
            str10 = str12;
        } else {
            bVarI.G();
            str8 = str5;
            str9 = str7;
            str10 = str6;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str8, str2, str10, function0, str9, function2, i, i2) { // from class: ba2
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ String e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ int i;

                {
                    this.i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ga2.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA, this.i);
                    return Unit.a;
                }
            };
        }
    }
}
