package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class QueryProductDetailsParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.zzco f25603a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.google.android.gms.internal.play_billing.zzco f25604a;

        public Builder() {
            throw null;
        }

        @NonNull
        public QueryProductDetailsParams build() {
            if (this.f25604a != null) {
                return new QueryProductDetailsParams(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        @NonNull
        public Builder setProductList(@NonNull List<Product> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f25604a = com.google.android.gms.internal.play_billing.zzco.zzk(list);
            return this;
        }

        public /* synthetic */ Builder(zzcz zzczVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Product {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f25606b;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f25607a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f25608b;

            public Builder() {
                throw null;
            }

            @NonNull
            public Product build() {
                if ("first_party".equals(this.f25608b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f25607a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f25608b != null) {
                    return new Product(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            @NonNull
            public Builder setProductId(@NonNull String str) {
                this.f25607a = str;
                return this;
            }

            @NonNull
            public Builder setProductType(@NonNull String str) {
                this.f25608b = str;
                return this;
            }

            public /* synthetic */ Builder(zzcz zzczVar) {
            }
        }

        public /* synthetic */ Product(Builder builder, zzcz zzczVar) {
            this.f25605a = builder.f25607a;
            this.f25606b = builder.f25608b;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @NonNull
        public final String zza() {
            return this.f25605a;
        }

        @NonNull
        public final String zzb() {
            return this.f25606b;
        }
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder, zzcz zzczVar) {
        this.f25603a = builder.f25604a;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final com.google.android.gms.internal.play_billing.zzco zza() {
        return this.f25603a;
    }

    @NonNull
    public final String zzb() {
        return ((Product) this.f25603a.get(0)).zzb();
    }
}
