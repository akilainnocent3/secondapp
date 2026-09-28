package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.reached.ReachedLimitsViewModel$loadFromServer$1", f = "ReachedLimitsViewModel.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class z140 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c240 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z140(c240 c240Var, v1b<? super z140> v1bVar) {
        super(2, v1bVar);
        this.b = c240Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z140(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z140) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        y5b y5bVar = y5b.a;
        int i = this.a;
        y140 y140Var = null;
        c240 c240Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            sl50 sl50Var = new sl50(c240Var.e.a());
            this.a = 1;
            obj = s0i.a(sl50Var, this);
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
        lk50 lk50Var = (lk50) obj;
        if (lk50Var instanceof lk50.c) {
            y140Var = new y140(k2h.c((List) ((lk50.c) lk50Var).a));
        } else if (lk50Var instanceof lk50.a) {
            y140Var = new y140(c140.A);
        } else if (!(lk50Var instanceof lk50.b)) {
            uhc.a();
            return null;
        }
        if (y140Var != null) {
            wwd0 wwd0Var = c240Var.a;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, y140Var));
            wwd0 wwd0Var2 = c240Var.i;
            do {
                value2 = wwd0Var2.getValue();
                ((Boolean) value2).getClass();
            } while (!wwd0Var2.g(value2, Boolean.FALSE));
        }
        return Unit.a;
    }
}
