package defpackage;

import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.live.data.LiveBoostMatchItem;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.base.BaseLiveViewModel$getTournaments$5", f = "BaseLiveViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z22 extends tje0 implements gaj<myh<? super lk50<? extends bxg0<? extends List<? extends Tournament>, ? extends List<? extends LiveBoostMatchItem>, ? extends Boolean>>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ u22 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z22(u22 u22Var, v1b<? super z22> v1bVar) {
        super(3, v1bVar);
        this.b = u22Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends bxg0<? extends List<? extends Tournament>, ? extends List<? extends LiveBoostMatchItem>, ? extends Boolean>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        z22 z22Var = new z22(this.b, v1bVar);
        z22Var.a = th;
        return z22Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.z.m(new lk50.a(th));
        return Unit.a;
    }
}
