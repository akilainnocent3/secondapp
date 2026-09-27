package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzia extends zzhy {
    public final int zzc;

    public zzia(int i10, @Nullable String str, @Nullable IOException iOException, Map map, zzhn zzhnVar, byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
        sb2.append("Response code: ");
        sb2.append(i10);
        super(sb2.toString(), iOException, zzhnVar, 2004, 1);
        this.zzc = i10;
    }
}
