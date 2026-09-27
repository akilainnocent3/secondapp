package com.startapp.sdk.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.startio.adsession.AdSession;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.b9;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.gk;
import com.startapp.sdk.internal.j2;
import com.startapp.sdk.internal.sd;
import com.startapp.sdk.internal.v6;
import com.startapp.sdk.internal.wf;
import com.startapp.sdk.internal.xf;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Keep
public class NativeAdDetails implements NativeAdInterface {
    private static final float DEFAULT_RATING = 5.0f;

    @Nullable
    private final AdDetails adDetails;
    private String adTag;
    private NativeAdDisplayListener displayListener;
    private Bitmap imgBitmap;

    @Nullable
    private sd omAdSession;
    private Bitmap secondaryImgBitmap;
    private gk viewabilityRunner;
    private boolean impressionSent = false;
    private boolean hiddenSent = false;

    @NonNull
    private WeakReference<View> nativeAdView = new WeakReference<>(null);

    @NonNull
    private final View.OnAttachStateChangeListener onAttachStateChangeListener = new h(this);

    @NonNull
    private final wf impressionListener = new b(this);

    @Keep
    public NativeAdDetails(@Nullable AdDetails adDetails) {
        this.adDetails = adDetails;
    }

    public static /* synthetic */ void a(Object[] objArr) {
        if (objArr[0] != null) {
            objArr[0] = null;
        }
        if (objArr[1] != null) {
            objArr[1] = null;
        }
    }

    private void associateWithImpression(@NonNull View view) {
        this.nativeAdView = new WeakReference<>(view);
        view.addOnAttachStateChangeListener(this.onAttachStateChangeListener);
        if (view.isAttachedToWindow()) {
            this.onAttachStateChangeListener.onViewAttachedToWindow(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishOmAdSession() {
        sd sdVar = this.omAdSession;
        if (sdVar != null) {
            AdSession adSession = sdVar.f75503a;
            if (adSession != null) {
                adSession.finish();
            }
            final Object[] objArr = {this.omAdSession, this.nativeAdView.get()};
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.startapp.sdk.ads.nativead.k
                @Override // java.lang.Runnable
                public final void run() {
                    NativeAdDetails.a(objArr);
                }
            }, MetaData.E().N());
            this.omAdSession = null;
        }
    }

    private long getImpressionDelayMillis() {
        AdDetails adDetails = getAdDetails();
        return (adDetails == null || adDetails.i() == null) ? TimeUnit.SECONDS.toMillis(MetaData.E().z()) : TimeUnit.SECONDS.toMillis(adDetails.i().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleClickOnView(View view) {
        sendClickImpl(view.getContext());
    }

    private void sendClickImpl(Context context) {
        int i10 = g.f74141a[getCampaignAction().ordinal()];
        if (i10 == 1) {
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
            boolean zA = g0.a(context);
            if (!this.adDetails.D() || zA) {
                g0.a(context, this.adDetails.h(), this.adDetails.y(), new TrackingParams(this.adTag), this.adDetails.E() && !zA, false);
            } else {
                g0.a(context, this.adDetails.h(), this.adDetails.y(), this.adDetails.s(), new TrackingParams(this.adTag), AdsCommonMetaData.k().y(), AdsCommonMetaData.k().x(), this.adDetails.E(), this.adDetails.F(), false, null);
            }
        } else if (i10 == 2) {
            g0.a(getPackageName(), this.adDetails.o(), this.adDetails.h(), context, new TrackingParams(this.adTag));
        }
        NativeAdDisplayListener nativeAdDisplayListener = this.displayListener;
        if (nativeAdDisplayListener != null) {
            nativeAdDisplayListener.adClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCheckingVisibility() {
        if (this.viewabilityRunner != null || this.impressionSent) {
            return;
        }
        View view = this.nativeAdView.get();
        if (view == null) {
            NativeAdDisplayListener nativeAdDisplayListener = this.displayListener;
            if (nativeAdDisplayListener != null) {
                nativeAdDisplayListener.adNotDisplayed(this);
                return;
            }
            return;
        }
        xf xfVar = new xf(view.getContext(), AdPreferences.Placement.INAPP_NATIVE, getAdDetails() != null ? getAdDetails().t() : null, new TrackingParams(this.adTag), getImpressionDelayMillis(), false, this.impressionListener);
        Context context = view.getContext();
        String[] strArrC = getAdDetails() != null ? getAdDetails().c() : null;
        TrackingParams trackingParams = new TrackingParams(this.adTag);
        if (context != null && strArrC != null) {
            b9.a(context, Arrays.asList(strArrC), trackingParams);
        }
        gk gkVar = new gk(this.nativeAdView, xfVar, BannerMetaData.c().a());
        this.viewabilityRunner = gkVar;
        gkVar.f74916c = new f(this);
        if (gkVar.c()) {
            gkVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startOmAdSession() {
        View view;
        AdDetails adDetails;
        List listB;
        if (!MetaData.E().j0() || (view = this.nativeAdView.get()) == null || (adDetails = this.adDetails) == null || (listB = adDetails.b()) == null) {
            return;
        }
        sd sdVar = new sd(view.getContext(), listB, false);
        this.omAdSession = sdVar;
        AdSession adSession = sdVar.f75503a;
        if (adSession != null) {
            adSession.start();
            AdSession adSession2 = this.omAdSession.f75503a;
            if (adSession2 != null) {
                adSession2.registerAdView(view);
            }
            sd sdVar2 = this.omAdSession;
            if (sdVar2.f75504b != null && sdVar2.f75507e.compareAndSet(false, true)) {
                sdVar2.f75504b.loaded();
            }
            this.omAdSession.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopCheckingVisibility() {
        gk gkVar = this.viewabilityRunner;
        if (gkVar != null) {
            gkVar.a();
            this.viewabilityRunner = null;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        unregisterView();
    }

    public AdDetails getAdDetails() {
        return this.adDetails;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @NonNull
    @Keep
    public String getCallToAction() {
        String strF;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (strF = adDetails.f()) == null) ? "" : strF;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Keep
    public StartAppNativeAd.CampaignAction getCampaignAction() {
        StartAppNativeAd.CampaignAction campaignAction = StartAppNativeAd.CampaignAction.OPEN_MARKET;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || !adDetails.C()) ? campaignAction : StartAppNativeAd.CampaignAction.LAUNCH_APP;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @NonNull
    @Keep
    public String getCategory() {
        String strG;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (strG = adDetails.g()) == null) ? "" : strG;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @NonNull
    @Keep
    public String getDescription() {
        String strJ;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (strJ = adDetails.j()) == null) ? "" : strJ;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Nullable
    @Keep
    public String getErid() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.k();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Nullable
    @Keep
    public String getEridUrl() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.l();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Keep
    public Bitmap getImageBitmap() {
        return this.imgBitmap;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Nullable
    @Keep
    public String getImageUrl() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.m();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @NonNull
    @Keep
    public String getInstalls() {
        String strN;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (strN = adDetails.n()) == null) ? "" : strN;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @NonNull
    @Keep
    public String getPackageName() {
        String strS;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (strS = adDetails.s()) == null) ? "" : strS;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Keep
    public float getRating() {
        AdDetails adDetails = this.adDetails;
        return adDetails != null ? adDetails.u() : DEFAULT_RATING;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Keep
    public Bitmap getSecondaryImageBitmap() {
        return this.secondaryImgBitmap;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Nullable
    @Keep
    public String getSecondaryImageUrl() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.v();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @NonNull
    @Keep
    public String getTitle() {
        String strX;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (strX = adDetails.x()) == null) ? "" : strX;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Keep
    public boolean isApp() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.B();
        }
        return true;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public boolean isBelowMinCPM() {
        AdDetails adDetails = this.adDetails;
        return adDetails != null && adDetails.q();
    }

    @Keep
    public void loadImages(@NonNull Context context, @NonNull Runnable runnable) {
        c cVar = new c(this, runnable);
        new j2(context, getImageUrl(), cVar, 0).a();
        new j2(context, getSecondaryImageUrl(), cVar, 1).a();
    }

    public void onImpressionSent(@Nullable String str) {
        this.impressionSent = true;
        v6.a("onShow", this.displayListener != null, str, null);
        NativeAdDisplayListener nativeAdDisplayListener = this.displayListener;
        if (nativeAdDisplayListener != null) {
            nativeAdDisplayListener.adDisplayed(this);
        }
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Keep
    public void registerViewForInteraction(@NonNull View view) {
        associateWithImpression(view);
        this.nativeAdView.get().setOnClickListener(new d(this));
    }

    public void setAdTag(String str) {
        this.adTag = str;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.imgBitmap = bitmap;
    }

    public void setSecondaryImageBitmap(Bitmap bitmap) {
        this.secondaryImgBitmap = bitmap;
    }

    @NonNull
    public String toString() {
        return super.toString();
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Keep
    public void unregisterView() {
        stopCheckingVisibility();
        finishOmAdSession();
        View view = this.nativeAdView.get();
        this.nativeAdView.clear();
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.onAttachStateChangeListener);
        }
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Keep
    public void registerViewForInteraction(@NonNull View view, @Nullable List<View> list) {
        registerViewForInteraction(view, list, null);
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    @Keep
    public void registerViewForInteraction(@NonNull View view, @Nullable List<View> list, @Nullable NativeAdDisplayListener nativeAdDisplayListener) {
        if (list != null && !list.isEmpty() && this.nativeAdView.get() == null) {
            e eVar = new e(this);
            Iterator<View> it = list.iterator();
            while (it.hasNext()) {
                it.next().setOnClickListener(eVar);
            }
            associateWithImpression(view);
        } else {
            registerViewForInteraction(view);
        }
        this.displayListener = nativeAdDisplayListener;
    }
}
