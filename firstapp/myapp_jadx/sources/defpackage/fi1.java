package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fi1 extends lpg {
    public final String a;
    public final Integer b;
    public final d4g c;
    public final long d;
    public final long e;
    public final Map<String, String> f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public static final class a extends lpg.a {
        public String a;
        public Integer b;
        public d4g c;
        public Long d;
        public Long e;
        public HashMap f;
        public Integer g;
        public String h;
        public byte[] i;
        public byte[] j;

        public final fi1 b() {
            String strConcat = this.a == null ? " transportName" : "";
            if (this.c == null) {
                strConcat = strConcat.concat(" encodedPayload");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" eventMillis");
            }
            if (this.e == null) {
                strConcat = strConcat.concat(" uptimeMillis");
            }
            if (this.f == null) {
                strConcat = strConcat.concat(" autoMetadata");
            }
            if (strConcat.isEmpty()) {
                return new fi1(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, this.g, this.h, this.i, this.j);
            }
            ib5.a("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    public fi1(String str, Integer num, d4g d4gVar, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = d4gVar;
        this.d = j;
        this.e = j2;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    @Override // defpackage.lpg
    public final Map<String, String> b() {
        return this.f;
    }

    @Override // defpackage.lpg
    public final Integer c() {
        return this.b;
    }

    @Override // defpackage.lpg
    public final d4g d() {
        return this.c;
    }

    @Override // defpackage.lpg
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lpg)) {
            return false;
        }
        lpg lpgVar = (lpg) obj;
        if (!this.a.equals(lpgVar.k())) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (lpgVar.c() != null) {
                return false;
            }
        } else if (!num.equals(lpgVar.c())) {
            return false;
        }
        if (!this.c.equals(lpgVar.d()) || this.d != lpgVar.e() || this.e != lpgVar.l() || !this.f.equals(lpgVar.b())) {
            return false;
        }
        Integer num2 = this.g;
        if (num2 == null) {
            if (lpgVar.i() != null) {
                return false;
            }
        } else if (!num2.equals(lpgVar.i())) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            if (lpgVar.j() != null) {
                return false;
            }
        } else if (!str.equals(lpgVar.j())) {
            return false;
        }
        boolean z = lpgVar instanceof fi1;
        if (Arrays.equals(this.i, z ? ((fi1) lpgVar).i : lpgVar.f())) {
            return Arrays.equals(this.j, z ? ((fi1) lpgVar).j : lpgVar.g());
        }
        return false;
    }

    @Override // defpackage.lpg
    public final byte[] f() {
        return this.i;
    }

    @Override // defpackage.lpg
    public final byte[] g() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return Arrays.hashCode(this.j) ^ ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003);
    }

    @Override // defpackage.lpg
    public final Integer i() {
        return this.g;
    }

    @Override // defpackage.lpg
    public final String j() {
        return this.h;
    }

    @Override // defpackage.lpg
    public final String k() {
        return this.a;
    }

    @Override // defpackage.lpg
    public final long l() {
        return this.e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
