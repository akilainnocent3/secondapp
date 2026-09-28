package defpackage;

import com.sporty.android.core.model.watchdog.HangWatchdogConfigData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.performance.watchdog.HangWatchdogStarter$refresh$2", f = "HangWatchdogStarter.kt", l = {}, m = "invokeSuspend", v = 2)
public final class odl extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ qdl a;
    public final /* synthetic */ HangWatchdogConfigData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odl(qdl qdlVar, HangWatchdogConfigData hangWatchdogConfigData, v1b<? super odl> v1bVar) {
        super(2, v1bVar);
        this.a = qdlVar;
        this.b = hangWatchdogConfigData;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new odl(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((odl) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.d.a(this.b);
        return Unit.a;
    }
}
