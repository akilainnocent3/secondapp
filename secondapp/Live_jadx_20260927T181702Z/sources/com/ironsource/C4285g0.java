package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;

/* JADX INFO: renamed from: com.ironsource.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4285g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final IronSource.a f61835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final UUID f61836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final String f61837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    private C4298gd f61838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.m
    private final Hf f61839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    private final Double f61840f;

    /* JADX INFO: renamed from: com.ironsource.g0$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61841a;

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
            f61841a = iArr;
        }
    }

    public C4285g0(@oy.l IronSource.a adFormat, @oy.l UUID adId, @oy.l String adUnitId, @oy.m C4298gd c4298gd, @oy.m Hf hf2, @oy.m Double d10) {
        kotlin.jvm.internal.m0.p(adFormat, "adFormat");
        kotlin.jvm.internal.m0.p(adId, "adId");
        kotlin.jvm.internal.m0.p(adUnitId, "adUnitId");
        this.f61835a = adFormat;
        this.f61836b = adId;
        this.f61837c = adUnitId;
        this.f61838d = c4298gd;
        this.f61839e = hf2;
        this.f61840f = d10;
    }

    @oy.l
    public final IronSource.a a() {
        return this.f61835a;
    }

    @oy.l
    public final UUID b() {
        return this.f61836b;
    }

    @oy.l
    public final String c() {
        return this.f61837c;
    }

    @oy.m
    public final Double d() {
        return this.f61840f;
    }

    @oy.l
    public final LevelPlay.AdFormat e() {
        int i10 = a.f61841a[this.f61835a.ordinal()];
        if (i10 == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i10 == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i10 == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i10 == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new dr.o0();
    }

    @oy.m
    public final C4298gd f() {
        return this.f61838d;
    }

    @oy.m
    public final Hf g() {
        return this.f61839e;
    }

    public final void a(@oy.m C4298gd c4298gd) {
        this.f61838d = c4298gd;
    }

    public /* synthetic */ C4285g0(IronSource.a aVar, UUID uuid, String str, C4298gd c4298gd, Hf hf2, Double d10, int i10, kotlin.jvm.internal.x xVar) {
        this(aVar, uuid, str, (i10 & 8) != 0 ? null : c4298gd, (i10 & 16) != 0 ? null : hf2, (i10 & 32) != 0 ? null : d10);
    }
}
