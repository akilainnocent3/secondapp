package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "MediaQueueContainerMetadataCreator")
@SafeParcelable.Reserved({1})
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaQueueContainerMetadata> CREATOR = new zzcg();
    public static final int MEDIA_QUEUE_CONTAINER_TYPE_AUDIO_BOOK = 1;
    public static final int MEDIA_QUEUE_CONTAINER_TYPE_GENERIC = 0;

    @SafeParcelable.Field(getter = "getContainerType", id = 2)
    private int zza;

    @Nullable
    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getSections", id = 4)
    private List zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getContainerImages", id = 5)
    private List zzd;

    @SafeParcelable.Field(getter = "getContainerDuration", id = 6)
    private double zze;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {
        private final MediaQueueContainerMetadata zza = new MediaQueueContainerMetadata(null);

        @NonNull
        public MediaQueueContainerMetadata build() {
            return new MediaQueueContainerMetadata(this.zza, null);
        }

        @NonNull
        public Builder setContainerDuration(double d10) {
            this.zza.zze = d10;
            return this;
        }

        @NonNull
        public Builder setContainerImages(@Nullable List<WebImage> list) {
            MediaQueueContainerMetadata.zzd(this.zza, list);
            return this;
        }

        @NonNull
        public Builder setContainerType(int i10) {
            this.zza.zza = i10;
            return this;
        }

        @NonNull
        public Builder setSections(@Nullable List<MediaMetadata> list) {
            this.zza.zzg(list);
            return this;
        }

        @NonNull
        public Builder setTitle(@Nullable String str) {
            this.zza.zzb = str;
            return this;
        }

        @NonNull
        public final Builder zza(@NonNull JSONObject jSONObject) {
            MediaQueueContainerMetadata.zzb(this.zza, jSONObject);
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaQueueContainerType {
    }

    private MediaQueueContainerMetadata() {
        zzh();
    }

    public static /* bridge */ /* synthetic */ void zzb(MediaQueueContainerMetadata mediaQueueContainerMetadata, JSONObject jSONObject) {
        mediaQueueContainerMetadata.zzh();
        String strOptString = jSONObject.optString("containerType", "");
        int iHashCode = strOptString.hashCode();
        if (iHashCode != 6924225) {
            if (iHashCode == 828666841 && strOptString.equals("GENERIC_CONTAINER")) {
                mediaQueueContainerMetadata.zza = 0;
            }
        } else if (strOptString.equals("AUDIOBOOK_CONTAINER")) {
            mediaQueueContainerMetadata.zza = 1;
        }
        mediaQueueContainerMetadata.zzb = CastUtils.optStringOrNull(jSONObject, "title");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sections");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            mediaQueueContainerMetadata.zzc = arrayList;
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    MediaMetadata mediaMetadata = new MediaMetadata();
                    mediaMetadata.zzc(jSONObjectOptJSONObject);
                    arrayList.add(mediaMetadata);
                }
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("containerImages");
        if (jSONArrayOptJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            mediaQueueContainerMetadata.zzd = arrayList2;
            com.google.android.gms.cast.internal.media.zza.zzd(arrayList2, jSONArrayOptJSONArray2);
        }
        mediaQueueContainerMetadata.zze = jSONObject.optDouble("containerDuration", mediaQueueContainerMetadata.zze);
    }

    public static /* bridge */ /* synthetic */ void zzd(MediaQueueContainerMetadata mediaQueueContainerMetadata, List list) {
        mediaQueueContainerMetadata.zzd = list == null ? null : new ArrayList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        this.zza = 0;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 0.0d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueContainerMetadata)) {
            return false;
        }
        MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
        return this.zza == mediaQueueContainerMetadata.zza && TextUtils.equals(this.zzb, mediaQueueContainerMetadata.zzb) && Objects.equal(this.zzc, mediaQueueContainerMetadata.zzc) && Objects.equal(this.zzd, mediaQueueContainerMetadata.zzd) && this.zze == mediaQueueContainerMetadata.zze;
    }

    public double getContainerDuration() {
        return this.zze;
    }

    @Nullable
    public List<WebImage> getContainerImages() {
        List list = this.zzd;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public int getContainerType() {
        return this.zza;
    }

    @Nullable
    public List<MediaMetadata> getSections() {
        List list = this.zzc;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    @Nullable
    public String getTitle() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd, Double.valueOf(this.zze));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getContainerType());
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getSections(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, getContainerImages(), false);
        SafeParcelWriter.writeDouble(parcel, 6, getContainerDuration());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.zza;
            if (i10 == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i10 == 1) {
                jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.zzb)) {
                jSONObject.put("title", this.zzb);
            }
            List list = this.zzc;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaMetadata) it.next()).zza());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.zzd;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", com.google.android.gms.cast.internal.media.zza.zzc(this.zzd));
            }
            jSONObject.put("containerDuration", this.zze);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final void zzg(@Nullable List list) {
        this.zzc = list == null ? null : new ArrayList(list);
    }

    @SafeParcelable.Constructor
    public MediaQueueContainerMetadata(@SafeParcelable.Param(id = 2) int i10, @Nullable @SafeParcelable.Param(id = 3) String str, @Nullable @SafeParcelable.Param(id = 4) List list, @Nullable @SafeParcelable.Param(id = 5) List list2, @SafeParcelable.Param(id = 6) double d10) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = list;
        this.zzd = list2;
        this.zze = d10;
    }

    public /* synthetic */ MediaQueueContainerMetadata(zzcf zzcfVar) {
        zzh();
    }

    public /* synthetic */ MediaQueueContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata, zzcf zzcfVar) {
        this.zza = mediaQueueContainerMetadata.zza;
        this.zzb = mediaQueueContainerMetadata.zzb;
        this.zzc = mediaQueueContainerMetadata.zzc;
        this.zzd = mediaQueueContainerMetadata.zzd;
        this.zze = mediaQueueContainerMetadata.zze;
    }
}
