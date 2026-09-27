package ku;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f103130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f103131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f103132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f103133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final String f103134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public final wt.b f103135f;

    public s(T t10, T t11, T t12, T t13, @oy.l String filePath, @oy.l wt.b classId) {
        m0.p(filePath, "filePath");
        m0.p(classId, "classId");
        this.f103130a = t10;
        this.f103131b = t11;
        this.f103132c = t12;
        this.f103133d = t13;
        this.f103134e = filePath;
        this.f103135f = classId;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return m0.g(this.f103130a, sVar.f103130a) && m0.g(this.f103131b, sVar.f103131b) && m0.g(this.f103132c, sVar.f103132c) && m0.g(this.f103133d, sVar.f103133d) && m0.g(this.f103134e, sVar.f103134e) && m0.g(this.f103135f, sVar.f103135f);
    }

    public int hashCode() {
        T t10 = this.f103130a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f103131b;
        int iHashCode2 = (iHashCode + (t11 == null ? 0 : t11.hashCode())) * 31;
        T t12 = this.f103132c;
        int iHashCode3 = (iHashCode2 + (t12 == null ? 0 : t12.hashCode())) * 31;
        T t13 = this.f103133d;
        return ((((iHashCode3 + (t13 != null ? t13.hashCode() : 0)) * 31) + this.f103134e.hashCode()) * 31) + this.f103135f.hashCode();
    }

    @oy.l
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f103130a + ", compilerVersion=" + this.f103131b + ", languageVersion=" + this.f103132c + ", expectedVersion=" + this.f103133d + ", filePath=" + this.f103134e + ", classId=" + this.f103135f + ')';
    }
}
