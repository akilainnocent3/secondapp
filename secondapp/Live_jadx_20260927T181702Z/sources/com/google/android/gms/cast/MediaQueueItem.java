package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "MediaQueueItemCreator")
@SafeParcelable.Reserved({1})
public class MediaQueueItem extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<MediaQueueItem> CREATOR = new zzck();
    public static final double DEFAULT_PLAYBACK_DURATION = Double.POSITIVE_INFINITY;
    public static final int INVALID_ITEM_ID = 0;

    @Nullable
    @SafeParcelable.Field(id = 9)
    String zza;

    @Nullable
    @SafeParcelable.Field(getter = "getMedia", id = 2)
    private MediaInfo zzb;

    @SafeParcelable.Field(getter = "getItemId", id = 3)
    private int zzc;

    @SafeParcelable.Field(getter = "getAutoplay", id = 4)
    private boolean zzd;

    @SafeParcelable.Field(getter = "getStartTime", id = 5)
    private double zze;

    @SafeParcelable.Field(getter = "getPlaybackDuration", id = 6)
    private double zzf;

    @SafeParcelable.Field(getter = "getPreloadTime", id = 7)
    private double zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getActiveTrackIds", id = 8)
    private long[] zzh;

    @Nullable
    private JSONObject zzi;
    private final Writer zzj;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {
        private final MediaQueueItem zza;

        public Builder(@NonNull MediaInfo mediaInfo) throws IllegalArgumentException {
            this.zza = new MediaQueueItem(mediaInfo, (zzcj) null);
        }

        @NonNull
        public MediaQueueItem build() {
            this.zza.zzi();
            return this.zza;
        }

        @NonNull
        public Builder clearItemId() {
            this.zza.getWriter().setItemId(0);
            return this;
        }

        @NonNull
        public Builder setActiveTrackIds(@NonNull long[] jArr) {
            this.zza.getWriter().setActiveTrackIds(jArr);
            return this;
        }

        @NonNull
        public Builder setAutoplay(boolean z10) {
            this.zza.getWriter().setAutoplay(z10);
            return this;
        }

        @NonNull
        public Builder setCustomData(@NonNull JSONObject jSONObject) {
            this.zza.getWriter().setCustomData(jSONObject);
            return this;
        }

        @NonNull
        public Builder setItemId(int i10) {
            this.zza.getWriter().setItemId(i10);
            return this;
        }

        @NonNull
        public Builder setPlaybackDuration(double d10) {
            this.zza.getWriter().setPlaybackDuration(d10);
            return this;
        }

        @NonNull
        public Builder setPreloadTime(double d10) throws IllegalArgumentException {
            this.zza.getWriter().setPreloadTime(d10);
            return this;
        }

        @NonNull
        public Builder setStartTime(double d10) throws IllegalArgumentException {
            this.zza.getWriter().setStartTime(d10);
            return this;
        }

        public Builder(@NonNull MediaQueueItem mediaQueueItem) throws IllegalArgumentException {
            this.zza = new MediaQueueItem(mediaQueueItem, (zzcj) null);
        }

        public Builder(@NonNull JSONObject jSONObject) throws JSONException {
            this.zza = new MediaQueueItem(jSONObject);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @KeepForSdk
    public class Writer {
        public Writer() {
        }

        @KeepForSdk
        public void setActiveTrackIds(@Nullable long[] jArr) {
            MediaQueueItem.this.zzh = jArr;
        }

        @KeepForSdk
        public void setAutoplay(boolean z10) {
            MediaQueueItem.this.zzd = z10;
        }

        @KeepForSdk
        public void setCustomData(@Nullable JSONObject jSONObject) {
            MediaQueueItem.this.zzi = jSONObject;
        }

        @KeepForSdk
        public void setItemId(int i10) {
            MediaQueueItem.this.zzc = i10;
        }

        @KeepForSdk
        public void setMedia(@Nullable MediaInfo mediaInfo) {
            MediaQueueItem.this.zzb = mediaInfo;
        }

        @KeepForSdk
        public void setPlaybackDuration(double d10) {
            if (Double.isNaN(d10)) {
                throw new IllegalArgumentException("playbackDuration cannot be NaN.");
            }
            MediaQueueItem.this.zzf = d10;
        }

        @KeepForSdk
        public void setPreloadTime(double d10) {
            if (Double.isNaN(d10) || d10 < 0.0d) {
                throw new IllegalArgumentException("preloadTime cannot be negative or NaN.");
            }
            MediaQueueItem.this.zzg = d10;
        }

        @KeepForSdk
        public void setStartTime(double d10) {
            if (!Double.isNaN(d10) && d10 < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative.");
            }
            MediaQueueItem.this.zze = d10;
        }
    }

    @SafeParcelable.Constructor
    public MediaQueueItem(@Nullable @SafeParcelable.Param(id = 2) MediaInfo mediaInfo, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) boolean z10, @SafeParcelable.Param(id = 5) double d10, @SafeParcelable.Param(id = 6) double d11, @SafeParcelable.Param(id = 7) double d12, @Nullable @SafeParcelable.Param(id = 8) long[] jArr, @Nullable @SafeParcelable.Param(id = 9) String str) {
        this.zze = Double.NaN;
        this.zzj = new Writer();
        this.zzb = mediaInfo;
        this.zzc = i10;
        this.zzd = z10;
        this.zze = d10;
        this.zzf = d11;
        this.zzg = d12;
        this.zzh = jArr;
        this.zza = str;
        if (str == null) {
            this.zzi = null;
            return;
        }
        try {
            this.zzi = new JSONObject(this.zza);
        } catch (JSONException unused) {
            this.zzi = null;
            this.zza = null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueItem)) {
            return false;
        }
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj;
        JSONObject jSONObject = this.zzi;
        boolean z10 = jSONObject == null;
        JSONObject jSONObject2 = mediaQueueItem.zzi;
        if (z10 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || JsonUtils.areJsonValuesEquivalent(jSONObject, jSONObject2)) && CastUtils.zze(this.zzb, mediaQueueItem.zzb) && this.zzc == mediaQueueItem.zzc && this.zzd == mediaQueueItem.zzd && ((Double.isNaN(this.zze) && Double.isNaN(mediaQueueItem.zze)) || this.zze == mediaQueueItem.zze) && this.zzf == mediaQueueItem.zzf && this.zzg == mediaQueueItem.zzg && Arrays.equals(this.zzh, mediaQueueItem.zzh);
    }

    @KeepForSdk
    public boolean fromJson(@NonNull JSONObject jSONObject) throws JSONException {
        boolean z10;
        long[] jArr;
        boolean z11;
        int i10;
        boolean z12 = false;
        if (jSONObject.has("media")) {
            this.zzb = new MediaInfo(jSONObject.getJSONObject("media"));
            z10 = true;
        } else {
            z10 = false;
        }
        if (jSONObject.has("itemId") && this.zzc != (i10 = jSONObject.getInt("itemId"))) {
            this.zzc = i10;
            z10 = true;
        }
        if (jSONObject.has("autoplay") && this.zzd != (z11 = jSONObject.getBoolean("autoplay"))) {
            this.zzd = z11;
            z10 = true;
        }
        double dOptDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(dOptDouble) != Double.isNaN(this.zze) || (!Double.isNaN(dOptDouble) && Math.abs(dOptDouble - this.zze) > 1.0E-7d)) {
            this.zze = dOptDouble;
            z10 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d10 = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d10 - this.zzf) > 1.0E-7d) {
                this.zzf = d10;
                z10 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d11 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d11 - this.zzg) > 1.0E-7d) {
                this.zzg = d11;
                z10 = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                jArr[i11] = jSONArray.getLong(i11);
            }
            long[] jArr2 = this.zzh;
            if (jArr2 == null || jArr2.length != length) {
                z12 = true;
                break;
            }
            for (int i12 = 0; i12 < length; i12++) {
                if (this.zzh[i12] != jArr[i12]) {
                    z12 = true;
                    break;
                }
            }
        } else {
            jArr = null;
        }
        if (z12) {
            this.zzh = jArr;
            z10 = true;
        }
        if (!jSONObject.has("customData")) {
            return z10;
        }
        this.zzi = jSONObject.getJSONObject("customData");
        return true;
    }

    @Nullable
    public long[] getActiveTrackIds() {
        return this.zzh;
    }

    public boolean getAutoplay() {
        return this.zzd;
    }

    @Nullable
    public JSONObject getCustomData() {
        return this.zzi;
    }

    public int getItemId() {
        return this.zzc;
    }

    @Nullable
    public MediaInfo getMedia() {
        return this.zzb;
    }

    public double getPlaybackDuration() {
        return this.zzf;
    }

    public double getPreloadTime() {
        return this.zzg;
    }

    public double getStartTime() {
        return this.zze;
    }

    @NonNull
    @KeepForSdk
    public Writer getWriter() {
        return this.zzj;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzb, Integer.valueOf(this.zzc), Boolean.valueOf(this.zzd), Double.valueOf(this.zze), Double.valueOf(this.zzf), Double.valueOf(this.zzg), Integer.valueOf(Arrays.hashCode(this.zzh)), String.valueOf(this.zzi));
    }

    @NonNull
    @KeepForSdk
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.zzb;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.zza());
            }
            int i10 = this.zzc;
            if (i10 != 0) {
                jSONObject.put("itemId", i10);
            }
            jSONObject.put("autoplay", this.zzd);
            if (!Double.isNaN(this.zze)) {
                jSONObject.put("startTime", this.zze);
            }
            double d10 = this.zzf;
            if (d10 != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d10);
            }
            jSONObject.put("preloadTime", this.zzg);
            if (this.zzh != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j10 : this.zzh) {
                    jSONArray.put(j10);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.zzi;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        JSONObject jSONObject = this.zzi;
        this.zza = jSONObject == null ? null : jSONObject.toString();
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getMedia(), i10, false);
        SafeParcelWriter.writeInt(parcel, 3, getItemId());
        SafeParcelWriter.writeBoolean(parcel, 4, getAutoplay());
        SafeParcelWriter.writeDouble(parcel, 5, getStartTime());
        SafeParcelWriter.writeDouble(parcel, 6, getPlaybackDuration());
        SafeParcelWriter.writeDouble(parcel, 7, getPreloadTime());
        SafeParcelWriter.writeLongArray(parcel, 8, getActiveTrackIds(), false);
        SafeParcelWriter.writeString(parcel, 9, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final void zzi() throws IllegalArgumentException {
        if (this.zzb == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(this.zze) && this.zze < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(this.zzf)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(this.zzg) || this.zzg < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public /* synthetic */ MediaQueueItem(MediaInfo mediaInfo, zzcj zzcjVar) {
        this(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    public /* synthetic */ MediaQueueItem(MediaQueueItem mediaQueueItem, zzcj zzcjVar) {
        this(mediaQueueItem.getMedia(), mediaQueueItem.getItemId(), mediaQueueItem.getAutoplay(), mediaQueueItem.getStartTime(), mediaQueueItem.getPlaybackDuration(), mediaQueueItem.getPreloadTime(), mediaQueueItem.getActiveTrackIds(), null);
        if (this.zzb != null) {
            this.zzi = mediaQueueItem.getCustomData();
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @KeepForSdk
    public MediaQueueItem(@NonNull JSONObject jSONObject) throws JSONException {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        fromJson(jSONObject);
    }
}
