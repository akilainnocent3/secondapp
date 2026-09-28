package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.spindabottle.remote.models.WalletInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spindabottle.repositories.SpinDaBottleRepository$walletInfo$2", f = "SpinDaBottleRepository.kt", l = {51}, m = "invokeSuspend", v = 1)
public final class c6b0 extends tje0 implements Function1<v1b<? super HTTPResponse<WalletInfo>>, Object> {
    public int a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new c6b0(1, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<WalletInfo>> v1bVar) {
        return ((c6b0) create(v1bVar)).invokeSuspend(Unit.a);
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
        s5b0 s5b0VarQ = on0.q();
        this.a = 1;
        Object objWalletInfo = s5b0VarQ.walletInfo(this);
        return objWalletInfo == y5bVar ? y5bVar : objWalletInfo;
    }
}
