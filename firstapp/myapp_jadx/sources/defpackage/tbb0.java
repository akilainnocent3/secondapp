package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.spinmatch.model.request.PlaceBetPayload;
import com.sportygames.spinmatch.model.response.MatchPlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.viewmodel.SpinMatchViewModel$placeBet$1", f = "SpinMatchViewModel.kt", l = {318}, m = "invokeSuspend", v = 1)
public final class tbb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nbb0 c;
    public final /* synthetic */ PlaceBetPayload d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbb0(boolean z, nbb0 nbb0Var, PlaceBetPayload placeBetPayload, v1b<? super tbb0> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = nbb0Var;
        this.d = placeBetPayload;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tbb0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tbb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        nbb0 nbb0Var = this.c;
        ssw<LoadingState<HTTPResponse<MatchPlaceBetResponse>>> sswVar = nbb0Var.w;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (!this.b) {
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
            }
            mbb0 mbb0Var = nbb0Var.a;
            this.a = 1;
            mbb0Var.getClass();
            pfd pfdVar = fse.a;
            obj = ej5.d(odd.b, new a52(new ibb0(this.d, null), null), this);
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
            sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
        } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
            sswVar.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(new Integer(-11), null), (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
        } else {
            Status status = Status.FAILED;
            resultWrapper.getClass();
            sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
        }
        return Unit.a;
    }
}
