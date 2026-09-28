package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1052}, m = "invokeSuspend")
public final class vq70 extends tje0 implements Function2<olx, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wr70 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ aq40 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq70(wr70 wr70Var, long j, aq40 aq40Var, v1b<? super vq70> v1bVar) {
        super(2, v1bVar);
        this.c = wr70Var;
        this.d = j;
        this.e = aq40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vq70 vq70Var = new vq70(this.c, this.d, this.e, v1bVar);
        vq70Var.b = obj;
        return vq70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(olx olxVar, v1b<? super Unit> v1bVar) {
        return ((vq70) create(olxVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final olx olxVar = (olx) this.b;
            long j = this.d;
            final wr70 wr70Var = this.c;
            float fG = wr70Var.g(j);
            final aq40 aq40Var = this.e;
            Function2 function2 = new Function2() { // from class: uq70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).getClass();
                    aq40 aq40Var2 = aq40Var;
                    float f = fFloatValue - aq40Var2.a;
                    wr70 wr70Var2 = wr70Var;
                    aq40Var2.a += wr70Var2.d(wr70Var2.g(olxVar.a(wr70Var2.h(wr70Var2.d(f)))));
                    return Unit.a;
                }
            };
            this.a = 1;
            if (sje0.c(0.0f, fG, 0.0f, null, function2, this, 12) == y5bVar) {
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
