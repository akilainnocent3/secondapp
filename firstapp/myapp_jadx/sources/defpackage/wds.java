package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.limits.local.LimitsDataStoreImpl$setUnreportedAppUsage$2", f = "LimitsDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wds extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wds(int i, v1b<? super wds> v1bVar) {
        super(2, v1bVar);
        this.b = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wds wdsVar = new wds(this.b, v1bVar);
        wdsVar.a = obj;
        return wdsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((wds) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        nds.a aVar = nds.a.DAILY_TIME_LIMIT;
        zn20.a<Integer> aVarD = co20.d("unreported_app_usage");
        Integer num = new Integer(this.b);
        jtwVar.getClass();
        jtwVar.h(aVarD, num);
        return Unit.a;
    }
}
