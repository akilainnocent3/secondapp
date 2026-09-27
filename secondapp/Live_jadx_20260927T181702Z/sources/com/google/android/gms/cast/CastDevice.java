package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.Y1;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "CastDeviceCreator")
@SafeParcelable.Reserved({1})
public class CastDevice extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final int CAPABILITY_AUDIO_IN = 8;
    public static final int CAPABILITY_AUDIO_OUT = 4;
    public static final int CAPABILITY_MULTIZONE_GROUP = 32;
    public static final int CAPABILITY_VIDEO_IN = 2;
    public static final int CAPABILITY_VIDEO_OUT = 1;

    @NonNull
    public static final Parcelable.Creator<CastDevice> CREATOR = new zzs();

    @SafeParcelable.Field(id = 3)
    final String zza;

    @SafeParcelable.Field(getter = "getDeviceIdRaw", id = 2)
    private final String zzb;
    private InetAddress zzc;

    @SafeParcelable.Field(getter = "getFriendlyName", id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getModelName", id = 5)
    private final String zze;

    @SafeParcelable.Field(getter = "getDeviceVersion", id = 6)
    private final String zzf;

    @SafeParcelable.Field(getter = "getServicePort", id = 7)
    private final int zzg;

    @SafeParcelable.Field(getter = "getIcons", id = 8)
    private final List zzh;

    @SafeParcelable.Field(getter = "getCapabilities", id = 9)
    private final int zzi;

    @SafeParcelable.Field(defaultValue = Y1.f60333f, getter = "getStatus", id = 10)
    private final int zzj;

    @SafeParcelable.Field(getter = "getServiceInstanceName", id = 11)
    private final String zzk;

    @Nullable
    @SafeParcelable.Field(getter = "getReceiverMetricsId", id = 12)
    private final String zzl;

    @SafeParcelable.Field(getter = "getRcnEnabledStatus", id = 13)
    private final int zzm;

    @Nullable
    @SafeParcelable.Field(getter = "getHotspotBssid", id = 14)
    private final String zzn;

    @SafeParcelable.Field(getter = "getIpLowestTwoBytes", id = 15)
    private final byte[] zzo;

    @Nullable
    @SafeParcelable.Field(getter = "getCloudDeviceId", id = 16)
    private final String zzp;

    @SafeParcelable.Field(getter = "isCloudOnlyDevice", id = 17)
    private final boolean zzq;

    @Nullable
    @SafeParcelable.Field(getter = "getCastEurekaInfo", id = 18)
    private final com.google.android.gms.cast.internal.zzz zzr;

    @Nullable
    @SafeParcelable.Field(getter = "getWakeupServicePort", id = 19)
    private final Integer zzs;

    @SafeParcelable.Constructor
    public CastDevice(@SafeParcelable.Param(id = 2) String str, @Nullable @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) int i10, @SafeParcelable.Param(id = 8) List list, @SafeParcelable.Param(id = 9) int i11, @SafeParcelable.Param(id = 10) int i12, @Nullable @SafeParcelable.Param(id = 11) String str6, @Nullable @SafeParcelable.Param(id = 12) String str7, @SafeParcelable.Param(id = 13) int i13, @Nullable @SafeParcelable.Param(id = 14) String str8, @SafeParcelable.Param(id = 15) byte[] bArr, @Nullable @SafeParcelable.Param(id = 16) String str9, @SafeParcelable.Param(id = 17) boolean z10, @Nullable @SafeParcelable.Param(id = 18) com.google.android.gms.cast.internal.zzz zzzVar, @Nullable @SafeParcelable.Param(id = 19) Integer num) {
        this.zzb = zzd(str);
        String strZzd = zzd(str2);
        this.zza = strZzd;
        if (!TextUtils.isEmpty(strZzd)) {
            try {
                this.zzc = InetAddress.getByName(strZzd);
            } catch (UnknownHostException e10) {
                Log.i("CastDevice", "Unable to convert host address (" + this.zza + ") to ipaddress: " + e10.getMessage());
            }
        }
        this.zzd = zzd(str3);
        this.zze = zzd(str4);
        this.zzf = zzd(str5);
        this.zzg = i10;
        this.zzh = list == null ? new ArrayList() : list;
        this.zzi = i11;
        this.zzj = i12;
        this.zzk = zzd(str6);
        this.zzl = str7;
        this.zzm = i13;
        this.zzn = str8;
        this.zzo = bArr;
        this.zzp = str9;
        this.zzq = z10;
        this.zzr = zzzVar;
        this.zzs = num;
    }

    @Nullable
    public static CastDevice getFromBundle(@Nullable Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    private static String zzd(@Nullable String str) {
        return str == null ? "" : str;
    }

    public boolean equals(@Nullable Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.zzb;
        if (str == null) {
            return castDevice.zzb == null;
        }
        return CastUtils.zze(str, castDevice.zzb) && CastUtils.zze(this.zzc, castDevice.zzc) && CastUtils.zze(this.zze, castDevice.zze) && CastUtils.zze(this.zzd, castDevice.zzd) && CastUtils.zze(this.zzf, castDevice.zzf) && this.zzg == castDevice.zzg && CastUtils.zze(this.zzh, castDevice.zzh) && this.zzi == castDevice.zzi && this.zzj == castDevice.zzj && CastUtils.zze(this.zzk, castDevice.zzk) && CastUtils.zze(Integer.valueOf(this.zzm), Integer.valueOf(castDevice.zzm)) && CastUtils.zze(this.zzn, castDevice.zzn) && CastUtils.zze(this.zzl, castDevice.zzl) && CastUtils.zze(this.zzf, castDevice.getDeviceVersion()) && this.zzg == castDevice.getServicePort() && (((bArr = this.zzo) == null && castDevice.zzo == null) || Arrays.equals(bArr, castDevice.zzo)) && CastUtils.zze(this.zzp, castDevice.zzp) && this.zzq == castDevice.zzq && CastUtils.zze(zzb(), castDevice.zzb());
    }

    @NonNull
    public String getDeviceId() {
        return this.zzb.startsWith("__cast_nearby__") ? this.zzb.substring(16) : this.zzb;
    }

    @NonNull
    public String getDeviceVersion() {
        return this.zzf;
    }

    @NonNull
    public String getFriendlyName() {
        return this.zzd;
    }

    @Nullable
    public WebImage getIcon(int i10, int i11) {
        WebImage webImage = null;
        if (this.zzh.isEmpty()) {
            return null;
        }
        if (i10 <= 0 || i11 <= 0) {
            return (WebImage) this.zzh.get(0);
        }
        WebImage webImage2 = null;
        for (WebImage webImage3 : this.zzh) {
            int width = webImage3.getWidth();
            int height = webImage3.getHeight();
            if (width < i10 || height < i11) {
                if (width < i10 && height < i11 && (webImage2 == null || (webImage2.getWidth() < width && webImage2.getHeight() < height))) {
                    webImage2 = webImage3;
                }
            } else if (webImage == null || (webImage.getWidth() > width && webImage.getHeight() > height)) {
                webImage = webImage3;
            }
        }
        if (webImage != null) {
            return webImage;
        }
        return webImage2 != null ? webImage2 : (WebImage) this.zzh.get(0);
    }

    @NonNull
    public List<WebImage> getIcons() {
        return Collections.unmodifiableList(this.zzh);
    }

    @NonNull
    public InetAddress getInetAddress() {
        return this.zzc;
    }

    @Nullable
    @Deprecated
    public Inet4Address getIpAddress() {
        if (hasIPv4Address()) {
            return (Inet4Address) this.zzc;
        }
        return null;
    }

    @NonNull
    public String getModelName() {
        return this.zze;
    }

    public int getServicePort() {
        return this.zzg;
    }

    public boolean hasCapabilities(@NonNull int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i10 : iArr) {
            if (!hasCapability(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasCapability(int i10) {
        return (this.zzi & i10) == i10;
    }

    public boolean hasIPv4Address() {
        return getInetAddress() instanceof Inet4Address;
    }

    public boolean hasIPv6Address() {
        return getInetAddress() instanceof Inet6Address;
    }

    public boolean hasIcons() {
        return !this.zzh.isEmpty();
    }

    public int hashCode() {
        String str = this.zzb;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public boolean isOnLocalNetwork() {
        return (this.zzb.startsWith("__cast_nearby__") || this.zzq) ? false : true;
    }

    public boolean isSameDevice(@NonNull CastDevice castDevice) {
        if (castDevice == null) {
            return false;
        }
        if (!TextUtils.isEmpty(getDeviceId()) && !getDeviceId().startsWith("__cast_ble__") && !TextUtils.isEmpty(castDevice.getDeviceId()) && !castDevice.getDeviceId().startsWith("__cast_ble__")) {
            return CastUtils.zze(getDeviceId(), castDevice.getDeviceId());
        }
        if (TextUtils.isEmpty(this.zzn) || TextUtils.isEmpty(castDevice.zzn)) {
            return false;
        }
        return CastUtils.zze(this.zzn, castDevice.zzn);
    }

    public void putInBundle(@NonNull Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
    }

    @NonNull
    public String toString() {
        String str = this.zzd;
        Locale locale = Locale.ROOT;
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            if (length <= 2) {
                str = length == 2 ? "xx" : "x";
            } else {
                str = String.format(locale, "%c%d%c", Character.valueOf(str.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str.charAt(length - 1)));
            }
        }
        return String.format(locale, "\"%s\" (%s)", str, this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zza, false);
        SafeParcelWriter.writeString(parcel, 4, getFriendlyName(), false);
        SafeParcelWriter.writeString(parcel, 5, getModelName(), false);
        SafeParcelWriter.writeString(parcel, 6, getDeviceVersion(), false);
        SafeParcelWriter.writeInt(parcel, 7, getServicePort());
        SafeParcelWriter.writeTypedList(parcel, 8, getIcons(), false);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeInt(parcel, 10, this.zzj);
        SafeParcelWriter.writeString(parcel, 11, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        SafeParcelWriter.writeString(parcel, 14, this.zzn, false);
        SafeParcelWriter.writeByteArray(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzp, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzq);
        SafeParcelWriter.writeParcelable(parcel, 18, zzb(), i10, false);
        SafeParcelWriter.writeIntegerObject(parcel, 19, this.zzs, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @ShowFirstParty
    public final int zza() {
        return this.zzi;
    }

    @Nullable
    public final com.google.android.gms.cast.internal.zzz zzb() {
        if (this.zzr == null) {
            boolean zHasCapability = hasCapability(32);
            boolean zHasCapability2 = hasCapability(64);
            if (zHasCapability || zHasCapability2) {
                return com.google.android.gms.cast.internal.zzy.zza(1);
            }
        }
        return this.zzr;
    }

    @Nullable
    @ShowFirstParty
    public final String zzc() {
        return this.zzl;
    }
}
