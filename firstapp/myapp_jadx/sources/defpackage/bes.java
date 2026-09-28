package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.limits.local.LimitsDataStoreImpl$updatedTimeLimitsCache$2", f = "LimitsDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bes extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nds b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ Integer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bes(nds ndsVar, Integer num, Integer num2, v1b<? super bes> v1bVar) {
        super(2, v1bVar);
        this.b = ndsVar;
        this.c = num;
        this.d = num2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bes besVar = new bes(this.b, this.c, this.d, v1bVar);
        besVar.a = obj;
        return besVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((bes) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        nds.e(jtwVar, nds.a.DAILY_TIME_LIMIT, this.c);
        nds.e(jtwVar, nds.a.WEEKLY_TIME_LIMIT, this.d);
        return Unit.a;
    }
}
