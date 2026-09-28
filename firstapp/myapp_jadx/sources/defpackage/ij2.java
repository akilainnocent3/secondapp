package defpackage;

import com.sporty.android.book.domain.entity.BetBuilderData;
import com.sporty.android.book.domain.entity.UIState;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.betbuilder.BetBuilderViewModel$calculateOdds$4", f = "BetBuilderViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ij2 extends tje0 implements gaj<myh<? super BetBuilderData>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ fj2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij2(fj2 fj2Var, v1b<? super ij2> v1bVar) {
        super(3, v1bVar);
        this.b = fj2Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super BetBuilderData> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        ij2 ij2Var = new ij2(this.b, v1bVar);
        ij2Var.a = th;
        return ij2Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        UIState.Error error = new UIState.Error(th, null, 2, null);
        wwd0Var.getClass();
        wwd0Var.k(null, error);
        return Unit.a;
    }
}
