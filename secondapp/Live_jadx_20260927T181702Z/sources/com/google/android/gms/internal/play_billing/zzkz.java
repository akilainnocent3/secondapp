package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzkz implements zzhm {
    static final zzhm zza = new zzkz();

    private zzkz() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzhm
    public final boolean zza(int i10) {
        if (i10 == 17 || i10 == 18) {
            return true;
        }
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return true;
            default:
                return false;
        }
    }
}
