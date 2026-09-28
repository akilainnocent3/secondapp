package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$startTimer$2", f = "FootballViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ini extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public final /* synthetic */ dni a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ini(v1b v1bVar, dni dniVar) {
        super(1, v1bVar);
        this.a = dniVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new ini(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((ini) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        es50.a aVar = es50.a.a;
        dni dniVar = this.a;
        ((x5a0) dniVar.J).setValue(aVar);
        dniVar.z1();
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_LOYALTY_REWARD);
        aVar2.d("FootballViewModel: load show off img timeout", new Object[0]);
        return Unit.a;
    }
}
