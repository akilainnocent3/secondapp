package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzafc {
    public static void zza(long j10, zzes zzesVar, zzahb[] zzahbVarArr) {
        int iZzB;
        while (true) {
            if (zzesVar.zzd() <= 1) {
                return;
            }
            int iZzc = zzc(zzesVar);
            int iZzc2 = zzc(zzesVar);
            int iZzg = zzesVar.zzg() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzesVar.zzd()) {
                zzef.zzc("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzg = zzesVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzs = zzesVar.zzs();
                int iZzt = zzesVar.zzt();
                if (iZzt == 49) {
                    iZzB = zzesVar.zzB();
                    iZzt = 49;
                } else {
                    iZzB = 0;
                }
                int iZzs2 = zzesVar.zzs();
                if (iZzt == 47) {
                    zzesVar.zzk(1);
                    iZzt = 47;
                }
                boolean z10 = iZzs == 181 && (iZzt == 49 || iZzt == 47) && iZzs2 == 3;
                if (iZzt == 49) {
                    z10 &= iZzB == 1195456820;
                }
                if (z10) {
                    zzb(j10, zzesVar, zzahbVarArr);
                }
            }
            zzesVar.zzh(iZzg);
        }
    }

    public static void zzb(long j10, zzes zzesVar, zzahb[] zzahbVarArr) {
        int iZzs = zzesVar.zzs();
        if ((iZzs & 64) != 0) {
            int i10 = iZzs & 31;
            zzesVar.zzk(1);
            int iZzg = zzesVar.zzg();
            for (zzahb zzahbVar : zzahbVarArr) {
                int i11 = i10 * 3;
                zzesVar.zzh(iZzg);
                zzahbVar.zzc(zzesVar, i11);
                zzgsw.zzi(j10 != -9223372036854775807L);
                zzahbVar.zze(j10, 1, i11, 0, null);
            }
        }
    }

    private static int zzc(zzes zzesVar) {
        int i10 = 0;
        while (zzesVar.zzd() != 0) {
            int iZzs = zzesVar.zzs();
            i10 += iZzs;
            if (iZzs != 255) {
                return i10;
            }
        }
        return -1;
    }
}
