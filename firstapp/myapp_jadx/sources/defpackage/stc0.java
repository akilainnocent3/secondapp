package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportynews.data.NewsArticleList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.usecase.SportyNewsUseCase$fetchNewsListByCategory$4", f = "SportyNewsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class stc0 extends tje0 implements Function2<lk50<? extends BaseResponse<NewsArticleList>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ssc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stc0(ssc0 ssc0Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = ssc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        stc0 stc0Var = new stc0(this.b, v1bVar);
        stc0Var.a = obj;
        return stc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BaseResponse<NewsArticleList>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((stc0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.invoke(lk50Var);
        return Unit.a;
    }
}
