package androidx.window.layout;

import android.graphics.Rect;
import k.y0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final da.b f19929a;

    public f0(@oy.l da.b _bounds) {
        m0.p(_bounds, "_bounds");
        this.f19929a = _bounds;
    }

    @oy.l
    public final Rect a() {
        return this.f19929a.i();
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m0.g(f0.class, obj.getClass())) {
            return false;
        }
        return m0.g(this.f19929a, ((f0) obj).f19929a);
    }

    public int hashCode() {
        return this.f19929a.hashCode();
    }

    @oy.l
    public String toString() {
        return "WindowMetrics { bounds: " + a() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @y0({y0.a.TESTS})
    public f0(@oy.l Rect bounds) {
        this(new da.b(bounds));
        m0.p(bounds, "bounds");
    }
}
