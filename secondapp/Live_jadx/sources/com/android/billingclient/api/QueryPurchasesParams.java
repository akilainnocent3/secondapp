package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class QueryPurchasesParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25611a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25612a;

        public Builder() {
            throw null;
        }

        @NonNull
        public QueryPurchasesParams build() {
            if (this.f25612a != null) {
                return new QueryPurchasesParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.f25612a = str;
            return this;
        }

        public /* synthetic */ Builder(zzdb zzdbVar) {
        }
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder, zzdb zzdbVar) {
        this.f25611a = builder.f25612a;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public final String zza() {
        return this.f25611a;
    }
}
