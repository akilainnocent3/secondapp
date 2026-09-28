package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class oe4 implements u7n {
    public final Bitmap a;

    public oe4(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.u7n
    public final long a() {
        return ze4.a(this.a);
    }

    @Override // defpackage.u7n
    public final int b() {
        return this.a.getHeight();
    }

    @Override // defpackage.u7n
    public final int c() {
        return this.a.getWidth();
    }

    @Override // defpackage.u7n
    public final void d(Canvas canvas) {
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
    }

    @Override // defpackage.u7n
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oe4) && Intrinsics.g(this.a, ((oe4) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=true)";
    }
}
