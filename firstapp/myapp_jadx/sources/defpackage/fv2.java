package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.BetItemOddsUpdater$updateSelections$2", f = "BetItemOddsUpdater.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fv2 extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public final /* synthetic */ gv2 a;
    public final /* synthetic */ Event b;
    public final /* synthetic */ Market c;
    public final /* synthetic */ Outcome d;
    public final /* synthetic */ Map<String, List<Selection>> e;
    public final /* synthetic */ Selection f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fv2(gv2 gv2Var, Event event, Market market, Outcome outcome, Map<String, ? extends List<? extends Selection>> map, Selection selection, v1b<? super fv2> v1bVar) {
        super(2, v1bVar);
        this.a = gv2Var;
        this.b = event;
        this.c = market;
        this.d = outcome;
        this.e = map;
        this.f = selection;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fv2(this.a, this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((fv2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jrm jrmVar = this.a.a;
        Map<String, List<Selection>> map = this.e;
        Market market = this.c;
        return Boolean.valueOf(jrmVar.N0(this.b, market, this.d, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : map.get(market.id), (14336 & 64) != 0 ? k980.DEFAULT : k980.DEFAULT, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : this.f, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false));
    }
}
