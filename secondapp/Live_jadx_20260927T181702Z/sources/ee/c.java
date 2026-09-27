package ee;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f80766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ae.f<?> f80768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ae.k<?, byte[]> f80769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ae.e f80770e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f80771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f80772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ae.f<?> f80773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ae.k<?, byte[]> f80774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ae.e f80775e;

        @Override // ee.q.a
        public q a() {
            String str = "";
            if (this.f80771a == null) {
                str = " transportContext";
            }
            if (this.f80772b == null) {
                str = str + " transportName";
            }
            if (this.f80773c == null) {
                str = str + " event";
            }
            if (this.f80774d == null) {
                str = str + " transformer";
            }
            if (this.f80775e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f80771a, this.f80772b, this.f80773c, this.f80774d, this.f80775e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ee.q.a
        public q.a b(ae.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f80775e = eVar;
            return this;
        }

        @Override // ee.q.a
        public q.a c(ae.f<?> fVar) {
            if (fVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f80773c = fVar;
            return this;
        }

        @Override // ee.q.a
        public q.a e(ae.k<?, byte[]> kVar) {
            if (kVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f80774d = kVar;
            return this;
        }

        @Override // ee.q.a
        public q.a f(r rVar) {
            if (rVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f80771a = rVar;
            return this;
        }

        @Override // ee.q.a
        public q.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f80772b = str;
            return this;
        }
    }

    @Override // ee.q
    public ae.e b() {
        return this.f80770e;
    }

    @Override // ee.q
    public ae.f<?> c() {
        return this.f80768c;
    }

    @Override // ee.q
    public ae.k<?, byte[]> e() {
        return this.f80769d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f80766a.equals(qVar.f()) && this.f80767b.equals(qVar.g()) && this.f80768c.equals(qVar.c()) && this.f80769d.equals(qVar.e()) && this.f80770e.equals(qVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // ee.q
    public r f() {
        return this.f80766a;
    }

    @Override // ee.q
    public String g() {
        return this.f80767b;
    }

    public int hashCode() {
        return ((((((((this.f80766a.hashCode() ^ 1000003) * 1000003) ^ this.f80767b.hashCode()) * 1000003) ^ this.f80768c.hashCode()) * 1000003) ^ this.f80769d.hashCode()) * 1000003) ^ this.f80770e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f80766a + ", transportName=" + this.f80767b + ", event=" + this.f80768c + ", transformer=" + this.f80769d + ", encoding=" + this.f80770e + "}";
    }

    public c(r rVar, String str, ae.f<?> fVar, ae.k<?, byte[]> kVar, ae.e eVar) {
        this.f80766a = rVar;
        this.f80767b = str;
        this.f80768c = fVar;
        this.f80769d = kVar;
        this.f80770e = eVar;
    }
}
