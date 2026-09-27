package com.unity3d.ads;

import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@UnityAdsExperimental
public final class BannerSize {
    private final int height;
    private final int width;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final BannerSize leaderboard = new BannerSize(728, 90);

    @l
    private static final BannerSize iabStandard = new BannerSize(468, 60);

    @l
    private static final BannerSize standard = new BannerSize(320, 50);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        public final BannerSize getIabStandard() {
            return BannerSize.iabStandard;
        }

        @l
        public final BannerSize getLeaderboard() {
            return BannerSize.leaderboard;
        }

        @l
        public final BannerSize getStandard() {
            return BannerSize.standard;
        }

        private Companion() {
        }
    }

    public BannerSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
