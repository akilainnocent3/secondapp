package defpackage;

import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.live.data.LiveBoostMatchItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.base.BaseLiveViewModel$getTournaments$3", f = "BaseLiveViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x22 extends tje0 implements Function2<myh<? super lk50<? extends bxg0<? extends List<? extends Tournament>, ? extends List<? extends LiveBoostMatchItem>, ? extends Boolean>>>, v1b<? super Unit>, Object> {
    public final /* synthetic */ u22 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x22(u22 u22Var, v1b<? super x22> v1bVar) {
        super(2, v1bVar);
        this.a = u22Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x22(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends bxg0<? extends List<? extends Tournament>, ? extends List<? extends LiveBoostMatchItem>, ? extends Boolean>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((x22) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.z.m(lk50.b.a);
        return Unit.a;
    }
}
