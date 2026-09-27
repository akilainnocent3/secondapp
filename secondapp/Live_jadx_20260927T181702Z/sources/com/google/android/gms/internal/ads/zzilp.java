package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzilp implements zzaui {
    private static final zzima zzg = zzima.zzb(zzilp.class);
    protected final String zza;
    long zzd;
    zzilu zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    public zzilp(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        try {
            if (this.zzc) {
                return;
            }
            try {
                zzima zzimaVar = zzg;
                String str = this.zza;
                zzimaVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzh = this.zzf.zze(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzb(zzilu zziluVar, ByteBuffer byteBuffer, long j10, zzauf zzaufVar) throws IOException {
        this.zzd = zziluVar.zzc();
        byteBuffer.remaining();
        this.zze = j10;
        this.zzf = zziluVar;
        zziluVar.zzd(zziluVar.zzc() + j10);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        try {
            zzc();
            zzima zzimaVar = zzg;
            String str = this.zza;
            zzimaVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.zzh;
            if (byteBuffer != null) {
                this.zzb = true;
                byteBuffer.rewind();
                zze(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.zzh = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
