package ie;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f90597b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f90598a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f90599a = null;

        public b a() {
            return new b(this.f90599a);
        }

        public a b(e eVar) {
            this.f90599a = eVar;
            return this;
        }
    }

    public b(e eVar) {
        this.f90598a = eVar;
    }

    public static b a() {
        return f90597b;
    }

    public static a d() {
        return new a();
    }

    @uk.a.b
    public e b() {
        e eVar = this.f90598a;
        return eVar == null ? e.b() : eVar;
    }

    @uk.a.InterfaceC1443a(name = "storageMetrics")
    @xk.d(tag = 1)
    public e c() {
        return this.f90598a;
    }
}
