package yads;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.C4235d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class np1 implements MediatedNativeAdViewProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f153114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y12 f153115b;

    public np1(View view, y12 y12Var) {
        this.f153114a = view;
        this.f153115b = y12Var;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getAgeView() {
        View viewA = this.f153115b.a("age");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getBodyView() {
        View viewA = this.f153115b.a("body");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getCallToActionView() {
        View viewA = this.f153115b.a("call_to_action");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getDomainView() {
        View viewA = this.f153115b.a(C4235d4.j.D);
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final ImageView getFeedbackView() {
        View viewA = this.f153115b.a("feedback");
        if (viewA instanceof ImageView) {
            return (ImageView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final ImageView getIconView() {
        View viewA = this.f153115b.a("icon");
        if (viewA instanceof ImageView) {
            return (ImageView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final FrameLayout getMediaView() {
        View viewA = this.f153115b.a("media");
        if (viewA instanceof CustomizableMediaView) {
            return (CustomizableMediaView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final View getNativeAdView() {
        return this.f153114a;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getPriceView() {
        View viewA = this.f153115b.a("price");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final View getRatingView() {
        return this.f153115b.a(CampaignEx.JSON_KEY_STAR);
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getReviewCountView() {
        View viewA = this.f153115b.a("review_count");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getSponsoredView() {
        View viewA = this.f153115b.a("sponsored");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getTitleView() {
        View viewA = this.f153115b.a("title");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }

    @Override // com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
    public final TextView getWarningView() {
        View viewA = this.f153115b.a("warning");
        if (viewA instanceof TextView) {
            return (TextView) viewA;
        }
        return null;
    }
}
