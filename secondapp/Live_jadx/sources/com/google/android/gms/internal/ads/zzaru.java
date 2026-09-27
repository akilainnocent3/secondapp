package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaru {
    private final Bundle zza;

    public zzaru(Bundle bundle) {
        this.zza = bundle;
    }

    public final String zza() {
        return this.zza.getString("install_referrer");
    }

    public final long zzb() {
        return this.zza.getLong("referrer_click_timestamp_seconds");
    }

    public final long zzc() {
        return this.zza.getLong("install_begin_timestamp_seconds");
    }

    public final boolean zzd() {
        return this.zza.getBoolean("google_play_instant");
    }

    public final long zze() {
        return this.zza.getLong("referrer_click_timestamp_server_seconds");
    }

    public final long zzf() {
        return this.zza.getLong("install_begin_timestamp_server_seconds");
    }

    public final String zzg() {
        return this.zza.getString("install_version");
    }
}
