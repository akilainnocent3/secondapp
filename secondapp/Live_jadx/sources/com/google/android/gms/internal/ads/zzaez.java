package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaez {
    public static final zzaez zza = new zzaez(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzaez(int i10, long j10, long j11) {
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzaez zza(long j10, long j11) {
        return new zzaez(-1, j10, j11);
    }

    public static zzaez zzb(long j10, long j11) {
        return new zzaez(-2, j10, j11);
    }

    public static zzaez zzc(long j10) {
        return new zzaez(0, -9223372036854775807L, j10);
    }

    public final /* synthetic */ int zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
