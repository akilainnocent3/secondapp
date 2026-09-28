package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.account.international.data.model.INTResetPwdCompleteResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.android.account.international.resetpwd.viewmodel.ResetPwdViewModel$handleResult$1", f = "ResetPwdViewModel.kt", l = {185}, m = "invokeSuspend", v = 2)
public final class lf50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public nf50 a;
    public int b;
    public final /* synthetic */ lk50<BaseResponse<INTResetPwdCompleteResponse>> c;
    public final /* synthetic */ nf50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lf50(lk50<? extends BaseResponse<INTResetPwdCompleteResponse>> lk50Var, nf50 nf50Var, v1b<? super lf50> v1bVar) {
        super(2, v1bVar);
        this.c = lk50Var;
        this.d = nf50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lf50(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lf50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        nf50 nf50Var;
        Object value2;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            lk50<BaseResponse<INTResetPwdCompleteResponse>> lk50Var = this.c;
            boolean z = lk50Var instanceof lk50.c;
            nf50 nf50Var2 = this.d;
            if (z) {
                nf50Var2.y1(new kf50(((BaseResponse) ((lk50.c) lk50Var).a).bizCode, nf50Var2, null));
            } else if (lk50Var instanceof lk50.a) {
                b390 b390Var = nf50Var2.c;
                StringUiText stringUiText = vch0.a;
                rb90 rb90Var = new rb90(new ResourceUiText(R.string.common_feedback__something_went_wrong_tip));
                this.a = nf50Var2;
                this.b = 1;
                if (b390Var.emit(rb90Var, this) == y5bVar) {
                    return y5bVar;
                }
                nf50Var = nf50Var2;
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                wwd0 wwd0Var = nf50Var2.a;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, gxo.a((gxo) value, null, null, true, false, null, false, false, 503)));
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a(dqvOSm.Fofllytl);
            return null;
        }
        nf50Var = this.a;
        uj50.b(obj);
        wwd0 wwd0Var2 = nf50Var.a;
        do {
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, gxo.a((gxo) value2, null, null, false, false, null, false, false, 503)));
        return Unit.a;
    }
}
