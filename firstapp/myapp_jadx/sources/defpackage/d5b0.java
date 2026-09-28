package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.spin2win.model.PlaceBetPayload;
import com.sportygames.spin2win.model.response.Spin2WinPlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.viewmodel.Spin2WinViewModel$placeBet$1", f = "Spin2WinViewModel.kt", l = {518}, m = "invokeSuspend", v = 1)
public final class d5b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ v4b0 c;
    public final /* synthetic */ PlaceBetPayload d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5b0(boolean z, v4b0 v4b0Var, PlaceBetPayload placeBetPayload, v1b<? super d5b0> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = v4b0Var;
        this.d = placeBetPayload;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d5b0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d5b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objD;
        v4b0 v4b0Var = this.c;
        ssw<LoadingState<HTTPResponse<Spin2WinPlaceBetResponse>>> sswVar = v4b0Var.H;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (!this.b) {
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
            }
            u4b0 u4b0Var = v4b0Var.d;
            this.a = 1;
            u4b0Var.getClass();
            pfd pfdVar = fse.a;
            objD = ej5.d(odd.b, new a52(new r4b0(this.d, null), null), this);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objD = obj;
        }
        ResultWrapper resultWrapper = (ResultWrapper) objD;
        if (resultWrapper instanceof ResultWrapper.Success) {
            sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
        } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
            sswVar.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(null, new HTTPResponse(new Integer(-11), null, null, null, null, null, null, 64, null)), (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
        } else {
            Status status = Status.FAILED;
            resultWrapper.getClass();
            sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
        }
        return Unit.a;
    }
}
