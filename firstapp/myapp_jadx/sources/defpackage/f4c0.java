package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.sportyherov2.remote.models.FetchUnderResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherocompose.repository.SportyHeroRepository$fetchUnderRange$2", f = "SportyHeroRepository.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class f4c0 extends tje0 implements Function1<v1b<? super HTTPResponse<FetchUnderResponse>>, Object> {
    public h5c0 a;
    public int b;
    public final /* synthetic */ h5c0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4c0(h5c0 h5c0Var, v1b<? super f4c0> v1bVar) {
        super(1, v1bVar);
        this.c = h5c0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new f4c0(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<FetchUnderResponse>> v1bVar) {
        return ((f4c0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        h5c0 h5c0Var;
        Object objE;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            h5c0Var = this.c;
            fjl fjlVarA = h5c0Var.a.a();
            this.a = h5c0Var;
            this.b = 1;
            objE = fjlVarA.e(this);
            if (objE == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h5c0 h5c0Var2 = this.a;
            uj50.b(obj);
            h5c0Var = h5c0Var2;
            objE = obj;
        }
        HTTPResponse hTTPResponse = (HTTPResponse) objE;
        h5c0Var.getClass();
        Object data = hTTPResponse != null ? hTTPResponse.getData() : null;
        data.getClass();
        Map map = (Map) data;
        HashMap map2 = new HashMap();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            double d = Double.parseDouble((String) it.next());
            Double d2 = (Double) map.get(String.valueOf(d));
            map2.put(Double.valueOf(d), Double.valueOf(d2 != null ? d2.doubleValue() : 0.0d));
        }
        Integer bizCode = hTTPResponse.getBizCode();
        Integer numValueOf = Integer.valueOf(bizCode != null ? bizCode.intValue() : 0);
        String message = hTTPResponse.getMessage();
        String str = message == null ? "" : message;
        Integer total = hTTPResponse.getTotal();
        Integer numValueOf2 = Integer.valueOf(total != null ? total.intValue() : 0);
        FetchUnderResponse fetchUnderResponse = new FetchUnderResponse(map2);
        Boolean error = hTTPResponse.getError();
        Boolean boolValueOf = Boolean.valueOf(error != null ? error.booleanValue() : false);
        String partialError = hTTPResponse.getPartialError();
        return new HTTPResponse(numValueOf, str, numValueOf2, fetchUnderResponse, boolValueOf, partialError == null ? "" : partialError, null, 64, null);
    }
}
