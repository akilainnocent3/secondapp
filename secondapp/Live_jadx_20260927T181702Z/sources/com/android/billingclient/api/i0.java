package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PurchasesUpdatedListener f25696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzb f25697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UserChoiceBillingListener f25698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f25699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f25700f = new h0(this, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f25701g = new h0(this, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25702h;

    public i0(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzco zzcoVar, zzb zzbVar, UserChoiceBillingListener userChoiceBillingListener, a0 a0Var) {
        this.f25695a = context;
        this.f25696b = purchasesUpdatedListener;
        this.f25697c = zzbVar;
        this.f25698d = userChoiceBillingListener;
        this.f25699e = a0Var;
    }

    @Nullable
    public final PurchasesUpdatedListener d() {
        return this.f25696b;
    }

    public final void f() {
        this.f25700f.c(this.f25695a);
        this.f25701g.c(this.f25695a);
    }

    public final void g(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f25702h = z10;
        this.f25701g.a(this.f25695a, intentFilter2);
        if (this.f25702h) {
            this.f25700f.b(this.f25695a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f25700f.a(this.f25695a, intentFilter);
        }
    }
}
