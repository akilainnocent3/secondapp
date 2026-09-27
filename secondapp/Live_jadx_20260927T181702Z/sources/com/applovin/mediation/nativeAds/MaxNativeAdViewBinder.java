package com.applovin.mediation.nativeAds;

import android.view.View;
import k.c0;
import k.h0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class MaxNativeAdViewBinder {

    @c0
    protected final int advertiserTextViewId;

    @c0
    protected final int bodyTextViewId;

    @c0
    protected final int callToActionButtonId;

    @c0
    protected final int iconContentViewId;

    @c0
    protected final int iconImageViewId;

    @h0
    protected final int layoutResourceId;
    protected final View mainView;

    @c0
    protected final int mediaContentFrameLayoutId;

    @c0
    protected final int mediaContentViewGroupId;

    @c0
    protected final int optionsContentFrameLayoutId;

    @c0
    protected final int optionsContentViewGroupId;

    @c0
    protected final int starRatingContentViewGroupId;
    protected final String templateType;

    @c0
    protected final int titleTextViewId;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f30297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f30298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f30299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f30300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f30301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f30302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f30303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f30304h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f30305i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f30306j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f30307k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f30308l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f30309m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f30310n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f30297a, this.f30298b, this.f30299c, this.f30300d, this.f30301e, this.f30302f, this.f30303g, this.f30306j, this.f30304h, this.f30305i, this.f30307k, this.f30308l, this.f30309m, this.f30310n);
        }

        public Builder setAdvertiserTextViewId(@c0 int i10) {
            this.f30300d = i10;
            return this;
        }

        public Builder setBodyTextViewId(@c0 int i10) {
            this.f30301e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(@c0 int i10) {
            this.f30309m = i10;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(@c0 int i10) {
            this.f30303g = i10;
            return this;
        }

        public Builder setIconImageViewId(@c0 int i10) {
            this.f30302f = i10;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(@c0 int i10) {
            this.f30308l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(@c0 int i10) {
            this.f30307k = i10;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(@c0 int i10) {
            this.f30305i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(@c0 int i10) {
            this.f30304h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(@c0 int i10) {
            this.f30306j = i10;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f30310n = str;
            return this;
        }

        public Builder setTitleTextViewId(@c0 int i10) {
            this.f30299c = i10;
            return this;
        }

        public Builder(@h0 int i10) {
            this(i10, null);
        }

        private Builder(int i10, View view) {
            this.f30299c = -1;
            this.f30300d = -1;
            this.f30301e = -1;
            this.f30302f = -1;
            this.f30303g = -1;
            this.f30304h = -1;
            this.f30305i = -1;
            this.f30306j = -1;
            this.f30307k = -1;
            this.f30308l = -1;
            this.f30309m = -1;
            this.f30298b = i10;
            this.f30297a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
