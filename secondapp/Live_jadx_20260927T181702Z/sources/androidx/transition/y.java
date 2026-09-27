package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class y extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Path f19707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Path f19708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f19709c;

    public y() {
        Path path = new Path();
        this.f19708b = path;
        this.f19709c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f19707a = path;
    }

    public static float b(float f10, float f11) {
        return (float) Math.sqrt((f10 * f10) + (f11 * f11));
    }

    @Override // androidx.transition.w
    @NonNull
    public Path a(float f10, float f11, float f12, float f13) {
        float f14 = f12 - f10;
        float f15 = f13 - f11;
        float fB = b(f14, f15);
        double dAtan2 = Math.atan2(f15, f14);
        this.f19709c.setScale(fB, fB);
        this.f19709c.postRotate((float) Math.toDegrees(dAtan2));
        this.f19709c.postTranslate(f10, f11);
        Path path = new Path();
        this.f19708b.transform(this.f19709c, path);
        return path;
    }

    @NonNull
    public Path c() {
        return this.f19707a;
    }

    public void d(@NonNull Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f10 = fArr[0];
        float f11 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f12 = fArr[0];
        float f13 = fArr[1];
        if (f12 == f10 && f13 == f11) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f19709c.setTranslate(-f12, -f13);
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fB = 1.0f / b(f14, f15);
        this.f19709c.postScale(fB, fB);
        this.f19709c.postRotate((float) Math.toDegrees(-Math.atan2(f15, f14)));
        path.transform(this.f19709c, this.f19708b);
        this.f19707a = path;
    }

    public y(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this.f19708b = new Path();
        this.f19709c = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f19494k);
        try {
            String strM = h1.n.m(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strM != null) {
                d(k1.l0.e(strM));
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public y(@NonNull Path path) {
        this.f19708b = new Path();
        this.f19709c = new Matrix();
        d(path);
    }
}
