package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.common.AZMenuViewModel$loadAzMenuData$4", f = "AZMenuViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k1 extends tje0 implements gaj<myh<? super fq1>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ c1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(c1 c1Var, v1b<? super k1> v1bVar) {
        super(3, v1bVar);
        this.b = c1Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super fq1> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        k1 k1Var = new k1(this.b, v1bVar);
        k1Var.a = th;
        return k1Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.D.m(new UIState.Error(th, null, 2, null));
        return Unit.a;
    }
}
