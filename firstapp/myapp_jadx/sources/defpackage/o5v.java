package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$fetchBetBuilderConfigData$1", f = "MatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o5v extends tje0 implements Function2<lk50<? extends BetBuilderConfig>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ z5v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5v(v1b v1bVar, z5v z5vVar) {
        super(2, v1bVar);
        this.b = z5vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        o5v o5vVar = new o5v(v1bVar, this.b);
        o5vVar.a = obj;
        return o5vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BetBuilderConfig> lk50Var, v1b<? super Unit> v1bVar) {
        return ((o5v) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.R.setValue(lk50Var);
        return Unit.a;
    }
}
