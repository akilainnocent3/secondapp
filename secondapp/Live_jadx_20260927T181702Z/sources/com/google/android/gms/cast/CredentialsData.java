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
import k.h1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "CredentialsDataCreator")
public class CredentialsData extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<CredentialsData> CREATOR = new zzas();

    @NonNull
    public static final String CREDENTIALS_TYPE_ANDROID = "android";

    @NonNull
    public static final String CREDENTIALS_TYPE_CLOUD = "cloud";

    @NonNull
    public static final String CREDENTIALS_TYPE_IOS = "ios";

    @NonNull
    public static final String CREDENTIALS_TYPE_WEB = "web";

    @Nullable
    @SafeParcelable.Field(getter = "getCredentials", id = 1)
    private final String zza;

    @Nullable
    @SafeParcelable.Field(getter = "getCredentialsType", id = 2)
    private final String zzb;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {
        private String zza;
        private String zzb = "android";

        @NonNull
        public CredentialsData build() {
            return new CredentialsData(this.zza, this.zzb);
        }

        @NonNull
        public Builder setCredentials(@NonNull String str) {
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setCredentialsType(@NonNull String str) {
            this.zzb = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    @h1
    public CredentialsData(@Nullable @SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Nullable
    @KeepForSdk
    public static CredentialsData fromJson(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new CredentialsData(CastUtils.optStringOrNull(jSONObject, "credentials"), CastUtils.optStringOrNull(jSONObject, "credentialsType"));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialsData)) {
            return false;
        }
        CredentialsData credentialsData = (CredentialsData) obj;
        return Objects.equal(this.zza, credentialsData.zza) && Objects.equal(this.zzb, credentialsData.zzb);
    }

    @Nullable
    public String getCredentials() {
        return this.zza;
    }

    @Nullable
    public String getCredentialsType() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getCredentials(), false);
        SafeParcelWriter.writeString(parcel, 2, getCredentialsType(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
