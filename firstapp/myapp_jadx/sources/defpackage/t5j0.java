package defpackage;

import com.sporty.android.core.model.patron.NameConfirmationStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel$updateUserCert$1", f = "WelcomeRewardViewModel.kt", l = {184}, m = "invokeSuspend", v = 2)
public final class t5j0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ w4j0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5j0(v1b v1bVar, w4j0 w4j0Var) {
        super(2, v1bVar);
        this.b = w4j0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t5j0(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t5j0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lyh<lk50<NameConfirmationStatus>> lyhVarJ0 = this.b.w.j0(pu0.c.a);
            this.a = 1;
            if (bm50.p(lyhVarJ0, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
