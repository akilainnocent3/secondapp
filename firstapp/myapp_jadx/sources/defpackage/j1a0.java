package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j1a0 {
    public static final int a(ArrayList<l00> arrayList, int i, int i2) {
        int iB = b(arrayList, i, i2);
        return iB >= 0 ? iB : -(iB + 1);
    }

    public static final int b(ArrayList<l00> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = arrayList.get(i4).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iH = Intrinsics.h(i5, i);
            if (iH < 0) {
                i3 = i4 + 1;
            } else {
                if (iH <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int c(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void d() {
        throw new ConcurrentModificationException();
    }

    public static final void e(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }
}
