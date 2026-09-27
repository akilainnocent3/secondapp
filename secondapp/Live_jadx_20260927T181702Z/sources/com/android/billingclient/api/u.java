package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingResult f25733b;

    public u(BillingResult billingResult, @Nullable List list) {
        this.f25732a = list;
        this.f25733b = billingResult;
    }

    public final BillingResult a() {
        return this.f25733b;
    }

    public final List b() {
        return this.f25732a;
    }
}
