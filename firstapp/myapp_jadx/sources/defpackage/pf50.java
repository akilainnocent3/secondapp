package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class pf50 implements gv5<BaseResponse<String>> {
    public final /* synthetic */ nf50 a;

    @c0d(c = "com.sportybet.android.account.international.resetpwd.viewmodel.ResetPwdViewModel$triggerResetPasswordFromSettings$2$onFailure$1", f = "ResetPwdViewModel.kt", l = {210}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ nf50 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nf50 nf50Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = nf50Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            y5b y5bVar = y5b.a;
            int i = this.a;
            nf50 nf50Var = this.b;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = nf50Var.c;
                StringUiText stringUiText = vch0.a;
                rb90 rb90Var = new rb90(new ResourceUiText(R.string.common_feedback__something_went_wrong_tip));
                this.a = 1;
                if (b390Var.emit(rb90Var, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            wwd0 wwd0Var = nf50Var.a;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, gxo.a((gxo) value, null, null, false, false, null, false, false, 503)));
            return Unit.a;
        }
    }

    public pf50(nf50 nf50Var) {
        this.a = nf50Var;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<String>> su5Var, Throwable th) {
        th.getClass();
        nf50 nf50Var = this.a;
        nf50Var.y1(new a(nf50Var, null));
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<String>> su5Var, bi50<BaseResponse<String>> bi50Var) {
        BaseResponse<String> baseResponse = bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
            return;
        }
        int i = baseResponse.bizCode;
        nf50 nf50Var = this.a;
        nf50Var.y1(new kf50(i, nf50Var, null));
    }
}
