package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaoa {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgwj zze = zzgwj.zzj("auto", "none");
    private static final zzgwj zzf = zzgwj.zzk("dot", "sesame", "circle");
    private static final zzgwj zzg = zzgwj.zzj("filled", "open");
    private static final zzgwj zzh = zzgwj.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaoa(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    @Nullable
    public static zzaoa zza(@Nullable String str) {
        int i10;
        if (str == null) {
            return null;
        }
        String strZza = zzgsf.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzgwj zzgwjVarZzq = zzgwj.zzq(TextUtils.split(strZza, zzd));
        String str2 = (String) zzgwn.zzb(zzgyj.zza(zzh, zzgwjVarZzq), "outside");
        int iHashCode = str2.hashCode();
        int i11 = 1;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                i10 = 2;
            } else {
                i10 = 1;
            }
        } else if (str2.equals("outside")) {
            i10 = -2;
        } else {
            i10 = 1;
        }
        zzgyi zzgyiVarZza = zzgyj.zza(zze, zzgwjVarZzq);
        int i12 = 0;
        if (zzgyiVarZza.isEmpty()) {
            zzgyi zzgyiVarZza2 = zzgyj.zza(zzg, zzgwjVarZzq);
            zzgyi zzgyiVarZza3 = zzgyj.zza(zzf, zzgwjVarZzq);
            if (zzgyiVarZza2.isEmpty() && zzgyiVarZza3.isEmpty()) {
                i11 = -1;
            } else {
                String str3 = (String) zzgwn.zzb(zzgyiVarZza2, "filled");
                i12 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzgwn.zzb(zzgyiVarZza3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i11 = 2;
                    }
                } else if (str4.equals("sesame")) {
                    i11 = 3;
                }
            }
        } else {
            String str5 = (String) zzgyiVarZza.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i11 = 0;
            } else {
                i11 = -1;
            }
        }
        return new zzaoa(i11, i12, i10);
    }
}
