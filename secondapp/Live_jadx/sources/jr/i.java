package jr;

import dr.l1;
import java.util.Comparator;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class i extends h {
    @l1(version = sc.k.f129877g)
    public static final <T> T A0(T t10, @oy.l T[] other, @oy.l Comparator<? super T> comparator) {
        m0.p(other, "other");
        m0.p(comparator, "comparator");
        for (T t11 : other) {
            if (comparator.compare(t10, t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @l1(version = "1.1")
    public static final <T> T B0(T t10, T t11, T t12, @oy.l Comparator<? super T> comparator) {
        m0.p(comparator, "comparator");
        return (T) C0(t10, C0(t11, t12, comparator), comparator);
    }

    @l1(version = "1.1")
    public static final <T> T C0(T t10, T t11, @oy.l Comparator<? super T> comparator) {
        m0.p(comparator, "comparator");
        return comparator.compare(t10, t11) <= 0 ? t10 : t11;
    }

    @l1(version = sc.k.f129877g)
    public static final <T> T D0(T t10, @oy.l T[] other, @oy.l Comparator<? super T> comparator) {
        m0.p(other, "other");
        m0.p(comparator, "comparator");
        for (T t11 : other) {
            if (comparator.compare(t10, t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @l1(version = "1.1")
    public static final <T> T y0(T t10, T t11, T t12, @oy.l Comparator<? super T> comparator) {
        m0.p(comparator, "comparator");
        return (T) z0(t10, z0(t11, t12, comparator), comparator);
    }

    @l1(version = "1.1")
    public static final <T> T z0(T t10, T t11, @oy.l Comparator<? super T> comparator) {
        m0.p(comparator, "comparator");
        return comparator.compare(t10, t11) >= 0 ? t10 : t11;
    }
}
