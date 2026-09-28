package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.presentation.tabs.missions.MissionStateHandler$observeCooldownExpiry$1", f = "MissionStateHandler.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lvv extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public final /* synthetic */ nvv a;
    public final /* synthetic */ et7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvv(nvv nvvVar, et7 et7Var, v1b v1bVar) {
        super(2, v1bVar);
        this.a = nvvVar;
        this.b = et7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lvv(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((lvv) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.b(this.b);
        return Unit.a;
    }
}
