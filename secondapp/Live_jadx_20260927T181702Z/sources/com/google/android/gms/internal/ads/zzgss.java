package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgss {
    private final String zza;
    private final zzgsr zzb;
    private zzgsr zzc;

    public /* synthetic */ zzgss(String str, byte[] bArr) {
        zzgsr zzgsrVar = new zzgsr();
        this.zzb = zzgsrVar;
        this.zzc = zzgsrVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append(fw.b.f85382i);
        zzgsr zzgsrVar = this.zzb.zzb;
        String str = "";
        while (zzgsrVar != null) {
            Object obj = zzgsrVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzgsrVar = zzgsrVar.zzb;
            str = ", ";
        }
        sb2.append(fw.b.f85383j);
        return sb2.toString();
    }

    public final zzgss zza(Object obj) {
        zzgsr zzgsrVar = new zzgsr();
        this.zzc.zzb = zzgsrVar;
        this.zzc = zzgsrVar;
        zzgsrVar.zza = obj;
        return this;
    }
}
