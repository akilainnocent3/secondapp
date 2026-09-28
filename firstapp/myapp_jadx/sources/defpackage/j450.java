package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.remixbet.RemixBetOrderRequest;
import com.sporty.android.core.model.remixbet.RemixBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.remixbet.data.repository.RemixBetRepositoryImpl$getOrderRemixBet$2", f = "RemixBetRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class j450 extends tje0 implements Function2<v5b, v1b<? super RemixBetResponse>, Object> {
    public int a;
    public final /* synthetic */ l450 b;
    public final /* synthetic */ RemixBetOrderRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j450(l450 l450Var, RemixBetOrderRequest remixBetOrderRequest, v1b<? super j450> v1bVar) {
        super(2, v1bVar);
        this.b = l450Var;
        this.c = remixBetOrderRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j450(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super RemixBetResponse> v1bVar) {
        return ((j450) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            g3z g3zVar = this.b.a;
            this.a = 1;
            obj = g3zVar.i(this.c, this);
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
        return n52.b((BaseResponse) obj);
    }
}
