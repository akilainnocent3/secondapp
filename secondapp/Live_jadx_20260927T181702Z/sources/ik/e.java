package ik;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends f0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94629b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f94630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f94631b;

        @Override // ik.f0.d.a
        public f0.d a() {
            String str;
            String str2 = this.f94630a;
            if (str2 != null && (str = this.f94631b) != null) {
                return new e(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f94630a == null) {
                sb2.append(" key");
            }
            if (this.f94631b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ik.f0.d.a
        public f0.d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f94630a = str;
            return this;
        }

        @Override // ik.f0.d.a
        public f0.d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f94631b = str;
            return this;
        }
    }

    @Override // ik.f0.d
    @NonNull
    public String b() {
        return this.f94628a;
    }

    @Override // ik.f0.d
    @NonNull
    public String c() {
        return this.f94629b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.d) {
            f0.d dVar = (f0.d) obj;
            if (this.f94628a.equals(dVar.b()) && this.f94629b.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f94628a.hashCode() ^ 1000003) * 1000003) ^ this.f94629b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f94628a + ", value=" + this.f94629b + "}";
    }

    public e(String str, String str2) {
        this.f94628a = str;
        this.f94629b = str2;
    }
}
