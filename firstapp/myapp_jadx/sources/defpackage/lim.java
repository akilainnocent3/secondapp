package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.plugin.realsports.data.HighlightData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchHighlightEvents$3", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lim extends tje0 implements gaj<myh<? super HighlightData>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ iim b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lim(iim iimVar, v1b<? super lim> v1bVar) {
        super(3, v1bVar);
        this.b = iimVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super HighlightData> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        lim limVar = new lim(this.b, v1bVar);
        limVar.a = th;
        return limVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.s0.m(new UIState.Error(th, null, 2, null));
        return Unit.a;
    }
}
