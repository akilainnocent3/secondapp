package defpackage;

import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes8.dex */
public abstract class sby {
    public int a;
    public Canvas b;
    public Camera c;
    public tzw d;

    public final void a(awf... awfVarArr) {
        if (awfVarArr == null) {
            return;
        }
        for (awf awfVar : awfVarArr) {
            if (awfVar != null) {
                if (awfVar instanceof bwf) {
                    Canvas canvas = this.b;
                    Camera camera = this.c;
                    bwf bwfVar = (bwf) awfVar;
                    Paint paint = this.d.a;
                    if (bwfVar.l[bwfVar.n] != null) {
                        float f = bwfVar.g;
                        if (f != 0.0f) {
                            paint.setAlpha((int) (f * 255.0f));
                            Matrix matrix = new Matrix();
                            if (bwfVar.h != 0.0f || bwfVar.i != 0.0f) {
                                camera.save();
                                camera.rotate(bwfVar.h, bwfVar.i, 0.0f);
                                camera.getMatrix(matrix);
                                camera.restore();
                            }
                            matrix.preTranslate((-bwfVar.i()) / 2.0f, (-bwfVar.d()) / 2.0f);
                            matrix.preScale(bwfVar.i() / bwfVar.l[bwfVar.n].getWidth(), bwfVar.d() / bwfVar.l[bwfVar.n].getHeight());
                            matrix.postTranslate((bwfVar.i() / 2.0f) + bwfVar.a, (bwfVar.d() / 2.0f) + bwfVar.b);
                            float f2 = bwfVar.j;
                            if (f2 != 0.0f) {
                                matrix.postRotate(f2, bwfVar.a(), bwfVar.b());
                            }
                            float f3 = bwfVar.e;
                            if (f3 != 1.0f || bwfVar.f != 1.0f) {
                                matrix.postScale(f3, bwfVar.f, bwfVar.a(), bwfVar.b());
                            }
                            canvas.save();
                            camera.applyToCanvas(canvas);
                            canvas.drawBitmap(bwfVar.l[bwfVar.n], matrix, paint);
                            canvas.restore();
                            paint.setAlpha(255);
                        }
                    }
                } else if (awfVar instanceof ewf) {
                    Canvas canvas2 = this.b;
                    Camera camera2 = this.c;
                    ewf ewfVar = (ewf) awfVar;
                    Paint paint2 = this.d.b;
                    float f4 = ewfVar.g;
                    if (f4 != 0.0f) {
                        paint2.setAlpha((int) (f4 * 255.0f));
                        Matrix matrix2 = new Matrix();
                        if (ewfVar.h != 0.0f) {
                            camera2.save();
                            camera2.rotateX(ewfVar.h);
                            camera2.getMatrix(matrix2);
                            camera2.restore();
                        }
                        matrix2.preTranslate(-ewfVar.a(), -ewfVar.b());
                        matrix2.postTranslate(ewfVar.a(), ewfVar.b());
                        canvas2.save();
                        canvas2.setMatrix(matrix2);
                        canvas2.drawOval(new RectF(ewfVar.a, ewfVar.b, ewfVar.c, ewfVar.d), paint2);
                        canvas2.restore();
                        paint2.setAlpha(255);
                    }
                } else if (awfVar instanceof dwf) {
                    Canvas canvas3 = this.b;
                    dwf dwfVar = (dwf) awfVar;
                    Paint paint3 = this.d.c;
                    float f5 = dwfVar.g;
                    if (f5 != 0.0f) {
                        paint3.setAlpha((int) (f5 * 255.0f));
                        canvas3.save();
                        canvas3.drawCircle(dwfVar.a(), dwfVar.b(), dwfVar.i() * 0.5f, paint3);
                        canvas3.restore();
                        paint3.setAlpha(255);
                    }
                }
            }
        }
    }
}
