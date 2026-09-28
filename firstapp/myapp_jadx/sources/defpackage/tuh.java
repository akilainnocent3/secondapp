package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tuh implements Function1 {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;

    public /* synthetic */ tuh(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double d;
        List list = this.a;
        int size = list.size();
        double[] dArr = new double[size];
        int i = 0;
        int i2 = 0;
        while (true) {
            d = 1.0d;
            if (i2 >= size) {
                break;
            }
            dArr[i2] = 1.0d - ((Number) list.get(i2)).doubleValue();
            i2++;
        }
        List list2 = this.b;
        Iterator it = list2.iterator();
        double dDoubleValue = 1.0d;
        while (it.hasNext()) {
            dDoubleValue *= ((Number) list.get(((Number) it.next()).intValue())).doubleValue();
        }
        IntRange intRangeI = b.i(list);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = intRangeI.iterator();
        while (((mwo) it2).hasNext()) {
            Object next = ((zvo) it2).next();
            if (!list2.contains(Integer.valueOf(((Number) next).intValue()))) {
                arrayList.add(next);
            }
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            d *= dArr[((Number) obj2).intValue()];
        }
        return Double.valueOf(dDoubleValue * d);
    }
}
