package defpackage;

import com.sportybet.plugin.event.e;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchLiveStreamData$3", f = "EventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lsg extends tje0 implements gaj<myh<? super qus>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ e a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsg(v1b v1bVar, e eVar) {
        super(3, v1bVar);
        this.a = eVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super qus> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new lsg(v1bVar, this.a).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.i0 = null;
        return Unit.a;
    }
}
