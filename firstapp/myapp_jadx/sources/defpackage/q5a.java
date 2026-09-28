package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.components.ComposeBetContainerInitiatedKt$MergeTwoBoxesDemo$1$1", f = "ComposeBetContainerInitiated.kt", l = {2005}, m = "invokeSuspend", v = 1)
public final class q5a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wd0<Float, ij0> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5a(boolean z, boolean z2, wd0<Float, ij0> wd0Var, v1b<? super q5a> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = z2;
        this.d = wd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q5a(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q5a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (!this.b && !this.c && this.d.d().floatValue() > 0.98f) {
                Float f = new Float(0.0f);
                gzg0 gzg0VarE = yi0.e(600, 0, null, 6);
                this.a = 1;
                if (wd0.a(this.d, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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
        return Unit.a;
    }
}
