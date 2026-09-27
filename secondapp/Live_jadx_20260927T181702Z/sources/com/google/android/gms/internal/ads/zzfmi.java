package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
public final class zzfmi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfmi> CREATOR = new zzfmj();

    @zq.h
    public final Context zza;
    public final zzfmf zzb;

    @SafeParcelable.Field(id = 2)
    public final int zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Field(id = 4)
    public final int zze;

    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfmf[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfmi(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) int i13, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i14, @SafeParcelable.Param(id = 7) int i15) {
        zzfmf[] zzfmfVarArrValues = zzfmf.values();
        this.zzh = zzfmfVarArrValues;
        int[] iArrZza = zzfmg.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfmh.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i10;
        this.zzb = zzfmfVarArrValues[i10];
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = str;
        this.zzj = i14;
        this.zzg = iArrZza[i14];
        this.zzk = i15;
        int i16 = iArrZza2[i15];
    }

    @zq.h
    public static zzfmi zza(zzfmf zzfmfVar, Context context) {
        if (zzfmfVar == zzfmf.Rewarded) {
            return new zzfmi(context, zzfmfVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzho)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhu)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhw)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhy), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhq), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhs));
        }
        if (zzfmfVar == zzfmf.Interstitial) {
            return new zzfmi(context, zzfmfVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhp)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhv)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhx)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhz), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhr), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzht));
        }
        if (zzfmfVar != zzfmf.AppOpen) {
            return null;
        }
        return new zzfmi(context, zzfmfVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhC)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhE)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhF)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhA), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhB), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhD));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zzi;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfmi(@zq.h Context context, zzfmf zzfmfVar, int i10, int i11, int i12, String str, String str2, String str3) {
        this.zzh = zzfmf.values();
        this.zzl = zzfmg.zza();
        this.zzm = zzfmh.zza();
        this.zza = context;
        this.zzi = zzfmfVar.ordinal();
        this.zzb = zzfmfVar;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        int i13 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i13;
        this.zzj = i13 - 1;
        this.zzk = 0;
    }
}
