package dw;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g2 {
    @zv.i
    public static final void a(@oy.l int[] seenArray, @oy.l int[] goldenMaskArray, @oy.l bw.f descriptor) {
        kotlin.jvm.internal.m0.p(seenArray, "seenArray");
        kotlin.jvm.internal.m0.p(goldenMaskArray, "goldenMaskArray");
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = goldenMaskArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = goldenMaskArray[i10] & (~seenArray[i10]);
            if (i11 != 0) {
                for (int i12 = 0; i12 < 32; i12++) {
                    if ((i11 & 1) != 0) {
                        arrayList.add(descriptor.f((i10 * 32) + i12));
                    }
                    i11 >>>= 1;
                }
            }
        }
        throw new zv.m(arrayList, descriptor.h());
    }

    @zv.i
    public static final void b(int i10, int i11, @oy.l bw.f descriptor) {
        kotlin.jvm.internal.m0.p(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.f(i13));
            }
            i12 >>>= 1;
        }
        throw new zv.m(arrayList, descriptor.h());
    }
}
