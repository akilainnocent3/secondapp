package ik;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends f0.f.d.AbstractC0921d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94819a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.f.d.AbstractC0921d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f94820a;

        @Override // ik.f0.f.d.AbstractC0921d.a
        public f0.f.d.AbstractC0921d a() {
            String str = this.f94820a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // ik.f0.f.d.AbstractC0921d.a
        public f0.f.d.AbstractC0921d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f94820a = str;
            return this;
        }
    }

    @Override // ik.f0.f.d.AbstractC0921d
    @NonNull
    public String b() {
        return this.f94819a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.AbstractC0921d) {
            return this.f94819a.equals(((f0.f.d.AbstractC0921d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f94819a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f94819a + "}";
    }

    public v(String str) {
        this.f94819a = str;
    }
}
