package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class hmc0 {
    public final uqm a;
    public final nzm b;
    public final jpk c;
    public final wwd0 d = xwd0.a(m2g.a);
    public final wwd0 e;

    public hmc0(uqm uqmVar, nzm nzmVar, jpk jpkVar, hn9 hn9Var) {
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
                List<dmc0> list = (List) value4;
                arrayList2 = new ArrayList(l48.r(list, 10));
                for (dmc0 dmc0VarC : list) {
                    if (dmc0VarC.a.c.a.equals(((zrd0.b) zrd0Var).a)) {
                        dmc0VarC = dmc0.c(dmc0VarC, "");
                    }
                    arrayList2.add(dmc0VarC);
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
                arrayList.add(dmc0.c((dmc0) it.next(), ""));
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
                } while (!((dmc0) next).a.c.a.equals(((zrd0.b) zrd0Var).a));
                dmc0 dmc0Var = (dmc0) next;
                if (dmc0Var != null && (str = dmc0Var.b) != null) {
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

    public final void c(zrd0 zrd0Var) {
        Object value;
        Object value2;
        ArrayList arrayList;
        Object next;
        Object value3;
        Object value4;
        ArrayList arrayList2;
        boolean z = zrd0Var instanceof zrd0.b;
        wwd0 wwd0Var = this.e;
        wwd0 wwd0Var2 = this.d;
        if (!z) {
            if (!(zrd0Var instanceof zrd0.a)) {
                uhc.a();
                return;
            }
            String strE = wae0.E((String) wwd0Var.getValue());
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, strE));
            do {
                value2 = wwd0Var2.getValue();
                List list = (List) value2;
                arrayList = new ArrayList(l48.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(dmc0.c((dmc0) it.next(), strE));
                }
            } while (!wwd0Var2.g(value2, arrayList));
            return;
        }
        Iterator it2 = ((Iterable) e1i.b(wwd0Var2).a.getValue()).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((dmc0) next).a.c.a.equals(((zrd0.b) zrd0Var).a));
        dmc0 dmc0Var = (dmc0) next;
        if (dmc0Var == null) {
            return;
        }
        String strE2 = wae0.E(dmc0Var.b);
        String str = ((List) e1i.b(wwd0Var2).a.getValue()).size() > 1 ? "" : strE2;
        do {
            value3 = wwd0Var.getValue();
        } while (!wwd0Var.g(value3, str));
        do {
            value4 = wwd0Var2.getValue();
            List<dmc0> list2 = (List) value4;
            arrayList2 = new ArrayList(l48.r(list2, 10));
            for (dmc0 dmc0VarC : list2) {
                if (Intrinsics.g(dmc0VarC, dmc0Var)) {
                    dmc0VarC = dmc0.c(dmc0VarC, strE2);
                }
                arrayList2.add(dmc0VarC);
            }
        } while (!wwd0Var2.g(value4, arrayList2));
    }

    public final void d(zrd0 zrd0Var, BigDecimal bigDecimal) {
        Object value;
        Object value2;
        ArrayList arrayList;
        Object next;
        Object value3;
        Object value4;
        ArrayList arrayList2;
        boolean z = zrd0Var instanceof zrd0.b;
        wwd0 wwd0Var = this.e;
        wwd0 wwd0Var2 = this.d;
        if (!z) {
            if (!(zrd0Var instanceof zrd0.a)) {
                uhc.a();
                return;
            }
            BigDecimal bigDecimalG = b.g((String) e1i.b(wwd0Var).a.getValue());
            if (bigDecimalG == null) {
                bigDecimalG = BigDecimal.ZERO;
            }
            String strC = b6y.c(bigDecimalG.add(bigDecimal));
            strC.getClass();
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, strC));
            do {
                value2 = wwd0Var2.getValue();
                List list = (List) value2;
                arrayList = new ArrayList(l48.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(dmc0.c((dmc0) it.next(), strC));
                }
            } while (!wwd0Var2.g(value2, arrayList));
            return;
        }
        Iterator it2 = ((Iterable) e1i.b(wwd0Var2).a.getValue()).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((dmc0) next).a.c.a.equals(((zrd0.b) zrd0Var).a));
        dmc0 dmc0Var = (dmc0) next;
        if (dmc0Var == null) {
            return;
        }
        BigDecimal bigDecimalG2 = b.g(dmc0Var.b);
        if (bigDecimalG2 == null) {
            bigDecimalG2 = BigDecimal.ZERO;
        }
        String strC2 = b6y.c(bigDecimalG2.add(bigDecimal));
        strC2.getClass();
        String str = ((List) e1i.b(wwd0Var2).a.getValue()).size() > 1 ? "" : strC2;
        do {
            value3 = wwd0Var.getValue();
        } while (!wwd0Var.g(value3, str));
        do {
            value4 = wwd0Var2.getValue();
            List<dmc0> list2 = (List) value4;
            arrayList2 = new ArrayList(l48.r(list2, 10));
            for (dmc0 dmc0VarC : list2) {
                if (Intrinsics.g(dmc0VarC, dmc0Var)) {
                    dmc0VarC = dmc0.c(dmc0VarC, strC2);
                }
                arrayList2.add(dmc0VarC);
            }
        } while (!wwd0Var2.g(value4, arrayList2));
    }

    public final void e(zrd0 zrd0Var, String str) {
        Object value;
        Object value2;
        ArrayList arrayList;
        Object next;
        Object value3;
        Object value4;
        ArrayList arrayList2;
        boolean z = zrd0Var instanceof zrd0.b;
        wwd0 wwd0Var = this.e;
        wwd0 wwd0Var2 = this.d;
        if (!z) {
            if (!(zrd0Var instanceof zrd0.a)) {
                uhc.a();
                return;
            }
            String strA = kn5.a((String) wwd0Var.getValue(), str);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, strA));
            do {
                value2 = wwd0Var2.getValue();
                List list = (List) value2;
                arrayList = new ArrayList(l48.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(dmc0.c((dmc0) it.next(), strA));
                }
            } while (!wwd0Var2.g(value2, arrayList));
            return;
        }
        Iterator it2 = ((Iterable) e1i.b(wwd0Var2).a.getValue()).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((dmc0) next).a.c.a.equals(((zrd0.b) zrd0Var).a));
        dmc0 dmc0Var = (dmc0) next;
        if (dmc0Var == null) {
            return;
        }
        String strA2 = kn5.a(dmc0Var.b, str);
        String str2 = ((List) e1i.b(wwd0Var2).a.getValue()).size() > 1 ? "" : strA2;
        do {
            value3 = wwd0Var.getValue();
        } while (!wwd0Var.g(value3, str2));
        do {
            value4 = wwd0Var2.getValue();
            List<dmc0> list2 = (List) value4;
            arrayList2 = new ArrayList(l48.r(list2, 10));
            for (dmc0 dmc0VarC : list2) {
                if (Intrinsics.g(dmc0VarC, dmc0Var)) {
                    dmc0VarC = dmc0.c(dmc0VarC, strA2);
                }
                arrayList2.add(dmc0VarC);
            }
        } while (!wwd0Var2.g(value4, arrayList2));
    }
}
