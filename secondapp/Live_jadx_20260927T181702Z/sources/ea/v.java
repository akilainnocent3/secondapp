package ea;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.window.embedding.EmbeddingRule;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.t0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@da.d
public class v extends EmbeddingRule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f80650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f80651d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(30)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f80652a = new a();

        @oy.l
        @k.t
        public final Rect a(@oy.l WindowMetrics windowMetrics) {
            m0.p(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            m0.o(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @er.e(er.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public v() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public final boolean a(@oy.l WindowMetrics parentMetrics) {
        m0.p(parentMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect rectA = a.f80652a.a(parentMetrics);
        return (this.f80648a == 0 || rectA.width() >= this.f80648a) && (this.f80649b == 0 || Math.min(rectA.width(), rectA.height()) >= this.f80649b);
    }

    public final int b() {
        return this.f80651d;
    }

    public final int c() {
        return this.f80649b;
    }

    public final int d() {
        return this.f80648a;
    }

    public final float e() {
        return this.f80650c;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f80648a == vVar.f80648a && this.f80649b == vVar.f80649b && this.f80650c == vVar.f80650c && this.f80651d == vVar.f80651d;
    }

    public int hashCode() {
        return (((((this.f80648a * 31) + this.f80649b) * 31) + Float.floatToIntBits(this.f80650c)) * 31) + this.f80651d;
    }

    public /* synthetic */ v(int i10, int i11, float f10, int i12, int i13, x xVar) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0.5f : f10, (i13 & 8) != 0 ? 3 : i12);
    }

    public v(int i10, int i11, float f10, int i12) {
        this.f80648a = i10;
        this.f80649b = i11;
        this.f80650c = f10;
        this.f80651d = i12;
    }
}
