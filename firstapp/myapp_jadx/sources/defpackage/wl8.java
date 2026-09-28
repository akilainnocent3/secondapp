package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
public class wl8 extends vl8 {
    public static double c(double d, double... dArr) {
        for (double d2 : dArr) {
            d = Math.max(d, d2);
        }
        return d;
    }

    public static <T extends Comparable<? super T>> T d(T t, T t2) {
        t.getClass();
        t2.getClass();
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    public static <T extends Comparable<? super T>> T e(T t, T t2) {
        t.getClass();
        t2.getClass();
        return t.compareTo(t2) <= 0 ? t : t2;
    }
}
