package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class J3 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59294a;

        static {
            int[] iArr = new int[O3.values().length];
            try {
                iArr[O3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f59294a = iArr;
        }
    }

    public final int a(@oy.l O3 cappingType) {
        kotlin.jvm.internal.m0.p(cappingType, "cappingType");
        int i10 = a.f59294a[cappingType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 3000;
        }
        if (i10 == 3) {
            return 3001;
        }
        throw new dr.o0();
    }
}
