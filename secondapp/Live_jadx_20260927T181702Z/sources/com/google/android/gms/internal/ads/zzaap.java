package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaap extends zzaai {
    private final boolean zze;
    private final zzaae zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Code duplicated, block: B:109:0x0167  */
    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:33:0x004d  */
    public zzaap(int i10, zzbg zzbgVar, int i11, zzaae zzaaeVar, int i12, @Nullable String str, int i13, boolean z10) {
        boolean z11;
        boolean z12;
        int i14;
        int iZzj;
        int i15;
        boolean z13;
        zzv zzvVar;
        int i16;
        int i17;
        int i18;
        zzv zzvVar2;
        int i19;
        int i20;
        int i21;
        super(i10, zzbgVar, i11);
        this.zzf = zzaaeVar;
        int i22 = 1;
        int i23 = true != zzaaeVar.zzM ? 16 : 24;
        if (!z10 || (((i19 = (zzvVar2 = this.zzd).zzw) != -1 && i19 > zzaaeVar.zza) || ((i20 = zzvVar2.zzx) != -1 && i20 > zzaaeVar.zzb))) {
            z11 = false;
        } else {
            float f10 = zzvVar2.zzA;
            if ((f10 == -1.0f || f10 <= zzaaeVar.zzc) && ((i21 = zzvVar2.zzj) == -1 || i21 <= zzaaeVar.zzd)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.zze = z11;
        if (!z10 || (((i16 = (zzvVar = this.zzd).zzw) != -1 && i16 < 0) || ((i17 = zzvVar.zzx) != -1 && i17 < 0))) {
            z12 = false;
        } else {
            float f11 = zzvVar.zzA;
            if ((f11 == -1.0f || f11 >= 0.0f) && ((i18 = zzvVar.zzj) == -1 || i18 >= 0)) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        this.zzg = z12;
        this.zzh = l1.c(i12, false);
        zzv zzvVar3 = this.zzd;
        float f12 = zzvVar3.zzA;
        this.zzi = f12 != -1.0f && f12 >= 10.0f;
        this.zzj = zzvVar3.zzj;
        this.zzk = zzvVar3.zzc();
        int i24 = 0;
        while (true) {
            i14 = Integer.MAX_VALUE;
            if (i24 >= zzaaeVar.zzo.size()) {
                iZzj = 0;
                i24 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaaq.zzj(this.zzd, (String) zzaaeVar.zzo.get(i24), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i24++;
                }
            }
        }
        this.zzm = i24;
        this.zzn = iZzj;
        this.zzo = zzaaq.zzm(this.zzd.zzf, 0);
        int i25 = this.zzd.zzf;
        this.zzq = i25 == 0 || (i25 & 1) != 0;
        this.zzr = zzaaq.zzj(this.zzd, str, zzaaq.zzi(str) == null);
        for (int i26 = 0; i26 < zzaaeVar.zzm.size(); i26++) {
            String str2 = this.zzd.zzp;
            if (str2 != null && str2.equals(zzaaeVar.zzm.get(i26))) {
                i14 = i26;
                break;
            }
        }
        this.zzl = i14;
        this.zzp = zzaaq.zzn(this.zzd, zzaaeVar.zzn);
        this.zzt = (i12 & 384) == 128;
        this.zzu = (i12 & 64) == 64;
        zzv zzvVar4 = this.zzd;
        String str3 = zzvVar4.zzp;
        if (str3 != null) {
            switch (str3) {
                case "video/dolby-vision":
                    i15 = 5;
                    break;
                case "video/av01":
                    i15 = 4;
                    break;
                case "video/hevc":
                    i15 = 3;
                    break;
                case "video/avc":
                    i15 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i15 = 2;
                    break;
                default:
                    i15 = 0;
                    break;
            }
        } else {
            i15 = 0;
        }
        this.zzv = i15;
        if ((zzvVar4.zzf & 16384) != 0) {
            i22 = 0;
        } else {
            zzaae zzaaeVar2 = this.zzf;
            if (!l1.c(i12, zzaaeVar2.zzV) || (!(z13 = this.zze) && !zzaaeVar2.zzK)) {
                i22 = 0;
            } else if (l1.c(i12, false) && this.zzg && z13 && zzvVar4.zzj != -1 && (i23 & i12) != 0) {
                i22 = 2;
            }
        }
        this.zzs = i22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzaap zzaapVar, zzaap zzaapVar2) {
        zzgvm zzgvmVarZza = zzgvm.zzg().zzd(zzaapVar.zzh, zzaapVar2.zzh).zza(Integer.valueOf(zzaapVar.zzm), Integer.valueOf(zzaapVar2.zzm), zzgxt.zzb().zza()).zzb(zzaapVar.zzn, zzaapVar2.zzn).zzb(zzaapVar.zzo, zzaapVar2.zzo).zza(Integer.valueOf(zzaapVar.zzp), Integer.valueOf(zzaapVar2.zzp), zzgxt.zzb().zza()).zzd(zzaapVar.zzq, zzaapVar2.zzq).zzb(zzaapVar.zzr, zzaapVar2.zzr).zzd(zzaapVar.zzi, zzaapVar2.zzi).zzd(zzaapVar.zze, zzaapVar2.zze).zzd(zzaapVar.zzg, zzaapVar2.zzg).zza(Integer.valueOf(zzaapVar.zzl), Integer.valueOf(zzaapVar2.zzl), zzgxt.zzb().zza());
        boolean z10 = zzaapVar.zzt;
        zzgvm zzgvmVarZzd = zzgvmVarZza.zzd(z10, zzaapVar2.zzt);
        boolean z11 = zzaapVar.zzu;
        zzgvm zzgvmVarZzd2 = zzgvmVarZzd.zzd(z11, zzaapVar2.zzu);
        if (z10 && z11) {
            zzgvmVarZzd2 = zzgvmVarZzd2.zzb(zzaapVar.zzv, zzaapVar2.zzv);
        }
        return zzgvmVarZzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzaap zzaapVar, zzaap zzaapVar2) {
        zzgxt zzgxtVarZza = (zzaapVar.zze && zzaapVar.zzh) ? zzaaq.zzc : zzaaq.zzc.zza();
        zzgvm zzgvmVarZzg = zzgvm.zzg();
        boolean z10 = zzaapVar.zzf.zzF;
        return zzgvmVarZzg.zza(Integer.valueOf(zzaapVar.zzk), Integer.valueOf(zzaapVar2.zzk), zzgxtVarZza).zza(Integer.valueOf(zzaapVar.zzj), Integer.valueOf(zzaapVar2.zzj), zzgxtVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final /* bridge */ /* synthetic */ boolean zzc(zzaai zzaaiVar) {
        zzaap zzaapVar = (zzaap) zzaaiVar;
        if (!Objects.equals(this.zzd.zzp, zzaapVar.zzd.zzp)) {
            return false;
        }
        boolean z10 = this.zzf.zzN;
        return this.zzt == zzaapVar.zzt && this.zzu == zzaapVar.zzu;
    }
}
