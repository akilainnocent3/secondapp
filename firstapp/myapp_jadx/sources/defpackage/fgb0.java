package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sporty.android.book.presentation.sportsmenu.SportsMenuViewModel$getFavoriteTournaments$2", f = "SportsMenuViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fgb0 extends tje0 implements gaj<myh<? super List<? extends String>>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ dgb0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgb0(dgb0 dgb0Var, v1b<? super fgb0> v1bVar) {
        super(3, v1bVar);
        this.a = dgb0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super List<? extends String>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new fgb0(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.z;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        wwd0Var.getClass();
        wwd0Var.k(null, o2gVar);
        return Unit.a;
    }
}
