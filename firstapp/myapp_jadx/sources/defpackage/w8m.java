package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class w8m {
    public static final void a(final x9m x9mVar, final nk0 nk0Var, final String str, final Function0 function0, a aVar, final int i, final int i2) {
        int i3;
        nk0 nk0Var2;
        String str2;
        b bVar;
        x9mVar.getClass();
        b bVarI = aVar.i(8791839);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bVarI.M(x9mVar) : bVarI.A(x9mVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            nk0Var2 = nk0Var;
            i3 |= bVarI.M(nk0Var2) ? 32 : 16;
        } else {
            nk0Var2 = nk0Var;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bVarI.M(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i3 |= bVarI.M(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            final String str3 = null;
            final nk0 nk0Var3 = nk0Var2;
            final String str4 = str2;
            bVar = bVarI;
            ihe0.a(j.g(d.a.b, 1.0f), null, c68.a(x9mVar.a, bVarI), 0L, 0.0f, 0.0f, null, pp8.b(1003922852, new Function2() { // from class: s8m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4;
                    d.a aVar2;
                    Function0 function1;
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        float fA = fw20.a(R.dimen.space_small, aVar3);
                        float fA2 = fw20.a(R.dimen.space_medium, aVar3);
                        d.a aVar4 = d.a.b;
                        d dVarG = j.g(h.g(aVar4, fA2, fA), 1.0f);
                        d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar3, 48);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarG);
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
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar3, d160VarA, bVar2);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar3, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar3, dVarC, cVar);
                        x9m x9mVar2 = x9mVar;
                        h6n.b(erz.a(x9mVar2.b, 0, aVar3), null, j.r(aVar4, 20.0f), c68.a(x9mVar2.c, aVar3), aVar3, 432, 0);
                        ty0.a(aVar3, j.w(aVar4, fw20.a(R.dimen.space_x_small, aVar3)));
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar3, 0);
                        int iHashCode2 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO2 = aVar3.o();
                        d dVarC2 = c.c(aVar3, layoutWeightElement);
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
                        hlh0.a(aVar3, i78VarA, bVar2);
                        hlh0.a(aVar3, ne00VarO2, dVar);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar3, dVarC2, cVar);
                        String str5 = str3;
                        if (str5 != null) {
                            aVar3.N(762684652);
                            t9i t9iVar = t9i.E;
                            long jM = mla.m(12.0f, aVar3);
                            long jA = c68.a(R.color.text_type1_tertiary, aVar3);
                            aVar2 = aVar4;
                            i4 = R.color.text_type1_tertiary;
                            lkf0.d(str5, null, jA, null, jM, null, t9iVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar3, 1572864, 0, 262058);
                            aVar3 = aVar3;
                            aVar3.H();
                        } else {
                            i4 = R.color.text_type1_tertiary;
                            aVar2 = aVar4;
                            aVar3.N(762940836);
                            aVar3.H();
                        }
                        a aVar6 = aVar3;
                        lkf0.e(nk0Var3, null, c68.a(i4, aVar3), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mla.l(R.style.B2_R, aVar3), aVar6, 0, 0, 262138);
                        a aVar7 = aVar6;
                        aVar7.s();
                        final String str6 = str4;
                        if (str6 == null || (function1 = function0) == null) {
                            aVar7.N(-521423622);
                            aVar7.H();
                        } else {
                            aVar7.N(-522235667);
                            nk5.b(function1, j.i(h.j(aVar2, 8.0f, 0.0f, 0.0f, 0.0f, 14), 28.0f), false, j060.c(2.0f), null, m35.a(1.0f, c68.a(R.color.text_type1_tertiary, aVar7)), h.a(2, fw20.a(R.dimen.space_small, aVar7), 0.0f), pp8.b(1553833237, new gaj() { // from class: u8m
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    a aVar8 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    ((e160) obj3).getClass();
                                    if (aVar8.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        lkf0.d(str6, null, c68.a(R.color.text_type1_tertiary, aVar8), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar8), aVar8, 0, 0, 131066);
                                    } else {
                                        aVar8.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar7), aVar7, 805306416, HttpStatusCodesKt.HTTP_PERM_REDIRECT);
                            aVar7 = aVar7;
                            aVar7.H();
                        }
                        aVar7.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 12582918, 122);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: t8m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w8m.a(x9mVar, nk0Var, str, function0, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(x9m x9mVar, final String str, String str2, Function0 function0, a aVar, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        x9m x9mVar2;
        final Function0 function1;
        final String str3;
        x9mVar.getClass();
        b bVarI = aVar.i(1984534479);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bVarI.M(x9mVar) : bVarI.A(x9mVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | (bVarI.M(str) ? 32 : 16);
        int i7 = i6 | 384;
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 = i6 | 3456;
        } else {
            i4 = (bVarI.M(str2) ? 2048 : 1024) | i7;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i5 = i4 | 24576;
        } else {
            i5 = i4 | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        }
        if (bVarI.q(i5 & 1, (i5 & 9363) != 9362)) {
            String str4 = i8 != 0 ? null : str2;
            Function0 function2 = i9 != 0 ? null : function0;
            x9mVar2 = x9mVar;
            a(x9mVar2, new nk0(str), str4, function2, bVarI, i5 & 65422, 0);
            str3 = str4;
            function1 = function2;
        } else {
            x9mVar2 = x9mVar;
            bVarI.G();
            function1 = function0;
            str3 = str2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final x9m x9mVar3 = x9mVar2;
            eVarZ.d = new Function2() { // from class: r8m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w8m.b(x9mVar3, str, str3, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
