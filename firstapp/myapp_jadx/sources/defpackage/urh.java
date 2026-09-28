package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.repository.FirebaseRemoteConfigRepositoryImpl$fetch$3", f = "FirebaseRemoteConfigRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class urh extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ wrh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urh(cq40 cq40Var, wrh wrhVar, v1b<? super urh> v1bVar) {
        super(2, v1bVar);
        this.a = cq40Var;
        this.b = wrhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new urh(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
        return ((urh) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.a = this.b.i();
        return Unit.a;
    }
}
