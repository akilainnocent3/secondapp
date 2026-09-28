package defpackage;

import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.live.data.LiveBoostMatchItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.base.BaseLiveViewModel$getTournaments$4", f = "BaseLiveViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y22 extends tje0 implements Function2<lk50<? extends bxg0<? extends List<? extends Tournament>, ? extends List<? extends LiveBoostMatchItem>, ? extends Boolean>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ u22 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y22(u22 u22Var, v1b<? super y22> v1bVar) {
        super(2, v1bVar);
        this.b = u22Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        y22 y22Var = new y22(this.b, v1bVar);
        y22Var.a = obj;
        return y22Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends bxg0<? extends List<? extends Tournament>, ? extends List<? extends LiveBoostMatchItem>, ? extends Boolean>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((y22) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<bxg0<List<Tournament>, List<LiveBoostMatchItem>, Boolean>> lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.z.m(lk50Var);
        return Unit.a;
    }
}
