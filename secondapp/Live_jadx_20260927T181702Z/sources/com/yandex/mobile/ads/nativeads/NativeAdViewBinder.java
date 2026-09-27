package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.C4235d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import dr.o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yads.hj;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class NativeAdViewBinder implements hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f76939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f76940b;

    public /* synthetic */ NativeAdViewBinder(View view, Map map, x xVar) {
        this(view, map);
    }

    @m
    public TextView getAgeView() {
        View view = getAssetViews().get("age");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Override // yads.hj
    @m
    public View getAssetView(@l String str) {
        return (View) getAssetViews().get(str);
    }

    @Override // yads.hj
    @l
    public Map<String, View> getAssetViews() {
        return this.f76940b;
    }

    @m
    public TextView getBodyView() {
        View view = getAssetViews().get("body");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @m
    public TextView getCallToActionView() {
        View view = getAssetViews().get("call_to_action");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @m
    public TextView getCloseButtonView() {
        View assetView = getAssetView("close_button");
        if (assetView instanceof TextView) {
            return (TextView) assetView;
        }
        return null;
    }

    @m
    public TextView getDomainView() {
        View view = getAssetViews().get(C4235d4.j.D);
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @m
    public ImageView getFaviconView() {
        View view = getAssetViews().get("favicon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @m
    public ImageView getFeedbackView() {
        View view = getAssetViews().get("feedback");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @m
    public ImageView getIconView() {
        View view = getAssetViews().get("icon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @l
    public final View getNativeAdView() {
        return this.f76939a;
    }

    @m
    public TextView getPriceView() {
        View view = getAssetViews().get("price");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @m
    public View getRatingView() {
        return getAssetViews().get(CampaignEx.JSON_KEY_STAR);
    }

    @m
    public TextView getReviewCountView() {
        View view = getAssetViews().get("review_count");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @m
    public TextView getSponsoredView() {
        View view = getAssetViews().get("sponsored");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @m
    public TextView getTitleView() {
        View view = getAssetViews().get("title");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @m
    public TextView getWarningView() {
        View view = getAssetViews().get("warning");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    private NativeAdViewBinder(View view, Map map) {
        this.f76939a = view;
        this.f76940b = map;
    }

    @m
    public MediaView getMediaView() {
        View view = getAssetViews().get("media");
        if (view instanceof MediaView) {
            return (MediaView) view;
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f76941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinkedHashMap f76942b;

        @o(message = "Use constructor with passing [NativeAdView] type")
        public Builder(@l View view) {
            this.f76941a = view;
            this.f76942b = new LinkedHashMap();
        }

        @l
        public final NativeAdViewBinder build() {
            return new NativeAdViewBinder(this.f76941a, this.f76942b, null);
        }

        @l
        public final Builder setAgeView(@m TextView textView) {
            this.f76942b.put("age", textView);
            return this;
        }

        @l
        public final Builder setBodyView(@m TextView textView) {
            this.f76942b.put("body", textView);
            return this;
        }

        @l
        public final Builder setCallToActionView(@m TextView textView) {
            this.f76942b.put("call_to_action", textView);
            return this;
        }

        @l
        public final Builder setDomainView(@m TextView textView) {
            this.f76942b.put(C4235d4.j.D, textView);
            return this;
        }

        @l
        public final Builder setFaviconView(@m ImageView imageView) {
            this.f76942b.put("favicon", imageView);
            return this;
        }

        @l
        public final Builder setFeedbackView(@m ImageView imageView) {
            this.f76942b.put("feedback", imageView);
            return this;
        }

        @l
        public final Builder setIconView(@m ImageView imageView) {
            this.f76942b.put("icon", imageView);
            return this;
        }

        @l
        public final Builder setMediaView(@m MediaView mediaView) {
            this.f76942b.put("media", mediaView);
            return this;
        }

        @l
        public final Builder setPriceView(@m TextView textView) {
            this.f76942b.put("price", textView);
            return this;
        }

        @l
        public final <T extends View & Rating> Builder setRatingView(@m T t10) {
            this.f76942b.put(CampaignEx.JSON_KEY_STAR, t10);
            return this;
        }

        @l
        public final Builder setReviewCountView(@m TextView textView) {
            this.f76942b.put("review_count", textView);
            return this;
        }

        @l
        public final Builder setSponsoredView(@m TextView textView) {
            this.f76942b.put("sponsored", textView);
            return this;
        }

        @l
        public final Builder setTitleView(@m TextView textView) {
            this.f76942b.put("title", textView);
            return this;
        }

        @l
        public final Builder setWarningView(@m TextView textView) {
            this.f76942b.put("warning", textView);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@l NativeAdView nativeAdView) {
            this((View) nativeAdView);
            m0.n(nativeAdView, "null cannot be cast to non-null type android.view.View");
        }
    }
}
