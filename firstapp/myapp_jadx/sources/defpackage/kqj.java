package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.screens.GameplayScreenKt$GameplayScreen$completeCoinFlight$2", f = "GameplayScreen.kt", l = {219}, m = "invokeSuspend", v = 1)
public final class kqj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m6a0<Long, pr50> b;
    public final /* synthetic */ pr50 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ m6a0<Long, Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqj(m6a0<Long, pr50> m6a0Var, pr50 pr50Var, long j, m6a0<Long, Boolean> m6a0Var2, v1b<? super kqj> v1bVar) {
        super(2, v1bVar);
        this.b = m6a0Var;
        this.c = pr50Var;
        this.d = j;
        this.e = m6a0Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kqj(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kqj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        m6a0<Long, pr50> m6a0Var = this.b;
        pr50 pr50Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            pr50 pr50Var2 = m6a0Var.get(new Long(pr50Var.d));
            if ((pr50Var2 != null ? pr50Var2.e : null) != qr50.b) {
                m6a0Var.put(new Long(pr50Var.d), pr50Var);
            }
            this.a = 1;
            if (hkd.b(this.d, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        long j = pr50Var.d;
        long j2 = pr50Var.d;
        if (Intrinsics.g(m6a0Var.get(new Long(j)), pr50Var)) {
            m6a0Var.remove(new Long(j2));
        }
        this.e.remove(new Long(j2));
        return Unit.a;
    }
}
