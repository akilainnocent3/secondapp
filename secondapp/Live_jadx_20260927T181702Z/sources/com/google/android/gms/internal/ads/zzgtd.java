package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgtd extends zzgtj {
    final /* synthetic */ zzgsl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgtd(zzgtl zzgtlVar, CharSequence charSequence, zzgsl zzgslVar) {
        super(zzgtlVar, charSequence);
        this.zza = zzgslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    public final int zzc(int i10) {
        Matcher matcher = ((zzgso) this.zza).zza;
        if (matcher.find(i10)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    public final int zzd(int i10) {
        return ((zzgso) this.zza).zza.end();
    }
}
