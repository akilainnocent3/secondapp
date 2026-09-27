package com.google.android.gms.internal.ads;

import com.ironsource.C4235d4;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzibi implements Map.Entry {
    zzibi zza;
    zzibi zzb;
    zzibi zzc;
    zzibi zzd;
    zzibi zze;
    final Object zzf;
    final boolean zzg;
    Object zzh;
    int zzi;

    public zzibi(boolean z10) {
        this.zzf = null;
        this.zzg = z10;
        this.zze = this;
        this.zzd = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.zzf;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.zzh;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zzf;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzh;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.zzf;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzh;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.zzh;
        this.zzh = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzf);
        String strValueOf2 = String.valueOf(this.zzh);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(C4235d4.j.f61456b);
        sb2.append(strValueOf2);
        return sb2.toString();
    }

    public zzibi(boolean z10, zzibi zzibiVar, Object obj, zzibi zzibiVar2, zzibi zzibiVar3) {
        this.zza = zzibiVar;
        this.zzf = obj;
        this.zzg = z10;
        this.zzi = 1;
        this.zzd = zzibiVar2;
        this.zze = zzibiVar3;
        zzibiVar3.zzd = this;
        zzibiVar2.zze = this;
    }
}
