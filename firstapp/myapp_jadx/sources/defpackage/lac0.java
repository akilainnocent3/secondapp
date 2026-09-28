package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsBetBuilderHandlerImpl$init$2", f = "SportyLegendsBetBuilderHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lac0 extends tje0 implements gaj<myh<? super BetBuilderConfig>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ gac0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lac0(gac0 gac0Var, v1b<? super lac0> v1bVar) {
        super(3, v1bVar);
        this.b = gac0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super BetBuilderConfig> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        lac0 lac0Var = new lac0(this.b, v1bVar);
        lac0Var.a = th;
        return lac0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (th instanceof CancellationException) {
            throw th;
        }
        this.b.l = null;
        return Unit.a;
    }
}
