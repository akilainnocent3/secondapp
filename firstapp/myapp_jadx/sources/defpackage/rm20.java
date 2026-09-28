package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
public final class rm20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ qm20 a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm20(qm20 qm20Var, boolean z, v1b<? super rm20> v1bVar) {
        super(2, v1bVar);
        this.a = qm20Var;
        this.b = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rm20(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rm20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        bny bnyVar;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        qm20 qm20Var = this.a;
        boolean z = this.b;
        if (!z && !qm20Var.g && qm20Var.a && (bnyVar = qm20Var.f) != null) {
            bnyVar.a();
        }
        qm20Var.f(z);
        return Unit.a;
    }
}
