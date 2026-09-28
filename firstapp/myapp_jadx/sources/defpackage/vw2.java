package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.BetOddsUseCases$validateOdds$2$result$1", f = "BetOddsUseCases.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class vw2 extends tje0 implements Function2<v5b, v1b<? super BaseResponse<List<? extends Event>>>, Object> {
    public int a;
    public final /* synthetic */ ww2 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw2(ww2 ww2Var, String str, v1b<? super vw2> v1bVar) {
        super(2, v1bVar);
        this.b = ww2Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vw2(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super BaseResponse<List<? extends Event>>> v1bVar) {
        return ((vw2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        e8h e8hVar = this.b.b;
        jqa0 jqa0Var = jqa0.BET_ODDS_USE_CASES_VALIDATE_ODDS;
        this.a = 1;
        Object objL = e8hVar.l(jqa0Var, this.c, this);
        return objL == y5bVar ? y5bVar : objL;
    }
}
