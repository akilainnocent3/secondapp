package ik;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends f0.f.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94693a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.f.a.b.AbstractC0909a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f94694a;

        @Override // ik.f0.f.a.b.AbstractC0909a
        public f0.f.a.b a() {
            String str = this.f94694a;
            if (str != null) {
                return new j(str);
            }
            throw new IllegalStateException("Missing required properties: clsId");
        }

        @Override // ik.f0.f.a.b.AbstractC0909a
        public f0.f.a.b.AbstractC0909a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null clsId");
            }
            this.f94694a = str;
            return this;
        }

        public b() {
        }

        public b(f0.f.a.b bVar) {
            this.f94694a = bVar.b();
        }
    }

    @Override // ik.f0.f.a.b
    @NonNull
    public String b() {
        return this.f94693a;
    }

    @Override // ik.f0.f.a.b
    public f0.f.a.b.AbstractC0909a c() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.a.b) {
            return this.f94693a.equals(((f0.f.a.b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f94693a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f94693a + "}";
    }

    public j(String str) {
        this.f94693a = str;
    }
}
