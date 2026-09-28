package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.SliderState$drag$2", f = "Slider.kt", l = {2766}, m = "invokeSuspend")
public final class u0a0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ w0a0 b;
    public final /* synthetic */ icf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0a0(w0a0 w0a0Var, icf icfVar, v1b v1bVar) {
        super(2, v1bVar);
        huw huwVar = huw.a;
        this.b = w0a0Var;
        this.c = icfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        huw huwVar = huw.a;
        return new u0a0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u0a0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        w0a0 w0a0Var = this.b;
        ytw ytwVar = w0a0Var.n;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ((x5a0) ytwVar).setValue(Boolean.TRUE);
            puw puwVar = w0a0Var.s;
            v0a0 v0a0Var = w0a0Var.r;
            huw huwVar = huw.b;
            this.a = 1;
            puwVar.getClass();
            if (w5b.d(new ouw(huwVar, puwVar, this.c, v0a0Var, null), this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ((x5a0) ytwVar).setValue(Boolean.FALSE);
        return Unit.a;
    }
}
