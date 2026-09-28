package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.ClabeBankAccount;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$getClabeBankAccounts$2", f = "PocketRepositoryImpl.kt", l = {1420}, m = "invokeSuspend", v = 2)
public final class rs10 extends tje0 implements Function1<v1b<? super BaseResponse<List<? extends ClabeBankAccount>>>, Object> {
    public int a;
    public final /* synthetic */ ms10 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs10(ms10 ms10Var, int i, v1b<? super rs10> v1bVar) {
        super(1, v1bVar);
        this.b = ms10Var;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new rs10(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super BaseResponse<List<? extends ClabeBankAccount>>> v1bVar) {
        return ((rs10) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objP = pr10Var.P(this.c, this);
        return objP == y5bVar ? y5bVar : objP;
    }
}
