package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.plugin.realsports.data.SportGroup;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchCountries$3", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gim extends tje0 implements gaj<myh<? super SportGroup>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ iim b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gim(iim iimVar, v1b<? super gim> v1bVar) {
        super(3, v1bVar);
        this.b = iimVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super SportGroup> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        gim gimVar = new gim(this.b, v1bVar);
        gimVar.a = th;
        return gimVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.w0.m(new UIState.Error(th, null, 2, null));
        return Unit.a;
    }
}
