package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhxp;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hxp extends j8i0 {
    public final mgb0 a;
    public final drq b;
    public final String c;
    public final v340 d;
    public final ku90<ccr> e;

    public hxp(iey ieyVar, psm psmVar, mgb0 mgb0Var, drq drqVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        psmVar.getClass();
        mgb0Var.getClass();
        drqVar.getClass();
        this.a = mgb0Var;
        this.b = drqVar;
        this.c = psmVar.B();
        b77 b77VarF = r0i.f(mgb0Var.isLoginFlow(), new gxp(null, ieyVar, this));
        this.d = e1i.e(ozh.c(b77VarF, oddVar), o8i0.d(this), q490.a.a, vch0.a);
        this.e = new ku90<>();
    }
}
