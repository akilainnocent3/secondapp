package defpackage;

import com.sporty.android.book.domain.entity.BetBuilderData;
import com.sporty.android.book.domain.entity.UIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.betbuilder.BetBuilderViewModel$calculateOdds$2", f = "BetBuilderViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gj2 extends tje0 implements Function2<myh<? super BetBuilderData>, v1b<? super Unit>, Object> {
    public final /* synthetic */ fj2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj2(fj2 fj2Var, v1b<? super gj2> v1bVar) {
        super(2, v1bVar);
        this.a = fj2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gj2(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BetBuilderData> myhVar, v1b<? super Unit> v1bVar) {
        return ((gj2) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.d;
        UIState.Loading loading = new UIState.Loading(((UIState) wwd0Var.getValue()).getData());
        wwd0Var.getClass();
        wwd0Var.k(null, loading);
        return Unit.a;
    }
}
