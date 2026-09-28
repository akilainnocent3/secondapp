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
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class twe {
    public static final void a(final hwe hweVar, final Function1<? super iwe, Unit> function1, a aVar, final int i) {
        hweVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(2037394475);
        int i2 = (bVarI.M(hweVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            hwe.b bVar = hwe.Companion;
            b(hweVar, function1, bVarI, i2 & WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: nwe
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    twe.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final hwe hweVar, final Function1<? super iwe, Unit> function1, a aVar, int i) {
        b bVar;
        int i2;
        b bVarI = aVar.i(-1475541196);
        int i3 = (bVarI.M(hweVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            op8 op8VarB = pp8.b(-1601063688, new owe(function1, 0), bVarI);
            op8 op8VarB2 = pp8.b(1925010563, new gaj() { // from class: pwe
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2;
                    tmz tmzVar = (tmz) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d.a aVar4 = d.a.b;
                        d dVarE = h.e(j.e(aVar4, 1.0f), tmzVar);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarE);
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
                        hlh0.a(aVar3, aivVarC, bVar2);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar3, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar3, dVarC, cVar);
                        mw90.a("https://s.sporty.net/cms/bg_birthday_curtain_confetti_c2d6b9b295.png", "Birthday Confetti", j.e(aVar4, 1.0f), null, null, d0b.a.g, null, aVar3, 1573302, 1976);
                        d dVarI = h.i(j.e(aVar4, 1.0f), 32.0f, 48.0f, 32.0f, 24.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar3, 48);
                        int iHashCode2 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO2 = aVar3.o();
                        d dVarC2 = c.c(aVar3, dVarI);
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
                        aiv aivVarC2 = g75.c(ht.a.e, false);
                        int iHashCode3 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO3 = aVar3.o();
                        d dVarC3 = c.c(aVar3, aVar4);
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
                        hlh0.a(aVar3, aivVarC2, bVar2);
                        hlh0.a(aVar3, ne00VarO3, dVar);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar3, iHashCode3, c1350a);
                        }
                        hlh0.a(aVar3, dVarC3, cVar);
                        mw90.a("https://s.sporty.net/cms/img_gift_explosion_2a1b30129e.png", "Gift Explosion", j.t(aVar4, 280.0f, 375.0f), null, null, null, null, aVar3, 438, 2040);
                        lkf0.d(cb40.a(R.string.dob_verification__dob_verified_page_title, new Object[0], aVar3), androidx.compose.foundation.layout.d.a.b(aVar4, ht.a.h), c68.a(R.color.text_inverse_primary, aVar3), null, mla.m(32.0f, aVar3), null, new t9i(700), null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar3, 1572864, 0, 261032);
                        aVar3.s();
                        ty0.a(aVar3, j.i(aVar4, 18.0f));
                        hwe hweVar2 = hweVar;
                        lkf0.d(hweVar2.b, null, c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar3), aVar3, 0, 0, 130042);
                        ty0.a(aVar3, new LayoutWeightElement(1.0f, true));
                        boolean z = hweVar2.a;
                        final Function1 function2 = function1;
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (z) {
                            aVar3.N(-2107684249);
                            d dVarG = j.g(aVar4, 1.0f);
                            String strA = cb40.a(R.string.component_bvn__view_gifts, new Object[0], aVar3);
                            boolean zM = aVar3.M(function2);
                            Object objY = aVar3.y();
                            if (zM || objY == c0042a) {
                                objY = new rwe(function2, 0);
                                aVar3.r(objY);
                            }
                            xya.a(dVarG, false, strA, null, null, null, null, null, null, (Function0) objY, aVar3, 6, 506);
                            aVar2 = aVar3;
                            aVar2.H();
                        } else {
                            aVar3.N(-2107340955);
                            d dVarG2 = j.g(aVar4, 1.0f);
                            String strA2 = cb40.a(R.string.component_betslip__place_bet, new Object[0], aVar3);
                            boolean zM2 = aVar3.M(function2);
                            Object objY2 = aVar3.y();
                            if (zM2 || objY2 == c0042a) {
                                objY2 = new Function0() { // from class: swe
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(iwe.b.a);
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY2);
                            }
                            xya.a(dVarG2, false, strA2, null, null, null, null, null, null, (Function0) objY2, aVar3, 6, 506);
                            aVar2 = aVar3;
                            aVar2.H();
                        }
                        aVar2.s();
                        aVar2.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            bVar = bVarI;
            i2 = 1;
            hy60.a(null, op8VarB, null, null, null, 0, 0L, 0L, null, op8VarB2, bVar, 805306416, 509);
        } else {
            bVar = bVarI;
            i2 = 1;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new hia(hweVar, i, i2, function1);
        }
    }
}
