package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.lobby.repositories.WalletRepository$getFavouriteResponse$2", f = "WalletRepository.kt", l = {65}, m = "invokeSuspend", v = 1)
public final class nxi0 extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends GameDetails>>>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Integer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxi0(int i, Integer num, v1b<? super nxi0> v1bVar) {
        super(1, v1bVar);
        this.b = i;
        this.c = num;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new nxi0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends GameDetails>>> v1bVar) {
        return ((nxi0) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objC = cxi0VarH.c(this.b, this.c, this);
        return objC == y5bVar ? y5bVar : objC;
    }
}
