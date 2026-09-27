package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfkq {
    private final zzbai zza;

    @k.h1
    public zzfkq(zzbai zzbaiVar) {
        this.zza = zzbaiVar;
    }

    private static final Uri zzb(Uri uri, String str) throws zzbaj {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null && path.contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new zzbaj("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i10 = iIndexOf + 1;
                            StringBuilder sb2 = new StringBuilder(string.substring(0, i10));
                            sb2.append("dc_ms");
                            sb2.append(C4235d4.j.f61456b);
                            sb2.append(str);
                            sb2.append(";");
                            sb2.append((CharSequence) string, i10, string.length());
                            return Uri.parse(sb2.toString());
                        }
                        String encodedPath = uri.getEncodedPath();
                        if (encodedPath == null) {
                            throw new UnsupportedOperationException();
                        }
                        int iIndexOf2 = string.indexOf(encodedPath);
                        StringBuilder sb3 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                        sb3.append(";");
                        sb3.append("dc_ms");
                        sb3.append(C4235d4.j.f61456b);
                        sb3.append(str);
                        sb3.append(";");
                        sb3.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                        return Uri.parse(sb3.toString());
                    }
                } catch (NullPointerException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
                throw new zzbaj("Provided Uri is not in a valid state");
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new zzbaj("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i11 = iIndexOf3 + 1;
        StringBuilder sb4 = new StringBuilder(string2.substring(0, i11));
        sb4.append("ms");
        sb4.append(C4235d4.j.f61456b);
        sb4.append(str);
        sb4.append("&");
        sb4.append((CharSequence) string2, i11, string2.length());
        return Uri.parse(sb4.toString());
    }

    public final Uri zza(Uri uri, Context context, View view, @Nullable Activity activity) throws zzbaj {
        try {
            return zzb(uri, this.zza.zzb().zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzbaj("Provided Uri is not in a valid state");
        }
    }
}
