package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$getTxDetails$2", f = "PocketRepositoryImpl.kt", l = {255}, m = "invokeSuspend", v = 2)
public final class nt10 extends tje0 implements Function1<v1b<? super BaseResponse<Transaction>>, Object> {
    public int a;
    public final /* synthetic */ ms10 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt10(int i, v1b v1bVar, ms10 ms10Var, String str) {
        super(1, v1bVar);
        this.b = ms10Var;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new nt10(this.d, v1bVar, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super BaseResponse<Transaction>> v1bVar) {
        return ((nt10) create(v1bVar)).invokeSuspend(Unit.a);
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
        pr10 pr10Var = this.b.a;
        this.a = 1;
        Object objO = pr10Var.O(this.c, this.d, this);
        return objO == y5bVar ? y5bVar : objO;
    }
}
