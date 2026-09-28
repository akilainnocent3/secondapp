package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.limits.local.LimitsDataStoreImpl$clearLimits$2", f = "LimitsDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pds extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pds pdsVar = new pds(2, v1bVar);
        pdsVar.a = obj;
        return pdsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((pds) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jtwVar.e();
        jtwVar.a.clear();
        return Unit.a;
    }
}
