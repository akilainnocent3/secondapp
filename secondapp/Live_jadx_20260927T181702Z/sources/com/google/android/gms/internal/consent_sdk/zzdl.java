package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzdl extends zzdn {
    public zzdl(zzdo zzdoVar, CharSequence charSequence, zzdh zzdhVar) {
        super(zzdoVar, charSequence);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    public final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdn
    public final int zzd(int i10) {
        CharSequence charSequence = ((zzdn) this).zza;
        int length = charSequence.length();
        zzdj.zzb(i10, length, "index");
        while (i10 < length) {
            if (charSequence.charAt(i10) == ',') {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
