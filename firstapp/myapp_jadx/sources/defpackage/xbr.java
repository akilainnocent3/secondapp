package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxbr;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xbr extends j8i0 {
    public final v340 A;
    public final v340 B;
    public final v340 C;
    public final ku90<j9r> D;
    public final j7q a;
    public final drq b;
    public final odd c;
    public final v340 d;
    public final wwd0 e;
    public final wwd0 f;
    public final v340 i;
    public final wwd0 v;
    public final wwd0 w;
    public final ku90<String> y;
    public final wwd0 z;

    public xbr(b8k b8kVar, fjr fjrVar, j7q j7qVar, mdk mdkVar, g6r g6rVar, i6u i6uVar, drq drqVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        fjrVar.getClass();
        j7qVar.getClass();
        i6uVar.getClass();
        drqVar.getClass();
        this.a = j7qVar;
        this.b = drqVar;
        this.c = oddVar;
        l1i l1iVarA = b8kVar.a();
        n1a0 n1a0Var = n1a0.c;
        v340 v340VarY1 = y1(l1iVarA, n1a0Var);
        this.d = v340VarY1;
        wwd0 wwd0VarA = xwd0.a(n1a0Var);
        this.e = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(new ijf0((String) null, 0L, 7));
        this.f = wwd0VarA2;
        v340 v340VarY2 = y1(new rbr(wwd0VarA2), "");
        this.i = v340VarY2;
        v340 v340VarY3 = y1(r1i.a(wwd0VarA, v340VarY1, v340VarY2, new nbr(fjrVar, null)), n1a0Var);
        sbr sbrVar = new sbr(new f6r(g6rVar.a.d()));
        sx70.b bVar = sx70.b.a;
        v340 v340VarY4 = y1(sbrVar, bVar);
        wwd0 wwd0VarA3 = xwd0.a(pz70.b);
        this.v = wwd0VarA3;
        xf00 xf00Var = xf00.i;
        xf00Var.getClass();
        wwd0 wwd0VarA4 = xwd0.a(xf00Var);
        this.w = wwd0VarA4;
        v340 v340VarY5 = y1(r1i.a(v340VarY3, wwd0VarA4, i6uVar.i.d(xf00Var), new lbr(4, null)), new sx70.a(0));
        v340 v340VarY6 = y1(new tbr(v340VarY3), new sx70.c(0));
        ku90<String> ku90Var = new ku90<>();
        this.y = ku90Var;
        wwd0 wwd0VarA5 = xwd0.a(xf00Var);
        this.z = wwd0VarA5;
        v340 v340VarY7 = y1(ozh.c(hzh.b(new kdk(r1i.a(wwd0VarA3, uzh.b(wwd0VarA5), uzh.b(new jdk(v340VarY3)), new ldk(4, null)), mdkVar, ku90Var, null)), mdkVar.b), xf00Var);
        this.A = v340VarY7;
        v340 v340VarY8 = y1(r1i.a(v340VarY3, wwd0VarA5, v340VarY7, new obr(4, null)), new sx70.e(0));
        this.B = v340VarY8;
        v340 v340VarY9 = y1(r1i.c(new n1i(v340VarY2, wwd0VarA3, new pbr(3, null)), v340VarY4, v340VarY5, v340VarY6, v340VarY8, new qbr(null)), bVar);
        this.C = y1(r1i.a(wwd0VarA2, v340VarY9, y1(new n1i(wwd0VarA3, v340VarY9, new vbr(3, null)), ux70.a.a), new ubr(4, null)), new abr(0));
        this.D = new ku90<>();
        ej5.c(o8i0.d(this), oddVar, null, new ebr(g6rVar, null), 2);
        ej5.c(o8i0.d(this), oddVar, null, new fbr(this, null), 2);
        kzh.d(ozh.c(new g1i(wwd0VarA3, new gbr(this, null)), oddVar), o8i0.d(this));
        ej5.c(o8i0.d(this), oddVar, null, new hbr(this, null), 2);
        ej5.c(o8i0.d(this), oddVar, null, new ibr(this, g6rVar, null), 2);
        ej5.c(o8i0.d(this), oddVar, null, new jbr(this, null), 2);
        ej5.c(o8i0.d(this), oddVar, null, new kbr(this, null), 2);
    }

    public static uf00 x1(qcn qcnVar) {
        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
        Iterator<E> it = qcnVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((erq) it.next()).a);
        }
        return a4h.f(arrayList);
    }

    public final v340 y1(lyh lyhVar, Object obj) {
        return e1i.e(ozh.c(lyhVar, this.c), o8i0.d(this), q490.a.a, obj);
    }
}
