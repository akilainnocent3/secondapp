package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportynews.data.HeroArticleList;
import com.sporty.android.sportynews.data.NewsArticleList;
import com.sporty.android.sportynews.data.SubArticleList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.usecase.SportyNewsUseCase$fetchCombinedArticleListByCategory$1", f = "SportyNewsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ktc0 extends tje0 implements gaj<BaseResponse<HeroArticleList>, BaseResponse<SubArticleList>, v1b<? super BaseResponse<NewsArticleList>>, Object> {
    public /* synthetic */ BaseResponse a;
    public /* synthetic */ BaseResponse b;
    public final /* synthetic */ xtc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ktc0(xtc0 xtc0Var, v1b<? super ktc0> v1bVar) {
        super(3, v1bVar);
        this.c = xtc0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(BaseResponse<HeroArticleList> baseResponse, BaseResponse<SubArticleList> baseResponse2, v1b<? super BaseResponse<NewsArticleList>> v1bVar) {
        ktc0 ktc0Var = new ktc0(this.c, v1bVar);
        ktc0Var.a = baseResponse;
        ktc0Var.b = baseResponse2;
        return ktc0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse = this.a;
        BaseResponse baseResponse2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.c.getClass();
        return xtc0.a(baseResponse, baseResponse2);
    }
}
