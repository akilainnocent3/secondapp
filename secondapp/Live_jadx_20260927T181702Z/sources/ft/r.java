package ft;

import java.util.Collection;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final ot.i f85309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Collection<b> f85310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85311c;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@oy.l ot.i nullabilityQualifier, @oy.l Collection<? extends b> qualifierApplicabilityTypes, boolean z10) {
        m0.p(nullabilityQualifier, "nullabilityQualifier");
        m0.p(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f85309a = nullabilityQualifier;
        this.f85310b = qualifierApplicabilityTypes;
        this.f85311c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ r b(r rVar, ot.i iVar, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = rVar.f85309a;
        }
        if ((i10 & 2) != 0) {
            collection = rVar.f85310b;
        }
        if ((i10 & 4) != 0) {
            z10 = rVar.f85311c;
        }
        return rVar.a(iVar, collection, z10);
    }

    @oy.l
    public final r a(@oy.l ot.i nullabilityQualifier, @oy.l Collection<? extends b> qualifierApplicabilityTypes, boolean z10) {
        m0.p(nullabilityQualifier, "nullabilityQualifier");
        m0.p(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new r(nullabilityQualifier, qualifierApplicabilityTypes, z10);
    }

    public final boolean c() {
        return this.f85311c;
    }

    @oy.l
    public final ot.i d() {
        return this.f85309a;
    }

    @oy.l
    public final Collection<b> e() {
        return this.f85310b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return m0.g(this.f85309a, rVar.f85309a) && m0.g(this.f85310b, rVar.f85310b) && this.f85311c == rVar.f85311c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.f85309a.hashCode() * 31) + this.f85310b.hashCode()) * 31;
        boolean z10 = this.f85311c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    @oy.l
    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f85309a + ", qualifierApplicabilityTypes=" + this.f85310b + ", definitelyNotNull=" + this.f85311c + ')';
    }

    public /* synthetic */ r(ot.i iVar, Collection collection, boolean z10, int i10, kotlin.jvm.internal.x xVar) {
        this(iVar, collection, (i10 & 4) != 0 ? iVar.c() == ot.h.NOT_NULL : z10);
    }
}
