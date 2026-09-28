package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.ClabeBankAccount;
import com.sporty.android.core.model.pocket.common.ClabeType;
import com.sporty.android.core.model.pocket.common.CreateClabeBankAccountRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$createClabeBankAccount$2", f = "PocketRepositoryImpl.kt", l = {1431}, m = "invokeSuspend", v = 2)
public final class es10 extends tje0 implements Function1<v1b<? super BaseResponse<ClabeBankAccount>>, Object> {
    public int a;
    public final /* synthetic */ ms10 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ClabeType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es10(ms10 ms10Var, String str, ClabeType clabeType, v1b<? super es10> v1bVar) {
        super(1, v1bVar);
        this.b = ms10Var;
        this.c = str;
        this.d = clabeType;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new es10(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super BaseResponse<ClabeBankAccount>> v1bVar) {
        return ((es10) create(v1bVar)).invokeSuspend(Unit.a);
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
        CreateClabeBankAccountRequest createClabeBankAccountRequest = new CreateClabeBankAccountRequest(this.c, this.d);
        this.a = 1;
        Object objQ0 = pr10Var.q0(createClabeBankAccountRequest, this);
        return objQ0 == y5bVar ? y5bVar : objQ0;
    }
}
