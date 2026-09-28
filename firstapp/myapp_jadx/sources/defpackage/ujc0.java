package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsSessionDataHandlerImpl$init$1$2", f = "SportyLegendsSessionDataHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ujc0 extends tje0 implements gaj<myh<? super AccountInfo>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ akc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujc0(akc0 akc0Var, v1b<? super ujc0> v1bVar) {
        super(3, v1bVar);
        this.b = akc0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super AccountInfo> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        ujc0 ujc0Var = new ujc0(this.b, v1bVar);
        ujc0Var.a = th;
        return ujc0Var.invokeSuspend(Unit.a);
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
        } while (!wwd0Var.g(value, new bkc0.a(new qjc0.a(th))));
        return Unit.a;
    }
}
