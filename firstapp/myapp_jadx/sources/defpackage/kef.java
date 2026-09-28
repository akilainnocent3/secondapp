package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import defpackage.j42;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kef<S extends j42> {
    public final S a;
    public final Path b;
    public final Path c;
    public final PathMeasure d;
    public final Matrix e;

    public static class a {
        public float a;
        public float b;
        public int c;
        public int d;
        public float e = 1.0f;
        public float f;
        public float g;
        public boolean h;
    }

    public kef(S s) {
        Path path = new Path();
        this.b = path;
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.a = s;
        this.e = new Matrix();
    }

    public static float h(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2);

    public abstract void b(int i, int i2, Canvas canvas, Paint paint);

    public abstract void c(Canvas canvas, Paint paint, a aVar, int i);

    public abstract void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    public abstract int e();

    public abstract int f();

    public abstract void g();

    public class b {
        public final float[] a;
        public final float[] b;
        public final Matrix c;

        public b(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.a = fArr3;
            float[] fArr4 = new float[2];
            this.b = fArr4;
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, fArr4, 0, 2);
            this.c = new Matrix();
        }

        public final void a(float f) {
            float[] fArr = this.b;
            float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
            float[] fArr2 = this.a;
            double d = f;
            double d2 = fAtan2;
            fArr2[0] = (float) ((Math.cos(d2) * d) + ((double) fArr2[0]));
            fArr2[1] = (float) ((Math.sin(d2) * d) + ((double) fArr2[1]));
        }

        public final void b() {
            Arrays.fill(this.a, 0.0f);
            float[] fArr = this.b;
            Arrays.fill(fArr, 0.0f);
            fArr[0] = 1.0f;
            this.c.reset();
        }

        public final void c(float f) {
            Matrix matrix = this.c;
            matrix.reset();
            matrix.setRotate(f);
            matrix.mapPoints(this.a);
            matrix.mapPoints(this.b);
        }

        public final void d(float f) {
            float[] fArr = this.a;
            fArr[0] = fArr[0] * 1.0f;
            fArr[1] = fArr[1] * f;
            float[] fArr2 = this.b;
            fArr2[0] = fArr2[0] * 1.0f;
            fArr2[1] = fArr2[1] * f;
        }

        public final void e(float f) {
            float[] fArr = this.a;
            fArr[0] = fArr[0] + f;
            fArr[1] = fArr[1] + 0.0f;
        }

        public b() {
            this.a = new float[2];
            this.b = new float[]{1.0f, 0.0f};
            this.c = new Matrix();
        }
    }
}
