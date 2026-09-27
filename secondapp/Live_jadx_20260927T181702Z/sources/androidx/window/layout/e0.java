package androidx.window.layout;

import fr.r0;
import java.util.List;
import k.y0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final List<m> f19927a;

    /* JADX WARN: Multi-variable type inference failed */
    @y0({y0.a.TESTS})
    public e0(@oy.l List<? extends m> displayFeatures) {
        m0.p(displayFeatures, "displayFeatures");
        this.f19927a = displayFeatures;
    }

    @oy.l
    public final List<m> a() {
        return this.f19927a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !m0.g(e0.class, obj.getClass())) {
            return false;
        }
        return m0.g(this.f19927a, ((e0) obj).f19927a);
    }

    public int hashCode() {
        return this.f19927a.hashCode();
    }

    @oy.l
    public String toString() {
        return r0.r3(this.f19927a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
