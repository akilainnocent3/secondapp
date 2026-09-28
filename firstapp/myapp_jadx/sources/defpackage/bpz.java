package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1", f = "Pager.kt", l = {554}, m = "invokeSuspend")
public final class bpz extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zpz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpz(zpz zpzVar, v1b<? super bpz> v1bVar) {
        super(2, v1bVar);
        this.b = zpzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bpz(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bpz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            npz npzVar = eqz.a;
            zpz zpzVar = this.b;
            if (zpzVar.k() - 1 < 0 || (objF = zpzVar.f(zpzVar.k() - 1, yi0.d(0.0f, 0.0f, null, 7), this)) != obj2) {
                objF = Unit.a;
            }
            if (objF == obj2) {
                return obj2;
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
