package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zi1 extends rnn {
    public final String a;
    public final String b;
    public final String c;
    public final qzf0 d;
    public final rnn.a e;

    public zi1(String str, String str2, String str3, kl1 kl1Var, rnn.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = kl1Var;
        this.e = aVar;
    }

    @Override // defpackage.rnn
    public final qzf0 a() {
        return this.d;
    }

    @Override // defpackage.rnn
    public final String b() {
        return this.b;
    }

    @Override // defpackage.rnn
    public final String c() {
        return this.c;
    }

    @Override // defpackage.rnn
    public final rnn.a d() {
        return this.e;
    }

    @Override // defpackage.rnn
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rnn)) {
            return false;
        }
        rnn rnnVar = (rnn) obj;
        String str = this.a;
        if (str == null) {
            if (rnnVar.e() != null) {
                return false;
            }
        } else if (!str.equals(rnnVar.e())) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (rnnVar.b() != null) {
                return false;
            }
        } else if (!str2.equals(rnnVar.b())) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null) {
            if (rnnVar.c() != null) {
                return false;
            }
        } else if (!str3.equals(rnnVar.c())) {
            return false;
        }
        qzf0 qzf0Var = this.d;
        if (qzf0Var == null) {
            if (rnnVar.a() != null) {
                return false;
            }
        } else if (!qzf0Var.equals(rnnVar.a())) {
            return false;
        }
        rnn.a aVar = this.e;
        if (aVar == null) {
            return rnnVar.d() == null;
        }
        return aVar.equals(rnnVar.d());
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        qzf0 qzf0Var = this.d;
        int iHashCode4 = (iHashCode3 ^ (qzf0Var == null ? 0 : qzf0Var.hashCode())) * 1000003;
        rnn.a aVar = this.e;
        return iHashCode4 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
