package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfw extends zzfy {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfw(int i10, long j10) {
        super(i10, null);
        this.zza = j10;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final String toString() {
        List list = this.zzb;
        String strZze = zzfy.zze(this.zzd);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.zzc.toArray());
        int length = strZze.length();
        StringBuilder sb2 = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        sb2.append(strZze);
        sb2.append(" leaves: ");
        sb2.append(string);
        sb2.append(" containers: ");
        sb2.append(string2);
        return sb2.toString();
    }

    public final void zza(zzfx zzfxVar) {
        this.zzb.add(zzfxVar);
    }

    public final void zzb(zzfw zzfwVar) {
        this.zzc.add(zzfwVar);
    }

    @Nullable
    public final zzfx zzc(int i10) {
        List list = this.zzb;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzfx zzfxVar = (zzfx) list.get(i11);
            if (zzfxVar.zzd == i10) {
                return zzfxVar;
            }
        }
        return null;
    }

    @Nullable
    public final zzfw zzd(int i10) {
        List list = this.zzc;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzfw zzfwVar = (zzfw) list.get(i11);
            if (zzfwVar.zzd == i10) {
                return zzfwVar;
            }
        }
        return null;
    }
}
