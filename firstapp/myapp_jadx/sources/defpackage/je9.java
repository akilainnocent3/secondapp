package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class je9 implements iaj {
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        j58 j58Var;
        kw0.j jVar;
        j58 j58Var2;
        wlc0 wlc0Var = (wlc0) obj2;
        a aVar = (a) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((pf0) obj).getClass();
        wlc0Var.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= aVar.d(wlc0Var.ordinal()) ? 32 : 16;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 145) != 144)) {
            kw0.c cVar = kw0.e;
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(cVar, bVar, aVar, 54);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(aVar, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar3);
            } else {
                aVar.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(aVar, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(aVar, ne00VarO, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(aVar, dVarC, cVar2);
            kw0.j jVar2 = kw0.a;
            d160 d160VarA2 = b160.a(jVar2, bVar, aVar, 48);
            int iHashCode2 = Long.hashCode(aVar.m());
            ne00 ne00VarO2 = aVar.o();
            d dVarC2 = c.c(aVar, aVar2);
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar3);
            } else {
                aVar.p();
            }
            hlh0.a(aVar, d160VarA2, bVar2);
            hlh0.a(aVar, ne00VarO2, dVar);
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
            }
            hlh0.a(aVar, dVarC2, cVar2);
            wlc0.a aVar4 = wlc0Var.a;
            Integer num = aVar4.c;
            if (num == null) {
                aVar.N(-2072484670);
                aVar.H();
                jVar = jVar2;
                bVar = bVar;
            } else {
                aVar.N(-2072484669);
                crz crzVarA = erz.a(num.intValue(), 0, aVar);
                Integer num2 = aVar4.d;
                if (num2 == null) {
                    aVar.N(-1713340108);
                    aVar.H();
                    j58Var = null;
                } else {
                    aVar.N(-1713340107);
                    long jA = c68.a(num2.intValue(), aVar);
                    aVar.H();
                    j58Var = new j58(jA);
                }
                jVar = jVar2;
                h6n.b(crzVarA, null, j.r(aVar2, 14.0f), j58Var != null ? j58Var.a : j58.m, aVar, 432, 0);
                ty0.a(aVar, j.w(aVar2, 4.0f));
                Unit unit = Unit.a;
                aVar.H();
            }
            ResourceUiText resourceUiText = aVar4.a;
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            lkf0.d(resourceUiText.g((Context) aVar.O(qyd0Var)), null, c68.a(aVar4.b, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, aVar), aVar, 0, 0, 131066);
            a aVar5 = aVar;
            aVar5.s();
            wlc0.a aVar6 = wlc0Var.b;
            if (aVar6 == null) {
                aVar5.N(-1248934919);
                aVar5.H();
            } else {
                aVar5.N(-1248934918);
                ty0.a(aVar5, j.w(aVar2, 16.0f));
                d160 d160VarA3 = b160.a(jVar, bVar, aVar5, 48);
                int iHashCode3 = Long.hashCode(aVar5.m());
                ne00 ne00VarO3 = aVar5.o();
                d dVarC3 = c.c(aVar5, aVar2);
                if (aVar5.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar5.D();
                if (aVar5.g()) {
                    aVar5.F(aVar3);
                } else {
                    aVar5.p();
                }
                hlh0.a(aVar5, d160VarA3, bVar2);
                hlh0.a(aVar5, ne00VarO3, dVar);
                if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode3))) {
                    j3c.a(iHashCode3, aVar5, iHashCode3, c1350a);
                }
                hlh0.a(aVar5, dVarC3, cVar2);
                Integer num3 = aVar6.c;
                if (num3 == null) {
                    aVar5.N(1872089697);
                    aVar5.H();
                } else {
                    aVar5.N(1872089698);
                    crz crzVarA2 = erz.a(num3.intValue(), 0, aVar5);
                    Integer num4 = aVar6.d;
                    if (num4 == null) {
                        aVar5.N(1533028032);
                        aVar5.H();
                        j58Var2 = null;
                    } else {
                        aVar5.N(1533028033);
                        long jA2 = c68.a(num4.intValue(), aVar5);
                        aVar5.H();
                        j58Var2 = new j58(jA2);
                    }
                    h6n.b(crzVarA2, null, j.r(aVar2, 14.0f), j58Var2 != null ? j58Var2.a : j58.m, aVar5, 432, 0);
                    ty0.a(aVar5, j.w(aVar2, 2.0f));
                    Unit unit2 = Unit.a;
                    aVar5.H();
                }
                lkf0.d(aVar6.a.g((Context) aVar5.O(qyd0Var)), null, c68.a(aVar6.b, aVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, aVar5), aVar5, 0, 0, 131066);
                aVar5 = aVar5;
                aVar5.s();
                Unit unit3 = Unit.a;
                aVar5.H();
            }
            aVar5.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
