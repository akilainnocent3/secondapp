package com.ironsource;

import com.ironsource.mediationsdk.IronSource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final X0 f60285a = new X0();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60286a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f60286a = iArr;
        }
    }

    private X0() {
    }

    @oy.l
    @cs.o
    public static final Q6.a a(@oy.l IronSource.a adUnit) {
        kotlin.jvm.internal.m0.p(adUnit, "adUnit");
        int i10 = a.f60286a[adUnit.ordinal()];
        if (i10 == 1) {
            return Q6.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return Q6.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return Q6.a.BANNER;
        }
        if (i10 == 4) {
            return Q6.a.NATIVE_AD;
        }
        throw new dr.o0();
    }
}
