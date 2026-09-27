package com.startapp.sdk.internal;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class u7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OverlayActivity f75604a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f75607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean[] f75608e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f75610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f75611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f75612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String[] f75613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ad f75614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AdPreferences.Placement f75615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AdInformationOverrides f75616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f75617n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Long f75618o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Long f75622s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.startapp.sdk.adsbase.adinformation.a f75605b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r7 f75606c = new r7(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean[] f75609f = {true};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean[] f75619p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f75620q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f75621r = false;

    public abstract void a(Bundle bundle);

    public boolean a(int i10, KeyEvent keyEvent) {
        return false;
    }

    public void b() {
        this.f75604a.runOnUiThread(new s7(this));
    }

    public abstract void b(Bundle bundle);

    public boolean c() {
        return false;
    }

    public void e() {
        if (this.f75606c != null) {
            wb.a(this.f75604a).a(this.f75606c);
        }
        this.f75606c = null;
    }

    public abstract void f();

    public abstract void g();

    public void h() {
        wb.a(this.f75604a).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
    }

    public final String a() {
        try {
            String[] strArr = this.f75611h;
            return (strArr == null || strArr.length <= 0) ? "" : g0.a(strArr[0], (String) null);
        } catch (Throwable th2) {
            d9.a(th2);
            return "";
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        OverlayActivity overlayActivity = this.f75604a;
        AdInformationConfig.ImageResourceType imageResourceType = AdInformationConfig.ImageResourceType.INFO_L;
        AdPreferences.Placement placement = this.f75615l;
        AdInformationOverrides adInformationOverrides = this.f75616m;
        Ad ad2 = this.f75614k;
        ConsentData consentData = ad2 != null ? ad2.getConsentData() : null;
        Ad ad3 = this.f75614k;
        String requestUrl = ad3 != null ? ad3.getRequestUrl() : null;
        Ad ad4 = this.f75614k;
        String dParam = ad4 != null ? ad4.getDParam() : null;
        Ad ad5 = this.f75614k;
        String erid = ad5 != null ? ad5.getErid() : null;
        Ad ad6 = this.f75614k;
        com.startapp.sdk.adsbase.adinformation.a aVar = new com.startapp.sdk.adsbase.adinformation.a(overlayActivity, imageResourceType, placement, adInformationOverrides, consentData, requestUrl, dParam, erid, ad6 != null ? ad6.getEridUrl() : null);
        this.f75605b = aVar;
        aVar.a(relativeLayout);
    }

    public void d() {
    }
}
