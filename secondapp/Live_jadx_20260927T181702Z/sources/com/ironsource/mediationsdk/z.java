package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C4214c1;
import com.ironsource.C4306h3;
import com.ironsource.C4379l5;
import com.ironsource.C4384la;
import com.ironsource.C4485r4;
import com.ironsource.C4513sf;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.InterfaceC4494rd;
import com.ironsource.InterfaceC4620z3;
import com.ironsource.J9;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class z extends A implements BannerSmashListener, C4513sf.a, InterfaceC4620z3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f63025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4513sf f63026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f63027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC4494rd f63028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f63029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f63030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private JSONObject f63031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f63032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f63033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C4306h3 f63034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f63035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C4379l5 f63036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f63037t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f63038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private JSONObject f63039v;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    public z(k kVar, InterfaceC4494rd interfaceC4494rd, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, boolean z10) {
        this(kVar, interfaceC4494rd, networkSettings, abstractAdapter, i10, "", null, 0, "", z10);
    }

    private void A() {
        IronLog.INTERNAL.verbose();
        a(a.INIT_IN_PROGRESS);
        F();
        try {
            if (this.f62373a != null) {
                if (p()) {
                    this.f62373a.initBannerForBidding(this.f63025h.a(), this.f63025h.i(), this.f62376d, this);
                } else {
                    this.f62373a.initBanners(this.f63025h.a(), this.f63025h.i(), this.f62376d, this);
                }
            }
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to init banner from " + this.f62373a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(612, th2.getLocalizedMessage()));
            a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    private boolean B() {
        boolean z10;
        synchronized (this.f63035r) {
            z10 = this.f63027j == a.DESTROYED;
        }
        return z10;
    }

    private boolean C() {
        boolean z10;
        synchronized (this.f63035r) {
            z10 = this.f63027j == a.LOADED;
        }
        return z10;
    }

    private void F() {
        if (this.f62373a == null) {
            return;
        }
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f62373a.setPluginData(pluginType);
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to set custom params from " + this.f62373a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_internal)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    private boolean b(D5 d10) {
        return d10 == D5.BN_INSTANCE_LOAD_SUCCESS || d10 == D5.BN_INSTANCE_LOAD || d10 == D5.BN_INSTANCE_RELOAD || d10 == D5.BN_INSTANCE_RELOAD_SUCCESS || d10 == D5.BN_INSTANCE_CLICK || d10 == D5.BN_INSTANCE_DESTROY || d10 == D5.BN_INSTANCE_LOAD_ERROR || d10 == D5.BN_INSTANCE_LOAD_NO_FILL || d10 == D5.BN_INSTANCE_RELOAD_NO_FILL || d10 == D5.BN_INSTANCE_PRESENT_SCREEN || d10 == D5.BN_INSTANCE_DISMISS_SCREEN || d10 == D5.BN_INSTANCE_LEAVE_APP || d10 == D5.BN_INSTANCE_SHOW;
    }

    private void u() {
        IronLog.INTERNAL.verbose("isBidder = " + p() + ", shouldEarlyInit = " + s());
        this.f63038u = true;
        A();
    }

    public void D() {
        this.f62373a.onBannerViewBound(this.f62374b.h().getBannerSettings());
    }

    public void E() {
        this.f62373a.onBannerViewWillBind(this.f62374b.h().getBannerSettings());
    }

    public void a(q qVar, C4306h3 c4306h3, String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        this.f63034q = c4306h3;
        this.f63039v = jSONObject;
        if (!l.c(qVar)) {
            String str2 = qVar == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            this.f63028k.a(new IronSourceError(610, str2), this, false);
            return;
        }
        if (this.f62373a == null) {
            ironLog.verbose("mAdapter is null");
            this.f63028k.a(new IronSourceError(611, "mAdapter is null"), this, false);
            return;
        }
        this.f63029l = qVar;
        this.f63026i.a((C4513sf.a) this);
        try {
            if (p()) {
                a(str, this.f63039v);
            } else {
                A();
            }
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            IronLog.INTERNAL.error("exception = " + th2.getLocalizedMessage());
            onBannerAdLoadFailed(new IronSourceError(605, th2.getLocalizedMessage()));
        }
    }

    @Override // com.ironsource.InterfaceC4620z3
    public void collectBiddingData(AdData adData, @oy.l Context context, @oy.l BiddingDataCallback biddingDataCallback) {
        a(D5.BN_INSTANCE_COLLECT_TOKEN);
        try {
            this.f62373a.collectBannerBiddingData(this.f62376d, adData != null ? C4384la.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to collectBannerBiddingData from " + this.f62373a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.A
    public IronSource.a d() {
        return IronSource.a.BANNER;
    }

    @Override // com.ironsource.mediationsdk.A
    public String k() {
        return "ProgBannerSmash";
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdClicked(Map map) {
        en.a.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLeftApplication(Map map) {
        en.a.b(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoadFailed(IronSourceError ironSourceError, Map map) {
        en.a.c(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams, Map map) {
        en.a.d(this, view, layoutParams, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenDismissed(Map map) {
        en.a.e(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenPresented(Map map) {
        en.a.f(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdShown(Map map) {
        en.a.g(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitFailed(IronSourceError ironSourceError, Map map) {
        en.a.h(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitSuccess(Map map) {
        en.a.i(this, map);
    }

    @Override // com.ironsource.mediationsdk.A
    public void q() {
        this.f63026i.d();
        super.q();
    }

    public void t() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a(D5.BN_INSTANCE_DESTROY);
        a(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f62373a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f62374b.h().getBannerSettings());
        } catch (Throwable th2) {
            C4485r4.d().a(th2);
            IronLog.INTERNAL.error("Exception while trying to destroy banner from " + this.f62373a.getProviderName() + ", exception =  " + th2.getLocalizedMessage());
            a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", th2.getLocalizedMessage()}});
        }
    }

    public String v() {
        return !TextUtils.isEmpty(this.f62374b.h().getAdSourceNameForEvents()) ? this.f62374b.h().getAdSourceNameForEvents() : i();
    }

    public AbstractAdapter w() {
        return this.f62373a;
    }

    public String x() {
        return this.f63030m;
    }

    public String y() {
        return String.format("%s - ", f());
    }

    public String z() {
        return this.f62374b.i();
    }

    public z(k kVar, InterfaceC4494rd interfaceC4494rd, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2, boolean z10) {
        super(new C4214c1(networkSettings, networkSettings.getBannerSettings(), IronSource.a.BANNER), abstractAdapter);
        this.f63035r = new Object();
        this.f63027j = a.NONE;
        this.f63025h = kVar;
        this.f63026i = new C4513sf(kVar.e());
        this.f63028k = interfaceC4494rd;
        this.f62378f = i10;
        this.f63030m = str;
        this.f63032o = i11;
        this.f63033p = str2;
        this.f63031n = jSONObject;
        this.f63037t = z10;
        this.f63039v = null;
        if (r()) {
            u();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_CLICK);
        InterfaceC4494rd interfaceC4494rd = this.f63028k;
        if (interfaceC4494rd != null) {
            interfaceC4494rd.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_LEAVE_APP);
        InterfaceC4494rd interfaceC4494rd = this.f63028k;
        if (interfaceC4494rd != null) {
            interfaceC4494rd.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose(y() + "error = " + ironSourceError);
        this.f63026i.e();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(f());
        this.f63026i.e();
        if (!a(a.LOADING, a.LOADED)) {
            a(this.f63037t ? D5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : D5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS);
            return;
        }
        a(this.f63037t ? D5.BN_INSTANCE_RELOAD_SUCCESS : D5.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C4379l5.a(this.f63036s))}});
        InterfaceC4494rd interfaceC4494rd = this.f63028k;
        if (interfaceC4494rd != null) {
            interfaceC4494rd.a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_DISMISS_SCREEN);
        InterfaceC4494rd interfaceC4494rd = this.f63028k;
        if (interfaceC4494rd != null) {
            interfaceC4494rd.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(f());
        a(D5.BN_INSTANCE_PRESENT_SCREEN);
        InterfaceC4494rd interfaceC4494rd = this.f63028k;
        if (interfaceC4494rd != null) {
            interfaceC4494rd.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (C()) {
            a(D5.BN_INSTANCE_SHOW);
            InterfaceC4494rd interfaceC4494rd = this.f63028k;
            if (interfaceC4494rd != null) {
                interfaceC4494rd.a(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f63027j);
        a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{"errorCode", 1}, new Object[]{"reason", "Wrong State - " + this.f63027j}, new Object[]{IronSourceConstants.EVENTS_EXT1, c()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.f63026i.e();
        if (a(a.INIT_IN_PROGRESS, a.NONE)) {
            InterfaceC4494rd interfaceC4494rd = this.f63028k;
            if (interfaceC4494rd != null) {
                interfaceC4494rd.a(ironSourceError, this, false);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f63027j);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(f());
        if (a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD)) {
            if (this.f63038u) {
                this.f63038u = false;
            } else {
                if (p()) {
                    return;
                }
                if (l.c(this.f63029l)) {
                    a((String) null, this.f63039v);
                } else {
                    this.f63028k.a(new IronSourceError(605, this.f63029l == null ? "banner is null" : "banner is destroyed"), this, false);
                }
            }
        }
    }

    private void a(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        if (a(a.READY_TO_LOAD, a.LOADING)) {
            this.f63036s = new C4379l5();
            a(this.f63037t ? D5.BN_INSTANCE_RELOAD : D5.BN_INSTANCE_LOAD);
            if (this.f62373a != null) {
                try {
                    try {
                        if (p()) {
                            this.f62373a.loadBannerForBidding(this.f62376d, this.f63039v, str, this.f63029l.getSize(), this);
                            return;
                        } else {
                            this.f62373a.loadBanner(this.f62376d, this.f63039v, this.f63029l.getSize(), this);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                Throwable th4 = th;
                C4485r4.d().a(th4);
                IronLog.INTERNAL.error("Exception while trying to load banner from " + this.f62373a.getProviderName() + ", exception =  " + th4.getLocalizedMessage());
                onBannerAdLoadFailed(new IronSourceError(605, th4.getLocalizedMessage()));
                a(D5.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{"errorCode", Integer.valueOf(IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th4.getLocalizedMessage()}});
                return;
            }
            return;
        }
        ironLog.error("wrong state - state = " + this.f63027j);
    }

    private boolean a(a aVar, a aVar2) {
        boolean z10;
        synchronized (this.f63035r) {
            try {
                if (this.f63027j == aVar) {
                    IronLog.INTERNAL.verbose(y() + "set state from '" + this.f63027j + "' to '" + aVar2 + "'");
                    this.f63027j = aVar2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    private void a(a aVar) {
        IronLog.INTERNAL.verbose(y() + "state = " + aVar.name());
        synchronized (this.f63035r) {
            this.f63027j = aVar;
        }
    }

    @Override // com.ironsource.C4513sf.a
    public void a() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(f());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(607, "Timed out");
        } else if (a(a.LOADING, aVar2)) {
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        } else {
            ironLog.error("unexpected state - " + this.f63027j);
            return;
        }
        a(ironSourceError);
    }

    private void a(IronSourceError ironSourceError) {
        boolean z10 = ironSourceError.getErrorCode() == 606;
        if (z10) {
            a(this.f63037t ? D5.BN_INSTANCE_RELOAD_NO_FILL : D5.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(C4379l5.a(this.f63036s))}});
        } else {
            a(this.f63037t ? D5.BN_INSTANCE_RELOAD_ERROR : D5.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{"errorCode", Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C4379l5.a(this.f63036s))}});
        }
        InterfaceC4494rd interfaceC4494rd = this.f63028k;
        if (interfaceC4494rd != null) {
            interfaceC4494rd.a(ironSourceError, this, z10);
        }
    }

    public void a(D5 d10) {
        a(d10, (Object[][]) null);
    }

    public void a(D5 d10, Object[][] objArr) {
        Map<String, Object> mapM = m();
        if (B()) {
            mapM.put("reason", "banner is destroyed");
        } else {
            q qVar = this.f63029l;
            if (qVar != null) {
                l.a(mapM, qVar.getSize());
            }
        }
        if (!TextUtils.isEmpty(this.f63030m)) {
            mapM.put("auctionId", this.f63030m);
        }
        JSONObject jSONObject = this.f63031n;
        if (jSONObject != null && jSONObject.length() > 0) {
            mapM.put("genericParams", this.f63031n);
        }
        C4306h3 c4306h3 = this.f63034q;
        if (c4306h3 != null) {
            mapM.put("placement", c4306h3.c());
        }
        if (b(d10)) {
            J9.i().a(mapM, this.f63032o, this.f63033p);
        }
        mapM.put("sessionDepth", Integer.valueOf(this.f62378f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mapM.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                IronLog.INTERNAL.error(c() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e10));
            }
        }
        J9.i().a(new C5(d10, new JSONObject(mapM)));
    }
}
