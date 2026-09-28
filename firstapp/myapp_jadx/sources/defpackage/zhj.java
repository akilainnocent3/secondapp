package defpackage;

import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.fruithunt.viewmodels.GameChatExitViewModel$getExitGamesList$1", f = "GameChatExitViewModel.kt", l = {38}, m = "invokeSuspend", v = 1)
public final class zhj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wwd0 a;
    public int b;
    public final /* synthetic */ aij c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhj(aij aijVar, String str, v1b<? super zhj> v1bVar) {
        super(2, v1bVar);
        this.c = aijVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zhj(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zhj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        LoadingState loadingState;
        aij aijVar = this.c;
        wwd0 wwd0Var = aijVar.d;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            LoadingState loadingState2 = new LoadingState(Status.RUNNING, null, null, null, null, 30, null);
            wwd0Var.getClass();
            wwd0Var.k(null, loadingState2);
            xhj xhjVar = aijVar.a;
            this.a = wwd0Var;
            this.b = 1;
            xhjVar.getClass();
            pfd pfdVar = fse.a;
            obj = ej5.d(odd.b, new a52(new whj(this.d, null), null), this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(QQWMbKFOuTf.lOGqMHRPrBBBc);
                return null;
            }
            wwd0Var = this.a;
            uj50.b(obj);
        }
        ResultWrapper resultWrapper = (ResultWrapper) obj;
        if (resultWrapper instanceof ResultWrapper.Success) {
            loadingState = new LoadingState(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 28, null);
        } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
            loadingState = new LoadingState(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 22, null);
        } else {
            Status status = Status.FAILED;
            resultWrapper.getClass();
            loadingState = new LoadingState(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 26, null);
        }
        wwd0Var.setValue(loadingState);
        return Unit.a;
    }
}
