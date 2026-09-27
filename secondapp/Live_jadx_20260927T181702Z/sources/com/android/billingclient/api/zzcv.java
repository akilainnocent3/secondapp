package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List f25749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingResult f25750b;

    public zzcv(BillingResult billingResult, @Nullable List list) {
        this.f25749a = list;
        this.f25750b = billingResult;
    }

    public final BillingResult zza() {
        return this.f25750b;
    }

    @Nullable
    public final List zzb() {
        return this.f25749a;
    }
}
