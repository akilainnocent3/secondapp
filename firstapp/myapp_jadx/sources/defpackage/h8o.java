package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import com.sportybet.android.instantwin.newtork.model.response.Feature;
import com.sportybet.android.instantwin.newtork.model.response.FlexBetApiData;
import com.sportybet.android.instantwin.newtork.model.response.InstantWinGameType;
import com.sportybet.android.instantwin.newtork.model.response.OneCutBetApiData;
import com.sportybet.android.instantwin.newtork.model.response.Overall;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.presentation.instantwin.view.InstantWinActivity;
import com.sportybet.android.instantwin.router.event.MatchEventInput;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.instantwin.view.InstantWinActivity$initViewModel$1", f = "InstantWinActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h8o extends tje0 implements Function2<emo, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ InstantWinActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8o(InstantWinActivity instantWinActivity, v1b<? super h8o> v1bVar) {
        super(2, v1bVar);
        this.b = instantWinActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h8o h8oVar = new h8o(this.b, v1bVar);
        h8oVar.a = obj;
        return h8oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(emo emoVar, v1b<? super Unit> v1bVar) {
        return ((h8o) create(emoVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String oddsKey;
        Double dValueOf;
        Object next;
        FlexBetApiData flexibet;
        FlexBetApiData flexibet2;
        OneCutBetApiData onecut;
        FlexBetApiData flexibet3;
        final InstantWinActivity instantWinActivity = this.b;
        q8i0 q8i0Var = instantWinActivity.B;
        emo emoVar = (emo) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (emoVar instanceof emo.b) {
            emo.b bVar = (emo.b) emoVar;
            Overall overall = bVar.a;
            Sports sports = bVar.b;
            int i = InstantWinActivity.I;
            if (overall.getActive() && sports.getActive() && sports.getSportId().length() != 0) {
                n4p n4pVar = (n4p) instantWinActivity.C1();
                n4pVar.F = sports.getEventListPageDefaultSpecifier();
                Integer keepBetLimit = sports.getKeepBetLimit();
                n4pVar.s = keepBetLimit != null ? keepBetLimit.intValue() : 10;
                n4pVar.K = 0;
                Feature feature = sports.getFeature();
                Integer numValueOf = (feature == null || (flexibet3 = feature.getFlexibet()) == null) ? null : Integer.valueOf(flexibet3.getStatus());
                Feature feature2 = sports.getFeature();
                Integer numValueOf2 = (feature2 == null || (onecut = feature2.getOnecut()) == null) ? null : Integer.valueOf(onecut.getStatus());
                wdo wdoVar = (wdo) q8i0Var.getValue();
                ej5.c(o8i0.d(wdoVar), null, null, new xdo(wdoVar, numValueOf != null ? numValueOf.intValue() : 2, null), 3);
                wdo wdoVar2 = (wdo) q8i0Var.getValue();
                ej5.c(o8i0.d(wdoVar2), null, null, new ydo(wdoVar2, numValueOf2 != null ? numValueOf2.intValue() : 2, null), 3);
                tlo tloVarC1 = instantWinActivity.C1();
                Feature feature3 = sports.getFeature();
                if (feature3 == null || (flexibet2 = feature3.getFlexibet()) == null || (oddsKey = flexibet2.getOddsKey()) == null) {
                    oddsKey = "";
                }
                n4p n4pVar2 = (n4p) tloVarC1;
                n4pVar2.D = oddsKey;
                Feature feature4 = sports.getFeature();
                if (feature4 == null || (flexibet = feature4.getFlexibet()) == null || (dValueOf = flexibet.getFlexibleMinOdds()) == null) {
                    dValueOf = Double.valueOf(0.0d);
                }
                n4pVar2.E = dValueOf;
                n4pVar2.r = sports.getDynamicMultiBetBonus();
                n4pVar2.G = sports.getBonusType();
                n4pVar2.K = 0;
                n4pVar2.L = sports.getStatsEnable();
                List<InstantWinGameType> gameTypes = sports.getGameTypes();
                if (gameTypes != null) {
                    Iterator<T> it = gameTypes.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.g(((InstantWinGameType) next).getType(), "qk"));
                    if (((InstantWinGameType) next) != null) {
                        n4p n4pVar3 = instantWinActivity.E;
                        if (n4pVar3 == null) {
                            Intrinsics.n("sharedConfig");
                            throw null;
                        }
                        n4pVar3.m = sports.getSportId();
                        InstantWinInput instantWinInputG1 = instantWinActivity.G1();
                        String str = instantWinInputG1 != null ? instantWinInputG1.b : null;
                        if (str == null) {
                            str = "";
                        }
                        n4pVar3.n = str;
                        InstantWinInput instantWinInputG2 = instantWinActivity.G1();
                        String str2 = instantWinInputG2 != null ? instantWinInputG2.c : null;
                        n4pVar3.o = str2 != null ? str2 : "";
                        n4pVar3.p.put(sports.getSportId(), sports.getMarketCategories());
                        n4pVar3.q = sports.getMultiBetBonus();
                        InstantWinInput instantWinInputG3 = instantWinActivity.G1();
                        Intent intentQ = instantWinActivity.A1().q(instantWinActivity, new MatchEventInput(instantWinInputG3 != null ? instantWinInputG3.d : false));
                        intentQ.addFlags(65536);
                        instantWinActivity.startActivity(intentQ);
                        instantWinActivity.finish();
                    }
                }
            } else {
                instantWinActivity.H1();
            }
        } else if (emoVar instanceof emo.c) {
            int i2 = InstantWinActivity.I;
            sqo.j(instantWinActivity, new DialogInterface.OnClickListener() { // from class: g8o
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    int i4 = InstantWinActivity.I;
                    instantWinActivity.finish();
                }
            });
            fd fdVar = instantWinActivity.D;
            if (fdVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fdVar.c.E();
        } else {
            if (!(emoVar instanceof emo.a)) {
                uhc.a();
                return null;
            }
            fd fdVar2 = instantWinActivity.D;
            if (fdVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fdVar2.c.K();
        }
        return Unit.a;
    }
}
