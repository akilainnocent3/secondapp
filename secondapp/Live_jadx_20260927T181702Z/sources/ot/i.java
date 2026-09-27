package ot;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final h f119596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f119597b;

    public i(@oy.l h qualifier, boolean z10) {
        m0.p(qualifier, "qualifier");
        this.f119596a = qualifier;
        this.f119597b = z10;
    }

    public static /* synthetic */ i b(i iVar, h hVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = iVar.f119596a;
        }
        if ((i10 & 2) != 0) {
            z10 = iVar.f119597b;
        }
        return iVar.a(hVar, z10);
    }

    @oy.l
    public final i a(@oy.l h qualifier, boolean z10) {
        m0.p(qualifier, "qualifier");
        return new i(qualifier, z10);
    }

    @oy.l
    public final h c() {
        return this.f119596a;
    }

    public final boolean d() {
        return this.f119597b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f119596a == iVar.f119596a && this.f119597b == iVar.f119597b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f119596a.hashCode() * 31;
        boolean z10 = this.f119597b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    @oy.l
    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f119596a + ", isForWarningOnly=" + this.f119597b + ')';
    }

    public /* synthetic */ i(h hVar, boolean z10, int i10, x xVar) {
        this(hVar, (i10 & 2) != 0 ? false : z10);
    }
}
