package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.autobet.AutoBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$onClickPlaceAutoBet$1", f = "AutoBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jb1 extends tje0 implements Function2<BaseResponse<AutoBetResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ fb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb1(fb1 fb1Var, v1b<? super jb1> v1bVar) {
        super(2, v1bVar);
        this.b = fb1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jb1 jb1Var = new jb1(this.b, v1bVar);
        jb1Var.a = obj;
        return jb1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseResponse<AutoBetResponse> baseResponse, v1b<? super Unit> v1bVar) {
        return ((jb1) create(baseResponse, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        AutoBetResponse autoBetResponse;
        Integer maxDaysBeforeMatch;
        BaseResponse baseResponse = (BaseResponse) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (baseResponse.bizCode == 5101 && (autoBetResponse = (AutoBetResponse) baseResponse.data) != null && (maxDaysBeforeMatch = autoBetResponse.getMaxDaysBeforeMatch()) != null) {
            this.b.H = maxDaysBeforeMatch.intValue();
        }
        return Unit.a;
    }
}
