package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class AcknowledgePurchaseParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25492a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25493a;

        public Builder() {
            throw null;
        }

        @NonNull
        public AcknowledgePurchaseParams build() {
            String str = this.f25493a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams(null);
            acknowledgePurchaseParams.f25492a = str;
            return acknowledgePurchaseParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.f25493a = str;
            return this;
        }

        public /* synthetic */ Builder(zza zzaVar) {
        }
    }

    public AcknowledgePurchaseParams() {
        throw null;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getPurchaseToken() {
        return this.f25492a;
    }

    public /* synthetic */ AcknowledgePurchaseParams(zza zzaVar) {
    }
}
