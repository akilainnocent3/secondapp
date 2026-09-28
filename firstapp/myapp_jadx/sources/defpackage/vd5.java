package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.handler.BuildAndGoGiftHandlerImpl$collectGiftGroupList$1$1", f = "BuildAndGoGiftHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vd5 extends tje0 implements gaj<lk50<? extends Sports>, lk50<? extends Round>, v1b<? super lk50<? extends Sports>>, Object> {
    public /* synthetic */ lk50 a;

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends Sports> lk50Var, lk50<? extends Round> lk50Var2, v1b<? super lk50<? extends Sports>> v1bVar) {
        vd5 vd5Var = new vd5(3, v1bVar);
        vd5Var.a = lk50Var;
        return vd5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return lk50Var;
    }
}
