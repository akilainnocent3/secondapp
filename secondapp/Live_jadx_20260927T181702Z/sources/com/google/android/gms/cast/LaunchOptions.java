package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "LaunchOptionsCreator")
@SafeParcelable.Reserved({1})
public class LaunchOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LaunchOptions> CREATOR = new zzbw();

    @SafeParcelable.Field(getter = "getRelaunchIfRunning", id = 2)
    private boolean zza;

    @SafeParcelable.Field(getter = "getLanguage", id = 3)
    private String zzb;

    @SafeParcelable.Field(getter = "getAndroidReceiverCompatible", id = 4)
    private boolean zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getCredentialsData", id = 5)
    private CredentialsData zzd;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {
        private final LaunchOptions zza;

        public Builder() {
            this.zza = new LaunchOptions();
        }

        @NonNull
        public LaunchOptions build() {
            return this.zza;
        }

        @NonNull
        public Builder setAndroidReceiverCompatible(boolean z10) {
            this.zza.zzb(z10);
            return this;
        }

        @NonNull
        public Builder setCredentialsData(@NonNull CredentialsData credentialsData) {
            this.zza.zzd = credentialsData;
            return this;
        }

        @NonNull
        public Builder setLocale(@NonNull Locale locale) {
            this.zza.setLanguage(CastUtils.zzb(locale));
            return this;
        }

        @NonNull
        public Builder setRelaunchIfRunning(boolean z10) {
            this.zza.setRelaunchIfRunning(z10);
            return this;
        }

        public Builder(@NonNull LaunchOptions launchOptions) {
            this.zza = new LaunchOptions(launchOptions.getRelaunchIfRunning(), launchOptions.getLanguage(), launchOptions.getAndroidReceiverCompatible(), launchOptions.getCredentialsData());
        }
    }

    public LaunchOptions() {
        this(false, CastUtils.zzb(Locale.getDefault()), false, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        return this.zza == launchOptions.zza && CastUtils.zze(this.zzb, launchOptions.zzb) && this.zzc == launchOptions.zzc && CastUtils.zze(this.zzd, launchOptions.zzd);
    }

    public boolean getAndroidReceiverCompatible() {
        return this.zzc;
    }

    @Nullable
    public CredentialsData getCredentialsData() {
        return this.zzd;
    }

    @NonNull
    public String getLanguage() {
        return this.zzb;
    }

    public boolean getRelaunchIfRunning() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), this.zzb, Boolean.valueOf(this.zzc), this.zzd);
    }

    public void setLanguage(@NonNull String str) {
        this.zzb = str;
    }

    public void setRelaunchIfRunning(boolean z10) {
        this.zza = z10;
    }

    @NonNull
    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.zza), this.zzb, Boolean.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, getRelaunchIfRunning());
        SafeParcelWriter.writeString(parcel, 3, getLanguage(), false);
        SafeParcelWriter.writeBoolean(parcel, 4, getAndroidReceiverCompatible());
        SafeParcelWriter.writeParcelable(parcel, 5, getCredentialsData(), i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final void zzb(boolean z10) {
        this.zzc = z10;
    }

    @SafeParcelable.Constructor
    public LaunchOptions(@SafeParcelable.Param(id = 2) boolean z10, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) boolean z11, @Nullable @SafeParcelable.Param(id = 5) CredentialsData credentialsData) {
        this.zza = z10;
        this.zzb = str;
        this.zzc = z11;
        this.zzd = credentialsData;
    }
}
