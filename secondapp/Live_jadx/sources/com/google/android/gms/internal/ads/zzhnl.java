package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhnl {
    private final Class zza;
    private final zziam zzb;

    public /* synthetic */ zzhnl(Class cls, zziam zziamVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zziamVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnl)) {
            return false;
        }
        zzhnl zzhnlVar = (zzhnl) obj;
        return zzhnlVar.zza.equals(this.zza) && zzhnlVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zziam zziamVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String strValueOf = String.valueOf(zziamVar);
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 21 + strValueOf.length());
        sb2.append(simpleName);
        sb2.append(", object identifier: ");
        sb2.append(strValueOf);
        return sb2.toString();
    }
}
