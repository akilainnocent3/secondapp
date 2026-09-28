package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.plugin.event.e;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchRadioStreamData$2", f = "EventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nsg extends tje0 implements gaj<myh<? super String>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsg(v1b v1bVar, e eVar) {
        super(3, v1bVar);
        this.b = eVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super String> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        nsg nsgVar = new nsg(v1bVar, this.b);
        nsgVar.a = th;
        return nsgVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.l0.m(new UIState.Error(th, null, 2, null));
        return Unit.a;
    }
}
