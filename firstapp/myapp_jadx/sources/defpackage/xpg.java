package defpackage;

import androidx.media3.common.a;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xpg implements uov.a {
    public static final a g;
    public static final a h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    public xpg(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // uov.a
    public final a a() {
        switch (this.a) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // uov.a
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xpg.class != obj.getClass()) {
            return false;
        }
        xpg xpgVar = (xpg) obj;
        return this.c == xpgVar.c && this.d == xpgVar.d && this.a.equals(xpgVar.a) && this.b.equals(xpgVar.b) && Arrays.equals(this.e, xpgVar.e);
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iA = gmf0.a(gmf0.a(527, 31, this.a), 31, this.b);
        long j = this.c;
        int i2 = (iA + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int iHashCode = Arrays.hashCode(this.e) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        this.f = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    static {
        a.C0062a c0062a = new a.C0062a();
        c0062a.m = gqv.m("application/id3");
        g = new a(c0062a);
        a.C0062a c0062a2 = new a.C0062a();
        c0062a2.m = gqv.m(CaxEybC.NxPtRsGRhQdt);
        h = new a(c0062a2);
    }
}
