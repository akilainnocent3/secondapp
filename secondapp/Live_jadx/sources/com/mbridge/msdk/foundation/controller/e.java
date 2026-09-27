package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.vungle.ads.internal.model.Cookie;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f66728a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f66729b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f66730c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f66731d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66732e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f66733f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f66734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f66735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f66736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f66737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f66738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f66739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SharedPreferences f66740m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a();
    }

    public e(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f66740m = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        a();
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f66740m;
        if (sharedPreferences != null) {
            d(sharedPreferences.getString("IABTCF_TCString", ""));
            a(this.f66740m.getInt(Cookie.IABTCF_GDPR_APPLIES, 0));
            c(this.f66740m.getString("IABTCF_PurposeConsents", ""));
            e(this.f66740m.getString("IABTCF_VendorConsents", ""));
            b(this.f66740m.getString("IABTCF_AddtlConsent", ""));
        }
    }

    public String b() {
        return this.f66728a;
    }

    public void c(String str) {
        this.f66734g = a(str, 1);
        this.f66735h = a(str, 2);
        this.f66729b = str;
    }

    public void d(String str) {
        this.f66728a = str;
    }

    public void e(String str) {
        this.f66736i = a(str, 867);
        this.f66730c = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            switch (str.hashCode()) {
                case -2004976699:
                    if (str.equals("IABTCF_PurposeConsents")) {
                        c(sharedPreferences.getString("IABTCF_PurposeConsents", ""));
                    }
                    break;
                case 83641339:
                    if (str.equals(Cookie.IABTCF_GDPR_APPLIES)) {
                        a(sharedPreferences.getInt(Cookie.IABTCF_GDPR_APPLIES, 0));
                    }
                    break;
                case 1218895378:
                    if (str.equals("IABTCF_TCString")) {
                        d(sharedPreferences.getString("IABTCF_TCString", ""));
                    }
                    break;
                case 1342914771:
                    if (str.equals("IABTCF_AddtlConsent")) {
                        b(sharedPreferences.getString("IABTCF_AddtlConsent", ""));
                    }
                    break;
                case 1450203731:
                    if (str.equals("IABTCF_VendorConsents")) {
                        e(sharedPreferences.getString("IABTCF_VendorConsents", ""));
                    }
                    break;
            }
            a aVar = this.f66739l;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th2) {
            q0.b("TCStringManager", th2.getMessage());
        }
    }

    public void b(String str) {
        this.f66731d = str;
        if (TextUtils.isEmpty(str)) {
            this.f66737j = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f66738k = false;
            return;
        }
        this.f66738k = true;
        try {
            String[] strArrSplit = str.split("~");
            if (strArrSplit.length > 1) {
                if (TextUtils.isEmpty(strArrSplit[1])) {
                    this.f66737j = false;
                } else {
                    this.f66737j = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th2) {
            q0.b("TCStringManager", th2.getMessage());
        }
    }

    public boolean c() {
        if (this.f66732e == 0) {
            a(true);
            return this.f66733f;
        }
        if (MBridgeConstans.VERIFY_ATP_CONSENT) {
            a((this.f66736i || (this.f66738k && this.f66737j)) && this.f66734g && this.f66735h);
        } else {
            a(this.f66736i && this.f66734g && this.f66735h);
        }
        return this.f66733f;
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f66739l = aVar;
        }
    }

    public void a(int i10) {
        this.f66732e = i10;
    }

    public void a(boolean z10) {
        this.f66733f = z10;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[01]+");
    }

    private boolean a(String str, int i10) {
        return a(str) && i10 <= str.length() && i10 >= 1 && '1' == str.charAt(i10 - 1);
    }
}
