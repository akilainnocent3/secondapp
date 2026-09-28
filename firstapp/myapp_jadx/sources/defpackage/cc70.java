package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class cc70 {
    public final mg70 a;
    public final mgb0 b;
    public final rdd0 c;
    public final wwd0 d = xwd0.a(Long.valueOf(System.currentTimeMillis()));
    public final tuw e = uuw.a();
    public final wwd0 f = xwd0.a(dc70.b.a);

    public cc70(mg70 mg70Var, mgb0 mgb0Var, bre0 bre0Var, rdd0 rdd0Var) {
        this.a = mg70Var;
        this.b = mgb0Var;
        this.c = rdd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        tb70 tb70Var;
        Object value;
        Object objH;
        Object value2;
        Object value3;
        if (x1bVar instanceof tb70) {
            tb70Var = (tb70) x1bVar;
            int i = tb70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tb70Var.c = i - Integer.MIN_VALUE;
            } else {
                tb70Var = new tb70(this, x1bVar);
            }
        } else {
            tb70Var = new tb70(this, x1bVar);
        }
        Object obj = tb70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = tb70Var.c;
        wwd0 wwd0Var = this.f;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, dc70.b.a));
            tb70Var.c = 1;
            objH = this.a.h(str, tb70Var);
            if (objH == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objH = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objH instanceof zi50.b)) {
            ga70 ga70Var = (ga70) objH;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new dc70.c(ga70Var)));
        }
        Throwable thA = zi50.a(objH);
        if (thA != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new dc70.a(new sb70(thA))));
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object b(mi70 mi70Var, x1b x1bVar) throws Throwable {
        ub70 ub70Var;
        tuw tuwVar;
        Object obj;
        dc70.c cVar;
        ga70 ga70Var;
        Object value;
        mi70 mi70Var2 = mi70Var;
        wwd0 wwd0Var = this.f;
        if (x1bVar instanceof ub70) {
            ub70Var = (ub70) x1bVar;
            int i = ub70Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ub70Var.e = i - Integer.MIN_VALUE;
            } else {
                ub70Var = new ub70(this, x1bVar);
            }
        } else {
            ub70Var = new ub70(this, x1bVar);
        }
        Object obj2 = ub70Var.c;
        y5b y5bVar = y5b.a;
        int i2 = ub70Var.e;
        Object obj3 = null;
        if (i2 == 0) {
            uj50.b(obj2);
            if (mi70Var2 == null) {
                return Unit.a;
            }
            ub70Var.a = mi70Var2;
            tuwVar = this.e;
            ub70Var.b = tuwVar;
            ub70Var.e = 1;
            if (tuwVar.d(ub70Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuwVar = ub70Var.b;
            mi70Var2 = ub70Var.a;
            uj50.b(obj2);
        }
        tuw tuwVar2 = tuwVar;
        try {
            Object value2 = e1i.b(wwd0Var).a.getValue();
            if (value2 instanceof dc70.c) {
                try {
                    cVar = (dc70.c) value2;
                } catch (Throwable th) {
                    th = th;
                    obj = obj3;
                    tuwVar2.f(obj);
                    throw th;
                }
            } else {
                cVar = null;
            }
            if (cVar != null && (ga70Var = cVar.a) != null) {
                List<fa70> list = ga70Var.d;
                String str = mi70Var2.a;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    loop0: while (it.hasNext()) {
                        List<gk70> list2 = ((fa70) it.next()).f;
                        if (list2 == null || !list2.isEmpty()) {
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                List<yk70> list3 = ((gk70) it2.next()).d;
                                if (list3 == null || !list3.isEmpty()) {
                                    Iterator<T> it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        List<xk70> list4 = ((yk70) it3.next()).g;
                                        if (list4 == null || !list4.isEmpty()) {
                                            Iterator<T> it4 = list4.iterator();
                                            while (it4.hasNext()) {
                                                if (((xk70) it4.next()).a.equals(str)) {
                                                    int i3 = 10;
                                                    ArrayList arrayList = new ArrayList(l48.r(list, 10));
                                                    Iterator it5 = list.iterator();
                                                    while (it5.hasNext()) {
                                                        fa70 fa70Var = (fa70) it5.next();
                                                        List<gk70> list5 = fa70Var.f;
                                                        ArrayList arrayList2 = new ArrayList(l48.r(list5, i3));
                                                        Iterator it6 = list5.iterator();
                                                        while (it6.hasNext()) {
                                                            gk70 gk70Var = (gk70) it6.next();
                                                            List<yk70> list6 = gk70Var.d;
                                                            ArrayList arrayList3 = new ArrayList(l48.r(list6, i3));
                                                            for (yk70 yk70Var : list6) {
                                                                List<xk70> list7 = yk70Var.g;
                                                                Iterator it7 = it5;
                                                                Iterator it8 = it6;
                                                                ArrayList arrayList4 = new ArrayList(l48.r(list7, i3));
                                                                for (xk70 xk70Var : list7) {
                                                                    if (xk70Var.a.equals(str)) {
                                                                        xk70Var = new xk70(xk70Var.a, mi70Var2.b, xk70Var.c, xk70Var.d, xk70Var.e);
                                                                    }
                                                                    arrayList4.add(xk70Var);
                                                                    mi70Var2 = mi70Var2;
                                                                }
                                                                mi70 mi70Var3 = mi70Var2;
                                                                String str2 = yk70Var.a;
                                                                sj70 sj70Var = yk70Var.b;
                                                                BigDecimal bigDecimal = yk70Var.c;
                                                                BigDecimal bigDecimal2 = yk70Var.d;
                                                                BigDecimal bigDecimal3 = yk70Var.e;
                                                                BigDecimal bigDecimal4 = yk70Var.f;
                                                                bigDecimal.getClass();
                                                                bigDecimal2.getClass();
                                                                bigDecimal3.getClass();
                                                                bigDecimal4.getClass();
                                                                arrayList3.add(new yk70(str2, sj70Var, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, arrayList4));
                                                                it5 = it7;
                                                                it6 = it8;
                                                                mi70Var2 = mi70Var3;
                                                                i3 = 10;
                                                            }
                                                            mi70 mi70Var4 = mi70Var2;
                                                            Iterator it9 = it5;
                                                            String str3 = gk70Var.a;
                                                            sj70 sj70Var2 = gk70Var.b;
                                                            BigDecimal bigDecimal5 = gk70Var.c;
                                                            bigDecimal5.getClass();
                                                            arrayList2.add(new gk70(str3, sj70Var2, bigDecimal5, arrayList3));
                                                            it5 = it9;
                                                            it6 = it6;
                                                            mi70Var2 = mi70Var4;
                                                            i3 = 10;
                                                        }
                                                        String str4 = fa70Var.a;
                                                        String str5 = fa70Var.b;
                                                        String str6 = fa70Var.c;
                                                        BigDecimal bigDecimal6 = fa70Var.d;
                                                        long j = fa70Var.e;
                                                        bigDecimal6.getClass();
                                                        arrayList.add(new fa70(str4, str5, str6, bigDecimal6, j, arrayList2));
                                                        it5 = it5;
                                                        mi70Var2 = mi70Var2;
                                                        i3 = 10;
                                                    }
                                                    String str7 = ga70Var.a;
                                                    String str8 = ga70Var.b;
                                                    String str9 = ga70Var.c;
                                                    List<ea70> list8 = ga70Var.e;
                                                    List<vk70> list9 = ga70Var.f;
                                                    List<wk70> list10 = ga70Var.g;
                                                    boolean z = ga70Var.h;
                                                    list8.getClass();
                                                    list9.getClass();
                                                    list10.getClass();
                                                    ga70 ga70Var2 = new ga70(str7, str8, str9, arrayList, list8, list9, list10, z);
                                                    do {
                                                        value = wwd0Var.getValue();
                                                    } while (!wwd0Var.g(value, new dc70.c(ga70Var2)));
                                                }
                                            }
                                        }
                                        mi70Var2 = mi70Var2;
                                    }
                                }
                                mi70Var2 = mi70Var2;
                            }
                        }
                        mi70Var2 = mi70Var2;
                        obj3 = null;
                    }
                }
            }
            Unit unit = Unit.a;
            tuwVar2.f(null);
            return Unit.a;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }
}
