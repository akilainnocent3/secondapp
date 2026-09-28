package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lao3;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ao3 extends j8i0 {
    public final gy3 a;
    public final gvw b;
    public final mgb0 c;
    public final odd d;
    public final wwd0 e;
    public final v340 f;
    public final ku90<yy3> i;
    public final t340 v;

    public ao3(gy3 gy3Var, gvw gvwVar, mgb0 mgb0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        gy3Var.getClass();
        mgb0Var.getClass();
        this.a = gy3Var;
        this.b = gvwVar;
        this.c = mgb0Var;
        this.d = oddVar;
        wwd0 wwd0VarA = xwd0.a(m2x.c.a);
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
        ku90<yy3> ku90Var = new ku90<>();
        this.i = ku90Var;
        this.v = e1i.a(ku90Var);
        ej5.c(o8i0.d(this), null, null, new zn3(this, null), 3);
    }

    public final void x1(xy3 xy3Var) {
        Object value;
        Object objA;
        xy3Var.getClass();
        boolean z = xy3Var instanceof xy3.a;
        wwd0 wwd0Var = this.e;
        if (!z) {
            if (xy3Var.equals(xy3.c.a)) {
                do {
                    value = wwd0Var.getValue();
                    objA = (m2x) value;
                    m2x.a aVar = objA instanceof m2x.a ? (m2x.a) objA : null;
                    if (aVar != null) {
                        objA = m2x.a.a(aVar, null, null, null, 3);
                    }
                } while (!wwd0Var.g(value, objA));
                return;
            }
            boolean zEquals = xy3Var.equals(xy3.b.a);
            ku90<yy3> ku90Var = this.i;
            if (zEquals) {
                ku90Var.a(yy3.a.a);
                return;
            } else if (xy3Var.equals(xy3.d.a)) {
                ku90Var.a(yy3.b.a);
                return;
            } else {
                uhc.a();
                return;
            }
        }
        long j = ((xy3.a) xy3Var).a;
        Object value2 = wwd0Var.getValue();
        m2x.a aVar2 = value2 instanceof m2x.a ? (m2x.a) value2 : null;
        if (aVar2 != null && aVar2.b == null) {
            List<fof0> list = aVar2.a.a;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    List<mof0> list2 = ((fof0) it.next()).b;
                    if (list2 == null || !list2.isEmpty()) {
                        for (mof0 mof0Var : list2) {
                            if (mof0Var.a == j && mof0Var.d) {
                                return;
                            }
                        }
                    }
                }
            }
            wwd0Var.k(null, m2x.a.a(aVar2, null, Long.valueOf(j), null, 5));
            ej5.c(o8i0.d(this), null, null, new yn3(this, j, null), 3);
        }
    }
}
