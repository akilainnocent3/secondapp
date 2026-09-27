package cj;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.c
@j4
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f24229a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f24230b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24231c = 32;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24232d = 31;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24233e = 1073741823;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24234f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f24235g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f24236h = 256;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f24237i = 255;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f24238j = 65536;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f24239k = 65535;

    public static Object a(int buckets) {
        if (buckets >= 2 && buckets <= 1073741824 && Integer.highestOneBit(buckets) == buckets) {
            if (buckets <= 256) {
                return new byte[buckets];
            }
            return buckets <= 65536 ? new short[buckets] : new int[buckets];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + buckets);
    }

    public static int b(int value, int mask) {
        return value & (~mask);
    }

    public static int c(int entry, int mask) {
        return entry & mask;
    }

    public static int d(int prefix, int suffix, int mask) {
        return (prefix & (~mask)) | (suffix & mask);
    }

    public static int e(int mask) {
        return (mask < 32 ? 4 : 2) * (mask + 1);
    }

    public static int f(@zq.a Object key, @zq.a Object value, int mask, Object table, int[] entries, Object[] keys, @zq.a Object[] values) {
        int iD = m6.d(key);
        int i10 = iD & mask;
        int iH = h(table, i10);
        if (iH == 0) {
            return -1;
        }
        int iB = b(iD, mask);
        int i11 = -1;
        while (true) {
            int i12 = iH - 1;
            int i13 = entries[i12];
            if (b(i13, mask) == iB && zi.f0.a(key, keys[i12]) && (values == null || zi.f0.a(value, values[i12]))) {
                int iC = c(i13, mask);
                if (i11 == -1) {
                    i(table, i10, iC);
                    return i12;
                }
                entries[i11] = d(entries[i11], iC, mask);
                return i12;
            }
            int iC2 = c(i13, mask);
            if (iC2 == 0) {
                return -1;
            }
            i11 = i12;
            iH = iC2;
        }
    }

    public static void g(Object table) {
        if (table instanceof byte[]) {
            Arrays.fill((byte[]) table, (byte) 0);
        } else if (table instanceof short[]) {
            Arrays.fill((short[]) table, (short) 0);
        } else {
            Arrays.fill((int[]) table, 0);
        }
    }

    public static int h(Object table, int index) {
        if (table instanceof byte[]) {
            return ((byte[]) table)[index] & 255;
        }
        return table instanceof short[] ? ((short[]) table)[index] & dr.r2.f79504e : ((int[]) table)[index];
    }

    public static void i(Object table, int index, int entry) {
        if (table instanceof byte[]) {
            ((byte[]) table)[index] = (byte) entry;
        } else if (table instanceof short[]) {
            ((short[]) table)[index] = (short) entry;
        } else {
            ((int[]) table)[index] = entry;
        }
    }

    public static int j(int expectedSize) {
        return Math.max(4, m6.a(expectedSize + 1, 1.0d));
    }
}
