package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.crash.remote.models.BiggestResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.viewmodel.CoefficientViewModel$getBiggestCoeff$1", f = "CoefficientViewModel.kt", l = {100}, m = "invokeSuspend", v = 1)
public final class b28 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m28 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b28(m28 m28Var, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.b = m28Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b28(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b28) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objI;
        m28 m28Var = this.b;
        ssw<LoadingState<HTTPResponse<List<BiggestResponse>>>> sswVar = m28Var.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        ArrayList arrayList = null;
        if (i == 0) {
            uj50.b(obj);
            sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
            rsm rsmVar = m28Var.a;
            this.a = 1;
            objI = rsmVar.i(this.c, this);
            if (objI == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objI = obj;
        }
        ResultWrapper resultWrapper = (ResultWrapper) objI;
        if (resultWrapper instanceof ResultWrapper.Success) {
            Status status = Status.SUCCESS;
            HTTPResponse hTTPResponse = (HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue();
            List<BiggestResponse> list = (List) hTTPResponse.getData();
            if (list != null) {
                arrayList = new ArrayList(l48.r(list, 10));
                for (BiggestResponse biggestResponse : list) {
                    arrayList.add(BiggestResponse.copy$default(biggestResponse, 0, 0, null, null, null, null, null, String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(Double.parseDouble(biggestResponse.getHouseCoefficient()))}, 1)), null, null, null, null, null, 8063, null));
                }
            }
            sswVar.j(new LoadingState<>(status, HTTPResponse.copy$default(hTTPResponse, null, null, null, arrayList, null, null, null, 119, null), null, null, null, 16, null));
        } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
            sswVar.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(new Integer(-4), null), (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
        } else {
            Status status2 = Status.FAILED;
            resultWrapper.getClass();
            sswVar.j(new LoadingState<>(status2, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
        }
        return Unit.a;
    }
}
