package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.f1;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.gk;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.pf;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.xf;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class BannerBase extends RelativeLayout {
    private static final int LOAD_BANNER = 1;
    private static final int LOAD_BANNER_DELAYED = 2;
    private static final String LOG_TAG = "BannerBase";
    private static final long MIN_REFRESH_INTERVAL_MILLIS = 10000;
    private static final long RELOAD_CHECK_INTERVAL_MILLIS = 2000;

    @NonNull
    protected final ib adCacheManager;

    @Nullable
    private AdPreferences adPreferences;
    protected AdRulesResult adRulesResult;
    private boolean attachedToWindow;
    private boolean clicked;

    @NonNull
    protected final ib consentManager;

    @Nullable
    protected Point desirableSizeForManualLoading;
    protected boolean drawn;

    @Nullable
    private String error;

    @NonNull
    protected final ib eventTracer;
    private boolean firstLoad;

    @NonNull
    private final Handler handler;

    @NonNull
    private final Object handlerLock;

    @NonNull
    protected final ib httpClient;
    private long loadedUptimeMillis;

    @NonNull
    protected final ib motionProcessor;

    @NonNull
    protected final ib networkApiExecutor;
    protected int offset;

    @NonNull
    protected final ib runtimeClassDetector;

    @NonNull
    private final Runnable scheduleReloadTask;
    private boolean shouldReloadBanner;

    @NonNull
    protected final ib showIntentionsKeeper;

    @NonNull
    protected final ib videoAdCacheManager;
    protected gk viewabilityRunner;

    @NonNull
    protected final ib webViewCacheLoader;

    @NonNull
    protected final ib webViewFactory;

    public BannerBase(Context context, AttributeSet attributeSet, int i10, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, ib ibVar10, ib ibVar11) {
        super(context, attributeSet, i10);
        this.attachedToWindow = false;
        this.offset = 0;
        this.firstLoad = true;
        this.drawn = false;
        this.clicked = false;
        this.shouldReloadBanner = false;
        this.scheduleReloadTask = new Runnable() { // from class: com.startapp.sdk.ads.banner.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f74075b.scheduleReloadTask();
            }
        };
        this.handler = new Handler(Looper.getMainLooper(), new a(this));
        this.handlerLock = new Object();
        this.eventTracer = ibVar;
        this.consentManager = ibVar2;
        this.adCacheManager = ibVar3;
        this.videoAdCacheManager = ibVar4;
        this.webViewFactory = ibVar5;
        this.httpClient = ibVar6;
        this.networkApiExecutor = ibVar7;
        this.motionProcessor = ibVar8;
        this.webViewCacheLoader = ibVar9;
        this.runtimeClassDetector = ibVar10;
        this.showIntentionsKeeper = ibVar11;
        setAdTag(new f1(context, attributeSet).f74781a);
        try {
            ((pf) ibVar10.a()).a(512);
        } catch (Throwable unused) {
        }
    }

    public void addDisplayEventOnLoad() {
        if (isFirstLoad() || AdaptMetaData.b().a().b()) {
            setFirstLoad(false);
            t.f75524d.a(new s(AdPreferences.Placement.INAPP_BANNER, getAdTag()));
        }
    }

    public void cancelDelayedLoading() {
        synchronized (this.handlerLock) {
            this.handler.removeMessages(2);
        }
    }

    public void cancelReloadTask() {
        if (isInEditMode()) {
            return;
        }
        removeCallbacks(this.scheduleReloadTask);
        cancelDelayedLoading();
    }

    @NonNull
    public Point getAdLoadingSize() {
        return new Point(getWidthInDp(), getHeightInDp());
    }

    @NonNull
    public AdPreferences getAdPreferences() {
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences != null) {
            return adPreferences;
        }
        AdPreferences adPreferences2 = new AdPreferences();
        this.adPreferences = adPreferences2;
        return adPreferences2;
    }

    @Nullable
    public String getAdTag() {
        return getAdPreferences().getAdTag();
    }

    public abstract String getBannerName();

    @Nullable
    public String getErrorMessage() {
        return this.error;
    }

    @Keep
    public abstract int getHeightInDp();

    public long getRefreshDelayMillis() {
        return 0L;
    }

    public abstract int getRefreshRate();

    public long getTimePassedSinceAdLoadedToViewMillis() {
        return SystemClock.uptimeMillis() - this.loadedUptimeMillis;
    }

    @Keep
    public abstract int getWidthInDp();

    public abstract void hideBanner();

    public void init() {
        if (!isInEditMode()) {
            initRuntime();
            return;
        }
        setMinimumWidth(ii.a(getContext(), getWidthInDp()));
        setMinimumHeight(ii.a(getContext(), getHeightInDp()));
        setBackgroundColor(Color.rgb(169, 169, 169));
        TextView textView = new TextView(getContext());
        textView.setText(getBannerName());
        textView.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(textView, layoutParams);
    }

    public abstract void initRuntime();

    public boolean isAdLoadedToView() {
        return this.loadedUptimeMillis > 0;
    }

    public boolean isClicked() {
        return this.clicked;
    }

    public boolean isFirstLoad() {
        return this.firstLoad;
    }

    public boolean isTiedToAdm() {
        return false;
    }

    public void load(@Nullable String str) {
        gk gkVar = this.viewabilityRunner;
        if (gkVar != null) {
            gkVar.a();
            this.viewabilityRunner = null;
        }
        if (this.adRulesResult != null && !AdaptMetaData.b().a().b()) {
            if (this.adRulesResult.b()) {
                reload(str);
            }
        } else {
            AdRulesResult adRulesResultA = AdaptMetaData.b().a().a(AdPreferences.Placement.INAPP_BANNER, getAdTag());
            this.adRulesResult = adRulesResultA;
            if (adRulesResultA.b()) {
                reload(str);
            } else {
                hideBanner();
            }
        }
    }

    public void loadAd(int i10, int i11) {
        loadAd(i10, i11, null);
    }

    public void loadBanner(@Nullable String str) {
        try {
            ((pf) this.runtimeClassDetector.a()).a(1024);
        } catch (Throwable unused) {
        }
        synchronized (this.handlerLock) {
            try {
                if (!this.handler.hasMessages(1)) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = str;
                    messageObtain.what = 1;
                    this.handler.sendMessage(messageObtain);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void loadBannerDelayed(long j10) {
        synchronized (this.handlerLock) {
            this.handler.removeMessages(2);
            this.handler.sendEmptyMessageDelayed(2, j10);
        }
    }

    public void loadBannerImpl(@Nullable String str) {
        scheduleReloadTask();
        load(str);
    }

    public void onAdLoadedToView() {
        getContext();
        WeakHashMap weakHashMap = si.f75514a;
        Log.println(2, "StartAppSDK", "Banner start rendering the ad content");
        this.loadedUptimeMillis = SystemClock.uptimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            ((pf) this.runtimeClassDetector.a()).a(4096);
        } catch (Throwable unused) {
        }
        this.attachedToWindow = true;
        scheduleReloadTask();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        cancelReloadTask();
        gk gkVar = this.viewabilityRunner;
        if (gkVar != null) {
            gkVar.a();
            this.viewabilityRunner = null;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.adRulesResult = (AdRulesResult) bundle.getSerializable("adRulesResult");
        this.adPreferences = (AdPreferences) bundle.getSerializable("adPreferences");
        this.offset = bundle.getInt("offset");
        this.firstLoad = bundle.getBoolean("firstLoad");
        this.shouldReloadBanner = bundle.getBoolean("shouldReloadBanner");
        super.onRestoreInstanceState(bundle.getParcelable("upperState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        if (isClicked()) {
            setClicked(false);
            this.shouldReloadBanner = true;
        }
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("upperState", parcelableOnSaveInstanceState);
        bundle.putSerializable("adRulesResult", this.adRulesResult);
        bundle.putSerializable("adPreferences", this.adPreferences);
        bundle.putInt("offset", this.offset);
        bundle.putBoolean("firstLoad", this.firstLoad);
        bundle.putBoolean("shouldReloadBanner", this.shouldReloadBanner);
        return bundle;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (!z10) {
            this.attachedToWindow = false;
            cancelReloadTask();
            return;
        }
        if (this.shouldReloadBanner) {
            this.shouldReloadBanner = false;
            load(null);
        }
        this.attachedToWindow = true;
        scheduleReloadTask();
    }

    @NonNull
    public AdPreferences prepareAdPreferences() {
        AdPreferences adPreferences = getAdPreferences();
        if (adPreferences.getPlacementId() == null) {
            adPreferences.setPlacementId(g0.a(this));
        }
        adPreferences.setHardwareAccelerated(p0.a(this, this.attachedToWindow));
        return adPreferences;
    }

    public abstract void reload(String str);

    public void scheduleReloadTask() {
        AdRulesResult adRulesResult;
        if (!isInEditMode() && CacheMetaData.d() && this.attachedToWindow && !isTiedToAdm()) {
            long jMax = Math.max(0L, getRefreshDelayMillis());
            long jMax2 = ((this.loadedUptimeMillis + Math.max(10000L, getRefreshRate())) - jMax) - SystemClock.uptimeMillis();
            if (jMax2 > 0) {
                removeCallbacks(this.scheduleReloadTask);
                if (jMax <= 0) {
                    jMax2 = Math.min(2000L, jMax2);
                }
                postDelayed(this.scheduleReloadTask, jMax2);
                return;
            }
            if (isShown() || ((adRulesResult = this.adRulesResult) != null && !adRulesResult.b())) {
                load(null);
            }
            loadBannerDelayed(((long) MetaData.E().M()) * 1000);
        }
    }

    public void setAdPreferences(@Nullable AdPreferences adPreferences) {
        this.adPreferences = adPreferences != null ? new AdPreferences(adPreferences) : null;
    }

    public void setAdTag(@Nullable String str) {
        getAdPreferences().setAdTag(str);
    }

    public void setClicked(boolean z10) {
        this.clicked = z10;
    }

    public void setErrorMessage(@Nullable String str) {
        this.error = str;
    }

    public void setFirstLoad(boolean z10) {
        this.firstLoad = z10;
    }

    public boolean shouldSendImpression(xf xfVar) {
        return xfVar != null && xfVar.f75836j.get() == 0;
    }

    public void startVisibilityRunnable(xf xfVar) {
        if (this.viewabilityRunner != null) {
            return;
        }
        gk gkVar = new gk(getViewableBanner(), getAdLoadingSize(), xfVar, BannerMetaData.c().a());
        this.viewabilityRunner = gkVar;
        if (gkVar.c()) {
            gkVar.run();
        }
    }

    public void loadAd(int i10, int i11, @Nullable String str) {
        if (i10 > getWidthInDp() && i11 > getHeightInDp()) {
            this.desirableSizeForManualLoading = new Point(i10, i11);
        }
        loadBanner(str);
    }

    @Keep
    public void loadAd() {
        loadBanner(null);
    }

    @Keep
    public void loadAd(@Nullable String str) {
        loadBanner(str);
    }

    @NonNull
    public View getViewableBanner() {
        return this;
    }
}
