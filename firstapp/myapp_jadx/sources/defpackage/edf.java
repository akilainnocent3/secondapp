package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class edf implements u7n {
    public final Drawable a;

    public interface a {
        long a();
    }

    public edf(Drawable drawable) {
        this.a = drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.u7n
    public final long a() {
        Drawable drawable = this.a;
        long jA = drawable instanceof a ? ((a) drawable).a() : ((long) vsh0.b(drawable)) * 4 * ((long) vsh0.a(drawable));
        if (jA < 0) {
            return 0L;
        }
        return jA;
    }

    @Override // defpackage.u7n
    public final int b() {
        return vsh0.a(this.a);
    }

    @Override // defpackage.u7n
    public final int c() {
        return vsh0.b(this.a);
    }

    @Override // defpackage.u7n
    public final void d(Canvas canvas) {
        this.a.draw(canvas);
    }

    @Override // defpackage.u7n
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof edf) && Intrinsics.g(this.a, ((edf) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
