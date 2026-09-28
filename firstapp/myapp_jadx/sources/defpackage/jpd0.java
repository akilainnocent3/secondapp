package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.presentation.ui.component.row.StackerRowKt$StackerRow$1$3$1$1", f = "StackerRow.kt", l = {111}, m = "invokeSuspend", v = 1)
public final class jpd0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpd0(wd0<Float, ij0> wd0Var, float f, long j, v1b<? super jpd0> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = f;
        this.d = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jpd0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jpd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Float f = new Float(this.c);
            gzg0 gzg0VarE = yi0.e((int) this.d, 0, xkf.d, 2);
            this.a = 1;
            if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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
