package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.limits.local.LimitsDataStoreImpl$updatedConsumedTimeLimits$2", f = "LimitsDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zds extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nds b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zds(nds ndsVar, int i, int i2, long j, v1b<? super zds> v1bVar) {
        super(2, v1bVar);
        this.b = ndsVar;
        this.c = i;
        this.d = i2;
        this.e = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zds zdsVar = new zds(this.b, this.c, this.d, this.e, v1bVar);
        zdsVar.a = obj;
        return zdsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((zds) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        nds.e(jtwVar, nds.a.CONSUMED_DAILY_TIME_LIMIT, new Integer(this.c));
        nds.e(jtwVar, nds.a.CONSUMED_WEEKLY_TIME_LIMIT, new Integer(this.d));
        jtwVar.h(new zn20.a<>("last_reported_activity_timestamp"), new Long(this.e));
        nds.e(jtwVar, nds.a.UNREPORTED_APP_USAGE, new Integer(0));
        return Unit.a;
    }
}
