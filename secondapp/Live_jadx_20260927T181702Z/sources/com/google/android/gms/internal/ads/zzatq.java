package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.h1
final class zzatq {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    private zzatq(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = list;
    }

    public static zzatq zza(zzatr zzatrVar) throws IOException {
        if (zzatt.zzi(zzatrVar) != 538247942) {
            throw new IOException();
        }
        String strZzm = zzatt.zzm(zzatrVar);
        String strZzm2 = zzatt.zzm(zzatrVar);
        long jZzk = zzatt.zzk(zzatrVar);
        long jZzk2 = zzatt.zzk(zzatrVar);
        long jZzk3 = zzatt.zzk(zzatrVar);
        long jZzk4 = zzatt.zzk(zzatrVar);
        int iZzi = zzatt.zzi(zzatrVar);
        if (iZzi < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzi).length() + 20);
            sb2.append("readHeaderList size=");
            sb2.append(iZzi);
            throw new IOException(sb2.toString());
        }
        List arrayList = iZzi == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i10 = 0; i10 < iZzi; i10++) {
            arrayList.add(new zzasp(zzatt.zzm(zzatrVar).intern(), zzatt.zzm(zzatrVar).intern()));
        }
        return new zzatq(strZzm, strZzm2, jZzk, jZzk2, jZzk3, jZzk4, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzatq(String str, zzasg zzasgVar) {
        String str2 = zzasgVar.zzb;
        long j10 = zzasgVar.zzc;
        long j11 = zzasgVar.zzd;
        long j12 = zzasgVar.zze;
        long j13 = zzasgVar.zzf;
        List arrayList = zzasgVar.zzh;
        if (arrayList == null) {
            Map map = zzasgVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzasp((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j10, j11, j12, j13, arrayList);
    }
}
