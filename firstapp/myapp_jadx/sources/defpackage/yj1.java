package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yj1 extends le00 {
    public final String b;
    public final ke00.a c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    public static final class a extends le00.a {
        public String a;
        public ke00.a b;
        public String c;
        public String d;
        public long e;
        public long f;
        public String g;
        public byte h;

        public final yj1 a() {
            if (this.h == 3 && this.b != null) {
                return new yj1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" registrationStatus");
            }
            if ((this.h & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((this.h & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            ib5.a(ltb.a(sb, "Missing required properties:"));
            return null;
        }
    }

    public yj1(String str, ke00.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }

    @Override // defpackage.le00
    public final String a() {
        return this.d;
    }

    @Override // defpackage.le00
    public final long b() {
        return this.f;
    }

    @Override // defpackage.le00
    public final String c() {
        return this.b;
    }

    @Override // defpackage.le00
    public final String d() {
        return this.h;
    }

    @Override // defpackage.le00
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof le00)) {
            return false;
        }
        le00 le00Var = (le00) obj;
        String str = this.b;
        if (str == null) {
            if (le00Var.c() != null) {
                return false;
            }
        } else if (!str.equals(le00Var.c())) {
            return false;
        }
        if (!this.c.equals(le00Var.f())) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (le00Var.a() != null) {
                return false;
            }
        } else if (!str2.equals(le00Var.a())) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null) {
            if (le00Var.e() != null) {
                return false;
            }
        } else if (!str3.equals(le00Var.e())) {
            return false;
        }
        if (this.f != le00Var.b() || this.g != le00Var.g()) {
            return false;
        }
        String str4 = this.h;
        if (str4 == null) {
            return le00Var.d() == null;
        }
        return str4.equals(le00Var.d());
    }

    @Override // defpackage.le00
    public final ke00.a f() {
        return this.c;
    }

    @Override // defpackage.le00
    public final long g() {
        return this.g;
    }

    public final a h() {
        a aVar = new a();
        aVar.a = this.b;
        aVar.b = this.c;
        aVar.c = this.d;
        aVar.d = this.e;
        aVar.e = this.f;
        aVar.f = this.g;
        aVar.g = this.h;
        aVar.h = (byte) 3;
        return aVar;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", registrationStatus=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", refreshToken=");
        sb.append(this.e);
        sb.append(", expiresInSecs=");
        sb.append(this.f);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.g);
        sb.append(", fisError=");
        return uf80.a(sb, this.h, "}");
    }
}
