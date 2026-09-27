package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@zzf
@KeepForSdk
public final class AlternativeBillingOnlyReportingDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25494a;

    public AlternativeBillingOnlyReportingDetails(String str) throws JSONException {
        this.f25494a = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.f25494a;
    }
}
