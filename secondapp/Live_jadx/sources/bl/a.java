package bl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f21775b;

    public a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f21774a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f21775b = list;
    }

    @Override // bl.w
    public List<String> b() {
        return this.f21775b;
    }

    @Override // bl.w
    public String c() {
        return this.f21774a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f21774a.equals(wVar.c()) && this.f21775b.equals(wVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f21774a.hashCode() ^ 1000003) * 1000003) ^ this.f21775b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f21774a + ", usedDates=" + this.f21775b + "}";
    }
}
