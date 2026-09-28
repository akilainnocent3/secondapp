package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgcr;", "Layq;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gcr extends ayq {
    public final zbk v;
    public final odd w;
    public final wwd0 y;
    public final wwd0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcr(vu60 vu60Var, zbk zbkVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        super(vu60Var, oddVar);
        vu60Var.getClass();
        this.v = zbkVar;
        this.w = oddVar;
        this.y = xwd0.a(lk50.b.a);
        this.z = xwd0.a(null);
        y1();
    }

    public final void y1() {
        lyh sl50Var;
        zbk zbkVar = this.v;
        zbkVar.getClass();
        String str = this.b;
        str.getClass();
        obk obkVar = new obk(new or60(new sbk(null, zbkVar, str)));
        i6u i6uVar = zbkVar.d;
        b77 b77VarF = r0i.f(i6uVar.f.a(), new nbk(null, zbkVar, str));
        String str2 = this.f;
        if (str2 == null) {
            sl50Var = new gzh(null);
        } else {
            uhq uhqVar = zbkVar.a;
            sl50Var = new sl50(bm50.a(new pbk(uhqVar.b.c(new thq(uhqVar, str2, null)))));
        }
        kzh.d(ozh.c(new g1i(bm50.a(r1i.b(obkVar, b77VarF, r1i.a(new yzh(zbkVar.e.c.e(), new vbk(3, null)), new yzh(new qbk(zbkVar.f.a()), new wbk(3, null)), new yzh(i6uVar.h.a(), new xbk(3, null)), new ybk(4, null)), sl50Var, new rbk(zbkVar, null))), new fcr(this, null)), this.w), o8i0.d(this));
    }

    public final void z1(ecr ecrVar) {
        ecrVar.getClass();
        if (ecrVar.equals(ecr.a.a)) {
            y1();
            return;
        }
        if (!(ecrVar instanceof ecr.b)) {
            uhc.a();
            return;
        }
        dvq.b bVar = ((ecr.b) ecrVar).a;
        wwd0 wwd0Var = this.z;
        wwd0Var.getClass();
        wwd0Var.k(null, bVar);
    }
}
