package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.rush.model.response.WalletInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.data.RushRepository$walletInfo$2", f = "RushRepository.kt", l = {24}, m = "invokeSuspend", v = 1)
public final class v660 extends tje0 implements Function1<v1b<? super HTTPResponse<WalletInfoResponse>>, Object> {
    public int a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new v660(1, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<WalletInfoResponse>> v1bVar) {
        return ((v660) create(v1bVar)).invokeSuspend(Unit.a);
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
        j660 j660VarN = on0.n();
        this.a = 1;
        Object objWalletInfo = j660VarN.walletInfo(this);
        return objWalletInfo == y5bVar ? y5bVar : objWalletInfo;
    }
}
