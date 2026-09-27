package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class fj implements ck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ck f74835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CachedVideoAd f74836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f74837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj f74838d;

    public fj(hj hjVar, ck ckVar, CachedVideoAd cachedVideoAd, Context context) {
        this.f74838d = hjVar;
        this.f74835a = ckVar;
        this.f74836b = cachedVideoAd;
        this.f74837c = context;
    }

    @Override // com.startapp.sdk.internal.ck
    public final void a(String str) {
        ck ckVar = this.f74835a;
        if (ckVar != null) {
            ckVar.a(str);
        }
        if (str != null) {
            this.f74836b.a(System.currentTimeMillis());
            this.f74836b.a(str);
            hj hjVar = this.f74838d;
            Context context = this.f74837c;
            CachedVideoAd cachedVideoAd = this.f74836b;
            hjVar.f74954a.remove(cachedVideoAd);
            hjVar.a(AdsCommonMetaData.k().F().c() - 1);
            hjVar.f74954a.add(cachedVideoAd);
            e7.a(context, hjVar.f74954a);
        }
    }
}
