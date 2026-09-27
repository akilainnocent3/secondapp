package ik;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends f0.a.AbstractC0906a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94615c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.a.AbstractC0906a.AbstractC0907a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f94616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f94617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f94618c;

        @Override // ik.f0.a.AbstractC0906a.AbstractC0907a
        public f0.a.AbstractC0906a a() {
            String str;
            String str2;
            String str3 = this.f94616a;
            if (str3 != null && (str = this.f94617b) != null && (str2 = this.f94618c) != null) {
                return new d(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f94616a == null) {
                sb2.append(" arch");
            }
            if (this.f94617b == null) {
                sb2.append(" libraryName");
            }
            if (this.f94618c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ik.f0.a.AbstractC0906a.AbstractC0907a
        public f0.a.AbstractC0906a.AbstractC0907a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f94616a = str;
            return this;
        }

        @Override // ik.f0.a.AbstractC0906a.AbstractC0907a
        public f0.a.AbstractC0906a.AbstractC0907a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f94618c = str;
            return this;
        }

        @Override // ik.f0.a.AbstractC0906a.AbstractC0907a
        public f0.a.AbstractC0906a.AbstractC0907a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f94617b = str;
            return this;
        }
    }

    @Override // ik.f0.a.AbstractC0906a
    @NonNull
    public String b() {
        return this.f94613a;
    }

    @Override // ik.f0.a.AbstractC0906a
    @NonNull
    public String c() {
        return this.f94615c;
    }

    @Override // ik.f0.a.AbstractC0906a
    @NonNull
    public String d() {
        return this.f94614b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.a.AbstractC0906a) {
            f0.a.AbstractC0906a abstractC0906a = (f0.a.AbstractC0906a) obj;
            if (this.f94613a.equals(abstractC0906a.b()) && this.f94614b.equals(abstractC0906a.d()) && this.f94615c.equals(abstractC0906a.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f94613a.hashCode() ^ 1000003) * 1000003) ^ this.f94614b.hashCode()) * 1000003) ^ this.f94615c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f94613a + ", libraryName=" + this.f94614b + ", buildId=" + this.f94615c + "}";
    }

    public d(String str, String str2, String str3) {
        this.f94613a = str;
        this.f94614b = str2;
        this.f94615c = str3;
    }
}
