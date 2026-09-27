package ik;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends f0.f.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f94839d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.f.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f94841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f94842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f94843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f94844e;

        @Override // ik.f0.f.e.a
        public f0.f.e a() {
            String str;
            String str2;
            if (this.f94844e == 3 && (str = this.f94841b) != null && (str2 = this.f94842c) != null) {
                return new z(this.f94840a, str, str2, this.f94843d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f94844e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f94841b == null) {
                sb2.append(" version");
            }
            if (this.f94842c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f94844e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ik.f0.f.e.a
        public f0.f.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f94842c = str;
            return this;
        }

        @Override // ik.f0.f.e.a
        public f0.f.e.a c(boolean z10) {
            this.f94843d = z10;
            this.f94844e = (byte) (this.f94844e | 2);
            return this;
        }

        @Override // ik.f0.f.e.a
        public f0.f.e.a d(int i10) {
            this.f94840a = i10;
            this.f94844e = (byte) (this.f94844e | 1);
            return this;
        }

        @Override // ik.f0.f.e.a
        public f0.f.e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f94841b = str;
            return this;
        }
    }

    @Override // ik.f0.f.e
    @NonNull
    public String b() {
        return this.f94838c;
    }

    @Override // ik.f0.f.e
    public int c() {
        return this.f94836a;
    }

    @Override // ik.f0.f.e
    @NonNull
    public String d() {
        return this.f94837b;
    }

    @Override // ik.f0.f.e
    public boolean e() {
        return this.f94839d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.e) {
            f0.f.e eVar = (f0.f.e) obj;
            if (this.f94836a == eVar.c() && this.f94837b.equals(eVar.d()) && this.f94838c.equals(eVar.b()) && this.f94839d == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f94836a ^ 1000003) * 1000003) ^ this.f94837b.hashCode()) * 1000003) ^ this.f94838c.hashCode()) * 1000003) ^ (this.f94839d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f94836a + ", version=" + this.f94837b + ", buildVersion=" + this.f94838c + ", jailbroken=" + this.f94839d + "}";
    }

    public z(int i10, String str, String str2, boolean z10) {
        this.f94836a = i10;
        this.f94837b = str;
        this.f94838c = str2;
        this.f94839d = z10;
    }
}
