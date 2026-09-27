package com.android.billingclient.api;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class AccountIdentifiers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f25490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f25491b;

    public AccountIdentifiers(@Nullable String str, @Nullable String str2) {
        this.f25490a = str;
        this.f25491b = str2;
    }

    @Nullable
    public String getObfuscatedAccountId() {
        return this.f25490a;
    }

    @Nullable
    public String getObfuscatedProfileId() {
        return this.f25491b;
    }
}
