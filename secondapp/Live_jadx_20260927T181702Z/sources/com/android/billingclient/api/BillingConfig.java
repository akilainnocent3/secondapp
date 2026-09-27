package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@zzh
public final class BillingConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25507a;

    public BillingConfig(@Nullable String str, String str2) {
        this.f25507a = str2;
    }

    public static BillingConfig a(String str) {
        return new BillingConfig(null, str);
    }

    @NonNull
    public String getCountryCode() {
        return this.f25507a;
    }

    public BillingConfig(String str) throws JSONException {
        this.f25507a = new JSONObject(str).optString("countryCode");
    }
}
