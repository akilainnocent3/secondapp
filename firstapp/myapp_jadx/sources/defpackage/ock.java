package defpackage;

import com.sporty.android.core.model.patron.ReachedLimit;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.domain.GetReachedLimitsUseCase$invoke$1", f = "GetReachedLimitsUseCase.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class ock extends tje0 implements Function2<lk50<? extends List<? extends ReachedLimit>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pck c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ock(pck pckVar, v1b<? super ock> v1bVar) {
        super(2, v1bVar);
        this.c = pckVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ock ockVar = new ock(this.c, v1bVar);
        ockVar.b = obj;
        return ockVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends ReachedLimit>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((ock) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (lk50Var instanceof lk50.c) {
                des desVar = this.c.a;
                boolean z = !((Collection) ((lk50.c) lk50Var).a).isEmpty();
                this.b = null;
                this.a = 1;
                if (desVar.d(z, this) == y5bVar) {
                    return y5bVar;
                }
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
