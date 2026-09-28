package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class nl8 {
    public static Object a(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            hb5.a(hce0.a(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static int b(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int c(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iK = r58.k(obj);
        int i2 = iK & i;
        int iD = d(i2, obj3);
        if (iD != 0) {
            int i3 = ~i;
            int i4 = iK & i3;
            int i5 = -1;
            while (true) {
                int i6 = iD - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && sgp.a(obj, objArr[i6]) && (objArr2 == null || sgp.a(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        e(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = b(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iD = i9;
            }
        }
        return -1;
    }

    public static int d(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void e(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
