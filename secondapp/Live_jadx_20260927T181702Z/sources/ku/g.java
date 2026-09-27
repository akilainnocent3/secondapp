package ku;

import kotlin.jvm.internal.m0;
import ws.b1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final tt.c f103073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final rt.a.c f103074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final tt.a f103075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final b1 f103076d;

    public g(@oy.l tt.c nameResolver, @oy.l rt.a.c classProto, @oy.l tt.a metadataVersion, @oy.l b1 sourceElement) {
        m0.p(nameResolver, "nameResolver");
        m0.p(classProto, "classProto");
        m0.p(metadataVersion, "metadataVersion");
        m0.p(sourceElement, "sourceElement");
        this.f103073a = nameResolver;
        this.f103074b = classProto;
        this.f103075c = metadataVersion;
        this.f103076d = sourceElement;
    }

    @oy.l
    public final tt.c a() {
        return this.f103073a;
    }

    @oy.l
    public final rt.a.c b() {
        return this.f103074b;
    }

    @oy.l
    public final tt.a c() {
        return this.f103075c;
    }

    @oy.l
    public final b1 d() {
        return this.f103076d;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return m0.g(this.f103073a, gVar.f103073a) && m0.g(this.f103074b, gVar.f103074b) && m0.g(this.f103075c, gVar.f103075c) && m0.g(this.f103076d, gVar.f103076d);
    }

    public int hashCode() {
        return (((((this.f103073a.hashCode() * 31) + this.f103074b.hashCode()) * 31) + this.f103075c.hashCode()) * 31) + this.f103076d.hashCode();
    }

    @oy.l
    public String toString() {
        return "ClassData(nameResolver=" + this.f103073a + ", classProto=" + this.f103074b + ", metadataVersion=" + this.f103075c + ", sourceElement=" + this.f103076d + ')';
    }
}
