package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.BetslipCustomizationStateHandler$applyTheme$1", f = "BetslipCustomizationStateHandler.kt", l = {222}, m = "invokeSuspend", v = 2)
public final class fo3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ do3 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo3(do3 do3Var, long j, v1b<? super fo3> v1bVar) {
        super(2, v1bVar);
        this.b = do3Var;
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fo3(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fo3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        do3 do3Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = do3Var.i;
            long j = this.c;
            wwd0Var.k(null, new Long(j));
            gy3 gy3Var = do3Var.a;
            this.a = 1;
            obj = gy3Var.d(j, this);
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
            wwd0 wwd0Var2 = do3Var.g;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, new Integer(((Number) value).intValue() + 1)));
            ku90<Unit> ku90Var = do3Var.l;
            ku90Var.a.a(Unit.a);
        } else if (lk50Var instanceof lk50.a) {
            do3Var.j.setValue(((lk50.a) lk50Var).b);
        } else if (!Intrinsics.g(lk50Var, lk50.b.a)) {
            uhc.a();
            return null;
        }
        do3Var.i.setValue(null);
        return Unit.a;
    }
}
