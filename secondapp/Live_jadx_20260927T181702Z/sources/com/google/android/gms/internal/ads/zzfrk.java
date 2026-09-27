package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfrk {
    private final zzeor zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfkf zzf;
    private final zzfkg zzg;
    private final Clock zzh;
    private final zzbai zzi;

    @k.h1
    public zzfrk(zzeor zzeorVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, @Nullable zzfkf zzfkfVar, @Nullable zzfkg zzfkgVar, Clock clock, zzbai zzbaiVar) {
        this.zza = zzeorVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfkfVar;
        this.zzg = zzfkgVar;
        this.zzh = clock;
        this.zzi = zzbaiVar;
    }

    public static String zzd(String str, String str2, @Nullable String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static String zzg(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return com.google.android.gms.ads.internal.util.client.zzl.zzj() ? "fakeForAdDebugLog" : str;
    }

    public final List zza(zzfke zzfkeVar, @Nullable zzfjt zzfjtVar, List list) {
        return zzb(zzfkeVar, zzfjtVar, false, "", "", list, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0157  */
    public final List zzb(zzfke zzfkeVar, @Nullable zzfjt zzfjtVar, boolean z10, @Nullable String str, @Nullable String str2, List list, @Nullable zzdbb zzdbbVar, @Nullable zzces zzcesVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z11 = true;
            String strZzd = zzd(zzd(zzd((String) it.next(), "@gw_adlocid@", zzfkeVar.zza.zza.zzg), "@gw_adnetrefresh@", true != z10 ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfjtVar != null) {
                String strZzd2 = zzd(zzd(zzd(strZzd, "@gw_qdata@", zzfjtVar.zzy), "@gw_adnetid@", zzfjtVar.zzx), "@gw_allocid@", zzfjtVar.zzw);
                Context context = this.zze;
                strZzd = zzcdp.zza(strZzd2, context, zzfjtVar.zzW, zzfjtVar.zzaw);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoX)).booleanValue() && zzfjtVar.zze == 4) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    strZzd = zzd(strZzd, "@gw_aps@", true != com.google.android.gms.ads.internal.util.zzs.zzJ(context) ? "0" : "1");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpi)).booleanValue() && zzcesVar != null) {
                    int i10 = zzcesVar.zza;
                    String strZzd3 = zzd(strZzd, "@gw_is@", i10 >= 0 ? Integer.toString(i10) : "");
                    int i11 = zzcesVar.zzb;
                    String strZzd4 = zzd(strZzd3, "@gw_fis@", i11 >= 0 ? Integer.toString(i11) : "");
                    int i12 = zzcesVar.zzc;
                    strZzd = zzd(strZzd4, "@gw_sfis@", i12 >= 0 ? Integer.toString(i12) : "");
                }
            }
            zzeor zzeorVar = this.zza;
            String strZzd5 = zzd(zzd(zzd(zzd(strZzd, "@gw_adnetstatus@", zzeorVar.zzg()), "@gw_ttr@", Long.toString(zzeorVar.zzh(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzpg)).booleanValue()) {
                strZzd5 = (zzdbbVar == null || zzdbbVar.zza() <= 0) ? zzd(strZzd5, "@gw_placement_id@", "") : zzd(strZzd5, "@gw_placement_id@", Long.toString(zzdbbVar.zza(), 10));
            }
            boolean z12 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzet)).booleanValue() && !TextUtils.isEmpty(str)) {
                z12 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z13 = !zIsEmpty;
            if (z12) {
                z11 = z13;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strZzd5);
            }
            if (this.zzi.zza(Uri.parse(strZzd5))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzd5).buildUpon();
                if (z12) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z11) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzd5 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzd5);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[LOOP:0: B:13:0x005a->B:15:0x0060, LOOP_END] */
    public final List zzc(zzfjt zzfjtVar, List list, zzcbd zzcbdVar) {
        zzfkf zzfkfVar;
        zzgsu zzgsuVarZzd;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String strZzb = zzcbdVar.zzb();
            String string = Integer.toString(zzcbdVar.zzc());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeu)).booleanValue()) {
                zzfkg zzfkgVar = this.zzg;
                if (zzfkgVar == null) {
                    zzgsuVarZzd = zzgsu.zzc();
                } else {
                    zzfkfVar = zzfkgVar.zza;
                }
                str = (String) zzgsuVarZzd.zzb(zzfrj.zza).zza("");
                str2 = (String) zzgsuVarZzd.zzb(zzfri.zza).zza("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzcdp.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfjtVar.zzW, zzfjtVar.zzaw));
                }
                return arrayList;
            }
            zzfkfVar = this.zzf;
            zzgsuVarZzd = zzgsu.zzd(zzfkfVar);
            str = (String) zzgsuVarZzd.zzb(zzfrj.zza).zza("");
            str2 = (String) zzgsuVarZzd.zzb(zzfri.zza).zza("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzcdp.zza(zzd(zzd(zzd(zzd(zzd(zzd((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfjtVar.zzW, zzfjtVar.zzaw));
            }
            return arrayList;
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to determine award type and amount.", e10);
            return arrayList;
        }
    }
}
