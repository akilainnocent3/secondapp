package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.media3.session.fe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzft {
    public final String zza;

    private zzft(int i10, int i11, String str) {
        this.zza = str;
    }

    @Nullable
    public static zzft zza(zzes zzesVar) {
        String str;
        zzesVar.zzk(2);
        int iZzs = zzesVar.zzs();
        int i10 = iZzs >> 1;
        int i11 = iZzs & 1;
        int iZzs2 = zzesVar.zzs() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i12 = iZzs2 | (i11 << 5);
        String str2 = fe.F;
        String str3 = i10 < 10 ? ".0" : fe.F;
        int length = str3.length() + 4;
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(i12).length();
        if (i12 < 10) {
            str2 = ".0";
        }
        StringBuilder sb2 = new StringBuilder(length + length2 + str2.length() + length3);
        sb2.append(str);
        sb2.append(str3);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i12);
        return new zzft(i10, i12, sb2.toString());
    }
}
