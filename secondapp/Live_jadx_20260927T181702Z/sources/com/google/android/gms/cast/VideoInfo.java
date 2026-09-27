package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "VideoInfoCreator")
@SafeParcelable.Reserved({1})
public final class VideoInfo extends AbstractSafeParcelable {
    public static final int HDR_TYPE_DV = 3;
    public static final int HDR_TYPE_HDR = 4;
    public static final int HDR_TYPE_HDR10 = 2;
    public static final int HDR_TYPE_SDR = 1;
    public static final int HDR_TYPE_UNKNOWN = 0;

    @SafeParcelable.Field(getter = "getWidth", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getHeight", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getHdrType", id = 4)
    private final int zzd;
    private static final Logger zza = new Logger("VideoInfo");

    @NonNull
    public static final Parcelable.Creator<VideoInfo> CREATOR = new zzdu();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {
        private int zza;
        private int zzb;
        private int zzc;

        @NonNull
        public VideoInfo build() {
            return new VideoInfo(this.zza, this.zzb, this.zzc);
        }

        @NonNull
        public Builder setHdrType(int i10) {
            this.zzc = i10;
            return this;
        }

        @NonNull
        public Builder setHeight(int i10) {
            this.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setWidth(int i10) {
            this.zza = i10;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public VideoInfo(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) int i12) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: JSONException -> 0x0069, TRY_ENTER, TryCatch #0 {JSONException -> 0x0069, blocks: (B:6:0x0005, B:29:0x0057, B:28:0x004b), top: B:34:0x0005 }] */
    @Nullable
    public static VideoInfo zza(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("hdrType");
            int iHashCode = string.hashCode();
            int i10 = 1;
            if (iHashCode != 3218) {
                if (iHashCode != 103158) {
                    if (iHashCode != 113729) {
                        if (iHashCode == 99136405 && string.equals("hdr10")) {
                            i10 = 2;
                        } else {
                            zza.d("Unknown HDR type: %s", string);
                            i10 = 0;
                        }
                    } else if (!string.equals("sdr")) {
                        zza.d("Unknown HDR type: %s", string);
                        i10 = 0;
                    }
                } else if (string.equals("hdr")) {
                    i10 = 4;
                } else {
                    zza.d("Unknown HDR type: %s", string);
                    i10 = 0;
                }
            } else if (string.equals("dv")) {
                i10 = 3;
            } else {
                zza.d("Unknown HDR type: %s", string);
                i10 = 0;
            }
            return new VideoInfo(jSONObject.getInt("width"), jSONObject.getInt("height"), i10);
        } catch (JSONException e10) {
            zza.d(e10, "Error while creating a VideoInfo instance from JSON", new Object[0]);
            return null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return this.zzc == videoInfo.getHeight() && this.zzb == videoInfo.getWidth() && this.zzd == videoInfo.getHdrType();
    }

    public int getHdrType() {
        return this.zzd;
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getWidth() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.writeInt(parcel, 4, getHdrType());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final JSONObject zzb() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", this.zzb);
            jSONObject.put("height", this.zzc);
            int i10 = this.zzd;
            if (i10 == 1) {
                str = "sdr";
            } else if (i10 == 2) {
                str = "hdr10";
            } else if (i10 != 3) {
                str = i10 != 4 ? null : "hdr";
            } else {
                str = "dv";
            }
            jSONObject.put("hdrType", str);
            return jSONObject;
        } catch (JSONException unused) {
            zza.e("Failed to transform VideoInfo into Json", new Object[0]);
            return new JSONObject();
        }
    }
}
