package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {207}, m = "invokeSuspend")
public final class prc extends tje0 implements Function2<qnv.a<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yqc<Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prc(yqc<Object> yqcVar, v1b<? super prc> v1bVar) {
        super(2, v1bVar);
        this.c = yqcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        prc prcVar = new prc(this.c, v1bVar);
        prcVar.b = obj;
        return prcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qnv.a<Object> aVar, v1b<? super Unit> v1bVar) {
        return ((prc) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            qnv.a aVar = (qnv.a) this.b;
            this.a = 1;
            if (this.c.c(aVar, this) == y5bVar) {
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
