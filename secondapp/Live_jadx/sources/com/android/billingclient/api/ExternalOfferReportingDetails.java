package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@zzg
public final class ExternalOfferReportingDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25538a;

    public ExternalOfferReportingDetails(String str) throws JSONException {
        this.f25538a = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.f25538a;
    }
}
