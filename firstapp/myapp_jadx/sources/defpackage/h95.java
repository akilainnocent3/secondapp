package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.register.presentation.br.BrRegistrationSuccessfulViewModel$loadRegistrationLoyaltyContent$mission$1", f = "BrRegistrationSuccessfulViewModel.kt", l = {114}, m = "invokeSuspend", v = 2)
public final class h95 extends tje0 implements Function2<v5b, v1b<? super List<? extends qlw>>, Object> {
    public int a;
    public final /* synthetic */ d95 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h95(d95 d95Var, v1b<? super h95> v1bVar) {
        super(2, v1bVar);
        this.b = d95Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h95(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends qlw>> v1bVar) {
        return ((h95) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        yzh yzhVarD = this.b.a.a.d();
        this.a = 1;
        Object objQ = bm50.q(yzhVarD, this);
        return objQ == y5bVar ? y5bVar : objQ;
    }
}
