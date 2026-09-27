package com.google.android.gms.cast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class MediaLoadOptions {
    public static final double PLAYBACK_RATE_MAX = 2.0d;
    public static final double PLAYBACK_RATE_MIN = 0.5d;
    private final boolean zza;
    private final long zzb;
    private final double zzc;

    @Nullable
    private final long[] zzd;

    @Nullable
    private final JSONObject zze;

    @Nullable
    private final String zzf;

    @Nullable
    private final String zzg;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {
        private boolean zza = true;
        private long zzb = -1;
        private double zzc = 1.0d;
        private long[] zzd;

        @Nullable
        private JSONObject zze;

        @Nullable
        private String zzf;

        @Nullable
        private String zzg;

        @NonNull
        public MediaLoadOptions build() {
            return new MediaLoadOptions(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, null);
        }

        @NonNull
        public Builder setActiveTrackIds(@NonNull long[] jArr) {
            this.zzd = jArr;
            return this;
        }

        @NonNull
        public Builder setAutoplay(boolean z10) {
            this.zza = z10;
            return this;
        }

        @NonNull
        public Builder setCredentials(@Nullable String str) {
            this.zzf = str;
            return this;
        }

        @NonNull
        public Builder setCredentialsType(@Nullable String str) {
            this.zzg = str;
            return this;
        }

        @NonNull
        public Builder setCustomData(@Nullable JSONObject jSONObject) {
            this.zze = jSONObject;
            return this;
        }

        @NonNull
        public Builder setPlayPosition(long j10) {
            this.zzb = j10;
            return this;
        }

        @NonNull
        public Builder setPlaybackRate(double d10) {
            if (Double.compare(d10, 2.0d) > 0 || Double.compare(d10, 0.5d) < 0) {
                throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            }
            this.zzc = d10;
            return this;
        }
    }

    public /* synthetic */ MediaLoadOptions(boolean z10, long j10, double d10, long[] jArr, JSONObject jSONObject, String str, String str2, zzca zzcaVar) {
        this.zza = z10;
        this.zzb = j10;
        this.zzc = d10;
        this.zzd = jArr;
        this.zze = jSONObject;
        this.zzf = str;
        this.zzg = str2;
    }

    @Nullable
    public long[] getActiveTrackIds() {
        return this.zzd;
    }

    public boolean getAutoplay() {
        return this.zza;
    }

    @Nullable
    public String getCredentials() {
        return this.zzf;
    }

    @Nullable
    public String getCredentialsType() {
        return this.zzg;
    }

    @Nullable
    public JSONObject getCustomData() {
        return this.zze;
    }

    public long getPlayPosition() {
        return this.zzb;
    }

    public double getPlaybackRate() {
        return this.zzc;
    }
}
