package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {458}, m = "invokeSuspend")
public final class y480 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u480<Object> b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ dtg0<Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y480(v1b v1bVar, u480 u480Var, dtg0 dtg0Var, Object obj) {
        super(1, v1bVar);
        this.b = u480Var;
        this.c = obj;
        this.d = dtg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        Object obj = this.c;
        return new y480(v1bVar, this.b, this.d, obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((y480) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        float f;
        y5b y5bVar = y5b.a;
        int i = this.a;
        dtg0<Object> dtg0Var = this.d;
        if (i == 0) {
            uj50.b(obj);
            ij0 ij0Var = u480.r;
            u480<Object> u480Var = this.b;
            u480Var.o0();
            ytw ytwVar = u480Var.b;
            u480Var.l = Long.MIN_VALUE;
            u480Var.u0(0.0f);
            Object value = ((x5a0) u480Var.c).getValue();
            Object obj2 = this.c;
            if (obj2.equals(value)) {
                f = -4.0f;
            } else {
                f = obj2.equals(((x5a0) ytwVar).getValue()) ? -5.0f : -3.0f;
            }
            dtg0Var.r(obj2);
            dtg0Var.p(0L);
            ((x5a0) ytwVar).setValue(obj2);
            u480Var.u0(0.0f);
            u480Var.d0(obj2);
            dtg0Var.l(f);
            if (f == -3.0f) {
                this.a = 1;
                if (u480Var.w0(this) == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        dtg0Var.k();
        return Unit.a;
    }
}
