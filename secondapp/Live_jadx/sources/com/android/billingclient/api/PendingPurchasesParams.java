package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@zzj
public final class PendingPurchasesParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25544b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @zzj
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f25545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f25546b;

        public Builder() {
        }

        @NonNull
        public PendingPurchasesParams build() {
            if (!this.f25545a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new PendingPurchasesParams(true, this.f25546b);
        }

        @NonNull
        public Builder enableOneTimeProducts() {
            this.f25545a = true;
            return this;
        }

        @NonNull
        public Builder enablePrepaidPlans() {
            this.f25546b = true;
            return this;
        }
    }

    public PendingPurchasesParams(boolean z10, boolean z11) {
        this.f25543a = z10;
        this.f25544b = z11;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean a() {
        return this.f25543a;
    }

    public boolean b() {
        return this.f25544b;
    }
}
