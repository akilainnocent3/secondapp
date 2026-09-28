package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lj1 extends vft {
    public final long a;
    public final long b;
    public final tg1 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;
    public final ab30 g;

    public lj1(long j, long j2, tg1 tg1Var, Integer num, String str, ArrayList arrayList) {
        ab30 ab30Var = ab30.a;
        this.a = j;
        this.b = j2;
        this.c = tg1Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = ab30Var;
    }

    @Override // defpackage.vft
    public final cs7 a() {
        return this.c;
    }

    @Override // defpackage.vft
    public final List<gft> b() {
        return this.f;
    }

    @Override // defpackage.vft
    public final Integer c() {
        return this.d;
    }

    @Override // defpackage.vft
    public final String d() {
        return this.e;
    }

    @Override // defpackage.vft
    public final ab30 e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vft)) {
            return false;
        }
        vft vftVar = (vft) obj;
        if (this.a != vftVar.f() || this.b != vftVar.g()) {
            return false;
        }
        tg1 tg1Var = this.c;
        if (tg1Var == null) {
            if (vftVar.a() != null) {
                return false;
            }
        } else if (!tg1Var.equals(vftVar.a())) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (vftVar.c() != null) {
                return false;
            }
        } else if (!num.equals(vftVar.c())) {
            return false;
        }
        String str = this.e;
        if (str == null) {
            if (vftVar.d() != null) {
                return false;
            }
        } else if (!str.equals(vftVar.d())) {
            return false;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            if (vftVar.b() != null) {
                return false;
            }
        } else if (!arrayList.equals(vftVar.b())) {
            return false;
        }
        ab30 ab30Var = this.g;
        if (ab30Var == null) {
            return vftVar.e() == null;
        }
        return ab30Var.equals(vftVar.e());
    }

    @Override // defpackage.vft
    public final long f() {
        return this.a;
    }

    @Override // defpackage.vft
    public final long g() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        tg1 tg1Var = this.c;
        int iHashCode = (i ^ (tg1Var == null ? 0 : tg1Var.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ArrayList arrayList = this.f;
        int iHashCode4 = (iHashCode3 ^ (arrayList == null ? 0 : arrayList.hashCode())) * 1000003;
        ab30 ab30Var = this.g;
        return iHashCode4 ^ (ab30Var != null ? ab30Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
