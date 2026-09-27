package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.cast.zzev;
import com.google.android.gms.internal.cast.zzez;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "CastOptionsCreator")
@SafeParcelable.Reserved({1})
public class CastOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CastOptions> CREATOR;

    @h1
    static final zzj zza = new zzj(false);

    @h1
    static final zzl zzb = new zzl(0);

    @h1
    static final CastMediaOptions zzc;

    @SafeParcelable.Field(getter = "getReceiverApplicationId", id = 2)
    private String zzd;

    @SafeParcelable.Field(getter = "getSupportedNamespaces", id = 3)
    private final List zze;

    @SafeParcelable.Field(getter = "getStopReceiverApplicationWhenEndingSession", id = 4)
    private final boolean zzf;

    @SafeParcelable.Field(getter = "getLaunchOptions", id = 5)
    private LaunchOptions zzg;

    @SafeParcelable.Field(getter = "getResumeSavedSession", id = 6)
    private final boolean zzh;

    @SafeParcelable.Field(getter = "getCastMediaOptions", id = 7)
    private final CastMediaOptions zzi;

    @SafeParcelable.Field(getter = "getEnableReconnectionService", id = 8)
    private final boolean zzj;

    @SafeParcelable.Field(getter = "getVolumeDeltaBeforeIceCreamSandwich", id = 9)
    private final double zzk;

    @SafeParcelable.Field(getter = "getEnableIpv6Support", id = 10)
    private final boolean zzl;

    @SafeParcelable.Field(getter = "getOutputSwitcherEnabled", id = 11)
    private final boolean zzm;

    @SafeParcelable.Field(getter = "isRemoteToLocalEnabled", id = 12)
    private final boolean zzn;

    @SafeParcelable.Field(getter = "getRouteDiscoveryReceiverApplicationIds", id = 13)
    private final List zzo;

    @SafeParcelable.Field(getter = "isSessionTransferEnabled", id = 14)
    private final boolean zzp;

    @SafeParcelable.Field(getter = "isResumeSessionAfterTransferEnabled", id = 16)
    private final boolean zzq;

    @SafeParcelable.Field(getter = "getCastExperimentOptions", id = 17)
    private final zzj zzr;

    @SafeParcelable.Field(getter = "getCastFeatureVersions", id = 18)
    private zzl zzs;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Builder {
        private String zza;
        private boolean zzc;
        private List zzb = new ArrayList();
        private LaunchOptions zzd = new LaunchOptions();
        private boolean zze = true;
        private zzev zzf = zzev.zzb();
        private boolean zzg = true;
        private double zzh = 0.05000000074505806d;
        private boolean zzi = false;
        private final List zzj = new ArrayList();
        private boolean zzk = true;
        private final zzev zzl = zzev.zzb();
        private final zzev zzm = zzev.zzb();

        @NonNull
        public CastOptions build() {
            Object objZza = this.zzf.zza(CastOptions.zzc);
            zzj zzjVar = CastOptions.zza;
            zzez.zzc(zzjVar, "use Optional.orNull() instead of Optional.or(null)");
            zzl zzlVar = CastOptions.zzb;
            zzez.zzc(zzlVar, "use Optional.orNull() instead of Optional.or(null)");
            return new CastOptions(this.zza, this.zzb, this.zzc, this.zzd, this.zze, (CastMediaOptions) objZza, this.zzg, this.zzh, false, false, this.zzi, this.zzj, this.zzk, 0, false, zzjVar, zzlVar);
        }

        @NonNull
        public Builder setCastMediaOptions(@NonNull CastMediaOptions castMediaOptions) {
            this.zzf = zzev.zzc(castMediaOptions);
            return this;
        }

        @NonNull
        public Builder setEnableReconnectionService(boolean z10) {
            this.zzg = z10;
            return this;
        }

        @NonNull
        public Builder setLaunchOptions(@NonNull LaunchOptions launchOptions) {
            this.zzd = launchOptions;
            return this;
        }

        @NonNull
        public Builder setReceiverApplicationId(@NonNull String str) {
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setRemoteToLocalEnabled(boolean z10) {
            this.zzi = z10;
            return this;
        }

        @NonNull
        public Builder setResumeSavedSession(boolean z10) {
            this.zze = z10;
            return this;
        }

        @NonNull
        public Builder setSessionTransferEnabled(boolean z10) {
            this.zzk = z10;
            return this;
        }

        @NonNull
        public Builder setStopReceiverApplicationWhenEndingSession(boolean z10) {
            this.zzc = z10;
            return this;
        }

        @NonNull
        public Builder setSupportedNamespaces(@NonNull List<String> list) {
            this.zzb = list;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setVolumeDeltaBeforeIceCreamSandwich(double d10) throws IllegalArgumentException {
            if (d10 <= 0.0d || d10 > 0.5d) {
                throw new IllegalArgumentException("volumeDelta must be greater than 0 and less or equal to 0.5");
            }
            this.zzh = d10;
            return this;
        }
    }

    static {
        CastMediaOptions.Builder builder = new CastMediaOptions.Builder();
        builder.setMediaSessionEnabled(false);
        builder.setNotificationOptions(null);
        zzc = builder.build();
        CREATOR = new zzn();
    }

    @SafeParcelable.Constructor
    public CastOptions(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) List list, @SafeParcelable.Param(id = 4) boolean z10, @SafeParcelable.Param(id = 5) LaunchOptions launchOptions, @SafeParcelable.Param(id = 6) boolean z11, @SafeParcelable.Param(id = 7) CastMediaOptions castMediaOptions, @SafeParcelable.Param(id = 8) boolean z12, @SafeParcelable.Param(id = 9) double d10, @SafeParcelable.Param(id = 10) boolean z13, @SafeParcelable.Param(id = 11) boolean z14, @SafeParcelable.Param(id = 12) boolean z15, @SafeParcelable.Param(id = 13) List list2, @SafeParcelable.Param(id = 14) boolean z16, @SafeParcelable.Param(id = 15) int i10, @SafeParcelable.Param(id = 16) boolean z17, @SafeParcelable.Param(id = 17) zzj zzjVar, @SafeParcelable.Param(id = 18) zzl zzlVar) {
        this.zzd = true == TextUtils.isEmpty(str) ? "" : str;
        int size = list == null ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        this.zze = arrayList;
        if (size > 0) {
            arrayList.addAll(list);
        }
        this.zzf = z10;
        this.zzg = launchOptions == null ? new LaunchOptions() : launchOptions;
        this.zzh = z11;
        this.zzi = castMediaOptions;
        this.zzj = z12;
        this.zzk = d10;
        this.zzl = z13;
        this.zzm = z14;
        this.zzn = z15;
        this.zzo = list2;
        this.zzp = z16;
        this.zzq = z17;
        this.zzr = zzjVar;
        this.zzs = zzlVar;
    }

    @NonNull
    public CastMediaOptions getCastMediaOptions() {
        return this.zzi;
    }

    public boolean getEnableReconnectionService() {
        return this.zzj;
    }

    @NonNull
    public LaunchOptions getLaunchOptions() {
        return this.zzg;
    }

    @NonNull
    public String getReceiverApplicationId() {
        return this.zzd;
    }

    public boolean getResumeSavedSession() {
        return this.zzh;
    }

    public boolean getStopReceiverApplicationWhenEndingSession() {
        return this.zzf;
    }

    @NonNull
    public List<String> getSupportedNamespaces() {
        return Collections.unmodifiableList(this.zze);
    }

    @Deprecated
    public double getVolumeDeltaBeforeIceCreamSandwich() {
        return this.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getReceiverApplicationId(), false);
        SafeParcelWriter.writeStringList(parcel, 3, getSupportedNamespaces(), false);
        SafeParcelWriter.writeBoolean(parcel, 4, getStopReceiverApplicationWhenEndingSession());
        SafeParcelWriter.writeParcelable(parcel, 5, getLaunchOptions(), i10, false);
        SafeParcelWriter.writeBoolean(parcel, 6, getResumeSavedSession());
        SafeParcelWriter.writeParcelable(parcel, 7, getCastMediaOptions(), i10, false);
        SafeParcelWriter.writeBoolean(parcel, 8, getEnableReconnectionService());
        SafeParcelWriter.writeDouble(parcel, 9, getVolumeDeltaBeforeIceCreamSandwich());
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzn);
        SafeParcelWriter.writeStringList(parcel, 13, Collections.unmodifiableList(this.zzo), false);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzp);
        SafeParcelWriter.writeInt(parcel, 15, 0);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzq);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzr, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 18, this.zzs, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    @ShowFirstParty
    public final List zza() {
        return Collections.unmodifiableList(this.zzo);
    }

    @ShowFirstParty
    public final void zzb(zzl zzlVar) {
        this.zzs = zzlVar;
    }

    public final void zzc(@NonNull LaunchOptions launchOptions) {
        this.zzg = launchOptions;
    }

    public final void zzd(@NonNull String str) {
        this.zzd = str;
    }

    public final boolean zze() {
        return this.zzm;
    }

    public final boolean zzf() {
        return this.zzn;
    }

    public final boolean zzg() {
        return this.zzq;
    }

    public final boolean zzh() {
        return this.zzp;
    }
}
