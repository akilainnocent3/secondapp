package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {230}, m = "invokeSuspend")
public final class ax90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zw90.a b;
    public final /* synthetic */ long c;
    public final /* synthetic */ zw90 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax90(zw90.a aVar, long j, zw90 zw90Var, v1b<? super ax90> v1bVar) {
        super(2, v1bVar);
        this.b = aVar;
        this.c = j;
        this.d = zw90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ax90(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ax90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wd0<jxo, jj0> wd0Var = this.b.a;
            jxo jxoVar = new jxo(this.c);
            xi0<jxo> xi0Var = this.d.D;
            this.a = 1;
            obj = wd0.a(wd0Var, jxoVar, xi0Var, null, null, this, 12);
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
        ph0 ph0Var = ((ui0) obj).b;
        ph0 ph0Var2 = ph0.a;
        return Unit.a;
    }
}
