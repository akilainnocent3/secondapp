package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.sportsmenu.SportsMenuViewModel$toggleTournamentFavorite$2", f = "SportsMenuViewModel.kt", l = {228}, m = "invokeSuspend", v = 2)
public final class hgb0 extends tje0 implements gaj<myh<? super Unit>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ dgb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgb0(dgb0 dgb0Var, v1b<? super hgb0> v1bVar) {
        super(3, v1bVar);
        this.c = dgb0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Unit> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        hgb0 hgb0Var = new hgb0(this.c, v1bVar);
        hgb0Var.b = th;
        return hgb0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.c.N;
            UIState.Error error = new UIState.Error(th, null, 2, null);
            this.b = null;
            this.a = 1;
            if (b390Var.emit(error, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
