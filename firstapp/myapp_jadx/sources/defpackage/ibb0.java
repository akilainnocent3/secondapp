package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.spinmatch.model.request.PlaceBetPayload;
import com.sportygames.spinmatch.model.response.MatchPlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.data.SpinMatchRepository$placeBet$2", f = "SpinMatchRepository.kt", l = {76}, m = "invokeSuspend", v = 1)
public final class ibb0 extends tje0 implements Function1<v1b<? super HTTPResponse<MatchPlaceBetResponse>>, Object> {
    public int a;
    public final /* synthetic */ PlaceBetPayload b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibb0(PlaceBetPayload placeBetPayload, v1b<? super ibb0> v1bVar) {
        super(1, v1bVar);
        this.b = placeBetPayload;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new ibb0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<MatchPlaceBetResponse>> v1bVar) {
        return ((ibb0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        mpe0 mpe0Var = on0.a;
        abb0 abb0VarP = on0.p();
        this.a = 1;
        Object objA = abb0VarP.a(this.b, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
