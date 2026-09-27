package cj;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public final class m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f24139a = -862048943;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f24140b = 461845907;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24141c = 1073741824;

    public static int a(int expectedEntries, double loadFactor) {
        int iMax = Math.max(expectedEntries, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (loadFactor * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i10 = iHighestOneBit << 1;
        if (i10 > 0) {
            return i10;
        }
        return 1073741824;
    }

    public static boolean b(int size, int tableSize, double loadFactor) {
        return ((double) size) > loadFactor * ((double) tableSize) && tableSize < 1073741824;
    }

    public static int c(int hashCode) {
        return (int) (((long) Integer.rotateLeft((int) (((long) hashCode) * f24139a), 15)) * f24140b);
    }

    public static int d(@zq.a Object o10) {
        return c(o10 == null ? 0 : o10.hashCode());
    }
}
