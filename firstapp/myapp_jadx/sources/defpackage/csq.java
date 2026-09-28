package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcsq;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class csq extends j8i0 {
    public final l8r a;
    public final ku90<Unit> b;
    public final ku90<Unit> c;
    public final v340 d;
    public final ku90<lrq> e;

    public csq(vu60 vu60Var, icq icqVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        vu60Var.getClass();
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        l8r l8rVar = (l8r) fnf.a(vu60Var, jq40.a(l8r.class), o2gVar);
        this.a = l8rVar;
        ku90<Unit> ku90Var = new ku90<>();
        this.b = ku90Var;
        ku90<Unit> ku90Var2 = new ku90<>();
        this.c = ku90Var2;
        bsq bsqVar = new bsq(icqVar.a(ku90Var, ku90Var2, l8rVar.a), this);
        this.d = e1i.e(ozh.c(bsqVar, oddVar), o8i0.d(this), q490.a.a, new asq(l8rVar.b, a7r.b.a));
        this.e = new ku90<>();
        ku90Var.a(Unit.a);
    }
}
