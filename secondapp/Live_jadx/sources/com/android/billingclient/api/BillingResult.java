package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class BillingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25533b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f25535b = "";

        public Builder() {
        }

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.f25532a = this.f25534a;
            billingResult.f25533b = this.f25535b;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.f25535b = str;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i10) {
            this.f25534a = i10;
            return this;
        }

        public /* synthetic */ Builder(zzci zzciVar) {
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getDebugMessage() {
        return this.f25533b;
    }

    public int getResponseCode() {
        return this.f25532a;
    }

    @NonNull
    public String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.zze.zzi(this.f25532a) + ", Debug Message: " + this.f25533b;
    }
}
