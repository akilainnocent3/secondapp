package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.onepunch.components.MultiplierComponentKt$MultiplierComponent$1$1$2$1", f = "MultiplierComponent.kt", l = {144}, m = "invokeSuspend", v = 1)
public final class oow extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wd0<Float, ij0> c;
    public final /* synthetic */ ytw<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oow(wd0 wd0Var, v1b v1bVar, ytw ytwVar, boolean z) {
        super(2, v1bVar);
        this.b = z;
        this.c = wd0Var;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new oow(this.c, v1bVar, this.d, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((oow) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        oow oowVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (!this.b) {
                Float f = new Float(1.0f);
                gzg0 gzg0VarE = yi0.e(0, 0, null, 6);
                this.a = 1;
                oowVar = this;
                if (wd0.a(this.c, f, gzg0VarE, null, null, oowVar, 12) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        oowVar = this;
        oowVar.d.setValue(Boolean.FALSE);
        return Unit.a;
    }
}
