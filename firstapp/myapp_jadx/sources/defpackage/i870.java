package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class i870 {
    public final wwd0 a = xwd0.a(n1a0.c);
    public final wwd0 b;
    public final wwd0 c;
    public final wwd0 d;
    public final wwd0 e;
    public final wwd0 f;
    public final wwd0 g;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[sfh0.values().length];
            try {
                sfh0.a aVar = sfh0.b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                sfh0.a aVar2 = sfh0.b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public i870() {
        m2g m2gVar = m2g.a;
        this.b = xwd0.a(m2gVar);
        this.c = xwd0.a(null);
        this.d = xwd0.a(m2gVar);
        this.e = xwd0.a(null);
        this.f = xwd0.a(m2gVar);
        this.g = xwd0.a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str, List list) {
        Object next;
        g870 g870Var;
        List listSplit$default;
        Object next2;
        g870 g870Var2;
        List listSplit$default2;
        sfh0.b.getClass();
        sfh0 sfh0VarA = sfh0.a.a(str);
        int i = sfh0VarA == null ? -1 : a.a[sfh0VarA.ordinal()];
        String str2 = null;
        if (i == 1) {
            Iterator it = b(list).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    BigDecimal bigDecimal = (BigDecimal) ((Pair) next).b;
                    do {
                        Object next3 = it.next();
                        BigDecimal bigDecimal2 = (BigDecimal) ((Pair) next3).b;
                        if (bigDecimal.compareTo(bigDecimal2) > 0) {
                            next = next3;
                            bigDecimal = bigDecimal2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Pair pair = (Pair) next;
            if (pair != null && (g870Var = (g870) list.get(((Number) pair.a).intValue())) != null && (listSplit$default = StringsKt__StringsKt.split$default(g870Var.d, new String[]{";"}, false, 0, 6, null)) != null) {
                str2 = (String) CollectionsKt.firstOrNull(listSplit$default);
            }
            return str2 == null ? "" : str2;
        }
        if (i != 2) {
            return str;
        }
        Iterator it2 = b(list).iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                BigDecimal bigDecimal3 = (BigDecimal) ((Pair) next2).b;
                do {
                    Object next4 = it2.next();
                    BigDecimal bigDecimal4 = (BigDecimal) ((Pair) next4).b;
                    if (bigDecimal3.compareTo(bigDecimal4) < 0) {
                        next2 = next4;
                        bigDecimal3 = bigDecimal4;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        Pair pair2 = (Pair) next2;
        if (pair2 != null && (g870Var2 = (g870) list.get(((Number) pair2.a).intValue())) != null && (listSplit$default2 = StringsKt__StringsKt.split$default(g870Var2.d, new String[]{";"}, false, 0, 6, null)) != null) {
            str2 = (String) CollectionsKt.firstOrNull(listSplit$default2);
        }
        return str2 == null ? "" : str2;
    }

    public static final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            ArrayList arrayList2 = ((g870) obj).i;
            ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                arrayList3.add(((ad70) obj2).b);
            }
            BigDecimal bigDecimal = (BigDecimal) CollectionsKt.f0(arrayList3);
            if (bigDecimal == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal2 = (BigDecimal) CollectionsKt.e0(arrayList3);
            if (bigDecimal2 == null) {
                bigDecimal2 = BigDecimal.ZERO;
            }
            bigDecimal2.getClass();
            bigDecimal.getClass();
            BigDecimal bigDecimalSubtract = bigDecimal2.subtract(bigDecimal);
            bigDecimalSubtract.getClass();
            arrayList.add(new Pair(Integer.valueOf(i), bigDecimalSubtract));
            i = i2;
        }
        return arrayList;
    }

    public final void c() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.g;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
    }

    public final void d() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, null));
    }
}
