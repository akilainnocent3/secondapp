package defpackage;

import com.sportybet.plugin.realsports.data.Tournament;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchTournamentEvents$4", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vim extends tje0 implements gaj<myh<? super List<? extends Tournament>>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ iim a;
    public final /* synthetic */ c6g0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vim(iim iimVar, c6g0 c6g0Var, v1b<? super vim> v1bVar) {
        super(3, v1bVar);
        this.a = iimVar;
        this.b = c6g0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super List<? extends Tournament>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new vim(this.a, this.b, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.H0.remove(this.b.c);
        return Unit.a;
    }
}
