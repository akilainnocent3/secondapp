package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class SkuDetailsParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f25616b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f25618b;

        public Builder() {
            throw null;
        }

        @NonNull
        public SkuDetailsParams build() {
            String str = this.f25617a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f25618b == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
            skuDetailsParams.f25615a = str;
            skuDetailsParams.f25616b = this.f25618b;
            return skuDetailsParams;
        }

        @NonNull
        public Builder setSkusList(@NonNull List<String> list) {
            this.f25618b = new ArrayList(list);
            return this;
        }

        @NonNull
        public Builder setType(@NonNull String str) {
            this.f25617a = str;
            return this;
        }

        public /* synthetic */ Builder(zzdd zzddVar) {
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getSkuType() {
        return this.f25615a;
    }

    @NonNull
    public List<String> getSkusList() {
        return this.f25616b;
    }
}
