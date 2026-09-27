package com.google.android.gms.internal.measurement;

import android.content.Context;
import zi.u0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzjn extends zzkh {
    private final Context zza;

    @zq.h
    private final u0 zzb;

    public zzjn(Context context, @zq.h u0 u0Var) {
        this.zza = context;
        this.zzb = u0Var;
    }

    public final boolean equals(Object obj) {
        u0 u0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkh) {
            zzkh zzkhVar = (zzkh) obj;
            if (this.zza.equals(zzkhVar.zza()) && ((u0Var = this.zzb) != null ? u0Var.equals(zzkhVar.zzb()) : zzkhVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        u0 u0Var = this.zzb;
        return (iHashCode * 1000003) ^ (u0Var == null ? 0 : u0Var.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(string);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    @zq.h
    public final u0 zzb() {
        return this.zzb;
    }
}
