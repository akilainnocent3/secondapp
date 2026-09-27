package com.google.android.gms.internal.auth;

import android.net.Uri;
import k.a0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcr {

    @a0("PhenotypeConstants.class")
    private static final f0.a zza = new f0.a();

    public static synchronized Uri zza(String str) {
        f0.a aVar = zza;
        Uri uri = (Uri) aVar.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        aVar.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
