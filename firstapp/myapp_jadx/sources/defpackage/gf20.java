package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.RecommendCodeResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PreMatchEventViewModel$fetchRecommendCodeComment$2", f = "PreMatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gf20 extends tje0 implements gaj<myh<? super RecommendCodeResponse>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ of20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf20(of20 of20Var, v1b<? super gf20> v1bVar) {
        super(3, v1bVar);
        this.b = of20Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super RecommendCodeResponse> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        gf20 gf20Var = new gf20(this.b, v1bVar);
        gf20Var.a = th;
        return gf20Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_PREMATCH_PAGE);
        aVar.p(th, "Error fetching recommend code comment", new Object[0]);
        this.b.E.setValue(null);
        return Unit.a;
    }
}
