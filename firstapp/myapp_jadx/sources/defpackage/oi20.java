package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.event.recommendcode.PreMatchRecommendedCodeViewModel$loadMoreRecommendedCodes$1", f = "PreMatchRecommendedCodeViewModel.kt", l = {151}, m = "invokeSuspend", v = 2)
public final class oi20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mi20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Event d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi20(mi20 mi20Var, String str, Event event, v1b<? super oi20> v1bVar) {
        super(2, v1bVar);
        this.b = mi20Var;
        this.c = str;
        this.d = event;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new oi20(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((oi20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Event event = this.d;
            String str = event != null ? event.homeTeamIcon : null;
            String str2 = event != null ? event.awayTeamIcon : null;
            mi20 mi20Var = this.b;
            int i2 = ((mj40) mi20Var.B.getValue()).c;
            this.a = 1;
            if (mi20Var.A1(this.c, str, str2, i2, true, false, this) == y5bVar) {
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
