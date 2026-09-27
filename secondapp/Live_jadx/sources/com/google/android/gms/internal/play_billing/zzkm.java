package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzkm implements zzhm {
    static final zzhm zza = new zzkm();

    private zzkm() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final boolean zza(int i10) {
        zzkn zzknVar;
        if (i10 == 0) {
            zzknVar = zzkn.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i10 == 1) {
            zzknVar = zzkn.PURCHASES_UPDATED_ACTION;
        } else if (i10 != 2) {
            zzknVar = i10 != 3 ? null : zzkn.ALTERNATIVE_BILLING_ACTION;
        } else {
            zzknVar = zzkn.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        return zzknVar != null;
    }
}
