package uw;

import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static final int a(int i10, int i11, @l ds.l<? super Integer, Integer> compare) {
        m0.p(compare, "compare");
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) / 2;
            int iIntValue = compare.invoke(Integer.valueOf(i13)).intValue();
            if (iIntValue < 0) {
                i12 = i13 - 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i10 = i13 + 1;
            }
        }
        return (-i10) - 1;
    }

    public static final int b(@l String str, int i10) {
        m0.p(str, "<this>");
        char cCharAt = str.charAt(i10);
        return (cCharAt << 7) + str.charAt(i10 + 1);
    }
}
