package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzieo {
    public static final List zza(Object obj, long j10) {
        zzied zziedVar = (zzied) zzigo.zzn(obj, j10);
        if (zziedVar.zza()) {
            return zziedVar;
        }
        int size = zziedVar.size();
        zzied zziedVarZzh = zziedVar.zzh(size == 0 ? 10 : size + size);
        zzigo.zzo(obj, j10, zziedVarZzh);
        return zziedVarZzh;
    }
}
