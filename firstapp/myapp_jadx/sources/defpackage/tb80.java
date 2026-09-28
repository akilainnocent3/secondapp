package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tb80 {
    public static final Comparator<bb80>[] a;
    public static final a b;

    public static final class a extends qlr implements Function2<bb80, bb80, Integer> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(bb80 bb80Var, bb80 bb80Var2) {
            sa80 sa80Var = bb80Var.d;
            ob80<Float> ob80Var = hb80.s;
            return Integer.valueOf(Float.compare(((Number) sa80Var.e(ob80Var, rb80.a)).floatValue(), ((Number) bb80Var2.d.e(ob80Var, sb80.a)).floatValue()));
        }
    }

    public static final class b<T> implements Comparator {
        public final /* synthetic */ Comparator a;

        public b(Comparator comparator) {
            tsr.c cVar = tsr.g0;
            this.a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.a.compare(t, t2);
            return iCompare != 0 ? iCompare : tsr.j0.compare(((bb80) t).c, ((bb80) t2).c);
        }
    }

    public static final class c<T> implements Comparator {
        public final /* synthetic */ b a;

        public c(b bVar) {
            this.a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.a.compare(t, t2);
            return iCompare != 0 ? iCompare : Integer.valueOf(((bb80) t).g).compareTo(Integer.valueOf(((bb80) t2).g));
        }
    }

    static {
        Comparator<bb80>[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            Comparator comparator = i == 0 ? h160.a : v4u.a;
            tsr.c cVar = tsr.g0;
            comparatorArr[i] = new c(new b(comparator));
            i++;
        }
        a = comparatorArr;
        b = a.a;
    }

    public static final void a(bb80 bb80Var, ArrayList arrayList, g50 g50Var, h50 h50Var, msw mswVar) {
        boolean zBooleanValue = ((Boolean) bb80Var.d.e(hb80.m, ub80.a)).booleanValue();
        if ((zBooleanValue || ((Boolean) h50Var.invoke(bb80Var)).booleanValue()) && ((Boolean) g50Var.invoke(bb80Var)).booleanValue()) {
            arrayList.add(bb80Var);
        }
        if (zBooleanValue) {
            mswVar.h(bb80Var.g, b(bb80Var, g50Var, h50Var, bb80.j(7, bb80Var)));
            return;
        }
        List listJ = bb80.j(7, bb80Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((bb80) listJ.get(i), arrayList, g50Var, h50Var, mswVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList b(bb80 bb80Var, g50 g50Var, h50 h50Var, List list) {
        int i;
        msw mswVar = hwo.a;
        msw mswVar2 = new msw();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((bb80) list.get(i2), arrayList, g50Var, h50Var, mswVar2);
        }
        int i3 = 1;
        char c2 = bb80Var.c.O == asr.b ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                bb80 bb80Var2 = (bb80) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new Pair(bb80Var2.h(), kotlin.collections.b.l(bb80Var2)));
                    break;
                }
                float f = bb80Var2.h().b;
                float f2 = bb80Var2.h().d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        lk40 lk40Var = (lk40) ((Pair) arrayList2.get(i6)).a;
                        float f3 = lk40Var.b;
                        i = i3;
                        float f4 = lk40Var.d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new Pair(new lk40(Math.max(lk40Var.a, 0.0f), Math.max(lk40Var.b, f), Math.min(lk40Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((Pair) arrayList2.get(i6)).b));
                            ((List) ((Pair) arrayList2.get(i6)).b).add(bb80Var2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new Pair(bb80Var2.h(), kotlin.collections.b.l(bb80Var2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        o48.v(q1g0.a, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Comparator<bb80> comparator = a[c2 ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Pair pair = (Pair) arrayList2.get(i8);
            o48.v(comparator, (List) pair.b);
            arrayList3.addAll((Collection) pair.b);
        }
        final a aVar = b;
        o48.v(new Comparator() { // from class: qb80
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) aVar.invoke(obj, obj2)).intValue();
            }
        }, arrayList3);
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) mswVar2.b(((bb80) arrayList3.get(size5)).g);
            if (list2 != null) {
                if (((Boolean) h50Var.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
