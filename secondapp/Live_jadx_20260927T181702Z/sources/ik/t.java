package ik;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends f0.f.d.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f94800d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends f0.f.d.a.c.AbstractC0920a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f94801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f94802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f94803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f94804d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f94805e;

        @Override // ik.f0.f.d.a.c.AbstractC0920a
        public f0.f.d.a.c a() {
            String str;
            if (this.f94805e == 7 && (str = this.f94801a) != null) {
                return new t(str, this.f94802b, this.f94803c, this.f94804d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f94801a == null) {
                sb2.append(" processName");
            }
            if ((this.f94805e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f94805e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f94805e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // ik.f0.f.d.a.c.AbstractC0920a
        public f0.f.d.a.c.AbstractC0920a b(boolean z10) {
            this.f94804d = z10;
            this.f94805e = (byte) (this.f94805e | 4);
            return this;
        }

        @Override // ik.f0.f.d.a.c.AbstractC0920a
        public f0.f.d.a.c.AbstractC0920a c(int i10) {
            this.f94803c = i10;
            this.f94805e = (byte) (this.f94805e | 2);
            return this;
        }

        @Override // ik.f0.f.d.a.c.AbstractC0920a
        public f0.f.d.a.c.AbstractC0920a d(int i10) {
            this.f94802b = i10;
            this.f94805e = (byte) (this.f94805e | 1);
            return this;
        }

        @Override // ik.f0.f.d.a.c.AbstractC0920a
        public f0.f.d.a.c.AbstractC0920a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f94801a = str;
            return this;
        }
    }

    @Override // ik.f0.f.d.a.c
    public int b() {
        return this.f94799c;
    }

    @Override // ik.f0.f.d.a.c
    public int c() {
        return this.f94798b;
    }

    @Override // ik.f0.f.d.a.c
    @NonNull
    public String d() {
        return this.f94797a;
    }

    @Override // ik.f0.f.d.a.c
    public boolean e() {
        return this.f94800d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.f.d.a.c) {
            f0.f.d.a.c cVar = (f0.f.d.a.c) obj;
            if (this.f94797a.equals(cVar.d()) && this.f94798b == cVar.c() && this.f94799c == cVar.b() && this.f94800d == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f94797a.hashCode() ^ 1000003) * 1000003) ^ this.f94798b) * 1000003) ^ this.f94799c) * 1000003) ^ (this.f94800d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f94797a + ", pid=" + this.f94798b + ", importance=" + this.f94799c + ", defaultProcess=" + this.f94800d + "}";
    }

    public t(String str, int i10, int i11, boolean z10) {
        this.f94797a = str;
        this.f94798b = i10;
        this.f94799c = i11;
        this.f94800d = z10;
    }
}
