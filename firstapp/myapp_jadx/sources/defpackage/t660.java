package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.rush.model.request.PlaceBetPayload;
import com.sportygames.rush.model.response.RushPlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.data.RushRepository$placeBet$2", f = "RushRepository.kt", l = {83}, m = "invokeSuspend", v = 1)
public final class t660 extends tje0 implements Function1<v1b<? super HTTPResponse<RushPlaceBetResponse>>, Object> {
    public int a;
    public final /* synthetic */ PlaceBetPayload b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t660(PlaceBetPayload placeBetPayload, v1b<? super t660> v1bVar) {
        super(1, v1bVar);
        this.b = placeBetPayload;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new t660(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<RushPlaceBetResponse>> v1bVar) {
        return ((t660) create(v1bVar)).invokeSuspend(Unit.a);
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
        j660 j660VarN = on0.n();
        this.a = 1;
        Object objA = j660VarN.a(this.b, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
