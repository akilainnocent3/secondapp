package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.multilevel.common.model.TopBonusWinsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bt8 implements iaj {
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objV;
        pf0 pf0Var = (pf0) obj;
        a aVar = (a) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        pf0Var.getClass();
        obj2.getClass();
        dtg0<w7g> dtg0VarB = pf0Var.b();
        g0h0 g0h0Var = gjs.b;
        boolean zI = dtg0VarB.i();
        o oVar = dtg0VarB.a;
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (zI) {
            aVar.N(1666853325);
            aVar.H();
            objV = oVar.V();
        } else {
            aVar.N(1666599280);
            boolean zM = aVar.M(dtg0VarB);
            objV = aVar.y();
            if (zM || objV == c0042a) {
                c5a0.e.getClass();
                c5a0 c5a0VarA = c5a0.a.a();
                Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
                c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
                try {
                    Object objV2 = oVar.V();
                    c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                    aVar.r(objV2);
                    objV = objV2;
                } catch (Throwable th) {
                    c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                    throw th;
                }
            }
            aVar.H();
        }
        w7g w7gVar = (w7g) objV;
        aVar.N(-451819866);
        w7g w7gVar2 = w7g.b;
        float f = w7gVar == w7gVar2 ? 1.0f : 0.0f;
        aVar.H();
        Float fValueOf = Float.valueOf(f);
        boolean zM2 = aVar.M(dtg0VarB);
        Object objY = aVar.y();
        if (zM2 || objY == c0042a) {
            objY = a6a0.b(new et8.a(dtg0VarB));
            aVar.r(objY);
        }
        w7g w7gVar3 = (w7g) ((twd0) objY).getValue();
        aVar.N(-451819866);
        float f2 = w7gVar3 == w7gVar2 ? 1.0f : 0.0f;
        aVar.H();
        Float fValueOf2 = Float.valueOf(f2);
        boolean zM3 = aVar.M(dtg0VarB);
        Object objY2 = aVar.y();
        if (zM3 || objY2 == c0042a) {
            objY2 = a6a0.b(new et8.b(dtg0VarB));
            aVar.r(objY2);
        }
        ((dtg0.b) ((twd0) objY2).getValue()).getClass();
        aVar.N(-1478107272);
        gzg0 gzg0VarE = yi0.e(400, 0, null, 6);
        aVar.H();
        final dtg0.d dVarD = vtg0.d(dtg0VarB, fValueOf, fValueOf2, gzg0VarE, g0h0Var, aVar, 196608);
        d dVarG = j.g(d.a.b, 1.0f);
        boolean zM4 = aVar.M(dVarD);
        Object objY3 = aVar.y();
        if (zM4 || objY3 == c0042a) {
            objY3 = new Function1() { // from class: dt8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    a7l a7lVar = (a7l) obj5;
                    a7lVar.getClass();
                    a7lVar.k(((Number) dVarD.getValue()).floatValue());
                    a7lVar.z0(n09.a(0.0f, 0.5f));
                    return Unit.a;
                }
            };
            aVar.r(objY3);
        }
        d dVarA = androidx.compose.ui.graphics.a.a(dVarG, (Function1) objY3);
        aiv aivVarC = g75.c(ht.a.a, false);
        int iHashCode = Long.hashCode(aVar.m());
        ne00 ne00VarO = aVar.o();
        d dVarC = c.c(aVar, dVarA);
        yka.k.getClass();
        tsr.a aVar2 = yka.a.b;
        if (aVar.k() == null) {
            l2a.b();
            throw null;
        }
        aVar.D();
        if (aVar.g()) {
            aVar.F(aVar2);
        } else {
            aVar.p();
        }
        hlh0.a(aVar, aivVarC, yka.a.f);
        hlh0.a(aVar, ne00VarO, yka.a.e);
        yka.a.C1350a c1350a = yka.a.g;
        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
            j3c.a(iHashCode, aVar, iHashCode, c1350a);
        }
        hlh0.a(aVar, dVarC, yka.a.d);
        qyd0 qyd0Var = ni60.b;
        imf0 imf0VarG = ni60.g(((sfd0) aVar.O(qyd0Var)).d, R.dimen._9ssp, aVar);
        imf0 imf0VarG2 = ni60.g(((sfd0) aVar.O(qyd0Var)).e, R.dimen._9ssp, aVar);
        String strC = op5.c(op5.a, "list_of_winners_notification_ios:sg_sporty_cars", pwo.e(R.string.name_just_won_currency_amount_in_the_bonus_round, aVar));
        if (obj2 instanceof String) {
            aVar.N(483927943);
            lkf0.b((String) obj2, null, j58.f, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, imf0VarG, aVar, ((iIntValue >> 3) & 14) | 384, 3120, 55290);
            aVar = aVar;
            aVar.H();
        } else {
            if (obj2 instanceof TopBonusWinsDto) {
                aVar.N(484361974);
                TopBonusWinsDto topBonusWinsDto = (TopBonusWinsDto) obj2;
                String strP = kotlin.text.c.p(kotlin.text.c.p(kotlin.text.c.p(strC, "{name}", topBonusWinsDto.getNickName(), false), "{currency}", topBonusWinsDto.getCurrency(), false), "{amount}", String.valueOf(topBonusWinsDto.getWinAmount()), false);
                String str = topBonusWinsDto.getCurrency() + " " + topBonusWinsDto.getWinAmount();
                int iT = StringsKt.T(strP, str, 0, false, 6);
                nk0.b bVar = new nk0.b((Object) null);
                ora0 ora0Var = imf0VarG.a;
                if (iT >= 0) {
                    long j = j58.f;
                    int iL = bVar.l(ora0.a(ora0Var, j, null, null, null, 65534));
                    try {
                        bVar.g(strP.substring(0, iT));
                        Unit unit = Unit.a;
                        bVar.i(iL);
                        int iL2 = bVar.l(ora0.a(imf0VarG2.a, r58.d(4294961564L), null, null, null, 65534));
                        try {
                            bVar.g(str);
                            bVar.i(iL2);
                            int iL3 = bVar.l(ora0.a(imf0VarG.a, j, null, null, null, 65534));
                            try {
                                bVar.g(strP.substring(iT + str.length()));
                                bVar.i(iL3);
                            } catch (Throwable th2) {
                                bVar.i(iL3);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            bVar.i(iL2);
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        bVar.i(iL);
                        throw th4;
                    }
                } else {
                    int iL4 = bVar.l(ora0.a(ora0Var, j58.f, null, null, null, 65534));
                    try {
                        bVar.g(strP);
                        Unit unit2 = Unit.a;
                        bVar.i(iL4);
                    } catch (Throwable th5) {
                        bVar.i(iL4);
                        throw th5;
                    }
                }
                lkf0.c(bVar.m(), null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, null, aVar, 0, 3120, 251902);
                aVar = aVar;
            } else {
                aVar.N(477803831);
            }
            aVar.H();
        }
        aVar.s();
        return Unit.a;
    }
}
