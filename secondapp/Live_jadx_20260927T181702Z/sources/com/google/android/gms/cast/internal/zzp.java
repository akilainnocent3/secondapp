package com.google.android.gms.cast.internal;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class zzp {
    protected final Logger zza;
    private final String zzb;

    @Nullable
    private zzar zzc;

    public zzp(String str, String str2, @Nullable String str3) {
        CastUtils.throwIfInvalidNamespace(str);
        this.zzb = str;
        this.zza = new Logger("MediaControlChannel", null);
    }

    public final long zzd() {
        zzar zzarVar = this.zzc;
        if (zzarVar != null) {
            return zzarVar.zza();
        }
        this.zza.e("Attempt to generate requestId without a sink", new Object[0]);
        return 0L;
    }

    public final String zze() {
        return this.zzb;
    }

    public void zzf() {
        throw null;
    }

    public final void zzg(String str, long j10, @Nullable String str2) throws IllegalStateException {
        zzar zzarVar = this.zzc;
        if (zzarVar == null) {
            this.zza.e("Attempt to send text message without a sink", new Object[0]);
        } else {
            zzarVar.zzb(this.zzb, str, j10, null);
        }
    }

    public final void zzh(@Nullable zzar zzarVar) {
        this.zzc = zzarVar;
        if (zzarVar == null) {
            zzf();
        }
    }
}
