package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberViewModel$1", f = "LuckyNumberViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
public final class z7u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f8u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7u(f8u f8uVar, v1b<? super z7u> v1bVar) {
        super(2, v1bVar);
        this.b = f8uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z7u(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z7u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        fjr fjrVar = this.b.d;
        this.a = 1;
        fjrVar.e(this);
        return y5bVar;
    }
}
