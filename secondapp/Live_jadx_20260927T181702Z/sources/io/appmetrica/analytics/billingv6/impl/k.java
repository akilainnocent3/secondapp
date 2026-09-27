package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class k implements PurchasesResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilsProvider f95159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds.a f95160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f95161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f95162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f95163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f95164f;

    public k(UtilsProvider utilsProvider, ds.a aVar, List list, List list2, d dVar, n nVar) {
        this.f95159a = utilsProvider;
        this.f95160b = aVar;
        this.f95161c = list;
        this.f95162d = list2;
        this.f95163e = dVar;
        this.f95164f = nVar;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f95159a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }
}
