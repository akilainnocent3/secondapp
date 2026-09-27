package da;

import android.graphics.Rect;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f78647d;

    public b(int i10, int i11, int i12, int i13) {
        this.f78644a = i10;
        this.f78645b = i11;
        this.f78646c = i12;
        this.f78647d = i13;
    }

    public final int a() {
        return this.f78647d;
    }

    public final int b() {
        return this.f78647d - this.f78645b;
    }

    public final int c() {
        return this.f78644a;
    }

    public final int d() {
        return this.f78646c;
    }

    public final int e() {
        return this.f78645b;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(b.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        b bVar = (b) obj;
        return this.f78644a == bVar.f78644a && this.f78645b == bVar.f78645b && this.f78646c == bVar.f78646c && this.f78647d == bVar.f78647d;
    }

    public final int f() {
        return this.f78646c - this.f78644a;
    }

    public final boolean g() {
        return b() == 0 || f() == 0;
    }

    public final boolean h() {
        return b() == 0 && f() == 0;
    }

    public int hashCode() {
        return (((((this.f78644a * 31) + this.f78645b) * 31) + this.f78646c) * 31) + this.f78647d;
    }

    @l
    public final Rect i() {
        return new Rect(this.f78644a, this.f78645b, this.f78646c, this.f78647d);
    }

    @l
    public String toString() {
        return ((Object) b.class.getSimpleName()) + " { [" + this.f78644a + fw.b.f85380g + this.f78645b + fw.b.f85380g + this.f78646c + fw.b.f85380g + this.f78647d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@l Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        m0.p(rect, "rect");
    }
}
