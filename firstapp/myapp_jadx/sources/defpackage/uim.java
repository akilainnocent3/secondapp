package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.plugin.realsports.data.Tournament;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchTournamentEvents$3", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uim extends tje0 implements gaj<myh<? super List<? extends Tournament>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ iim b;
    public final /* synthetic */ c6g0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uim(iim iimVar, c6g0 c6g0Var, v1b<? super uim> v1bVar) {
        super(3, v1bVar);
        this.b = iimVar;
        this.c = c6g0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super List<? extends Tournament>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        uim uimVar = new uim(this.b, this.c, v1bVar);
        uimVar.a = th;
        return uimVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.u0.m(new UIState.Error(th, this.c));
        return Unit.a;
    }
}
