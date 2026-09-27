package com.inmobi.media.ads.nativeAd;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class InMobiNativeViewData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f55962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f55963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f55964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f55965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f55966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f55967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f55968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f55969h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f55970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f55971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public View f55972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f55973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f55974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f55975f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f55976g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ArrayList f55977h;

        public Builder(@l ViewGroup parentView) {
            m0.p(parentView, "parentView");
            this.f55970a = parentView;
            this.f55977h = new ArrayList();
        }

        @l
        public final InMobiNativeViewData build() {
            return new InMobiNativeViewData(this.f55970a, this.f55971b, this.f55972c, this.f55973d, this.f55974e, this.f55975f, this.f55976g, this.f55977h, null);
        }

        @l
        public final Builder setAdvertiserView(@m View view) {
            this.f55976g = view;
            return this;
        }

        @l
        public final Builder setCTAView(@m View view) {
            this.f55974e = view;
            return this;
        }

        @l
        public final Builder setDescriptionView(@m View view) {
            this.f55972c = view;
            return this;
        }

        @l
        public final Builder setExtraViews(@l List<? extends View> extraViews) {
            m0.p(extraViews, "extraViews");
            this.f55977h.addAll(extraViews);
            return this;
        }

        @l
        public final Builder setIconView(@m ImageView imageView) {
            this.f55973d = imageView;
            return this;
        }

        @l
        public final Builder setRatingView(@m View view) {
            this.f55975f = view;
            return this;
        }

        @l
        public final Builder setTitleView(@m View view) {
            this.f55971b = view;
            return this;
        }
    }

    public InMobiNativeViewData(ViewGroup viewGroup, View view, View view2, ImageView imageView, View view3, View view4, View view5, List list, x xVar) {
        this.f55962a = viewGroup;
        this.f55963b = view;
        this.f55964c = view2;
        this.f55965d = imageView;
        this.f55966e = view3;
        this.f55967f = view4;
        this.f55968g = view5;
        this.f55969h = list;
    }

    @m
    public final View getAdvertiserView$media_release() {
        return this.f55968g;
    }

    @m
    public final View getCtaView$media_release() {
        return this.f55966e;
    }

    @m
    public final View getDescriptionView$media_release() {
        return this.f55964c;
    }

    @l
    public final List<View> getExtraViews$media_release() {
        return this.f55969h;
    }

    @m
    public final ImageView getIconView$media_release() {
        return this.f55965d;
    }

    @l
    public final ViewGroup getParentView$media_release() {
        return this.f55962a;
    }

    @m
    public final View getRatingView$media_release() {
        return this.f55967f;
    }

    @m
    public final View getTitleView$media_release() {
        return this.f55963b;
    }
}
