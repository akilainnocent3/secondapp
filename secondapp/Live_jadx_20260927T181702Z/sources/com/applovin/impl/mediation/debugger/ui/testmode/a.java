package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.g3;
import com.applovin.impl.p3;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w;
import com.applovin.impl.x;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.ironsource.Mf;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends p3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g3 f27831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f27832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MaxAdView f27833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MaxAdView f27834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f27835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f27836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxRewardedAd f27837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxAd f27838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdLoader f27839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f27840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f27841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AdControlButton f27842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AdControlButton f27843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AdControlButton f27844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AdControlButton f27845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f27846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AdControlButton f27847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Button f27848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Button f27849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FrameLayout f27850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FrameLayout f27851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Switch f27852v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Switch f27853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map f27854x;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0268a extends MaxNativeAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f27855a;

        public C0268a(MaxNativeAdView maxNativeAdView) {
            this.f27855a = maxNativeAdView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f27838h != null) {
                a.this.f27839i.destroy(a.this.f27838h);
            }
            a.this.f27838h = maxAd;
            a.this.f27839i.render(this.f27855a, maxAd);
            a.this.f27851u.removeAllViews();
            a.this.f27851u.addView(this.f27855a);
            a.this.onAdLoaded(maxAd);
        }
    }

    private void e() {
        List listR = this.f27831a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f27831a.m();
        this.f27841k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f27832b.A0(), this);
        this.f27837g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.f27837g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f27846p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f27846p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.p3
    public l getSdk() {
        return this.f27832b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f27831a.x() == null || !this.f27831a.x().containsKey(maxAdFormat)) ? this.f27831a.m() : (String) this.f27831a.x().get(maxAdFormat);
    }

    public void initialize(g3 g3Var) {
        this.f27831a = g3Var;
        this.f27832b = g3Var.o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        q7.a(Mf.f59495f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        q7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        q7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
        q7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        q7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
        q7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        q7.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(AdControlButton.b.LOAD);
        } else {
            adControlButtonA.setControlState(AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f27833c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f27834d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f27835e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f27836f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f27837g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f27839i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        q7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map map = this.f27854x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((w) this.f27854x.get(format)).a();
        }
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f27831a == null) {
            p.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f27831a.g() + " Test Ads");
        this.f27840j = this.f27832b.u0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f27848r = (Button) findViewById(R.id.show_mrec_button);
        this.f27849s = (Button) findViewById(R.id.show_native_button);
        if (this.f27831a.I() && this.f27831a.r().contains(MaxAdFormat.MREC)) {
            this.f27851u.setVisibility(8);
            this.f27848r.setBackgroundColor(-1);
            this.f27849s.setBackgroundColor(-3355444);
            this.f27848r.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f27857b.a(view);
                }
            });
            this.f27849s.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f27858b.b(view);
                }
            });
        } else {
            this.f27848r.setVisibility(8);
            this.f27849s.setVisibility(8);
        }
        this.f27852v = (Switch) findViewById(R.id.native_banner_switch);
        this.f27853w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f27831a.J()) {
            this.f27852v.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f27859b.c(view);
                }
            });
            this.f27853w.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f27860b.d(view);
                }
            });
        } else {
            this.f27852v.setVisibility(8);
            this.f27853w.setVisibility(8);
        }
        if (!StringUtils.isValidString(this.f27831a.e()) || this.f27831a.d() == null || this.f27831a.d().size() <= 0) {
            return;
        }
        AdRegistration.getInstance(this.f27831a.e(), this);
        AdRegistration.enableTesting(true);
        AdRegistration.enableLogging(true);
        HashMap map = new HashMap(this.f27831a.d().size());
        for (MaxAdFormat maxAdFormat : this.f27831a.d().keySet()) {
            map.put(maxAdFormat, new w((x) this.f27831a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
        }
        this.f27854x = map;
    }

    @Override // com.applovin.impl.p3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f27832b.u0().a(this.f27840j);
        MaxAdView maxAdView = this.f27833c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f27834d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f27835e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f27837g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f27839i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f27838h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f27839i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        q7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f27834d.removeAllViews();
        this.f27843m.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f27851u.setVisibility(0);
        this.f27850t.setVisibility(8);
        this.f27849s.setBackgroundColor(-1);
        this.f27848r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f27833c.removeAllViews();
        this.f27842l.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f27850t.setVisibility(0);
        this.f27851u.setVisibility(8);
        this.f27848r.setBackgroundColor(-1);
        this.f27849s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f27851u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f27831a.I()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.f27839i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f27839i.setNativeAdListener(new C0268a(maxNativeAdView));
            this.f27839i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f27847q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f27847q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f27851u.setVisibility(8);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f27834d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f27835e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f27836f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f27837g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f27839i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f27833c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.f27850t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List listR = this.f27831a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (listR.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f27832b.A0(), this);
            this.f27834d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f27834d.setExtraParameter("disable_precache", "true");
            this.f27834d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f27834d.stopAutoRefresh();
            this.f27834d.setListener(this);
            this.f27850t.addView(this.f27834d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f27843m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f27843m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f27850t.setVisibility(8);
    }

    private void b() {
        List listR = this.f27831a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (listR.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f27832b.A0(), this);
            this.f27835e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f27835e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f27844n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f27844n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f27831a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f27832b.A0(), this);
            this.f27833c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f27833c.setExtraParameter("disable_auto_retries", "true");
            this.f27833c.setExtraParameter("disable_precache", "true");
            this.f27833c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f27833c.stopAutoRefresh();
            this.f27833c.setListener(this);
            frameLayout.addView(this.f27833c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f27842l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f27842l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        p.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f27831a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f27835e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f27836f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f27837g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        p.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f27831a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z10 = false;
        boolean z11 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f27852v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.f27853w.isChecked()) {
            z10 = true;
        }
        if (!z11 && !z10) {
            this.f27832b.u0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f27832b.u0().a(this.f27831a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f27833c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f27834d.loadAd();
            this.f27848r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f27835e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f27836f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f27837g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f27839i.loadAd();
            this.f27849s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f27843m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f27844n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f27845o;
            }
            if (str.equals(this.f27841k)) {
                return this.f27846p;
            }
            if (str.equals("test_mode_native")) {
                return this.f27847q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
        }
        return this.f27842l;
    }
}
