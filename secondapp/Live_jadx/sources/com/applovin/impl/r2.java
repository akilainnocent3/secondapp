package com.applovin.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28498d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f28499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f28500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f28501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f28502d;

        public r2 a() {
            return new r2(this.f28499a, this.f28500b, this.f28501c, this.f28502d);
        }

        public a b(int i10) {
            this.f28501c = i10;
            return this;
        }

        public String toString() {
            return "LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=" + this.f28499a + ", signature=" + this.f28500b + ", responseCode=" + this.f28501c + ", nonce=" + this.f28502d + gi.j.f86771d;
        }

        public a a(int i10) {
            this.f28502d = i10;
            return this;
        }

        public a b(String str) {
            this.f28499a = str;
            return this;
        }

        public a a(String str) {
            this.f28500b = str;
            return this;
        }
    }

    public r2(String str, String str2, int i10, int i11) {
        this.f28495a = str;
        this.f28496b = str2;
        this.f28497c = i10;
        this.f28498d = i11;
    }

    public boolean a(Object obj) {
        return obj instanceof r2;
    }

    public int b() {
        return this.f28498d;
    }

    public int c() {
        return this.f28497c;
    }

    public String d() {
        return this.f28496b;
    }

    public String e() {
        return this.f28495a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        if (!r2Var.a(this) || c() != r2Var.c() || b() != r2Var.b()) {
            return false;
        }
        String strE = e();
        String strE2 = r2Var.e();
        if (strE != null ? !strE.equals(strE2) : strE2 != null) {
            return false;
        }
        String strD = d();
        String strD2 = r2Var.d();
        return strD != null ? strD.equals(strD2) : strD2 == null;
    }

    public int hashCode() {
        int iC = ((c() + 59) * 59) + b();
        String strE = e();
        int iHashCode = (iC * 59) + (strE == null ? 43 : strE.hashCode());
        String strD = d();
        return (iHashCode * 59) + (strD != null ? strD.hashCode() : 43);
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + e() + ", signature=" + d() + ", responseCode=" + c() + ", nonce=" + b() + gi.j.f86771d;
    }

    public static a a() {
        return new a();
    }
}
