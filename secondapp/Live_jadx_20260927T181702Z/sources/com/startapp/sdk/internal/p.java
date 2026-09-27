package com.startapp.sdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.cache.ACMConfig;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f75336a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f75337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f75339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f75340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f75341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ib f75342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ib f75343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ib f75344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ib f75345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ib f75346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ib f75347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ib f75348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ib f75349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ib f75350o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ib f75351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ib f75352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ib f75353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ib f75354s;

    public p(Context context, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, ib ibVar10, ib ibVar11, ib ibVar12, ib ibVar13) {
        new WeakHashMap();
        this.f75339d = new ConcurrentLinkedQueue();
        this.f75341f = context;
        this.f75343h = ibVar;
        this.f75344i = ibVar2;
        this.f75342g = ibVar3;
        this.f75345j = ibVar4;
        this.f75346k = ibVar5;
        this.f75347l = ibVar6;
        this.f75348m = ibVar7;
        this.f75349n = ibVar8;
        this.f75350o = ibVar9;
        this.f75351p = ibVar10;
        this.f75352q = ibVar11;
        this.f75353r = ibVar12;
        this.f75354s = ibVar13;
    }

    public final /* synthetic */ p a() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final com.startapp.sdk.adsbase.f b(CacheKey cacheKey) {
        w2 w2Var;
        ?? r10;
        if (cacheKey == null || (w2Var = (w2) this.f75336a.get(cacheKey)) == null || (r10 = w2Var.f75759o) == 0 || !r10.isReady()) {
            return null;
        }
        ?? r11 = w2Var.f75759o;
        w2Var.f75767w = 0;
        w2Var.f75769y = null;
        if (!h0.f74931f.booleanValue() && w2Var.f75768x && CacheMetaData.d() && MetaData.E().f0()) {
            w2Var.a(null, null, true, true, null);
            return r11;
        }
        if (!w2Var.f75768x) {
            m mVar = w2Var.f75770z;
            if (mVar != null) {
                mVar.a(w2Var);
            }
            q2 q2Var = w2Var.f75764t;
            if (q2Var != null) {
                q2Var.e();
            }
        }
        return r11;
    }

    public final void a(AdPreferences.Placement placement) {
        try {
            String str = "90db0b5573c3d1f6_" + p0.a(this.f75341f) + '_' + placement.getIndex();
            ((SharedPreferences) this.f75343h.a()).edit().putLong(str, Math.max(((SharedPreferences) this.f75343h.a()).getLong(str, 0L), 0L) + 1).apply();
            ACMConfig aCMConfigA = CacheMetaData.b().a();
            ComponentInfoEventConfig componentInfoEventConfigD = aCMConfigA != null ? aCMConfigA.d() : null;
            if (componentInfoEventConfigD == null || !componentInfoEventConfigD.a(1)) {
                return;
            }
            d9 d9Var = new d9(e9.f74722e);
            d9Var.f74675d = "ACM.opf";
            d9Var.f74676e = String.valueOf(placement.getIndex());
            d9Var.a();
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }

    public final CacheKey a(StartAppAd startAppAd, StartAppAd.AdMode adMode, AdPreferences adPreferences, com.startapp.sdk.adsbase.k kVar, String str) {
        AdPreferences.Placement placement;
        String str2;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        switch (n.f75222a[adMode.ordinal()]) {
            case 1:
                WeakHashMap weakHashMap = si.f75514a;
                placement = AdPreferences.Placement.INAPP_OFFER_WALL;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                placement = AdPreferences.Placement.INAPP_OVERLAY;
                break;
            case 6:
                WeakHashMap weakHashMap2 = si.f75514a;
                int i10 = AdsCommonMetaData.k().i();
                ib ibVar = si.f75517d;
                if (((Random) ibVar.a()).nextInt(100) < i10) {
                    if ((((Random) ibVar.a()).nextInt(100) < AdsCommonMetaData.k().j() || adPreferences2.isForceFullpage()) && !adPreferences2.isForceOverlay()) {
                        placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                    } else {
                        placement = AdPreferences.Placement.INAPP_OVERLAY;
                    }
                } else {
                    placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                }
                break;
            default:
                placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                break;
        }
        AdPreferences.Placement placement2 = placement;
        try {
            long jMax = Math.max(((SharedPreferences) this.f75343h.a()).getLong("90db0b5573c3d1f6_" + p0.a(this.f75341f) + '_' + placement2.getIndex(), 0L), 0L);
            ACMConfig aCMConfigA = CacheMetaData.b().a();
            Map mapF = aCMConfigA != null ? aCMConfigA.f() : null;
            Integer num = mapF != null ? (Integer) mapF.get(Integer.valueOf(placement2.getIndex())) : null;
            int iIntValue = num != null ? num.intValue() : 0;
            str2 = (iIntValue <= 0 || jMax < ((long) iIntValue)) ? null : "Failures threshold reached";
        } catch (Throwable th2) {
            d9.a(th2);
        }
        if (str2 != null) {
            if (startAppAd != null) {
                startAppAd.setErrorMessage(str2);
            }
            a0.a(this.f75341f, kVar, startAppAd, false);
            return null;
        }
        if (adMode.equals(StartAppAd.AdMode.REWARDED_VIDEO)) {
            adPreferences2.setType(Ad.AdType.REWARDED_VIDEO);
        } else if (adMode.equals(StartAppAd.AdMode.VIDEO)) {
            adPreferences2.setType(Ad.AdType.VIDEO);
        }
        return a(startAppAd, placement2, adPreferences2, false, 0, kVar, str);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final com.startapp.sdk.adsbase.f a(CacheKey cacheKey) {
        w2 w2Var = cacheKey != null ? (w2) this.f75336a.get(cacheKey) : null;
        if (w2Var != null) {
            return w2Var.f75759o;
        }
        return null;
    }

    public final CacheKey a(StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, boolean z10, int i10, com.startapp.sdk.adsbase.k kVar, String str) throws Throwable {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        AdPreferences adPreferences2 = adPreferences == null ? new AdPreferences() : adPreferences;
        CacheKey cacheKey = str != null ? new CacheKey(placement, adPreferences2, UUID.randomUUID().toString()) : new CacheKey(placement, adPreferences2);
        if (this.f75338c && !z10) {
            this.f75339d.add(new o(startAppAd, placement, adPreferences2, kVar));
            return cacheKey;
        }
        AdPreferences adPreferences3 = new AdPreferences(adPreferences2);
        ConcurrentHashMap concurrentHashMap3 = this.f75336a;
        synchronized (concurrentHashMap3) {
            try {
                try {
                    w2 w2Var = (w2) this.f75336a.get(cacheKey);
                    if (w2Var == null) {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                concurrentHashMap2 = concurrentHashMap3;
                                                                w2 w2Var2 = new w2(this.f75341f, placement, adPreferences3, this.f75345j, this.f75346k, this.f75347l, new ib(new i7() { // from class: com.startapp.sdk.internal.zm
                                                                    @Override // com.startapp.sdk.internal.i7
                                                                    public final Object a() {
                                                                        return this.f75999a.a();
                                                                    }
                                                                }), this.f75348m, this.f75349n, this.f75351p, this.f75352q, this.f75353r, this.f75354s);
                                                                if (this.f75340e == null) {
                                                                    this.f75340e = new m(this);
                                                                }
                                                                w2Var2.f75770z = this.f75340e;
                                                                if (z10) {
                                                                    w2Var2.f75762r = String.valueOf(cacheKey.hashCode()).replace('-', '_');
                                                                    w2Var2.f75763s = true;
                                                                    w2Var2.f75767w = i10;
                                                                }
                                                                a(cacheKey, w2Var2);
                                                                w2Var = w2Var2;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                concurrentHashMap = concurrentHashMap3;
                                                                throw th;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            concurrentHashMap = concurrentHashMap3;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        concurrentHashMap = concurrentHashMap3;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    concurrentHashMap = concurrentHashMap3;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                concurrentHashMap = concurrentHashMap3;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            concurrentHashMap = concurrentHashMap3;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        concurrentHashMap = concurrentHashMap3;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    concurrentHashMap = concurrentHashMap3;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                concurrentHashMap = concurrentHashMap3;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            concurrentHashMap = concurrentHashMap3;
                        }
                    } else {
                        concurrentHashMap2 = concurrentHashMap3;
                        w2Var.f75758n = adPreferences3;
                    }
                    ((y6) ((x6) this.f75345j.a())).a(startAppAd, w2Var);
                    CacheKey cacheKey2 = cacheKey;
                    w2Var.a(startAppAd, kVar, false, true, str);
                    return cacheKey2;
                } catch (Throwable th12) {
                    th = th12;
                    concurrentHashMap = concurrentHashMap3;
                }
            } catch (Throwable th13) {
                th = th13;
            }
        }
    }

    public final void a(CacheKey cacheKey, w2 w2Var) {
        synchronized (this.f75336a) {
            try {
                int iE = CacheMetaData.b().a().e();
                if (iE != 0 && this.f75336a.size() >= iE) {
                    long j10 = Long.MAX_VALUE;
                    CacheKey cacheKey2 = null;
                    for (CacheKey cacheKey3 : this.f75336a.keySet()) {
                        w2 w2Var2 = (w2) this.f75336a.get(cacheKey3);
                        if (w2Var2.f75756l == w2Var.f75756l) {
                            long j11 = w2Var2.f75761q;
                            if (j11 < j10) {
                                cacheKey2 = cacheKey3;
                                j10 = j11;
                            }
                        }
                    }
                    if (cacheKey2 != null) {
                        this.f75336a.remove(cacheKey2);
                    }
                }
                this.f75336a.put(cacheKey, w2Var);
                if (((Random) si.f75517d.a()).nextDouble() * 100.0d < CacheMetaData.b().c()) {
                    d9 d9Var = new d9(e9.f74721d);
                    d9Var.f74675d = "Cache Size";
                    d9Var.f74676e = String.valueOf(this.f75336a.size());
                    d9Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
