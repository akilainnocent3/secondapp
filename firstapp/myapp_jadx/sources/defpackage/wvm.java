package defpackage;

import android.content.Context;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.platform.features.captcha.model.CaptchaError;
import com.sportybet.android.account.international.login.INTLoginFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class wvm implements Function1<lk50<? extends BaseResponse<xdp>>, Unit> {
    public final /* synthetic */ r5b a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ INTLoginFragment c;

    public wvm(r5b r5bVar, ibs ibsVar, INTLoginFragment iNTLoginFragment) {
        this.a = r5bVar;
        this.b = ibsVar;
        this.c = iNTLoginFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(lk50<? extends BaseResponse<xdp>> lk50Var) {
        lk50<? extends BaseResponse<xdp>> lk50Var2 = lk50Var;
        lk50Var2.getClass();
        INTLoginFragment iNTLoginFragment = this.c;
        iNTLoginFragment.n0();
        if (lk50Var2 instanceof lk50.c) {
            BaseResponse<xdp> baseResponse = (BaseResponse) ((lk50.c) lk50Var2).a;
            ohp<Object>[] ohpVarArr = INTLoginFragment.E;
            iNTLoginFragment.s0(baseResponse);
        } else if (lk50Var2 instanceof lk50.a) {
            Throwable th = ((lk50.a) lk50Var2).a;
            if (th instanceof CaptchaError) {
                Context contextRequireContext = iNTLoginFragment.requireContext();
                contextRequireContext.getClass();
                zyf0.c(0, ((CaptchaError) th).getErrorString(contextRequireContext));
            } else {
                zyf0.c(0, sn5.d(iNTLoginFragment, R.string.common_feedback__something_went_wrong_tip, new Object[0]));
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_INT);
            aVar.b(th);
        } else {
            if (!(lk50Var2 instanceof lk50.b)) {
                uhc.a();
                return null;
            }
            iNTLoginFragment.o0();
        }
        if (!(lk50Var2 instanceof lk50.b)) {
            this.a.l(this.b);
        }
        return Unit.a;
    }
}
