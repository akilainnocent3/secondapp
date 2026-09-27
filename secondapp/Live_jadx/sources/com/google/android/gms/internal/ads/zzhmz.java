package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzhmz {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhmz(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhmz)) {
            return false;
        }
        zzhmz zzhmzVar = (zzhmz) obj;
        return zzhmzVar.zza.equals(this.zza) && zzhmzVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Class cls = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 22 + simpleName2.length());
        sb2.append(simpleName);
        sb2.append(" with primitive type: ");
        sb2.append(simpleName2);
        return sb2.toString();
    }
}
