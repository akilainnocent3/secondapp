package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class b4o {
    public final uqm a;
    public final nzm b;
    public final jpk c;
    public final wwd0 d = xwd0.a(m2g.a);
    public final wwd0 e;

    public b4o(uqm uqmVar, nzm nzmVar, jpk jpkVar, hn9 hn9Var) {
        this.a = uqmVar;
        this.b = nzmVar;
        this.c = jpkVar;
        String strJ = nzmVar.j();
        strJ.getClass();
        this.e = xwd0.a(strJ);
    }

    public final void a(zrd0 zrd0Var) {
        Object value;
        Object value2;
        ArrayList arrayList;
        Object value3;
        Object value4;
        ArrayList arrayList2;
        boolean z = zrd0Var instanceof zrd0.b;
        wwd0 wwd0Var = this.d;
        wwd0 wwd0Var2 = this.e;
        if (z) {
            do {
                value3 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value3, ""));
            do {
                value4 = wwd0Var.getValue();
                List<x3o> list = (List) value4;
                arrayList2 = new ArrayList(l48.r(list, 10));
                for (x3o x3oVarC : list) {
                    if (x3oVarC.a.c.a.equals(((zrd0.b) zrd0Var).a)) {
                        x3oVarC = x3o.c(x3oVarC, "");
                    }
                    arrayList2.add(x3oVarC);
                }
            } while (!wwd0Var.g(value4, arrayList2));
            return;
        }
        if (!(zrd0Var instanceof zrd0.a)) {
            uhc.a();
            return;
        }
        do {
            value = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value, ""));
        do {
            value2 = wwd0Var.getValue();
            List list2 = (List) value2;
            arrayList = new ArrayList(l48.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(x3o.c((x3o) it.next(), ""));
            }
        } while (!wwd0Var.g(value2, arrayList));
    }

    public final void b(zrd0 zrd0Var, boolean z) {
        BigDecimal bigDecimalG;
        Object next;
        String str;
        if (z) {
            if (zrd0Var instanceof zrd0.b) {
                Iterator it = ((Iterable) this.d.getValue()).iterator();
                do {
                    bigDecimalG = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((x3o) next).a.c.a.equals(((zrd0.b) zrd0Var).a));
                x3o x3oVar = (x3o) next;
                if (x3oVar != null && (str = x3oVar.b) != null) {
                    bigDecimalG = b.g(str);
                }
            } else {
                if (!(zrd0Var instanceof zrd0.a)) {
                    uhc.a();
                    return;
                }
                bigDecimalG = b.g((String) this.e.getValue());
            }
            if (bigDecimalG == null) {
                return;
            }
            this.a.setCustomDefaultStake(bigDecimalG);
        }
    }
}
