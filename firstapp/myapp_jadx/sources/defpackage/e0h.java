package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class e0h {
    public static final List<Double> a = Collections.unmodifiableList(Arrays.asList(Double.valueOf(0.0d), Double.valueOf(5.0d), Double.valueOf(10.0d), Double.valueOf(25.0d), Double.valueOf(50.0d), Double.valueOf(75.0d), Double.valueOf(100.0d), Double.valueOf(250.0d), Double.valueOf(500.0d), Double.valueOf(750.0d), Double.valueOf(1000.0d), Double.valueOf(2500.0d), Double.valueOf(5000.0d), Double.valueOf(7500.0d), Double.valueOf(10000.0d)));

    public static int a(double d, double[] dArr) {
        for (int i = 0; i < dArr.length; i++) {
            if (d <= dArr[i]) {
                return i;
            }
        }
        return dArr.length;
    }

    public static void b(List<Double> list) {
        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            if (Double.isNaN(it.next().doubleValue())) {
                hb5.a("invalid bucket boundary: NaN");
                return;
            }
        }
        for (int i = 1; i < list.size(); i++) {
            int i2 = i - 1;
            if (list.get(i2).doubleValue() >= list.get(i).doubleValue()) {
                StringBuilder sb = new StringBuilder("Bucket boundaries must be in increasing order: ");
                sb.append(list.get(i2));
                mrh0.a(sb, " >= ", list.get(i));
                return;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        if (list.get(0).doubleValue() == Double.NEGATIVE_INFINITY) {
            hb5.a("invalid bucket boundary: -Inf");
        } else {
            if (((Double) uts.a(1, list)).doubleValue() != Double.POSITIVE_INFINITY) {
                return;
            }
            hb5.a("invalid bucket boundary: +Inf");
        }
    }
}
