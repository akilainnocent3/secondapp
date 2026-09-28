package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class lv90 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Event event, final Market market, final Set set, final iaj iajVar, d dVar, a aVar, int i) {
        d dVar2;
        set.getClass();
        iajVar.getClass();
        b bVarI = aVar.i(-1324102648);
        int i2 = i | (bVarI.A(event) ? 4 : 2) | (bVarI.A(market) ? 32 : 16) | (bVarI.M(set) ? 256 : 128) | (bVarI.A(iajVar) ? 2048 : 1024) | 24576;
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            Object[] objArr = {event.eventId, market.id, market.specifier};
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new iv90();
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) o350.e(objArr, (Function0) objY, bVarI, 48);
            String str = market.desc;
            if (str == null) {
                str = "";
            }
            boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
            boolean zM = bVarI.M(ytwVar);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new cz4(ytwVar, 2);
                bVarI.r(objY2);
            }
            p38.a(str, zBooleanValue, (Function0) objY2, pp8.b(-678828604, new gaj() { // from class: jv90
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final boolean z;
                    Object obj4;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarG = j.g(d.a.b, 1.0f);
                        qyd0 qyd0Var = ejb0.a;
                        d dVarJ = h.j(dVarG, ((cjb0) aVar2.O(qyd0Var)).f, 0.0f, ((cjb0) aVar2.O(qyd0Var)).f, ((cjb0) aVar2.O(qyd0Var)).f, 2);
                        d160 d160VarA = b160.a(new kw0.i(((cjb0) aVar2.O(qyd0Var)).d, true, new hw0()), ht.a.j, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarJ);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar3);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, d160VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        aVar2.N(1411178280);
                        final Market market2 = market;
                        Iterable<Outcome> iterable = market2.outcomes;
                        if (iterable == null) {
                            iterable = m2g.a;
                        }
                        for (final Outcome outcome : iterable) {
                            outcome.getClass();
                            boolean zB = mo40.b(market2, outcome);
                            final Event event2 = event;
                            boolean zContains = set.contains(new Selection(event2, market2, outcome).k());
                            String str2 = outcome.desc;
                            String str3 = str2 == null ? "" : str2;
                            String str4 = outcome.odds;
                            String str5 = str4 == null ? "" : str4;
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                            final iaj iajVar2 = iajVar;
                            boolean zM2 = aVar2.M(iajVar2) | aVar2.A(event2) | aVar2.A(market2) | aVar2.A(outcome) | aVar2.b(zContains);
                            Object objY3 = aVar2.y();
                            if (zM2 || objY3 == a.C0041a.a) {
                                z = zContains;
                                obj4 = new Function0() { // from class: kv90
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        iajVar2.d(event2, market2, outcome, Boolean.valueOf(!z));
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(obj4);
                            } else {
                                z = zContains;
                                obj4 = objY3;
                            }
                            lt00.b(str5, z, zB, (Function0) obj4, layoutWeightElement, str3, aVar2, 0, 0);
                            market2 = market2;
                        }
                        aVar2.H();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 27648);
            dVar2 = d.a.b;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new xli(event, market, set, iajVar, dVar2, i);
        }
    }
}
