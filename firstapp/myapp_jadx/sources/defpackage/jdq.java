package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.math.BigDecimal;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljdq;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jdq extends j8i0 {
    public final vdq a;
    public final ku90<ccr> b;
    public final BigDecimal c;
    public final hdq d;
    public final wwd0 e;
    public final wwd0 f;
    public final v340 i;

    public jdq(vu60 vu60Var, vdq vdqVar, wdq wdqVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        vu60Var.getClass();
        vdqVar.getClass();
        wdqVar.getClass();
        this.a = vdqVar;
        this.b = new ku90<>();
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.c = ukd0.b(((y0r) fnf.a(vu60Var, jq40.a(y0r.class), o2gVar)).a);
        hdq hdqVar = new hdq(vdqVar.g);
        this.d = hdqVar;
        gdq gdqVar = new gdq(wdqVar.c.d);
        Boolean bool = Boolean.FALSE;
        lyh lyhVarC = ozh.c(gdqVar, oddVar);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarC, et7VarD, kwd0Var, bool);
        wwd0 wwd0VarA = xwd0.a(new ijf0((String) null, 0L, 7));
        this.e = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(Boolean.TRUE);
        this.f = wwd0VarA2;
        m1i m1iVarC = r1i.c(wwd0VarA, wwd0VarA2, hdqVar, new n1i(wwd0VarA, hdqVar, new edq(3, null)), v340VarE, new idq(null));
        this.i = e1i.e(ozh.c(m1iVarC, oddVar), o8i0.d(this), kwd0Var, new cdq(false, null, null, 63));
        ej5.c(o8i0.d(this), oddVar, null, new ddq(this, null), 2);
    }
}
