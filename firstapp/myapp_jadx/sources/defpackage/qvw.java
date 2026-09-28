package defpackage;

import android.text.TextUtils;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.patron.FavoriteSport;
import com.sporty.android.core.model.patron.FavoriteSummary;
import com.sporty.android.core.model.patron.FavoriteTournament;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositFragment;
import com.sportybet.android.globalpay.pixBtg.deposit.b;
import com.sportybet.android.globalpay.pixBtg.deposit.f;
import com.sportybet.android.globalpay.pixBtg.deposit.g;
import com.sportybet.plugin.realsports.data.MyFavoriteSport;
import com.sportybet.plugin.realsports.data.PostSportId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qvw implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qvw(rr90 rr90Var, int i) {
        this.a = 2;
        this.b = rr90Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                rvw rvwVar = (rvw) obj3;
                hqc hqcVar = (hqc) obj;
                hqc hqcVar2 = (hqc) obj2;
                ozw ozwVar = rvwVar.B;
                if ((hqcVar instanceof lqc) || (hqcVar2 instanceof lqc)) {
                    return new lqc();
                }
                if (!(hqcVar instanceof nqc) || !(hqcVar2 instanceof nqc)) {
                    return new kqc();
                }
                List<MyFavoriteSport> list = (List) ((nqc) hqcVar).a;
                FavoriteSummary favoriteSummary = (FavoriteSummary) ((nqc) hqcVar2).a;
                rvwVar.y = favoriteSummary.getSportRefMapping();
                rvwVar.z = favoriteSummary.getTournamentRefMapping();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (MyFavoriteSport myFavoriteSport : list) {
                    if (TextUtils.equals(myFavoriteSport.leagueSettingType, AnalyticsParam.LEAGUE_PARAM_LEAGUE)) {
                        arrayList.add(myFavoriteSport.id);
                        arrayList2.add(myFavoriteSport);
                        FavoriteSport favoriteSport = (FavoriteSport) rvwVar.y.get(myFavoriteSport.id);
                        if (favoriteSport != null) {
                            LinkedHashMap linkedHashMap = ozwVar.b;
                            String str = myFavoriteSport.id;
                            List<FavoriteTournament> list2 = favoriteSport.tournaments;
                            linkedHashMap.put(str, Integer.valueOf(list2 != null ? list2.size() : 0));
                        }
                    }
                }
                ArrayList arrayList3 = ozwVar.d;
                HashSet hashSet = ozwVar.a;
                arrayList3.clear();
                ozwVar.d.addAll(arrayList2);
                hashSet.clear();
                Iterator it = rvwVar.z.values().iterator();
                while (it.hasNext()) {
                    hashSet.add(((FavoriteTournament) it.next()).id);
                }
                PostSportId postSportId = new PostSportId();
                postSportId.sportIds = arrayList;
                uww uwwVar = rvwVar.i;
                uwwVar.a.m(new lqc());
                ap0.b().Q(postSportId).G(new sww(uwwVar, postSportId));
                return new nqc(ozwVar);
            case 1:
                final PixBtgDepositFragment pixBtgDepositFragment = (PixBtgDepositFragment) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgDepositFragment.m0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = new v3a0();
                        aVar.r(objY);
                    }
                    final v3a0 v3a0Var = (v3a0) objY;
                    Unit unit = Unit.a;
                    boolean zA = aVar.A(pixBtgDepositFragment);
                    Object objY2 = aVar.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new b(pixBtgDepositFragment, v3a0Var, null);
                        aVar.r(objY2);
                    }
                    xvf.e(aVar, unit, (Function2) objY2);
                    d dVarE = j.e(d.a.b, 1.0f);
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarE);
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
                    pixBtgDepositFragment.D1(6, pp8.b(1323457164, new gaj() { // from class: h710
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            f.c cVar = (f.c) obj4;
                            a aVar3 = (a) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            ohp<Object>[] ohpVarArr2 = PixBtgDepositFragment.m0;
                            cVar.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar3.M(cVar) : aVar3.A(cVar) ? 4 : 2;
                            }
                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                kme kmeVar = cVar.h;
                                g gVarF1 = pixBtgDepositFragment.F1();
                                boolean zA2 = aVar3.A(gVarF1);
                                Object objY3 = aVar3.y();
                                if (zA2 || objY3 == a.C0041a.a) {
                                    objY3 = new x710(1, gVarF1, g.class, "onDialogAction", "onDialogAction(Lcom/sportybet/android/globalpay/pixBtg/deposit/PixBtgDepositDialogUiAction;)V", 0, 0);
                                    aVar3.r(objY3);
                                }
                                e710.a(kmeVar, v3a0Var, (Function1) ((chp) objY3), aVar3, 56);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                qr90.b((rr90) obj3, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }

    public /* synthetic */ qvw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
