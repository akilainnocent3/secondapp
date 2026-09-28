package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.presentation.viewmodel.CashoutSuccessSingleViewModel$addToBetSlip$1", f = "CashoutSuccessSingleViewModel.kt", l = {117}, m = "invokeSuspend", v = 2)
public final class hs6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ks6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs6(ks6 ks6Var, boolean z, ArrayList arrayList, v1b v1bVar) {
        super(2, v1bVar);
        this.b = ks6Var;
        this.c = z;
        this.d = arrayList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hs6(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hs6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ks6 ks6Var = this.b;
        jrm jrmVar = ks6Var.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            jrmVar.X0(true);
            if (!this.c && !jrmVar.o0()) {
                jrmVar.G(true);
            }
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                pt90 pt90Var = (pt90) obj2;
                pt90Var.getClass();
                qt90 qt90Var = pt90Var.a;
                String str = qt90Var.c;
                Tournament tournament = new Tournament();
                st90 st90Var = pt90Var.c;
                tournament.id = qt90Var.d;
                Category category = new Category();
                category.id = str;
                category.tournament = tournament;
                Sport sport = new Sport();
                sport.id = qt90Var.b;
                sport.category = category;
                Event event = new Event();
                event.eventId = qt90Var.a;
                event.categoryId = str;
                event.homeTeamName = qt90Var.f;
                event.awayTeamName = qt90Var.g;
                int i3 = size;
                event.estimateStartTime = qt90Var.j;
                event.matchStatus = qt90Var.h;
                event.status = qt90Var.i;
                event.sport = sport;
                Market market = new Market();
                rt90 rt90Var = pt90Var.b;
                String str2 = rt90Var.a;
                String str3 = rt90Var.b;
                market.id = str2;
                market.product = rt90Var.c;
                market.desc = rt90Var.d;
                market.status = rt90Var.e;
                if (str3.length() > 0) {
                    market.specifier = str3;
                }
                Outcome outcome = new Outcome();
                outcome.id = st90Var.a;
                outcome.odds = st90Var.b;
                Double dH = b.h(st90Var.c);
                outcome.probability = dH != null ? dH.doubleValue() : 0.0d;
                outcome.isActive = st90Var.d;
                outcome.desc = st90Var.e;
                new Selection(event, market, outcome);
                jrmVar.j0(event, market, outcome, k980.CASHOUT_RECOMMENDATION);
                size = i3;
            }
            jrmVar.X0(false);
            b390 b390Var = ks6Var.f;
            Unit unit = Unit.a;
            this.a = 1;
            if (b390Var.emit(unit, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
