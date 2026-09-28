package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
public final class k0a0 extends tje0 implements gaj<v5b, Float, v1b<? super Unit>, Object> {
    public final /* synthetic */ w0a0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0a0(w0a0 w0a0Var, v1b<? super k0a0> v1bVar) {
        super(3, v1bVar);
        this.a = w0a0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, Float f, v1b<? super Unit> v1bVar) {
        f.floatValue();
        return new k0a0(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.o.invoke();
        return Unit.a;
    }
}
