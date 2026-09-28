package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
public final class hp70 extends tje0 implements Function2<tp70, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ xi0<Float> d;
    public final /* synthetic */ aq40 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp70(float f, xi0<Float> xi0Var, aq40 aq40Var, v1b<? super hp70> v1bVar) {
        super(2, v1bVar);
        this.c = f;
        this.d = xi0Var;
        this.e = aq40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hp70 hp70Var = new hp70(this.c, this.d, this.e, v1bVar);
        hp70Var.b = obj;
        return hp70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tp70 tp70Var, v1b<? super Unit> v1bVar) {
        return ((hp70) create(tp70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final tp70 tp70Var = (tp70) this.b;
            final aq40 aq40Var = this.e;
            Function2 function2 = new Function2() { // from class: gp70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).getClass();
                    aq40 aq40Var2 = aq40Var;
                    float f = aq40Var2.a;
                    aq40Var2.a = tp70Var.e(fFloatValue - f) + f;
                    return Unit.a;
                }
            };
            this.a = 1;
            if (sje0.c(0.0f, this.c, 0.0f, this.d, function2, this, 4) == y5bVar) {
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
