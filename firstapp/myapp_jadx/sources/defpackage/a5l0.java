package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;

/* JADX INFO: loaded from: classes4.dex */
public final class a5l0 {
    public final String a;
    public final String b;
    public final long c;
    public final Bundle d;

    public a5l0(long j, Bundle bundle, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.d = bundle;
        this.c = j;
    }

    public static a5l0 a(zzbg zzbgVar) {
        String str = zzbgVar.a;
        String str2 = zzbgVar.c;
        return new a5l0(zzbgVar.d, zzbgVar.b.b1(), str, str2);
    }

    public final zzbg b() {
        zzbe zzbeVar = new zzbe(new Bundle(this.d));
        return new zzbg(this.a, zzbeVar, this.b, this.c);
    }

    public final String toString() {
        String string = this.d.toString();
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        hxa.c(sb, "origin=", str, ",name=", str2);
        return uf80.a(sb, ",params=", string);
    }
}
