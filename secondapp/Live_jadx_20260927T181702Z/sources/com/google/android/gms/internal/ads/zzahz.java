package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzahz extends zzafb {
    public zzahz(final zzagc zzagcVar, int i10, long j10, long j11) {
        long j12;
        Objects.requireNonNull(zzagcVar);
        zzaey zzaeyVar = new zzaey() { // from class: com.google.android.gms.internal.ads.zzahx
            @Override // com.google.android.gms.internal.ads.zzaey
            public final /* synthetic */ long zza(long j13) {
                return zzagcVar.zzb(j13);
            }
        };
        zzahy zzahyVar = new zzahy(zzagcVar, i10, null);
        long jZza = zzagcVar.zza();
        long j13 = zzagcVar.zzj;
        int i11 = zzagcVar.zzd;
        if (i11 > 0) {
            j12 = ((((long) i11) + ((long) zzagcVar.zzc)) / 2) + 1;
        } else {
            int i12 = zzagcVar.zza;
            long j14 = 4096;
            if (i12 == zzagcVar.zzb && i12 > 0) {
                j14 = i12;
            }
            j12 = 64 + (((j14 * ((long) zzagcVar.zzg)) * ((long) zzagcVar.zzh)) / 8);
        }
        super(zzaeyVar, zzahyVar, jZza, 0L, j13, j10, j11, j12, Math.max(6, zzagcVar.zzc));
    }
}
