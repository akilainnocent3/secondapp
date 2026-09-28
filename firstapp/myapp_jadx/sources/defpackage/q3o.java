package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingSessionDataHandlerImpl$init$1$2", f = "InstantRacingSessionDataHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q3o extends tje0 implements gaj<myh<? super AccountInfo>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ s3o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3o(s3o s3oVar, v1b<? super q3o> v1bVar) {
        super(3, v1bVar);
        this.b = s3oVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super AccountInfo> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        q3o q3oVar = new q3o(this.b, v1bVar);
        q3oVar.a = th;
        return q3oVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.f;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new t3o.a(new m3o.a(th))));
        return Unit.a;
    }
}
