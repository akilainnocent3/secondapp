package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchTournamentEvents$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tim extends tje0 implements Function2<List<? extends Tournament>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ c6g0 b;
    public final /* synthetic */ RegularMarketRule c;
    public final /* synthetic */ iim d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tim(c6g0 c6g0Var, RegularMarketRule regularMarketRule, iim iimVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = c6g0Var;
        this.c = regularMarketRule;
        this.d = iimVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tim timVar = new tim(this.b, this.c, this.d, v1bVar);
        timVar.a = obj;
        return timVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends Tournament> list, v1b<? super Unit> v1bVar) {
        return ((tim) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = this.c.a;
        iim iimVar = this.d;
        List<ing> listC = kgb0.c(list, "sr:sport:1", str, iimVar.R);
        if (listC == null) {
            listC = m2g.a;
        }
        c6g0 c6g0Var = this.b;
        c6g0Var.f = listC;
        if (c6g0Var.d) {
            iimVar.u0.m(new UIState.Success(c6g0Var));
        }
        return Unit.a;
    }
}
