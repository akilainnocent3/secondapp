package com.monetization.ads.mediation.nativeads;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class MediatedNativeAdImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f71922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f71923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f71924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Drawable f71925d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f71926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f71927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f71928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Drawable f71929d;

        public Builder(@l String str) {
            this.f71926a = str;
        }

        @l
        public final MediatedNativeAdImage build() {
            return new MediatedNativeAdImage(this.f71927b, this.f71928c, this.f71926a, this.f71929d, null);
        }

        @l
        public final String getUrl() {
            return this.f71926a;
        }

        @l
        public final Builder setDrawable(@m Drawable drawable) {
            this.f71929d = drawable;
            return this;
        }

        @l
        public final Builder setHeight(int i10) {
            this.f71928c = i10;
            return this;
        }

        @l
        public final Builder setWidth(int i10) {
            this.f71927b = i10;
            return this;
        }
    }

    public /* synthetic */ MediatedNativeAdImage(int i10, int i11, String str, Drawable drawable, x xVar) {
        this(i10, i11, str, drawable);
    }

    @m
    public final Drawable getDrawable() {
        return this.f71925d;
    }

    public final int getHeight() {
        return this.f71923b;
    }

    @l
    public final String getUrl() {
        return this.f71924c;
    }

    public final int getWidth() {
        return this.f71922a;
    }

    private MediatedNativeAdImage(int i10, int i11, String str, Drawable drawable) {
        this.f71922a = i10;
        this.f71923b = i11;
        this.f71924c = str;
        this.f71925d = drawable;
    }
}
