package com.google.android.gms.internal.auth;

import android.net.Uri;
import f0.k3;
import zq.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzci {
    private final k3 zza;

    public zzci(k3 k3Var) {
        this.zza = k3Var;
    }

    @h
    public final String zza(@h Uri uri, @h String str, @h String str2, String str3) {
        if (uri == null) {
            return null;
        }
        k3 k3Var = (k3) this.zza.get(uri.toString());
        if (k3Var == null) {
            return null;
        }
        return (String) k3Var.get("".concat(String.valueOf(str3)));
    }
}
