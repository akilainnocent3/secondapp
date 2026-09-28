package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.limits.local.LimitsDataStoreImpl$saveTimeLimits$2", f = "LimitsDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class sds extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nds b;
    public final /* synthetic */ fwf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sds(nds ndsVar, fwf0 fwf0Var, v1b<? super sds> v1bVar) {
        super(2, v1bVar);
        this.b = ndsVar;
        this.c = fwf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sds sdsVar = new sds(this.b, this.c, v1bVar);
        sdsVar.a = obj;
        return sdsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((sds) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        nds.a aVar = nds.a.DAILY_TIME_LIMIT;
        fwf0 fwf0Var = this.c;
        nds.e(jtwVar, aVar, fwf0Var.a);
        nds.e(jtwVar, nds.a.CONSUMED_DAILY_TIME_LIMIT, fwf0Var.b);
        nds.e(jtwVar, nds.a.WEEKLY_TIME_LIMIT, fwf0Var.c);
        nds.e(jtwVar, nds.a.CONSUMED_WEEKLY_TIME_LIMIT, fwf0Var.d);
        return Unit.a;
    }
}
