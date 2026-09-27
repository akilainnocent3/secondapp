package cj;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true)
@j4
public final class p9 {
    public static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    public static <E extends Enum<E>> Class<E> b(E e10) {
        return e10.getDeclaringClass();
    }

    public static <T> T[] c(T[] tArr, int i10) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static <K, V> Map<K, V> d(int expectedSize) {
        return l3.z(expectedSize);
    }

    public static <E> Set<E> e(int expectedSize) {
        return m3.n(expectedSize);
    }

    public static <K, V> Map<K, V> f(int expectedSize) {
        return o3.k0(expectedSize);
    }

    public static <E> Set<E> g(int expectedSize) {
        return p3.S(expectedSize);
    }

    public static <E> Set<E> h() {
        return m3.i();
    }

    public static <K, V> Map<K, V> i() {
        return l3.u();
    }

    public static <K, V> Map<K, V> j(int expectedSize) {
        return n8.e0(expectedSize);
    }

    @yi.d
    public static l8 m(l8 mapMaker) {
        return mapMaker.l();
    }

    public static int k(int exponent) {
        return exponent;
    }

    public static int l(int iterations) {
        return iterations;
    }
}
