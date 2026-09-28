package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.plugin.common.gift.usecase.DefaultGiftSelectedUseCase$parseGiftDataAndGetFirstInternal$1", f = "DefaultGiftSelectedUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class scd extends tje0 implements Function2<myh<? super n780>, v1b<? super Unit>, Object> {
    public final /* synthetic */ tcd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scd(tcd tcdVar, v1b<? super scd> v1bVar) {
        super(2, v1bVar);
        this.a = tcdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new scd(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super n780> myhVar, v1b<? super Unit> v1bVar) {
        return ((scd) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.a.k(null, new n780.a(null));
        return Unit.a;
    }
}
