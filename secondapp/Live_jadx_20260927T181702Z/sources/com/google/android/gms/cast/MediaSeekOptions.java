package com.google.android.gms.cast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class MediaSeekOptions {
    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    private final long zza;
    private final int zzb;
    private final boolean zzc;

    @Nullable
    private final JSONObject zzd;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {
        private long zza;
        private int zzb = 0;
        private boolean zzc;

        @Nullable
        private JSONObject zzd;

        @NonNull
        public MediaSeekOptions build() {
            return new MediaSeekOptions(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        @NonNull
        public Builder setCustomData(@Nullable JSONObject jSONObject) {
            this.zzd = jSONObject;
            return this;
        }

        @NonNull
        public Builder setIsSeekToInfinite(boolean z10) {
            this.zzc = z10;
            return this;
        }

        @NonNull
        public Builder setPosition(long j10) {
            this.zza = j10;
            return this;
        }

        @NonNull
        public Builder setResumeState(int i10) {
            this.zzb = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResumeState {
    }

    public /* synthetic */ MediaSeekOptions(long j10, int i10, boolean z10, JSONObject jSONObject, zzcl zzclVar) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = z10;
        this.zzd = jSONObject;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSeekOptions)) {
            return false;
        }
        MediaSeekOptions mediaSeekOptions = (MediaSeekOptions) obj;
        return this.zza == mediaSeekOptions.zza && this.zzb == mediaSeekOptions.zzb && this.zzc == mediaSeekOptions.zzc && Objects.equal(this.zzd, mediaSeekOptions.zzd);
    }

    @Nullable
    public JSONObject getCustomData() {
        return this.zzd;
    }

    public long getPosition() {
        return this.zza;
    }

    public int getResumeState() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc), this.zzd);
    }

    public boolean isSeekToInfinite() {
        return this.zzc;
    }
}
