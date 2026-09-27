package com.google.android.gms.internal.measurement;

import android.net.Uri;
import f0.k3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzjt {
    private final k3 zza;

    public zzjt(k3 k3Var) {
        this.zza = k3Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        k3 k3Var = uri != null ? (k3) this.zza.get(uri.toString()) : null;
        if (k3Var == null) {
            return null;
        }
        return (String) k3Var.get("".concat(str3));
    }
}
