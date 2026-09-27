package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzahy implements zzafa {
    private final zzagc zza;
    private final int zzb;
    private final zzafw zzc = new zzafw();

    public /* synthetic */ zzahy(zzagc zzagcVar, int i10, byte[] bArr) {
        this.zza = zzagcVar;
        this.zzb = i10;
    }

    private final long zzc(zzafq zzafqVar) throws IOException {
        while (zzafqVar.zzm() < zzafqVar.zzo() - 6) {
            zzagc zzagcVar = this.zza;
            int i10 = this.zzb;
            zzafw zzafwVar = this.zzc;
            long jZzm = zzafqVar.zzm();
            zzes zzesVar = new zzes(17);
            zzafqVar.zzi(zzesVar.zzi(), 0, 2);
            if (zzesVar.zzo() != i10) {
                zzafqVar.zzl();
                zzafqVar.zzk((int) (jZzm - zzafqVar.zzn()));
            } else {
                zzesVar.zzf(zzaft.zzb(zzafqVar, zzesVar.zzi(), 2, 15) + 2);
                zzafqVar.zzl();
                zzafqVar.zzk((int) (jZzm - zzafqVar.zzn()));
                if (zzafx.zza(zzesVar, zzagcVar, i10, zzafwVar)) {
                    break;
                }
            }
            zzafqVar.zzk(1);
        }
        if (zzafqVar.zzm() < zzafqVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzafqVar.zzk((int) (zzafqVar.zzo() - zzafqVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final zzaez zza(zzafq zzafqVar, long j10) throws IOException {
        long jZzn = zzafqVar.zzn();
        long jZzc = zzc(zzafqVar);
        long jZzm = zzafqVar.zzm();
        zzafqVar.zzk(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzafqVar);
        long jZzm2 = zzafqVar.zzm();
        if (jZzc > j10 || jZzc2 <= j10) {
            return jZzc2 <= j10 ? zzaez.zzb(jZzc2, jZzm2) : zzaez.zza(jZzc, jZzn);
        }
        return zzaez.zzc(jZzm);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public /* synthetic */ void zzb() {
        e.a(this);
    }
}
