package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.limits.local.LimitsDataStoreImpl$setHasReachedLimits$2", f = "LimitsDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uds extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uds(boolean z, v1b<? super uds> v1bVar) {
        super(2, v1bVar);
        this.b = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        uds udsVar = new uds(this.b, v1bVar);
        udsVar.a = obj;
        return udsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((uds) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        nds.a aVar = nds.a.DAILY_TIME_LIMIT;
        zn20.a<Boolean> aVarA = co20.a("has_reached_limits");
        Boolean boolValueOf = Boolean.valueOf(this.b);
        jtwVar.getClass();
        jtwVar.h(aVarA, boolValueOf);
        return Unit.a;
    }
}
