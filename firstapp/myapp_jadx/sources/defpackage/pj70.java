package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class pj70 {
    public final cmo a;
    public final mg70 b;
    public final mgb0 c;
    public final rdd0 d;
    public final x370 e;
    public final wwd0 f = xwd0.a(Long.valueOf(System.currentTimeMillis()));
    public final tuw g = uuw.a();
    public final wwd0 h = xwd0.a(rj70.b.a);
    public final wwd0 i = xwd0.a(0L);
    public final b390 j = d390.b(0, 1, pb5.b, 1);
    public final tuw k = uuw.a();
    public final wwd0 l;
    public final wwd0 m;
    public final wwd0 n;

    public pj70(cmo cmoVar, mg70 mg70Var, mgb0 mgb0Var, bre0 bre0Var, rdd0 rdd0Var, x370 x370Var) {
        this.a = cmoVar;
        this.b = mg70Var;
        this.c = mgb0Var;
        this.d = rdd0Var;
        this.e = x370Var;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.l = xwd0.a(o2gVar);
        this.m = xwd0.a(n1a0.c);
        this.n = xwd0.a(zs.a.a);
    }

    public static Long a(long j, List list) {
        Long lValueOf;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            lValueOf = Long.valueOf(((o470) it.next()).d);
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((o470) it.next()).d);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
        } else {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return null;
        }
        long jLongValue = lValueOf.longValue();
        if (j < jLongValue) {
            j = jLongValue;
        }
        return Long.valueOf(j + 5000);
    }

    public final void b() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.n;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, zs.a.a));
    }

    public final ni70 c() {
        Object value = this.h.getValue();
        rj70.c cVar = value instanceof rj70.c ? (rj70.c) value : null;
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    public final long d() {
        return ((Number) this.i.getValue()).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:44:0x0130  */
    /* JADX WARN: Code duplicated, block: B:47:0x0143  */
    /* JADX WARN: Code duplicated, block: B:48:0x0144 A[Catch: all -> 0x0165, TryCatch #1 {all -> 0x0165, blocks: (B:45:0x0132, B:49:0x0156, B:51:0x015c, B:48:0x0144), top: B:75:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x016b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0188  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(String str, String str2, String str3, int i, int i2, boolean z, x1b x1bVar) {
        si70 si70Var;
        String str4;
        String str5;
        int i3;
        String str6;
        quw quwVar;
        boolean z2;
        int i4;
        Object value;
        String str7;
        boolean z3;
        Object objD;
        boolean z4;
        boolean z5;
        int i5;
        int i6;
        String str8;
        Throwable thA;
        Throwable th;
        String str9;
        List list;
        List list2;
        String str10;
        Object value2;
        Object value3;
        Map mapI;
        long jD;
        if (x1bVar instanceof si70) {
            si70Var = (si70) x1bVar;
            int i7 = si70Var.A;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                si70Var.A = i7 - Integer.MIN_VALUE;
            } else {
                si70Var = new si70(this, x1bVar);
            }
        } else {
            si70Var = new si70(this, x1bVar);
        }
        Object obj = si70Var.y;
        y5b y5bVar = y5b.a;
        int i8 = si70Var.A;
        tuw tuwVar = this.k;
        wwd0 wwd0Var = this.l;
        try {
            if (i8 == 0) {
                uj50.b(obj);
                str4 = str;
                si70Var.a = str4;
                str5 = str2;
                si70Var.b = str5;
                si70Var.c = str3;
                si70Var.d = tuwVar;
                si70Var.f = i;
                i3 = i2;
                si70Var.i = i3;
                si70Var.v = z;
                si70Var.A = 1;
                if (tuwVar.d(si70Var) != y5bVar) {
                    str6 = str3;
                    quwVar = tuwVar;
                    z2 = z;
                    i4 = i;
                }
                return y5bVar;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        tuwVar = si70Var.e;
                        th = (Throwable) si70Var.d;
                        str9 = si70Var.c;
                        uj50.b(obj);
                        do {
                            try {
                                value2 = wwd0Var.getValue();
                            } catch (Throwable th2) {
                                tuwVar.f(null);
                                throw th2;
                            }
                        } while (!wwd0Var.g(value2, kpu.i((Map) value2, new Pair(str9, new v470.a(new u470(th))))));
                        Unit unit = Unit.a;
                        tuwVar.f(null);
                        return Unit.a;
                    }
                    if (i8 != 4) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tuwVar = si70Var.e;
                    list2 = (List) si70Var.d;
                    str10 = si70Var.c;
                    uj50.b(obj);
                    do {
                        try {
                            value3 = wwd0Var.getValue();
                            mapI = (Map) value3;
                            jD = d();
                            if (jD > 0) {
                                mapI = kpu.i(mapI, new Pair(str10, new v470.c(a(jD, list2), list2)));
                            }
                        } catch (Throwable th3) {
                            tuwVar.f(null);
                            throw th3;
                        }
                    } while (!wwd0Var.g(value3, mapI));
                    Unit unit2 = Unit.a;
                    tuwVar.f(null);
                    return Unit.a;
                }
                z5 = si70Var.w;
                z4 = si70Var.v;
                i5 = si70Var.i;
                i6 = si70Var.f;
                str8 = si70Var.c;
                uj50.b(obj);
                objD = ((zi50) obj).a;
                thA = zi50.a(objD);
                if (thA == null) {
                    list = (List) objD;
                    si70Var.a = null;
                    si70Var.b = null;
                    si70Var.c = str8;
                    si70Var.d = list;
                    si70Var.e = tuwVar;
                    si70Var.f = i6;
                    si70Var.i = i5;
                    si70Var.v = z4;
                    si70Var.w = z5;
                    si70Var.A = 4;
                    if (tuwVar.d(si70Var) != y5bVar) {
                        list2 = list;
                        str10 = str8;
                        do {
                            value3 = wwd0Var.getValue();
                            mapI = (Map) value3;
                            jD = d();
                            if (jD > 0) {
                                mapI = kpu.i(mapI, new Pair(str10, new v470.c(a(jD, list2), list2)));
                            }
                        } while (!wwd0Var.g(value3, mapI));
                        Unit unit3 = Unit.a;
                        tuwVar.f(null);
                        return Unit.a;
                    }
                } else {
                    si70Var.a = null;
                    si70Var.b = null;
                    si70Var.c = str8;
                    si70Var.d = thA;
                    si70Var.e = tuwVar;
                    si70Var.f = i6;
                    si70Var.i = i5;
                    si70Var.v = z4;
                    si70Var.w = z5;
                    si70Var.A = 3;
                    if (tuwVar.d(si70Var) != y5bVar) {
                        th = thA;
                        str9 = str8;
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, kpu.i((Map) value2, new Pair(str9, new v470.a(new u470(th))))));
                        Unit unit4 = Unit.a;
                        tuwVar.f(null);
                        return Unit.a;
                    }
                }
                return y5bVar;
            }
            boolean z6 = si70Var.v;
            i3 = si70Var.i;
            i4 = si70Var.f;
            quwVar = (quw) si70Var.d;
            str6 = si70Var.c;
            String str11 = si70Var.b;
            String str12 = si70Var.a;
            uj50.b(obj);
            str4 = str12;
            z2 = z6;
            str5 = str11;
            if (((Map) wwd0Var.getValue()).get(str6) == null || z2) {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, kpu.i((Map) value, new Pair(str6, v470.b.a))));
                str7 = null;
                z3 = true;
            } else {
                z3 = false;
                str7 = null;
            }
            quwVar.f(str7);
            if (!z3) {
                return Unit.a;
            }
            si70Var.a = str7;
            si70Var.b = str7;
            si70Var.c = str6;
            si70Var.d = str7;
            si70Var.f = i4;
            si70Var.i = i3;
            si70Var.v = z2;
            si70Var.w = z3;
            si70Var.A = 2;
            int i9 = i4;
            objD = this.b.d(i9, i3, si70Var, str4, str5);
            if (objD != y5bVar) {
                z4 = z2;
                z5 = z3;
                i5 = i3;
                i6 = i4;
                str8 = str6;
                thA = zi50.a(objD);
                if (thA == null) {
                    list = (List) objD;
                    si70Var.a = null;
                    si70Var.b = null;
                    si70Var.c = str8;
                    si70Var.d = list;
                    si70Var.e = tuwVar;
                    si70Var.f = i6;
                    si70Var.i = i5;
                    si70Var.v = z4;
                    si70Var.w = z5;
                    si70Var.A = 4;
                    if (tuwVar.d(si70Var) != y5bVar) {
                        list2 = list;
                        str10 = str8;
                        do {
                            value3 = wwd0Var.getValue();
                            mapI = (Map) value3;
                            jD = d();
                            if (jD > 0) {
                                mapI = kpu.i(mapI, new Pair(str10, new v470.c(a(jD, list2), list2)));
                            }
                        } while (!wwd0Var.g(value3, mapI));
                        Unit unit5 = Unit.a;
                        tuwVar.f(null);
                        return Unit.a;
                    }
                } else {
                    si70Var.a = null;
                    si70Var.b = null;
                    si70Var.c = str8;
                    si70Var.d = thA;
                    si70Var.e = tuwVar;
                    si70Var.f = i6;
                    si70Var.i = i5;
                    si70Var.v = z4;
                    si70Var.w = z5;
                    si70Var.A = 3;
                    if (tuwVar.d(si70Var) != y5bVar) {
                        th = thA;
                        str9 = str8;
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, kpu.i((Map) value2, new Pair(str9, new v470.a(new u470(th))))));
                        Unit unit6 = Unit.a;
                        tuwVar.f(null);
                        return Unit.a;
                    }
                }
            }
            return y5bVar;
        } catch (Throwable th4) {
            quwVar.f(null);
            throw th4;
        }
    }

    public final l770 f(String str) {
        List<l770> list;
        str.getClass();
        ni70 ni70VarC = c();
        Object obj = null;
        if (ni70VarC == null || (list = ni70VarC.c) == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((l770) obj2).a.equals(str)) {
                obj = obj2;
                break;
            }
        }
        return (l770) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable g(long j, x1b x1bVar) {
        ti70 ti70Var;
        tuw tuwVar;
        if (x1bVar instanceof ti70) {
            ti70Var = (ti70) x1bVar;
            int i = ti70Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ti70Var.e = i - Integer.MIN_VALUE;
            } else {
                ti70Var = new ti70(this, x1bVar);
            }
        } else {
            ti70Var = new ti70(this, x1bVar);
        }
        Object obj = ti70Var.c;
        y5b y5bVar = y5b.a;
        int i2 = ti70Var.e;
        if (i2 == 0) {
            uj50.b(obj);
            tuw tuwVar2 = this.g;
            ti70Var.b = tuwVar2;
            ti70Var.a = j;
            ti70Var.e = 1;
            if (tuwVar2.d(ti70Var) == y5bVar) {
                return y5bVar;
            }
            tuwVar = tuwVar2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = ti70Var.a;
            tuwVar = ti70Var.b;
            uj50.b(obj);
        }
        try {
            ni70 ni70VarC = c();
            if (ni70VarC == null) {
                m2g m2gVar = m2g.a;
                tuwVar.f(null);
                return m2gVar;
            }
            List<l770> list = ni70VarC.c;
            ArrayList arrayList = new ArrayList();
            for (l770 l770Var : list) {
                List<e970> list2 = l770Var.d;
                ArrayList arrayList2 = new ArrayList();
                for (e970 e970Var : list2) {
                    Pair pair = e970Var.b(j) ? new Pair(l770Var.a, e970Var) : null;
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                p48.w(arrayList2, arrayList);
            }
            tuwVar.f(null);
            return arrayList;
        } catch (Throwable th) {
            tuwVar.f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075 A[Catch: all -> 0x00a6, TryCatch #1 {all -> 0x00a6, blocks: (B:26:0x006d, B:52:0x00e7, B:29:0x0075, B:30:0x0086, B:32:0x008c, B:48:0x00cb, B:36:0x009f, B:47:0x00c3, B:41:0x00a8, B:42:0x00ac, B:44:0x00b2, B:49:0x00cf, B:50:0x00d5), top: B:80:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: all -> 0x00a6, TryCatch #1 {all -> 0x00a6, blocks: (B:26:0x006d, B:52:0x00e7, B:29:0x0075, B:30:0x0086, B:32:0x008c, B:48:0x00cb, B:36:0x009f, B:47:0x00c3, B:41:0x00a8, B:42:0x00ac, B:44:0x00b2, B:49:0x00cf, B:50:0x00d5), top: B:80:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8 A[Catch: all -> 0x00a6, TryCatch #1 {all -> 0x00a6, blocks: (B:26:0x006d, B:52:0x00e7, B:29:0x0075, B:30:0x0086, B:32:0x008c, B:48:0x00cb, B:36:0x009f, B:47:0x00c3, B:41:0x00a8, B:42:0x00ac, B:44:0x00b2, B:49:0x00cf, B:50:0x00d5), top: B:80:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[Catch: all -> 0x00a6, TryCatch #1 {all -> 0x00a6, blocks: (B:26:0x006d, B:52:0x00e7, B:29:0x0075, B:30:0x0086, B:32:0x008c, B:48:0x00cb, B:36:0x009f, B:47:0x00c3, B:41:0x00a8, B:42:0x00ac, B:44:0x00b2, B:49:0x00cf, B:50:0x00d5), top: B:80:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0122  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123 A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:62:0x010f, B:63:0x0111, B:67:0x0135, B:69:0x013b, B:66:0x0123), top: B:78:0x010f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:88:0x00c3 A[SYNTHETIC] */
    public final Object h(l970 l970Var, x1b x1bVar) {
        vi70 vi70Var;
        List<o470> list;
        String str;
        tuw tuwVar;
        e970 e970Var;
        String str2;
        tuw tuwVar2;
        ni70 ni70VarC;
        ArrayList arrayList;
        ni70 ni70VarA;
        wwd0 wwd0Var;
        Object value;
        String str3;
        List<e970> list2;
        Iterator<T> it;
        wwd0 wwd0Var2;
        Object value2;
        Map mapI;
        long jD;
        if (x1bVar instanceof vi70) {
            vi70Var = (vi70) x1bVar;
            int i = vi70Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vi70Var.f = i - Integer.MIN_VALUE;
            } else {
                vi70Var = new vi70(this, x1bVar);
            }
        } else {
            vi70Var = new vi70(this, x1bVar);
        }
        Object obj = vi70Var.d;
        y5b y5bVar = y5b.a;
        int i2 = vi70Var.f;
        if (i2 == 0) {
            uj50.b(obj);
            if (l970Var == null) {
                return Unit.a;
            }
            if (l970Var instanceof l970.a) {
                l970.a aVar = (l970.a) l970Var;
                String str4 = aVar.a;
                e970 e970Var2 = aVar.b;
                vi70Var.a = str4;
                vi70Var.b = e970Var2;
                tuw tuwVar3 = this.g;
                vi70Var.c = tuwVar3;
                vi70Var.f = 1;
                if (tuwVar3.d(vi70Var) != y5bVar) {
                    e970Var = e970Var2;
                    str2 = str4;
                    tuwVar2 = tuwVar3;
                    ni70VarC = c();
                    if (ni70VarC == null) {
                        List<l770> list3 = ni70VarC.c;
                        arrayList = new ArrayList(l48.r(list3, 10));
                        for (l770 l770VarA : list3) {
                            str3 = l770VarA.a;
                            list2 = l770VarA.d;
                            if (str3.equals(str2)) {
                                if (list2 != null) {
                                    it = list2.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            l770VarA = l770.a(l770VarA, CollectionsKt.j0(list2, e970Var));
                                            break;
                                            break;
                                        }
                                    } while (!((e970) it.next()).a.equals(e970Var.a));
                                } else {
                                    it = list2.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            l770VarA = l770.a(l770VarA, CollectionsKt.j0(list2, e970Var));
                                            break;
                                            break;
                                        }
                                    } while (!((e970) it.next()).a.equals(e970Var.a));
                                }
                            }
                            arrayList.add(l770VarA);
                        }
                        ni70VarA = ni70.a(ni70VarC, arrayList);
                        wwd0Var = this.h;
                        do {
                            value = wwd0Var.getValue();
                        } while (!wwd0Var.g(value, new rj70.c(ni70VarA)));
                    }
                    Unit unit = Unit.a;
                }
            } else {
                if (!(l970Var instanceof l970.b)) {
                    uhc.a();
                    return null;
                }
                l970.b bVar = (l970.b) l970Var;
                String str5 = bVar.a;
                List<o470> list4 = bVar.b;
                vi70Var.a = str5;
                vi70Var.b = list4;
                tuw tuwVar4 = this.k;
                vi70Var.c = tuwVar4;
                vi70Var.f = 2;
                if (tuwVar4.d(vi70Var) != y5bVar) {
                    list = list4;
                    str = str5;
                    tuwVar = tuwVar4;
                    wwd0Var2 = this.l;
                    do {
                        value2 = wwd0Var2.getValue();
                        mapI = (Map) value2;
                        jD = d();
                        if (jD <= 0) {
                            mapI = kpu.i(mapI, new Pair(str, new v470.c(a(jD, list), list)));
                        }
                    } while (!wwd0Var2.g(value2, mapI));
                    Unit unit2 = Unit.a;
                }
            }
            return y5bVar;
        }
        if (i2 == 1) {
            tuwVar2 = vi70Var.c;
            e970Var = (e970) vi70Var.b;
            str2 = vi70Var.a;
            uj50.b(obj);
            try {
                ni70VarC = c();
                if (ni70VarC == null) {
                    List<l770> list5 = ni70VarC.c;
                    arrayList = new ArrayList(l48.r(list5, 10));
                    while (r2.hasNext()) {
                        str3 = l770VarA.a;
                        list2 = l770VarA.d;
                        if (str3.equals(str2)) {
                            if (list2 != null || !list2.isEmpty()) {
                                it = list2.iterator();
                                do {
                                    if (it.hasNext()) {
                                    }
                                } while (!((e970) it.next()).a.equals(e970Var.a));
                            }
                            l770VarA = l770.a(l770VarA, CollectionsKt.j0(list2, e970Var));
                            break;
                        }
                        arrayList.add(l770VarA);
                    }
                    ni70VarA = ni70.a(ni70VarC, arrayList);
                    wwd0Var = this.h;
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, new rj70.c(ni70VarA)));
                }
                Unit unit3 = Unit.a;
            } finally {
                tuwVar2.f(null);
            }
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuwVar = vi70Var.c;
            list = (List) vi70Var.b;
            str = vi70Var.a;
            uj50.b(obj);
            try {
                wwd0Var2 = this.l;
                do {
                    value2 = wwd0Var2.getValue();
                    mapI = (Map) value2;
                    jD = d();
                    if (jD <= 0) {
                        mapI = kpu.i(mapI, new Pair(str, new v470.c(a(jD, list), list)));
                    }
                } while (!wwd0Var2.g(value2, mapI));
                Unit unit4 = Unit.a;
            } finally {
                tuwVar.f(null);
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0187 A[Catch: all -> 0x01a5, TryCatch #2 {all -> 0x01a5, blocks: (B:68:0x016d, B:69:0x0181, B:71:0x0187, B:73:0x0199, B:76:0x01a8, B:78:0x01ae), top: B:89:0x016d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:94:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0181 A[SYNTHETIC] */
    public final Object i(long j, x1b x1bVar) throws Throwable {
        nj70 nj70Var;
        Set linkedHashSet;
        tuw tuwVar;
        long j2;
        Object obj;
        tuw tuwVar2;
        Set set;
        Object value;
        Long l;
        Object value2;
        LinkedHashMap linkedHashMap;
        if (x1bVar instanceof nj70) {
            nj70Var = (nj70) x1bVar;
            int i = nj70Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nj70Var.f = i - Integer.MIN_VALUE;
            } else {
                nj70Var = new nj70(this, x1bVar);
            }
        } else {
            nj70Var = new nj70(this, x1bVar);
        }
        Object obj2 = nj70Var.d;
        y5b y5bVar = y5b.a;
        int i2 = nj70Var.f;
        wwd0 wwd0Var = this.l;
        try {
            if (i2 == 0) {
                uj50.b(obj2);
                linkedHashSet = new LinkedHashSet();
                nj70Var.b = linkedHashSet;
                tuwVar = this.g;
                nj70Var.c = tuwVar;
                j2 = j;
                nj70Var.a = j2;
                nj70Var.f = 1;
                if (tuwVar.d(nj70Var) != y5bVar) {
                }
                return y5bVar;
            }
            if (i2 == 1) {
                j2 = nj70Var.a;
                tuwVar = nj70Var.c;
                Set set2 = nj70Var.b;
                uj50.b(obj2);
                linkedHashSet = set2;
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tuwVar2 = nj70Var.c;
                set = nj70Var.b;
                uj50.b(obj2);
            }
            tuw tuwVar3 = tuwVar2;
            do {
                try {
                    value2 = wwd0Var.getValue();
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) value2).entrySet()) {
                        if (!set.contains((String) entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Throwable th) {
                    tuwVar3.f(null);
                    throw th;
                }
            } while (!wwd0Var.g(value2, linkedHashMap));
            Unit unit = Unit.a;
            tuwVar3.f(null);
            return Unit.a;
            ni70 ni70VarC = c();
            if (ni70VarC != null) {
                List<l770> list = ni70VarC.c;
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    l770 l770Var = (l770) it.next();
                    List<e970> list2 = l770Var.d;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        e970 e970Var = (e970) obj3;
                        Set set3 = linkedHashSet;
                        Map map = (Map) wwd0Var.getValue();
                        Iterator it2 = it;
                        String str = e970Var.a;
                        long j3 = j2;
                        long j4 = e970Var.h;
                        Object obj4 = map.get(str);
                        v470.c cVar = obj4 instanceof v470.c ? (v470.c) obj4 : null;
                        boolean z = j3 >= Math.min((cVar == null || (l = cVar.b) == null) ? j4 : l.longValue(), j4);
                        if (z) {
                            set3.add(e970Var.a);
                        }
                        if (!z) {
                            arrayList2.add(obj3);
                        }
                        linkedHashSet = set3;
                        nj70Var = nj70Var;
                        j2 = j3;
                        it = it2;
                    }
                    arrayList.add(l770.a(l770Var, arrayList2));
                    linkedHashSet = linkedHashSet;
                    nj70Var = nj70Var;
                    j2 = j2;
                    it = it;
                }
                Set set4 = linkedHashSet;
                nj70 nj70Var2 = nj70Var;
                long j5 = j2;
                if (!set4.isEmpty()) {
                    ni70 ni70VarA = ni70.a(ni70VarC, arrayList);
                    wwd0 wwd0Var2 = this.h;
                    do {
                        value = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value, new rj70.c(ni70VarA)));
                }
                Unit unit2 = Unit.a;
                tuwVar.f(null);
                if (set4.isEmpty()) {
                    return Unit.a;
                }
                nj70Var2.b = set4;
                tuwVar2 = this.k;
                nj70Var2.c = tuwVar2;
                nj70Var2.a = j5;
                nj70Var2.f = 2;
                if (tuwVar2.d(nj70Var2) != y5bVar) {
                    set = set4;
                    tuw tuwVar4 = tuwVar2;
                    do {
                        value2 = wwd0Var.getValue();
                        linkedHashMap = new LinkedHashMap();
                        while (r3.hasNext()) {
                            if (!set.contains((String) entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    } while (!wwd0Var.g(value2, linkedHashMap));
                    Unit unit3 = Unit.a;
                    tuwVar4.f(null);
                    return Unit.a;
                }
                return y5bVar;
            }
            try {
                Unit unit4 = Unit.a;
                tuwVar.f(null);
                return unit4;
            } catch (Throwable th2) {
                th = th2;
                obj = null;
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
        tuwVar.f(obj);
        throw th;
    }
}
