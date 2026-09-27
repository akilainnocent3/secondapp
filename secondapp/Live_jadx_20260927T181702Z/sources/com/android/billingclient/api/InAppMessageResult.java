package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class InAppMessageResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f25542b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i10, @Nullable String str) {
        this.f25541a = i10;
        this.f25542b = str;
    }

    @Nullable
    public String getPurchaseToken() {
        return this.f25542b;
    }

    public int getResponseCode() {
        return this.f25541a;
    }
}
