package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingClient f95132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f95133b = new LinkedHashSet();

    public d(BillingClient billingClient) {
        this.f95132a = billingClient;
    }

    public final void a(Object obj) {
        this.f95133b.remove(obj);
        if (this.f95133b.size() == 0) {
            this.f95132a.endConnection();
        }
    }
}
