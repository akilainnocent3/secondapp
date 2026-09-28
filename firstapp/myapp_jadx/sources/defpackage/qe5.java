package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Sports;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.handler.BuildAndGoHandlerImpl$initHandler$6", f = "BuildAndGoHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qe5 extends tje0 implements gaj<lk50<? extends Sports>, Unit, v1b<? super lk50<? extends Sports>>, Object> {
    public /* synthetic */ lk50 a;

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends Sports> lk50Var, Unit unit, v1b<? super lk50<? extends Sports>> v1bVar) {
        qe5 qe5Var = new qe5(3, v1bVar);
        qe5Var.a = lk50Var;
        return qe5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return lk50Var;
    }
}
