package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgtc extends zzgtj {
    final /* synthetic */ zzgsk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgtc(zzgtl zzgtlVar, CharSequence charSequence, zzgsk zzgskVar) {
        super(zzgtlVar, charSequence);
        this.zza = zzgskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    public final int zzc(int i10) {
        CharSequence charSequence = ((zzgtj) this).zzb;
        int length = charSequence.length();
        zzgsw.zzn(i10, length, "index");
        while (i10 < length) {
            if (this.zza.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    public final int zzd(int i10) {
        return i10 + 1;
    }
}
