package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", f = "BasicTooltip.kt", l = {301}, m = "invokeSuspend")
public final class qc2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ j5i b;
    public final /* synthetic */ b1g0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc2(j5i j5iVar, b1g0 b1g0Var, v1b<? super qc2> v1bVar) {
        super(2, v1bVar);
        this.b = j5iVar;
        this.c = b1g0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qc2(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qc2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        j5i j5iVar = this.b;
        b1g0 b1g0Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            if (j5iVar.a()) {
                huw huwVar = huw.c;
                this.a = 1;
                if (b1g0Var.c(huwVar, this) == y5bVar) {
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
        if (b1g0Var.b() && !j5iVar.a()) {
            b1g0Var.a();
        }
        return Unit.a;
    }
}
