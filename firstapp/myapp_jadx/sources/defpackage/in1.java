package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.pocketrocket.model.response.RecentRoundMultiplier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pocketrocket.viewmodels.AvailableViewModel$getRecentRoundMultiplier$1", f = "AvailableViewModel.kt", l = {472}, m = "invokeSuspend", v = 1)
public final class in1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fn1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in1(fn1 fn1Var, v1b<? super in1> v1bVar) {
        super(2, v1bVar);
        this.b = fn1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new in1(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((in1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        fn1 fn1Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            fn1Var.B.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
            ru50 ru50Var = fn1Var.a;
            this.a = 1;
            ru50Var.getClass();
            pfd pfdVar = fse.a;
            obj = ej5.d(odd.b, new a52(new lu50(1, null), null), this);
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
            fn1Var.B.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
        } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
            fn1Var.B.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(new Integer(-4), null), (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
        } else {
            ssw<LoadingState<HTTPResponse<RecentRoundMultiplier>>> sswVar = fn1Var.B;
            Status status = Status.FAILED;
            resultWrapper.getClass();
            sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
        }
        return Unit.a;
    }
}
