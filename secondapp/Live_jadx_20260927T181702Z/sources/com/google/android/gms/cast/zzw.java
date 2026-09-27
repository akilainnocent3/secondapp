package com.google.android.gms.cast;

import androidx.annotation.Nullable;
import com.google.android.gms.cast.internal.CastUtils;
import java.util.Collection;
import java.util.Locale;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
final class zzw {
    private final String zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final Collection zzc;

    public /* synthetic */ zzw(String str, String str2, Collection collection, boolean z10, boolean z11, zzv zzvVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = collection;
    }

    public static /* bridge */ /* synthetic */ String zza(zzw zzwVar) {
        StringBuilder sb2 = new StringBuilder(zzwVar.zza);
        String str = zzwVar.zzb;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(String.valueOf(zzwVar.zzb)));
            }
            sb2.append(c.userBaseDel);
            sb2.append(upperCase);
        }
        Collection collection = zzwVar.zzc;
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (zzwVar.zzb == null) {
                sb2.append(c.userBaseDel);
            }
            sb2.append(c.userBaseDel);
            boolean z10 = true;
            for (String str2 : zzwVar.zzc) {
                CastUtils.throwIfInvalidNamespace(str2);
                if (!z10) {
                    sb2.append(",");
                }
                sb2.append(CastUtils.zzc(str2));
                z10 = false;
            }
        }
        if (zzwVar.zzb == null && zzwVar.zzc == null) {
            sb2.append(c.userBaseDel);
        }
        if (zzwVar.zzc == null) {
            sb2.append(c.userBaseDel);
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }
}
