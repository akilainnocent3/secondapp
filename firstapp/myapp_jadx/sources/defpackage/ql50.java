package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.network.data.ResultsKt$convertUnitResponseAsResults$2", f = "Results.kt", l = {205}, m = "invokeSuspend", v = 2)
public final class ql50 extends tje0 implements Function2<myh<? super lk50<? extends Unit>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ql50 ql50Var = new ql50(2, v1bVar);
        ql50Var.b = obj;
        return ql50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends Unit>> myhVar, v1b<? super Unit> v1bVar) {
        return ((ql50) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lk50.b bVar = lk50.b.a;
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
