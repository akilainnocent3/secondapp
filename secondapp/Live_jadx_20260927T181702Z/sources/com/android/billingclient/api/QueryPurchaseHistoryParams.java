package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class QueryPurchaseHistoryParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25609a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25610a;

        public Builder() {
            throw null;
        }

        @NonNull
        public QueryPurchaseHistoryParams build() {
            if (this.f25610a != null) {
                return new QueryPurchaseHistoryParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.f25610a = str;
            return this;
        }

        public /* synthetic */ Builder(zzda zzdaVar) {
        }
    }

    public /* synthetic */ QueryPurchaseHistoryParams(Builder builder, zzda zzdaVar) {
        this.f25609a = builder.f25610a;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public final String zza() {
        return this.f25609a;
    }
}
