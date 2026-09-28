package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.lobby.remote.models.SearchResultResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.lobby.repositories.WalletRepository$getSearchResult$2", f = "WalletRepository.kt", l = {120}, m = "invokeSuspend", v = 1)
public final class rxi0 extends tje0 implements Function1<v1b<? super HTTPResponse<SearchResultResponse>>, Object> {
    public int a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxi0(String str, v1b<? super rxi0> v1bVar) {
        super(1, v1bVar);
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new rxi0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<SearchResultResponse>> v1bVar) {
        return ((rxi0) create(v1bVar)).invokeSuspend(Unit.a);
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
        mpe0 mpe0Var = on0.a;
        cxi0 cxi0VarH = on0.h();
        this.a = 1;
        Object objA = cxi0VarH.a(this.b, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
