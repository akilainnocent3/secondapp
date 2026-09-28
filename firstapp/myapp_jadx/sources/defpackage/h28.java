package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.sportyherov2.remote.models.TopWinResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyherov2.viewmodels.CoefficientViewModel$getTopWinsDetail$1", f = "CoefficientViewModel.kt", l = {164}, m = "invokeSuspend", v = 1)
public final class h28 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c28 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ TopWinResponse e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h28(c28 c28Var, String str, String str2, TopWinResponse topWinResponse, v1b<? super h28> v1bVar) {
        super(2, v1bVar);
        this.b = c28Var;
        this.c = str;
        this.d = str2;
        this.e = topWinResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h28(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h28) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        c28 c28Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            c28Var.e.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
            g5c0 g5c0Var = c28Var.a;
            this.a = 1;
            g5c0Var.getClass();
            pfd pfdVar = fse.a;
            obj = ej5.d(odd.b, new a52(new u4c0(this.c, null), null), this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ResultWrapper resultWrapper = (ResultWrapper) obj;
        if (resultWrapper instanceof ResultWrapper.Success) {
            ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
            TopWinResponse topWinResponse = (TopWinResponse) ((HTTPResponse) success.getValue()).getData();
            if (topWinResponse != null) {
                topWinResponse.setCalledFrom(this.d);
            }
            TopWinResponse topWinResponse2 = (TopWinResponse) ((HTTPResponse) success.getValue()).getData();
            if (topWinResponse2 != null) {
                topWinResponse2.setTopWinOther(this.e);
            }
            c28Var.e.j(new LoadingState<>(Status.SUCCESS, success.getValue(), null, null, null, 16, null));
        } else {
            boolean z = resultWrapper instanceof ResultWrapper.NetworkError;
            ssw<LoadingState<HTTPResponse<TopWinResponse>>> sswVar = c28Var.e;
            if (z) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
        }
        return Unit.a;
    }
}
