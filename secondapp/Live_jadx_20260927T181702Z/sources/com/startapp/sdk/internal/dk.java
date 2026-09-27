package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class dk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f74706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f74707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fj f74709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gj f74710e;

    public dk(Context context, URL url, String str, fj fjVar, gj gjVar) {
        this.f74706a = context;
        this.f74707b = url;
        this.f74708c = str;
        this.f74709d = fjVar;
        this.f74710e = gjVar;
    }

    public final void a() {
        String strA;
        try {
            strA = AdsCommonMetaData.k().F().q() ? ne.f75258a.a(this.f74706a, this.f74707b, this.f74708c, this.f74710e) : ek.a(this.f74706a, this.f74707b, this.f74708c);
        } catch (Exception e10) {
            d9.a(e10);
            strA = null;
        }
        new Handler(Looper.getMainLooper()).post(new bk(this, strA));
    }
}
