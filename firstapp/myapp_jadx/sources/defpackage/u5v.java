package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$fetchMarketTypesData$1", f = "MatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u5v extends tje0 implements Function2<lk50<? extends List<? extends MarketType>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ z5v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5v(v1b v1bVar, z5v z5vVar) {
        super(2, v1bVar);
        this.b = z5vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        u5v u5vVar = new u5v(v1bVar, this.b);
        u5vVar.a = obj;
        return u5vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends MarketType>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((u5v) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.S.setValue(lk50Var);
        return Unit.a;
    }
}
