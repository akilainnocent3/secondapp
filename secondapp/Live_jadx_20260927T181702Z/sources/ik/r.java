package ik;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends f0.f.d.a.b.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f0.f.d.a.b.e.AbstractC0918b> f94781c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.f.d.a.b.e.AbstractC0917a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f94782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f94783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<f0.f.d.a.b.e.AbstractC0918b> f94784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f94785d;

        @Override // ik.f0.f.d.a.b.e.AbstractC0917a
        public f0.f.d.a.b.e a() {
            String str;
            List<f0.f.d.a.b.e.AbstractC0918b> list;
            if (this.f94785d == 1 && (str = this.f94782a) != null && (list = this.f94784c) != null) {
                return new r(str, this.f94783b, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f94782a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f94785d) == 0) {
                sb2.append(" importance");
            }
            if (this.f94784c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ik.f0.f.d.a.b.e.AbstractC0917a
        public f0.f.d.a.b.e.AbstractC0917a b(List<f0.f.d.a.b.e.AbstractC0918b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f94784c = list;
            return this;
        }

        @Override // ik.f0.f.d.a.b.e.AbstractC0917a
        public f0.f.d.a.b.e.AbstractC0917a c(int i10) {
            this.f94783b = i10;
            this.f94785d = (byte) (this.f94785d | 1);
            return this;
        }

        @Override // ik.f0.f.d.a.b.e.AbstractC0917a
        public f0.f.d.a.b.e.AbstractC0917a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f94782a = str;
            return this;
        }
    }

    @Override // ik.f0.f.d.a.b.e
    @NonNull
    public List<f0.f.d.a.b.e.AbstractC0918b> b() {
        return this.f94781c;
    }

    @Override // ik.f0.f.d.a.b.e
    public int c() {
        return this.f94780b;
    }

    @Override // ik.f0.f.d.a.b.e
    @NonNull
    public String d() {
        return this.f94779a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.a.b.e) {
            f0.f.d.a.b.e eVar = (f0.f.d.a.b.e) obj;
            if (this.f94779a.equals(eVar.d()) && this.f94780b == eVar.c() && this.f94781c.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f94779a.hashCode() ^ 1000003) * 1000003) ^ this.f94780b) * 1000003) ^ this.f94781c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f94779a + ", importance=" + this.f94780b + ", frames=" + this.f94781c + "}";
    }

    public r(String str, int i10, List<f0.f.d.a.b.e.AbstractC0918b> list) {
        this.f94779a = str;
        this.f94780b = i10;
        this.f94781c = list;
    }
}
