package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzkn;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.internal.play_billing.zzlu;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f25625a = 0;

    static {
        com.google.android.gms.internal.play_billing.zzcr.zzc("com.android.vending.billing.PURCHASES_UPDATED", zzkn.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", zzkn.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", zzkn.ALTERNATIVE_BILLING_ACTION);
    }

    void a(zzkl zzklVar);

    void b(zzlq zzlqVar);

    void c(@Nullable zzlu zzluVar);

    void d(zzjz zzjzVar);

    void e(@Nullable zzkd zzkdVar, int i10);

    void f(@Nullable zzjz zzjzVar, int i10);

    void g(@Nullable zzkd zzkdVar);
}
