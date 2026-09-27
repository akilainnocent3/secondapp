package wi;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class k extends androidx.transition.w {
    public static PointF b(float f10, float f11, float f12, float f13) {
        return f11 > f13 ? new PointF(f12, f11) : new PointF(f10, f13);
    }

    @Override // androidx.transition.w
    @NonNull
    public Path a(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        PointF pointFB = b(f10, f11, f12, f13);
        path.quadTo(pointFB.x, pointFB.y, f12, f13);
        return path;
    }
}
