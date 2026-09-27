package ik;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends f0.f.d.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94831b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.f.d.e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f94832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f94833b;

        @Override // ik.f0.f.d.e.b.a
        public f0.f.d.e.b a() {
            String str;
            String str2 = this.f94832a;
            if (str2 != null && (str = this.f94833b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f94832a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f94833b == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ik.f0.f.d.e.b.a
        public f0.f.d.e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f94832a = str;
            return this;
        }

        @Override // ik.f0.f.d.e.b.a
        public f0.f.d.e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f94833b = str;
            return this;
        }
    }

    @Override // ik.f0.f.d.e.b
    @NonNull
    public String b() {
        return this.f94830a;
    }

    @Override // ik.f0.f.d.e.b
    @NonNull
    public String c() {
        return this.f94831b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.e.b) {
            f0.f.d.e.b bVar = (f0.f.d.e.b) obj;
            if (this.f94830a.equals(bVar.b()) && this.f94831b.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f94830a.hashCode() ^ 1000003) * 1000003) ^ this.f94831b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f94830a + ", variantId=" + this.f94831b + "}";
    }

    public x(String str, String str2) {
        this.f94830a = str;
        this.f94831b = str2;
    }
}
