package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {861}, m = "invokeSuspend")
public final class vr70 extends tje0 implements Function2<tp70, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wr70 c;
    public final /* synthetic */ Function2<olx, v1b<? super Unit>, Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vr70(wr70 wr70Var, Function2<? super olx, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super vr70> v1bVar) {
        super(2, v1bVar);
        this.c = wr70Var;
        this.d = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vr70 vr70Var = new vr70(this.c, this.d, v1bVar);
        vr70Var.b = obj;
        return vr70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tp70 tp70Var, v1b<? super Unit> v1bVar) {
        return ((vr70) create(tp70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            tp70 tp70Var = (tp70) this.b;
            wr70 wr70Var = this.c;
            wr70Var.k = tp70Var;
            tr70 tr70Var = wr70Var.l;
            this.a = 1;
            if (this.d.invoke(tr70Var, this) == y5bVar) {
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
