package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class ConsumeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25536a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25537a;

        public Builder() {
            throw null;
        }

        @NonNull
        public ConsumeParams build() {
            String str = this.f25537a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams(null);
            consumeParams.f25536a = str;
            return consumeParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.f25537a = str;
            return this;
        }

        public /* synthetic */ Builder(zzck zzckVar) {
        }
    }

    public ConsumeParams() {
        throw null;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getPurchaseToken() {
        return this.f25536a;
    }

    public /* synthetic */ ConsumeParams(zzck zzckVar) {
    }
}
