package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.common.framework.datastore.PreferenceDataStoreImpl$putInt$2", f = "PreferenceDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 1)
public final class nn20 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ zn20.a<Integer> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn20(zn20.a aVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nn20 nn20Var = new nn20(this.b, v1bVar);
        nn20Var.a = obj;
        return nn20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((nn20) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Integer num = new Integer(-1);
        jtwVar.getClass();
        jtwVar.h(this.b, num);
        return Unit.a;
    }
}
