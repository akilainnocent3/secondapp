package com.google.android.gms.internal.ads;

import com.ironsource.C4235d4;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaul extends zzilr {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzimb zzm;
    private long zzn;

    public zzaul() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzimb.zzj;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzg + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + C4235d4.j.f61462e;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzilp
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzilw.zza(zzauh.zzd(byteBuffer));
            this.zzh = zzilw.zza(zzauh.zzd(byteBuffer));
            this.zzi = zzauh.zza(byteBuffer);
            this.zzj = zzauh.zzd(byteBuffer);
        } else {
            this.zzg = zzilw.zza(zzauh.zza(byteBuffer));
            this.zzh = zzilw.zza(zzauh.zza(byteBuffer));
            this.zzi = zzauh.zza(byteBuffer);
            this.zzj = zzauh.zza(byteBuffer);
        }
        this.zzk = zzauh.zze(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        zzauh.zzb(byteBuffer);
        zzauh.zza(byteBuffer);
        zzauh.zza(byteBuffer);
        this.zzm = new zzimb(zzauh.zze(byteBuffer), zzauh.zze(byteBuffer), zzauh.zze(byteBuffer), zzauh.zze(byteBuffer), zzauh.zzf(byteBuffer), zzauh.zzf(byteBuffer), zzauh.zzf(byteBuffer), zzauh.zze(byteBuffer), zzauh.zze(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzauh.zza(byteBuffer);
    }
}
