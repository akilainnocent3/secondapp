package ft;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final a f85325d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final w f85326e = new w(g0.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final g0 f85327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final KotlinVersion f85328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final g0 f85329c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        public final w a() {
            return w.f85326e;
        }

        public a() {
        }
    }

    public w(@oy.l g0 reportLevelBefore, @oy.m KotlinVersion kotlinVersion, @oy.l g0 reportLevelAfter) {
        m0.p(reportLevelBefore, "reportLevelBefore");
        m0.p(reportLevelAfter, "reportLevelAfter");
        this.f85327a = reportLevelBefore;
        this.f85328b = kotlinVersion;
        this.f85329c = reportLevelAfter;
    }

    @oy.l
    public final g0 b() {
        return this.f85329c;
    }

    @oy.l
    public final g0 c() {
        return this.f85327a;
    }

    @oy.m
    public final KotlinVersion d() {
        return this.f85328b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f85327a == wVar.f85327a && m0.g(this.f85328b, wVar.f85328b) && this.f85329c == wVar.f85329c;
    }

    public int hashCode() {
        int iHashCode = this.f85327a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f85328b;
        return ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.hashCode())) * 31) + this.f85329c.hashCode();
    }

    @oy.l
    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f85327a + ", sinceVersion=" + this.f85328b + ", reportLevelAfter=" + this.f85329c + ')';
    }

    public /* synthetic */ w(g0 g0Var, KotlinVersion kotlinVersion, g0 g0Var2, int i10, kotlin.jvm.internal.x xVar) {
        this(g0Var, (i10 & 2) != 0 ? new KotlinVersion(1, 0) : kotlinVersion, (i10 & 4) != 0 ? g0Var : g0Var2);
    }
}
