package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingType;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f95044a;

    static {
        int[] iArr = new int[BillingType.values().length];
        iArr[BillingType.LIBRARY_V6.ordinal()] = 1;
        iArr[BillingType.LIBRARY_V8.ordinal()] = 2;
        f95044a = iArr;
    }
}
