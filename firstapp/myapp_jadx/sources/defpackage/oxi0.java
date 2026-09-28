package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.lobby.repositories.WalletRepository$getGameInfoByName$2", f = "WalletRepository.kt", l = {112}, m = "invokeSuspend", v = 1)
public final class oxi0 extends tje0 implements Function1<v1b<? super HTTPResponse<GameDetails>>, Object> {
    public int a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxi0(String str, v1b<? super oxi0> v1bVar) {
        super(1, v1bVar);
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new oxi0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<GameDetails>> v1bVar) {
        return ((oxi0) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objH = cxi0VarH.h(this.b, this);
        return objH == y5bVar ? y5bVar : objH;
    }
}
