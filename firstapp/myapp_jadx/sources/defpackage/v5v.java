package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$fetchMarketTypesData$2", f = "MatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v5v extends tje0 implements gaj<myh<? super lk50<? extends List<? extends MarketType>>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ z5v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5v(v1b v1bVar, z5v z5vVar) {
        super(3, v1bVar);
        this.b = z5vVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends List<? extends MarketType>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        v5v v5vVar = new v5v(v1bVar, this.b);
        v5vVar.a = th;
        return v5vVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.S;
        lk50.a aVar = new lk50.a(th);
        wwd0Var.getClass();
        wwd0Var.k(null, aVar);
        return Unit.a;
    }
}
