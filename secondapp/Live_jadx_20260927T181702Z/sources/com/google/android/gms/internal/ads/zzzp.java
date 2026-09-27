package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzzp extends zzaai implements Comparable {
    private final int zze;
    private final boolean zzf;

    @Nullable
    private final String zzg;
    private final zzaae zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    public zzzp(int i10, zzbg zzbgVar, int i11, zzaae zzaaeVar, int i12, boolean z10, zzgsx zzgsxVar, int i13) {
        int i14;
        int iZzj;
        int iHashCode;
        int iZzj2;
        boolean z11;
        super(i10, zzbgVar, i11);
        this.zzh = zzaaeVar;
        int i15 = 1;
        int i16 = true != zzaaeVar.zzT ? 16 : 24;
        this.zzg = zzaaq.zzi(this.zzd.zzd);
        this.zzi = l1.c(i12, false);
        int i17 = 0;
        while (true) {
            i14 = Integer.MAX_VALUE;
            if (i17 >= zzaaeVar.zzq.size()) {
                iZzj = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaaq.zzj(this.zzd, (String) zzaaeVar.zzq.get(i17), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.zzk = i17;
        this.zzj = iZzj;
        this.zzl = zzaaq.zzm(this.zzd.zzf, 0);
        this.zzm = zzaaq.zzn(this.zzd, zzaaeVar.zzr);
        zzv zzvVar = this.zzd;
        int i18 = zzvVar.zzf;
        this.zzn = i18 == 0 || (i18 & 1) != 0;
        this.zzq = 1 == (zzvVar.zze & 1);
        String str = zzvVar.zzp;
        this.zzx = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals(u4.l1.f138685p0))));
        int i19 = zzvVar.zzH;
        this.zzr = i19;
        this.zzs = zzvVar.zzI;
        int i20 = zzvVar.zzj;
        this.zzt = i20;
        this.zzf = (i20 == -1 || i20 <= zzaaeVar.zzu) && (i19 == -1 || i19 <= zzaaeVar.zzt) && zzgsxVar.zza(zzvVar);
        String str2 = zzfk.zza;
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i21 = 0; i21 < strArrSplit.length; i21++) {
            strArrSplit[i21] = zzfk.zzi(strArrSplit[i21]);
        }
        int i22 = 0;
        while (true) {
            if (i22 >= strArrSplit.length) {
                iZzj2 = 0;
                i22 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj2 = zzaaq.zzj(this.zzd, strArrSplit[i22], false);
                if (iZzj2 > 0) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.zzo = i22;
        this.zzp = iZzj2;
        for (int i23 = 0; i23 < zzaaeVar.zzv.size(); i23++) {
            String str3 = this.zzd.zzp;
            if (str3 != null && str3.equals(zzaaeVar.zzv.get(i23))) {
                i14 = i23;
                break;
            }
        }
        this.zzu = i14;
        this.zzv = (i12 & 384) == 128;
        this.zzw = (i12 & 64) == 64;
        zzaae zzaaeVar2 = this.zzh;
        if (l1.c(i12, zzaaeVar2.zzV) && ((z11 = this.zzf) || zzaaeVar2.zzO)) {
            int i24 = zzaaeVar2.zzw.zzb;
            if (l1.c(i12, false) && z11 && this.zzd.zzj != -1 && ((zzaaeVar2.zzX || !z10) && (i16 & i12) != 0)) {
                i15 = 2;
            }
        } else {
            i15 = 0;
        }
        this.zze = i15;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzp zzzpVar) {
        boolean z10 = this.zzf;
        zzgxt zzgxtVarZza = (z10 && this.zzi) ? zzaaq.zzc : zzaaq.zzc.zza();
        zzgvm zzgvmVarZza = zzgvm.zzg().zzd(this.zzi, zzzpVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzzpVar.zzk), zzgxt.zzb().zza()).zzb(this.zzj, zzzpVar.zzj).zzb(this.zzl, zzzpVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzzpVar.zzm), zzgxt.zzb().zza()).zzd(this.zzq, zzzpVar.zzq).zzd(this.zzn, zzzpVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzzpVar.zzo), zzgxt.zzb().zza()).zzb(this.zzp, zzzpVar.zzp).zzd(z10, zzzpVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzzpVar.zzu), zzgxt.zzb().zza());
        boolean z11 = this.zzh.zzF;
        zzgvm zzgvmVarZza2 = zzgvmVarZza.zzd(this.zzv, zzzpVar.zzv).zzd(this.zzw, zzzpVar.zzw).zzd(this.zzx, zzzpVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzzpVar.zzr), zzgxtVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzzpVar.zzs), zzgxtVarZza);
        if (Objects.equals(this.zzg, zzzpVar.zzg)) {
            zzgvmVarZza2 = zzgvmVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzzpVar.zzt), zzgxtVarZza);
        }
        return zzgvmVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final /* bridge */ /* synthetic */ boolean zzc(zzaai zzaaiVar) {
        String str;
        int i10;
        zzzp zzzpVar = (zzzp) zzaaiVar;
        boolean z10 = this.zzh.zzR;
        zzv zzvVar = this.zzd;
        int i11 = zzvVar.zzH;
        if (i11 == -1) {
            return false;
        }
        zzv zzvVar2 = zzzpVar.zzd;
        return i11 == zzvVar2.zzH && (str = zzvVar.zzp) != null && TextUtils.equals(str, zzvVar2.zzp) && (i10 = zzvVar.zzI) != -1 && i10 == zzvVar2.zzI && this.zzv == zzzpVar.zzv && this.zzw == zzzpVar.zzw;
    }
}
