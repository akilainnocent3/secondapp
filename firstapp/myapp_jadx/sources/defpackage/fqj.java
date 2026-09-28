package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.screens.GameplayScreenKt$GameplayScreen$2$1$1$1", f = "GameplayScreen.kt", l = {251}, m = "invokeSuspend", v = 1)
public final class fqj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m6a0<Long, String> b;
    public final /* synthetic */ ooj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqj(m6a0<Long, String> m6a0Var, ooj oojVar, v1b<? super fqj> v1bVar) {
        super(2, v1bVar);
        this.b = m6a0Var;
        this.c = oojVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fqj(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fqj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        m6a0<Long, String> m6a0Var = this.b;
        ooj oojVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            ooj.f fVar = (ooj.f) oojVar;
            m6a0Var.put(new Long(fVar.a), fVar.b);
            this.a = 1;
            if (hkd.b(1500L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        m6a0Var.remove(new Long(((ooj.f) oojVar).a));
        return Unit.a;
    }
}
