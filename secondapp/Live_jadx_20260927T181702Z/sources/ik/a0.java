package ik;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends f0.f.AbstractC0923f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94558a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.f.AbstractC0923f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f94559a;

        @Override // ik.f0.f.AbstractC0923f.a
        public f0.f.AbstractC0923f a() {
            String str = this.f94559a;
            if (str != null) {
                return new a0(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // ik.f0.f.AbstractC0923f.a
        public f0.f.AbstractC0923f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f94559a = str;
            return this;
        }
    }

    @Override // ik.f0.f.AbstractC0923f
    @NonNull
    public String b() {
        return this.f94558a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.AbstractC0923f) {
            return this.f94558a.equals(((f0.f.AbstractC0923f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f94558a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f94558a + "}";
    }

    public a0(String str) {
        this.f94558a = str;
    }
}
