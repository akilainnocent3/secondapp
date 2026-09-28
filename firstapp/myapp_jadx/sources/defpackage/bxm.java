package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.LoginResponse;
import com.sportybet.android.account.international.verify.INTVerifyFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class bxm implements Function1<lk50<? extends BaseResponse<LoginResponse>>, Unit> {
    public final /* synthetic */ r5b a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ INTVerifyFragment c;

    public bxm(r5b r5bVar, ibs ibsVar, INTVerifyFragment iNTVerifyFragment) {
        this.a = r5bVar;
        this.b = ibsVar;
        this.c = iNTVerifyFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(lk50<? extends BaseResponse<LoginResponse>> lk50Var) {
        lk50<? extends BaseResponse<LoginResponse>> lk50Var2 = lk50Var;
        lk50Var2.getClass();
        INTVerifyFragment iNTVerifyFragment = this.c;
        xwm xwmVar = new xwm(1, iNTVerifyFragment, INTVerifyFragment.class, "handleRegisterVerifyResult", "handleRegisterVerifyResult(Lcom/sporty/android/common/network/data/BaseResponse;)V", 0);
        ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
        iNTVerifyFragment.w0(lk50Var2, xwmVar);
        if (!(lk50Var2 instanceof lk50.b)) {
            this.a.l(this.b);
        }
        return Unit.a;
    }
}
