package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.main.presentation.tabs.missions.MissionStateHandler$loadMissions$1", f = "MissionStateHandler.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kvv extends tje0 implements Function2<lk50<? extends List<? extends qlw>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nvv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvv(nvv nvvVar, v1b<? super kvv> v1bVar) {
        super(2, v1bVar);
        this.b = nvvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kvv kvvVar = new kvv(this.b, v1bVar);
        kvvVar.a = obj;
        return kvvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends qlw>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((kvv) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(lk50Var instanceof lk50.b)) {
            this.b.l.setValue(lk50Var);
        }
        return Unit.a;
    }
}
