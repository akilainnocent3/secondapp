package com.unity3d.services.banners;

import android.content.Context;
import com.unity3d.services.core.misc.ViewUtilities;
import cs.o;
import is.d;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class UnityBannerSize {
    private final int height;
    private final int width;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final UnityBannerSize leaderboard = new UnityBannerSize(728, 90);

    @l
    private static final UnityBannerSize iabStandard = new UnityBannerSize(468, 60);

    @l
    private static final UnityBannerSize standard = new UnityBannerSize(320, 50);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        @o
        public final UnityBannerSize getDynamicSize(@l Context context) {
            m0.p(context, "context");
            int iL0 = d.L0(ViewUtilities.dpFromPx(context, context.getResources().getDisplayMetrics().widthPixels));
            if (iL0 >= getLeaderboard().getWidth()) {
                return getLeaderboard();
            }
            return iL0 >= getIabStandard().getWidth() ? getIabStandard() : getStandard();
        }

        @l
        public final UnityBannerSize getIabStandard() {
            return UnityBannerSize.iabStandard;
        }

        @l
        public final UnityBannerSize getLeaderboard() {
            return UnityBannerSize.leaderboard;
        }

        @l
        public final UnityBannerSize getStandard() {
            return UnityBannerSize.standard;
        }

        private Companion() {
        }
    }

    public UnityBannerSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    @l
    @o
    public static final UnityBannerSize getDynamicSize(@l Context context) {
        return Companion.getDynamicSize(context);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
