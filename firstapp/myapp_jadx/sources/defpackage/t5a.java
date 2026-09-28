package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.components.ComposeBetContainerInitiatedKt$MergeTwoBoxesDemo$3$7$1$4$1", f = "ComposeBetContainerInitiated.kt", l = {2173}, m = "invokeSuspend", v = 1)
public final class t5a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<Float, ij0> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5a(wd0<Float, ij0> wd0Var, v1b<? super t5a> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t5a(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t5a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wd0<Float, ij0> wd0Var = this.b;
            Float f = new Float(wd0Var.d().floatValue() < 0.5f ? 1.0f : 0.0f);
            gzg0 gzg0VarE = yi0.e(600, 0, null, 6);
            this.a = 1;
            if (wd0.a(wd0Var, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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
