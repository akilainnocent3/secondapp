package com.monetization.ads.mediation.nativeads;

import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class MediatedNativeAdMedia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f71930a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f71931a;

        public Builder(float f10) {
            this.f71931a = f10;
        }

        @l
        public final MediatedNativeAdMedia build() {
            return new MediatedNativeAdMedia(this.f71931a, null);
        }

        public final float getAspectRatio() {
            return this.f71931a;
        }
    }

    public /* synthetic */ MediatedNativeAdMedia(float f10, x xVar) {
        this(f10);
    }

    public final float getAspectRatio() {
        return this.f71930a;
    }

    private MediatedNativeAdMedia(float f10) {
        this.f71930a = f10;
    }
}
