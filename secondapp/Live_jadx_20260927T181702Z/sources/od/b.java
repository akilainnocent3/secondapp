package od;

import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import u4.h5;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @m
    public androidx.media3.common.a f119002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public h5.a f119003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f119004c;

    public b() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ b e(b bVar, androidx.media3.common.a aVar, h5.a aVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = bVar.f119002a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = bVar.f119003b;
        }
        if ((i10 & 4) != 0) {
            z10 = bVar.f119004c;
        }
        return bVar.d(aVar, aVar2, z10);
    }

    @m
    public final androidx.media3.common.a a() {
        return this.f119002a;
    }

    @m
    public final h5.a b() {
        return this.f119003b;
    }

    public final boolean c() {
        return this.f119004c;
    }

    @l
    public final b d(@m androidx.media3.common.a aVar, @m h5.a aVar2, boolean z10) {
        return new b(aVar, aVar2, z10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m0.g(this.f119002a, bVar.f119002a) && m0.g(this.f119003b, bVar.f119003b) && this.f119004c == bVar.f119004c;
    }

    public final boolean f() {
        return this.f119004c;
    }

    @m
    public final androidx.media3.common.a g() {
        return this.f119002a;
    }

    @m
    public final h5.a h() {
        return this.f119003b;
    }

    public int hashCode() {
        androidx.media3.common.a aVar = this.f119002a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        h5.a aVar2 = this.f119003b;
        return ((iHashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + g8.a.a(this.f119004c);
    }

    public final void i(boolean z10) {
        this.f119004c = z10;
    }

    public final void j(@m androidx.media3.common.a aVar) {
        this.f119002a = aVar;
    }

    public final void k(@m h5.a aVar) {
        this.f119003b = aVar;
    }

    @l
    public String toString() {
        return "FormatDataMedia3(token=" + this.f119002a + ", trckGroup=" + this.f119003b + ", checkUncheck=" + this.f119004c + j.f86771d;
    }

    public b(@m androidx.media3.common.a aVar, @m h5.a aVar2, boolean z10) {
        this.f119002a = aVar;
        this.f119003b = aVar2;
        this.f119004c = z10;
    }

    public /* synthetic */ b(androidx.media3.common.a aVar, h5.a aVar2, boolean z10, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : aVar2, (i10 & 4) != 0 ? false : z10);
    }
}
