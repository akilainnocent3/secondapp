package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.transfer.SubmitData;
import com.sporty.android.core.model.pocket.withdraw.transfer.TransferRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$submitTransfer$2", f = "PocketRepositoryImpl.kt", l = {998}, m = "invokeSuspend", v = 2)
public final class fu10 extends tje0 implements Function1<v1b<? super BaseResponse<SubmitData>>, Object> {
    public int a;
    public final /* synthetic */ ms10 b;
    public final /* synthetic */ TransferRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu10(ms10 ms10Var, TransferRequest transferRequest, v1b<? super fu10> v1bVar) {
        super(1, v1bVar);
        this.b = ms10Var;
        this.c = transferRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new fu10(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super BaseResponse<SubmitData>> v1bVar) {
        return ((fu10) create(v1bVar)).invokeSuspend(Unit.a);
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
        ms10 ms10Var = this.b;
        String json = ms10Var.f.toJson(this.c);
        itf0.a.a(json, new Object[0]);
        pr10 pr10Var = ms10Var.a;
        json.getClass();
        this.a = 1;
        Object objJ0 = pr10Var.j0(json, this);
        return objJ0 == y5bVar ? y5bVar : objJ0;
    }
}
