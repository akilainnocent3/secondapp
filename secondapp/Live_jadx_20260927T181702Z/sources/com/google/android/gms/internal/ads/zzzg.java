package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzzg extends zzat {
    public final zzgvz zzc;

    public zzzg(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.zzc = zzgvz.zzq(list);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final String getMessage() {
        zzgvz zzgvzVar = this.zzc;
        String message = super.getMessage();
        if (zzgvzVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(zzgvzVar);
        StringBuilder sb2 = new StringBuilder(length + 17 + strValueOf.length());
        sb2.append(message);
        sb2.append("\nsniff failures: ");
        sb2.append(strValueOf);
        return sb2.toString();
    }
}
