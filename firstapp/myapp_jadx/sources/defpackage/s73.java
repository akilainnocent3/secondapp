package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import com.sportybet.plugin.realsports.data.OutcomesRequest;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$reportGetOutcomesError$1", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s73 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ OutcomesRequest a;
    public final /* synthetic */ aak b;
    public final /* synthetic */ Throwable c;
    public final /* synthetic */ q73 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s73(OutcomesRequest outcomesRequest, aak aakVar, Throwable th, q73 q73Var, v1b<? super s73> v1bVar) {
        super(2, v1bVar);
        this.a = outcomesRequest;
        this.b = aakVar;
        this.c = th;
        this.d = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s73(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s73) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String strValueOf;
        ResponseBody responseBody;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Exception exc = new Exception("Get outcomes error in Betslip");
        ArrayList arrayList = new ArrayList();
        OutcomesRequest outcomesRequest = this.a;
        arrayList.add(a80.a("OutcomesRequest.body=" + outcomesRequest.getRequestBody()));
        arrayList.add(a80.a("OutcomesRequest.exception=" + outcomesRequest.getException()));
        arrayList.add(a80.a("OutcomesRequest.state=" + outcomesRequest.getState()));
        arrayList.add(a80.a("OutcomesRequest.status=" + outcomesRequest.getStatus()));
        arrayList.add(a80.a("OutcomesRequest.selections=" + outcomesRequest.getSelections()));
        arrayList.add(a80.a(rarBonoqWB.renSaJvIf + this.b.name()));
        Throwable th = this.c;
        if (th instanceof tom) {
            bi50<?> bi50Var = ((tom) th).c;
            strValueOf = (bi50Var == null || (responseBody = bi50Var.c) == null) ? null : responseBody.string();
        } else {
            strValueOf = String.valueOf(th);
        }
        arrayList.add(a80.a("OutcomesResponse.exception=" + strValueOf));
        exc.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_BET_SLIP);
        aVar.e(exc);
        wsm.d(this.d.Y, exc);
        return Unit.a;
    }
}
