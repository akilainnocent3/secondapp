package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.spin2win.model.response.RecentWinsResponse;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.data.Spin2WinRepository$getRecentWins$2", f = "Spin2WinRepository.kt", l = {105}, m = "invokeSuspend", v = 1)
public final class p4b0 extends tje0 implements Function1<v1b<? super HTTPResponse<RecentWinsResponse>>, Object> {
    public u4b0 a;
    public int b;

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new p4b0(1, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<RecentWinsResponse>> v1bVar) {
        return ((p4b0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        u4b0 u4b0Var;
        Boolean error;
        Integer total;
        Integer bizCode;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            u4b0 u4b0Var2 = u4b0.a;
            mpe0 mpe0Var = on0.a;
            s1b0 s1b0VarO = on0.o();
            this.a = u4b0Var2;
            this.b = 1;
            Object objD = s1b0VarO.d(this);
            if (objD == y5bVar) {
                return y5bVar;
            }
            obj = objD;
            u4b0Var = u4b0Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u4b0Var = this.a;
            uj50.b(obj);
        }
        HTTPResponse hTTPResponse = (HTTPResponse) obj;
        u4b0 u4b0Var3 = u4b0.a;
        u4b0Var.getClass();
        boolean zBooleanValue = false;
        Integer numValueOf = Integer.valueOf((hTTPResponse == null || (bizCode = hTTPResponse.getBizCode()) == null) ? 0 : bizCode.intValue());
        String message = hTTPResponse != null ? hTTPResponse.getMessage() : null;
        String str = message == null ? "" : message;
        Integer numValueOf2 = Integer.valueOf((hTTPResponse == null || (total = hTTPResponse.getTotal()) == null) ? 0 : total.intValue());
        Object data = hTTPResponse != null ? hTTPResponse.getData() : null;
        ArrayList arrayList = data instanceof ArrayList ? (ArrayList) data : null;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        RecentWinsResponse recentWinsResponse = new RecentWinsResponse(arrayList);
        if (hTTPResponse != null && (error = hTTPResponse.getError()) != null) {
            zBooleanValue = error.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        String partialError = hTTPResponse != null ? hTTPResponse.getPartialError() : null;
        return new HTTPResponse(numValueOf, str, numValueOf2, recentWinsResponse, boolValueOf, partialError == null ? "" : partialError, null, 64, null);
    }
}
