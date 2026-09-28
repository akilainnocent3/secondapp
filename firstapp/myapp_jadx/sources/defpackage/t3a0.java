package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {409}, m = "invokeSuspend")
public final class t3a0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xi0<Float> d;
    public final /* synthetic */ Function0<Unit> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3a0(wd0<Float, ij0> wd0Var, boolean z, xi0<Float> xi0Var, Function0<Unit> function0, v1b<? super t3a0> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = z;
        this.d = xi0Var;
        this.e = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t3a0(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t3a0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        t3a0 t3a0Var;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Float f = new Float(this.c ? 1.0f : 0.0f);
            this.a = 1;
            t3a0Var = this;
            if (wd0.a(this.b, f, this.d, null, null, t3a0Var, 12) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            t3a0Var = this;
        }
        t3a0Var.e.invoke();
        return Unit.a;
    }
}
