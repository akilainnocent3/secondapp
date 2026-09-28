package defpackage;

import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jj1 extends gft {
    public final long a;
    public final Integer b;
    public final in8 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final jmx h;
    public final wzg i;

    public static final class a extends gft.a {
        public Long a;
        public Integer b;
        public ug1 c;
        public Long d;
        public byte[] e;
        public String f;
        public Long g;
        public rj1 h;
        public hi1 i;
    }

    public jj1(long j, Integer num, in8 in8Var, long j2, byte[] bArr, String str, long j3, jmx jmxVar, wzg wzgVar) {
        this.a = j;
        this.b = num;
        this.c = in8Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = jmxVar;
        this.i = wzgVar;
    }

    @Override // defpackage.gft
    public final in8 a() {
        return this.c;
    }

    @Override // defpackage.gft
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.gft
    public final long c() {
        return this.a;
    }

    @Override // defpackage.gft
    public final long d() {
        return this.d;
    }

    @Override // defpackage.gft
    public final wzg e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gft)) {
            return false;
        }
        gft gftVar = (gft) obj;
        if (this.a != gftVar.c()) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (gftVar.b() != null) {
                return false;
            }
        } else if (!num.equals(gftVar.b())) {
            return false;
        }
        in8 in8Var = this.c;
        if (in8Var == null) {
            if (gftVar.a() != null) {
                return false;
            }
        } else if (!in8Var.equals(gftVar.a())) {
            return false;
        }
        if (this.d != gftVar.d()) {
            return false;
        }
        if (!Arrays.equals(this.e, gftVar instanceof jj1 ? ((jj1) gftVar).e : gftVar.g())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (gftVar.h() != null) {
                return false;
            }
        } else if (!str.equals(gftVar.h())) {
            return false;
        }
        if (this.g != gftVar.i()) {
            return false;
        }
        jmx jmxVar = this.h;
        if (jmxVar == null) {
            if (gftVar.f() != null) {
                return false;
            }
        } else if (!jmxVar.equals(gftVar.f())) {
            return false;
        }
        wzg wzgVar = this.i;
        if (wzgVar == null) {
            return gftVar.e() == null;
        }
        return wzgVar.equals(gftVar.e());
    }

    @Override // defpackage.gft
    public final jmx f() {
        return this.h;
    }

    @Override // defpackage.gft
    public final byte[] g() {
        return this.e;
    }

    @Override // defpackage.gft
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        in8 in8Var = this.c;
        int iHashCode2 = (iHashCode ^ (in8Var == null ? 0 : in8Var.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        jmx jmxVar = this.h;
        int iHashCode5 = (i2 ^ (jmxVar == null ? 0 : jmxVar.hashCode())) * 1000003;
        wzg wzgVar = this.i;
        return iHashCode5 ^ (wzgVar != null ? wzgVar.hashCode() : 0);
    }

    @Override // defpackage.gft
    public final long i() {
        return this.g;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + rarBonoqWB.WiOcSaDJfDladRY + this.h + ", experimentIds=" + this.i + "}";
    }
}
