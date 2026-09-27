package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgte extends zzgtj {
    public zzgte(zzgtl zzgtlVar, CharSequence charSequence, int i10) {
        super(zzgtlVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    public final int zzc(int i10) {
        int i11 = i10 + 4000;
        if (i11 < ((zzgtj) this).zzb.length()) {
            return i11;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    public final int zzd(int i10) {
        return i10;
    }
}
