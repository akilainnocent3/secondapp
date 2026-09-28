package defpackage;

import com.sporty.android.book.domain.entity.RelatedBet;
import com.sporty.android.book.domain.entity.UIState;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.relatedbets.RelatedBetsViewModel$fetchRelatedBets$3", f = "RelatedBetsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h250 extends tje0 implements gaj<myh<? super List<? extends RelatedBet>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ i250 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h250(i250 i250Var, v1b<? super h250> v1bVar) {
        super(3, v1bVar);
        this.b = i250Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super List<? extends RelatedBet>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        h250 h250Var = new h250(this.b, v1bVar);
        h250Var.a = th;
        return h250Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.c;
        UIState.Error error = new UIState.Error(th, null, 2, null);
        wwd0Var.getClass();
        wwd0Var.k(null, error);
        return Unit.a;
    }
}
