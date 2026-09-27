package od;

import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import u4.h5;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @m
    public androidx.media3.common.a f118999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public h5.a f119000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f119001c;

    public a() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ a e(a aVar, androidx.media3.common.a aVar2, h5.a aVar3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar2 = aVar.f118999a;
        }
        if ((i10 & 2) != 0) {
            aVar3 = aVar.f119000b;
        }
        if ((i10 & 4) != 0) {
            z10 = aVar.f119001c;
        }
        return aVar.d(aVar2, aVar3, z10);
    }

    @m
    public final androidx.media3.common.a a() {
        return this.f118999a;
    }

    @m
    public final h5.a b() {
        return this.f119000b;
    }

    public final boolean c() {
        return this.f119001c;
    }

    @l
    public final a d(@m androidx.media3.common.a aVar, @m h5.a aVar2, boolean z10) {
        return new a(aVar, aVar2, z10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m0.g(this.f118999a, aVar.f118999a) && m0.g(this.f119000b, aVar.f119000b) && this.f119001c == aVar.f119001c;
    }

    public final boolean f() {
        return this.f119001c;
    }

    @m
    public final androidx.media3.common.a g() {
        return this.f118999a;
    }

    @m
    public final h5.a h() {
        return this.f119000b;
    }

    public int hashCode() {
        androidx.media3.common.a aVar = this.f118999a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        h5.a aVar2 = this.f119000b;
        return ((iHashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + g8.a.a(this.f119001c);
    }

    public final void i(boolean z10) {
        this.f119001c = z10;
    }

    public final void j(@m androidx.media3.common.a aVar) {
        this.f118999a = aVar;
    }

    public final void k(@m h5.a aVar) {
        this.f119000b = aVar;
    }

    @l
    public String toString() {
        return "FormatDataAudioMedia3(token=" + this.f118999a + ", trckGroup=" + this.f119000b + ", checkUncheck=" + this.f119001c + j.f86771d;
    }

    public a(@m androidx.media3.common.a aVar, @m h5.a aVar2, boolean z10) {
        this.f118999a = aVar;
        this.f119000b = aVar2;
        this.f119001c = z10;
    }

    public /* synthetic */ a(androidx.media3.common.a aVar, h5.a aVar2, boolean z10, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : aVar2, (i10 & 4) != 0 ? false : z10);
    }
}
