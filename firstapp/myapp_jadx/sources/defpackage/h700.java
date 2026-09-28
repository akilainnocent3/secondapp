package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl$setLastFixStatusTimestamp$2", f = "PaymentDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h700 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h700(long j, v1b<? super h700> v1bVar) {
        super(2, v1bVar);
        this.b = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h700 h700Var = new h700(this.b, v1bVar);
        h700Var.a = obj;
        return h700Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((h700) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zn20.a<?> aVar = new zn20.a<>("PREF_KEY_LAST_FIX_STATUS_TIMESTAMP");
        Long l = new Long(this.b);
        jtwVar.getClass();
        jtwVar.h(aVar, l);
        return Unit.a;
    }
}
