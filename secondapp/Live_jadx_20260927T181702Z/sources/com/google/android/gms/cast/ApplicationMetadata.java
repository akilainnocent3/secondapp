package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "ApplicationMetadataCreator")
@SafeParcelable.Reserved({1})
public class ApplicationMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApplicationMetadata> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getApplicationId", id = 2)
    String zza;

    @SafeParcelable.Field(getter = "getName", id = 3)
    String zzb;

    @SafeParcelable.Field(getter = "getSupportedNamespaces", id = 5)
    final List zzc;

    @SafeParcelable.Field(getter = "getSenderAppIdentifier", id = 6)
    String zzd;

    @SafeParcelable.Field(getter = "getSenderAppLaunchUrl", id = 7)
    Uri zze;

    @Nullable
    @SafeParcelable.Field(getter = "getIconUrl", id = 8)
    String zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getApplicationType", id = 9)
    private String zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getSenderConnected", id = 10)
    private Boolean zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getLaunchedFromCloud", id = 11)
    private Boolean zzi;

    private ApplicationMetadata() {
        this.zzc = new ArrayList();
    }

    public boolean areNamespacesSupported(@NonNull List<String> list) {
        List list2 = this.zzc;
        return list2 != null && list2.containsAll(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return CastUtils.zze(this.zza, applicationMetadata.zza) && CastUtils.zze(this.zzb, applicationMetadata.zzb) && CastUtils.zze(this.zzc, applicationMetadata.zzc) && CastUtils.zze(this.zzd, applicationMetadata.zzd) && CastUtils.zze(this.zze, applicationMetadata.zze) && CastUtils.zze(this.zzf, applicationMetadata.zzf) && CastUtils.zze(this.zzg, applicationMetadata.zzg);
    }

    @NonNull
    public String getApplicationId() {
        return this.zza;
    }

    @Nullable
    public String getIconUrl() {
        return this.zzf;
    }

    @Nullable
    @Deprecated
    public List<WebImage> getImages() {
        return null;
    }

    @NonNull
    public String getName() {
        return this.zzb;
    }

    @NonNull
    public String getSenderAppIdentifier() {
        return this.zzd;
    }

    @NonNull
    public List<String> getSupportedNamespaces() {
        return Collections.unmodifiableList(this.zzc);
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    public boolean isNamespaceSupported(@NonNull String str) {
        List list = this.zzc;
        return list != null && list.contains(str);
    }

    public void setIconUrl(@Nullable String str) {
        this.zzf = str;
    }

    @NonNull
    public String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        List list = this.zzc;
        return "applicationId: " + str + ", name: " + str2 + ", namespaces.count: " + (list == null ? 0 : list.size()) + ", senderAppIdentifier: " + this.zzd + ", senderAppLaunchUrl: " + String.valueOf(this.zze) + ", iconUrl: " + this.zzf + ", type: " + this.zzg;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getApplicationId(), false);
        SafeParcelWriter.writeString(parcel, 3, getName(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getImages(), false);
        SafeParcelWriter.writeStringList(parcel, 5, getSupportedNamespaces(), false);
        SafeParcelWriter.writeString(parcel, 6, getSenderAppIdentifier(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zze, i10, false);
        SafeParcelWriter.writeString(parcel, 8, getIconUrl(), false);
        SafeParcelWriter.writeString(parcel, 9, this.zzg, false);
        SafeParcelWriter.writeBooleanObject(parcel, 10, this.zzh, false);
        SafeParcelWriter.writeBooleanObject(parcel, 11, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public ApplicationMetadata(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @Nullable @SafeParcelable.Param(id = 4) List list, @SafeParcelable.Param(id = 5) List list2, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) Uri uri, @Nullable @SafeParcelable.Param(id = 8) String str4, @Nullable @SafeParcelable.Param(id = 9) String str5, @Nullable @SafeParcelable.Param(id = 10) Boolean bool, @Nullable @SafeParcelable.Param(id = 11) Boolean bool2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = list2;
        this.zzd = str3;
        this.zze = uri;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = bool;
        this.zzi = bool2;
    }
}
