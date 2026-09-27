package ea;

import android.app.Activity;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@da.d
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final b f80636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final b f80637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f80638c;

    public r(@oy.l b primaryActivityStack, @oy.l b secondaryActivityStack, float f10) {
        m0.p(primaryActivityStack, "primaryActivityStack");
        m0.p(secondaryActivityStack, "secondaryActivityStack");
        this.f80636a = primaryActivityStack;
        this.f80637b = secondaryActivityStack;
        this.f80638c = f10;
    }

    public final boolean a(@oy.l Activity activity) {
        m0.p(activity, "activity");
        return this.f80636a.a(activity) || this.f80637b.a(activity);
    }

    @oy.l
    public final b b() {
        return this.f80636a;
    }

    @oy.l
    public final b c() {
        return this.f80637b;
    }

    public final float d() {
        return this.f80638c;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return m0.g(this.f80636a, rVar.f80636a) && m0.g(this.f80637b, rVar.f80637b) && this.f80638c == rVar.f80638c;
    }

    public int hashCode() {
        return (((this.f80636a.hashCode() * 31) + this.f80637b.hashCode()) * 31) + Float.floatToIntBits(this.f80638c);
    }

    @oy.l
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SplitInfo:{");
        sb2.append("primaryActivityStack=" + b() + fw.b.f85380g);
        sb2.append("secondaryActivityStack=" + c() + fw.b.f85380g);
        sb2.append("splitRatio=" + d() + fw.b.f85383j);
        String string = sb2.toString();
        m0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
