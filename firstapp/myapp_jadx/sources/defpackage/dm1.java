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

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyherov2.viewmodels.AvailableViewModel$fetchTournamentHistoryBy$1", f = "AvailableViewModel.kt", l = {615}, m = "invokeSuspend", v = 1)
public final class dm1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kn1 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm1(kn1 kn1Var, long j, v1b<? super dm1> v1bVar) {
        super(2, v1bVar);
        this.b = kn1Var;
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dm1(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dm1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objD;
        List list;
        String message;
        Integer total;
        Integer bizCode;
        kn1 kn1Var = this.b;
        ssw<LoadingState<HTTPResponse<HashMap<Long, List<TournamentHistoryResponse>>>>> sswVar = kn1Var.D;
        y5b y5bVar = y5b.a;
        int i = this.a;
        long j = this.c;
        if (i == 0) {
            uj50.b(obj);
            sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
            g5c0 g5c0Var = kn1Var.a;
            this.a = 1;
            g5c0Var.getClass();
            pfd pfdVar = fse.a;
            objD = ej5.d(odd.b, new a52(new x4c0(j, null), null), this);
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
