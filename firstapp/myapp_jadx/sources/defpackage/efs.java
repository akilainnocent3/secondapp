package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

/* JADX INFO: loaded from: classes4.dex */
public final class efs extends kef<LinearProgressIndicatorSpec> {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public Pair<kef<LinearProgressIndicatorSpec>.b, kef<LinearProgressIndicatorSpec>.b> o;

    @Override // defpackage.kef
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        if (this.f != rect.width()) {
            this.f = rect.width();
            g();
        }
        float fE = e();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - fE) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.a;
        if (linearProgressIndicatorSpec.q) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.f / 2.0f;
        float f3 = fE / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        int i = linearProgressIndicatorSpec.a;
        this.g = i * f;
        this.h = Math.min(i / 2, linearProgressIndicatorSpec.a()) * f;
        this.j = linearProgressIndicatorSpec.l * f;
        this.i = Math.min(linearProgressIndicatorSpec.a / 2.0f, linearProgressIndicatorSpec.e()) * f;
        if (z || z2) {
            if ((z && linearProgressIndicatorSpec.g == 2) || (z2 && linearProgressIndicatorSpec.h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && linearProgressIndicatorSpec.h != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * linearProgressIndicatorSpec.a) / 2.0f);
            }
        }
        if (z2 && linearProgressIndicatorSpec.h == 3) {
            this.n = f;
        } else {
            this.n = 1.0f;
        }
    }

    @Override // defpackage.kef
    public final void b(int i, int i2, Canvas canvas, Paint paint) {
        int iA = vbv.a(i, i2);
        this.m = false;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.a;
        if (linearProgressIndicatorSpec.r <= 0 || iA == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
        Integer num = linearProgressIndicatorSpec.s;
        kef<LinearProgressIndicatorSpec>.b bVar = new kef.b(new float[]{(this.f / 2.0f) - (num != null ? (linearProgressIndicatorSpec.r / 2.0f) + num.floatValue() : this.g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        int i3 = linearProgressIndicatorSpec.r;
        j(canvas, paint, bVar, i3, i3, (this.h * i3) / this.g, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // defpackage.kef
    public final void c(Canvas canvas, Paint paint, kef.a aVar, int i) {
        int iA = vbv.a(aVar.c, i);
        this.m = aVar.h;
        float f = aVar.a;
        float f2 = aVar.b;
        int i2 = aVar.d;
        i(canvas, paint, f, f2, iA, i2, i2, aVar.e, aVar.f, true);
    }

    @Override // defpackage.kef
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iA = vbv.a(i, i2);
        this.m = false;
        i(canvas, paint, f, f2, iA, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.kef
    public final int e() {
        S s = this.a;
        return (((LinearProgressIndicatorSpec) s).l * 2) + ((LinearProgressIndicatorSpec) s).a;
    }

    @Override // defpackage.kef
    public final int f() {
        return -1;
    }

    @Override // defpackage.kef
    public final void g() {
        Path path = this.b;
        path.rewind();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.a;
        if (linearProgressIndicatorSpec.b(this.m)) {
            int i = this.m ? linearProgressIndicatorSpec.j : linearProgressIndicatorSpec.k;
            float f = this.f;
            int i2 = (int) (f / i);
            this.k = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = f2 + 0.48f;
                float f4 = i4 + 2;
                path.cubicTo(f3, 1.0f, f4 - 0.48f, 0.0f, f4, 0.0f);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.k / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f, 0.0f);
        }
        this.d.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float fC;
        float fC2;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec;
        int i4;
        float f5;
        Canvas canvas2;
        Pair<kef<LinearProgressIndicatorSpec>.b, kef<LinearProgressIndicatorSpec>.b> pair = this.o;
        float fA = cdv.a(f, 0.0f, 1.0f);
        float fA2 = cdv.a(f2, 0.0f, 1.0f);
        float fC3 = bdv.c(1.0f - this.n, 1.0f, fA);
        float fC4 = bdv.c(1.0f - this.n, 1.0f, fA2);
        int iA = (int) ((cdv.a(fC3, 0.0f, 0.01f) * i2) / 0.01f);
        int iA2 = (int) (((1.0f - cdv.a(fC4, 0.99f, 1.0f)) * i3) / 0.01f);
        float f6 = this.f;
        int i5 = (int) ((fC3 * f6) + iA);
        int i6 = (int) ((fC4 * f6) - iA2);
        float f7 = this.h;
        float f8 = this.i;
        if (f7 != f8) {
            float fMax = Math.max(f7, f8);
            float f9 = this.f;
            float f10 = fMax / f9;
            fC = bdv.c(this.h, this.i, cdv.a(i5 / f9, 0.0f, f10) / f10);
            float f11 = this.h;
            float f12 = this.i;
            float f13 = this.f;
            fC2 = bdv.c(f11, f12, cdv.a((f13 - i6) / f13, 0.0f, f10) / f10);
        } else {
            fC = f7;
            fC2 = fC;
        }
        float f14 = (-this.f) / 2.0f;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec) this.a;
        boolean z2 = linearProgressIndicatorSpec2.b(this.m) && z && f3 > 0.0f;
        if (i5 <= i6) {
            float f15 = i5 + fC;
            float f16 = i6 - fC2;
            float f17 = fC * 2.0f;
            float f18 = fC2 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.g);
            ((kef.b) pair.first).b();
            ((kef.b) pair.second).b();
            ((kef.b) pair.first).e(f15 + f14);
            ((kef.b) pair.second).e(f16 + f14);
            if (i5 == 0 && f16 + fC2 < f15 + fC) {
                kef<LinearProgressIndicatorSpec>.b bVar = (kef.b) pair.first;
                float f19 = this.g;
                j(canvas, paint, bVar, f17, f19, fC, (kef.b) pair.second, f18, f19, fC2, true);
                return;
            }
            if (f15 - fC > f16 - fC2) {
                kef<LinearProgressIndicatorSpec>.b bVar2 = (kef.b) pair.second;
                float f20 = this.g;
                j(canvas, paint, bVar2, f18, f20, fC2, (kef.b) pair.first, f17, f20, fC, false);
                return;
            }
            float f21 = fC2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(linearProgressIndicatorSpec2.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                float f22 = this.f;
                float f23 = f15 / f22;
                float f24 = f16 / f22;
                if (this.m) {
                    linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
                    i4 = linearProgressIndicatorSpec.j;
                } else {
                    linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
                    i4 = linearProgressIndicatorSpec.k;
                }
                if (i4 != this.l) {
                    this.l = i4;
                    g();
                }
                Path path = this.c;
                path.rewind();
                float f25 = (-this.f) / 2.0f;
                boolean zB = linearProgressIndicatorSpec.b(this.m);
                if (zB) {
                    float f26 = this.f;
                    f5 = 1.0f;
                    float f27 = this.k;
                    float f28 = f26 / f27;
                    float f29 = f4 / f28;
                    float f30 = f28 / (f28 + 1.0f);
                    f23 = (f23 + f29) * f30;
                    f24 = (f24 + f29) * f30;
                    f25 -= f27 * f4;
                } else {
                    f5 = 1.0f;
                }
                PathMeasure pathMeasure = this.d;
                float length = pathMeasure.getLength() * f23;
                float length2 = pathMeasure.getLength() * f24;
                pathMeasure.getSegment(length, length2, path, true);
                kef.b bVar3 = (kef.b) pair.first;
                bVar3.b();
                pathMeasure.getPosTan(length, bVar3.a, bVar3.b);
                kef.b bVar4 = (kef.b) pair.second;
                bVar4.b();
                pathMeasure.getPosTan(length2, bVar4.a, bVar4.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f25, 0.0f);
                bVar3.e(f25);
                bVar4.e(f25);
                if (zB) {
                    float f31 = this.j * f3;
                    matrix.postScale(f5, f31);
                    bVar3.d(f31);
                    bVar4.d(f31);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((kef.b) pair.first).a;
                float f32 = fArr[0];
                float f33 = fArr[1];
                float[] fArr2 = ((kef.b) pair.second).a;
                canvas.drawLine(f32, f33, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                linearProgressIndicatorSpec = linearProgressIndicatorSpec2;
            }
            if (linearProgressIndicatorSpec.c()) {
                return;
            }
            if (f15 > 0.0f && fC > 0.0f) {
                j(canvas2, paint, (kef.b) pair.first, f17, this.g, fC, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f16 >= this.f || f21 <= 0.0f) {
                return;
            }
            j(canvas, paint, (kef.b) pair.second, f18, this.g, f21, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    public final void j(Canvas canvas, Paint paint, kef<LinearProgressIndicatorSpec>.b bVar, float f, float f2, float f3, kef<LinearProgressIndicatorSpec>.b bVar2, float f4, float f5, float f6, boolean z) {
        float f7;
        float f8;
        float fMin = Math.min(f2, this.g);
        float f9 = (-f) / 2.0f;
        float f10 = (-fMin) / 2.0f;
        float f11 = f / 2.0f;
        float f12 = fMin / 2.0f;
        RectF rectF = new RectF(f9, f10, f11, f12);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (bVar2 != null) {
            float[] fArr = bVar2.b;
            float[] fArr2 = bVar2.a;
            float fMin2 = Math.min(f5, this.g);
            float fMin3 = Math.min(f4 / 2.0f, (f6 * fMin2) / this.g);
            RectF rectF2 = new RectF();
            if (z) {
                float f13 = (fArr2[0] - fMin3) - (bVar.a[0] - f3);
                if (f13 > 0.0f) {
                    bVar2.e((-f13) / 2.0f);
                    f8 = f4 + f13;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f10, f11, f12);
            } else {
                float f14 = (fArr2[0] + fMin3) - (bVar.a[0] + f3);
                if (f14 < 0.0f) {
                    bVar2.e((-f14) / 2.0f);
                    f7 = f4 - f14;
                } else {
                    f7 = f4;
                }
                rectF2.set(f9, f10, 0.0f, f12);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-fMin2) / 2.0f, f8 / 2.0f, fMin2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(kef.h(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-kef.h(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = bVar.a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(kef.h(bVar.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = bVar.a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(kef.h(bVar.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }
}
