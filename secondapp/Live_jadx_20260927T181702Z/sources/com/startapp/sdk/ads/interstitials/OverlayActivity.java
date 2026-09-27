package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import com.ironsource.C4235d4;
import com.startapp.sdk.ads.video.c;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.a;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.hh;
import com.startapp.sdk.internal.og;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.t7;
import com.startapp.sdk.internal.u7;
import com.startapp.sdk.internal.u8;
import com.startapp.sdk.internal.vd;
import com.startapp.sdk.internal.wa;
import com.vungle.ads.internal.Constants;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class OverlayActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u7 f74093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Ad f74094b;

    @Override // android.app.Activity
    public final void finish() {
        u7 u7Var = this.f74093a;
        if (u7Var != null) {
            u7Var.h();
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        u7 u7Var = this.f74093a;
        if (u7Var == null || !u7Var.c()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u7 u7Var = this.f74093a;
        if (u7Var != null) {
            u7Var.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0143  */
    /* JADX WARN: Code duplicated, block: B:39:0x014d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0161  */
    /* JADX WARN: Code duplicated, block: B:45:0x0171  */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        u7 vdVar;
        u7 u7Var;
        long longExtra;
        long longExtra2;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("placement", -1);
        int intExtra2 = getIntent().getIntExtra("ad", -1);
        if (intExtra2 <= 0) {
            finish();
            return;
        }
        Ad ad2 = (Ad) hh.a(intExtra2, Ad.class);
        this.f74094b = ad2;
        if (ad2 == null) {
            finish();
            return;
        }
        if (intExtra >= 0) {
            pg pgVar = (pg) a.a(getApplicationContext()).f74467l.a();
            AdPreferences.Placement byIndex = AdPreferences.Placement.getByIndex(intExtra);
            String adId = this.f74094b.getAdId();
            if (adId != null) {
                pgVar.f75386a.put(new og(byIndex), adId);
            }
        }
        boolean booleanExtra = getIntent().getBooleanExtra("videoAd", false);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra(Constants.TEMPLATE_TYPE_FULLSCREEN, false) || booleanExtra) {
            getWindow().setFlags(1024, 1024);
        }
        if (this.f74094b == null) {
            finish();
        } else {
            int intExtra3 = getIntent().getIntExtra("placement", 0);
            Intent intent = getIntent();
            AdPreferences.Placement byIndex2 = AdPreferences.Placement.getByIndex(intExtra3);
            Ad ad3 = this.f74094b;
            switch (t7.f75538a[byIndex2.ordinal()]) {
                case 1:
                    WeakHashMap weakHashMap = si.f75514a;
                    vdVar = new vd();
                    vdVar.f75604a = this;
                    vdVar.f75610g = intent.getStringExtra(C4235d4.i.L);
                    vdVar.f75611h = intent.getStringArrayExtra("tracking");
                    vdVar.f75612i = intent.getStringArrayExtra("trackingClickUrl");
                    vdVar.f75613j = intent.getStringArrayExtra("packageNames");
                    vdVar.f75607d = intent.getStringArrayExtra("closingUrl");
                    vdVar.f75608e = intent.getBooleanArrayExtra("smartRedirect");
                    vdVar.f75609f = intent.getBooleanArrayExtra("browserEnabled");
                    vdVar.f75617n = intent.getStringExtra("adTag");
                    vdVar.f75616m = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                    vdVar.f75615l = byIndex2;
                    vdVar.f75607d = intent.getStringArrayExtra("closingUrl");
                    vdVar.f75620q = intent.getIntExtra("rewardDuration", 0);
                    vdVar.f75621r = intent.getBooleanExtra("rewardedHideTimer", false);
                    if (vdVar.f75608e == null) {
                        vdVar.f75608e = new boolean[]{true};
                    }
                    if (vdVar.f75609f == null) {
                        vdVar.f75609f = new boolean[]{true};
                    }
                    vdVar.f75614k = ad3;
                    longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                    if (longExtra != -1) {
                        vdVar.f75622s = Long.valueOf(longExtra);
                    }
                    longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                    if (longExtra2 != -1) {
                        vdVar.f75618o = Long.valueOf(longExtra2);
                    }
                    vdVar.f75619p = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                    u7Var = vdVar;
                    break;
                case 2:
                    vdVar = intent.getBooleanExtra("videoAd", false) ? new c() : new wa();
                    vdVar.f75604a = this;
                    vdVar.f75610g = intent.getStringExtra(C4235d4.i.L);
                    vdVar.f75611h = intent.getStringArrayExtra("tracking");
                    vdVar.f75612i = intent.getStringArrayExtra("trackingClickUrl");
                    vdVar.f75613j = intent.getStringArrayExtra("packageNames");
                    vdVar.f75607d = intent.getStringArrayExtra("closingUrl");
                    vdVar.f75608e = intent.getBooleanArrayExtra("smartRedirect");
                    vdVar.f75609f = intent.getBooleanArrayExtra("browserEnabled");
                    vdVar.f75617n = intent.getStringExtra("adTag");
                    vdVar.f75616m = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                    vdVar.f75615l = byIndex2;
                    vdVar.f75607d = intent.getStringArrayExtra("closingUrl");
                    vdVar.f75620q = intent.getIntExtra("rewardDuration", 0);
                    vdVar.f75621r = intent.getBooleanExtra("rewardedHideTimer", false);
                    if (vdVar.f75608e == null) {
                        vdVar.f75608e = new boolean[]{true};
                    }
                    if (vdVar.f75609f == null) {
                        vdVar.f75609f = new boolean[]{true};
                    }
                    vdVar.f75614k = ad3;
                    longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                    if (longExtra != -1) {
                        vdVar.f75622s = Long.valueOf(longExtra);
                    }
                    longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                    if (longExtra2 != -1) {
                        vdVar.f75618o = Long.valueOf(longExtra2);
                    }
                    vdVar.f75619p = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                    u7Var = vdVar;
                    break;
                case 5:
                case 6:
                    WeakHashMap weakHashMap2 = si.f75514a;
                    Uri data = intent.getData();
                    if (data != null) {
                        vdVar = new u8(data.toString());
                        vdVar.f75604a = this;
                        vdVar.f75610g = intent.getStringExtra(C4235d4.i.L);
                        vdVar.f75611h = intent.getStringArrayExtra("tracking");
                        vdVar.f75612i = intent.getStringArrayExtra("trackingClickUrl");
                        vdVar.f75613j = intent.getStringArrayExtra("packageNames");
                        vdVar.f75607d = intent.getStringArrayExtra("closingUrl");
                        vdVar.f75608e = intent.getBooleanArrayExtra("smartRedirect");
                        vdVar.f75609f = intent.getBooleanArrayExtra("browserEnabled");
                        vdVar.f75617n = intent.getStringExtra("adTag");
                        vdVar.f75616m = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                        vdVar.f75615l = byIndex2;
                        vdVar.f75607d = intent.getStringArrayExtra("closingUrl");
                        vdVar.f75620q = intent.getIntExtra("rewardDuration", 0);
                        vdVar.f75621r = intent.getBooleanExtra("rewardedHideTimer", false);
                        if (vdVar.f75608e == null) {
                            vdVar.f75608e = new boolean[]{true};
                        }
                        if (vdVar.f75609f == null) {
                            vdVar.f75609f = new boolean[]{true};
                        }
                        vdVar.f75614k = ad3;
                        longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                        if (longExtra != -1) {
                            vdVar.f75622s = Long.valueOf(longExtra);
                        }
                        longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                        if (longExtra2 != -1) {
                            vdVar.f75618o = Long.valueOf(longExtra2);
                        }
                        vdVar.f75619p = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                        u7Var = vdVar;
                        break;
                    }
                case 3:
                case 4:
                    u7Var = null;
                    break;
                default:
                    vdVar = new wa();
                    vdVar.f75604a = this;
                    vdVar.f75610g = intent.getStringExtra(C4235d4.i.L);
                    vdVar.f75611h = intent.getStringArrayExtra("tracking");
                    vdVar.f75612i = intent.getStringArrayExtra("trackingClickUrl");
                    vdVar.f75613j = intent.getStringArrayExtra("packageNames");
                    vdVar.f75607d = intent.getStringArrayExtra("closingUrl");
                    vdVar.f75608e = intent.getBooleanArrayExtra("smartRedirect");
                    vdVar.f75609f = intent.getBooleanArrayExtra("browserEnabled");
                    vdVar.f75617n = intent.getStringExtra("adTag");
                    vdVar.f75616m = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                    vdVar.f75615l = byIndex2;
                    vdVar.f75607d = intent.getStringArrayExtra("closingUrl");
                    vdVar.f75620q = intent.getIntExtra("rewardDuration", 0);
                    vdVar.f75621r = intent.getBooleanExtra("rewardedHideTimer", false);
                    if (vdVar.f75608e == null) {
                        vdVar.f75608e = new boolean[]{true};
                    }
                    if (vdVar.f75609f == null) {
                        vdVar.f75609f = new boolean[]{true};
                    }
                    vdVar.f75614k = ad3;
                    longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                    if (longExtra != -1) {
                        vdVar.f75622s = Long.valueOf(longExtra);
                    }
                    longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                    if (longExtra2 != -1) {
                        vdVar.f75618o = Long.valueOf(longExtra2);
                    }
                    vdVar.f75619p = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                    u7Var = vdVar;
                    break;
            }
            this.f74093a = u7Var;
            if (u7Var == null) {
                finish();
            }
        }
        u7 u7Var2 = this.f74093a;
        if (u7Var2 != null) {
            u7Var2.a(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        u7 u7Var = this.f74093a;
        if (u7Var != null) {
            u7Var.e();
            this.f74093a = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        u7 u7Var = this.f74093a;
        if (u7Var == null || u7Var.a(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        u7 u7Var = this.f74093a;
        if (u7Var != null) {
            u7Var.f();
        }
        g0.d(this);
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        u7 u7Var = this.f74093a;
        if (u7Var != null) {
            u7Var.g();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        u7 u7Var = this.f74093a;
        if (u7Var != null) {
            u7Var.b(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
