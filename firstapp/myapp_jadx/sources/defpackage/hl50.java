package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.common.business.repositories.ResultsKt$asResults$2", f = "Results.kt", l = {29}, m = "invokeSuspend", v = 1)
public final class hl50 extends tje0 implements Function2<myh<? super mk50<Object>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hl50 hl50Var = new hl50(2, v1bVar);
        hl50Var.b = obj;
        return hl50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super mk50<Object>> myhVar, v1b<? super Unit> v1bVar) {
        return ((hl50) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            mk50.b bVar = mk50.b.a;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(bVar, this) == y5bVar) {
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
