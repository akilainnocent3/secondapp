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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class l080 {
    public static final void a(final String str, final Function1 function1, final Function1 function2, final boolean z, final d dVar, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(-1280424284);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            i060 i060VarC = j060.c(((zib0) bVarI.O(ajb0.a)).c);
            imf0 imf0VarL = mla.l(R.style.B1_R, bVarI);
            qyd0 qyd0Var = oib0.a;
            imf0 imf0VarB = imf0.b(imf0VarL, ((lib0) bVarI.O(qyd0Var)).a, 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
            soa0 soa0Var = new soa0(((lib0) bVarI.O(qyd0Var)).a);
            gop gopVar = new gop(0, 3, 119);
            int i3 = i2 & 14;
            boolean z2 = ((i2 & 896) == 256) | (i3 == 4);
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                objY = new Function1() { // from class: c080
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((snp) obj).getClass();
                        function2.invoke(str);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            bVar = bVarI;
            ab2.b(str, function1, h.h(d35.a(androidx.compose.foundation.a.b(j.i(dVar, 36.0f), ((lib0) bVarI.O(qyd0Var)).n0, i060VarC), 1.0f, ((lib0) bVarI.O(qyd0Var)).A, i060VarC), 12.0f, 0.0f, 2), false, false, imf0VarB, gopVar, new tnp(null, null, (Function1) objY, 47), true, 0, 0, null, null, null, soa0Var, pp8.b(-585373151, new gaj() { // from class: d080
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String str2;
                    Function2 function3 = (Function2) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    function3.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.A(function3) ? 4 : 2;
                    }
                    int i4 = iIntValue;
                    if (aVar2.q(i4 & 1, (i4 & 19) != 18)) {
                        d.a aVar3 = d.a.b;
                        d dVarE = j.e(aVar3, 1.0f);
                        d160 d160VarA = b160.a(new kw0.i(12.0f, true, new hw0()), ht.a.k, aVar2, 54);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarE);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar2, d160VarA, bVar2);
                        yka.a.d dVar2 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar2);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        crz crzVarA = erz.a(R.drawable.ic_action_bar_search_gray, 0, aVar2);
                        qyd0 qyd0Var2 = oib0.a;
                        h6n.b(crzVarA, null, null, ((lib0) aVar2.O(qyd0Var2)).P, aVar2, 48, 4);
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, layoutWeightElement);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, bVar2);
                        hlh0.a(aVar2, ne00VarO2, dVar2);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        String str3 = str;
                        if (StringsKt.U(str3)) {
                            aVar2.N(-1844958850);
                            str2 = str3;
                            lkf0.d(cb40.a(R.string.common_functions__search_placeholder, new Object[0], aVar2), null, ((lib0) aVar2.O(qyd0Var2)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar2), aVar2, 0, 0, 131066);
                            aVar2 = aVar2;
                            aVar2.H();
                        } else {
                            str2 = str3;
                            aVar2.N(-1844666985);
                            aVar2.H();
                        }
                        ps.a(i4 & 14, aVar2, function3);
                        if (z) {
                            aVar2.N(225240508);
                            a aVar5 = aVar2;
                            q330.a(j.r(aVar3, 16.0f), ((lib0) aVar2.O(qyd0Var2)).P, 3.0f, 0L, 0, 0.0f, aVar5, 390, 56);
                            aVar2 = aVar5;
                            aVar2.H();
                        } else if (StringsKt.U(str2)) {
                            aVar2.N(225874365);
                            aVar2.H();
                        } else {
                            aVar2.N(225548989);
                            crz crzVarA2 = erz.a(R.drawable.ic_clear_market_search, 0, aVar2);
                            long j = ((lib0) aVar2.O(r30)).P;
                            Function1 function4 = function1;
                            boolean zM = aVar2.M(function4);
                            Object objY2 = aVar2.y();
                            if (zM || objY2 == a.C0041a.a) {
                                objY2 = new l83(function4, 1);
                                aVar2.r(objY2);
                            }
                            h6n.b(crzVarA2, "clear", androidx.compose.foundation.d.d(r39, false, null, null, (Function0) objY2, 15), j, aVar2, 48, 0);
                            aVar2.H();
                        }
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, (i2 & 112) | 102236160 | i3, 196608, 15896);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, function1, function2, z, dVar, i) { // from class: f080
                public final /* synthetic */ String a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ d e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(24577);
                    l080.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, final Function0<Unit> function0, final boolean z, a aVar, final int i) {
        str.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        b bVarI = aVar.i(1494831360);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            odd0.e(null, pp8.b(1819807830, new Function2() { // from class: wz70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        l080.a(str, function1, function2, z, h.j(j.g(d.a.b, 1.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), aVar2, 24576);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), pp8.b(-1425290251, new Function2() { // from class: zz70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        c6n.a(function0, g3w.h(d.a.b, "back_button"), false, null, null, oo9.a, aVar2, 1572912, 60);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, 0.0f, bVarI, 432);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, function1, function2, function0, z, i) { // from class: a080
                public final /* synthetic */ String a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ boolean e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    l080.b(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
