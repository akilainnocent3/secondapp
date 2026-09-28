package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.tournament.model.TournamentHistoryResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherocompose.viewmodel.SportyHeroViewModel$fetchTournamentHistoryBy$1", f = "SportyHeroViewModel.kt", l = {257}, m = "invokeSuspend", v = 1)
public final class d6c0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ k6c0 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6c0(k6c0 k6c0Var, long j, v1b<? super d6c0> v1bVar) {
        super(2, v1bVar);
        this.b = k6c0Var;
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d6c0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d6c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objE;
        List list;
        String message;
        Integer total;
        Integer bizCode;
        k6c0 k6c0Var = this.b;
        ssw<LoadingState<HTTPResponse<HashMap<Long, List<TournamentHistoryResponse>>>>> sswVar = k6c0Var.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        long j = this.c;
        if (i == 0) {
            uj50.b(obj);
            sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
            fum fumVar = k6c0Var.a;
            this.a = 1;
            objE = fumVar.e(j, this);
            if (objE == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objE = obj;
        }
        ResultWrapper resultWrapper = (ResultWrapper) objE;
        if (resultWrapper instanceof ResultWrapper.Success) {
            HTTPResponse hTTPResponse = (HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue();
            HashMap map = new HashMap();
            Long l = new Long(j);
            if (hTTPResponse == null || (list = (List) hTTPResponse.getData()) == null) {
                list = m2g.a;
            }
            map.put(l, list);
            int iIntValue = 0;
            int iIntValue2 = (hTTPResponse == null || (bizCode = hTTPResponse.getBizCode()) == null) ? 0 : bizCode.intValue();
            if (hTTPResponse == null || (message = hTTPResponse.getMessage()) == null) {
                message = "";
            }
            String str = message;
            if (hTTPResponse != null && (total = hTTPResponse.getTotal()) != null) {
                iIntValue = total.intValue();
            }
            sswVar.j(new LoadingState<>(Status.SUCCESS, new HTTPResponse(new Integer(iIntValue2), str, new Integer(iIntValue), map, null, null, null), null, null, null, 16, null));
        } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
            sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
        } else {
            sswVar.j(new LoadingState<>(Status.FAILED, null, resultWrapper instanceof ResultWrapper.GenericError ? (ResultWrapper.GenericError) resultWrapper : null, null, null, 16, null));
        }
        return Unit.a;
    }
}
