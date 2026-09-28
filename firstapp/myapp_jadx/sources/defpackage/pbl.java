package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.hammer.HammerBoxKt$AnimatedMajorWinValue$1$1", f = "HammerBox.kt", l = {338}, m = "invokeSuspend", v = 1)
public final class pbl extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ double c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbl(wd0<Float, ij0> wd0Var, double d, v1b<? super pbl> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = d;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pbl(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pbl) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Float f = new Float((float) this.c);
            gzg0 gzg0VarE = yi0.e(4000, 0, xkf.a, 2);
            this.a = 1;
            if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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
