package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib f75746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib f75747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ib f75748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ib f75749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ib f75750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ib f75751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ib f75752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ib f75753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ib f75754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ib f75755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AdPreferences.Placement f75756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ActivityExtra f75757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AdPreferences f75758n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f75761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f75762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f75763s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q2 f75764t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n2 f75765u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f75767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f75768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Long f75769y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m f75770z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Ad f75759o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f75760p = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ConcurrentHashMap f75766v = new ConcurrentHashMap();

    public w2(Context context, AdPreferences.Placement placement, AdPreferences adPreferences, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, ib ibVar10) {
        this.f75756l = placement;
        this.f75758n = adPreferences;
        if (context instanceof Activity) {
            Context contextA = w0.a(context);
            this.f75745a = contextA == null ? context : contextA;
            this.f75757m = new ActivityExtra((Activity) context);
        } else {
            this.f75745a = context;
            this.f75757m = null;
        }
        this.f75768x = true;
        this.f75746b = ibVar;
        this.f75747c = ibVar2;
        this.f75748d = ibVar3;
        this.f75749e = ibVar4;
        this.f75750f = ibVar5;
        this.f75751g = ibVar6;
        this.f75752h = ibVar7;
        this.f75753i = ibVar8;
        this.f75754j = ibVar9;
        this.f75755k = ibVar10;
        this.f75764t = new q2(this);
        this.f75765u = new n2(this);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    /* JADX WARN: Code duplicated, block: B:28:0x003e A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #1 {all -> 0x0028, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:17:0x0022, B:37:0x0065, B:11:0x0015, B:22:0x002e, B:28:0x003e, B:32:0x004a, B:33:0x004d, B:26:0x0038, B:34:0x0050, B:36:0x0058, B:23:0x0030, B:29:0x0045), top: B:43:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0058 A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:17:0x0022, B:37:0x0065, B:11:0x0015, B:22:0x002e, B:28:0x003e, B:32:0x004a, B:33:0x004d, B:26:0x0038, B:34:0x0050, B:36:0x0058, B:23:0x0030, B:29:0x0045), top: B:43:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void a(StartAppAd startAppAd, com.startapp.sdk.adsbase.k kVar, boolean z10, boolean z11, String str) {
        List arrayList;
        synchronized (this.f75766v) {
            try {
                ?? r10 = this.f75759o;
                if (r10 == 0 || !r10.isReady()) {
                    if (startAppAd != null && kVar != null) {
                        try {
                            arrayList = (List) this.f75766v.get(kVar);
                        } catch (Throwable th2) {
                            d9.a(th2);
                            arrayList = null;
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            try {
                                this.f75766v.put(kVar, arrayList);
                            } catch (Throwable th3) {
                                d9.a(th3);
                            }
                        }
                        arrayList.add(startAppAd);
                    }
                    if (this.f75760p.compareAndSet(false, true)) {
                        this.f75764t.e();
                        this.f75765u.e();
                        b(str, z11);
                    }
                } else {
                    ?? r11 = this.f75759o;
                    if ((r11 == 0 ? false : r11.hasAdCacheTtlPassed()) || z10) {
                        if (startAppAd != null) {
                            arrayList = (List) this.f75766v.get(kVar);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                this.f75766v.put(kVar, arrayList);
                            }
                            arrayList.add(startAppAd);
                        }
                        if (this.f75760p.compareAndSet(false, true)) {
                            this.f75764t.e();
                            this.f75765u.e();
                            b(str, z11);
                        }
                    } else if (startAppAd != null && kVar != null) {
                        a0.b(this.f75745a, kVar, startAppAd, true);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void b(String str, boolean z10) {
        String str2;
        ?? r10 = this.f75759o;
        if (r10 != 0) {
            r10.setVideoCancelCallBack(false);
        }
        if (!this.f75763s || (str2 = this.f75762r) == null) {
            a(str, z10);
            return;
        }
        this.f75763s = false;
        r2 r2Var = new r2(this, new v2(this), z10);
        Context context = this.f75745a;
        ((Executor) com.startapp.sdk.components.a.a(context).C.a()).execute(new q6(context, str2, r2Var, new s2(this)));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void a() {
        boolean zBooleanValue;
        ?? r10 = this.f75759o;
        if (r10 != 0 && r10.isReady()) {
            Context context = this.f75745a;
            Ad ad2 = this.f75759o;
            if (ad2 != null) {
                HashSet hashSet = new HashSet();
                if (ad2 instanceof m8) {
                    zBooleanValue = t0.a(context, t0.a(((m8) ad2).f75169b, 0), 0, hashSet, new ArrayList()).booleanValue();
                } else if ((ad2 instanceof db) && t0.a(context, ((db) ad2).f74683a, 0, hashSet, false).size() == 0) {
                    zBooleanValue = true;
                } else {
                    zBooleanValue = false;
                }
            } else {
                zBooleanValue = false;
            }
            if (!zBooleanValue) {
                ?? r11 = this.f75759o;
                if (!(r11 != 0 ? r11.hasAdCacheTtlPassed() : false)) {
                    if (this.f75760p.get()) {
                        return;
                    }
                    this.f75764t.d();
                    return;
                }
            }
            a(null, null, true, false, null);
            return;
        }
        if (this.f75760p.get()) {
            return;
        }
        this.f75765u.d();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    public final void a(String str, boolean z10) {
        Ad ijVar;
        Ad tdVar;
        Ad udVar;
        if (z10) {
            Long lH = AdsCommonMetaData.k().h();
            if (lH != null && this.f75769y != null && SystemClock.elapsedRealtime() - this.f75769y.longValue() < lH.longValue()) {
                a0.a(this.f75745a, new v2(this), new t2(this.f75745a, this.f75756l, this.f75746b, this.f75747c, this.f75749e, this.f75750f, this.f75751g, this.f75752h, this.f75753i, this.f75754j, this.f75755k), true);
                si.a(6, this.f75745a, "Failed to load " + this.f75756l.name() + " ad: NO FILL");
                return;
            }
            this.f75769y = Long.valueOf(SystemClock.elapsedRealtime());
        }
        int i10 = u2.f75588a[this.f75756l.ordinal()];
        if (i10 == 1) {
            ijVar = new ij(this.f75745a, AdPreferences.Placement.INAPP_OVERLAY, this.f75746b, this.f75747c, this.f75749e, this.f75750f, this.f75751g, this.f75752h, this.f75753i, this.f75754j, this.f75755k);
        } else if (i10 == 2) {
            boolean z11 = ((Random) si.f75517d.a()).nextInt(100) < AdsCommonMetaData.k().w();
            boolean zIsForceOfferWall3D = this.f75758n.isForceOfferWall3D();
            boolean zIsForceOfferWall2D = this.f75758n.isForceOfferWall2D();
            if ((z11 || zIsForceOfferWall3D) && !zIsForceOfferWall2D) {
                tdVar = new td(this.f75745a, this.f75746b, this.f75747c, this.f75749e, this.f75750f, this.f75751g, this.f75752h, this.f75753i, this.f75754j, this.f75755k, this.f75748d);
                ijVar = tdVar;
            } else {
                udVar = new ud(this.f75745a, this.f75746b, this.f75747c, this.f75749e, this.f75750f, this.f75751g, this.f75752h, this.f75753i, this.f75754j, this.f75755k);
                ijVar = udVar;
            }
        } else if (i10 == 3) {
            udVar = new te(this.f75745a, this.f75746b, this.f75747c, this.f75749e, this.f75750f, this.f75751g, this.f75752h, this.f75753i, this.f75754j, this.f75755k);
            ijVar = udVar;
        } else if (i10 != 4) {
            ijVar = new xd(this.f75745a, this.f75746b, this.f75747c, this.f75749e, this.f75750f, this.f75751g, this.f75752h, this.f75753i, this.f75754j, this.f75755k);
        } else {
            tdVar = new wg(this.f75745a, this.f75746b, this.f75747c, this.f75749e, this.f75750f, this.f75751g, this.f75752h, this.f75753i, this.f75754j, this.f75755k);
            ijVar = tdVar;
        }
        this.f75759o = ijVar;
        ((y6) ((x6) this.f75746b.a())).a(this, this.f75759o);
        this.f75759o.setActivityExtra(this.f75757m);
        this.f75758n.setAutoLoadAmount(this.f75767w);
        this.f75759o.load(this.f75758n, new v2(this), str);
        this.f75761q = System.currentTimeMillis();
    }
}
